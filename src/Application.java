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
    private static String normalisation(String req){

        NormalisationHelper normHelper = new NormalisationHelper();
        req=req.toLowerCase();
        req=req.trim();
        if (req.charAt(req.length()-1)!='.' && req.charAt(req.length()-1)!='?' ){
            req=req+'.';
        }
        log.add("Input : "+req);
        req = normHelper.replaceFromDic(req, DictionnaryName.stoplist);
        log.add("After stoplist : "+req);
        req = normHelper.replaceFromDic(req, DictionnaryName.structure);
        log.add("After structure : "+req);
        req = normHelper.replaceFromDic(req, DictionnaryName.lexique);
        log.add("After orthographe : "+req);

        return req;
    }

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

    public static String run(String s) {
        //String s = "Je veux tous les auteurs ayant écrit des articles sur le nucléaire. ";
        //antlr
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Requete : "+s);
        //String s = scanner.nextLine();
        if (s==null){
            return null;
        }
        s=normalisation(s);
        //System.out.println(s);
        s=generateSQL(s);
        log.add("Requête SQL:"+s);
        //interrogPostgresql.interroger(s);
        //s = scanner.nextLine();
        return s;

    }
}

