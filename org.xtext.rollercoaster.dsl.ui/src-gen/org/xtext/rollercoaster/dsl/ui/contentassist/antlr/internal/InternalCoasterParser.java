package org.xtext.rollercoaster.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.rollercoaster.dsl.services.CoasterGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCoasterParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'!'", "'Die'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalCoasterParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCoasterParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCoasterParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g"; }


     
     	private CoasterGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CoasterGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:61:1: ( ruleModel EOF )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:69:1: ruleModel : ( ( rule__Model__GreetingsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:73:2: ( ( ( rule__Model__GreetingsAssignment )* ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:75:1: ( rule__Model__GreetingsAssignment )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:76:1: ( rule__Model__GreetingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:76:2: rule__Model__GreetingsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94);
            	    rule__Model__GreetingsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGreetingsAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:88:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:89:1: ( ruleGreeting EOF )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:90:1: ruleGreeting EOF
            {
             before(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting122);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getGreetingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting129); 

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
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:97:1: ruleGreeting : ( ( rule__Greeting__Group__0 ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:101:2: ( ( ( rule__Greeting__Group__0 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:102:1: ( ( rule__Greeting__Group__0 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:102:1: ( ( rule__Greeting__Group__0 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:103:1: ( rule__Greeting__Group__0 )
            {
             before(grammarAccess.getGreetingAccess().getGroup()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:104:1: ( rule__Greeting__Group__0 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:104:2: rule__Greeting__Group__0
            {
            pushFollow(FOLLOW_rule__Greeting__Group__0_in_ruleGreeting155);
            rule__Greeting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getGroup()); 

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
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleInsult"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:116:1: entryRuleInsult : ruleInsult EOF ;
    public final void entryRuleInsult() throws RecognitionException {
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:117:1: ( ruleInsult EOF )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:118:1: ruleInsult EOF
            {
             before(grammarAccess.getInsultRule()); 
            pushFollow(FOLLOW_ruleInsult_in_entryRuleInsult182);
            ruleInsult();

            state._fsp--;

             after(grammarAccess.getInsultRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsult189); 

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
    // $ANTLR end "entryRuleInsult"


    // $ANTLR start "ruleInsult"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:125:1: ruleInsult : ( ( rule__Insult__Group__0 ) ) ;
    public final void ruleInsult() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:129:2: ( ( ( rule__Insult__Group__0 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:130:1: ( ( rule__Insult__Group__0 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:130:1: ( ( rule__Insult__Group__0 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:131:1: ( rule__Insult__Group__0 )
            {
             before(grammarAccess.getInsultAccess().getGroup()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:132:1: ( rule__Insult__Group__0 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:132:2: rule__Insult__Group__0
            {
            pushFollow(FOLLOW_rule__Insult__Group__0_in_ruleInsult215);
            rule__Insult__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInsultAccess().getGroup()); 

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
    // $ANTLR end "ruleInsult"


    // $ANTLR start "rule__Model__GreetingsAlternatives_0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:144:1: rule__Model__GreetingsAlternatives_0 : ( ( ruleGreeting ) | ( ruleInsult ) );
    public final void rule__Model__GreetingsAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:148:1: ( ( ruleGreeting ) | ( ruleInsult ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:149:1: ( ruleGreeting )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:149:1: ( ruleGreeting )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:150:1: ruleGreeting
                    {
                     before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleGreeting_in_rule__Model__GreetingsAlternatives_0251);
                    ruleGreeting();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:155:6: ( ruleInsult )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:155:6: ( ruleInsult )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:156:1: ruleInsult
                    {
                     before(grammarAccess.getModelAccess().getGreetingsInsultParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleInsult_in_rule__Model__GreetingsAlternatives_0268);
                    ruleInsult();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getGreetingsInsultParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__Model__GreetingsAlternatives_0"


    // $ANTLR start "rule__Greeting__Group__0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:168:1: rule__Greeting__Group__0 : rule__Greeting__Group__0__Impl rule__Greeting__Group__1 ;
    public final void rule__Greeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:172:1: ( rule__Greeting__Group__0__Impl rule__Greeting__Group__1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:173:2: rule__Greeting__Group__0__Impl rule__Greeting__Group__1
            {
            pushFollow(FOLLOW_rule__Greeting__Group__0__Impl_in_rule__Greeting__Group__0298);
            rule__Greeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__1_in_rule__Greeting__Group__0301);
            rule__Greeting__Group__1();

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
    // $ANTLR end "rule__Greeting__Group__0"


    // $ANTLR start "rule__Greeting__Group__0__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:180:1: rule__Greeting__Group__0__Impl : ( 'Hello' ) ;
    public final void rule__Greeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:184:1: ( ( 'Hello' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:185:1: ( 'Hello' )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:185:1: ( 'Hello' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:186:1: 'Hello'
            {
             before(grammarAccess.getGreetingAccess().getHelloKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Greeting__Group__0__Impl329); 
             after(grammarAccess.getGreetingAccess().getHelloKeyword_0()); 

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
    // $ANTLR end "rule__Greeting__Group__0__Impl"


    // $ANTLR start "rule__Greeting__Group__1"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:199:1: rule__Greeting__Group__1 : rule__Greeting__Group__1__Impl rule__Greeting__Group__2 ;
    public final void rule__Greeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:203:1: ( rule__Greeting__Group__1__Impl rule__Greeting__Group__2 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:204:2: rule__Greeting__Group__1__Impl rule__Greeting__Group__2
            {
            pushFollow(FOLLOW_rule__Greeting__Group__1__Impl_in_rule__Greeting__Group__1360);
            rule__Greeting__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__2_in_rule__Greeting__Group__1363);
            rule__Greeting__Group__2();

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
    // $ANTLR end "rule__Greeting__Group__1"


    // $ANTLR start "rule__Greeting__Group__1__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:211:1: rule__Greeting__Group__1__Impl : ( ( rule__Greeting__NameAssignment_1 ) ) ;
    public final void rule__Greeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:215:1: ( ( ( rule__Greeting__NameAssignment_1 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:216:1: ( ( rule__Greeting__NameAssignment_1 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:216:1: ( ( rule__Greeting__NameAssignment_1 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:217:1: ( rule__Greeting__NameAssignment_1 )
            {
             before(grammarAccess.getGreetingAccess().getNameAssignment_1()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:218:1: ( rule__Greeting__NameAssignment_1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:218:2: rule__Greeting__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Greeting__NameAssignment_1_in_rule__Greeting__Group__1__Impl390);
            rule__Greeting__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Greeting__Group__1__Impl"


    // $ANTLR start "rule__Greeting__Group__2"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:228:1: rule__Greeting__Group__2 : rule__Greeting__Group__2__Impl ;
    public final void rule__Greeting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:232:1: ( rule__Greeting__Group__2__Impl )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:233:2: rule__Greeting__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Greeting__Group__2__Impl_in_rule__Greeting__Group__2420);
            rule__Greeting__Group__2__Impl();

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
    // $ANTLR end "rule__Greeting__Group__2"


    // $ANTLR start "rule__Greeting__Group__2__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:239:1: rule__Greeting__Group__2__Impl : ( '!' ) ;
    public final void rule__Greeting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:243:1: ( ( '!' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:244:1: ( '!' )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:244:1: ( '!' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:245:1: '!'
            {
             before(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Greeting__Group__2__Impl448); 
             after(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2()); 

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
    // $ANTLR end "rule__Greeting__Group__2__Impl"


    // $ANTLR start "rule__Insult__Group__0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:264:1: rule__Insult__Group__0 : rule__Insult__Group__0__Impl rule__Insult__Group__1 ;
    public final void rule__Insult__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:268:1: ( rule__Insult__Group__0__Impl rule__Insult__Group__1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:269:2: rule__Insult__Group__0__Impl rule__Insult__Group__1
            {
            pushFollow(FOLLOW_rule__Insult__Group__0__Impl_in_rule__Insult__Group__0485);
            rule__Insult__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Insult__Group__1_in_rule__Insult__Group__0488);
            rule__Insult__Group__1();

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
    // $ANTLR end "rule__Insult__Group__0"


    // $ANTLR start "rule__Insult__Group__0__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:276:1: rule__Insult__Group__0__Impl : ( 'Die' ) ;
    public final void rule__Insult__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:280:1: ( ( 'Die' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:281:1: ( 'Die' )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:281:1: ( 'Die' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:282:1: 'Die'
            {
             before(grammarAccess.getInsultAccess().getDieKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Insult__Group__0__Impl516); 
             after(grammarAccess.getInsultAccess().getDieKeyword_0()); 

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
    // $ANTLR end "rule__Insult__Group__0__Impl"


    // $ANTLR start "rule__Insult__Group__1"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:295:1: rule__Insult__Group__1 : rule__Insult__Group__1__Impl rule__Insult__Group__2 ;
    public final void rule__Insult__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:299:1: ( rule__Insult__Group__1__Impl rule__Insult__Group__2 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:300:2: rule__Insult__Group__1__Impl rule__Insult__Group__2
            {
            pushFollow(FOLLOW_rule__Insult__Group__1__Impl_in_rule__Insult__Group__1547);
            rule__Insult__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Insult__Group__2_in_rule__Insult__Group__1550);
            rule__Insult__Group__2();

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
    // $ANTLR end "rule__Insult__Group__1"


    // $ANTLR start "rule__Insult__Group__1__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:307:1: rule__Insult__Group__1__Impl : ( ( rule__Insult__NameAssignment_1 ) ) ;
    public final void rule__Insult__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:311:1: ( ( ( rule__Insult__NameAssignment_1 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:312:1: ( ( rule__Insult__NameAssignment_1 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:312:1: ( ( rule__Insult__NameAssignment_1 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:313:1: ( rule__Insult__NameAssignment_1 )
            {
             before(grammarAccess.getInsultAccess().getNameAssignment_1()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:314:1: ( rule__Insult__NameAssignment_1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:314:2: rule__Insult__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Insult__NameAssignment_1_in_rule__Insult__Group__1__Impl577);
            rule__Insult__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInsultAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Insult__Group__1__Impl"


    // $ANTLR start "rule__Insult__Group__2"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:324:1: rule__Insult__Group__2 : rule__Insult__Group__2__Impl ;
    public final void rule__Insult__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:328:1: ( rule__Insult__Group__2__Impl )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:329:2: rule__Insult__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Insult__Group__2__Impl_in_rule__Insult__Group__2607);
            rule__Insult__Group__2__Impl();

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
    // $ANTLR end "rule__Insult__Group__2"


    // $ANTLR start "rule__Insult__Group__2__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:335:1: rule__Insult__Group__2__Impl : ( '!' ) ;
    public final void rule__Insult__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:339:1: ( ( '!' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:340:1: ( '!' )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:340:1: ( '!' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:341:1: '!'
            {
             before(grammarAccess.getInsultAccess().getExclamationMarkKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Insult__Group__2__Impl635); 
             after(grammarAccess.getInsultAccess().getExclamationMarkKeyword_2()); 

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
    // $ANTLR end "rule__Insult__Group__2__Impl"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:361:1: rule__Model__GreetingsAssignment : ( ( rule__Model__GreetingsAlternatives_0 ) ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:365:1: ( ( ( rule__Model__GreetingsAlternatives_0 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:366:1: ( ( rule__Model__GreetingsAlternatives_0 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:366:1: ( ( rule__Model__GreetingsAlternatives_0 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:367:1: ( rule__Model__GreetingsAlternatives_0 )
            {
             before(grammarAccess.getModelAccess().getGreetingsAlternatives_0()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:368:1: ( rule__Model__GreetingsAlternatives_0 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:368:2: rule__Model__GreetingsAlternatives_0
            {
            pushFollow(FOLLOW_rule__Model__GreetingsAlternatives_0_in_rule__Model__GreetingsAssignment677);
            rule__Model__GreetingsAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGreetingsAlternatives_0()); 

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
    // $ANTLR end "rule__Model__GreetingsAssignment"


    // $ANTLR start "rule__Greeting__NameAssignment_1"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:377:1: rule__Greeting__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Greeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:381:1: ( ( RULE_ID ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:382:1: ( RULE_ID )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:382:1: ( RULE_ID )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:383:1: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_1710); 
             after(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Greeting__NameAssignment_1"


    // $ANTLR start "rule__Insult__NameAssignment_1"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:392:1: rule__Insult__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Insult__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:396:1: ( ( RULE_ID ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:397:1: ( RULE_ID )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:397:1: ( RULE_ID )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:398:1: RULE_ID
            {
             before(grammarAccess.getInsultAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Insult__NameAssignment_1741); 
             after(grammarAccess.getInsultAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Insult__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__0_in_ruleGreeting155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsult_in_entryRuleInsult182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsult189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Insult__Group__0_in_ruleInsult215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_rule__Model__GreetingsAlternatives_0251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsult_in_rule__Model__GreetingsAlternatives_0268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__0__Impl_in_rule__Greeting__Group__0298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Greeting__Group__1_in_rule__Greeting__Group__0301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Greeting__Group__0__Impl329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__1__Impl_in_rule__Greeting__Group__1360 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Greeting__Group__2_in_rule__Greeting__Group__1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__NameAssignment_1_in_rule__Greeting__Group__1__Impl390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__2__Impl_in_rule__Greeting__Group__2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Greeting__Group__2__Impl448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Insult__Group__0__Impl_in_rule__Insult__Group__0485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Insult__Group__1_in_rule__Insult__Group__0488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Insult__Group__0__Impl516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Insult__Group__1__Impl_in_rule__Insult__Group__1547 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Insult__Group__2_in_rule__Insult__Group__1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Insult__NameAssignment_1_in_rule__Insult__Group__1__Impl577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Insult__Group__2__Impl_in_rule__Insult__Group__2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Insult__Group__2__Impl635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GreetingsAlternatives_0_in_rule__Model__GreetingsAssignment677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Insult__NameAssignment_1741 = new BitSet(new long[]{0x0000000000000002L});

}