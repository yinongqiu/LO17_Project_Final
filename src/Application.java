import GenerationSQL.*;
import Library.DictionnaryName;
import Normalisation.Lexique;
import Normalisation.NormalisationHelper;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import Interrogation.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    private static ArrayList<String> log=new ArrayList<>();
    private static String requete="";
    private static ArrayList<Integer> param=new ArrayList<Integer>();
    private static String normalisation(String req,ArrayList<Integer> param){

        NormalisationHelper normHelper = new NormalisationHelper();
        req=req.toLowerCase();
        req=req.trim();
        if (req.charAt(req.length()-1)!='.' && req.charAt(req.length()-1)!='?' ){
            req=req+'.';
        }
        log.add(0," ");
        log.add(0,"Input : "+req);
        req = normHelper.replaceFromDic(req, DictionnaryName.stoplist);
        log.add(0,"After stoplist : "+req);
        req = normHelper.replaceFromDic(req, DictionnaryName.structure);
        req = normHelper.replaceFromDic(req, DictionnaryName.lexique,param);
        if (req==null){
            log.add("En cours de modifier la requête");
        }
        else{
            log.add(0,"After orthographe : "+req);
            req = normHelper.replaceFromDic(req, DictionnaryName.structure);
            log.add(0,"After structure : "+req);
        }

        return req;
    }
    public static void clearLog(){log.clear();}
    public static ArrayList<String> getLog(){
        return log;
    }
    private static String generateSQL(String req){
        try {
            tal_sqlLexer lexer = new tal_sqlLexer(new ANTLRReaderStream(new StringReader(req)));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tal_sqlParser parser = new tal_sqlParser(tokens);
            return parser.listerequetes();
        }
        catch (Exception e) {
            System.out.println(""+e);
            return req;
        }
    }

    public static String run(String s,ArrayList<Integer> param) {
        //String s = "Je veux tous les auteurs ayant écrit des articles sur le nucléaire. ";
        //antlr
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Requete : "+s);
        //String s = scanner.nextLine();
        if (s==null || s.isEmpty()){
            return null;
        }
        s=normalisation(s,param);
        //System.out.println(s);
        if (s!=null){
            s=generateSQL(s);
            log.add(0,"Requête SQL:"+s);
        }
        else{
            log.add(0,"En cours de modifier la requête.");
        }

        //interrogPostgresql.interroger(s);
        //s = scanner.nextLine();
        return s;

    }
    public static ArrayList<Integer> getParam(){
        return param;
    }

    public static void addToParam(int i){
        param.add(i);
    }
    public static void initParam(){
        param.clear();
    }

    public static String getRequete(){
        return requete;
    }

    public static void setRequete(String s){
        requete=s;
    }

}

