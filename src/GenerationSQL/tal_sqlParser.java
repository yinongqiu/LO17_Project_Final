// $ANTLR 3.5.1 /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g 2020-01-14 02:16:00
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
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:102:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( SELECT )* ( ( ARTICLE ) | ( RUBRIQUE ( ARTICLE )? ) | ( AUTEUR ( ARTICLE )? ) | ( NOMBRE ARTICLE ) | NUMERO ( BULLETIN )? ) ( CONJ ( ( ( ARTICLE | BULLETIN ) ) | ( RUBRIQUE ( ARTICLE )? ) | ( AUTEUR ( ARTICLE )? ) | ( NOMBRE ARTICLE ) | NUMERO ( BULLETIN )? ) )* ps= params ;
	public final Arbre requete() throws RecognitionException {
		requete_stack.push(new requete_scope());
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;

		Arbre ps_arbre;Arbre tableArbre=new Arbre("");
		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:104:57: ( ( SELECT )* ( ( ARTICLE ) | ( RUBRIQUE ( ARTICLE )? ) | ( AUTEUR ( ARTICLE )? ) | ( NOMBRE ARTICLE ) | NUMERO ( BULLETIN )? ) ( CONJ ( ( ( ARTICLE | BULLETIN ) ) | ( RUBRIQUE ( ARTICLE )? ) | ( AUTEUR ( ARTICLE )? ) | ( NOMBRE ARTICLE ) | NUMERO ( BULLETIN )? ) )* ps= params )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:105:3: ( SELECT )* ( ( ARTICLE ) | ( RUBRIQUE ( ARTICLE )? ) | ( AUTEUR ( ARTICLE )? ) | ( NOMBRE ARTICLE ) | NUMERO ( BULLETIN )? ) ( CONJ ( ( ( ARTICLE | BULLETIN ) ) | ( RUBRIQUE ( ARTICLE )? ) | ( AUTEUR ( ARTICLE )? ) | ( NOMBRE ARTICLE ) | NUMERO ( BULLETIN )? ) )* ps= params
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
						
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:110:3: ( ( ARTICLE ) | ( RUBRIQUE ( ARTICLE )? ) | ( AUTEUR ( ARTICLE )? ) | ( NOMBRE ARTICLE ) | NUMERO ( BULLETIN )? )
			int alt5=5;
			switch ( input.LA(1) ) {
			case ARTICLE:
				{
				alt5=1;
				}
				break;
			case RUBRIQUE:
				{
				alt5=2;
				}
				break;
			case AUTEUR:
				{
				alt5=3;
				}
				break;
			case NOMBRE:
				{
				alt5=4;
				}
				break;
			case NUMERO:
				{
				alt5=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
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

									req_arbre.ajouteFils(new Arbre("","COUNT(DISTINCT(tt.fichier))"));
								
					}

					}
					break;
				case 5 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:135:4: NUMERO ( BULLETIN )?
					{
					match(input,NUMERO,FOLLOW_NUMERO_in_requete552); 
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:136:3: ( BULLETIN )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==BULLETIN) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:136:3: BULLETIN
							{
							match(input,BULLETIN,FOLLOW_BULLETIN_in_requete556); 
							}
							break;

					}


									req_arbre.ajouteFils(new Arbre("",","));
									req_arbre.ajouteFils(new Arbre("","tt.numero"));
								
					}
					break;

			}

			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:142:3: ( CONJ ( ( ( ARTICLE | BULLETIN ) ) | ( RUBRIQUE ( ARTICLE )? ) | ( AUTEUR ( ARTICLE )? ) | ( NOMBRE ARTICLE ) | NUMERO ( BULLETIN )? ) )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==CONJ) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:142:4: CONJ ( ( ( ARTICLE | BULLETIN ) ) | ( RUBRIQUE ( ARTICLE )? ) | ( AUTEUR ( ARTICLE )? ) | ( NOMBRE ARTICLE ) | NUMERO ( BULLETIN )? )
					{
					match(input,CONJ,FOLLOW_CONJ_in_requete572); 
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:143:3: ( ( ( ARTICLE | BULLETIN ) ) | ( RUBRIQUE ( ARTICLE )? ) | ( AUTEUR ( ARTICLE )? ) | ( NOMBRE ARTICLE ) | NUMERO ( BULLETIN )? )
					int alt9=5;
					switch ( input.LA(1) ) {
					case ARTICLE:
					case BULLETIN:
						{
						alt9=1;
						}
						break;
					case RUBRIQUE:
						{
						alt9=2;
						}
						break;
					case AUTEUR:
						{
						alt9=3;
						}
						break;
					case NOMBRE:
						{
						alt9=4;
						}
						break;
					case NUMERO:
						{
						alt9=5;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}
					switch (alt9) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:143:4: ( ( ARTICLE | BULLETIN ) )
							{
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:143:4: ( ( ARTICLE | BULLETIN ) )
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:144:3: ( ARTICLE | BULLETIN )
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
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:151:4: ( RUBRIQUE ( ARTICLE )? )
							{
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:151:4: ( RUBRIQUE ( ARTICLE )? )
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:151:5: RUBRIQUE ( ARTICLE )?
							{
							match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete602); 
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:152:3: ( ARTICLE )?
							int alt6=2;
							int LA6_0 = input.LA(1);
							if ( (LA6_0==ARTICLE) ) {
								alt6=1;
							}
							switch (alt6) {
								case 1 :
									// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:152:3: ARTICLE
									{
									match(input,ARTICLE,FOLLOW_ARTICLE_in_requete606); 
									}
									break;

							}


											req_arbre.ajouteFils(new Arbre("",","));
											req_arbre.ajouteFils(new Arbre("","tt.rubrique"));
										
							}

							}
							break;
						case 3 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:157:4: ( AUTEUR ( ARTICLE )? )
							{
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:157:4: ( AUTEUR ( ARTICLE )? )
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:157:5: AUTEUR ( ARTICLE )?
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete619); 
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:158:3: ( ARTICLE )?
							int alt7=2;
							int LA7_0 = input.LA(1);
							if ( (LA7_0==ARTICLE) ) {
								alt7=1;
							}
							switch (alt7) {
								case 1 :
									// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:158:3: ARTICLE
									{
									match(input,ARTICLE,FOLLOW_ARTICLE_in_requete623); 
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
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:166:4: ( NOMBRE ARTICLE )
							{
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:166:4: ( NOMBRE ARTICLE )
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:166:5: NOMBRE ARTICLE
							{
							match(input,NOMBRE,FOLLOW_NOMBRE_in_requete636); 
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete640); 

											req_arbre.ajouteFils(new Arbre("",","));
											req_arbre.ajouteFils(new Arbre("","COUNT(*)"));
										
							}

							}
							break;
						case 5 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:173:4: NUMERO ( BULLETIN )?
							{
							match(input,NUMERO,FOLLOW_NUMERO_in_requete654); 
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:174:3: ( BULLETIN )?
							int alt8=2;
							int LA8_0 = input.LA(1);
							if ( (LA8_0==BULLETIN) ) {
								alt8=1;
							}
							switch (alt8) {
								case 1 :
									// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:174:3: BULLETIN
									{
									match(input,BULLETIN,FOLLOW_BULLETIN_in_requete658); 
									}
									break;

							}


											req_arbre.ajouteFils(new Arbre("",","));
											req_arbre.ajouteFils(new Arbre("","tt.numero"));
										
							}
							break;

					}

					}
					break;

				default :
					break loop10;
				}
			}


							req_arbre.ajouteFils(new Arbre("","FROM"));
							req_arbre.ajouteFils(tableArbre);
							req_arbre.ajouteFils(new Arbre("","WHERE"));
						
			pushFollow(FOLLOW_params_in_requete680);
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
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:206:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam |par= numeroParam |par= avantDateParam |par= apresDateParam |par= entreDateParam ) ( (c= CONJ ) (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam |par= numeroParam |par= avantDateParam |par= apresDateParam |par= entreDateParam ) )* ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Token c=null;
		Arbre par =null;

		Arbre par_arbre;int flag=0;String conj="";
		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:207:53: ( (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam |par= numeroParam |par= avantDateParam |par= apresDateParam |par= entreDateParam ) ( (c= CONJ ) (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam |par= numeroParam |par= avantDateParam |par= apresDateParam |par= entreDateParam ) )* )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:208:3: (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam |par= numeroParam |par= avantDateParam |par= apresDateParam |par= entreDateParam ) ( (c= CONJ ) (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam |par= numeroParam |par= avantDateParam |par= apresDateParam |par= entreDateParam ) )*
			{
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:208:3: (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam |par= numeroParam |par= avantDateParam |par= apresDateParam |par= entreDateParam )
			int alt11=8;
			alt11 = dfa11.predict(input);
			switch (alt11) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:208:4: par= motEnTitreParam
					{
					pushFollow(FOLLOW_motEnTitreParam_in_params712);
					par=motEnTitreParam();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:209:4: par= dateParam
					{
					pushFollow(FOLLOW_dateParam_in_params721);
					par=dateParam();
					state._fsp--;

					}
					break;
				case 3 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:210:4: par= motParam
					{
					pushFollow(FOLLOW_motParam_in_params730);
					par=motParam();
					state._fsp--;

					}
					break;
				case 4 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:211:4: par= rubriqueParam
					{
					pushFollow(FOLLOW_rubriqueParam_in_params737);
					par=rubriqueParam();
					state._fsp--;

					}
					break;
				case 5 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:212:4: par= numeroParam
					{
					pushFollow(FOLLOW_numeroParam_in_params744);
					par=numeroParam();
					state._fsp--;

					}
					break;
				case 6 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:213:4: par= avantDateParam
					{
					pushFollow(FOLLOW_avantDateParam_in_params751);
					par=avantDateParam();
					state._fsp--;

					}
					break;
				case 7 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:214:4: par= apresDateParam
					{
					pushFollow(FOLLOW_apresDateParam_in_params758);
					par=apresDateParam();
					state._fsp--;

					}
					break;
				case 8 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:215:4: par= entreDateParam
					{
					pushFollow(FOLLOW_entreDateParam_in_params765);
					par=entreDateParam();
					state._fsp--;

					}
					break;

			}


							par_arbre = par;
							les_pars_arbre.ajouteFils(par_arbre);
							conj="";
							
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:223:3: ( (c= CONJ ) (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam |par= numeroParam |par= avantDateParam |par= apresDateParam |par= entreDateParam ) )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==CONJ) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:223:4: (c= CONJ ) (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam |par= numeroParam |par= avantDateParam |par= apresDateParam |par= entreDateParam )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:223:4: (c= CONJ )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:223:5: c= CONJ
					{
					c=(Token)match(input,CONJ,FOLLOW_CONJ_in_params786); 

										//conj=c.getText().toUpperCase().equals("ET")?"AND":"OR";
										conj="OR";
									
					}

					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:228:3: (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam |par= numeroParam |par= avantDateParam |par= apresDateParam |par= entreDateParam )
					int alt12=8;
					alt12 = dfa12.predict(input);
					switch (alt12) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:228:4: par= motEnTitreParam
							{
							pushFollow(FOLLOW_motEnTitreParam_in_params801);
							par=motEnTitreParam();
							state._fsp--;

							}
							break;
						case 2 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:229:4: par= dateParam
							{
							pushFollow(FOLLOW_dateParam_in_params810);
							par=dateParam();
							state._fsp--;

							}
							break;
						case 3 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:230:4: par= motParam
							{
							pushFollow(FOLLOW_motParam_in_params819);
							par=motParam();
							state._fsp--;

							}
							break;
						case 4 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:231:4: par= rubriqueParam
							{
							pushFollow(FOLLOW_rubriqueParam_in_params826);
							par=rubriqueParam();
							state._fsp--;

							}
							break;
						case 5 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:232:4: par= numeroParam
							{
							pushFollow(FOLLOW_numeroParam_in_params833);
							par=numeroParam();
							state._fsp--;

							}
							break;
						case 6 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:233:4: par= avantDateParam
							{
							pushFollow(FOLLOW_avantDateParam_in_params840);
							par=avantDateParam();
							state._fsp--;

							}
							break;
						case 7 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:234:4: par= apresDateParam
							{
							pushFollow(FOLLOW_apresDateParam_in_params847);
							par=apresDateParam();
							state._fsp--;

							}
							break;
						case 8 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:235:4: par= entreDateParam
							{
							pushFollow(FOLLOW_entreDateParam_in_params854);
							par=entreDateParam();
							state._fsp--;

							}
							break;

					}


									par_arbre = par;
									les_pars_arbre.ajouteFils(new Arbre("", conj.isEmpty()?"AND":conj));
									les_pars_arbre.ajouteFils(par_arbre);
									conj="";
									
					}
					break;

				default :
					break loop13;
				}
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
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:246:1: entreDateParam returns [Arbre lepar_arbre = new Arbre(\"\")] : ( DATE )? ENTRE ( STR_MOIS )? value= ( VAR_DATE | DIGIT4 | MONTH ) CONJ value= ( VAR_DATE | DIGIT4 | MONTH ) ;
	public final Arbre entreDateParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;

		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:246:59: ( ( DATE )? ENTRE ( STR_MOIS )? value= ( VAR_DATE | DIGIT4 | MONTH ) CONJ value= ( VAR_DATE | DIGIT4 | MONTH ) )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:247:2: ( DATE )? ENTRE ( STR_MOIS )? value= ( VAR_DATE | DIGIT4 | MONTH ) CONJ value= ( VAR_DATE | DIGIT4 | MONTH )
			{
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:247:2: ( DATE )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==DATE) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:247:2: DATE
					{
					match(input,DATE,FOLLOW_DATE_in_entreDateParam882); 
					}
					break;

			}

			match(input,ENTRE,FOLLOW_ENTRE_in_entreDateParam886); 
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:249:2: ( STR_MOIS )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==STR_MOIS) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:249:2: STR_MOIS
					{
					match(input,STR_MOIS,FOLLOW_STR_MOIS_in_entreDateParam889); 
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
									lepar_arbre.ajouteFils(new Arbre("", "annee >= '"+annee+"'"));
								}
								else{
									mois=dateStr[0];
									lepar_arbre.ajouteFils(new Arbre("", "mois >= '"+mois+"'"));
								}
								break;
							case 2:
								if (dateStr[1].length()==4){
									annee=dateStr[1];
									mois=dateStr[0];
									lepar_arbre.ajouteFils(new Arbre("","("));
									lepar_arbre.ajouteFils(new Arbre("", "annee >= '"+annee+"'"));
									lepar_arbre.ajouteFils(new Arbre("","OR"));
									lepar_arbre.ajouteFils(new Arbre("","("));
									lepar_arbre.ajouteFils(new Arbre("", "annee = '"+annee+"'"));
									lepar_arbre.ajouteFils(new Arbre("","AND"));
									lepar_arbre.ajouteFils(new Arbre("", "mois >= '"+mois+"'"));
									lepar_arbre.ajouteFils(new Arbre("",")"));
									lepar_arbre.ajouteFils(new Arbre("",")"));
								}
								else{
									mois=dateStr[1];
									jour=dateStr[0];
									lepar_arbre.ajouteFils(new Arbre("","("));
									lepar_arbre.ajouteFils(new Arbre("", "mois >= '"+mois+"'"));
									lepar_arbre.ajouteFils(new Arbre("","OR"));
									lepar_arbre.ajouteFils(new Arbre("","("));
									lepar_arbre.ajouteFils(new Arbre("", "mois = '"+mois+"'"));
									lepar_arbre.ajouteFils(new Arbre("","AND"));
									lepar_arbre.ajouteFils(new Arbre("", "jour >= '"+jour+"'"));
									lepar_arbre.ajouteFils(new Arbre("",")"));
									lepar_arbre.ajouteFils(new Arbre("",")"));
								}
								break;
							default:
								annee=dateStr[2];
								mois=dateStr[1];
								jour=dateStr[0];
								lepar_arbre.ajouteFils(new Arbre("","("));
								lepar_arbre.ajouteFils(new Arbre("", "annee >= '"+annee+"'"));
								lepar_arbre.ajouteFils(new Arbre("","OR"));
								lepar_arbre.ajouteFils(new Arbre("","("));
								lepar_arbre.ajouteFils(new Arbre("", "annee = '"+annee+"'"));
								lepar_arbre.ajouteFils(new Arbre("","AND"));
								lepar_arbre.ajouteFils(new Arbre("", "mois >= '"+mois+"'"));
								lepar_arbre.ajouteFils(new Arbre("",")"));
								lepar_arbre.ajouteFils(new Arbre("","OR"));
								lepar_arbre.ajouteFils(new Arbre("","("));
								lepar_arbre.ajouteFils(new Arbre("", "annee = '"+annee+"'"));
								lepar_arbre.ajouteFils(new Arbre("","AND"));
								lepar_arbre.ajouteFils(new Arbre("", "mois = '"+mois+"'"));
								lepar_arbre.ajouteFils(new Arbre("","AND"));
								lepar_arbre.ajouteFils(new Arbre("", "jour >= '"+jour+"'"));
								lepar_arbre.ajouteFils(new Arbre("",")"));
								lepar_arbre.ajouteFils(new Arbre("",")"));
								break;
						}
						if (!requete_stack.peek().tableNames.contains("date")){
							requete_stack.peek().tableNames+= " date";
						}		
							
			match(input,CONJ,FOLLOW_CONJ_in_entreDateParam910); 
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
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:423:1: apresDateParam returns [Arbre lepar_arbre = new Arbre(\"\")] : APRES ( DATE )? ( STR_MOIS )? value= ( VAR_DATE | DIGIT4 | MONTH ) ;
	public final Arbre apresDateParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;

		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:423:59: ( APRES ( DATE )? ( STR_MOIS )? value= ( VAR_DATE | DIGIT4 | MONTH ) )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:424:3: APRES ( DATE )? ( STR_MOIS )? value= ( VAR_DATE | DIGIT4 | MONTH )
			{
			match(input,APRES,FOLLOW_APRES_in_apresDateParam944); 
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:425:3: ( DATE )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==DATE) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:425:3: DATE
					{
					match(input,DATE,FOLLOW_DATE_in_apresDateParam948); 
					}
					break;

			}

			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:426:3: ( STR_MOIS )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==STR_MOIS) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:426:3: STR_MOIS
					{
					match(input,STR_MOIS,FOLLOW_STR_MOIS_in_apresDateParam953); 
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
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:515:1: dateParam returns [Arbre lepar_arbre = new Arbre(\"\")] : ( DATE )? ( EN )? ( STR_MOIS )? value= ( VAR_DATE | DIGIT4 | MONTH ) ;
	public final Arbre dateParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;

		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:515:54: ( ( DATE )? ( EN )? ( STR_MOIS )? value= ( VAR_DATE | DIGIT4 | MONTH ) )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:516:2: ( DATE )? ( EN )? ( STR_MOIS )? value= ( VAR_DATE | DIGIT4 | MONTH )
			{
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:516:2: ( DATE )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==DATE) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:516:2: DATE
					{
					match(input,DATE,FOLLOW_DATE_in_dateParam988); 
					}
					break;

			}

			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:517:2: ( EN )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==EN) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:517:2: EN
					{
					match(input,EN,FOLLOW_EN_in_dateParam992); 
					}
					break;

			}

			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:518:2: ( STR_MOIS )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==STR_MOIS) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:518:2: STR_MOIS
					{
					match(input,STR_MOIS,FOLLOW_STR_MOIS_in_dateParam996); 
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
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:582:1: avantDateParam returns [Arbre lepar_arbre = new Arbre(\"\")] : AVANT ( DATE )? ( STR_MOIS )? value= ( VAR_DATE | DIGIT4 | MONTH ) ;
	public final Arbre avantDateParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;

		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:582:59: ( AVANT ( DATE )? ( STR_MOIS )? value= ( VAR_DATE | DIGIT4 | MONTH ) )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:583:3: AVANT ( DATE )? ( STR_MOIS )? value= ( VAR_DATE | DIGIT4 | MONTH )
			{
			match(input,AVANT,FOLLOW_AVANT_in_avantDateParam1024); 
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:584:3: ( DATE )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==DATE) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:584:3: DATE
					{
					match(input,DATE,FOLLOW_DATE_in_avantDateParam1028); 
					}
					break;

			}

			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:585:3: ( STR_MOIS )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==STR_MOIS) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:585:3: STR_MOIS
					{
					match(input,STR_MOIS,FOLLOW_STR_MOIS_in_avantDateParam1033); 
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
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:674:1: numeroParam returns [Arbre lepar_arbre = new Arbre(\"\")] : NUMERO value= ( INT | DIGIT2 | DIGIT4 ) ;
	public final Arbre numeroParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;

		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:674:56: ( NUMERO value= ( INT | DIGIT2 | DIGIT4 ) )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:675:3: NUMERO value= ( INT | DIGIT2 | DIGIT4 )
			{
			match(input,NUMERO,FOLLOW_NUMERO_in_numeroParam1073); 
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
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:682:1: rubriqueParam returns [Arbre lepar_arbre = new Arbre(\"\")] : ( DANS | EN )? RUBRIQUE value= VAR (value= VAR )* (c= CONJ value= VAR (value= VAR )* )* ;
	public final Arbre rubriqueParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;
		Token c=null;

		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:682:58: ( ( DANS | EN )? RUBRIQUE value= VAR (value= VAR )* (c= CONJ value= VAR (value= VAR )* )* )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:683:3: ( DANS | EN )? RUBRIQUE value= VAR (value= VAR )* (c= CONJ value= VAR (value= VAR )* )*
			{
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:683:3: ( DANS | EN )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==DANS||LA23_0==EN) ) {
				alt23=1;
			}
			switch (alt23) {
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

			match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_rubriqueParam1120); 
			value=(Token)match(input,VAR,FOLLOW_VAR_in_rubriqueParam1128); 

							lepar_arbre.ajouteFils(new Arbre("", "(tt.rubrique = '"+value.getText()+"'"));	
						
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:689:3: (value= VAR )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==VAR) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:689:4: value= VAR
					{
					value=(Token)match(input,VAR,FOLLOW_VAR_in_rubriqueParam1140); 

									lepar_arbre.ajouteFils(new Arbre("", "OR"));	
									lepar_arbre.ajouteFils(new Arbre("", "tt.rubrique = '"+value.getText()+"'"));	
								
					}
					break;

				default :
					break loop24;
				}
			}

			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:694:3: (c= CONJ value= VAR (value= VAR )* )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==CONJ) ) {
					int LA26_1 = input.LA(2);
					if ( (LA26_1==VAR) ) {
						alt26=1;
					}

				}

				switch (alt26) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:694:4: c= CONJ value= VAR (value= VAR )*
					{
					c=(Token)match(input,CONJ,FOLLOW_CONJ_in_rubriqueParam1154); 

									//String conj=c.getText().toUpperCase().equals("ET")?"AND":"OR";
									String conj="OR";
									lepar_arbre.ajouteFils(new Arbre("", conj));	
								
					value=(Token)match(input,VAR,FOLLOW_VAR_in_rubriqueParam1168); 

									lepar_arbre.ajouteFils(new Arbre("", "(tt.rubrique = '"+value.getText()+"'"));	
								
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:704:3: (value= VAR )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==VAR) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:704:4: value= VAR
							{
							value=(Token)match(input,VAR,FOLLOW_VAR_in_rubriqueParam1180); 

											lepar_arbre.ajouteFils(new Arbre("", "OR"));	
											lepar_arbre.ajouteFils(new Arbre("", "tt.rubrique = '"+value.getText()+"'"));	
										
							}
							break;

						default :
							break loop25;
						}
					}


									lepar_arbre.ajouteFils(new Arbre("", ")"));	
								
					}
					break;

				default :
					break loop26;
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
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:718:1: motParam returns [Arbre lepar_arbre = new Arbre(\"\")] : ( MOT )+ value= VAR (value= VAR )* (c= CONJ value= VAR (value= VAR )* )* ;
	public final Arbre motParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;
		Token c=null;

		String str;
		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:719:22: ( ( MOT )+ value= VAR (value= VAR )* (c= CONJ value= VAR (value= VAR )* )* )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:720:3: ( MOT )+ value= VAR (value= VAR )* (c= CONJ value= VAR (value= VAR )* )*
			{
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:720:3: ( MOT )+
			int cnt27=0;
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==MOT) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:720:3: MOT
					{
					match(input,MOT,FOLLOW_MOT_in_motParam1227); 
					}
					break;

				default :
					if ( cnt27 >= 1 ) break loop27;
					EarlyExitException eee = new EarlyExitException(27, input);
					throw eee;
				}
				cnt27++;
			}

			value=(Token)match(input,VAR,FOLLOW_VAR_in_motParam1236); 

							lepar_arbre.ajouteFils(new Arbre("", "("));	
							lepar_arbre.ajouteFils(new Arbre("", "("));	
							lepar_arbre.ajouteFils(new Arbre("", "tt.mot = '"+value.getText()+"'"));	
						
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:727:3: (value= VAR )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==VAR) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:727:4: value= VAR
					{
					value=(Token)match(input,VAR,FOLLOW_VAR_in_motParam1248); 

									lepar_arbre.ajouteFils(new Arbre("", "OR"));	
									lepar_arbre.ajouteFils(new Arbre("", "tt.mot = '"+value.getText()+"'"));	
								
					}
					break;

				default :
					break loop28;
				}
			}


							lepar_arbre.ajouteFils(new Arbre("", ")"));	
						
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:735:3: (c= CONJ value= VAR (value= VAR )* )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==CONJ) ) {
					int LA30_1 = input.LA(2);
					if ( (LA30_1==VAR) ) {
						alt30=1;
					}

				}

				switch (alt30) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:735:4: c= CONJ value= VAR (value= VAR )*
					{
					c=(Token)match(input,CONJ,FOLLOW_CONJ_in_motParam1267); 

									//String conj=c.getText().toUpperCase().equals("ET")?"AND":"OR";
									String conj="OR";
									lepar_arbre.ajouteFils(new Arbre("", conj));	
								
					value=(Token)match(input,VAR,FOLLOW_VAR_in_motParam1281); 

									lepar_arbre.ajouteFils(new Arbre("", "(tt.mot = '"+value.getText()+"'"));	
								
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:745:3: (value= VAR )*
					loop29:
					while (true) {
						int alt29=2;
						int LA29_0 = input.LA(1);
						if ( (LA29_0==VAR) ) {
							alt29=1;
						}

						switch (alt29) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:745:4: value= VAR
							{
							value=(Token)match(input,VAR,FOLLOW_VAR_in_motParam1293); 

											lepar_arbre.ajouteFils(new Arbre("", "OR"));	
											lepar_arbre.ajouteFils(new Arbre("", "tt.mot = '"+value.getText()+"'"));	
										
							}
							break;

						default :
							break loop29;
						}
					}


									lepar_arbre.ajouteFils(new Arbre("", ")"));	
								
					}
					break;

				default :
					break loop30;
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
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:762:1: motEnTitreParam returns [Arbre lepar_arbre = new Arbre(\"\")] : ( ( TITRE ( MOT )+ (value= VAR )+ ) | ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE ) ) ;
	public final Arbre motEnTitreParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;

		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:762:60: ( ( ( TITRE ( MOT )+ (value= VAR )+ ) | ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE ) ) )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:763:3: ( ( TITRE ( MOT )+ (value= VAR )+ ) | ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE ) )
			{
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:763:3: ( ( TITRE ( MOT )+ (value= VAR )+ ) | ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE ) )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==TITRE) ) {
				alt35=1;
			}
			else if ( (LA35_0==MOT) ) {
				alt35=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:763:4: ( TITRE ( MOT )+ (value= VAR )+ )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:763:4: ( TITRE ( MOT )+ (value= VAR )+ )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:763:5: TITRE ( MOT )+ (value= VAR )+
					{
					match(input,TITRE,FOLLOW_TITRE_in_motEnTitreParam1339); 
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:764:3: ( MOT )+
					int cnt31=0;
					loop31:
					while (true) {
						int alt31=2;
						int LA31_0 = input.LA(1);
						if ( (LA31_0==MOT) ) {
							alt31=1;
						}

						switch (alt31) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:764:3: MOT
							{
							match(input,MOT,FOLLOW_MOT_in_motEnTitreParam1343); 
							}
							break;

						default :
							if ( cnt31 >= 1 ) break loop31;
							EarlyExitException eee = new EarlyExitException(31, input);
							throw eee;
						}
						cnt31++;
					}

					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:765:9: (value= VAR )+
					int cnt32=0;
					loop32:
					while (true) {
						int alt32=2;
						int LA32_0 = input.LA(1);
						if ( (LA32_0==VAR) ) {
							alt32=1;
						}

						switch (alt32) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:765:9: value= VAR
							{
							value=(Token)match(input,VAR,FOLLOW_VAR_in_motEnTitreParam1352); 
							}
							break;

						default :
							if ( cnt32 >= 1 ) break loop32;
							EarlyExitException eee = new EarlyExitException(32, input);
							throw eee;
						}
						cnt32++;
					}

					}

					}
					break;
				case 2 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:767:3: ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:767:3: ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:767:4: ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:767:4: ( MOT )+
					int cnt33=0;
					loop33:
					while (true) {
						int alt33=2;
						int LA33_0 = input.LA(1);
						if ( (LA33_0==MOT) ) {
							alt33=1;
						}

						switch (alt33) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:767:4: MOT
							{
							match(input,MOT,FOLLOW_MOT_in_motEnTitreParam1363); 
							}
							break;

						default :
							if ( cnt33 >= 1 ) break loop33;
							EarlyExitException eee = new EarlyExitException(33, input);
							throw eee;
						}
						cnt33++;
					}

					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:768:8: (value= VAR )+
					int cnt34=0;
					loop34:
					while (true) {
						int alt34=2;
						int LA34_0 = input.LA(1);
						if ( (LA34_0==VAR) ) {
							alt34=1;
						}

						switch (alt34) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:768:8: value= VAR
							{
							value=(Token)match(input,VAR,FOLLOW_VAR_in_motEnTitreParam1370); 
							}
							break;

						default :
							if ( cnt34 >= 1 ) break loop34;
							EarlyExitException eee = new EarlyExitException(34, input);
							throw eee;
						}
						cnt34++;
					}

					if ( input.LA(1)==DANS||input.LA(1)==EN ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,TITRE,FOLLOW_TITRE_in_motEnTitreParam1383); 
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


	protected DFA11 dfa11 = new DFA11(this);
	protected DFA12 dfa12 = new DFA12(this);
	static final String DFA11_eotS =
		"\16\uffff";
	static final String DFA11_eofS =
		"\16\uffff";
	static final String DFA11_minS =
		"\1\4\1\uffff\1\23\2\16\6\uffff\2\11\1\uffff";
	static final String DFA11_maxS =
		"\1\34\1\uffff\1\33\2\34\6\uffff\2\33\1\uffff";
	static final String DFA11_acceptS =
		"\1\uffff\1\1\3\uffff\1\2\1\4\1\5\1\6\1\7\1\10\2\uffff\1\3";
	static final String DFA11_specialS =
		"\16\uffff}>";
	static final String[] DFA11_transitionS = {
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
			"\1\15\1\1\4\uffff\1\1\6\uffff\1\15\4\uffff\1\14",
			"\1\15\1\1\4\uffff\1\1\6\uffff\1\15\4\uffff\1\14",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "208:3: (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam |par= numeroParam |par= avantDateParam |par= apresDateParam |par= entreDateParam )";
		}
	}

	static final String DFA12_eotS =
		"\16\uffff";
	static final String DFA12_eofS =
		"\16\uffff";
	static final String DFA12_minS =
		"\1\4\1\uffff\1\23\2\16\6\uffff\2\11\1\uffff";
	static final String DFA12_maxS =
		"\1\34\1\uffff\1\33\2\34\6\uffff\2\33\1\uffff";
	static final String DFA12_acceptS =
		"\1\uffff\1\1\3\uffff\1\2\1\4\1\5\1\6\1\7\1\10\2\uffff\1\3";
	static final String DFA12_specialS =
		"\16\uffff}>";
	static final String[] DFA12_transitionS = {
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
			"\1\15\1\1\4\uffff\1\1\6\uffff\1\15\4\uffff\1\14",
			"\1\15\1\1\4\uffff\1\1\6\uffff\1\15\4\uffff\1\14",
			""
	};

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "228:3: (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam |par= numeroParam |par= avantDateParam |par= apresDateParam |par= entreDateParam )";
		}
	}

	public static final BitSet FOLLOW_requete_in_listerequetes434 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_PONC_in_listerequetes436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete475 = new BitSet(new long[]{0x0000000001B00060L});
	public static final BitSet FOLLOW_ARTICLE_in_requete488 = new BitSet(new long[]{0x0000000016ADCE90L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete500 = new BitSet(new long[]{0x0000000016ADCEB0L});
	public static final BitSet FOLLOW_ARTICLE_in_requete504 = new BitSet(new long[]{0x0000000016ADCE90L});
	public static final BitSet FOLLOW_AUTEUR_in_requete517 = new BitSet(new long[]{0x0000000016ADCEB0L});
	public static final BitSet FOLLOW_ARTICLE_in_requete521 = new BitSet(new long[]{0x0000000016ADCE90L});
	public static final BitSet FOLLOW_NOMBRE_in_requete534 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete538 = new BitSet(new long[]{0x0000000016ADCE90L});
	public static final BitSet FOLLOW_NUMERO_in_requete552 = new BitSet(new long[]{0x0000000016ADCF90L});
	public static final BitSet FOLLOW_BULLETIN_in_requete556 = new BitSet(new long[]{0x0000000016ADCE90L});
	public static final BitSet FOLLOW_CONJ_in_requete572 = new BitSet(new long[]{0x0000000000B00160L});
	public static final BitSet FOLLOW_set_in_requete581 = new BitSet(new long[]{0x0000000016ADCE90L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete602 = new BitSet(new long[]{0x0000000016ADCEB0L});
	public static final BitSet FOLLOW_ARTICLE_in_requete606 = new BitSet(new long[]{0x0000000016ADCE90L});
	public static final BitSet FOLLOW_AUTEUR_in_requete619 = new BitSet(new long[]{0x0000000016ADCEB0L});
	public static final BitSet FOLLOW_ARTICLE_in_requete623 = new BitSet(new long[]{0x0000000016ADCE90L});
	public static final BitSet FOLLOW_NOMBRE_in_requete636 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete640 = new BitSet(new long[]{0x0000000016ADCE90L});
	public static final BitSet FOLLOW_NUMERO_in_requete654 = new BitSet(new long[]{0x0000000016ADCF90L});
	public static final BitSet FOLLOW_BULLETIN_in_requete658 = new BitSet(new long[]{0x0000000016ADCE90L});
	public static final BitSet FOLLOW_params_in_requete680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_motEnTitreParam_in_params712 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_dateParam_in_params721 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_motParam_in_params730 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_rubriqueParam_in_params737 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_numeroParam_in_params744 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_avantDateParam_in_params751 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_apresDateParam_in_params758 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_entreDateParam_in_params765 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_CONJ_in_params786 = new BitSet(new long[]{0x0000000016ADCC90L});
	public static final BitSet FOLLOW_motEnTitreParam_in_params801 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_dateParam_in_params810 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_motParam_in_params819 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_rubriqueParam_in_params826 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_numeroParam_in_params833 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_avantDateParam_in_params840 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_apresDateParam_in_params847 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_entreDateParam_in_params854 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_DATE_in_entreDateParam882 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ENTRE_in_entreDateParam886 = new BitSet(new long[]{0x0000000012044000L});
	public static final BitSet FOLLOW_STR_MOIS_in_entreDateParam889 = new BitSet(new long[]{0x0000000010044000L});
	public static final BitSet FOLLOW_set_in_entreDateParam897 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJ_in_entreDateParam910 = new BitSet(new long[]{0x0000000010044000L});
	public static final BitSet FOLLOW_set_in_entreDateParam917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APRES_in_apresDateParam944 = new BitSet(new long[]{0x0000000012044800L});
	public static final BitSet FOLLOW_DATE_in_apresDateParam948 = new BitSet(new long[]{0x0000000012044000L});
	public static final BitSet FOLLOW_STR_MOIS_in_apresDateParam953 = new BitSet(new long[]{0x0000000010044000L});
	public static final BitSet FOLLOW_set_in_apresDateParam962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_dateParam988 = new BitSet(new long[]{0x000000001204C000L});
	public static final BitSet FOLLOW_EN_in_dateParam992 = new BitSet(new long[]{0x0000000012044000L});
	public static final BitSet FOLLOW_STR_MOIS_in_dateParam996 = new BitSet(new long[]{0x0000000010044000L});
	public static final BitSet FOLLOW_set_in_dateParam1002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AVANT_in_avantDateParam1024 = new BitSet(new long[]{0x0000000012044800L});
	public static final BitSet FOLLOW_DATE_in_avantDateParam1028 = new BitSet(new long[]{0x0000000012044000L});
	public static final BitSet FOLLOW_STR_MOIS_in_avantDateParam1033 = new BitSet(new long[]{0x0000000010044000L});
	public static final BitSet FOLLOW_set_in_avantDateParam1042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERO_in_numeroParam1073 = new BitSet(new long[]{0x0000000000026000L});
	public static final BitSet FOLLOW_set_in_numeroParam1081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RUBRIQUE_in_rubriqueParam1120 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_VAR_in_rubriqueParam1128 = new BitSet(new long[]{0x0000000008000202L});
	public static final BitSet FOLLOW_VAR_in_rubriqueParam1140 = new BitSet(new long[]{0x0000000008000202L});
	public static final BitSet FOLLOW_CONJ_in_rubriqueParam1154 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_VAR_in_rubriqueParam1168 = new BitSet(new long[]{0x0000000008000202L});
	public static final BitSet FOLLOW_VAR_in_rubriqueParam1180 = new BitSet(new long[]{0x0000000008000202L});
	public static final BitSet FOLLOW_MOT_in_motParam1227 = new BitSet(new long[]{0x0000000008080000L});
	public static final BitSet FOLLOW_VAR_in_motParam1236 = new BitSet(new long[]{0x0000000008000202L});
	public static final BitSet FOLLOW_VAR_in_motParam1248 = new BitSet(new long[]{0x0000000008000202L});
	public static final BitSet FOLLOW_CONJ_in_motParam1267 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_VAR_in_motParam1281 = new BitSet(new long[]{0x0000000008000202L});
	public static final BitSet FOLLOW_VAR_in_motParam1293 = new BitSet(new long[]{0x0000000008000202L});
	public static final BitSet FOLLOW_TITRE_in_motEnTitreParam1339 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_MOT_in_motEnTitreParam1343 = new BitSet(new long[]{0x0000000008080000L});
	public static final BitSet FOLLOW_VAR_in_motEnTitreParam1352 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_MOT_in_motEnTitreParam1363 = new BitSet(new long[]{0x0000000008080000L});
	public static final BitSet FOLLOW_VAR_in_motEnTitreParam1370 = new BitSet(new long[]{0x0000000008008400L});
	public static final BitSet FOLLOW_set_in_motEnTitreParam1375 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_TITRE_in_motEnTitreParam1383 = new BitSet(new long[]{0x0000000000000002L});
}
