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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'left'", "'right'", "'sharp45'", "'sharp90'", "'easy45'", "'easy90'", "'RollerCoaster'", "'Straight'", "'Corner'", "'Cart'", "'powered'", "'-'"
    };
    public static final int RULE_ID=4;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:69:1: ruleModel : ( ( rule__Model__RollerCoasterAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:73:2: ( ( ( rule__Model__RollerCoasterAssignment ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:74:1: ( ( rule__Model__RollerCoasterAssignment ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:74:1: ( ( rule__Model__RollerCoasterAssignment ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:75:1: ( rule__Model__RollerCoasterAssignment )
            {
             before(grammarAccess.getModelAccess().getRollerCoasterAssignment()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:76:1: ( rule__Model__RollerCoasterAssignment )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:76:2: rule__Model__RollerCoasterAssignment
            {
            pushFollow(FOLLOW_rule__Model__RollerCoasterAssignment_in_ruleModel94);
            rule__Model__RollerCoasterAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getRollerCoasterAssignment()); 

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


    // $ANTLR start "entryRuleRollerCoaster"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:88:1: entryRuleRollerCoaster : ruleRollerCoaster EOF ;
    public final void entryRuleRollerCoaster() throws RecognitionException {
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:89:1: ( ruleRollerCoaster EOF )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:90:1: ruleRollerCoaster EOF
            {
             before(grammarAccess.getRollerCoasterRule()); 
            pushFollow(FOLLOW_ruleRollerCoaster_in_entryRuleRollerCoaster121);
            ruleRollerCoaster();

            state._fsp--;

             after(grammarAccess.getRollerCoasterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRollerCoaster128); 

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
    // $ANTLR end "entryRuleRollerCoaster"


    // $ANTLR start "ruleRollerCoaster"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:97:1: ruleRollerCoaster : ( ( rule__RollerCoaster__Group__0 ) ) ;
    public final void ruleRollerCoaster() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:101:2: ( ( ( rule__RollerCoaster__Group__0 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:102:1: ( ( rule__RollerCoaster__Group__0 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:102:1: ( ( rule__RollerCoaster__Group__0 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:103:1: ( rule__RollerCoaster__Group__0 )
            {
             before(grammarAccess.getRollerCoasterAccess().getGroup()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:104:1: ( rule__RollerCoaster__Group__0 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:104:2: rule__RollerCoaster__Group__0
            {
            pushFollow(FOLLOW_rule__RollerCoaster__Group__0_in_ruleRollerCoaster154);
            rule__RollerCoaster__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRollerCoasterAccess().getGroup()); 

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
    // $ANTLR end "ruleRollerCoaster"


    // $ANTLR start "entryRuleStraight"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:116:1: entryRuleStraight : ruleStraight EOF ;
    public final void entryRuleStraight() throws RecognitionException {
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:117:1: ( ruleStraight EOF )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:118:1: ruleStraight EOF
            {
             before(grammarAccess.getStraightRule()); 
            pushFollow(FOLLOW_ruleStraight_in_entryRuleStraight181);
            ruleStraight();

            state._fsp--;

             after(grammarAccess.getStraightRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStraight188); 

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
    // $ANTLR end "entryRuleStraight"


    // $ANTLR start "ruleStraight"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:125:1: ruleStraight : ( ( rule__Straight__Group__0 ) ) ;
    public final void ruleStraight() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:129:2: ( ( ( rule__Straight__Group__0 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:130:1: ( ( rule__Straight__Group__0 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:130:1: ( ( rule__Straight__Group__0 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:131:1: ( rule__Straight__Group__0 )
            {
             before(grammarAccess.getStraightAccess().getGroup()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:132:1: ( rule__Straight__Group__0 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:132:2: rule__Straight__Group__0
            {
            pushFollow(FOLLOW_rule__Straight__Group__0_in_ruleStraight214);
            rule__Straight__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStraightAccess().getGroup()); 

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
    // $ANTLR end "ruleStraight"


    // $ANTLR start "entryRuleCorner"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:144:1: entryRuleCorner : ruleCorner EOF ;
    public final void entryRuleCorner() throws RecognitionException {
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:145:1: ( ruleCorner EOF )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:146:1: ruleCorner EOF
            {
             before(grammarAccess.getCornerRule()); 
            pushFollow(FOLLOW_ruleCorner_in_entryRuleCorner241);
            ruleCorner();

            state._fsp--;

             after(grammarAccess.getCornerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCorner248); 

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
    // $ANTLR end "entryRuleCorner"


    // $ANTLR start "ruleCorner"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:153:1: ruleCorner : ( ( rule__Corner__Group__0 ) ) ;
    public final void ruleCorner() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:157:2: ( ( ( rule__Corner__Group__0 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:158:1: ( ( rule__Corner__Group__0 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:158:1: ( ( rule__Corner__Group__0 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:159:1: ( rule__Corner__Group__0 )
            {
             before(grammarAccess.getCornerAccess().getGroup()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:160:1: ( rule__Corner__Group__0 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:160:2: rule__Corner__Group__0
            {
            pushFollow(FOLLOW_rule__Corner__Group__0_in_ruleCorner274);
            rule__Corner__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCornerAccess().getGroup()); 

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
    // $ANTLR end "ruleCorner"


    // $ANTLR start "entryRuleCart"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:172:1: entryRuleCart : ruleCart EOF ;
    public final void entryRuleCart() throws RecognitionException {
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:173:1: ( ruleCart EOF )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:174:1: ruleCart EOF
            {
             before(grammarAccess.getCartRule()); 
            pushFollow(FOLLOW_ruleCart_in_entryRuleCart301);
            ruleCart();

            state._fsp--;

             after(grammarAccess.getCartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCart308); 

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
    // $ANTLR end "entryRuleCart"


    // $ANTLR start "ruleCart"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:181:1: ruleCart : ( ( rule__Cart__Group__0 ) ) ;
    public final void ruleCart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:185:2: ( ( ( rule__Cart__Group__0 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:186:1: ( ( rule__Cart__Group__0 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:186:1: ( ( rule__Cart__Group__0 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:187:1: ( rule__Cart__Group__0 )
            {
             before(grammarAccess.getCartAccess().getGroup()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:188:1: ( rule__Cart__Group__0 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:188:2: rule__Cart__Group__0
            {
            pushFollow(FOLLOW_rule__Cart__Group__0_in_ruleCart334);
            rule__Cart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCartAccess().getGroup()); 

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
    // $ANTLR end "ruleCart"


    // $ANTLR start "entryRuleSignedInt"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:200:1: entryRuleSignedInt : ruleSignedInt EOF ;
    public final void entryRuleSignedInt() throws RecognitionException {
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:201:1: ( ruleSignedInt EOF )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:202:1: ruleSignedInt EOF
            {
             before(grammarAccess.getSignedIntRule()); 
            pushFollow(FOLLOW_ruleSignedInt_in_entryRuleSignedInt361);
            ruleSignedInt();

            state._fsp--;

             after(grammarAccess.getSignedIntRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedInt368); 

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
    // $ANTLR end "entryRuleSignedInt"


    // $ANTLR start "ruleSignedInt"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:209:1: ruleSignedInt : ( ( rule__SignedInt__Group__0 ) ) ;
    public final void ruleSignedInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:213:2: ( ( ( rule__SignedInt__Group__0 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:214:1: ( ( rule__SignedInt__Group__0 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:214:1: ( ( rule__SignedInt__Group__0 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:215:1: ( rule__SignedInt__Group__0 )
            {
             before(grammarAccess.getSignedIntAccess().getGroup()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:216:1: ( rule__SignedInt__Group__0 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:216:2: rule__SignedInt__Group__0
            {
            pushFollow(FOLLOW_rule__SignedInt__Group__0_in_ruleSignedInt394);
            rule__SignedInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignedIntAccess().getGroup()); 

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
    // $ANTLR end "ruleSignedInt"


    // $ANTLR start "rule__RollerCoaster__TrackAlternatives_2_0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:228:1: rule__RollerCoaster__TrackAlternatives_2_0 : ( ( ruleStraight ) | ( ruleCorner ) );
    public final void rule__RollerCoaster__TrackAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:232:1: ( ( ruleStraight ) | ( ruleCorner ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            else if ( (LA1_0==19) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:233:1: ( ruleStraight )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:233:1: ( ruleStraight )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:234:1: ruleStraight
                    {
                     before(grammarAccess.getRollerCoasterAccess().getTrackStraightParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_ruleStraight_in_rule__RollerCoaster__TrackAlternatives_2_0430);
                    ruleStraight();

                    state._fsp--;

                     after(grammarAccess.getRollerCoasterAccess().getTrackStraightParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:239:6: ( ruleCorner )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:239:6: ( ruleCorner )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:240:1: ruleCorner
                    {
                     before(grammarAccess.getRollerCoasterAccess().getTrackCornerParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_ruleCorner_in_rule__RollerCoaster__TrackAlternatives_2_0447);
                    ruleCorner();

                    state._fsp--;

                     after(grammarAccess.getRollerCoasterAccess().getTrackCornerParserRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__RollerCoaster__TrackAlternatives_2_0"


    // $ANTLR start "rule__Corner__DirectionAlternatives_2_0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:250:1: rule__Corner__DirectionAlternatives_2_0 : ( ( 'left' ) | ( 'right' ) );
    public final void rule__Corner__DirectionAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:254:1: ( ( 'left' ) | ( 'right' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:255:1: ( 'left' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:255:1: ( 'left' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:256:1: 'left'
                    {
                     before(grammarAccess.getCornerAccess().getDirectionLeftKeyword_2_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Corner__DirectionAlternatives_2_0480); 
                     after(grammarAccess.getCornerAccess().getDirectionLeftKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:263:6: ( 'right' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:263:6: ( 'right' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:264:1: 'right'
                    {
                     before(grammarAccess.getCornerAccess().getDirectionRightKeyword_2_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Corner__DirectionAlternatives_2_0500); 
                     after(grammarAccess.getCornerAccess().getDirectionRightKeyword_2_0_1()); 

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
    // $ANTLR end "rule__Corner__DirectionAlternatives_2_0"


    // $ANTLR start "rule__Corner__TypeAlternatives_3_0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:276:1: rule__Corner__TypeAlternatives_3_0 : ( ( 'sharp45' ) | ( 'sharp90' ) | ( 'easy45' ) | ( 'easy90' ) );
    public final void rule__Corner__TypeAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:280:1: ( ( 'sharp45' ) | ( 'sharp90' ) | ( 'easy45' ) | ( 'easy90' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:281:1: ( 'sharp45' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:281:1: ( 'sharp45' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:282:1: 'sharp45'
                    {
                     before(grammarAccess.getCornerAccess().getTypeSharp45Keyword_3_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__Corner__TypeAlternatives_3_0535); 
                     after(grammarAccess.getCornerAccess().getTypeSharp45Keyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:289:6: ( 'sharp90' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:289:6: ( 'sharp90' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:290:1: 'sharp90'
                    {
                     before(grammarAccess.getCornerAccess().getTypeSharp90Keyword_3_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__Corner__TypeAlternatives_3_0555); 
                     after(grammarAccess.getCornerAccess().getTypeSharp90Keyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:297:6: ( 'easy45' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:297:6: ( 'easy45' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:298:1: 'easy45'
                    {
                     before(grammarAccess.getCornerAccess().getTypeEasy45Keyword_3_0_2()); 
                    match(input,15,FOLLOW_15_in_rule__Corner__TypeAlternatives_3_0575); 
                     after(grammarAccess.getCornerAccess().getTypeEasy45Keyword_3_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:305:6: ( 'easy90' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:305:6: ( 'easy90' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:306:1: 'easy90'
                    {
                     before(grammarAccess.getCornerAccess().getTypeEasy90Keyword_3_0_3()); 
                    match(input,16,FOLLOW_16_in_rule__Corner__TypeAlternatives_3_0595); 
                     after(grammarAccess.getCornerAccess().getTypeEasy90Keyword_3_0_3()); 

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
    // $ANTLR end "rule__Corner__TypeAlternatives_3_0"


    // $ANTLR start "rule__RollerCoaster__Group__0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:320:1: rule__RollerCoaster__Group__0 : rule__RollerCoaster__Group__0__Impl rule__RollerCoaster__Group__1 ;
    public final void rule__RollerCoaster__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:324:1: ( rule__RollerCoaster__Group__0__Impl rule__RollerCoaster__Group__1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:325:2: rule__RollerCoaster__Group__0__Impl rule__RollerCoaster__Group__1
            {
            pushFollow(FOLLOW_rule__RollerCoaster__Group__0__Impl_in_rule__RollerCoaster__Group__0627);
            rule__RollerCoaster__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RollerCoaster__Group__1_in_rule__RollerCoaster__Group__0630);
            rule__RollerCoaster__Group__1();

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
    // $ANTLR end "rule__RollerCoaster__Group__0"


    // $ANTLR start "rule__RollerCoaster__Group__0__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:332:1: rule__RollerCoaster__Group__0__Impl : ( 'RollerCoaster' ) ;
    public final void rule__RollerCoaster__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:336:1: ( ( 'RollerCoaster' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:337:1: ( 'RollerCoaster' )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:337:1: ( 'RollerCoaster' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:338:1: 'RollerCoaster'
            {
             before(grammarAccess.getRollerCoasterAccess().getRollerCoasterKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__RollerCoaster__Group__0__Impl658); 
             after(grammarAccess.getRollerCoasterAccess().getRollerCoasterKeyword_0()); 

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
    // $ANTLR end "rule__RollerCoaster__Group__0__Impl"


    // $ANTLR start "rule__RollerCoaster__Group__1"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:351:1: rule__RollerCoaster__Group__1 : rule__RollerCoaster__Group__1__Impl rule__RollerCoaster__Group__2 ;
    public final void rule__RollerCoaster__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:355:1: ( rule__RollerCoaster__Group__1__Impl rule__RollerCoaster__Group__2 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:356:2: rule__RollerCoaster__Group__1__Impl rule__RollerCoaster__Group__2
            {
            pushFollow(FOLLOW_rule__RollerCoaster__Group__1__Impl_in_rule__RollerCoaster__Group__1689);
            rule__RollerCoaster__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RollerCoaster__Group__2_in_rule__RollerCoaster__Group__1692);
            rule__RollerCoaster__Group__2();

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
    // $ANTLR end "rule__RollerCoaster__Group__1"


    // $ANTLR start "rule__RollerCoaster__Group__1__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:363:1: rule__RollerCoaster__Group__1__Impl : ( ( rule__RollerCoaster__NameAssignment_1 ) ) ;
    public final void rule__RollerCoaster__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:367:1: ( ( ( rule__RollerCoaster__NameAssignment_1 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:368:1: ( ( rule__RollerCoaster__NameAssignment_1 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:368:1: ( ( rule__RollerCoaster__NameAssignment_1 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:369:1: ( rule__RollerCoaster__NameAssignment_1 )
            {
             before(grammarAccess.getRollerCoasterAccess().getNameAssignment_1()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:370:1: ( rule__RollerCoaster__NameAssignment_1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:370:2: rule__RollerCoaster__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RollerCoaster__NameAssignment_1_in_rule__RollerCoaster__Group__1__Impl719);
            rule__RollerCoaster__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRollerCoasterAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__RollerCoaster__Group__1__Impl"


    // $ANTLR start "rule__RollerCoaster__Group__2"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:380:1: rule__RollerCoaster__Group__2 : rule__RollerCoaster__Group__2__Impl rule__RollerCoaster__Group__3 ;
    public final void rule__RollerCoaster__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:384:1: ( rule__RollerCoaster__Group__2__Impl rule__RollerCoaster__Group__3 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:385:2: rule__RollerCoaster__Group__2__Impl rule__RollerCoaster__Group__3
            {
            pushFollow(FOLLOW_rule__RollerCoaster__Group__2__Impl_in_rule__RollerCoaster__Group__2749);
            rule__RollerCoaster__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RollerCoaster__Group__3_in_rule__RollerCoaster__Group__2752);
            rule__RollerCoaster__Group__3();

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
    // $ANTLR end "rule__RollerCoaster__Group__2"


    // $ANTLR start "rule__RollerCoaster__Group__2__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:392:1: rule__RollerCoaster__Group__2__Impl : ( ( rule__RollerCoaster__TrackAssignment_2 )* ) ;
    public final void rule__RollerCoaster__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:396:1: ( ( ( rule__RollerCoaster__TrackAssignment_2 )* ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:397:1: ( ( rule__RollerCoaster__TrackAssignment_2 )* )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:397:1: ( ( rule__RollerCoaster__TrackAssignment_2 )* )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:398:1: ( rule__RollerCoaster__TrackAssignment_2 )*
            {
             before(grammarAccess.getRollerCoasterAccess().getTrackAssignment_2()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:399:1: ( rule__RollerCoaster__TrackAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=18 && LA4_0<=19)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:399:2: rule__RollerCoaster__TrackAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__RollerCoaster__TrackAssignment_2_in_rule__RollerCoaster__Group__2__Impl779);
            	    rule__RollerCoaster__TrackAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRollerCoasterAccess().getTrackAssignment_2()); 

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
    // $ANTLR end "rule__RollerCoaster__Group__2__Impl"


    // $ANTLR start "rule__RollerCoaster__Group__3"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:409:1: rule__RollerCoaster__Group__3 : rule__RollerCoaster__Group__3__Impl rule__RollerCoaster__Group__4 ;
    public final void rule__RollerCoaster__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:413:1: ( rule__RollerCoaster__Group__3__Impl rule__RollerCoaster__Group__4 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:414:2: rule__RollerCoaster__Group__3__Impl rule__RollerCoaster__Group__4
            {
            pushFollow(FOLLOW_rule__RollerCoaster__Group__3__Impl_in_rule__RollerCoaster__Group__3810);
            rule__RollerCoaster__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RollerCoaster__Group__4_in_rule__RollerCoaster__Group__3813);
            rule__RollerCoaster__Group__4();

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
    // $ANTLR end "rule__RollerCoaster__Group__3"


    // $ANTLR start "rule__RollerCoaster__Group__3__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:421:1: rule__RollerCoaster__Group__3__Impl : ( ( rule__RollerCoaster__CartAssignment_3 )* ) ;
    public final void rule__RollerCoaster__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:425:1: ( ( ( rule__RollerCoaster__CartAssignment_3 )* ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:426:1: ( ( rule__RollerCoaster__CartAssignment_3 )* )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:426:1: ( ( rule__RollerCoaster__CartAssignment_3 )* )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:427:1: ( rule__RollerCoaster__CartAssignment_3 )*
            {
             before(grammarAccess.getRollerCoasterAccess().getCartAssignment_3()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:428:1: ( rule__RollerCoaster__CartAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:428:2: rule__RollerCoaster__CartAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__RollerCoaster__CartAssignment_3_in_rule__RollerCoaster__Group__3__Impl840);
            	    rule__RollerCoaster__CartAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRollerCoasterAccess().getCartAssignment_3()); 

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
    // $ANTLR end "rule__RollerCoaster__Group__3__Impl"


    // $ANTLR start "rule__RollerCoaster__Group__4"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:438:1: rule__RollerCoaster__Group__4 : rule__RollerCoaster__Group__4__Impl ;
    public final void rule__RollerCoaster__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:442:1: ( rule__RollerCoaster__Group__4__Impl )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:443:2: rule__RollerCoaster__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RollerCoaster__Group__4__Impl_in_rule__RollerCoaster__Group__4871);
            rule__RollerCoaster__Group__4__Impl();

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
    // $ANTLR end "rule__RollerCoaster__Group__4"


    // $ANTLR start "rule__RollerCoaster__Group__4__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:449:1: rule__RollerCoaster__Group__4__Impl : ( ( rule__RollerCoaster__TrackUnitLengthAssignment_4 ) ) ;
    public final void rule__RollerCoaster__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:453:1: ( ( ( rule__RollerCoaster__TrackUnitLengthAssignment_4 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:454:1: ( ( rule__RollerCoaster__TrackUnitLengthAssignment_4 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:454:1: ( ( rule__RollerCoaster__TrackUnitLengthAssignment_4 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:455:1: ( rule__RollerCoaster__TrackUnitLengthAssignment_4 )
            {
             before(grammarAccess.getRollerCoasterAccess().getTrackUnitLengthAssignment_4()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:456:1: ( rule__RollerCoaster__TrackUnitLengthAssignment_4 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:456:2: rule__RollerCoaster__TrackUnitLengthAssignment_4
            {
            pushFollow(FOLLOW_rule__RollerCoaster__TrackUnitLengthAssignment_4_in_rule__RollerCoaster__Group__4__Impl898);
            rule__RollerCoaster__TrackUnitLengthAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRollerCoasterAccess().getTrackUnitLengthAssignment_4()); 

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
    // $ANTLR end "rule__RollerCoaster__Group__4__Impl"


    // $ANTLR start "rule__Straight__Group__0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:476:1: rule__Straight__Group__0 : rule__Straight__Group__0__Impl rule__Straight__Group__1 ;
    public final void rule__Straight__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:480:1: ( rule__Straight__Group__0__Impl rule__Straight__Group__1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:481:2: rule__Straight__Group__0__Impl rule__Straight__Group__1
            {
            pushFollow(FOLLOW_rule__Straight__Group__0__Impl_in_rule__Straight__Group__0938);
            rule__Straight__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Straight__Group__1_in_rule__Straight__Group__0941);
            rule__Straight__Group__1();

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
    // $ANTLR end "rule__Straight__Group__0"


    // $ANTLR start "rule__Straight__Group__0__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:488:1: rule__Straight__Group__0__Impl : ( 'Straight' ) ;
    public final void rule__Straight__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:492:1: ( ( 'Straight' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:493:1: ( 'Straight' )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:493:1: ( 'Straight' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:494:1: 'Straight'
            {
             before(grammarAccess.getStraightAccess().getStraightKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Straight__Group__0__Impl969); 
             after(grammarAccess.getStraightAccess().getStraightKeyword_0()); 

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
    // $ANTLR end "rule__Straight__Group__0__Impl"


    // $ANTLR start "rule__Straight__Group__1"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:507:1: rule__Straight__Group__1 : rule__Straight__Group__1__Impl rule__Straight__Group__2 ;
    public final void rule__Straight__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:511:1: ( rule__Straight__Group__1__Impl rule__Straight__Group__2 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:512:2: rule__Straight__Group__1__Impl rule__Straight__Group__2
            {
            pushFollow(FOLLOW_rule__Straight__Group__1__Impl_in_rule__Straight__Group__11000);
            rule__Straight__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Straight__Group__2_in_rule__Straight__Group__11003);
            rule__Straight__Group__2();

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
    // $ANTLR end "rule__Straight__Group__1"


    // $ANTLR start "rule__Straight__Group__1__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:519:1: rule__Straight__Group__1__Impl : ( ( rule__Straight__NameAssignment_1 ) ) ;
    public final void rule__Straight__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:523:1: ( ( ( rule__Straight__NameAssignment_1 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:524:1: ( ( rule__Straight__NameAssignment_1 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:524:1: ( ( rule__Straight__NameAssignment_1 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:525:1: ( rule__Straight__NameAssignment_1 )
            {
             before(grammarAccess.getStraightAccess().getNameAssignment_1()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:526:1: ( rule__Straight__NameAssignment_1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:526:2: rule__Straight__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Straight__NameAssignment_1_in_rule__Straight__Group__1__Impl1030);
            rule__Straight__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStraightAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Straight__Group__1__Impl"


    // $ANTLR start "rule__Straight__Group__2"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:536:1: rule__Straight__Group__2 : rule__Straight__Group__2__Impl rule__Straight__Group__3 ;
    public final void rule__Straight__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:540:1: ( rule__Straight__Group__2__Impl rule__Straight__Group__3 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:541:2: rule__Straight__Group__2__Impl rule__Straight__Group__3
            {
            pushFollow(FOLLOW_rule__Straight__Group__2__Impl_in_rule__Straight__Group__21060);
            rule__Straight__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Straight__Group__3_in_rule__Straight__Group__21063);
            rule__Straight__Group__3();

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
    // $ANTLR end "rule__Straight__Group__2"


    // $ANTLR start "rule__Straight__Group__2__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:548:1: rule__Straight__Group__2__Impl : ( ( rule__Straight__PoweredAssignment_2 )? ) ;
    public final void rule__Straight__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:552:1: ( ( ( rule__Straight__PoweredAssignment_2 )? ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:553:1: ( ( rule__Straight__PoweredAssignment_2 )? )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:553:1: ( ( rule__Straight__PoweredAssignment_2 )? )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:554:1: ( rule__Straight__PoweredAssignment_2 )?
            {
             before(grammarAccess.getStraightAccess().getPoweredAssignment_2()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:555:1: ( rule__Straight__PoweredAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:555:2: rule__Straight__PoweredAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Straight__PoweredAssignment_2_in_rule__Straight__Group__2__Impl1090);
                    rule__Straight__PoweredAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStraightAccess().getPoweredAssignment_2()); 

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
    // $ANTLR end "rule__Straight__Group__2__Impl"


    // $ANTLR start "rule__Straight__Group__3"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:565:1: rule__Straight__Group__3 : rule__Straight__Group__3__Impl rule__Straight__Group__4 ;
    public final void rule__Straight__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:569:1: ( rule__Straight__Group__3__Impl rule__Straight__Group__4 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:570:2: rule__Straight__Group__3__Impl rule__Straight__Group__4
            {
            pushFollow(FOLLOW_rule__Straight__Group__3__Impl_in_rule__Straight__Group__31121);
            rule__Straight__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Straight__Group__4_in_rule__Straight__Group__31124);
            rule__Straight__Group__4();

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
    // $ANTLR end "rule__Straight__Group__3"


    // $ANTLR start "rule__Straight__Group__3__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:577:1: rule__Straight__Group__3__Impl : ( ( rule__Straight__LengthAssignment_3 ) ) ;
    public final void rule__Straight__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:581:1: ( ( ( rule__Straight__LengthAssignment_3 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:582:1: ( ( rule__Straight__LengthAssignment_3 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:582:1: ( ( rule__Straight__LengthAssignment_3 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:583:1: ( rule__Straight__LengthAssignment_3 )
            {
             before(grammarAccess.getStraightAccess().getLengthAssignment_3()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:584:1: ( rule__Straight__LengthAssignment_3 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:584:2: rule__Straight__LengthAssignment_3
            {
            pushFollow(FOLLOW_rule__Straight__LengthAssignment_3_in_rule__Straight__Group__3__Impl1151);
            rule__Straight__LengthAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStraightAccess().getLengthAssignment_3()); 

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
    // $ANTLR end "rule__Straight__Group__3__Impl"


    // $ANTLR start "rule__Straight__Group__4"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:594:1: rule__Straight__Group__4 : rule__Straight__Group__4__Impl ;
    public final void rule__Straight__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:598:1: ( rule__Straight__Group__4__Impl )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:599:2: rule__Straight__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Straight__Group__4__Impl_in_rule__Straight__Group__41181);
            rule__Straight__Group__4__Impl();

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
    // $ANTLR end "rule__Straight__Group__4"


    // $ANTLR start "rule__Straight__Group__4__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:605:1: rule__Straight__Group__4__Impl : ( ( rule__Straight__ElevationChangeAssignment_4 )? ) ;
    public final void rule__Straight__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:609:1: ( ( ( rule__Straight__ElevationChangeAssignment_4 )? ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:610:1: ( ( rule__Straight__ElevationChangeAssignment_4 )? )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:610:1: ( ( rule__Straight__ElevationChangeAssignment_4 )? )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:611:1: ( rule__Straight__ElevationChangeAssignment_4 )?
            {
             before(grammarAccess.getStraightAccess().getElevationChangeAssignment_4()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:612:1: ( rule__Straight__ElevationChangeAssignment_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INT) ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==EOF) ) {
                    int LA7_4 = input.LA(3);

                    if ( (LA7_4==EOF) ) {
                        alt7=1;
                    }
                }
                else if ( (LA7_2==RULE_INT||(LA7_2>=18 && LA7_2<=20)) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:612:2: rule__Straight__ElevationChangeAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Straight__ElevationChangeAssignment_4_in_rule__Straight__Group__4__Impl1208);
                    rule__Straight__ElevationChangeAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStraightAccess().getElevationChangeAssignment_4()); 

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
    // $ANTLR end "rule__Straight__Group__4__Impl"


    // $ANTLR start "rule__Corner__Group__0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:632:1: rule__Corner__Group__0 : rule__Corner__Group__0__Impl rule__Corner__Group__1 ;
    public final void rule__Corner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:636:1: ( rule__Corner__Group__0__Impl rule__Corner__Group__1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:637:2: rule__Corner__Group__0__Impl rule__Corner__Group__1
            {
            pushFollow(FOLLOW_rule__Corner__Group__0__Impl_in_rule__Corner__Group__01249);
            rule__Corner__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Corner__Group__1_in_rule__Corner__Group__01252);
            rule__Corner__Group__1();

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
    // $ANTLR end "rule__Corner__Group__0"


    // $ANTLR start "rule__Corner__Group__0__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:644:1: rule__Corner__Group__0__Impl : ( 'Corner' ) ;
    public final void rule__Corner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:648:1: ( ( 'Corner' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:649:1: ( 'Corner' )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:649:1: ( 'Corner' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:650:1: 'Corner'
            {
             before(grammarAccess.getCornerAccess().getCornerKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Corner__Group__0__Impl1280); 
             after(grammarAccess.getCornerAccess().getCornerKeyword_0()); 

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
    // $ANTLR end "rule__Corner__Group__0__Impl"


    // $ANTLR start "rule__Corner__Group__1"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:663:1: rule__Corner__Group__1 : rule__Corner__Group__1__Impl rule__Corner__Group__2 ;
    public final void rule__Corner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:667:1: ( rule__Corner__Group__1__Impl rule__Corner__Group__2 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:668:2: rule__Corner__Group__1__Impl rule__Corner__Group__2
            {
            pushFollow(FOLLOW_rule__Corner__Group__1__Impl_in_rule__Corner__Group__11311);
            rule__Corner__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Corner__Group__2_in_rule__Corner__Group__11314);
            rule__Corner__Group__2();

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
    // $ANTLR end "rule__Corner__Group__1"


    // $ANTLR start "rule__Corner__Group__1__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:675:1: rule__Corner__Group__1__Impl : ( ( rule__Corner__NameAssignment_1 ) ) ;
    public final void rule__Corner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:679:1: ( ( ( rule__Corner__NameAssignment_1 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:680:1: ( ( rule__Corner__NameAssignment_1 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:680:1: ( ( rule__Corner__NameAssignment_1 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:681:1: ( rule__Corner__NameAssignment_1 )
            {
             before(grammarAccess.getCornerAccess().getNameAssignment_1()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:682:1: ( rule__Corner__NameAssignment_1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:682:2: rule__Corner__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Corner__NameAssignment_1_in_rule__Corner__Group__1__Impl1341);
            rule__Corner__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCornerAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Corner__Group__1__Impl"


    // $ANTLR start "rule__Corner__Group__2"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:692:1: rule__Corner__Group__2 : rule__Corner__Group__2__Impl rule__Corner__Group__3 ;
    public final void rule__Corner__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:696:1: ( rule__Corner__Group__2__Impl rule__Corner__Group__3 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:697:2: rule__Corner__Group__2__Impl rule__Corner__Group__3
            {
            pushFollow(FOLLOW_rule__Corner__Group__2__Impl_in_rule__Corner__Group__21371);
            rule__Corner__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Corner__Group__3_in_rule__Corner__Group__21374);
            rule__Corner__Group__3();

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
    // $ANTLR end "rule__Corner__Group__2"


    // $ANTLR start "rule__Corner__Group__2__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:704:1: rule__Corner__Group__2__Impl : ( ( rule__Corner__DirectionAssignment_2 ) ) ;
    public final void rule__Corner__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:708:1: ( ( ( rule__Corner__DirectionAssignment_2 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:709:1: ( ( rule__Corner__DirectionAssignment_2 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:709:1: ( ( rule__Corner__DirectionAssignment_2 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:710:1: ( rule__Corner__DirectionAssignment_2 )
            {
             before(grammarAccess.getCornerAccess().getDirectionAssignment_2()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:711:1: ( rule__Corner__DirectionAssignment_2 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:711:2: rule__Corner__DirectionAssignment_2
            {
            pushFollow(FOLLOW_rule__Corner__DirectionAssignment_2_in_rule__Corner__Group__2__Impl1401);
            rule__Corner__DirectionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCornerAccess().getDirectionAssignment_2()); 

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
    // $ANTLR end "rule__Corner__Group__2__Impl"


    // $ANTLR start "rule__Corner__Group__3"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:721:1: rule__Corner__Group__3 : rule__Corner__Group__3__Impl ;
    public final void rule__Corner__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:725:1: ( rule__Corner__Group__3__Impl )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:726:2: rule__Corner__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Corner__Group__3__Impl_in_rule__Corner__Group__31431);
            rule__Corner__Group__3__Impl();

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
    // $ANTLR end "rule__Corner__Group__3"


    // $ANTLR start "rule__Corner__Group__3__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:732:1: rule__Corner__Group__3__Impl : ( ( rule__Corner__TypeAssignment_3 ) ) ;
    public final void rule__Corner__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:736:1: ( ( ( rule__Corner__TypeAssignment_3 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:737:1: ( ( rule__Corner__TypeAssignment_3 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:737:1: ( ( rule__Corner__TypeAssignment_3 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:738:1: ( rule__Corner__TypeAssignment_3 )
            {
             before(grammarAccess.getCornerAccess().getTypeAssignment_3()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:739:1: ( rule__Corner__TypeAssignment_3 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:739:2: rule__Corner__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Corner__TypeAssignment_3_in_rule__Corner__Group__3__Impl1458);
            rule__Corner__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCornerAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Corner__Group__3__Impl"


    // $ANTLR start "rule__Cart__Group__0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:757:1: rule__Cart__Group__0 : rule__Cart__Group__0__Impl rule__Cart__Group__1 ;
    public final void rule__Cart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:761:1: ( rule__Cart__Group__0__Impl rule__Cart__Group__1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:762:2: rule__Cart__Group__0__Impl rule__Cart__Group__1
            {
            pushFollow(FOLLOW_rule__Cart__Group__0__Impl_in_rule__Cart__Group__01496);
            rule__Cart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cart__Group__1_in_rule__Cart__Group__01499);
            rule__Cart__Group__1();

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
    // $ANTLR end "rule__Cart__Group__0"


    // $ANTLR start "rule__Cart__Group__0__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:769:1: rule__Cart__Group__0__Impl : ( 'Cart' ) ;
    public final void rule__Cart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:773:1: ( ( 'Cart' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:774:1: ( 'Cart' )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:774:1: ( 'Cart' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:775:1: 'Cart'
            {
             before(grammarAccess.getCartAccess().getCartKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Cart__Group__0__Impl1527); 
             after(grammarAccess.getCartAccess().getCartKeyword_0()); 

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
    // $ANTLR end "rule__Cart__Group__0__Impl"


    // $ANTLR start "rule__Cart__Group__1"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:788:1: rule__Cart__Group__1 : rule__Cart__Group__1__Impl ;
    public final void rule__Cart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:792:1: ( rule__Cart__Group__1__Impl )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:793:2: rule__Cart__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Cart__Group__1__Impl_in_rule__Cart__Group__11558);
            rule__Cart__Group__1__Impl();

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
    // $ANTLR end "rule__Cart__Group__1"


    // $ANTLR start "rule__Cart__Group__1__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:799:1: rule__Cart__Group__1__Impl : ( ( rule__Cart__NameAssignment_1 ) ) ;
    public final void rule__Cart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:803:1: ( ( ( rule__Cart__NameAssignment_1 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:804:1: ( ( rule__Cart__NameAssignment_1 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:804:1: ( ( rule__Cart__NameAssignment_1 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:805:1: ( rule__Cart__NameAssignment_1 )
            {
             before(grammarAccess.getCartAccess().getNameAssignment_1()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:806:1: ( rule__Cart__NameAssignment_1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:806:2: rule__Cart__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Cart__NameAssignment_1_in_rule__Cart__Group__1__Impl1585);
            rule__Cart__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCartAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Cart__Group__1__Impl"


    // $ANTLR start "rule__SignedInt__Group__0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:820:1: rule__SignedInt__Group__0 : rule__SignedInt__Group__0__Impl rule__SignedInt__Group__1 ;
    public final void rule__SignedInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:824:1: ( rule__SignedInt__Group__0__Impl rule__SignedInt__Group__1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:825:2: rule__SignedInt__Group__0__Impl rule__SignedInt__Group__1
            {
            pushFollow(FOLLOW_rule__SignedInt__Group__0__Impl_in_rule__SignedInt__Group__01619);
            rule__SignedInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignedInt__Group__1_in_rule__SignedInt__Group__01622);
            rule__SignedInt__Group__1();

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
    // $ANTLR end "rule__SignedInt__Group__0"


    // $ANTLR start "rule__SignedInt__Group__0__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:832:1: rule__SignedInt__Group__0__Impl : ( ( rule__SignedInt__SignAssignment_0 )? ) ;
    public final void rule__SignedInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:836:1: ( ( ( rule__SignedInt__SignAssignment_0 )? ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:837:1: ( ( rule__SignedInt__SignAssignment_0 )? )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:837:1: ( ( rule__SignedInt__SignAssignment_0 )? )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:838:1: ( rule__SignedInt__SignAssignment_0 )?
            {
             before(grammarAccess.getSignedIntAccess().getSignAssignment_0()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:839:1: ( rule__SignedInt__SignAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:839:2: rule__SignedInt__SignAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SignedInt__SignAssignment_0_in_rule__SignedInt__Group__0__Impl1649);
                    rule__SignedInt__SignAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSignedIntAccess().getSignAssignment_0()); 

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
    // $ANTLR end "rule__SignedInt__Group__0__Impl"


    // $ANTLR start "rule__SignedInt__Group__1"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:849:1: rule__SignedInt__Group__1 : rule__SignedInt__Group__1__Impl ;
    public final void rule__SignedInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:853:1: ( rule__SignedInt__Group__1__Impl )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:854:2: rule__SignedInt__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SignedInt__Group__1__Impl_in_rule__SignedInt__Group__11680);
            rule__SignedInt__Group__1__Impl();

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
    // $ANTLR end "rule__SignedInt__Group__1"


    // $ANTLR start "rule__SignedInt__Group__1__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:860:1: rule__SignedInt__Group__1__Impl : ( ( rule__SignedInt__ValueAssignment_1 ) ) ;
    public final void rule__SignedInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:864:1: ( ( ( rule__SignedInt__ValueAssignment_1 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:865:1: ( ( rule__SignedInt__ValueAssignment_1 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:865:1: ( ( rule__SignedInt__ValueAssignment_1 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:866:1: ( rule__SignedInt__ValueAssignment_1 )
            {
             before(grammarAccess.getSignedIntAccess().getValueAssignment_1()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:867:1: ( rule__SignedInt__ValueAssignment_1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:867:2: rule__SignedInt__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SignedInt__ValueAssignment_1_in_rule__SignedInt__Group__1__Impl1707);
            rule__SignedInt__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSignedIntAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__SignedInt__Group__1__Impl"


    // $ANTLR start "rule__Model__RollerCoasterAssignment"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:882:1: rule__Model__RollerCoasterAssignment : ( ruleRollerCoaster ) ;
    public final void rule__Model__RollerCoasterAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:886:1: ( ( ruleRollerCoaster ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:887:1: ( ruleRollerCoaster )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:887:1: ( ruleRollerCoaster )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:888:1: ruleRollerCoaster
            {
             before(grammarAccess.getModelAccess().getRollerCoasterRollerCoasterParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleRollerCoaster_in_rule__Model__RollerCoasterAssignment1746);
            ruleRollerCoaster();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRollerCoasterRollerCoasterParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__RollerCoasterAssignment"


    // $ANTLR start "rule__RollerCoaster__NameAssignment_1"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:897:1: rule__RollerCoaster__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RollerCoaster__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:901:1: ( ( RULE_ID ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:902:1: ( RULE_ID )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:902:1: ( RULE_ID )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:903:1: RULE_ID
            {
             before(grammarAccess.getRollerCoasterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RollerCoaster__NameAssignment_11777); 
             after(grammarAccess.getRollerCoasterAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__RollerCoaster__NameAssignment_1"


    // $ANTLR start "rule__RollerCoaster__TrackAssignment_2"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:912:1: rule__RollerCoaster__TrackAssignment_2 : ( ( rule__RollerCoaster__TrackAlternatives_2_0 ) ) ;
    public final void rule__RollerCoaster__TrackAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:916:1: ( ( ( rule__RollerCoaster__TrackAlternatives_2_0 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:917:1: ( ( rule__RollerCoaster__TrackAlternatives_2_0 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:917:1: ( ( rule__RollerCoaster__TrackAlternatives_2_0 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:918:1: ( rule__RollerCoaster__TrackAlternatives_2_0 )
            {
             before(grammarAccess.getRollerCoasterAccess().getTrackAlternatives_2_0()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:919:1: ( rule__RollerCoaster__TrackAlternatives_2_0 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:919:2: rule__RollerCoaster__TrackAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__RollerCoaster__TrackAlternatives_2_0_in_rule__RollerCoaster__TrackAssignment_21808);
            rule__RollerCoaster__TrackAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getRollerCoasterAccess().getTrackAlternatives_2_0()); 

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
    // $ANTLR end "rule__RollerCoaster__TrackAssignment_2"


    // $ANTLR start "rule__RollerCoaster__CartAssignment_3"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:928:1: rule__RollerCoaster__CartAssignment_3 : ( ruleCart ) ;
    public final void rule__RollerCoaster__CartAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:932:1: ( ( ruleCart ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:933:1: ( ruleCart )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:933:1: ( ruleCart )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:934:1: ruleCart
            {
             before(grammarAccess.getRollerCoasterAccess().getCartCartParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCart_in_rule__RollerCoaster__CartAssignment_31841);
            ruleCart();

            state._fsp--;

             after(grammarAccess.getRollerCoasterAccess().getCartCartParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__RollerCoaster__CartAssignment_3"


    // $ANTLR start "rule__RollerCoaster__TrackUnitLengthAssignment_4"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:943:1: rule__RollerCoaster__TrackUnitLengthAssignment_4 : ( RULE_INT ) ;
    public final void rule__RollerCoaster__TrackUnitLengthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:947:1: ( ( RULE_INT ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:948:1: ( RULE_INT )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:948:1: ( RULE_INT )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:949:1: RULE_INT
            {
             before(grammarAccess.getRollerCoasterAccess().getTrackUnitLengthINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RollerCoaster__TrackUnitLengthAssignment_41872); 
             after(grammarAccess.getRollerCoasterAccess().getTrackUnitLengthINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__RollerCoaster__TrackUnitLengthAssignment_4"


    // $ANTLR start "rule__Straight__NameAssignment_1"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:958:1: rule__Straight__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Straight__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:962:1: ( ( RULE_ID ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:963:1: ( RULE_ID )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:963:1: ( RULE_ID )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:964:1: RULE_ID
            {
             before(grammarAccess.getStraightAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Straight__NameAssignment_11903); 
             after(grammarAccess.getStraightAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Straight__NameAssignment_1"


    // $ANTLR start "rule__Straight__PoweredAssignment_2"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:973:1: rule__Straight__PoweredAssignment_2 : ( ( 'powered' ) ) ;
    public final void rule__Straight__PoweredAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:977:1: ( ( ( 'powered' ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:978:1: ( ( 'powered' ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:978:1: ( ( 'powered' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:979:1: ( 'powered' )
            {
             before(grammarAccess.getStraightAccess().getPoweredPoweredKeyword_2_0()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:980:1: ( 'powered' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:981:1: 'powered'
            {
             before(grammarAccess.getStraightAccess().getPoweredPoweredKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Straight__PoweredAssignment_21939); 
             after(grammarAccess.getStraightAccess().getPoweredPoweredKeyword_2_0()); 

            }

             after(grammarAccess.getStraightAccess().getPoweredPoweredKeyword_2_0()); 

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
    // $ANTLR end "rule__Straight__PoweredAssignment_2"


    // $ANTLR start "rule__Straight__LengthAssignment_3"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:996:1: rule__Straight__LengthAssignment_3 : ( RULE_INT ) ;
    public final void rule__Straight__LengthAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1000:1: ( ( RULE_INT ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1001:1: ( RULE_INT )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1001:1: ( RULE_INT )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1002:1: RULE_INT
            {
             before(grammarAccess.getStraightAccess().getLengthINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Straight__LengthAssignment_31978); 
             after(grammarAccess.getStraightAccess().getLengthINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Straight__LengthAssignment_3"


    // $ANTLR start "rule__Straight__ElevationChangeAssignment_4"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1011:1: rule__Straight__ElevationChangeAssignment_4 : ( ruleSignedInt ) ;
    public final void rule__Straight__ElevationChangeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1015:1: ( ( ruleSignedInt ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1016:1: ( ruleSignedInt )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1016:1: ( ruleSignedInt )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1017:1: ruleSignedInt
            {
             before(grammarAccess.getStraightAccess().getElevationChangeSignedIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleSignedInt_in_rule__Straight__ElevationChangeAssignment_42009);
            ruleSignedInt();

            state._fsp--;

             after(grammarAccess.getStraightAccess().getElevationChangeSignedIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Straight__ElevationChangeAssignment_4"


    // $ANTLR start "rule__Corner__NameAssignment_1"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1026:1: rule__Corner__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Corner__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1030:1: ( ( RULE_ID ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1031:1: ( RULE_ID )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1031:1: ( RULE_ID )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1032:1: RULE_ID
            {
             before(grammarAccess.getCornerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Corner__NameAssignment_12040); 
             after(grammarAccess.getCornerAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Corner__NameAssignment_1"


    // $ANTLR start "rule__Corner__DirectionAssignment_2"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1041:1: rule__Corner__DirectionAssignment_2 : ( ( rule__Corner__DirectionAlternatives_2_0 ) ) ;
    public final void rule__Corner__DirectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1045:1: ( ( ( rule__Corner__DirectionAlternatives_2_0 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1046:1: ( ( rule__Corner__DirectionAlternatives_2_0 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1046:1: ( ( rule__Corner__DirectionAlternatives_2_0 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1047:1: ( rule__Corner__DirectionAlternatives_2_0 )
            {
             before(grammarAccess.getCornerAccess().getDirectionAlternatives_2_0()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1048:1: ( rule__Corner__DirectionAlternatives_2_0 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1048:2: rule__Corner__DirectionAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__Corner__DirectionAlternatives_2_0_in_rule__Corner__DirectionAssignment_22071);
            rule__Corner__DirectionAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCornerAccess().getDirectionAlternatives_2_0()); 

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
    // $ANTLR end "rule__Corner__DirectionAssignment_2"


    // $ANTLR start "rule__Corner__TypeAssignment_3"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1057:1: rule__Corner__TypeAssignment_3 : ( ( rule__Corner__TypeAlternatives_3_0 ) ) ;
    public final void rule__Corner__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1061:1: ( ( ( rule__Corner__TypeAlternatives_3_0 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1062:1: ( ( rule__Corner__TypeAlternatives_3_0 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1062:1: ( ( rule__Corner__TypeAlternatives_3_0 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1063:1: ( rule__Corner__TypeAlternatives_3_0 )
            {
             before(grammarAccess.getCornerAccess().getTypeAlternatives_3_0()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1064:1: ( rule__Corner__TypeAlternatives_3_0 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1064:2: rule__Corner__TypeAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Corner__TypeAlternatives_3_0_in_rule__Corner__TypeAssignment_32104);
            rule__Corner__TypeAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getCornerAccess().getTypeAlternatives_3_0()); 

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
    // $ANTLR end "rule__Corner__TypeAssignment_3"


    // $ANTLR start "rule__Cart__NameAssignment_1"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1073:1: rule__Cart__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Cart__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1077:1: ( ( RULE_ID ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1078:1: ( RULE_ID )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1078:1: ( RULE_ID )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1079:1: RULE_ID
            {
             before(grammarAccess.getCartAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Cart__NameAssignment_12137); 
             after(grammarAccess.getCartAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Cart__NameAssignment_1"


    // $ANTLR start "rule__SignedInt__SignAssignment_0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1088:1: rule__SignedInt__SignAssignment_0 : ( ( '-' ) ) ;
    public final void rule__SignedInt__SignAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1092:1: ( ( ( '-' ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1093:1: ( ( '-' ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1093:1: ( ( '-' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1094:1: ( '-' )
            {
             before(grammarAccess.getSignedIntAccess().getSignHyphenMinusKeyword_0_0()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1095:1: ( '-' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1096:1: '-'
            {
             before(grammarAccess.getSignedIntAccess().getSignHyphenMinusKeyword_0_0()); 
            match(input,22,FOLLOW_22_in_rule__SignedInt__SignAssignment_02173); 
             after(grammarAccess.getSignedIntAccess().getSignHyphenMinusKeyword_0_0()); 

            }

             after(grammarAccess.getSignedIntAccess().getSignHyphenMinusKeyword_0_0()); 

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
    // $ANTLR end "rule__SignedInt__SignAssignment_0"


    // $ANTLR start "rule__SignedInt__ValueAssignment_1"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1111:1: rule__SignedInt__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__SignedInt__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1115:1: ( ( RULE_INT ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1116:1: ( RULE_INT )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1116:1: ( RULE_INT )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1117:1: RULE_INT
            {
             before(grammarAccess.getSignedIntAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SignedInt__ValueAssignment_12212); 
             after(grammarAccess.getSignedIntAccess().getValueINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SignedInt__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RollerCoasterAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRollerCoaster_in_entryRuleRollerCoaster121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRollerCoaster128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__0_in_ruleRollerCoaster154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStraight_in_entryRuleStraight181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStraight188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__Group__0_in_ruleStraight214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCorner_in_entryRuleCorner241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCorner248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__Group__0_in_ruleCorner274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCart_in_entryRuleCart301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCart308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cart__Group__0_in_ruleCart334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInt_in_entryRuleSignedInt361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedInt368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedInt__Group__0_in_ruleSignedInt394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStraight_in_rule__RollerCoaster__TrackAlternatives_2_0430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCorner_in_rule__RollerCoaster__TrackAlternatives_2_0447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Corner__DirectionAlternatives_2_0480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Corner__DirectionAlternatives_2_0500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Corner__TypeAlternatives_3_0535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Corner__TypeAlternatives_3_0555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Corner__TypeAlternatives_3_0575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Corner__TypeAlternatives_3_0595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__0__Impl_in_rule__RollerCoaster__Group__0627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__1_in_rule__RollerCoaster__Group__0630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RollerCoaster__Group__0__Impl658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__1__Impl_in_rule__RollerCoaster__Group__1689 = new BitSet(new long[]{0x00000000001C0020L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__2_in_rule__RollerCoaster__Group__1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__NameAssignment_1_in_rule__RollerCoaster__Group__1__Impl719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__2__Impl_in_rule__RollerCoaster__Group__2749 = new BitSet(new long[]{0x00000000001C0020L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__3_in_rule__RollerCoaster__Group__2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__TrackAssignment_2_in_rule__RollerCoaster__Group__2__Impl779 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__3__Impl_in_rule__RollerCoaster__Group__3810 = new BitSet(new long[]{0x00000000001C0020L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__4_in_rule__RollerCoaster__Group__3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__CartAssignment_3_in_rule__RollerCoaster__Group__3__Impl840 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__4__Impl_in_rule__RollerCoaster__Group__4871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__TrackUnitLengthAssignment_4_in_rule__RollerCoaster__Group__4__Impl898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__Group__0__Impl_in_rule__Straight__Group__0938 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Straight__Group__1_in_rule__Straight__Group__0941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Straight__Group__0__Impl969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__Group__1__Impl_in_rule__Straight__Group__11000 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_rule__Straight__Group__2_in_rule__Straight__Group__11003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__NameAssignment_1_in_rule__Straight__Group__1__Impl1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__Group__2__Impl_in_rule__Straight__Group__21060 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_rule__Straight__Group__3_in_rule__Straight__Group__21063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__PoweredAssignment_2_in_rule__Straight__Group__2__Impl1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__Group__3__Impl_in_rule__Straight__Group__31121 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_rule__Straight__Group__4_in_rule__Straight__Group__31124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__LengthAssignment_3_in_rule__Straight__Group__3__Impl1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__Group__4__Impl_in_rule__Straight__Group__41181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__ElevationChangeAssignment_4_in_rule__Straight__Group__4__Impl1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__Group__0__Impl_in_rule__Corner__Group__01249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Corner__Group__1_in_rule__Corner__Group__01252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Corner__Group__0__Impl1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__Group__1__Impl_in_rule__Corner__Group__11311 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Corner__Group__2_in_rule__Corner__Group__11314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__NameAssignment_1_in_rule__Corner__Group__1__Impl1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__Group__2__Impl_in_rule__Corner__Group__21371 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_rule__Corner__Group__3_in_rule__Corner__Group__21374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__DirectionAssignment_2_in_rule__Corner__Group__2__Impl1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__Group__3__Impl_in_rule__Corner__Group__31431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__TypeAssignment_3_in_rule__Corner__Group__3__Impl1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cart__Group__0__Impl_in_rule__Cart__Group__01496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Cart__Group__1_in_rule__Cart__Group__01499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Cart__Group__0__Impl1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cart__Group__1__Impl_in_rule__Cart__Group__11558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cart__NameAssignment_1_in_rule__Cart__Group__1__Impl1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedInt__Group__0__Impl_in_rule__SignedInt__Group__01619 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_rule__SignedInt__Group__1_in_rule__SignedInt__Group__01622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedInt__SignAssignment_0_in_rule__SignedInt__Group__0__Impl1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedInt__Group__1__Impl_in_rule__SignedInt__Group__11680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedInt__ValueAssignment_1_in_rule__SignedInt__Group__1__Impl1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRollerCoaster_in_rule__Model__RollerCoasterAssignment1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RollerCoaster__NameAssignment_11777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__TrackAlternatives_2_0_in_rule__RollerCoaster__TrackAssignment_21808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCart_in_rule__RollerCoaster__CartAssignment_31841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RollerCoaster__TrackUnitLengthAssignment_41872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Straight__NameAssignment_11903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Straight__PoweredAssignment_21939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Straight__LengthAssignment_31978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInt_in_rule__Straight__ElevationChangeAssignment_42009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Corner__NameAssignment_12040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__DirectionAlternatives_2_0_in_rule__Corner__DirectionAssignment_22071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__TypeAlternatives_3_0_in_rule__Corner__TypeAssignment_32104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Cart__NameAssignment_12137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SignedInt__SignAssignment_02173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SignedInt__ValueAssignment_12212 = new BitSet(new long[]{0x0000000000000002L});

}