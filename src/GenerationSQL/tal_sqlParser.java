// $ANTLR 3.5.1 /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g 2020-01-08 12:46:13
package GenerationSQL;
import org.antlr.runtime.*;

import java.util.Arrays;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "APRES", "ARTICLE", "AUTEUR", 
		"AVANT", "BULLETIN", "CONJ", "DANS", "DATE", "DIGIT", "DIGIT2", "DIGIT4", 
		"EN", "ENTRE", "INT", "MONTH", "MOT", "NOMBRE", "NUMERO", "PONC", "RUBRIQUE", 
		"SELECT", "STR_MOIS", "TITRE", "VAR", "VAR_DATE", "WS"
	};
	public static final int EOF=-1;
	public static final int APRES=4;
	public static final int ARTICLE=5;
	public static final int AUTEUR=6;
	public static final int AVANT=7;
	public static final int BULLETIN=8;
	public static final int CONJ=9;
	public static final int DANS=10;
	public static final int DATE=11;
	public static final int DIGIT=12;
	public static final int DIGIT2=13;
	public static final int DIGIT4=14;
	public static final int EN=15;
	public static final int ENTRE=16;
	public static final int INT=17;
	public static final int MONTH=18;
	public static final int MOT=19;
	public static final int NOMBRE=20;
	public static final int NUMERO=21;
	public static final int PONC=22;
	public static final int RUBRIQUE=23;
	public static final int SELECT=24;
	public static final int STR_MOIS=25;
	public static final int TITRE=26;
	public static final int VAR=27;
	public static final int VAR_DATE=28;
	public static final int WS=29;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public tal_sqlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return tal_sqlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g"; }



	// $ANTLR start "listerequetes"
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:90:1: listerequetes returns [String sql = \"\"] : r= requete PONC ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:91:25: (r= requete PONC )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:92:3: r= requete PONC
			{
			pushFollow(FOLLOW_requete_in_listerequetes434);
			r=requete();
			state._fsp--;

			match(input,PONC,FOLLOW_PONC_in_listerequetes436); 

							lr_arbre = r;
							sql = lr_arbre.sortArbre();
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return sql;
	}
	// $ANTLR end "listerequetes"


	protected static class requete_scope {
		String tableNames;
	}
	protected Stack<requete_scope> requete_stack = new Stack<requete_scope>();


	// $ANTLR start "requete"
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:102:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( SELECT )* ( ( ARTICLE ) | ( RUBRIQUE ( ARTICLE )? ) | ( AUTEUR ( ARTICLE )? ) | ( NOMBRE ARTICLE ) ) ( CONJ ( ( ARTICLE | BULLETIN ) ) | ( RUBRIQUE ( ARTICLE )? ) | ( AUTEUR ( ARTICLE )? ) | ( NOMBRE ARTICLE ) )* ps= params ;
	public final Arbre requete() throws RecognitionException {
		requete_stack.push(new requete_scope());
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;

		Arbre ps_arbre;Arbre tableArbre=new Arbre("");
		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:104:57: ( ( SELECT )* ( ( ARTICLE ) | ( RUBRIQUE ( ARTICLE )? ) | ( AUTEUR ( ARTICLE )? ) | ( NOMBRE ARTICLE ) ) ( CONJ ( ( ARTICLE | BULLETIN ) ) | ( RUBRIQUE ( ARTICLE )? ) | ( AUTEUR ( ARTICLE )? ) | ( NOMBRE ARTICLE ) )* ps= params )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:105:3: ( SELECT )* ( ( ARTICLE ) | ( RUBRIQUE ( ARTICLE )? ) | ( AUTEUR ( ARTICLE )? ) | ( NOMBRE ARTICLE ) ) ( CONJ ( ( ARTICLE | BULLETIN ) ) | ( RUBRIQUE ( ARTICLE )? ) | ( AUTEUR ( ARTICLE )? ) | ( NOMBRE ARTICLE ) )* ps= params
			{
			requete_stack.peek().tableNames ="";
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:106:3: ( SELECT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==SELECT) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:106:3: SELECT
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete475); 
					}
					break;

				default :
					break loop1;
				}
			}


							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
						
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:110:3: ( ( ARTICLE ) | ( RUBRIQUE ( ARTICLE )? ) | ( AUTEUR ( ARTICLE )? ) | ( NOMBRE ARTICLE ) )
			int alt4=4;
			switch ( input.LA(1) ) {
			case ARTICLE:
				{
				alt4=1;
				}
				break;
			case RUBRIQUE:
				{
				alt4=2;
				}
				break;
			case AUTEUR:
				{
				alt4=3;
				}
				break;
			case NOMBRE:
				{
				alt4=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:110:4: ( ARTICLE )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:110:4: ( ARTICLE )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:110:5: ARTICLE
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete488); 

									
									req_arbre.ajouteFils(new Arbre("","tt.fichier"));
									
								
					}

					}
					break;
				case 2 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:116:4: ( RUBRIQUE ( ARTICLE )? )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:116:4: ( RUBRIQUE ( ARTICLE )? )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:116:5: RUBRIQUE ( ARTICLE )?
					{
					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete500); 
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:117:3: ( ARTICLE )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==ARTICLE) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:117:3: ARTICLE
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete504); 
							}
							break;

					}


									req_arbre.ajouteFils(new Arbre("","tt.rubrique"));
								
					}

					}
					break;
				case 3 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:121:4: ( AUTEUR ( ARTICLE )? )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:121:4: ( AUTEUR ( ARTICLE )? )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:121:5: AUTEUR ( ARTICLE )?
					{
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete517); 
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:122:3: ( ARTICLE )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==ARTICLE) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:122:3: ARTICLE
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete521); 
							}
							break;

					}


									req_arbre.ajouteFils(new Arbre("","email"));
									if (!requete_stack.peek().tableNames.contains("email")){
										requete_stack.peek().tableNames+= " email";
									}	
								
					}

					}
					break;
				case 4 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:129:4: ( NOMBRE ARTICLE )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:129:4: ( NOMBRE ARTICLE )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:129:5: NOMBRE ARTICLE
					{
					match(input,NOMBRE,FOLLOW_NOMBRE_in_requete534); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete538); 

									req_arbre.ajouteFils(new Arbre("","COUNT(*)"));
								
					}

					}
					break;

			}

			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:136:3: ( CONJ ( ( ARTICLE | BULLETIN ) ) | ( RUBRIQUE ( ARTICLE )? ) | ( AUTEUR ( ARTICLE )? ) | ( NOMBRE ARTICLE ) )*
			loop7:
			while (true) {
				int alt7=5;
				switch ( input.LA(1) ) {
				case CONJ:
					{
					int LA7_1 = input.LA(2);
					if ( (LA7_1==ARTICLE||LA7_1==BULLETIN) ) {
						alt7=1;
					}

					}
					break;
				case RUBRIQUE:
					{
					int LA7_3 = input.LA(2);
					if ( ((LA7_3 >= APRES && LA7_3 <= AVANT)||(LA7_3 >= CONJ && LA7_3 <= DATE)||(LA7_3 >= DIGIT4 && LA7_3 <= ENTRE)||(LA7_3 >= MONTH && LA7_3 <= NUMERO)||LA7_3==RUBRIQUE||(LA7_3 >= STR_MOIS && LA7_3 <= TITRE)||LA7_3==VAR_DATE) ) {
						alt7=2;
					}

					}
					break;
				case AUTEUR:
					{
					alt7=3;
					}
					break;
				case NOMBRE:
					{
					alt7=4;
					}
					break;
				}
				switch (alt7) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:136:4: CONJ ( ( ARTICLE | BULLETIN ) )
					{
					match(input,CONJ,FOLLOW_CONJ_in_requete557); 
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:137:3: ( ( ARTICLE | BULLETIN ) )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:137:4: ( ARTICLE | BULLETIN )
					{
					if ( input.LA(1)==ARTICLE||input.LA(1)==BULLETIN ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

									req_arbre.ajouteFils(new Arbre("",","));
									req_arbre.ajouteFils(new Arbre("","tt.fichier"));
									
								
					}

					}
					break;
				case 2 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:144:4: ( RUBRIQUE ( ARTICLE )? )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:144:4: ( RUBRIQUE ( ARTICLE )? )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:144:5: RUBRIQUE ( ARTICLE )?
					{
					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete583); 
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:145:3: ( ARTICLE )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==ARTICLE) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:145:3: ARTICLE
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete587); 
							}
							break;

					}


									req_arbre.ajouteFils(new Arbre("",","));
									req_arbre.ajouteFils(new Arbre("","tt.rubrique"));
								
					}

					}
					break;
				case 3 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:150:4: ( AUTEUR ( ARTICLE )? )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:150:4: ( AUTEUR ( ARTICLE )? )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:150:5: AUTEUR ( ARTICLE )?
					{
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete600); 
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:151:3: ( ARTICLE )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==ARTICLE) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:151:3: ARTICLE
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete604); 
							}
							break;

					}


									req_arbre.ajouteFils(new Arbre("",","));
									req_arbre.ajouteFils(new Arbre("","email"));
									if (!requete_stack.peek().tableNames.contains("email")){
										requete_stack.peek().tableNames+= " email";
									}	
								
					}

					}
					break;
				case 4 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:159:4: ( NOMBRE ARTICLE )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:159:4: ( NOMBRE ARTICLE )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:159:5: NOMBRE ARTICLE
					{
					match(input,NOMBRE,FOLLOW_NOMBRE_in_requete617); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete621); 

									req_arbre.ajouteFils(new Arbre("",","));
									req_arbre.ajouteFils(new Arbre("","COUNT(*)"));
								
					}

					}
					break;

				default :
					break loop7;
				}
			}


							req_arbre.ajouteFils(new Arbre("","FROM"));
							req_arbre.ajouteFils(tableArbre);
							req_arbre.ajouteFils(new Arbre("","WHERE"));
						
			pushFollow(FOLLOW_params_in_requete645);
			ps=params();
			state._fsp--;


							String result="titretexte tt";
							if (!requete_stack.peek().tableNames.isEmpty()){
								ArrayList<String> tab=new ArrayList(Arrays.asList(requete_stack.peek().tableNames.trim().split(" ")));
								if (tab.size()>0){
									if (tab.contains("titre")){
										result="titre tt";
										tab.remove("titre");
									}
									for (String s: tab){
										result+=" INNER JOIN "+s+" ON "+"tt.numero = "+s+".numero";
									}
								}				
								
							}	
							tableArbre.mot=result;
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);		
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			requete_stack.pop();
		}
		return req_arbre;
	}
	// $ANTLR end "requete"



	// $ANTLR start "params"
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:193:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : ( (c= CONJ )? (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam |par= numeroParam |par= avantDateParam |par= apresDateParam |par= entreDateParam ) )+ ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Token c=null;
		Arbre par =null;

		Arbre par_arbre;int flag=0;String conj="";
		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:194:53: ( ( (c= CONJ )? (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam |par= numeroParam |par= avantDateParam |par= apresDateParam |par= entreDateParam ) )+ )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:195:3: ( (c= CONJ )? (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam |par= numeroParam |par= avantDateParam |par= apresDateParam |par= entreDateParam ) )+
			{
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:195:3: ( (c= CONJ )? (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam |par= numeroParam |par= avantDateParam |par= apresDateParam |par= entreDateParam ) )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==APRES||LA10_0==AVANT||(LA10_0 >= CONJ && LA10_0 <= DATE)||(LA10_0 >= DIGIT4 && LA10_0 <= ENTRE)||(LA10_0 >= MONTH && LA10_0 <= MOT)||LA10_0==NUMERO||LA10_0==RUBRIQUE||(LA10_0 >= STR_MOIS && LA10_0 <= TITRE)||LA10_0==VAR_DATE) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:195:4: (c= CONJ )? (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam |par= numeroParam |par= avantDateParam |par= apresDateParam |par= entreDateParam )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:195:4: (c= CONJ )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==CONJ) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:195:5: c= CONJ
							{
							c=(Token)match(input,CONJ,FOLLOW_CONJ_in_params677); 

												conj=c.getText().toUpperCase().equals("ET")?"AND":"OR";
											
							}
							break;

					}

					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:199:3: (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam |par= numeroParam |par= avantDateParam |par= apresDateParam |par= entreDateParam )
					int alt9=8;
					alt9 = dfa9.predict(input);
					switch (alt9) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:199:4: par= motEnTitreParam
							{
							pushFollow(FOLLOW_motEnTitreParam_in_params693);
							par=motEnTitreParam();
							state._fsp--;

							}
							break;
						case 2 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:200:4: par= dateParam
							{
							pushFollow(FOLLOW_dateParam_in_params702);
							par=dateParam();
							state._fsp--;

							}
							break;
						case 3 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:201:4: par= motParam
							{
							pushFollow(FOLLOW_motParam_in_params711);
							par=motParam();
							state._fsp--;

							}
							break;
						case 4 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:202:4: par= rubriqueParam
							{
							pushFollow(FOLLOW_rubriqueParam_in_params718);
							par=rubriqueParam();
							state._fsp--;

							}
							break;
						case 5 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:203:4: par= numeroParam
							{
							pushFollow(FOLLOW_numeroParam_in_params725);
							par=numeroParam();
							state._fsp--;

							}
							break;
						case 6 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:204:4: par= avantDateParam
							{
							pushFollow(FOLLOW_avantDateParam_in_params732);
							par=avantDateParam();
							state._fsp--;

							}
							break;
						case 7 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:205:4: par= apresDateParam
							{
							pushFollow(FOLLOW_apresDateParam_in_params739);
							par=apresDateParam();
							state._fsp--;

							}
							break;
						case 8 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:206:4: par= entreDateParam
							{
							pushFollow(FOLLOW_entreDateParam_in_params746);
							par=entreDateParam();
							state._fsp--;

							}
							break;

					}


									par_arbre = par;
									if(flag==1){
										les_pars_arbre.ajouteFils(new Arbre("", conj.isEmpty()?"AND":conj));
									}
									flag=1;
									les_pars_arbre.ajouteFils(par_arbre);
									conj="";
									
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params"



	// $ANTLR start "entreDateParam"
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:220:1: entreDateParam returns [Arbre lepar_arbre = new Arbre(\"\")] : ( DATE )? ENTRE ( STR_MOIS )? value= ( VAR_DATE | DIGIT4 | MONTH ) CONJ value= ( VAR_DATE | DIGIT4 | MONTH ) ;
	public final Arbre entreDateParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;

		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:220:59: ( ( DATE )? ENTRE ( STR_MOIS )? value= ( VAR_DATE | DIGIT4 | MONTH ) CONJ value= ( VAR_DATE | DIGIT4 | MONTH ) )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:221:2: ( DATE )? ENTRE ( STR_MOIS )? value= ( VAR_DATE | DIGIT4 | MONTH ) CONJ value= ( VAR_DATE | DIGIT4 | MONTH )
			{
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:221:2: ( DATE )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==DATE) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:221:2: DATE
					{
					match(input,DATE,FOLLOW_DATE_in_entreDateParam774); 
					}
					break;

			}

			match(input,ENTRE,FOLLOW_ENTRE_in_entreDateParam778); 
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:223:2: ( STR_MOIS )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==STR_MOIS) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:223:2: STR_MOIS
					{
					match(input,STR_MOIS,FOLLOW_STR_MOIS_in_entreDateParam781); 
					}
					break;

			}

			value=input.LT(1);
			if ( input.LA(1)==DIGIT4||input.LA(1)==MONTH||input.LA(1)==VAR_DATE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

						String[] dateStr=value.getText().trim().replace(" ","/")
							.replace("janvier","01")
							.replace("février","02")
							.replace("mars","03")
							.replace("avril","04")
							.replace("mai","05")
							.replace("juin","06")
							.replace("juillet","07")
							.replace("août","08")
							.replace("septembre","09")
							.replace("octobre","10")
							.replace("novembre","11")
							.replace("décembre","12")
							.split("/");
						int n=dateStr.length;
						String annee;
						String jour;
						String mois;
						switch(n){
							case 1:
								if (dateStr[0].length()==4){
									annee=dateStr[0];
									lepar_arbre.ajouteFils(new Arbre("", "annee > '"+annee+"'"));
								}
								else{
									mois=dateStr[0];
									lepar_arbre.ajouteFils(new Arbre("", "mois > '"+mois+"'"));
								}
								break;
							case 2:
								if (dateStr[1].length()==4){
									annee=dateStr[1];
									mois=dateStr[0];
									lepar_arbre.ajouteFils(new Arbre("","("));
									lepar_arbre.ajouteFils(new Arbre("", "annee > '"+annee+"'"));
									lepar_arbre.ajouteFils(new Arbre("","OR"));
									lepar_arbre.ajouteFils(new Arbre("","("));
									lepar_arbre.ajouteFils(new Arbre("", "annee = '"+annee+"'"));
									lepar_arbre.ajouteFils(new Arbre("","AND"));
									lepar_arbre.ajouteFils(new Arbre("", "mois > '"+mois+"'"));
									lepar_arbre.ajouteFils(new Arbre("",")"));
									lepar_arbre.ajouteFils(new Arbre("",")"));
								}
								else{
									mois=dateStr[1];
									jour=dateStr[0];
									lepar_arbre.ajouteFils(new Arbre("","("));
									lepar_arbre.ajouteFils(new Arbre("", "mois > '"+mois+"'"));
									lepar_arbre.ajouteFils(new Arbre("","OR"));
									lepar_arbre.ajouteFils(new Arbre("","("));
									lepar_arbre.ajouteFils(new Arbre("", "mois = '"+mois+"'"));
									lepar_arbre.ajouteFils(new Arbre("","AND"));
									lepar_arbre.ajouteFils(new Arbre("", "jour > '"+jour+"'"));
									lepar_arbre.ajouteFils(new Arbre("",")"));
									lepar_arbre.ajouteFils(new Arbre("",")"));
								}
								break;
							default:
								annee=dateStr[2];
								mois=dateStr[1];
								jour=dateStr[0];
								lepar_arbre.ajouteFils(new Arbre("","("));
								lepar_arbre.ajouteFils(new Arbre("", "annee > '"+annee+"'"));
								lepar_arbre.ajouteFils(new Arbre("","OR"));
								lepar_arbre.ajouteFils(new Arbre("","("));
								lepar_arbre.ajouteFils(new Arbre("", "annee = '"+annee+"'"));
								lepar_arbre.ajouteFils(new Arbre("","AND"));
								lepar_arbre.ajouteFils(new Arbre("", "mois > '"+mois+"'"));
								lepar_arbre.ajouteFils(new Arbre("",")"));
								lepar_arbre.ajouteFils(new Arbre("","OR"));
								lepar_arbre.ajouteFils(new Arbre("","("));
								lepar_arbre.ajouteFils(new Arbre("", "annee = '"+annee+"'"));
								lepar_arbre.ajouteFils(new Arbre("","AND"));
								lepar_arbre.ajouteFils(new Arbre("", "mois = '"+mois+"'"));
								lepar_arbre.ajouteFils(new Arbre("","AND"));
								lepar_arbre.ajouteFils(new Arbre("", "jour > '"+jour+"'"));
								lepar_arbre.ajouteFils(new Arbre("",")"));
								lepar_arbre.ajouteFils(new Arbre("",")"));
								break;
						}
						if (!requete_stack.peek().tableNames.contains("date")){
							requete_stack.peek().tableNames+= " date";
						}		
							
			match(input,CONJ,FOLLOW_CONJ_in_entreDateParam802); 
			value=input.LT(1);
			if ( input.LA(1)==DIGIT4||input.LA(1)==MONTH||input.LA(1)==VAR_DATE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

							lepar_arbre.ajouteFils(new Arbre("","AND"));
							dateStr=value.getText().trim().replace(" ","/")
								.replace("janvier","01")
								.replace("février","02")
								.replace("mars","03")
								.replace("avril","04")
								.replace("mai","05")
								.replace("juin","06")
								.replace("juillet","07")
								.replace("août","08")
								.replace("septembre","09")
								.replace("octobre","10")
								.replace("novembre","11")
								.replace("décembre","12")
								.split("/");
							n=dateStr.length;
							switch(n){
								case 1:
									if (dateStr[0].length()==4){
										annee=dateStr[0];
										lepar_arbre.ajouteFils(new Arbre("", "annee < '"+annee+"'"));
									}
									else{
										mois=dateStr[0];
										lepar_arbre.ajouteFils(new Arbre("", "mois < '"+mois+"'"));
									}
									break;
								case 2:
									if (dateStr[1].length()==4){
										annee=dateStr[1];
										mois=dateStr[0];
										lepar_arbre.ajouteFils(new Arbre("","("));
										lepar_arbre.ajouteFils(new Arbre("", "annee < '"+annee+"'"));
										lepar_arbre.ajouteFils(new Arbre("","OR"));
										lepar_arbre.ajouteFils(new Arbre("","("));
										lepar_arbre.ajouteFils(new Arbre("", "annee = '"+annee+"'"));
										lepar_arbre.ajouteFils(new Arbre("","AND"));
										lepar_arbre.ajouteFils(new Arbre("", "mois < '"+mois+"'"));
										lepar_arbre.ajouteFils(new Arbre("",")"));
										lepar_arbre.ajouteFils(new Arbre("",")"));
									}
									else{
										mois=dateStr[1];
										jour=dateStr[0];
										lepar_arbre.ajouteFils(new Arbre("","("));
										lepar_arbre.ajouteFils(new Arbre("", "mois < '"+mois+"'"));
										lepar_arbre.ajouteFils(new Arbre("","OR"));
										lepar_arbre.ajouteFils(new Arbre("","("));
										lepar_arbre.ajouteFils(new Arbre("", "mois = '"+mois+"'"));
										lepar_arbre.ajouteFils(new Arbre("","AND"));
										lepar_arbre.ajouteFils(new Arbre("", "jour < '"+jour+"'"));
										lepar_arbre.ajouteFils(new Arbre("",")"));
										lepar_arbre.ajouteFils(new Arbre("",")"));
									}
									break;
								default:
									annee=dateStr[2];
									mois=dateStr[1];
									jour=dateStr[0];
									lepar_arbre.ajouteFils(new Arbre("","("));
									lepar_arbre.ajouteFils(new Arbre("", "annee < '"+annee+"'"));
									lepar_arbre.ajouteFils(new Arbre("","OR"));
									lepar_arbre.ajouteFils(new Arbre("","("));
									lepar_arbre.ajouteFils(new Arbre("", "annee = '"+annee+"'"));
									lepar_arbre.ajouteFils(new Arbre("","AND"));
									lepar_arbre.ajouteFils(new Arbre("", "mois < '"+mois+"'"));
									lepar_arbre.ajouteFils(new Arbre("",")"));
									lepar_arbre.ajouteFils(new Arbre("","OR"));
									lepar_arbre.ajouteFils(new Arbre("","("));
									lepar_arbre.ajouteFils(new Arbre("", "annee = '"+annee+"'"));
									lepar_arbre.ajouteFils(new Arbre("","AND"));
									lepar_arbre.ajouteFils(new Arbre("", "mois = '"+mois+"'"));
									lepar_arbre.ajouteFils(new Arbre("","AND"));
									lepar_arbre.ajouteFils(new Arbre("", "jour < '"+jour+"'"));
									lepar_arbre.ajouteFils(new Arbre("",")"));
									lepar_arbre.ajouteFils(new Arbre("",")"));
									break;
							}
							if (!requete_stack.peek().tableNames.contains("date")){
								requete_stack.peek().tableNames+= " date";
							}		
								
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "entreDateParam"



	// $ANTLR start "apresDateParam"
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:397:1: apresDateParam returns [Arbre lepar_arbre = new Arbre(\"\")] : APRES ( DATE )? ( STR_MOIS )? value= ( VAR_DATE | DIGIT4 | MONTH ) ;
	public final Arbre apresDateParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;

		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:397:59: ( APRES ( DATE )? ( STR_MOIS )? value= ( VAR_DATE | DIGIT4 | MONTH ) )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:398:3: APRES ( DATE )? ( STR_MOIS )? value= ( VAR_DATE | DIGIT4 | MONTH )
			{
			match(input,APRES,FOLLOW_APRES_in_apresDateParam836); 
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:399:3: ( DATE )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==DATE) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:399:3: DATE
					{
					match(input,DATE,FOLLOW_DATE_in_apresDateParam840); 
					}
					break;

			}

			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:400:3: ( STR_MOIS )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==STR_MOIS) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:400:3: STR_MOIS
					{
					match(input,STR_MOIS,FOLLOW_STR_MOIS_in_apresDateParam845); 
					}
					break;

			}

			value=input.LT(1);
			if ( input.LA(1)==DIGIT4||input.LA(1)==MONTH||input.LA(1)==VAR_DATE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

							String[] dateStr=value.getText().trim().replace(" ","/")
								.replace("janvier","01")
								.replace("février","02")
								.replace("mars","03")
								.replace("avril","04")
								.replace("mai","05")
								.replace("juin","06")
								.replace("juillet","07")
								.replace("août","08")
								.replace("septembre","09")
								.replace("octobre","10")
								.replace("novembre","11")
								.replace("décembre","12")
								.split("/");
							int n=dateStr.length;
							String annee;
							String jour;
							String mois;
							switch(n){
								case 1:
									if (dateStr[0].length()==4){
										annee=dateStr[0];
										lepar_arbre.ajouteFils(new Arbre("", "annee > '"+annee+"'"));
									}
									else{
										mois=dateStr[0];
										lepar_arbre.ajouteFils(new Arbre("", "mois > '"+mois+"'"));
									}
									break;
								case 2:
									if (dateStr[1].length()==4){
										annee=dateStr[1];
										mois=dateStr[0];
										lepar_arbre.ajouteFils(new Arbre("","("));
										lepar_arbre.ajouteFils(new Arbre("", "annee > '"+annee+"'"));
										lepar_arbre.ajouteFils(new Arbre("","OR"));
										lepar_arbre.ajouteFils(new Arbre("","("));
										lepar_arbre.ajouteFils(new Arbre("", "annee = '"+annee+"'"));
										lepar_arbre.ajouteFils(new Arbre("","AND"));
										lepar_arbre.ajouteFils(new Arbre("", "mois > '"+mois+"'"));
										lepar_arbre.ajouteFils(new Arbre("",")"));
										lepar_arbre.ajouteFils(new Arbre("",")"));
									}
									else{
										mois=dateStr[1];
										jour=dateStr[0];
										lepar_arbre.ajouteFils(new Arbre("","("));
										lepar_arbre.ajouteFils(new Arbre("", "mois > '"+mois+"'"));
										lepar_arbre.ajouteFils(new Arbre("","OR"));
										lepar_arbre.ajouteFils(new Arbre("","("));
										lepar_arbre.ajouteFils(new Arbre("", "mois = '"+mois+"'"));
										lepar_arbre.ajouteFils(new Arbre("","AND"));
										lepar_arbre.ajouteFils(new Arbre("", "jour > '"+jour+"'"));
										lepar_arbre.ajouteFils(new Arbre("",")"));
										lepar_arbre.ajouteFils(new Arbre("",")"));
									}
									break;
								default:
									annee=dateStr[2];
									mois=dateStr[1];
									jour=dateStr[0];
									lepar_arbre.ajouteFils(new Arbre("","("));
									lepar_arbre.ajouteFils(new Arbre("", "annee > '"+annee+"'"));
									lepar_arbre.ajouteFils(new Arbre("","OR"));
									lepar_arbre.ajouteFils(new Arbre("","("));
									lepar_arbre.ajouteFils(new Arbre("", "annee = '"+annee+"'"));
									lepar_arbre.ajouteFils(new Arbre("","AND"));
									lepar_arbre.ajouteFils(new Arbre("", "mois > '"+mois+"'"));
									lepar_arbre.ajouteFils(new Arbre("",")"));
									lepar_arbre.ajouteFils(new Arbre("","OR"));
									lepar_arbre.ajouteFils(new Arbre("","("));
									lepar_arbre.ajouteFils(new Arbre("", "annee = '"+annee+"'"));
									lepar_arbre.ajouteFils(new Arbre("","AND"));
									lepar_arbre.ajouteFils(new Arbre("", "mois = '"+mois+"'"));
									lepar_arbre.ajouteFils(new Arbre("","AND"));
									lepar_arbre.ajouteFils(new Arbre("", "jour > '"+jour+"'"));
									lepar_arbre.ajouteFils(new Arbre("",")"));
									lepar_arbre.ajouteFils(new Arbre("",")"));
									break;
							}
							if (!requete_stack.peek().tableNames.contains("date")){
								requete_stack.peek().tableNames+= " date";
							}		
								
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "apresDateParam"



	// $ANTLR start "dateParam"
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:489:1: dateParam returns [Arbre lepar_arbre = new Arbre(\"\")] : ( DATE )? ( EN )? ( STR_MOIS )? value= ( VAR_DATE | DIGIT4 | MONTH ) ;
	public final Arbre dateParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;

		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:489:54: ( ( DATE )? ( EN )? ( STR_MOIS )? value= ( VAR_DATE | DIGIT4 | MONTH ) )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:490:2: ( DATE )? ( EN )? ( STR_MOIS )? value= ( VAR_DATE | DIGIT4 | MONTH )
			{
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:490:2: ( DATE )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==DATE) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:490:2: DATE
					{
					match(input,DATE,FOLLOW_DATE_in_dateParam880); 
					}
					break;

			}

			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:491:2: ( EN )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==EN) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:491:2: EN
					{
					match(input,EN,FOLLOW_EN_in_dateParam884); 
					}
					break;

			}

			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:492:2: ( STR_MOIS )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==STR_MOIS) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:492:2: STR_MOIS
					{
					match(input,STR_MOIS,FOLLOW_STR_MOIS_in_dateParam888); 
					}
					break;

			}

			value=input.LT(1);
			if ( input.LA(1)==DIGIT4||input.LA(1)==MONTH||input.LA(1)==VAR_DATE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

					String[] dateStr=value.getText().trim().replace(" ","/")
						.replace("janvier","01")
						.replace("février","02")
						.replace("mars","03")
						.replace("avril","04")
						.replace("mai","05")
						.replace("juin","06")
						.replace("juillet","07")
						.replace("août","08")
						.replace("septembre","09")
						.replace("octobre","10")
						.replace("novembre","11")
						.replace("décembre","12")
						.split("/");
					int n=dateStr.length;
					String annee;
					String jour;
					String mois;
					switch(n){
						case 1:
							if (dateStr[0].length()==4){
								annee=dateStr[0];
								lepar_arbre.ajouteFils(new Arbre("", "annee = '"+annee+"'"));
							}
							else{
								mois=dateStr[0];
								lepar_arbre.ajouteFils(new Arbre("", "mois = '"+mois+"'"));
							}
							break;
						case 2:
							if (dateStr[1].length()==4){
								annee=dateStr[1];
								mois=dateStr[0];
								lepar_arbre.ajouteFils(new Arbre("", "annee = '"+annee+"'"));
								lepar_arbre.ajouteFils(new Arbre("","AND"));
								lepar_arbre.ajouteFils(new Arbre("", "mois = '"+mois+"'"));
							}
							else{
								mois=dateStr[1];
								jour=dateStr[0];
								lepar_arbre.ajouteFils(new Arbre("", "mois = '"+mois+"'"));
								lepar_arbre.ajouteFils(new Arbre("","AND"));
								lepar_arbre.ajouteFils(new Arbre("", "jour = '"+jour+"'"));
							}
							break;
						default:
							annee=dateStr[2];
							mois=dateStr[1];
							jour=dateStr[0];
							lepar_arbre.ajouteFils(new Arbre("", "annee = '"+annee+"'"));
							lepar_arbre.ajouteFils(new Arbre("","AND"));
							lepar_arbre.ajouteFils(new Arbre("", "mois = '"+mois+"'"));
							lepar_arbre.ajouteFils(new Arbre("","AND"));
							lepar_arbre.ajouteFils(new Arbre("", "jour = '"+jour+"'"));
							break;
					}
					if (!requete_stack.peek().tableNames.contains("date")){
						requete_stack.peek().tableNames+= " date";
					}	
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "dateParam"



	// $ANTLR start "avantDateParam"
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:556:1: avantDateParam returns [Arbre lepar_arbre = new Arbre(\"\")] : AVANT ( DATE )? ( STR_MOIS )? value= ( VAR_DATE | DIGIT4 | MONTH ) ;
	public final Arbre avantDateParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;

		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:556:59: ( AVANT ( DATE )? ( STR_MOIS )? value= ( VAR_DATE | DIGIT4 | MONTH ) )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:557:3: AVANT ( DATE )? ( STR_MOIS )? value= ( VAR_DATE | DIGIT4 | MONTH )
			{
			match(input,AVANT,FOLLOW_AVANT_in_avantDateParam916); 
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:558:3: ( DATE )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==DATE) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:558:3: DATE
					{
					match(input,DATE,FOLLOW_DATE_in_avantDateParam920); 
					}
					break;

			}

			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:559:3: ( STR_MOIS )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==STR_MOIS) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:559:3: STR_MOIS
					{
					match(input,STR_MOIS,FOLLOW_STR_MOIS_in_avantDateParam925); 
					}
					break;

			}

			value=input.LT(1);
			if ( input.LA(1)==DIGIT4||input.LA(1)==MONTH||input.LA(1)==VAR_DATE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

							String[] dateStr=value.getText().trim().replace(" ","/")
								.replace("janvier","01")
								.replace("février","02")
								.replace("mars","03")
								.replace("avril","04")
								.replace("mai","05")
								.replace("juin","06")
								.replace("juillet","07")
								.replace("août","08")
								.replace("septembre","09")
								.replace("octobre","10")
								.replace("novembre","11")
								.replace("décembre","12")
								.split("/");
							int n=dateStr.length;
							String annee;
							String jour;
							String mois;
							switch(n){
								case 1:
									if (dateStr[0].length()==4){
										annee=dateStr[0];
										lepar_arbre.ajouteFils(new Arbre("", "annee < '"+annee+"'"));
									}
									else{
										mois=dateStr[0];
										lepar_arbre.ajouteFils(new Arbre("", "mois < '"+mois+"'"));
									}
									break;
								case 2:
									if (dateStr[1].length()==4){
										annee=dateStr[1];
										mois=dateStr[0];
										lepar_arbre.ajouteFils(new Arbre("","("));
										lepar_arbre.ajouteFils(new Arbre("", "annee < '"+annee+"'"));
										lepar_arbre.ajouteFils(new Arbre("","OR"));
										lepar_arbre.ajouteFils(new Arbre("","("));
										lepar_arbre.ajouteFils(new Arbre("", "annee = '"+annee+"'"));
										lepar_arbre.ajouteFils(new Arbre("","AND"));
										lepar_arbre.ajouteFils(new Arbre("", "mois < '"+mois+"'"));
										lepar_arbre.ajouteFils(new Arbre("",")"));
										lepar_arbre.ajouteFils(new Arbre("",")"));
									}
									else{
										mois=dateStr[1];
										jour=dateStr[0];
										lepar_arbre.ajouteFils(new Arbre("","("));
										lepar_arbre.ajouteFils(new Arbre("", "mois < '"+mois+"'"));
										lepar_arbre.ajouteFils(new Arbre("","OR"));
										lepar_arbre.ajouteFils(new Arbre("","("));
										lepar_arbre.ajouteFils(new Arbre("", "mois = '"+mois+"'"));
										lepar_arbre.ajouteFils(new Arbre("","AND"));
										lepar_arbre.ajouteFils(new Arbre("", "jour < '"+jour+"'"));
										lepar_arbre.ajouteFils(new Arbre("",")"));
										lepar_arbre.ajouteFils(new Arbre("",")"));
									}
									break;
								default:
									annee=dateStr[2];
									mois=dateStr[1];
									jour=dateStr[0];
									lepar_arbre.ajouteFils(new Arbre("","("));
									lepar_arbre.ajouteFils(new Arbre("", "annee < '"+annee+"'"));
									lepar_arbre.ajouteFils(new Arbre("","OR"));
									lepar_arbre.ajouteFils(new Arbre("","("));
									lepar_arbre.ajouteFils(new Arbre("", "annee = '"+annee+"'"));
									lepar_arbre.ajouteFils(new Arbre("","AND"));
									lepar_arbre.ajouteFils(new Arbre("", "mois < '"+mois+"'"));
									lepar_arbre.ajouteFils(new Arbre("",")"));
									lepar_arbre.ajouteFils(new Arbre("","OR"));
									lepar_arbre.ajouteFils(new Arbre("","("));
									lepar_arbre.ajouteFils(new Arbre("", "annee = '"+annee+"'"));
									lepar_arbre.ajouteFils(new Arbre("","AND"));
									lepar_arbre.ajouteFils(new Arbre("", "mois = '"+mois+"'"));
									lepar_arbre.ajouteFils(new Arbre("","AND"));
									lepar_arbre.ajouteFils(new Arbre("", "jour < '"+jour+"'"));
									lepar_arbre.ajouteFils(new Arbre("",")"));
									lepar_arbre.ajouteFils(new Arbre("",")"));
									break;
							}
							if (!requete_stack.peek().tableNames.contains("date")){
								requete_stack.peek().tableNames+= " date";
							}		
								
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "avantDateParam"



	// $ANTLR start "numeroParam"
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:648:1: numeroParam returns [Arbre lepar_arbre = new Arbre(\"\")] : NUMERO value= ( INT | DIGIT2 | DIGIT4 ) ;
	public final Arbre numeroParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;

		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:648:56: ( NUMERO value= ( INT | DIGIT2 | DIGIT4 ) )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:649:3: NUMERO value= ( INT | DIGIT2 | DIGIT4 )
			{
			match(input,NUMERO,FOLLOW_NUMERO_in_numeroParam965); 
			value=input.LT(1);
			if ( (input.LA(1) >= DIGIT2 && input.LA(1) <= DIGIT4)||input.LA(1)==INT ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

							lepar_arbre.ajouteFils(new Arbre("", "tt.numero = '"+value.getText()+"'"));		
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "numeroParam"



	// $ANTLR start "rubriqueParam"
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:656:1: rubriqueParam returns [Arbre lepar_arbre = new Arbre(\"\")] : ( DANS | EN )? RUBRIQUE value= VAR (value= VAR )* (c= CONJ value= VAR (value= VAR )* )* ;
	public final Arbre rubriqueParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;
		Token c=null;

		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:656:58: ( ( DANS | EN )? RUBRIQUE value= VAR (value= VAR )* (c= CONJ value= VAR (value= VAR )* )* )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:657:3: ( DANS | EN )? RUBRIQUE value= VAR (value= VAR )* (c= CONJ value= VAR (value= VAR )* )*
			{
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:657:3: ( DANS | EN )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==DANS||LA20_0==EN) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:
					{
					if ( input.LA(1)==DANS||input.LA(1)==EN ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_rubriqueParam1012); 
			value=(Token)match(input,VAR,FOLLOW_VAR_in_rubriqueParam1020); 

							lepar_arbre.ajouteFils(new Arbre("", "(tt.rubrique = '"+value.getText()+"'"));	
						
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:663:3: (value= VAR )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==VAR) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:663:4: value= VAR
					{
					value=(Token)match(input,VAR,FOLLOW_VAR_in_rubriqueParam1032); 

									lepar_arbre.ajouteFils(new Arbre("", "AND"));	
									lepar_arbre.ajouteFils(new Arbre("", "tt.rubrique = '"+value.getText()+"'"));	
								
					}
					break;

				default :
					break loop21;
				}
			}

			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:668:3: (c= CONJ value= VAR (value= VAR )* )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==CONJ) ) {
					int LA23_2 = input.LA(2);
					if ( (LA23_2==VAR) ) {
						alt23=1;
					}

				}

				switch (alt23) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:668:4: c= CONJ value= VAR (value= VAR )*
					{
					c=(Token)match(input,CONJ,FOLLOW_CONJ_in_rubriqueParam1046); 

									String conj=c.getText().toUpperCase().equals("ET")?"AND":"OR";
									lepar_arbre.ajouteFils(new Arbre("", conj));	
								
					value=(Token)match(input,VAR,FOLLOW_VAR_in_rubriqueParam1060); 

									lepar_arbre.ajouteFils(new Arbre("", "(tt.rubrique = '"+value.getText()+"'"));	
								
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:677:3: (value= VAR )*
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( (LA22_0==VAR) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:677:4: value= VAR
							{
							value=(Token)match(input,VAR,FOLLOW_VAR_in_rubriqueParam1072); 

											lepar_arbre.ajouteFils(new Arbre("", "AND"));	
											lepar_arbre.ajouteFils(new Arbre("", "tt.rubrique = '"+value.getText()+"'"));	
										
							}
							break;

						default :
							break loop22;
						}
					}


									lepar_arbre.ajouteFils(new Arbre("", ")"));	
								
					}
					break;

				default :
					break loop23;
				}
			}


							lepar_arbre.ajouteFils(new Arbre("", ")"));	
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "rubriqueParam"



	// $ANTLR start "motParam"
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:691:1: motParam returns [Arbre lepar_arbre = new Arbre(\"\")] : ( MOT )+ value= VAR (value= VAR )* (c= CONJ value= VAR (value= VAR )* )* ;
	public final Arbre motParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;
		Token c=null;

		String str;
		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:692:22: ( ( MOT )+ value= VAR (value= VAR )* (c= CONJ value= VAR (value= VAR )* )* )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:693:3: ( MOT )+ value= VAR (value= VAR )* (c= CONJ value= VAR (value= VAR )* )*
			{
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:693:3: ( MOT )+
			int cnt24=0;
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==MOT) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:693:3: MOT
					{
					match(input,MOT,FOLLOW_MOT_in_motParam1119); 
					}
					break;

				default :
					if ( cnt24 >= 1 ) break loop24;
					EarlyExitException eee = new EarlyExitException(24, input);
					throw eee;
				}
				cnt24++;
			}

			value=(Token)match(input,VAR,FOLLOW_VAR_in_motParam1128); 

							lepar_arbre.ajouteFils(new Arbre("", "("));	
							lepar_arbre.ajouteFils(new Arbre("", "("));	
							lepar_arbre.ajouteFils(new Arbre("", "tt.mot = '"+value.getText()+"'"));	
						
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:700:3: (value= VAR )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==VAR) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:700:4: value= VAR
					{
					value=(Token)match(input,VAR,FOLLOW_VAR_in_motParam1140); 

									lepar_arbre.ajouteFils(new Arbre("", "AND"));	
									lepar_arbre.ajouteFils(new Arbre("", "tt.mot = '"+value.getText()+"'"));	
								
					}
					break;

				default :
					break loop25;
				}
			}


							lepar_arbre.ajouteFils(new Arbre("", ")"));	
						
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:708:3: (c= CONJ value= VAR (value= VAR )* )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==CONJ) ) {
					int LA27_2 = input.LA(2);
					if ( (LA27_2==VAR) ) {
						alt27=1;
					}

				}

				switch (alt27) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:708:4: c= CONJ value= VAR (value= VAR )*
					{
					c=(Token)match(input,CONJ,FOLLOW_CONJ_in_motParam1159); 

									String conj=c.getText().toUpperCase().equals("ET")?"AND":"OR";
									lepar_arbre.ajouteFils(new Arbre("", conj));	
								
					value=(Token)match(input,VAR,FOLLOW_VAR_in_motParam1173); 

									lepar_arbre.ajouteFils(new Arbre("", "(tt.mot = '"+value.getText()+"'"));	
								
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:717:3: (value= VAR )*
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0==VAR) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:717:4: value= VAR
							{
							value=(Token)match(input,VAR,FOLLOW_VAR_in_motParam1185); 

											lepar_arbre.ajouteFils(new Arbre("", "AND"));	
											lepar_arbre.ajouteFils(new Arbre("", "tt.mot = '"+value.getText()+"'"));	
										
							}
							break;

						default :
							break loop26;
						}
					}


									lepar_arbre.ajouteFils(new Arbre("", ")"));	
								
					}
					break;

				default :
					break loop27;
				}
			}


							lepar_arbre.ajouteFils(new Arbre("", ")"));	
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "motParam"



	// $ANTLR start "motEnTitreParam"
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:734:1: motEnTitreParam returns [Arbre lepar_arbre = new Arbre(\"\")] : ( ( TITRE ( MOT )+ (value= VAR )+ ) | ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE ) ) ;
	public final Arbre motEnTitreParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;

		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:734:60: ( ( ( TITRE ( MOT )+ (value= VAR )+ ) | ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE ) ) )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:735:3: ( ( TITRE ( MOT )+ (value= VAR )+ ) | ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE ) )
			{
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:735:3: ( ( TITRE ( MOT )+ (value= VAR )+ ) | ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE ) )
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==TITRE) ) {
				alt32=1;
			}
			else if ( (LA32_0==MOT) ) {
				alt32=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:735:4: ( TITRE ( MOT )+ (value= VAR )+ )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:735:4: ( TITRE ( MOT )+ (value= VAR )+ )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:735:5: TITRE ( MOT )+ (value= VAR )+
					{
					match(input,TITRE,FOLLOW_TITRE_in_motEnTitreParam1231); 
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:736:3: ( MOT )+
					int cnt28=0;
					loop28:
					while (true) {
						int alt28=2;
						int LA28_0 = input.LA(1);
						if ( (LA28_0==MOT) ) {
							alt28=1;
						}

						switch (alt28) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:736:3: MOT
							{
							match(input,MOT,FOLLOW_MOT_in_motEnTitreParam1235); 
							}
							break;

						default :
							if ( cnt28 >= 1 ) break loop28;
							EarlyExitException eee = new EarlyExitException(28, input);
							throw eee;
						}
						cnt28++;
					}

					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:737:9: (value= VAR )+
					int cnt29=0;
					loop29:
					while (true) {
						int alt29=2;
						int LA29_0 = input.LA(1);
						if ( (LA29_0==VAR) ) {
							alt29=1;
						}

						switch (alt29) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:737:9: value= VAR
							{
							value=(Token)match(input,VAR,FOLLOW_VAR_in_motEnTitreParam1244); 
							}
							break;

						default :
							if ( cnt29 >= 1 ) break loop29;
							EarlyExitException eee = new EarlyExitException(29, input);
							throw eee;
						}
						cnt29++;
					}

					}

					}
					break;
				case 2 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:739:3: ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:739:3: ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:739:4: ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:739:4: ( MOT )+
					int cnt30=0;
					loop30:
					while (true) {
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( (LA30_0==MOT) ) {
							alt30=1;
						}

						switch (alt30) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:739:4: MOT
							{
							match(input,MOT,FOLLOW_MOT_in_motEnTitreParam1255); 
							}
							break;

						default :
							if ( cnt30 >= 1 ) break loop30;
							EarlyExitException eee = new EarlyExitException(30, input);
							throw eee;
						}
						cnt30++;
					}

					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:740:8: (value= VAR )+
					int cnt31=0;
					loop31:
					while (true) {
						int alt31=2;
						int LA31_0 = input.LA(1);
						if ( (LA31_0==VAR) ) {
							alt31=1;
						}

						switch (alt31) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:740:8: value= VAR
							{
							value=(Token)match(input,VAR,FOLLOW_VAR_in_motEnTitreParam1262); 
							}
							break;

						default :
							if ( cnt31 >= 1 ) break loop31;
							EarlyExitException eee = new EarlyExitException(31, input);
							throw eee;
						}
						cnt31++;
					}

					if ( input.LA(1)==DANS||input.LA(1)==EN ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,TITRE,FOLLOW_TITRE_in_motEnTitreParam1275); 
					}

					}
					break;

			}


							lepar_arbre.ajouteFils(new Arbre("", "tt.mot = '"+value.getText()+"'"));
							if (!requete_stack.peek().tableNames.contains("titre")){
								requete_stack.peek().tableNames+= " titre";
							}	
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "motEnTitreParam"

	// Delegated rules


	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA9_eotS =
		"\20\uffff";
	static final String DFA9_eofS =
		"\20\uffff";
	static final String DFA9_minS =
		"\1\4\1\uffff\1\23\2\16\6\uffff\1\4\1\16\1\4\1\uffff\1\27";
	static final String DFA9_maxS =
		"\1\34\1\uffff\1\33\2\34\6\uffff\3\34\1\uffff\1\32";
	static final String DFA9_acceptS =
		"\1\uffff\1\1\3\uffff\1\2\1\4\1\5\1\6\1\7\1\10\3\uffff\1\3\1\uffff";
	static final String DFA9_specialS =
		"\20\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\11\2\uffff\1\10\2\uffff\1\6\1\3\2\uffff\1\5\1\4\1\12\1\uffff\1\5\1"+
			"\2\1\uffff\1\7\1\uffff\1\6\1\uffff\1\5\1\1\1\uffff\1\5",
			"",
			"\1\2\7\uffff\1\13",
			"\2\5\1\12\1\uffff\1\5\6\uffff\1\5\2\uffff\1\5",
			"\1\5\3\uffff\1\5\4\uffff\1\6\1\uffff\1\5\2\uffff\1\5",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\16\2\uffff\1\16\1\uffff\1\16\1\17\1\16\2\uffff\1\16\1\14\1\16\1\uffff"+
			"\2\16\1\uffff\3\16\1\uffff\2\16\1\15\1\16",
			"\1\16\3\uffff\1\16\4\uffff\1\16\1\uffff\1\16\1\1\1\uffff\1\16",
			"\1\16\2\uffff\1\16\1\uffff\1\16\1\17\1\16\2\uffff\1\16\1\14\1\16\1\uffff"+
			"\2\16\1\uffff\3\16\1\uffff\2\16\1\15\1\16",
			"",
			"\1\16\2\uffff\1\1"
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "199:3: (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam |par= numeroParam |par= avantDateParam |par= apresDateParam |par= entreDateParam )";
		}
	}

	public static final BitSet FOLLOW_requete_in_listerequetes434 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_PONC_in_listerequetes436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete475 = new BitSet(new long[]{0x0000000001900060L});
	public static final BitSet FOLLOW_ARTICLE_in_requete488 = new BitSet(new long[]{0x0000000016BDCED0L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete500 = new BitSet(new long[]{0x0000000016BDCEF0L});
	public static final BitSet FOLLOW_ARTICLE_in_requete504 = new BitSet(new long[]{0x0000000016BDCED0L});
	public static final BitSet FOLLOW_AUTEUR_in_requete517 = new BitSet(new long[]{0x0000000016BDCEF0L});
	public static final BitSet FOLLOW_ARTICLE_in_requete521 = new BitSet(new long[]{0x0000000016BDCED0L});
	public static final BitSet FOLLOW_NOMBRE_in_requete534 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete538 = new BitSet(new long[]{0x0000000016BDCED0L});
	public static final BitSet FOLLOW_CONJ_in_requete557 = new BitSet(new long[]{0x0000000000000120L});
	public static final BitSet FOLLOW_set_in_requete562 = new BitSet(new long[]{0x0000000016BDCED0L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete583 = new BitSet(new long[]{0x0000000016BDCEF0L});
	public static final BitSet FOLLOW_ARTICLE_in_requete587 = new BitSet(new long[]{0x0000000016BDCED0L});
	public static final BitSet FOLLOW_AUTEUR_in_requete600 = new BitSet(new long[]{0x0000000016BDCEF0L});
	public static final BitSet FOLLOW_ARTICLE_in_requete604 = new BitSet(new long[]{0x0000000016BDCED0L});
	public static final BitSet FOLLOW_NOMBRE_in_requete617 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete621 = new BitSet(new long[]{0x0000000016BDCED0L});
	public static final BitSet FOLLOW_params_in_requete645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONJ_in_params677 = new BitSet(new long[]{0x0000000016ADCC90L});
	public static final BitSet FOLLOW_motEnTitreParam_in_params693 = new BitSet(new long[]{0x0000000016ADCE92L});
	public static final BitSet FOLLOW_dateParam_in_params702 = new BitSet(new long[]{0x0000000016ADCE92L});
	public static final BitSet FOLLOW_motParam_in_params711 = new BitSet(new long[]{0x0000000016ADCE92L});
	public static final BitSet FOLLOW_rubriqueParam_in_params718 = new BitSet(new long[]{0x0000000016ADCE92L});
	public static final BitSet FOLLOW_numeroParam_in_params725 = new BitSet(new long[]{0x0000000016ADCE92L});
	public static final BitSet FOLLOW_avantDateParam_in_params732 = new BitSet(new long[]{0x0000000016ADCE92L});
	public static final BitSet FOLLOW_apresDateParam_in_params739 = new BitSet(new long[]{0x0000000016ADCE92L});
	public static final BitSet FOLLOW_entreDateParam_in_params746 = new BitSet(new long[]{0x0000000016ADCE92L});
	public static final BitSet FOLLOW_DATE_in_entreDateParam774 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ENTRE_in_entreDateParam778 = new BitSet(new long[]{0x0000000012044000L});
	public static final BitSet FOLLOW_STR_MOIS_in_entreDateParam781 = new BitSet(new long[]{0x0000000010044000L});
	public static final BitSet FOLLOW_set_in_entreDateParam789 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJ_in_entreDateParam802 = new BitSet(new long[]{0x0000000010044000L});
	public static final BitSet FOLLOW_set_in_entreDateParam809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APRES_in_apresDateParam836 = new BitSet(new long[]{0x0000000012044800L});
	public static final BitSet FOLLOW_DATE_in_apresDateParam840 = new BitSet(new long[]{0x0000000012044000L});
	public static final BitSet FOLLOW_STR_MOIS_in_apresDateParam845 = new BitSet(new long[]{0x0000000010044000L});
	public static final BitSet FOLLOW_set_in_apresDateParam854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_dateParam880 = new BitSet(new long[]{0x000000001204C000L});
	public static final BitSet FOLLOW_EN_in_dateParam884 = new BitSet(new long[]{0x0000000012044000L});
	public static final BitSet FOLLOW_STR_MOIS_in_dateParam888 = new BitSet(new long[]{0x0000000010044000L});
	public static final BitSet FOLLOW_set_in_dateParam894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AVANT_in_avantDateParam916 = new BitSet(new long[]{0x0000000012044800L});
	public static final BitSet FOLLOW_DATE_in_avantDateParam920 = new BitSet(new long[]{0x0000000012044000L});
	public static final BitSet FOLLOW_STR_MOIS_in_avantDateParam925 = new BitSet(new long[]{0x0000000010044000L});
	public static final BitSet FOLLOW_set_in_avantDateParam934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERO_in_numeroParam965 = new BitSet(new long[]{0x0000000000026000L});
	public static final BitSet FOLLOW_set_in_numeroParam973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RUBRIQUE_in_rubriqueParam1012 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_VAR_in_rubriqueParam1020 = new BitSet(new long[]{0x0000000008000202L});
	public static final BitSet FOLLOW_VAR_in_rubriqueParam1032 = new BitSet(new long[]{0x0000000008000202L});
	public static final BitSet FOLLOW_CONJ_in_rubriqueParam1046 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_VAR_in_rubriqueParam1060 = new BitSet(new long[]{0x0000000008000202L});
	public static final BitSet FOLLOW_VAR_in_rubriqueParam1072 = new BitSet(new long[]{0x0000000008000202L});
	public static final BitSet FOLLOW_MOT_in_motParam1119 = new BitSet(new long[]{0x0000000008080000L});
	public static final BitSet FOLLOW_VAR_in_motParam1128 = new BitSet(new long[]{0x0000000008000202L});
	public static final BitSet FOLLOW_VAR_in_motParam1140 = new BitSet(new long[]{0x0000000008000202L});
	public static final BitSet FOLLOW_CONJ_in_motParam1159 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_VAR_in_motParam1173 = new BitSet(new long[]{0x0000000008000202L});
	public static final BitSet FOLLOW_VAR_in_motParam1185 = new BitSet(new long[]{0x0000000008000202L});
	public static final BitSet FOLLOW_TITRE_in_motEnTitreParam1231 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_MOT_in_motEnTitreParam1235 = new BitSet(new long[]{0x0000000008080000L});
	public static final BitSet FOLLOW_VAR_in_motEnTitreParam1244 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_MOT_in_motEnTitreParam1255 = new BitSet(new long[]{0x0000000008080000L});
	public static final BitSet FOLLOW_VAR_in_motEnTitreParam1262 = new BitSet(new long[]{0x0000000008008400L});
	public static final BitSet FOLLOW_set_in_motEnTitreParam1267 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_TITRE_in_motEnTitreParam1275 = new BitSet(new long[]{0x0000000000000002L});
}
