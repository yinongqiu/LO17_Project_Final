// $ANTLR 3.5.1 /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g 2020-01-14 02:16:00
package GenerationSQL;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public tal_sqlLexer() {} 
	public tal_sqlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:3:8: ( 'vouloir' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:3:10: 'vouloir'
			{
			match("vouloir"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "ARTICLE"
	public final void mARTICLE() throws RecognitionException {
		try {
			int _type = ARTICLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:6:9: ( 'article' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:6:11: 'article'
			{
			match("article"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARTICLE"

	// $ANTLR start "BULLETIN"
	public final void mBULLETIN() throws RecognitionException {
		try {
			int _type = BULLETIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:9:10: ( 'bulletin' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:9:12: 'bulletin'
			{
			match("bulletin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BULLETIN"

	// $ANTLR start "AVANT"
	public final void mAVANT() throws RecognitionException {
		try {
			int _type = AVANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:12:7: ( 'avant' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:12:9: 'avant'
			{
			match("avant"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AVANT"

	// $ANTLR start "APRES"
	public final void mAPRES() throws RecognitionException {
		try {
			int _type = APRES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:15:7: ( 'après' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:15:9: 'après'
			{
			match("après"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "APRES"

	// $ANTLR start "ENTRE"
	public final void mENTRE() throws RecognitionException {
		try {
			int _type = ENTRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:18:7: ( 'entre' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:18:9: 'entre'
			{
			match("entre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENTRE"

	// $ANTLR start "AUTEUR"
	public final void mAUTEUR() throws RecognitionException {
		try {
			int _type = AUTEUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:21:8: ( 'auteur' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:21:10: 'auteur'
			{
			match("auteur"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AUTEUR"

	// $ANTLR start "TITRE"
	public final void mTITRE() throws RecognitionException {
		try {
			int _type = TITRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:24:7: ( 'titre' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:24:9: 'titre'
			{
			match("titre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TITRE"

	// $ANTLR start "RUBRIQUE"
	public final void mRUBRIQUE() throws RecognitionException {
		try {
			int _type = RUBRIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:27:10: ( 'rubrique' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:27:12: 'rubrique'
			{
			match("rubrique"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RUBRIQUE"

	// $ANTLR start "NOMBRE"
	public final void mNOMBRE() throws RecognitionException {
		try {
			int _type = NOMBRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:30:8: ( 'nombre' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:30:9: 'nombre'
			{
			match("nombre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOMBRE"

	// $ANTLR start "STR_MOIS"
	public final void mSTR_MOIS() throws RecognitionException {
		try {
			int _type = STR_MOIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:33:10: ( 'mois' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:33:12: 'mois'
			{
			match("mois"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STR_MOIS"

	// $ANTLR start "MOT"
	public final void mMOT() throws RecognitionException {
		try {
			int _type = MOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:37:5: ( 'mot' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:37:7: 'mot'
			{
			match("mot"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOT"

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:40:6: ( 'date' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:40:8: 'date'
			{
			match("date"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE"

	// $ANTLR start "NUMERO"
	public final void mNUMERO() throws RecognitionException {
		try {
			int _type = NUMERO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:43:8: ( 'numéro' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:43:9: 'numéro'
			{
			match("numéro"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMERO"

	// $ANTLR start "MONTH"
	public final void mMONTH() throws RecognitionException {
		try {
			int _type = MONTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:47:7: ( ( 'janvier' | 'février' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'août' | 'septembre' | 'octobre' | 'novembre' | 'décembre' ) ( ' ' )? )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:47:9: ( 'janvier' | 'février' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'août' | 'septembre' | 'octobre' | 'novembre' | 'décembre' ) ( ' ' )?
			{
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:47:9: ( 'janvier' | 'février' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'août' | 'septembre' | 'octobre' | 'novembre' | 'décembre' )
			int alt1=12;
			switch ( input.LA(1) ) {
			case 'j':
				{
				int LA1_1 = input.LA(2);
				if ( (LA1_1=='a') ) {
					alt1=1;
				}
				else if ( (LA1_1=='u') ) {
					int LA1_10 = input.LA(3);
					if ( (LA1_10=='i') ) {
						int LA1_14 = input.LA(4);
						if ( (LA1_14=='n') ) {
							alt1=6;
						}
						else if ( (LA1_14=='l') ) {
							alt1=7;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 14, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'f':
				{
				alt1=2;
				}
				break;
			case 'm':
				{
				int LA1_3 = input.LA(2);
				if ( (LA1_3=='a') ) {
					int LA1_11 = input.LA(3);
					if ( (LA1_11=='r') ) {
						alt1=3;
					}
					else if ( (LA1_11=='i') ) {
						alt1=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'a':
				{
				int LA1_4 = input.LA(2);
				if ( (LA1_4=='v') ) {
					alt1=4;
				}
				else if ( (LA1_4=='o') ) {
					alt1=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 's':
				{
				alt1=9;
				}
				break;
			case 'o':
				{
				alt1=10;
				}
				break;
			case 'n':
				{
				alt1=11;
				}
				break;
			case 'd':
				{
				alt1=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:47:10: 'janvier'
					{
					match("janvier"); 

					}
					break;
				case 2 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:47:20: 'février'
					{
					match("février"); 

					}
					break;
				case 3 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:47:30: 'mars'
					{
					match("mars"); 

					}
					break;
				case 4 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:47:37: 'avril'
					{
					match("avril"); 

					}
					break;
				case 5 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:47:45: 'mai'
					{
					match("mai"); 

					}
					break;
				case 6 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:47:51: 'juin'
					{
					match("juin"); 

					}
					break;
				case 7 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:47:58: 'juillet'
					{
					match("juillet"); 

					}
					break;
				case 8 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:47:68: 'août'
					{
					match("août"); 

					}
					break;
				case 9 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:47:75: 'septembre'
					{
					match("septembre"); 

					}
					break;
				case 10 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:47:87: 'octobre'
					{
					match("octobre"); 

					}
					break;
				case 11 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:47:97: 'novembre'
					{
					match("novembre"); 

					}
					break;
				case 12 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:47:108: 'décembre'
					{
					match("décembre"); 

					}
					break;

			}

			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:47:119: ( ' ' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==' ') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:47:120: ' '
					{
					match(' '); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MONTH"

	// $ANTLR start "DIGIT4"
	public final void mDIGIT4() throws RecognitionException {
		try {
			int _type = DIGIT4;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:51:8: ( DIGIT DIGIT DIGIT DIGIT )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:51:10: DIGIT DIGIT DIGIT DIGIT
			{
			mDIGIT(); 

			mDIGIT(); 

			mDIGIT(); 

			mDIGIT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT4"

	// $ANTLR start "DIGIT2"
	public final void mDIGIT2() throws RecognitionException {
		try {
			int _type = DIGIT2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:54:8: ( DIGIT DIGIT )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:54:10: DIGIT DIGIT
			{
			mDIGIT(); 

			mDIGIT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT2"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:57:5: ( ( DIGIT )+ )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:57:7: ( DIGIT )+
			{
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:57:7: ( DIGIT )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "VAR_DATE"
	public final void mVAR_DATE() throws RecognitionException {
		try {
			int _type = VAR_DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:61:10: ( ( ( DIGIT2 | DIGIT ) '/' DIGIT2 '/' DIGIT4 | ( DIGIT2 | DIGIT ) '/' DIGIT4 | ( DIGIT2 | DIGIT ) '/' DIGIT2 | ( DIGIT2 | DIGIT ) ' ' MONTH DIGIT4 | MONTH DIGIT4 | ( DIGIT2 | DIGIT ) ' ' MONTH ) )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:61:13: ( ( DIGIT2 | DIGIT ) '/' DIGIT2 '/' DIGIT4 | ( DIGIT2 | DIGIT ) '/' DIGIT4 | ( DIGIT2 | DIGIT ) '/' DIGIT2 | ( DIGIT2 | DIGIT ) ' ' MONTH DIGIT4 | MONTH DIGIT4 | ( DIGIT2 | DIGIT ) ' ' MONTH )
			{
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:61:13: ( ( DIGIT2 | DIGIT ) '/' DIGIT2 '/' DIGIT4 | ( DIGIT2 | DIGIT ) '/' DIGIT4 | ( DIGIT2 | DIGIT ) '/' DIGIT2 | ( DIGIT2 | DIGIT ) ' ' MONTH DIGIT4 | MONTH DIGIT4 | ( DIGIT2 | DIGIT ) ' ' MONTH )
			int alt9=6;
			alt9 = dfa9.predict(input);
			switch (alt9) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:61:14: ( DIGIT2 | DIGIT ) '/' DIGIT2 '/' DIGIT4
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:61:14: ( DIGIT2 | DIGIT )
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
						int LA4_1 = input.LA(2);
						if ( ((LA4_1 >= '0' && LA4_1 <= '9')) ) {
							alt4=1;
						}
						else if ( (LA4_1=='/') ) {
							alt4=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 4, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}

					switch (alt4) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:61:15: DIGIT2
							{
							mDIGIT2(); 

							}
							break;
						case 2 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:61:22: DIGIT
							{
							mDIGIT(); 

							}
							break;

					}

					match('/'); 
					mDIGIT2(); 

					match('/'); 
					mDIGIT4(); 

					}
					break;
				case 2 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:61:49: ( DIGIT2 | DIGIT ) '/' DIGIT4
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:61:49: ( DIGIT2 | DIGIT )
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
						int LA5_1 = input.LA(2);
						if ( ((LA5_1 >= '0' && LA5_1 <= '9')) ) {
							alt5=1;
						}
						else if ( (LA5_1=='/') ) {
							alt5=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 5, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}

					switch (alt5) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:61:50: DIGIT2
							{
							mDIGIT2(); 

							}
							break;
						case 2 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:61:57: DIGIT
							{
							mDIGIT(); 

							}
							break;

					}

					match('/'); 
					mDIGIT4(); 

					}
					break;
				case 3 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:61:75: ( DIGIT2 | DIGIT ) '/' DIGIT2
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:61:75: ( DIGIT2 | DIGIT )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
						int LA6_1 = input.LA(2);
						if ( ((LA6_1 >= '0' && LA6_1 <= '9')) ) {
							alt6=1;
						}
						else if ( (LA6_1=='/') ) {
							alt6=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 6, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:61:76: DIGIT2
							{
							mDIGIT2(); 

							}
							break;
						case 2 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:61:83: DIGIT
							{
							mDIGIT(); 

							}
							break;

					}

					match('/'); 
					mDIGIT2(); 

					}
					break;
				case 4 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:61:100: ( DIGIT2 | DIGIT ) ' ' MONTH DIGIT4
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:61:100: ( DIGIT2 | DIGIT )
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
						int LA7_1 = input.LA(2);
						if ( ((LA7_1 >= '0' && LA7_1 <= '9')) ) {
							alt7=1;
						}
						else if ( (LA7_1==' ') ) {
							alt7=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 7, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}

					switch (alt7) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:61:101: DIGIT2
							{
							mDIGIT2(); 

							}
							break;
						case 2 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:61:108: DIGIT
							{
							mDIGIT(); 

							}
							break;

					}

					match(' '); 
					mMONTH(); 

					mDIGIT4(); 

					}
					break;
				case 5 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:61:132: MONTH DIGIT4
					{
					mMONTH(); 

					mDIGIT4(); 

					}
					break;
				case 6 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:61:147: ( DIGIT2 | DIGIT ) ' ' MONTH
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:61:147: ( DIGIT2 | DIGIT )
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
						int LA8_1 = input.LA(2);
						if ( ((LA8_1 >= '0' && LA8_1 <= '9')) ) {
							alt8=1;
						}
						else if ( (LA8_1==' ') ) {
							alt8=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 8, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}

					switch (alt8) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:61:148: DIGIT2
							{
							mDIGIT2(); 

							}
							break;
						case 2 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:61:155: DIGIT
							{
							mDIGIT(); 

							}
							break;

					}

					match(' '); 
					mMONTH(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR_DATE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:66:5: ( ( '\\t' | '\\r' | 'je' | 'qui' | 'dont' | '\\n' | ' ' ) )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:66:7: ( '\\t' | '\\r' | 'je' | 'qui' | 'dont' | '\\n' | ' ' )
			{
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:66:7: ( '\\t' | '\\r' | 'je' | 'qui' | 'dont' | '\\n' | ' ' )
			int alt10=7;
			switch ( input.LA(1) ) {
			case '\t':
				{
				alt10=1;
				}
				break;
			case '\r':
				{
				alt10=2;
				}
				break;
			case 'j':
				{
				alt10=3;
				}
				break;
			case 'q':
				{
				alt10=4;
				}
				break;
			case 'd':
				{
				alt10=5;
				}
				break;
			case '\n':
				{
				alt10=6;
				}
				break;
			case ' ':
				{
				alt10=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:66:8: '\\t'
					{
					match('\t'); 
					}
					break;
				case 2 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:66:15: '\\r'
					{
					match('\r'); 
					}
					break;
				case 3 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:66:22: 'je'
					{
					match("je"); 

					}
					break;
				case 4 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:66:29: 'qui'
					{
					match("qui"); 

					}
					break;
				case 5 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:66:37: 'dont'
					{
					match("dont"); 

					}
					break;
				case 6 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:66:45: '\\n'
					{
					match('\n'); 
					}
					break;
				case 7 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:66:52: ' '
					{
					match(' '); 
					}
					break;

			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "CONJ"
	public final void mCONJ() throws RecognitionException {
		try {
			int _type = CONJ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:70:6: ( 'et' | 'ou' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='e') ) {
				alt11=1;
			}
			else if ( (LA11_0=='o') ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:70:8: 'et'
					{
					match("et"); 

					}
					break;
				case 2 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:70:15: 'ou'
					{
					match("ou"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONJ"

	// $ANTLR start "EN"
	public final void mEN() throws RecognitionException {
		try {
			int _type = EN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:73:4: ( 'en' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:73:6: 'en'
			{
			match("en"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EN"

	// $ANTLR start "DANS"
	public final void mDANS() throws RecognitionException {
		try {
			int _type = DANS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:76:6: ( 'dans' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:76:7: 'dans'
			{
			match("dans"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DANS"

	// $ANTLR start "PONC"
	public final void mPONC() throws RecognitionException {
		try {
			int _type = PONC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:79:6: ( '.' | '?' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:
			{
			if ( input.LA(1)=='.'||input.LA(1)=='?' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PONC"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:85:5: ( ( 'a' .. 'z' | 'é' | 'è' | 'ê' | 'û' | 'ù' | 'î' | 'ï' )+ )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:85:7: ( 'a' .. 'z' | 'é' | 'è' | 'ê' | 'û' | 'ù' | 'î' | 'ï' )+
			{
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:85:7: ( 'a' .. 'z' | 'é' | 'è' | 'ê' | 'û' | 'ù' | 'î' | 'ï' )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= 'a' && LA12_0 <= 'z')||(LA12_0 >= '\u00E8' && LA12_0 <= '\u00EA')||(LA12_0 >= '\u00EE' && LA12_0 <= '\u00EF')||LA12_0=='\u00F9'||LA12_0=='\u00FB') ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00E8' && input.LA(1) <= '\u00EA')||(input.LA(1) >= '\u00EE' && input.LA(1) <= '\u00EF')||input.LA(1)=='\u00F9'||input.LA(1)=='\u00FB' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:88:17: ( ( '0' .. '9' ) )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:1:8: ( SELECT | ARTICLE | BULLETIN | AVANT | APRES | ENTRE | AUTEUR | TITRE | RUBRIQUE | NOMBRE | STR_MOIS | MOT | DATE | NUMERO | MONTH | DIGIT4 | DIGIT2 | INT | VAR_DATE | WS | CONJ | EN | DANS | PONC | VAR )
		int alt13=25;
		alt13 = dfa13.predict(input);
		switch (alt13) {
			case 1 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:1:17: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 3 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:1:25: BULLETIN
				{
				mBULLETIN(); 

				}
				break;
			case 4 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:1:34: AVANT
				{
				mAVANT(); 

				}
				break;
			case 5 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:1:40: APRES
				{
				mAPRES(); 

				}
				break;
			case 6 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:1:46: ENTRE
				{
				mENTRE(); 

				}
				break;
			case 7 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:1:52: AUTEUR
				{
				mAUTEUR(); 

				}
				break;
			case 8 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:1:59: TITRE
				{
				mTITRE(); 

				}
				break;
			case 9 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:1:65: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 10 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:1:74: NOMBRE
				{
				mNOMBRE(); 

				}
				break;
			case 11 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:1:81: STR_MOIS
				{
				mSTR_MOIS(); 

				}
				break;
			case 12 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:1:90: MOT
				{
				mMOT(); 

				}
				break;
			case 13 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:1:94: DATE
				{
				mDATE(); 

				}
				break;
			case 14 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:1:99: NUMERO
				{
				mNUMERO(); 

				}
				break;
			case 15 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:1:106: MONTH
				{
				mMONTH(); 

				}
				break;
			case 16 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:1:112: DIGIT4
				{
				mDIGIT4(); 

				}
				break;
			case 17 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:1:119: DIGIT2
				{
				mDIGIT2(); 

				}
				break;
			case 18 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:1:126: INT
				{
				mINT(); 

				}
				break;
			case 19 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:1:130: VAR_DATE
				{
				mVAR_DATE(); 

				}
				break;
			case 20 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:1:139: WS
				{
				mWS(); 

				}
				break;
			case 21 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:1:142: CONJ
				{
				mCONJ(); 

				}
				break;
			case 22 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:1:147: EN
				{
				mEN(); 

				}
				break;
			case 23 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:1:150: DANS
				{
				mDANS(); 

				}
				break;
			case 24 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:1:155: PONC
				{
				mPONC(); 

				}
				break;
			case 25 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17-TomcatServer/src/files/TDAntlr/tal_sql.g:1:160: VAR
				{
				mVAR(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	protected DFA13 dfa13 = new DFA13(this);
	static final String DFA9_eotS =
		"\17\uffff\1\32\21\uffff\1\56\7\uffff\1\56\2\uffff\2\56\3\uffff\1\56\7"+
		"\uffff\1\56\13\uffff\3\56\1\uffff\1\56\3\uffff\3\56";
	static final String DFA9_eofS =
		"\120\uffff";
	static final String DFA9_minS =
		"\1\60\1\40\1\uffff\1\40\1\60\1\141\1\60\1\141\1\u00e9\1\141\1\157\1\145"+
		"\1\143\1\157\1\u00e9\1\57\1\156\1\151\1\166\1\151\1\162\1\u00fb\1\160"+
		"\1\164\1\166\1\143\3\uffff\1\166\1\154\1\162\1\163\1\40\1\151\2\164\1"+
		"\157\2\145\1\151\1\40\1\154\1\151\1\40\1\60\2\uffff\1\154\1\40\1\145\1"+
		"\142\2\155\3\145\1\40\1\155\1\162\2\142\1\162\1\164\1\162\1\142\1\145"+
		"\2\162\3\40\1\162\1\40\3\145\3\40";
	static final String DFA9_maxS =
		"\1\163\1\71\1\uffff\1\57\1\71\1\163\1\71\1\165\1\u00e9\1\141\1\166\1\145"+
		"\1\143\1\157\1\u00e9\1\71\1\156\1\151\1\166\2\162\1\u00fb\1\160\1\164"+
		"\1\166\1\143\3\uffff\1\166\1\156\1\162\1\163\1\71\1\151\2\164\1\157\2"+
		"\145\1\151\1\71\1\154\1\151\2\71\2\uffff\1\154\1\71\1\145\1\142\2\155"+
		"\3\145\1\71\1\155\1\162\2\142\1\162\1\164\1\162\1\142\1\145\2\162\3\71"+
		"\1\162\1\71\3\145\3\71";
	static final String DFA9_acceptS =
		"\2\uffff\1\5\27\uffff\1\3\1\1\1\2\21\uffff\1\6\1\4\40\uffff";
	static final String DFA9_specialS =
		"\120\uffff}>";
	static final String[] DFA9_transitionS = {
			"\12\1\47\uffff\1\2\2\uffff\1\2\1\uffff\1\2\3\uffff\1\2\2\uffff\3\2\3"+
			"\uffff\1\2",
			"\1\5\16\uffff\1\4\12\3",
			"",
			"\1\5\16\uffff\1\4",
			"\12\6",
			"\1\12\2\uffff\1\16\1\uffff\1\10\3\uffff\1\7\2\uffff\1\11\1\15\1\14\3"+
			"\uffff\1\13",
			"\12\17",
			"\1\20\23\uffff\1\21",
			"\1\22",
			"\1\23",
			"\1\25\6\uffff\1\24",
			"\1\26",
			"\1\27",
			"\1\30",
			"\1\31",
			"\1\33\12\34",
			"\1\35",
			"\1\36",
			"\1\37",
			"\1\41\10\uffff\1\40",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"",
			"",
			"",
			"\1\50",
			"\1\52\1\uffff\1\51",
			"\1\53",
			"\1\54",
			"\1\55\17\uffff\12\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\55\17\uffff\12\57",
			"\1\67",
			"\1\70",
			"\1\55\17\uffff\12\57",
			"\12\57",
			"",
			"",
			"\1\71",
			"\1\55\17\uffff\12\57",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\55\17\uffff\12\57",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\55\17\uffff\12\57",
			"\1\55\17\uffff\12\57",
			"\1\55\17\uffff\12\57",
			"\1\114",
			"\1\55\17\uffff\12\57",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\55\17\uffff\12\57",
			"\1\55\17\uffff\12\57",
			"\1\55\17\uffff\12\57"
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
			return "61:13: ( ( DIGIT2 | DIGIT ) '/' DIGIT2 '/' DIGIT4 | ( DIGIT2 | DIGIT ) '/' DIGIT4 | ( DIGIT2 | DIGIT ) '/' DIGIT2 | ( DIGIT2 | DIGIT ) ' ' MONTH DIGIT4 | MONTH DIGIT4 | ( DIGIT2 | DIGIT ) ' ' MONTH )";
		}
	}

	static final String DFA13_eotS =
		"\1\uffff\15\22\1\54\1\uffff\1\22\2\uffff\7\22\1\71\1\72\13\22\1\17\3\22"+
		"\1\72\1\uffff\1\115\1\uffff\12\22\2\uffff\6\22\1\137\1\22\1\142\11\22"+
		"\1\uffff\1\54\1\17\6\22\1\142\7\22\1\173\1\uffff\2\142\1\uffff\1\174\1"+
		"\175\1\22\1\17\1\22\1\142\4\22\1\u0084\2\22\1\u0087\1\142\1\u0088\2\22"+
		"\1\u008b\1\u008c\4\22\3\uffff\6\22\1\uffff\2\22\2\uffff\1\u0099\1\22\2"+
		"\uffff\1\22\1\u009c\1\22\1\u009e\6\22\1\u00a5\1\u00a6\1\uffff\2\22\1\uffff"+
		"\1\22\1\uffff\1\22\3\142\1\22\1\142\2\uffff\1\u00ac\1\u00ad\2\142\1\22"+
		"\2\uffff\1\142";
	static final String DFA13_eofS =
		"\u00af\uffff";
	static final String DFA13_minS =
		"\1\11\2\157\1\165\1\156\1\151\1\165\1\157\3\141\1\u00e9\1\145\1\143\1"+
		"\40\1\uffff\1\165\2\uffff\1\165\1\164\1\141\1\162\1\164\1\u00fb\1\154"+
		"\2\141\1\164\1\142\2\155\2\151\1\156\1\143\2\156\1\151\1\141\1\166\1\160"+
		"\1\164\1\141\1\uffff\1\40\1\uffff\1\151\1\154\1\151\1\156\1\151\1\u00e8"+
		"\1\145\1\164\1\154\1\162\2\uffff\2\162\1\142\1\145\1\u00e9\1\163\1\141"+
		"\1\163\1\40\1\145\1\163\1\145\1\164\1\166\1\154\1\162\1\164\1\157\1\uffff"+
		"\1\60\1\141\1\157\1\143\1\164\1\154\1\163\1\165\1\40\3\145\1\151\1\162"+
		"\1\155\1\162\1\141\1\uffff\1\40\1\60\1\uffff\2\141\1\155\1\141\1\151\1"+
		"\40\1\154\1\151\1\145\1\142\1\60\1\151\1\154\1\141\1\40\1\141\1\162\1"+
		"\164\2\141\1\161\1\145\1\142\1\157\3\uffff\1\142\3\145\1\155\1\162\1\uffff"+
		"\1\162\1\145\2\uffff\1\141\1\151\2\uffff\1\165\1\141\1\162\1\141\2\162"+
		"\1\164\1\162\1\142\1\145\2\141\1\uffff\1\156\1\145\1\uffff\1\145\1\uffff"+
		"\1\145\3\40\1\162\1\40\2\uffff\2\141\2\40\1\145\2\uffff\1\40";
	static final String DFA13_maxS =
		"\1\u00fb\1\157\1\166\1\165\1\164\1\151\2\165\1\157\1\u00e9\1\165\1\u00e9"+
		"\1\145\1\165\1\71\1\uffff\1\165\2\uffff\1\165\1\164\2\162\1\164\1\u00fb"+
		"\1\154\2\u00fb\1\164\1\142\1\166\1\155\1\164\1\162\1\164\1\143\2\156\1"+
		"\151\1\u00fb\1\166\1\160\1\164\1\u00fb\1\uffff\1\71\1\uffff\1\151\1\154"+
		"\1\151\1\156\1\151\1\u00e8\1\145\1\164\1\154\1\162\2\uffff\2\162\1\142"+
		"\1\145\1\u00e9\1\163\1\u00fb\1\163\1\u00fb\1\145\1\163\1\145\1\164\1\166"+
		"\1\156\1\162\1\164\1\157\1\uffff\1\71\1\u00fb\1\157\1\143\1\164\1\154"+
		"\1\163\1\165\1\u00fb\3\145\1\151\1\162\1\155\1\162\1\u00fb\1\uffff\1\u00fb"+
		"\1\71\1\uffff\2\u00fb\1\155\1\u00fb\1\151\1\u00fb\1\154\1\151\1\145\1"+
		"\142\1\71\1\151\1\154\3\u00fb\1\162\1\164\2\u00fb\1\161\1\145\1\142\1"+
		"\157\3\uffff\1\142\3\145\1\155\1\162\1\uffff\1\162\1\145\2\uffff\1\u00fb"+
		"\1\151\2\uffff\1\165\1\u00fb\1\162\1\u00fb\2\162\1\164\1\162\1\142\1\145"+
		"\2\u00fb\1\uffff\1\156\1\145\1\uffff\1\145\1\uffff\1\145\3\u00fb\1\162"+
		"\1\u00fb\2\uffff\4\u00fb\1\145\2\uffff\1\u00fb";
	static final String DFA13_acceptS =
		"\17\uffff\1\24\1\uffff\1\30\1\31\31\uffff\1\22\1\uffff\1\23\12\uffff\1"+
		"\26\1\25\22\uffff\1\21\21\uffff\1\14\2\uffff\1\17\30\uffff\1\13\1\15\1"+
		"\27\6\uffff\1\20\2\uffff\1\4\1\5\2\uffff\1\6\1\10\14\uffff\1\7\2\uffff"+
		"\1\12\1\uffff\1\16\6\uffff\1\1\1\2\5\uffff\1\3\1\11\1\uffff";
	static final String DFA13_specialS =
		"\u00af\uffff}>";
	static final String[] DFA13_transitionS = {
			"\2\17\2\uffff\1\17\22\uffff\1\17\15\uffff\1\21\1\uffff\12\16\5\uffff"+
			"\1\21\41\uffff\1\2\1\3\1\22\1\11\1\4\1\13\3\22\1\12\2\22\1\10\1\7\1\15"+
			"\1\22\1\20\1\6\1\14\1\5\1\22\1\1\4\22\155\uffff\3\22\3\uffff\2\22\11"+
			"\uffff\1\22\1\uffff\1\22",
			"\1\23",
			"\1\30\1\26\1\uffff\1\24\2\uffff\1\27\1\25",
			"\1\31",
			"\1\32\5\uffff\1\33",
			"\1\34",
			"\1\35",
			"\1\36\5\uffff\1\37",
			"\1\41\15\uffff\1\40",
			"\1\42\15\uffff\1\44\171\uffff\1\43",
			"\1\45\3\uffff\1\47\17\uffff\1\46",
			"\1\50",
			"\1\51",
			"\1\52\21\uffff\1\53",
			"\1\56\16\uffff\1\56\12\55",
			"",
			"\1\57",
			"",
			"",
			"\1\60",
			"\1\61",
			"\1\62\20\uffff\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\23\22\1\70\6\22\155\uffff\3\22\3\uffff\2\22\11\uffff\1\22\1\uffff\1"+
			"\22",
			"\32\22\155\uffff\3\22\3\uffff\2\22\11\uffff\1\22\1\uffff\1\22",
			"\1\73",
			"\1\74",
			"\1\75\10\uffff\1\76",
			"\1\77",
			"\1\100\12\uffff\1\101",
			"\1\103\10\uffff\1\102",
			"\1\105\5\uffff\1\104",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\32\22\155\uffff\3\22\3\uffff\2\22\11\uffff\1\22\1\uffff\1\22",
			"\1\112",
			"\1\113",
			"\1\114",
			"\32\22\155\uffff\3\22\3\uffff\2\22\11\uffff\1\22\1\uffff\1\22",
			"",
			"\1\56\16\uffff\1\56\12\116",
			"",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"",
			"",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\32\22\155\uffff\3\22\3\uffff\2\22\11\uffff\1\22\1\uffff\1\22",
			"\1\140",
			"\1\141\17\uffff\12\56\47\uffff\32\22\155\uffff\3\22\3\uffff\2\22\11"+
			"\uffff\1\22\1\uffff\1\22",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\151\1\uffff\1\150",
			"\1\152",
			"\1\153",
			"\1\154",
			"",
			"\12\155",
			"\32\22\155\uffff\3\22\3\uffff\2\22\11\uffff\1\22\1\uffff\1\22",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\141\17\uffff\12\56\47\uffff\32\22\155\uffff\3\22\3\uffff\2\22\11"+
			"\uffff\1\22\1\uffff\1\22",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"\32\22\155\uffff\3\22\3\uffff\2\22\11\uffff\1\22\1\uffff\1\22",
			"",
			"\1\141\17\uffff\12\56\47\uffff\32\22\155\uffff\3\22\3\uffff\2\22\11"+
			"\uffff\1\22\1\uffff\1\22",
			"\12\56",
			"",
			"\32\22\155\uffff\3\22\3\uffff\2\22\11\uffff\1\22\1\uffff\1\22",
			"\32\22\155\uffff\3\22\3\uffff\2\22\11\uffff\1\22\1\uffff\1\22",
			"\1\176",
			"\32\22\155\uffff\3\22\3\uffff\2\22\11\uffff\1\22\1\uffff\1\22",
			"\1\177",
			"\1\141\17\uffff\12\56\47\uffff\32\22\155\uffff\3\22\3\uffff\2\22\11"+
			"\uffff\1\22\1\uffff\1\22",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\12\54",
			"\1\u0085",
			"\1\u0086",
			"\32\22\155\uffff\3\22\3\uffff\2\22\11\uffff\1\22\1\uffff\1\22",
			"\1\141\17\uffff\12\56\47\uffff\32\22\155\uffff\3\22\3\uffff\2\22\11"+
			"\uffff\1\22\1\uffff\1\22",
			"\32\22\155\uffff\3\22\3\uffff\2\22\11\uffff\1\22\1\uffff\1\22",
			"\1\u0089",
			"\1\u008a",
			"\32\22\155\uffff\3\22\3\uffff\2\22\11\uffff\1\22\1\uffff\1\22",
			"\32\22\155\uffff\3\22\3\uffff\2\22\11\uffff\1\22\1\uffff\1\22",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"",
			"",
			"",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"",
			"\1\u0097",
			"\1\u0098",
			"",
			"",
			"\32\22\155\uffff\3\22\3\uffff\2\22\11\uffff\1\22\1\uffff\1\22",
			"\1\u009a",
			"",
			"",
			"\1\u009b",
			"\32\22\155\uffff\3\22\3\uffff\2\22\11\uffff\1\22\1\uffff\1\22",
			"\1\u009d",
			"\32\22\155\uffff\3\22\3\uffff\2\22\11\uffff\1\22\1\uffff\1\22",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\32\22\155\uffff\3\22\3\uffff\2\22\11\uffff\1\22\1\uffff\1\22",
			"\32\22\155\uffff\3\22\3\uffff\2\22\11\uffff\1\22\1\uffff\1\22",
			"",
			"\1\u00a7",
			"\1\u00a8",
			"",
			"\1\u00a9",
			"",
			"\1\u00aa",
			"\1\141\17\uffff\12\56\47\uffff\32\22\155\uffff\3\22\3\uffff\2\22\11"+
			"\uffff\1\22\1\uffff\1\22",
			"\1\141\17\uffff\12\56\47\uffff\32\22\155\uffff\3\22\3\uffff\2\22\11"+
			"\uffff\1\22\1\uffff\1\22",
			"\1\141\17\uffff\12\56\47\uffff\32\22\155\uffff\3\22\3\uffff\2\22\11"+
			"\uffff\1\22\1\uffff\1\22",
			"\1\u00ab",
			"\1\141\17\uffff\12\56\47\uffff\32\22\155\uffff\3\22\3\uffff\2\22\11"+
			"\uffff\1\22\1\uffff\1\22",
			"",
			"",
			"\32\22\155\uffff\3\22\3\uffff\2\22\11\uffff\1\22\1\uffff\1\22",
			"\32\22\155\uffff\3\22\3\uffff\2\22\11\uffff\1\22\1\uffff\1\22",
			"\1\141\17\uffff\12\56\47\uffff\32\22\155\uffff\3\22\3\uffff\2\22\11"+
			"\uffff\1\22\1\uffff\1\22",
			"\1\141\17\uffff\12\56\47\uffff\32\22\155\uffff\3\22\3\uffff\2\22\11"+
			"\uffff\1\22\1\uffff\1\22",
			"\1\u00ae",
			"",
			"",
			"\1\141\17\uffff\12\56\47\uffff\32\22\155\uffff\3\22\3\uffff\2\22\11"+
			"\uffff\1\22\1\uffff\1\22"
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | ARTICLE | BULLETIN | AVANT | APRES | ENTRE | AUTEUR | TITRE | RUBRIQUE | NOMBRE | STR_MOIS | MOT | DATE | NUMERO | MONTH | DIGIT4 | DIGIT2 | INT | VAR_DATE | WS | CONJ | EN | DANS | PONC | VAR );";
		}
	}

}
