package fr.n7.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.n7.services.Algorithme_xtextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlgorithme_xtextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'algorithme'", "'{'", "'}'", "'Ressources :'", "'/'", "'.'", "'commentaire'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalAlgorithme_xtextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAlgorithme_xtextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAlgorithme_xtextParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAlgorithme_xtext.g"; }



     	private Algorithme_xtextGrammarAccess grammarAccess;

        public InternalAlgorithme_xtextParser(TokenStream input, Algorithme_xtextGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Algorithme";
       	}

       	@Override
       	protected Algorithme_xtextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAlgorithme"
    // InternalAlgorithme_xtext.g:64:1: entryRuleAlgorithme returns [EObject current=null] : iv_ruleAlgorithme= ruleAlgorithme EOF ;
    public final EObject entryRuleAlgorithme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithme = null;


        try {
            // InternalAlgorithme_xtext.g:64:51: (iv_ruleAlgorithme= ruleAlgorithme EOF )
            // InternalAlgorithme_xtext.g:65:2: iv_ruleAlgorithme= ruleAlgorithme EOF
            {
             newCompositeNode(grammarAccess.getAlgorithmeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlgorithme=ruleAlgorithme();

            state._fsp--;

             current =iv_ruleAlgorithme; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlgorithme"


    // $ANTLR start "ruleAlgorithme"
    // InternalAlgorithme_xtext.g:71:1: ruleAlgorithme returns [EObject current=null] : (otherlv_0= 'algorithme' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_algorithmeElements_3_0= ruleAlgorithmeElements ) )* otherlv_4= '}' ) ;
    public final EObject ruleAlgorithme() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nom_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_algorithmeElements_3_0 = null;



        	enterRule();

        try {
            // InternalAlgorithme_xtext.g:77:2: ( (otherlv_0= 'algorithme' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_algorithmeElements_3_0= ruleAlgorithmeElements ) )* otherlv_4= '}' ) )
            // InternalAlgorithme_xtext.g:78:2: (otherlv_0= 'algorithme' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_algorithmeElements_3_0= ruleAlgorithmeElements ) )* otherlv_4= '}' )
            {
            // InternalAlgorithme_xtext.g:78:2: (otherlv_0= 'algorithme' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_algorithmeElements_3_0= ruleAlgorithmeElements ) )* otherlv_4= '}' )
            // InternalAlgorithme_xtext.g:79:3: otherlv_0= 'algorithme' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_algorithmeElements_3_0= ruleAlgorithmeElements ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAlgorithmeAccess().getAlgorithmeKeyword_0());
            		
            // InternalAlgorithme_xtext.g:83:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalAlgorithme_xtext.g:84:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalAlgorithme_xtext.g:84:4: (lv_nom_1_0= RULE_ID )
            // InternalAlgorithme_xtext.g:85:5: lv_nom_1_0= RULE_ID
            {
            lv_nom_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_nom_1_0, grammarAccess.getAlgorithmeAccess().getNomIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlgorithmeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAlgorithmeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlgorithme_xtext.g:105:3: ( (lv_algorithmeElements_3_0= ruleAlgorithmeElements ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==14||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAlgorithme_xtext.g:106:4: (lv_algorithmeElements_3_0= ruleAlgorithmeElements )
            	    {
            	    // InternalAlgorithme_xtext.g:106:4: (lv_algorithmeElements_3_0= ruleAlgorithmeElements )
            	    // InternalAlgorithme_xtext.g:107:5: lv_algorithmeElements_3_0= ruleAlgorithmeElements
            	    {

            	    					newCompositeNode(grammarAccess.getAlgorithmeAccess().getAlgorithmeElementsAlgorithmeElementsParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_algorithmeElements_3_0=ruleAlgorithmeElements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAlgorithmeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"algorithmeElements",
            	    						lv_algorithmeElements_3_0,
            	    						"fr.n7.Algorithme_xtext.AlgorithmeElements");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAlgorithmeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlgorithme"


    // $ANTLR start "entryRuleAlgorithmeElements"
    // InternalAlgorithme_xtext.g:132:1: entryRuleAlgorithmeElements returns [EObject current=null] : iv_ruleAlgorithmeElements= ruleAlgorithmeElements EOF ;
    public final EObject entryRuleAlgorithmeElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithmeElements = null;


        try {
            // InternalAlgorithme_xtext.g:132:59: (iv_ruleAlgorithmeElements= ruleAlgorithmeElements EOF )
            // InternalAlgorithme_xtext.g:133:2: iv_ruleAlgorithmeElements= ruleAlgorithmeElements EOF
            {
             newCompositeNode(grammarAccess.getAlgorithmeElementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlgorithmeElements=ruleAlgorithmeElements();

            state._fsp--;

             current =iv_ruleAlgorithmeElements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlgorithmeElements"


    // $ANTLR start "ruleAlgorithmeElements"
    // InternalAlgorithme_xtext.g:139:1: ruleAlgorithmeElements returns [EObject current=null] : (this_Ressources_0= ruleRessources | this_Documentation_1= ruleDocumentation ) ;
    public final EObject ruleAlgorithmeElements() throws RecognitionException {
        EObject current = null;

        EObject this_Ressources_0 = null;

        EObject this_Documentation_1 = null;



        	enterRule();

        try {
            // InternalAlgorithme_xtext.g:145:2: ( (this_Ressources_0= ruleRessources | this_Documentation_1= ruleDocumentation ) )
            // InternalAlgorithme_xtext.g:146:2: (this_Ressources_0= ruleRessources | this_Documentation_1= ruleDocumentation )
            {
            // InternalAlgorithme_xtext.g:146:2: (this_Ressources_0= ruleRessources | this_Documentation_1= ruleDocumentation )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalAlgorithme_xtext.g:147:3: this_Ressources_0= ruleRessources
                    {

                    			newCompositeNode(grammarAccess.getAlgorithmeElementsAccess().getRessourcesParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ressources_0=ruleRessources();

                    state._fsp--;


                    			current = this_Ressources_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlgorithme_xtext.g:156:3: this_Documentation_1= ruleDocumentation
                    {

                    			newCompositeNode(grammarAccess.getAlgorithmeElementsAccess().getDocumentationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Documentation_1=ruleDocumentation();

                    state._fsp--;


                    			current = this_Documentation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlgorithmeElements"


    // $ANTLR start "entryRuleRessources"
    // InternalAlgorithme_xtext.g:168:1: entryRuleRessources returns [EObject current=null] : iv_ruleRessources= ruleRessources EOF ;
    public final EObject entryRuleRessources() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRessources = null;


        try {
            // InternalAlgorithme_xtext.g:168:51: (iv_ruleRessources= ruleRessources EOF )
            // InternalAlgorithme_xtext.g:169:2: iv_ruleRessources= ruleRessources EOF
            {
             newCompositeNode(grammarAccess.getRessourcesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRessources=ruleRessources();

            state._fsp--;

             current =iv_ruleRessources; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRessources"


    // $ANTLR start "ruleRessources"
    // InternalAlgorithme_xtext.g:175:1: ruleRessources returns [EObject current=null] : ( (otherlv_0= 'Ressources :' ( (lv_chemin_1_0= ruleChemin ) ) ) | ( (lv_script_2_0= RULE_ID ) ) ) ;
    public final EObject ruleRessources() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_script_2_0=null;
        AntlrDatatypeRuleToken lv_chemin_1_0 = null;



        	enterRule();

        try {
            // InternalAlgorithme_xtext.g:181:2: ( ( (otherlv_0= 'Ressources :' ( (lv_chemin_1_0= ruleChemin ) ) ) | ( (lv_script_2_0= RULE_ID ) ) ) )
            // InternalAlgorithme_xtext.g:182:2: ( (otherlv_0= 'Ressources :' ( (lv_chemin_1_0= ruleChemin ) ) ) | ( (lv_script_2_0= RULE_ID ) ) )
            {
            // InternalAlgorithme_xtext.g:182:2: ( (otherlv_0= 'Ressources :' ( (lv_chemin_1_0= ruleChemin ) ) ) | ( (lv_script_2_0= RULE_ID ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAlgorithme_xtext.g:183:3: (otherlv_0= 'Ressources :' ( (lv_chemin_1_0= ruleChemin ) ) )
                    {
                    // InternalAlgorithme_xtext.g:183:3: (otherlv_0= 'Ressources :' ( (lv_chemin_1_0= ruleChemin ) ) )
                    // InternalAlgorithme_xtext.g:184:4: otherlv_0= 'Ressources :' ( (lv_chemin_1_0= ruleChemin ) )
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getRessourcesAccess().getRessourcesKeyword_0_0());
                    			
                    // InternalAlgorithme_xtext.g:188:4: ( (lv_chemin_1_0= ruleChemin ) )
                    // InternalAlgorithme_xtext.g:189:5: (lv_chemin_1_0= ruleChemin )
                    {
                    // InternalAlgorithme_xtext.g:189:5: (lv_chemin_1_0= ruleChemin )
                    // InternalAlgorithme_xtext.g:190:6: lv_chemin_1_0= ruleChemin
                    {

                    						newCompositeNode(grammarAccess.getRessourcesAccess().getCheminCheminParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_chemin_1_0=ruleChemin();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRessourcesRule());
                    						}
                    						set(
                    							current,
                    							"chemin",
                    							lv_chemin_1_0,
                    							"fr.n7.Algorithme_xtext.Chemin");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlgorithme_xtext.g:209:3: ( (lv_script_2_0= RULE_ID ) )
                    {
                    // InternalAlgorithme_xtext.g:209:3: ( (lv_script_2_0= RULE_ID ) )
                    // InternalAlgorithme_xtext.g:210:4: (lv_script_2_0= RULE_ID )
                    {
                    // InternalAlgorithme_xtext.g:210:4: (lv_script_2_0= RULE_ID )
                    // InternalAlgorithme_xtext.g:211:5: lv_script_2_0= RULE_ID
                    {
                    lv_script_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_script_2_0, grammarAccess.getRessourcesAccess().getScriptIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRessourcesRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"script",
                    						lv_script_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRessources"


    // $ANTLR start "entryRuleChemin"
    // InternalAlgorithme_xtext.g:231:1: entryRuleChemin returns [String current=null] : iv_ruleChemin= ruleChemin EOF ;
    public final String entryRuleChemin() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleChemin = null;


        try {
            // InternalAlgorithme_xtext.g:231:46: (iv_ruleChemin= ruleChemin EOF )
            // InternalAlgorithme_xtext.g:232:2: iv_ruleChemin= ruleChemin EOF
            {
             newCompositeNode(grammarAccess.getCheminRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChemin=ruleChemin();

            state._fsp--;

             current =iv_ruleChemin.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChemin"


    // $ANTLR start "ruleChemin"
    // InternalAlgorithme_xtext.g:238:1: ruleChemin returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '/' this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* )+ ;
    public final AntlrDatatypeRuleToken ruleChemin() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;


        	enterRule();

        try {
            // InternalAlgorithme_xtext.g:244:2: ( (kw= '/' this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* )+ )
            // InternalAlgorithme_xtext.g:245:2: (kw= '/' this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* )+
            {
            // InternalAlgorithme_xtext.g:245:2: (kw= '/' this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAlgorithme_xtext.g:246:3: kw= '/' this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )*
            	    {
            	    kw=(Token)match(input,15,FOLLOW_3); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getCheminAccess().getSolidusKeyword_0());
            	    		
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    			current.merge(this_ID_1);
            	    		

            	    			newLeafNode(this_ID_1, grammarAccess.getCheminAccess().getIDTerminalRuleCall_1());
            	    		
            	    // InternalAlgorithme_xtext.g:258:3: (kw= '.' this_ID_3= RULE_ID )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==16) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalAlgorithme_xtext.g:259:4: kw= '.' this_ID_3= RULE_ID
            	    	    {
            	    	    kw=(Token)match(input,16,FOLLOW_3); 

            	    	    				current.merge(kw);
            	    	    				newLeafNode(kw, grammarAccess.getCheminAccess().getFullStopKeyword_2_0());
            	    	    			
            	    	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    	    				current.merge(this_ID_3);
            	    	    			

            	    	    				newLeafNode(this_ID_3, grammarAccess.getCheminAccess().getIDTerminalRuleCall_2_1());
            	    	    			

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChemin"


    // $ANTLR start "entryRuleDocumentation"
    // InternalAlgorithme_xtext.g:276:1: entryRuleDocumentation returns [EObject current=null] : iv_ruleDocumentation= ruleDocumentation EOF ;
    public final EObject entryRuleDocumentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentation = null;


        try {
            // InternalAlgorithme_xtext.g:276:54: (iv_ruleDocumentation= ruleDocumentation EOF )
            // InternalAlgorithme_xtext.g:277:2: iv_ruleDocumentation= ruleDocumentation EOF
            {
             newCompositeNode(grammarAccess.getDocumentationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocumentation=ruleDocumentation();

            state._fsp--;

             current =iv_ruleDocumentation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocumentation"


    // $ANTLR start "ruleDocumentation"
    // InternalAlgorithme_xtext.g:283:1: ruleDocumentation returns [EObject current=null] : (otherlv_0= 'commentaire' ( (lv_texte_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDocumentation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_texte_1_0=null;


        	enterRule();

        try {
            // InternalAlgorithme_xtext.g:289:2: ( (otherlv_0= 'commentaire' ( (lv_texte_1_0= RULE_STRING ) ) ) )
            // InternalAlgorithme_xtext.g:290:2: (otherlv_0= 'commentaire' ( (lv_texte_1_0= RULE_STRING ) ) )
            {
            // InternalAlgorithme_xtext.g:290:2: (otherlv_0= 'commentaire' ( (lv_texte_1_0= RULE_STRING ) ) )
            // InternalAlgorithme_xtext.g:291:3: otherlv_0= 'commentaire' ( (lv_texte_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDocumentationAccess().getCommentaireKeyword_0());
            		
            // InternalAlgorithme_xtext.g:295:3: ( (lv_texte_1_0= RULE_STRING ) )
            // InternalAlgorithme_xtext.g:296:4: (lv_texte_1_0= RULE_STRING )
            {
            // InternalAlgorithme_xtext.g:296:4: (lv_texte_1_0= RULE_STRING )
            // InternalAlgorithme_xtext.g:297:5: lv_texte_1_0= RULE_STRING
            {
            lv_texte_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_texte_1_0, grammarAccess.getDocumentationAccess().getTexteSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDocumentationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"texte",
            						lv_texte_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocumentation"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000026010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});

}