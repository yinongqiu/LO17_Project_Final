package Normalisation;

import Library.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class NormalisationHelper {
    private static HashMap<String,String> structureDic=new HashMap<>();
    private static HashMap<String,String> stoplistDic=new HashMap<>();
    private static HashMap<String,String> lexiqueDic=new HashMap<>();
    private static String structurePath="/Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/structure.txt";
    private static String stoplistPath="/Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/stoplist_P16.txt";
    private static String lexiquePath="/Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/filtreCorpus_P16.txt";
    private static Lexique _lexique;

    public NormalisationHelper(){
        addFileToDictionnary(structurePath,structureDic);
        addFileToDictionnary(stoplistPath,stoplistDic);
        addFileToDictionnary(lexiquePath,lexiqueDic);
        _lexique=new Lexique(lexiqueDic);
    }

    public HashMap<String,String> getDictionnary(DictionnaryName dicStr){
        switch (dicStr){
            case stoplist:
                return stoplistDic;
            case structure:
                return structureDic;
            default:
                return lexiqueDic;
        }
    }


    private boolean existInDic(String s,DictionnaryName dicStr){
        HashMap<String,String> dic=new HashMap<>();
        switch (dicStr){
            case stoplist:
                dic=stoplistDic;
                break;
            case structure:
                dic=structureDic;
                break;
            case lexique:
                dic=lexiqueDic;
        }
        return dic.containsKey(s);
    }

    public String getValueOfDic(String s,DictionnaryName dicStr){
        HashMap<String,String> dic;
        switch (dicStr){
            case stoplist:
                dic=stoplistDic;
                break;
            case structure:
                dic=structureDic;
                break;
            default:
                dic=lexiqueDic;
        }
        return dic.get(s);
    }

    public String replaceFromDic(String s,DictionnaryName dicStr){
        String result="";
        ArrayList<String> strList=new ArrayList<>();
        char ponc=s.charAt(s.length()-1);
        try {
            try {
                StringTokenizer tokenizer=new StringTokenizer(s.substring(0,s.length()-1),"\"'’<>«» ");
                if (dicStr.equals(DictionnaryName.lexique)){
                    while (tokenizer.hasMoreTokens()) {
                        strList.add(_lexique.replaceTokenByLemme(tokenizer.nextToken()));
                    }
                }
                else {
                    while (tokenizer.hasMoreTokens()) {
                        String str = tokenizer.nextToken();
                        if (existInDic(str, dicStr)) {
                            String value = getValueOfDic(str, dicStr);
                            if (!value.isEmpty()) {
                                strList.add(value);
                            }
                        } else {
                            strList.add(str);
                        }
                    }

                }
                result=String.join(" ",strList)+ponc;
            }
            catch(Exception e) {
                System.out.println("erreur while replacing"+e);
            }
        }
        catch(Exception e) {
            System.out.println(""+e);
        }
        return result;
    }

    public void addFileToDictionnary(String file, HashMap<String,String> dic){
        BufferedReader br=null;
        String chaine;
        String mot;
        String lemme;
        try {
            try {
                br = new BufferedReader(new FileReader(file));
                while ((chaine=br.readLine())!=null) {
                    String[] split = chaine.split("\\t");
                    mot = split[0].trim();
                    if (split.length==1){
                        dic.put(mot,"");
                    }
                    else{
                        lemme = split[1].trim();
                        dic.put(mot, lemme); //ajouter les mots-lemmes dans la dictionnaire
                    }
                }
            }
            catch(EOFException e) {
                br.close();
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("fichier inconnu : " + file);
        }
        catch(IOException e) {
            System.out.println("IO Exception");
        }
    }
}
