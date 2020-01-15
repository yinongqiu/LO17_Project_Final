package Normalisation;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Math.*;
public class Lexique {
    private static HashMap<String, String> dictionnaire = new HashMap<>();
    private static int seuilMax = 3; // Le nombre minimum de lettres d'un mot
    private static int seuilMin = 4; // La différence de longueur entre deux mots
    private static int seuilLettresCommunes = 4;
    private static int proxMin = 62;
    private static int distanceMax = 2;
    private static ArrayList<String> optionList;
    private static String ambigWord;
    private static ArrayList<String> log=new ArrayList<>();
    public static boolean paramUsed;

    public Lexique(HashMap<String, String> dic) {
        dictionnaire=dic;
    }

    private float calculProx(String m1, String m2) {
        if (m1.length() < seuilMax || m2.length() < seuilMax) {
            return 0;
        } else if (abs(m1.length() - m2.length()) > seuilMin) {
            return 0;
        } else {
            int i = 0;
            while (i < min(m1.length(), m2.length()) && (m1.charAt(i) == m2.charAt(i))) {
                i++;
            }
            if (i < seuilLettresCommunes) {
                return 0;
            } else {
                return (float) i / (max(m1.length(), m2.length())) * 100;
            }
        }
    }

    private int levenshtein(String m1, String m2) {
        int[][] dis = new int[m1.length() + 1][m2.length() + 1];

        for (int i = 1; i <= m1.length(); i++) {
            dis[i][0] = i;
        }
        for (int j = 1; j <= m2.length(); j++) {
            dis[0][j] = j;
        }
        int cost;
        for (int j = 1; j <= m2.length(); j++) {
            for (int i = 1; i <= m1.length(); i++) {
                if (m1.charAt(i - 1) == m2.charAt(j - 1)) {
                    cost = 0;
                } else {
                    cost = 1;
                }
                dis[i][j] = min(min(dis[i - 1][j] + 1, dis[i][j - 1] + 1), dis[i - 1][j - 1] + cost);
            }
        }
        return dis[m1.length()][m2.length()];
    }

    private ArrayList<String> searchPrefixe(String mot) {
        ArrayList<String> listLemme = new ArrayList<>();
        if (dictionnaire.containsKey(mot)) {
            listLemme.add(dictionnaire.get(mot));
            return listLemme;
        } else {
            float proxMax = 0;
            for (String motLex : dictionnaire.keySet()) {
                float prox = calculProx(motLex, mot);
                if (prox > proxMin) { //min proximité prise en compte (à partir de 70 par exemple)
                    if (prox > proxMax) { //rechercher la maximum de proximité
                        proxMax = prox;
                        listLemme.clear();
                        listLemme.add(dictionnaire.get(motLex));
                    } else if (prox == proxMax) {
                        listLemme.add(dictionnaire.get(motLex));
                    }
                }
            }
            if (listLemme.size()>1){
                log.add(0,"Méthode préfixe: Liste de lemmes candidats de mot "+mot+" générée");
            }
            if (listLemme.size()==1){
                log.add(0,"Méthode préfixe: Mot "+mot+" est remplacé par mot "+listLemme.get(0)+".");
            }
            return listLemme;
        }
    }

    private ArrayList<String> searchLemmeLeven(String mot) {
        ArrayList<String> listLemme = new ArrayList<>();
        if (mot.length()<=seuilMax){
            listLemme.add(mot);
            return listLemme;
        }
        if (mot.length()==seuilMax+1){
            for (String motLex : dictionnaire.keySet()) {
                if (motLex.charAt(0)==mot.charAt(0)){
                    int distance = levenshtein(motLex, mot);
                    if (distance <= distanceMax) {
                            listLemme.add(dictionnaire.get(motLex));
                    }
                }
            }
        }
        else{
            int minDistance=99;
            for (String motLex : dictionnaire.keySet()) {
                int distance = levenshtein(motLex, mot);
                if (distance <= distanceMax) {
                    if (distance<minDistance){
                        minDistance=distance;
                        listLemme.clear();
                    }
                    if (distance==minDistance) {
                        listLemme.add(dictionnaire.get(motLex));
                    }
                }
            }
        }
        if (listLemme.size()>1){
            log.add(0,"Méthode Levenshtein: Liste de lemmes candidats de mot "+mot+" générée");
        }
        if (listLemme.size()==1){
            log.add(0,"Méthode Levenshtein: Mot "+mot+" est remplacé par mot "+listLemme.get(0)+".");
        }
        /*for (String motLex : dictionnaire.keySet()) {
            if (motLex.charAt(0)==mot.charAt(0)){
                int distance = levenshtein(motLex, mot);
                if (distance <= distanceMax ) {
                    listLemme.add(dictionnaire.get(motLex));
                }
            }
        }*/
        return removeDuplicate(listLemme);
    }

    private ArrayList<String> removeDuplicate(ArrayList<String> list) {
        //Constructing LinkedHashSet using list
        LinkedHashSet<String> set = new LinkedHashSet<>(list);
        //Constructing list without duplicate using set
        return new ArrayList<>(set);
    }

    private ArrayList<String> searchLemme(String mot) {
        ArrayList<String> listLemme = searchPrefixe(mot);
        if (listLemme.isEmpty()) {
            listLemme = searchLemmeLeven(mot);
            if (listLemme.isEmpty()) {
                log.add("Aucun lemme trouvé pour le mot \""+mot+"\"");
                return listLemme;
            }
        }
        return listLemme;
    }

    public static ArrayList getOptionList(){
        return optionList;
        /*int ind=1;
        System.out.print("liste de lemmes candidats de \"" + mot + "\" : [");
        for (String s:
                lemmeList) {
            System.out.print(ind+": "+s+"; ");
            ind++;
        }
        System.out.println("]");
        System.out.println("Veuillez choisir un lemme souhaité, tapez 0 pour choisir le mot original");*/
    }

    public static void initOptionList(){
        optionList=null;
    }

    public static String getAmbigWord(){
        return ambigWord;
    }

    public static void initAmbigWord(){
        ambigWord=null;
    }

    private boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        return isNum.matches();
    }

    public String replaceTokenByLemme(String str,int option){
        try{
            paramUsed=false;
            if (isNumeric(str)) {
                return str;
            }
            ArrayList<String> lemmeList = searchLemme(str);
            if (lemmeList.size() == 0) {
                return str;
            } else if (lemmeList.size() == 1) {
                return lemmeList.get(0);
            } else {
                if (option==-1){
                    optionList=lemmeList;
                    ambigWord=str;
                    return null;
                }
                else{
                    paramUsed=true;
                    if (option==0){
                        return str;
                    }
                    else{
                        return lemmeList.get(option-1);
                    }
                }
            }
        }
        catch (Exception e){
            System.out.println("Erreur lors de remplacement de token"+e);
            return str;
        }

    }

    public static void initLog(){
        log.clear();
    }

    public static ArrayList<String> getLog(){
        return log;
    }

}
