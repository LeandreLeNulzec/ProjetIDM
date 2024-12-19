package fr.n7.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.n7.services.Algorithme_xtextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlgorithme_xtextParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(Algorithme_xtextGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleAlgorithme"
    // InternalAlgorithme_xtext.g:53:1: entryRuleAlgorithme : ruleAlgorithme EOF ;
    public final void entryRuleAlgorithme() throws RecognitionException {
        try {
            // InternalAlgorithme_xtext.g:54:1: ( ruleAlgorithme EOF )
            // InternalAlgorithme_xtext.g:55:1: ruleAlgorithme EOF
            {
             before(grammarAccess.getAlgorithmeRule()); 
            pushFollow(FOLLOW_1);
            ruleAlgorithme();

            state._fsp--;

             after(grammarAccess.getAlgorithmeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlgorithme"


    // $ANTLR start "ruleAlgorithme"
    // InternalAlgorithme_xtext.g:62:1: ruleAlgorithme : ( ( rule__Algorithme__Group__0 ) ) ;
    public final void ruleAlgorithme() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:66:2: ( ( ( rule__Algorithme__Group__0 ) ) )
            // InternalAlgorithme_xtext.g:67:2: ( ( rule__Algorithme__Group__0 ) )
            {
            // InternalAlgorithme_xtext.g:67:2: ( ( rule__Algorithme__Group__0 ) )
            // InternalAlgorithme_xtext.g:68:3: ( rule__Algorithme__Group__0 )
            {
             before(grammarAccess.getAlgorithmeAccess().getGroup()); 
            // InternalAlgorithme_xtext.g:69:3: ( rule__Algorithme__Group__0 )
            // InternalAlgorithme_xtext.g:69:4: rule__Algorithme__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Algorithme__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlgorithme"


    // $ANTLR start "entryRuleAlgorithmeElements"
    // InternalAlgorithme_xtext.g:78:1: entryRuleAlgorithmeElements : ruleAlgorithmeElements EOF ;
    public final void entryRuleAlgorithmeElements() throws RecognitionException {
        try {
            // InternalAlgorithme_xtext.g:79:1: ( ruleAlgorithmeElements EOF )
            // InternalAlgorithme_xtext.g:80:1: ruleAlgorithmeElements EOF
            {
             before(grammarAccess.getAlgorithmeElementsRule()); 
            pushFollow(FOLLOW_1);
            ruleAlgorithmeElements();

            state._fsp--;

             after(grammarAccess.getAlgorithmeElementsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlgorithmeElements"


    // $ANTLR start "ruleAlgorithmeElements"
    // InternalAlgorithme_xtext.g:87:1: ruleAlgorithmeElements : ( ( rule__AlgorithmeElements__Alternatives ) ) ;
    public final void ruleAlgorithmeElements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:91:2: ( ( ( rule__AlgorithmeElements__Alternatives ) ) )
            // InternalAlgorithme_xtext.g:92:2: ( ( rule__AlgorithmeElements__Alternatives ) )
            {
            // InternalAlgorithme_xtext.g:92:2: ( ( rule__AlgorithmeElements__Alternatives ) )
            // InternalAlgorithme_xtext.g:93:3: ( rule__AlgorithmeElements__Alternatives )
            {
             before(grammarAccess.getAlgorithmeElementsAccess().getAlternatives()); 
            // InternalAlgorithme_xtext.g:94:3: ( rule__AlgorithmeElements__Alternatives )
            // InternalAlgorithme_xtext.g:94:4: rule__AlgorithmeElements__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AlgorithmeElements__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmeElementsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlgorithmeElements"


    // $ANTLR start "entryRuleRessources"
    // InternalAlgorithme_xtext.g:103:1: entryRuleRessources : ruleRessources EOF ;
    public final void entryRuleRessources() throws RecognitionException {
        try {
            // InternalAlgorithme_xtext.g:104:1: ( ruleRessources EOF )
            // InternalAlgorithme_xtext.g:105:1: ruleRessources EOF
            {
             before(grammarAccess.getRessourcesRule()); 
            pushFollow(FOLLOW_1);
            ruleRessources();

            state._fsp--;

             after(grammarAccess.getRessourcesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRessources"


    // $ANTLR start "ruleRessources"
    // InternalAlgorithme_xtext.g:112:1: ruleRessources : ( ( rule__Ressources__Alternatives ) ) ;
    public final void ruleRessources() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:116:2: ( ( ( rule__Ressources__Alternatives ) ) )
            // InternalAlgorithme_xtext.g:117:2: ( ( rule__Ressources__Alternatives ) )
            {
            // InternalAlgorithme_xtext.g:117:2: ( ( rule__Ressources__Alternatives ) )
            // InternalAlgorithme_xtext.g:118:3: ( rule__Ressources__Alternatives )
            {
             before(grammarAccess.getRessourcesAccess().getAlternatives()); 
            // InternalAlgorithme_xtext.g:119:3: ( rule__Ressources__Alternatives )
            // InternalAlgorithme_xtext.g:119:4: rule__Ressources__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Ressources__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRessourcesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRessources"


    // $ANTLR start "entryRuleChemin"
    // InternalAlgorithme_xtext.g:128:1: entryRuleChemin : ruleChemin EOF ;
    public final void entryRuleChemin() throws RecognitionException {
        try {
            // InternalAlgorithme_xtext.g:129:1: ( ruleChemin EOF )
            // InternalAlgorithme_xtext.g:130:1: ruleChemin EOF
            {
             before(grammarAccess.getCheminRule()); 
            pushFollow(FOLLOW_1);
            ruleChemin();

            state._fsp--;

             after(grammarAccess.getCheminRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChemin"


    // $ANTLR start "ruleChemin"
    // InternalAlgorithme_xtext.g:137:1: ruleChemin : ( ( ( rule__Chemin__Group__0 ) ) ( ( rule__Chemin__Group__0 )* ) ) ;
    public final void ruleChemin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:141:2: ( ( ( ( rule__Chemin__Group__0 ) ) ( ( rule__Chemin__Group__0 )* ) ) )
            // InternalAlgorithme_xtext.g:142:2: ( ( ( rule__Chemin__Group__0 ) ) ( ( rule__Chemin__Group__0 )* ) )
            {
            // InternalAlgorithme_xtext.g:142:2: ( ( ( rule__Chemin__Group__0 ) ) ( ( rule__Chemin__Group__0 )* ) )
            // InternalAlgorithme_xtext.g:143:3: ( ( rule__Chemin__Group__0 ) ) ( ( rule__Chemin__Group__0 )* )
            {
            // InternalAlgorithme_xtext.g:143:3: ( ( rule__Chemin__Group__0 ) )
            // InternalAlgorithme_xtext.g:144:4: ( rule__Chemin__Group__0 )
            {
             before(grammarAccess.getCheminAccess().getGroup()); 
            // InternalAlgorithme_xtext.g:145:4: ( rule__Chemin__Group__0 )
            // InternalAlgorithme_xtext.g:145:5: rule__Chemin__Group__0
            {
            pushFollow(FOLLOW_3);
            rule__Chemin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getGroup()); 

            }

            // InternalAlgorithme_xtext.g:148:3: ( ( rule__Chemin__Group__0 )* )
            // InternalAlgorithme_xtext.g:149:4: ( rule__Chemin__Group__0 )*
            {
             before(grammarAccess.getCheminAccess().getGroup()); 
            // InternalAlgorithme_xtext.g:150:4: ( rule__Chemin__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAlgorithme_xtext.g:150:5: rule__Chemin__Group__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Chemin__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getCheminAccess().getGroup()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChemin"


    // $ANTLR start "entryRuleDocumentation"
    // InternalAlgorithme_xtext.g:160:1: entryRuleDocumentation : ruleDocumentation EOF ;
    public final void entryRuleDocumentation() throws RecognitionException {
        try {
            // InternalAlgorithme_xtext.g:161:1: ( ruleDocumentation EOF )
            // InternalAlgorithme_xtext.g:162:1: ruleDocumentation EOF
            {
             before(grammarAccess.getDocumentationRule()); 
            pushFollow(FOLLOW_1);
            ruleDocumentation();

            state._fsp--;

             after(grammarAccess.getDocumentationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDocumentation"


    // $ANTLR start "ruleDocumentation"
    // InternalAlgorithme_xtext.g:169:1: ruleDocumentation : ( ( rule__Documentation__Group__0 ) ) ;
    public final void ruleDocumentation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:173:2: ( ( ( rule__Documentation__Group__0 ) ) )
            // InternalAlgorithme_xtext.g:174:2: ( ( rule__Documentation__Group__0 ) )
            {
            // InternalAlgorithme_xtext.g:174:2: ( ( rule__Documentation__Group__0 ) )
            // InternalAlgorithme_xtext.g:175:3: ( rule__Documentation__Group__0 )
            {
             before(grammarAccess.getDocumentationAccess().getGroup()); 
            // InternalAlgorithme_xtext.g:176:3: ( rule__Documentation__Group__0 )
            // InternalAlgorithme_xtext.g:176:4: rule__Documentation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Documentation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocumentationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocumentation"


    // $ANTLR start "rule__AlgorithmeElements__Alternatives"
    // InternalAlgorithme_xtext.g:184:1: rule__AlgorithmeElements__Alternatives : ( ( ruleRessources ) | ( ruleDocumentation ) );
    public final void rule__AlgorithmeElements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:188:1: ( ( ruleRessources ) | ( ruleDocumentation ) )
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
                    // InternalAlgorithme_xtext.g:189:2: ( ruleRessources )
                    {
                    // InternalAlgorithme_xtext.g:189:2: ( ruleRessources )
                    // InternalAlgorithme_xtext.g:190:3: ruleRessources
                    {
                     before(grammarAccess.getAlgorithmeElementsAccess().getRessourcesParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRessources();

                    state._fsp--;

                     after(grammarAccess.getAlgorithmeElementsAccess().getRessourcesParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlgorithme_xtext.g:195:2: ( ruleDocumentation )
                    {
                    // InternalAlgorithme_xtext.g:195:2: ( ruleDocumentation )
                    // InternalAlgorithme_xtext.g:196:3: ruleDocumentation
                    {
                     before(grammarAccess.getAlgorithmeElementsAccess().getDocumentationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDocumentation();

                    state._fsp--;

                     after(grammarAccess.getAlgorithmeElementsAccess().getDocumentationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlgorithmeElements__Alternatives"


    // $ANTLR start "rule__Ressources__Alternatives"
    // InternalAlgorithme_xtext.g:205:1: rule__Ressources__Alternatives : ( ( ( rule__Ressources__Group_0__0 ) ) | ( ( rule__Ressources__ScriptAssignment_1 ) ) );
    public final void rule__Ressources__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:209:1: ( ( ( rule__Ressources__Group_0__0 ) ) | ( ( rule__Ressources__ScriptAssignment_1 ) ) )
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
                    // InternalAlgorithme_xtext.g:210:2: ( ( rule__Ressources__Group_0__0 ) )
                    {
                    // InternalAlgorithme_xtext.g:210:2: ( ( rule__Ressources__Group_0__0 ) )
                    // InternalAlgorithme_xtext.g:211:3: ( rule__Ressources__Group_0__0 )
                    {
                     before(grammarAccess.getRessourcesAccess().getGroup_0()); 
                    // InternalAlgorithme_xtext.g:212:3: ( rule__Ressources__Group_0__0 )
                    // InternalAlgorithme_xtext.g:212:4: rule__Ressources__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ressources__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRessourcesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlgorithme_xtext.g:216:2: ( ( rule__Ressources__ScriptAssignment_1 ) )
                    {
                    // InternalAlgorithme_xtext.g:216:2: ( ( rule__Ressources__ScriptAssignment_1 ) )
                    // InternalAlgorithme_xtext.g:217:3: ( rule__Ressources__ScriptAssignment_1 )
                    {
                     before(grammarAccess.getRessourcesAccess().getScriptAssignment_1()); 
                    // InternalAlgorithme_xtext.g:218:3: ( rule__Ressources__ScriptAssignment_1 )
                    // InternalAlgorithme_xtext.g:218:4: rule__Ressources__ScriptAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ressources__ScriptAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRessourcesAccess().getScriptAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressources__Alternatives"


    // $ANTLR start "rule__Algorithme__Group__0"
    // InternalAlgorithme_xtext.g:226:1: rule__Algorithme__Group__0 : rule__Algorithme__Group__0__Impl rule__Algorithme__Group__1 ;
    public final void rule__Algorithme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:230:1: ( rule__Algorithme__Group__0__Impl rule__Algorithme__Group__1 )
            // InternalAlgorithme_xtext.g:231:2: rule__Algorithme__Group__0__Impl rule__Algorithme__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Algorithme__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithme__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__0"


    // $ANTLR start "rule__Algorithme__Group__0__Impl"
    // InternalAlgorithme_xtext.g:238:1: rule__Algorithme__Group__0__Impl : ( 'algorithme' ) ;
    public final void rule__Algorithme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:242:1: ( ( 'algorithme' ) )
            // InternalAlgorithme_xtext.g:243:1: ( 'algorithme' )
            {
            // InternalAlgorithme_xtext.g:243:1: ( 'algorithme' )
            // InternalAlgorithme_xtext.g:244:2: 'algorithme'
            {
             before(grammarAccess.getAlgorithmeAccess().getAlgorithmeKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAlgorithmeAccess().getAlgorithmeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__0__Impl"


    // $ANTLR start "rule__Algorithme__Group__1"
    // InternalAlgorithme_xtext.g:253:1: rule__Algorithme__Group__1 : rule__Algorithme__Group__1__Impl rule__Algorithme__Group__2 ;
    public final void rule__Algorithme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:257:1: ( rule__Algorithme__Group__1__Impl rule__Algorithme__Group__2 )
            // InternalAlgorithme_xtext.g:258:2: rule__Algorithme__Group__1__Impl rule__Algorithme__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Algorithme__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithme__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__1"


    // $ANTLR start "rule__Algorithme__Group__1__Impl"
    // InternalAlgorithme_xtext.g:265:1: rule__Algorithme__Group__1__Impl : ( ( rule__Algorithme__NomAssignment_1 ) ) ;
    public final void rule__Algorithme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:269:1: ( ( ( rule__Algorithme__NomAssignment_1 ) ) )
            // InternalAlgorithme_xtext.g:270:1: ( ( rule__Algorithme__NomAssignment_1 ) )
            {
            // InternalAlgorithme_xtext.g:270:1: ( ( rule__Algorithme__NomAssignment_1 ) )
            // InternalAlgorithme_xtext.g:271:2: ( rule__Algorithme__NomAssignment_1 )
            {
             before(grammarAccess.getAlgorithmeAccess().getNomAssignment_1()); 
            // InternalAlgorithme_xtext.g:272:2: ( rule__Algorithme__NomAssignment_1 )
            // InternalAlgorithme_xtext.g:272:3: rule__Algorithme__NomAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Algorithme__NomAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmeAccess().getNomAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__1__Impl"


    // $ANTLR start "rule__Algorithme__Group__2"
    // InternalAlgorithme_xtext.g:280:1: rule__Algorithme__Group__2 : rule__Algorithme__Group__2__Impl rule__Algorithme__Group__3 ;
    public final void rule__Algorithme__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:284:1: ( rule__Algorithme__Group__2__Impl rule__Algorithme__Group__3 )
            // InternalAlgorithme_xtext.g:285:2: rule__Algorithme__Group__2__Impl rule__Algorithme__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Algorithme__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithme__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__2"


    // $ANTLR start "rule__Algorithme__Group__2__Impl"
    // InternalAlgorithme_xtext.g:292:1: rule__Algorithme__Group__2__Impl : ( '{' ) ;
    public final void rule__Algorithme__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:296:1: ( ( '{' ) )
            // InternalAlgorithme_xtext.g:297:1: ( '{' )
            {
            // InternalAlgorithme_xtext.g:297:1: ( '{' )
            // InternalAlgorithme_xtext.g:298:2: '{'
            {
             before(grammarAccess.getAlgorithmeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAlgorithmeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__2__Impl"


    // $ANTLR start "rule__Algorithme__Group__3"
    // InternalAlgorithme_xtext.g:307:1: rule__Algorithme__Group__3 : rule__Algorithme__Group__3__Impl rule__Algorithme__Group__4 ;
    public final void rule__Algorithme__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:311:1: ( rule__Algorithme__Group__3__Impl rule__Algorithme__Group__4 )
            // InternalAlgorithme_xtext.g:312:2: rule__Algorithme__Group__3__Impl rule__Algorithme__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Algorithme__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithme__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__3"


    // $ANTLR start "rule__Algorithme__Group__3__Impl"
    // InternalAlgorithme_xtext.g:319:1: rule__Algorithme__Group__3__Impl : ( ( rule__Algorithme__AlgorithmeElementsAssignment_3 )* ) ;
    public final void rule__Algorithme__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:323:1: ( ( ( rule__Algorithme__AlgorithmeElementsAssignment_3 )* ) )
            // InternalAlgorithme_xtext.g:324:1: ( ( rule__Algorithme__AlgorithmeElementsAssignment_3 )* )
            {
            // InternalAlgorithme_xtext.g:324:1: ( ( rule__Algorithme__AlgorithmeElementsAssignment_3 )* )
            // InternalAlgorithme_xtext.g:325:2: ( rule__Algorithme__AlgorithmeElementsAssignment_3 )*
            {
             before(grammarAccess.getAlgorithmeAccess().getAlgorithmeElementsAssignment_3()); 
            // InternalAlgorithme_xtext.g:326:2: ( rule__Algorithme__AlgorithmeElementsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==14||LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAlgorithme_xtext.g:326:3: rule__Algorithme__AlgorithmeElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Algorithme__AlgorithmeElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getAlgorithmeAccess().getAlgorithmeElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__3__Impl"


    // $ANTLR start "rule__Algorithme__Group__4"
    // InternalAlgorithme_xtext.g:334:1: rule__Algorithme__Group__4 : rule__Algorithme__Group__4__Impl ;
    public final void rule__Algorithme__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:338:1: ( rule__Algorithme__Group__4__Impl )
            // InternalAlgorithme_xtext.g:339:2: rule__Algorithme__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Algorithme__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__4"


    // $ANTLR start "rule__Algorithme__Group__4__Impl"
    // InternalAlgorithme_xtext.g:345:1: rule__Algorithme__Group__4__Impl : ( '}' ) ;
    public final void rule__Algorithme__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:349:1: ( ( '}' ) )
            // InternalAlgorithme_xtext.g:350:1: ( '}' )
            {
            // InternalAlgorithme_xtext.g:350:1: ( '}' )
            // InternalAlgorithme_xtext.g:351:2: '}'
            {
             before(grammarAccess.getAlgorithmeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAlgorithmeAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__4__Impl"


    // $ANTLR start "rule__Ressources__Group_0__0"
    // InternalAlgorithme_xtext.g:361:1: rule__Ressources__Group_0__0 : rule__Ressources__Group_0__0__Impl rule__Ressources__Group_0__1 ;
    public final void rule__Ressources__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:365:1: ( rule__Ressources__Group_0__0__Impl rule__Ressources__Group_0__1 )
            // InternalAlgorithme_xtext.g:366:2: rule__Ressources__Group_0__0__Impl rule__Ressources__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Ressources__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressources__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressources__Group_0__0"


    // $ANTLR start "rule__Ressources__Group_0__0__Impl"
    // InternalAlgorithme_xtext.g:373:1: rule__Ressources__Group_0__0__Impl : ( 'Ressources :' ) ;
    public final void rule__Ressources__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:377:1: ( ( 'Ressources :' ) )
            // InternalAlgorithme_xtext.g:378:1: ( 'Ressources :' )
            {
            // InternalAlgorithme_xtext.g:378:1: ( 'Ressources :' )
            // InternalAlgorithme_xtext.g:379:2: 'Ressources :'
            {
             before(grammarAccess.getRessourcesAccess().getRessourcesKeyword_0_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRessourcesAccess().getRessourcesKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressources__Group_0__0__Impl"


    // $ANTLR start "rule__Ressources__Group_0__1"
    // InternalAlgorithme_xtext.g:388:1: rule__Ressources__Group_0__1 : rule__Ressources__Group_0__1__Impl ;
    public final void rule__Ressources__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:392:1: ( rule__Ressources__Group_0__1__Impl )
            // InternalAlgorithme_xtext.g:393:2: rule__Ressources__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ressources__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressources__Group_0__1"


    // $ANTLR start "rule__Ressources__Group_0__1__Impl"
    // InternalAlgorithme_xtext.g:399:1: rule__Ressources__Group_0__1__Impl : ( ( rule__Ressources__CheminAssignment_0_1 ) ) ;
    public final void rule__Ressources__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:403:1: ( ( ( rule__Ressources__CheminAssignment_0_1 ) ) )
            // InternalAlgorithme_xtext.g:404:1: ( ( rule__Ressources__CheminAssignment_0_1 ) )
            {
            // InternalAlgorithme_xtext.g:404:1: ( ( rule__Ressources__CheminAssignment_0_1 ) )
            // InternalAlgorithme_xtext.g:405:2: ( rule__Ressources__CheminAssignment_0_1 )
            {
             before(grammarAccess.getRessourcesAccess().getCheminAssignment_0_1()); 
            // InternalAlgorithme_xtext.g:406:2: ( rule__Ressources__CheminAssignment_0_1 )
            // InternalAlgorithme_xtext.g:406:3: rule__Ressources__CheminAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Ressources__CheminAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getRessourcesAccess().getCheminAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressources__Group_0__1__Impl"


    // $ANTLR start "rule__Chemin__Group__0"
    // InternalAlgorithme_xtext.g:415:1: rule__Chemin__Group__0 : rule__Chemin__Group__0__Impl rule__Chemin__Group__1 ;
    public final void rule__Chemin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:419:1: ( rule__Chemin__Group__0__Impl rule__Chemin__Group__1 )
            // InternalAlgorithme_xtext.g:420:2: rule__Chemin__Group__0__Impl rule__Chemin__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Chemin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__0"


    // $ANTLR start "rule__Chemin__Group__0__Impl"
    // InternalAlgorithme_xtext.g:427:1: rule__Chemin__Group__0__Impl : ( '/' ) ;
    public final void rule__Chemin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:431:1: ( ( '/' ) )
            // InternalAlgorithme_xtext.g:432:1: ( '/' )
            {
            // InternalAlgorithme_xtext.g:432:1: ( '/' )
            // InternalAlgorithme_xtext.g:433:2: '/'
            {
             before(grammarAccess.getCheminAccess().getSolidusKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getSolidusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__0__Impl"


    // $ANTLR start "rule__Chemin__Group__1"
    // InternalAlgorithme_xtext.g:442:1: rule__Chemin__Group__1 : rule__Chemin__Group__1__Impl rule__Chemin__Group__2 ;
    public final void rule__Chemin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:446:1: ( rule__Chemin__Group__1__Impl rule__Chemin__Group__2 )
            // InternalAlgorithme_xtext.g:447:2: rule__Chemin__Group__1__Impl rule__Chemin__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Chemin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__1"


    // $ANTLR start "rule__Chemin__Group__1__Impl"
    // InternalAlgorithme_xtext.g:454:1: rule__Chemin__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Chemin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:458:1: ( ( RULE_ID ) )
            // InternalAlgorithme_xtext.g:459:1: ( RULE_ID )
            {
            // InternalAlgorithme_xtext.g:459:1: ( RULE_ID )
            // InternalAlgorithme_xtext.g:460:2: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__1__Impl"


    // $ANTLR start "rule__Chemin__Group__2"
    // InternalAlgorithme_xtext.g:469:1: rule__Chemin__Group__2 : rule__Chemin__Group__2__Impl ;
    public final void rule__Chemin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:473:1: ( rule__Chemin__Group__2__Impl )
            // InternalAlgorithme_xtext.g:474:2: rule__Chemin__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__2"


    // $ANTLR start "rule__Chemin__Group__2__Impl"
    // InternalAlgorithme_xtext.g:480:1: rule__Chemin__Group__2__Impl : ( ( rule__Chemin__Group_2__0 )* ) ;
    public final void rule__Chemin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:484:1: ( ( ( rule__Chemin__Group_2__0 )* ) )
            // InternalAlgorithme_xtext.g:485:1: ( ( rule__Chemin__Group_2__0 )* )
            {
            // InternalAlgorithme_xtext.g:485:1: ( ( rule__Chemin__Group_2__0 )* )
            // InternalAlgorithme_xtext.g:486:2: ( rule__Chemin__Group_2__0 )*
            {
             before(grammarAccess.getCheminAccess().getGroup_2()); 
            // InternalAlgorithme_xtext.g:487:2: ( rule__Chemin__Group_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAlgorithme_xtext.g:487:3: rule__Chemin__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Chemin__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getCheminAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__2__Impl"


    // $ANTLR start "rule__Chemin__Group_2__0"
    // InternalAlgorithme_xtext.g:496:1: rule__Chemin__Group_2__0 : rule__Chemin__Group_2__0__Impl rule__Chemin__Group_2__1 ;
    public final void rule__Chemin__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:500:1: ( rule__Chemin__Group_2__0__Impl rule__Chemin__Group_2__1 )
            // InternalAlgorithme_xtext.g:501:2: rule__Chemin__Group_2__0__Impl rule__Chemin__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Chemin__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_2__0"


    // $ANTLR start "rule__Chemin__Group_2__0__Impl"
    // InternalAlgorithme_xtext.g:508:1: rule__Chemin__Group_2__0__Impl : ( '.' ) ;
    public final void rule__Chemin__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:512:1: ( ( '.' ) )
            // InternalAlgorithme_xtext.g:513:1: ( '.' )
            {
            // InternalAlgorithme_xtext.g:513:1: ( '.' )
            // InternalAlgorithme_xtext.g:514:2: '.'
            {
             before(grammarAccess.getCheminAccess().getFullStopKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_2__0__Impl"


    // $ANTLR start "rule__Chemin__Group_2__1"
    // InternalAlgorithme_xtext.g:523:1: rule__Chemin__Group_2__1 : rule__Chemin__Group_2__1__Impl ;
    public final void rule__Chemin__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:527:1: ( rule__Chemin__Group_2__1__Impl )
            // InternalAlgorithme_xtext.g:528:2: rule__Chemin__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_2__1"


    // $ANTLR start "rule__Chemin__Group_2__1__Impl"
    // InternalAlgorithme_xtext.g:534:1: rule__Chemin__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__Chemin__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:538:1: ( ( RULE_ID ) )
            // InternalAlgorithme_xtext.g:539:1: ( RULE_ID )
            {
            // InternalAlgorithme_xtext.g:539:1: ( RULE_ID )
            // InternalAlgorithme_xtext.g:540:2: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getIDTerminalRuleCall_2_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getIDTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_2__1__Impl"


    // $ANTLR start "rule__Documentation__Group__0"
    // InternalAlgorithme_xtext.g:550:1: rule__Documentation__Group__0 : rule__Documentation__Group__0__Impl rule__Documentation__Group__1 ;
    public final void rule__Documentation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:554:1: ( rule__Documentation__Group__0__Impl rule__Documentation__Group__1 )
            // InternalAlgorithme_xtext.g:555:2: rule__Documentation__Group__0__Impl rule__Documentation__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Documentation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Documentation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Documentation__Group__0"


    // $ANTLR start "rule__Documentation__Group__0__Impl"
    // InternalAlgorithme_xtext.g:562:1: rule__Documentation__Group__0__Impl : ( 'commentaire' ) ;
    public final void rule__Documentation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:566:1: ( ( 'commentaire' ) )
            // InternalAlgorithme_xtext.g:567:1: ( 'commentaire' )
            {
            // InternalAlgorithme_xtext.g:567:1: ( 'commentaire' )
            // InternalAlgorithme_xtext.g:568:2: 'commentaire'
            {
             before(grammarAccess.getDocumentationAccess().getCommentaireKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDocumentationAccess().getCommentaireKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Documentation__Group__0__Impl"


    // $ANTLR start "rule__Documentation__Group__1"
    // InternalAlgorithme_xtext.g:577:1: rule__Documentation__Group__1 : rule__Documentation__Group__1__Impl ;
    public final void rule__Documentation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:581:1: ( rule__Documentation__Group__1__Impl )
            // InternalAlgorithme_xtext.g:582:2: rule__Documentation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Documentation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Documentation__Group__1"


    // $ANTLR start "rule__Documentation__Group__1__Impl"
    // InternalAlgorithme_xtext.g:588:1: rule__Documentation__Group__1__Impl : ( ( rule__Documentation__TexteAssignment_1 ) ) ;
    public final void rule__Documentation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:592:1: ( ( ( rule__Documentation__TexteAssignment_1 ) ) )
            // InternalAlgorithme_xtext.g:593:1: ( ( rule__Documentation__TexteAssignment_1 ) )
            {
            // InternalAlgorithme_xtext.g:593:1: ( ( rule__Documentation__TexteAssignment_1 ) )
            // InternalAlgorithme_xtext.g:594:2: ( rule__Documentation__TexteAssignment_1 )
            {
             before(grammarAccess.getDocumentationAccess().getTexteAssignment_1()); 
            // InternalAlgorithme_xtext.g:595:2: ( rule__Documentation__TexteAssignment_1 )
            // InternalAlgorithme_xtext.g:595:3: rule__Documentation__TexteAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Documentation__TexteAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDocumentationAccess().getTexteAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Documentation__Group__1__Impl"


    // $ANTLR start "rule__Algorithme__NomAssignment_1"
    // InternalAlgorithme_xtext.g:604:1: rule__Algorithme__NomAssignment_1 : ( RULE_ID ) ;
    public final void rule__Algorithme__NomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:608:1: ( ( RULE_ID ) )
            // InternalAlgorithme_xtext.g:609:2: ( RULE_ID )
            {
            // InternalAlgorithme_xtext.g:609:2: ( RULE_ID )
            // InternalAlgorithme_xtext.g:610:3: RULE_ID
            {
             before(grammarAccess.getAlgorithmeAccess().getNomIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAlgorithmeAccess().getNomIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__NomAssignment_1"


    // $ANTLR start "rule__Algorithme__AlgorithmeElementsAssignment_3"
    // InternalAlgorithme_xtext.g:619:1: rule__Algorithme__AlgorithmeElementsAssignment_3 : ( ruleAlgorithmeElements ) ;
    public final void rule__Algorithme__AlgorithmeElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:623:1: ( ( ruleAlgorithmeElements ) )
            // InternalAlgorithme_xtext.g:624:2: ( ruleAlgorithmeElements )
            {
            // InternalAlgorithme_xtext.g:624:2: ( ruleAlgorithmeElements )
            // InternalAlgorithme_xtext.g:625:3: ruleAlgorithmeElements
            {
             before(grammarAccess.getAlgorithmeAccess().getAlgorithmeElementsAlgorithmeElementsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAlgorithmeElements();

            state._fsp--;

             after(grammarAccess.getAlgorithmeAccess().getAlgorithmeElementsAlgorithmeElementsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__AlgorithmeElementsAssignment_3"


    // $ANTLR start "rule__Ressources__CheminAssignment_0_1"
    // InternalAlgorithme_xtext.g:634:1: rule__Ressources__CheminAssignment_0_1 : ( ruleChemin ) ;
    public final void rule__Ressources__CheminAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:638:1: ( ( ruleChemin ) )
            // InternalAlgorithme_xtext.g:639:2: ( ruleChemin )
            {
            // InternalAlgorithme_xtext.g:639:2: ( ruleChemin )
            // InternalAlgorithme_xtext.g:640:3: ruleChemin
            {
             before(grammarAccess.getRessourcesAccess().getCheminCheminParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleChemin();

            state._fsp--;

             after(grammarAccess.getRessourcesAccess().getCheminCheminParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressources__CheminAssignment_0_1"


    // $ANTLR start "rule__Ressources__ScriptAssignment_1"
    // InternalAlgorithme_xtext.g:649:1: rule__Ressources__ScriptAssignment_1 : ( RULE_ID ) ;
    public final void rule__Ressources__ScriptAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:653:1: ( ( RULE_ID ) )
            // InternalAlgorithme_xtext.g:654:2: ( RULE_ID )
            {
            // InternalAlgorithme_xtext.g:654:2: ( RULE_ID )
            // InternalAlgorithme_xtext.g:655:3: RULE_ID
            {
             before(grammarAccess.getRessourcesAccess().getScriptIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRessourcesAccess().getScriptIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressources__ScriptAssignment_1"


    // $ANTLR start "rule__Documentation__TexteAssignment_1"
    // InternalAlgorithme_xtext.g:664:1: rule__Documentation__TexteAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Documentation__TexteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithme_xtext.g:668:1: ( ( RULE_STRING ) )
            // InternalAlgorithme_xtext.g:669:2: ( RULE_STRING )
            {
            // InternalAlgorithme_xtext.g:669:2: ( RULE_STRING )
            // InternalAlgorithme_xtext.g:670:3: RULE_STRING
            {
             before(grammarAccess.getDocumentationAccess().getTexteSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDocumentationAccess().getTexteSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Documentation__TexteAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000026010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000024012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});

}