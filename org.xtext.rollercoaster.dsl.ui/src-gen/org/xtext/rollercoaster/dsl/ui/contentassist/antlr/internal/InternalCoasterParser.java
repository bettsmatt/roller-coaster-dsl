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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'wood'", "'iron'", "'steel'", "'left'", "'right'", "'sharp45'", "'sharp90'", "'easy45'", "'easy90'", "'RollerCoaster'", "'Straight'", "'Corner'", "'Cart'", "'powered'", "'-'"
    };
    public static final int RULE_ID=4;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
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


    // $ANTLR start "rule__RollerCoaster__BaseQualityAlternatives_2_0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:228:1: rule__RollerCoaster__BaseQualityAlternatives_2_0 : ( ( 'wood' ) | ( 'iron' ) | ( 'steel' ) );
    public final void rule__RollerCoaster__BaseQualityAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:232:1: ( ( 'wood' ) | ( 'iron' ) | ( 'steel' ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:233:1: ( 'wood' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:233:1: ( 'wood' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:234:1: 'wood'
                    {
                     before(grammarAccess.getRollerCoasterAccess().getBaseQualityWoodKeyword_2_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__RollerCoaster__BaseQualityAlternatives_2_0431); 
                     after(grammarAccess.getRollerCoasterAccess().getBaseQualityWoodKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:241:6: ( 'iron' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:241:6: ( 'iron' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:242:1: 'iron'
                    {
                     before(grammarAccess.getRollerCoasterAccess().getBaseQualityIronKeyword_2_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__RollerCoaster__BaseQualityAlternatives_2_0451); 
                     after(grammarAccess.getRollerCoasterAccess().getBaseQualityIronKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:249:6: ( 'steel' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:249:6: ( 'steel' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:250:1: 'steel'
                    {
                     before(grammarAccess.getRollerCoasterAccess().getBaseQualitySteelKeyword_2_0_2()); 
                    match(input,13,FOLLOW_13_in_rule__RollerCoaster__BaseQualityAlternatives_2_0471); 
                     after(grammarAccess.getRollerCoasterAccess().getBaseQualitySteelKeyword_2_0_2()); 

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
    // $ANTLR end "rule__RollerCoaster__BaseQualityAlternatives_2_0"


    // $ANTLR start "rule__RollerCoaster__TrackAlternatives_3_0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:262:1: rule__RollerCoaster__TrackAlternatives_3_0 : ( ( ruleStraight ) | ( ruleCorner ) );
    public final void rule__RollerCoaster__TrackAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:266:1: ( ( ruleStraight ) | ( ruleCorner ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            else if ( (LA2_0==22) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:267:1: ( ruleStraight )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:267:1: ( ruleStraight )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:268:1: ruleStraight
                    {
                     before(grammarAccess.getRollerCoasterAccess().getTrackStraightParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_ruleStraight_in_rule__RollerCoaster__TrackAlternatives_3_0505);
                    ruleStraight();

                    state._fsp--;

                     after(grammarAccess.getRollerCoasterAccess().getTrackStraightParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:273:6: ( ruleCorner )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:273:6: ( ruleCorner )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:274:1: ruleCorner
                    {
                     before(grammarAccess.getRollerCoasterAccess().getTrackCornerParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_ruleCorner_in_rule__RollerCoaster__TrackAlternatives_3_0522);
                    ruleCorner();

                    state._fsp--;

                     after(grammarAccess.getRollerCoasterAccess().getTrackCornerParserRuleCall_3_0_1()); 

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
    // $ANTLR end "rule__RollerCoaster__TrackAlternatives_3_0"


    // $ANTLR start "rule__Straight__QualityAlternatives_3_0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:284:1: rule__Straight__QualityAlternatives_3_0 : ( ( 'wood' ) | ( 'iron' ) | ( 'steel' ) );
    public final void rule__Straight__QualityAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:288:1: ( ( 'wood' ) | ( 'iron' ) | ( 'steel' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:289:1: ( 'wood' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:289:1: ( 'wood' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:290:1: 'wood'
                    {
                     before(grammarAccess.getStraightAccess().getQualityWoodKeyword_3_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Straight__QualityAlternatives_3_0555); 
                     after(grammarAccess.getStraightAccess().getQualityWoodKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:297:6: ( 'iron' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:297:6: ( 'iron' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:298:1: 'iron'
                    {
                     before(grammarAccess.getStraightAccess().getQualityIronKeyword_3_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Straight__QualityAlternatives_3_0575); 
                     after(grammarAccess.getStraightAccess().getQualityIronKeyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:305:6: ( 'steel' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:305:6: ( 'steel' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:306:1: 'steel'
                    {
                     before(grammarAccess.getStraightAccess().getQualitySteelKeyword_3_0_2()); 
                    match(input,13,FOLLOW_13_in_rule__Straight__QualityAlternatives_3_0595); 
                     after(grammarAccess.getStraightAccess().getQualitySteelKeyword_3_0_2()); 

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
    // $ANTLR end "rule__Straight__QualityAlternatives_3_0"


    // $ANTLR start "rule__Corner__DirectionAlternatives_2_0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:318:1: rule__Corner__DirectionAlternatives_2_0 : ( ( 'left' ) | ( 'right' ) );
    public final void rule__Corner__DirectionAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:322:1: ( ( 'left' ) | ( 'right' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:323:1: ( 'left' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:323:1: ( 'left' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:324:1: 'left'
                    {
                     before(grammarAccess.getCornerAccess().getDirectionLeftKeyword_2_0_0()); 
                    match(input,14,FOLLOW_14_in_rule__Corner__DirectionAlternatives_2_0630); 
                     after(grammarAccess.getCornerAccess().getDirectionLeftKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:331:6: ( 'right' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:331:6: ( 'right' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:332:1: 'right'
                    {
                     before(grammarAccess.getCornerAccess().getDirectionRightKeyword_2_0_1()); 
                    match(input,15,FOLLOW_15_in_rule__Corner__DirectionAlternatives_2_0650); 
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:344:1: rule__Corner__TypeAlternatives_3_0 : ( ( 'sharp45' ) | ( 'sharp90' ) | ( 'easy45' ) | ( 'easy90' ) );
    public final void rule__Corner__TypeAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:348:1: ( ( 'sharp45' ) | ( 'sharp90' ) | ( 'easy45' ) | ( 'easy90' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            case 19:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:349:1: ( 'sharp45' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:349:1: ( 'sharp45' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:350:1: 'sharp45'
                    {
                     before(grammarAccess.getCornerAccess().getTypeSharp45Keyword_3_0_0()); 
                    match(input,16,FOLLOW_16_in_rule__Corner__TypeAlternatives_3_0685); 
                     after(grammarAccess.getCornerAccess().getTypeSharp45Keyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:357:6: ( 'sharp90' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:357:6: ( 'sharp90' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:358:1: 'sharp90'
                    {
                     before(grammarAccess.getCornerAccess().getTypeSharp90Keyword_3_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__Corner__TypeAlternatives_3_0705); 
                     after(grammarAccess.getCornerAccess().getTypeSharp90Keyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:365:6: ( 'easy45' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:365:6: ( 'easy45' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:366:1: 'easy45'
                    {
                     before(grammarAccess.getCornerAccess().getTypeEasy45Keyword_3_0_2()); 
                    match(input,18,FOLLOW_18_in_rule__Corner__TypeAlternatives_3_0725); 
                     after(grammarAccess.getCornerAccess().getTypeEasy45Keyword_3_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:373:6: ( 'easy90' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:373:6: ( 'easy90' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:374:1: 'easy90'
                    {
                     before(grammarAccess.getCornerAccess().getTypeEasy90Keyword_3_0_3()); 
                    match(input,19,FOLLOW_19_in_rule__Corner__TypeAlternatives_3_0745); 
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


    // $ANTLR start "rule__Corner__QualityAlternatives_4_0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:386:1: rule__Corner__QualityAlternatives_4_0 : ( ( 'wood' ) | ( 'iron' ) | ( 'steel' ) );
    public final void rule__Corner__QualityAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:390:1: ( ( 'wood' ) | ( 'iron' ) | ( 'steel' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:391:1: ( 'wood' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:391:1: ( 'wood' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:392:1: 'wood'
                    {
                     before(grammarAccess.getCornerAccess().getQualityWoodKeyword_4_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Corner__QualityAlternatives_4_0780); 
                     after(grammarAccess.getCornerAccess().getQualityWoodKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:399:6: ( 'iron' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:399:6: ( 'iron' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:400:1: 'iron'
                    {
                     before(grammarAccess.getCornerAccess().getQualityIronKeyword_4_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Corner__QualityAlternatives_4_0800); 
                     after(grammarAccess.getCornerAccess().getQualityIronKeyword_4_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:407:6: ( 'steel' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:407:6: ( 'steel' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:408:1: 'steel'
                    {
                     before(grammarAccess.getCornerAccess().getQualitySteelKeyword_4_0_2()); 
                    match(input,13,FOLLOW_13_in_rule__Corner__QualityAlternatives_4_0820); 
                     after(grammarAccess.getCornerAccess().getQualitySteelKeyword_4_0_2()); 

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
    // $ANTLR end "rule__Corner__QualityAlternatives_4_0"


    // $ANTLR start "rule__Cart__QualityAlternatives_2_0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:420:1: rule__Cart__QualityAlternatives_2_0 : ( ( 'wood' ) | ( 'iron' ) | ( 'steel' ) );
    public final void rule__Cart__QualityAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:424:1: ( ( 'wood' ) | ( 'iron' ) | ( 'steel' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt7=1;
                }
                break;
            case 12:
                {
                alt7=2;
                }
                break;
            case 13:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:425:1: ( 'wood' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:425:1: ( 'wood' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:426:1: 'wood'
                    {
                     before(grammarAccess.getCartAccess().getQualityWoodKeyword_2_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Cart__QualityAlternatives_2_0855); 
                     after(grammarAccess.getCartAccess().getQualityWoodKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:433:6: ( 'iron' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:433:6: ( 'iron' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:434:1: 'iron'
                    {
                     before(grammarAccess.getCartAccess().getQualityIronKeyword_2_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Cart__QualityAlternatives_2_0875); 
                     after(grammarAccess.getCartAccess().getQualityIronKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:441:6: ( 'steel' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:441:6: ( 'steel' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:442:1: 'steel'
                    {
                     before(grammarAccess.getCartAccess().getQualitySteelKeyword_2_0_2()); 
                    match(input,13,FOLLOW_13_in_rule__Cart__QualityAlternatives_2_0895); 
                     after(grammarAccess.getCartAccess().getQualitySteelKeyword_2_0_2()); 

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
    // $ANTLR end "rule__Cart__QualityAlternatives_2_0"


    // $ANTLR start "rule__RollerCoaster__Group__0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:456:1: rule__RollerCoaster__Group__0 : rule__RollerCoaster__Group__0__Impl rule__RollerCoaster__Group__1 ;
    public final void rule__RollerCoaster__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:460:1: ( rule__RollerCoaster__Group__0__Impl rule__RollerCoaster__Group__1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:461:2: rule__RollerCoaster__Group__0__Impl rule__RollerCoaster__Group__1
            {
            pushFollow(FOLLOW_rule__RollerCoaster__Group__0__Impl_in_rule__RollerCoaster__Group__0927);
            rule__RollerCoaster__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RollerCoaster__Group__1_in_rule__RollerCoaster__Group__0930);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:468:1: rule__RollerCoaster__Group__0__Impl : ( 'RollerCoaster' ) ;
    public final void rule__RollerCoaster__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:472:1: ( ( 'RollerCoaster' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:473:1: ( 'RollerCoaster' )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:473:1: ( 'RollerCoaster' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:474:1: 'RollerCoaster'
            {
             before(grammarAccess.getRollerCoasterAccess().getRollerCoasterKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__RollerCoaster__Group__0__Impl958); 
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:487:1: rule__RollerCoaster__Group__1 : rule__RollerCoaster__Group__1__Impl rule__RollerCoaster__Group__2 ;
    public final void rule__RollerCoaster__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:491:1: ( rule__RollerCoaster__Group__1__Impl rule__RollerCoaster__Group__2 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:492:2: rule__RollerCoaster__Group__1__Impl rule__RollerCoaster__Group__2
            {
            pushFollow(FOLLOW_rule__RollerCoaster__Group__1__Impl_in_rule__RollerCoaster__Group__1989);
            rule__RollerCoaster__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RollerCoaster__Group__2_in_rule__RollerCoaster__Group__1992);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:499:1: rule__RollerCoaster__Group__1__Impl : ( ( rule__RollerCoaster__NameAssignment_1 ) ) ;
    public final void rule__RollerCoaster__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:503:1: ( ( ( rule__RollerCoaster__NameAssignment_1 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:504:1: ( ( rule__RollerCoaster__NameAssignment_1 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:504:1: ( ( rule__RollerCoaster__NameAssignment_1 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:505:1: ( rule__RollerCoaster__NameAssignment_1 )
            {
             before(grammarAccess.getRollerCoasterAccess().getNameAssignment_1()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:506:1: ( rule__RollerCoaster__NameAssignment_1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:506:2: rule__RollerCoaster__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RollerCoaster__NameAssignment_1_in_rule__RollerCoaster__Group__1__Impl1019);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:516:1: rule__RollerCoaster__Group__2 : rule__RollerCoaster__Group__2__Impl rule__RollerCoaster__Group__3 ;
    public final void rule__RollerCoaster__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:520:1: ( rule__RollerCoaster__Group__2__Impl rule__RollerCoaster__Group__3 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:521:2: rule__RollerCoaster__Group__2__Impl rule__RollerCoaster__Group__3
            {
            pushFollow(FOLLOW_rule__RollerCoaster__Group__2__Impl_in_rule__RollerCoaster__Group__21049);
            rule__RollerCoaster__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RollerCoaster__Group__3_in_rule__RollerCoaster__Group__21052);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:528:1: rule__RollerCoaster__Group__2__Impl : ( ( rule__RollerCoaster__BaseQualityAssignment_2 ) ) ;
    public final void rule__RollerCoaster__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:532:1: ( ( ( rule__RollerCoaster__BaseQualityAssignment_2 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:533:1: ( ( rule__RollerCoaster__BaseQualityAssignment_2 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:533:1: ( ( rule__RollerCoaster__BaseQualityAssignment_2 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:534:1: ( rule__RollerCoaster__BaseQualityAssignment_2 )
            {
             before(grammarAccess.getRollerCoasterAccess().getBaseQualityAssignment_2()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:535:1: ( rule__RollerCoaster__BaseQualityAssignment_2 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:535:2: rule__RollerCoaster__BaseQualityAssignment_2
            {
            pushFollow(FOLLOW_rule__RollerCoaster__BaseQualityAssignment_2_in_rule__RollerCoaster__Group__2__Impl1079);
            rule__RollerCoaster__BaseQualityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRollerCoasterAccess().getBaseQualityAssignment_2()); 

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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:545:1: rule__RollerCoaster__Group__3 : rule__RollerCoaster__Group__3__Impl rule__RollerCoaster__Group__4 ;
    public final void rule__RollerCoaster__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:549:1: ( rule__RollerCoaster__Group__3__Impl rule__RollerCoaster__Group__4 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:550:2: rule__RollerCoaster__Group__3__Impl rule__RollerCoaster__Group__4
            {
            pushFollow(FOLLOW_rule__RollerCoaster__Group__3__Impl_in_rule__RollerCoaster__Group__31109);
            rule__RollerCoaster__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RollerCoaster__Group__4_in_rule__RollerCoaster__Group__31112);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:557:1: rule__RollerCoaster__Group__3__Impl : ( ( rule__RollerCoaster__TrackAssignment_3 )* ) ;
    public final void rule__RollerCoaster__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:561:1: ( ( ( rule__RollerCoaster__TrackAssignment_3 )* ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:562:1: ( ( rule__RollerCoaster__TrackAssignment_3 )* )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:562:1: ( ( rule__RollerCoaster__TrackAssignment_3 )* )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:563:1: ( rule__RollerCoaster__TrackAssignment_3 )*
            {
             before(grammarAccess.getRollerCoasterAccess().getTrackAssignment_3()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:564:1: ( rule__RollerCoaster__TrackAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=21 && LA8_0<=22)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:564:2: rule__RollerCoaster__TrackAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__RollerCoaster__TrackAssignment_3_in_rule__RollerCoaster__Group__3__Impl1139);
            	    rule__RollerCoaster__TrackAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRollerCoasterAccess().getTrackAssignment_3()); 

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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:574:1: rule__RollerCoaster__Group__4 : rule__RollerCoaster__Group__4__Impl rule__RollerCoaster__Group__5 ;
    public final void rule__RollerCoaster__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:578:1: ( rule__RollerCoaster__Group__4__Impl rule__RollerCoaster__Group__5 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:579:2: rule__RollerCoaster__Group__4__Impl rule__RollerCoaster__Group__5
            {
            pushFollow(FOLLOW_rule__RollerCoaster__Group__4__Impl_in_rule__RollerCoaster__Group__41170);
            rule__RollerCoaster__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RollerCoaster__Group__5_in_rule__RollerCoaster__Group__41173);
            rule__RollerCoaster__Group__5();

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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:586:1: rule__RollerCoaster__Group__4__Impl : ( ( rule__RollerCoaster__CartAssignment_4 )* ) ;
    public final void rule__RollerCoaster__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:590:1: ( ( ( rule__RollerCoaster__CartAssignment_4 )* ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:591:1: ( ( rule__RollerCoaster__CartAssignment_4 )* )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:591:1: ( ( rule__RollerCoaster__CartAssignment_4 )* )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:592:1: ( rule__RollerCoaster__CartAssignment_4 )*
            {
             before(grammarAccess.getRollerCoasterAccess().getCartAssignment_4()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:593:1: ( rule__RollerCoaster__CartAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:593:2: rule__RollerCoaster__CartAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__RollerCoaster__CartAssignment_4_in_rule__RollerCoaster__Group__4__Impl1200);
            	    rule__RollerCoaster__CartAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRollerCoasterAccess().getCartAssignment_4()); 

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


    // $ANTLR start "rule__RollerCoaster__Group__5"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:603:1: rule__RollerCoaster__Group__5 : rule__RollerCoaster__Group__5__Impl ;
    public final void rule__RollerCoaster__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:607:1: ( rule__RollerCoaster__Group__5__Impl )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:608:2: rule__RollerCoaster__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__RollerCoaster__Group__5__Impl_in_rule__RollerCoaster__Group__51231);
            rule__RollerCoaster__Group__5__Impl();

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
    // $ANTLR end "rule__RollerCoaster__Group__5"


    // $ANTLR start "rule__RollerCoaster__Group__5__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:614:1: rule__RollerCoaster__Group__5__Impl : ( ( rule__RollerCoaster__TrackUnitLengthAssignment_5 ) ) ;
    public final void rule__RollerCoaster__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:618:1: ( ( ( rule__RollerCoaster__TrackUnitLengthAssignment_5 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:619:1: ( ( rule__RollerCoaster__TrackUnitLengthAssignment_5 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:619:1: ( ( rule__RollerCoaster__TrackUnitLengthAssignment_5 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:620:1: ( rule__RollerCoaster__TrackUnitLengthAssignment_5 )
            {
             before(grammarAccess.getRollerCoasterAccess().getTrackUnitLengthAssignment_5()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:621:1: ( rule__RollerCoaster__TrackUnitLengthAssignment_5 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:621:2: rule__RollerCoaster__TrackUnitLengthAssignment_5
            {
            pushFollow(FOLLOW_rule__RollerCoaster__TrackUnitLengthAssignment_5_in_rule__RollerCoaster__Group__5__Impl1258);
            rule__RollerCoaster__TrackUnitLengthAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRollerCoasterAccess().getTrackUnitLengthAssignment_5()); 

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
    // $ANTLR end "rule__RollerCoaster__Group__5__Impl"


    // $ANTLR start "rule__Straight__Group__0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:643:1: rule__Straight__Group__0 : rule__Straight__Group__0__Impl rule__Straight__Group__1 ;
    public final void rule__Straight__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:647:1: ( rule__Straight__Group__0__Impl rule__Straight__Group__1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:648:2: rule__Straight__Group__0__Impl rule__Straight__Group__1
            {
            pushFollow(FOLLOW_rule__Straight__Group__0__Impl_in_rule__Straight__Group__01300);
            rule__Straight__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Straight__Group__1_in_rule__Straight__Group__01303);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:655:1: rule__Straight__Group__0__Impl : ( 'Straight' ) ;
    public final void rule__Straight__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:659:1: ( ( 'Straight' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:660:1: ( 'Straight' )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:660:1: ( 'Straight' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:661:1: 'Straight'
            {
             before(grammarAccess.getStraightAccess().getStraightKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Straight__Group__0__Impl1331); 
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:674:1: rule__Straight__Group__1 : rule__Straight__Group__1__Impl rule__Straight__Group__2 ;
    public final void rule__Straight__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:678:1: ( rule__Straight__Group__1__Impl rule__Straight__Group__2 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:679:2: rule__Straight__Group__1__Impl rule__Straight__Group__2
            {
            pushFollow(FOLLOW_rule__Straight__Group__1__Impl_in_rule__Straight__Group__11362);
            rule__Straight__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Straight__Group__2_in_rule__Straight__Group__11365);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:686:1: rule__Straight__Group__1__Impl : ( ( rule__Straight__NameAssignment_1 ) ) ;
    public final void rule__Straight__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:690:1: ( ( ( rule__Straight__NameAssignment_1 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:691:1: ( ( rule__Straight__NameAssignment_1 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:691:1: ( ( rule__Straight__NameAssignment_1 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:692:1: ( rule__Straight__NameAssignment_1 )
            {
             before(grammarAccess.getStraightAccess().getNameAssignment_1()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:693:1: ( rule__Straight__NameAssignment_1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:693:2: rule__Straight__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Straight__NameAssignment_1_in_rule__Straight__Group__1__Impl1392);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:703:1: rule__Straight__Group__2 : rule__Straight__Group__2__Impl rule__Straight__Group__3 ;
    public final void rule__Straight__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:707:1: ( rule__Straight__Group__2__Impl rule__Straight__Group__3 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:708:2: rule__Straight__Group__2__Impl rule__Straight__Group__3
            {
            pushFollow(FOLLOW_rule__Straight__Group__2__Impl_in_rule__Straight__Group__21422);
            rule__Straight__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Straight__Group__3_in_rule__Straight__Group__21425);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:715:1: rule__Straight__Group__2__Impl : ( ( rule__Straight__PoweredAssignment_2 )? ) ;
    public final void rule__Straight__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:719:1: ( ( ( rule__Straight__PoweredAssignment_2 )? ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:720:1: ( ( rule__Straight__PoweredAssignment_2 )? )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:720:1: ( ( rule__Straight__PoweredAssignment_2 )? )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:721:1: ( rule__Straight__PoweredAssignment_2 )?
            {
             before(grammarAccess.getStraightAccess().getPoweredAssignment_2()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:722:1: ( rule__Straight__PoweredAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:722:2: rule__Straight__PoweredAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Straight__PoweredAssignment_2_in_rule__Straight__Group__2__Impl1452);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:732:1: rule__Straight__Group__3 : rule__Straight__Group__3__Impl rule__Straight__Group__4 ;
    public final void rule__Straight__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:736:1: ( rule__Straight__Group__3__Impl rule__Straight__Group__4 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:737:2: rule__Straight__Group__3__Impl rule__Straight__Group__4
            {
            pushFollow(FOLLOW_rule__Straight__Group__3__Impl_in_rule__Straight__Group__31483);
            rule__Straight__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Straight__Group__4_in_rule__Straight__Group__31486);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:744:1: rule__Straight__Group__3__Impl : ( ( rule__Straight__QualityAssignment_3 )? ) ;
    public final void rule__Straight__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:748:1: ( ( ( rule__Straight__QualityAssignment_3 )? ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:749:1: ( ( rule__Straight__QualityAssignment_3 )? )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:749:1: ( ( rule__Straight__QualityAssignment_3 )? )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:750:1: ( rule__Straight__QualityAssignment_3 )?
            {
             before(grammarAccess.getStraightAccess().getQualityAssignment_3()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:751:1: ( rule__Straight__QualityAssignment_3 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=11 && LA11_0<=13)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:751:2: rule__Straight__QualityAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Straight__QualityAssignment_3_in_rule__Straight__Group__3__Impl1513);
                    rule__Straight__QualityAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStraightAccess().getQualityAssignment_3()); 

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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:761:1: rule__Straight__Group__4 : rule__Straight__Group__4__Impl rule__Straight__Group__5 ;
    public final void rule__Straight__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:765:1: ( rule__Straight__Group__4__Impl rule__Straight__Group__5 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:766:2: rule__Straight__Group__4__Impl rule__Straight__Group__5
            {
            pushFollow(FOLLOW_rule__Straight__Group__4__Impl_in_rule__Straight__Group__41544);
            rule__Straight__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Straight__Group__5_in_rule__Straight__Group__41547);
            rule__Straight__Group__5();

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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:773:1: rule__Straight__Group__4__Impl : ( ( rule__Straight__LengthAssignment_4 ) ) ;
    public final void rule__Straight__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:777:1: ( ( ( rule__Straight__LengthAssignment_4 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:778:1: ( ( rule__Straight__LengthAssignment_4 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:778:1: ( ( rule__Straight__LengthAssignment_4 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:779:1: ( rule__Straight__LengthAssignment_4 )
            {
             before(grammarAccess.getStraightAccess().getLengthAssignment_4()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:780:1: ( rule__Straight__LengthAssignment_4 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:780:2: rule__Straight__LengthAssignment_4
            {
            pushFollow(FOLLOW_rule__Straight__LengthAssignment_4_in_rule__Straight__Group__4__Impl1574);
            rule__Straight__LengthAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStraightAccess().getLengthAssignment_4()); 

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


    // $ANTLR start "rule__Straight__Group__5"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:790:1: rule__Straight__Group__5 : rule__Straight__Group__5__Impl ;
    public final void rule__Straight__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:794:1: ( rule__Straight__Group__5__Impl )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:795:2: rule__Straight__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Straight__Group__5__Impl_in_rule__Straight__Group__51604);
            rule__Straight__Group__5__Impl();

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
    // $ANTLR end "rule__Straight__Group__5"


    // $ANTLR start "rule__Straight__Group__5__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:801:1: rule__Straight__Group__5__Impl : ( ( rule__Straight__ElevationChangeAssignment_5 )? ) ;
    public final void rule__Straight__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:805:1: ( ( ( rule__Straight__ElevationChangeAssignment_5 )? ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:806:1: ( ( rule__Straight__ElevationChangeAssignment_5 )? )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:806:1: ( ( rule__Straight__ElevationChangeAssignment_5 )? )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:807:1: ( rule__Straight__ElevationChangeAssignment_5 )?
            {
             before(grammarAccess.getStraightAccess().getElevationChangeAssignment_5()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:808:1: ( rule__Straight__ElevationChangeAssignment_5 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_INT) ) {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==EOF) ) {
                    int LA12_4 = input.LA(3);

                    if ( (LA12_4==EOF) ) {
                        alt12=1;
                    }
                }
                else if ( (LA12_2==RULE_INT||(LA12_2>=21 && LA12_2<=23)) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:808:2: rule__Straight__ElevationChangeAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Straight__ElevationChangeAssignment_5_in_rule__Straight__Group__5__Impl1631);
                    rule__Straight__ElevationChangeAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStraightAccess().getElevationChangeAssignment_5()); 

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
    // $ANTLR end "rule__Straight__Group__5__Impl"


    // $ANTLR start "rule__Corner__Group__0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:830:1: rule__Corner__Group__0 : rule__Corner__Group__0__Impl rule__Corner__Group__1 ;
    public final void rule__Corner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:834:1: ( rule__Corner__Group__0__Impl rule__Corner__Group__1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:835:2: rule__Corner__Group__0__Impl rule__Corner__Group__1
            {
            pushFollow(FOLLOW_rule__Corner__Group__0__Impl_in_rule__Corner__Group__01674);
            rule__Corner__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Corner__Group__1_in_rule__Corner__Group__01677);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:842:1: rule__Corner__Group__0__Impl : ( 'Corner' ) ;
    public final void rule__Corner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:846:1: ( ( 'Corner' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:847:1: ( 'Corner' )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:847:1: ( 'Corner' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:848:1: 'Corner'
            {
             before(grammarAccess.getCornerAccess().getCornerKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Corner__Group__0__Impl1705); 
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:861:1: rule__Corner__Group__1 : rule__Corner__Group__1__Impl rule__Corner__Group__2 ;
    public final void rule__Corner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:865:1: ( rule__Corner__Group__1__Impl rule__Corner__Group__2 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:866:2: rule__Corner__Group__1__Impl rule__Corner__Group__2
            {
            pushFollow(FOLLOW_rule__Corner__Group__1__Impl_in_rule__Corner__Group__11736);
            rule__Corner__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Corner__Group__2_in_rule__Corner__Group__11739);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:873:1: rule__Corner__Group__1__Impl : ( ( rule__Corner__NameAssignment_1 ) ) ;
    public final void rule__Corner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:877:1: ( ( ( rule__Corner__NameAssignment_1 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:878:1: ( ( rule__Corner__NameAssignment_1 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:878:1: ( ( rule__Corner__NameAssignment_1 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:879:1: ( rule__Corner__NameAssignment_1 )
            {
             before(grammarAccess.getCornerAccess().getNameAssignment_1()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:880:1: ( rule__Corner__NameAssignment_1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:880:2: rule__Corner__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Corner__NameAssignment_1_in_rule__Corner__Group__1__Impl1766);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:890:1: rule__Corner__Group__2 : rule__Corner__Group__2__Impl rule__Corner__Group__3 ;
    public final void rule__Corner__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:894:1: ( rule__Corner__Group__2__Impl rule__Corner__Group__3 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:895:2: rule__Corner__Group__2__Impl rule__Corner__Group__3
            {
            pushFollow(FOLLOW_rule__Corner__Group__2__Impl_in_rule__Corner__Group__21796);
            rule__Corner__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Corner__Group__3_in_rule__Corner__Group__21799);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:902:1: rule__Corner__Group__2__Impl : ( ( rule__Corner__DirectionAssignment_2 ) ) ;
    public final void rule__Corner__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:906:1: ( ( ( rule__Corner__DirectionAssignment_2 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:907:1: ( ( rule__Corner__DirectionAssignment_2 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:907:1: ( ( rule__Corner__DirectionAssignment_2 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:908:1: ( rule__Corner__DirectionAssignment_2 )
            {
             before(grammarAccess.getCornerAccess().getDirectionAssignment_2()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:909:1: ( rule__Corner__DirectionAssignment_2 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:909:2: rule__Corner__DirectionAssignment_2
            {
            pushFollow(FOLLOW_rule__Corner__DirectionAssignment_2_in_rule__Corner__Group__2__Impl1826);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:919:1: rule__Corner__Group__3 : rule__Corner__Group__3__Impl rule__Corner__Group__4 ;
    public final void rule__Corner__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:923:1: ( rule__Corner__Group__3__Impl rule__Corner__Group__4 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:924:2: rule__Corner__Group__3__Impl rule__Corner__Group__4
            {
            pushFollow(FOLLOW_rule__Corner__Group__3__Impl_in_rule__Corner__Group__31856);
            rule__Corner__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Corner__Group__4_in_rule__Corner__Group__31859);
            rule__Corner__Group__4();

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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:931:1: rule__Corner__Group__3__Impl : ( ( rule__Corner__TypeAssignment_3 ) ) ;
    public final void rule__Corner__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:935:1: ( ( ( rule__Corner__TypeAssignment_3 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:936:1: ( ( rule__Corner__TypeAssignment_3 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:936:1: ( ( rule__Corner__TypeAssignment_3 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:937:1: ( rule__Corner__TypeAssignment_3 )
            {
             before(grammarAccess.getCornerAccess().getTypeAssignment_3()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:938:1: ( rule__Corner__TypeAssignment_3 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:938:2: rule__Corner__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Corner__TypeAssignment_3_in_rule__Corner__Group__3__Impl1886);
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


    // $ANTLR start "rule__Corner__Group__4"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:948:1: rule__Corner__Group__4 : rule__Corner__Group__4__Impl ;
    public final void rule__Corner__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:952:1: ( rule__Corner__Group__4__Impl )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:953:2: rule__Corner__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Corner__Group__4__Impl_in_rule__Corner__Group__41916);
            rule__Corner__Group__4__Impl();

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
    // $ANTLR end "rule__Corner__Group__4"


    // $ANTLR start "rule__Corner__Group__4__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:959:1: rule__Corner__Group__4__Impl : ( ( rule__Corner__QualityAssignment_4 )? ) ;
    public final void rule__Corner__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:963:1: ( ( ( rule__Corner__QualityAssignment_4 )? ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:964:1: ( ( rule__Corner__QualityAssignment_4 )? )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:964:1: ( ( rule__Corner__QualityAssignment_4 )? )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:965:1: ( rule__Corner__QualityAssignment_4 )?
            {
             before(grammarAccess.getCornerAccess().getQualityAssignment_4()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:966:1: ( rule__Corner__QualityAssignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=11 && LA13_0<=13)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:966:2: rule__Corner__QualityAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Corner__QualityAssignment_4_in_rule__Corner__Group__4__Impl1943);
                    rule__Corner__QualityAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCornerAccess().getQualityAssignment_4()); 

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
    // $ANTLR end "rule__Corner__Group__4__Impl"


    // $ANTLR start "rule__Cart__Group__0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:986:1: rule__Cart__Group__0 : rule__Cart__Group__0__Impl rule__Cart__Group__1 ;
    public final void rule__Cart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:990:1: ( rule__Cart__Group__0__Impl rule__Cart__Group__1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:991:2: rule__Cart__Group__0__Impl rule__Cart__Group__1
            {
            pushFollow(FOLLOW_rule__Cart__Group__0__Impl_in_rule__Cart__Group__01984);
            rule__Cart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cart__Group__1_in_rule__Cart__Group__01987);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:998:1: rule__Cart__Group__0__Impl : ( 'Cart' ) ;
    public final void rule__Cart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1002:1: ( ( 'Cart' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1003:1: ( 'Cart' )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1003:1: ( 'Cart' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1004:1: 'Cart'
            {
             before(grammarAccess.getCartAccess().getCartKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Cart__Group__0__Impl2015); 
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1017:1: rule__Cart__Group__1 : rule__Cart__Group__1__Impl rule__Cart__Group__2 ;
    public final void rule__Cart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1021:1: ( rule__Cart__Group__1__Impl rule__Cart__Group__2 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1022:2: rule__Cart__Group__1__Impl rule__Cart__Group__2
            {
            pushFollow(FOLLOW_rule__Cart__Group__1__Impl_in_rule__Cart__Group__12046);
            rule__Cart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cart__Group__2_in_rule__Cart__Group__12049);
            rule__Cart__Group__2();

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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1029:1: rule__Cart__Group__1__Impl : ( ( rule__Cart__NameAssignment_1 ) ) ;
    public final void rule__Cart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1033:1: ( ( ( rule__Cart__NameAssignment_1 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1034:1: ( ( rule__Cart__NameAssignment_1 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1034:1: ( ( rule__Cart__NameAssignment_1 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1035:1: ( rule__Cart__NameAssignment_1 )
            {
             before(grammarAccess.getCartAccess().getNameAssignment_1()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1036:1: ( rule__Cart__NameAssignment_1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1036:2: rule__Cart__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Cart__NameAssignment_1_in_rule__Cart__Group__1__Impl2076);
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


    // $ANTLR start "rule__Cart__Group__2"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1046:1: rule__Cart__Group__2 : rule__Cart__Group__2__Impl rule__Cart__Group__3 ;
    public final void rule__Cart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1050:1: ( rule__Cart__Group__2__Impl rule__Cart__Group__3 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1051:2: rule__Cart__Group__2__Impl rule__Cart__Group__3
            {
            pushFollow(FOLLOW_rule__Cart__Group__2__Impl_in_rule__Cart__Group__22106);
            rule__Cart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cart__Group__3_in_rule__Cart__Group__22109);
            rule__Cart__Group__3();

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
    // $ANTLR end "rule__Cart__Group__2"


    // $ANTLR start "rule__Cart__Group__2__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1058:1: rule__Cart__Group__2__Impl : ( ( rule__Cart__QualityAssignment_2 )? ) ;
    public final void rule__Cart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1062:1: ( ( ( rule__Cart__QualityAssignment_2 )? ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1063:1: ( ( rule__Cart__QualityAssignment_2 )? )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1063:1: ( ( rule__Cart__QualityAssignment_2 )? )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1064:1: ( rule__Cart__QualityAssignment_2 )?
            {
             before(grammarAccess.getCartAccess().getQualityAssignment_2()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1065:1: ( rule__Cart__QualityAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=11 && LA14_0<=13)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1065:2: rule__Cart__QualityAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Cart__QualityAssignment_2_in_rule__Cart__Group__2__Impl2136);
                    rule__Cart__QualityAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCartAccess().getQualityAssignment_2()); 

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
    // $ANTLR end "rule__Cart__Group__2__Impl"


    // $ANTLR start "rule__Cart__Group__3"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1075:1: rule__Cart__Group__3 : rule__Cart__Group__3__Impl ;
    public final void rule__Cart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1079:1: ( rule__Cart__Group__3__Impl )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1080:2: rule__Cart__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Cart__Group__3__Impl_in_rule__Cart__Group__32167);
            rule__Cart__Group__3__Impl();

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
    // $ANTLR end "rule__Cart__Group__3"


    // $ANTLR start "rule__Cart__Group__3__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1086:1: rule__Cart__Group__3__Impl : ( ( rule__Cart__SeatNumberAssignment_3 ) ) ;
    public final void rule__Cart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1090:1: ( ( ( rule__Cart__SeatNumberAssignment_3 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1091:1: ( ( rule__Cart__SeatNumberAssignment_3 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1091:1: ( ( rule__Cart__SeatNumberAssignment_3 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1092:1: ( rule__Cart__SeatNumberAssignment_3 )
            {
             before(grammarAccess.getCartAccess().getSeatNumberAssignment_3()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1093:1: ( rule__Cart__SeatNumberAssignment_3 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1093:2: rule__Cart__SeatNumberAssignment_3
            {
            pushFollow(FOLLOW_rule__Cart__SeatNumberAssignment_3_in_rule__Cart__Group__3__Impl2194);
            rule__Cart__SeatNumberAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCartAccess().getSeatNumberAssignment_3()); 

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
    // $ANTLR end "rule__Cart__Group__3__Impl"


    // $ANTLR start "rule__SignedInt__Group__0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1111:1: rule__SignedInt__Group__0 : rule__SignedInt__Group__0__Impl rule__SignedInt__Group__1 ;
    public final void rule__SignedInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1115:1: ( rule__SignedInt__Group__0__Impl rule__SignedInt__Group__1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1116:2: rule__SignedInt__Group__0__Impl rule__SignedInt__Group__1
            {
            pushFollow(FOLLOW_rule__SignedInt__Group__0__Impl_in_rule__SignedInt__Group__02232);
            rule__SignedInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignedInt__Group__1_in_rule__SignedInt__Group__02235);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1123:1: rule__SignedInt__Group__0__Impl : ( ( rule__SignedInt__SignAssignment_0 )? ) ;
    public final void rule__SignedInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1127:1: ( ( ( rule__SignedInt__SignAssignment_0 )? ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1128:1: ( ( rule__SignedInt__SignAssignment_0 )? )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1128:1: ( ( rule__SignedInt__SignAssignment_0 )? )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1129:1: ( rule__SignedInt__SignAssignment_0 )?
            {
             before(grammarAccess.getSignedIntAccess().getSignAssignment_0()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1130:1: ( rule__SignedInt__SignAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1130:2: rule__SignedInt__SignAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SignedInt__SignAssignment_0_in_rule__SignedInt__Group__0__Impl2262);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1140:1: rule__SignedInt__Group__1 : rule__SignedInt__Group__1__Impl ;
    public final void rule__SignedInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1144:1: ( rule__SignedInt__Group__1__Impl )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1145:2: rule__SignedInt__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SignedInt__Group__1__Impl_in_rule__SignedInt__Group__12293);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1151:1: rule__SignedInt__Group__1__Impl : ( ( rule__SignedInt__ValueAssignment_1 ) ) ;
    public final void rule__SignedInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1155:1: ( ( ( rule__SignedInt__ValueAssignment_1 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1156:1: ( ( rule__SignedInt__ValueAssignment_1 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1156:1: ( ( rule__SignedInt__ValueAssignment_1 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1157:1: ( rule__SignedInt__ValueAssignment_1 )
            {
             before(grammarAccess.getSignedIntAccess().getValueAssignment_1()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1158:1: ( rule__SignedInt__ValueAssignment_1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1158:2: rule__SignedInt__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SignedInt__ValueAssignment_1_in_rule__SignedInt__Group__1__Impl2320);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1173:1: rule__Model__RollerCoasterAssignment : ( ruleRollerCoaster ) ;
    public final void rule__Model__RollerCoasterAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1177:1: ( ( ruleRollerCoaster ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1178:1: ( ruleRollerCoaster )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1178:1: ( ruleRollerCoaster )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1179:1: ruleRollerCoaster
            {
             before(grammarAccess.getModelAccess().getRollerCoasterRollerCoasterParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleRollerCoaster_in_rule__Model__RollerCoasterAssignment2359);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1188:1: rule__RollerCoaster__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RollerCoaster__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1192:1: ( ( RULE_ID ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1193:1: ( RULE_ID )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1193:1: ( RULE_ID )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1194:1: RULE_ID
            {
             before(grammarAccess.getRollerCoasterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RollerCoaster__NameAssignment_12390); 
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


    // $ANTLR start "rule__RollerCoaster__BaseQualityAssignment_2"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1203:1: rule__RollerCoaster__BaseQualityAssignment_2 : ( ( rule__RollerCoaster__BaseQualityAlternatives_2_0 ) ) ;
    public final void rule__RollerCoaster__BaseQualityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1207:1: ( ( ( rule__RollerCoaster__BaseQualityAlternatives_2_0 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1208:1: ( ( rule__RollerCoaster__BaseQualityAlternatives_2_0 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1208:1: ( ( rule__RollerCoaster__BaseQualityAlternatives_2_0 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1209:1: ( rule__RollerCoaster__BaseQualityAlternatives_2_0 )
            {
             before(grammarAccess.getRollerCoasterAccess().getBaseQualityAlternatives_2_0()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1210:1: ( rule__RollerCoaster__BaseQualityAlternatives_2_0 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1210:2: rule__RollerCoaster__BaseQualityAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__RollerCoaster__BaseQualityAlternatives_2_0_in_rule__RollerCoaster__BaseQualityAssignment_22421);
            rule__RollerCoaster__BaseQualityAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getRollerCoasterAccess().getBaseQualityAlternatives_2_0()); 

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
    // $ANTLR end "rule__RollerCoaster__BaseQualityAssignment_2"


    // $ANTLR start "rule__RollerCoaster__TrackAssignment_3"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1219:1: rule__RollerCoaster__TrackAssignment_3 : ( ( rule__RollerCoaster__TrackAlternatives_3_0 ) ) ;
    public final void rule__RollerCoaster__TrackAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1223:1: ( ( ( rule__RollerCoaster__TrackAlternatives_3_0 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1224:1: ( ( rule__RollerCoaster__TrackAlternatives_3_0 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1224:1: ( ( rule__RollerCoaster__TrackAlternatives_3_0 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1225:1: ( rule__RollerCoaster__TrackAlternatives_3_0 )
            {
             before(grammarAccess.getRollerCoasterAccess().getTrackAlternatives_3_0()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1226:1: ( rule__RollerCoaster__TrackAlternatives_3_0 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1226:2: rule__RollerCoaster__TrackAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__RollerCoaster__TrackAlternatives_3_0_in_rule__RollerCoaster__TrackAssignment_32454);
            rule__RollerCoaster__TrackAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getRollerCoasterAccess().getTrackAlternatives_3_0()); 

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
    // $ANTLR end "rule__RollerCoaster__TrackAssignment_3"


    // $ANTLR start "rule__RollerCoaster__CartAssignment_4"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1235:1: rule__RollerCoaster__CartAssignment_4 : ( ruleCart ) ;
    public final void rule__RollerCoaster__CartAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1239:1: ( ( ruleCart ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1240:1: ( ruleCart )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1240:1: ( ruleCart )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1241:1: ruleCart
            {
             before(grammarAccess.getRollerCoasterAccess().getCartCartParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCart_in_rule__RollerCoaster__CartAssignment_42487);
            ruleCart();

            state._fsp--;

             after(grammarAccess.getRollerCoasterAccess().getCartCartParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__RollerCoaster__CartAssignment_4"


    // $ANTLR start "rule__RollerCoaster__TrackUnitLengthAssignment_5"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1250:1: rule__RollerCoaster__TrackUnitLengthAssignment_5 : ( RULE_INT ) ;
    public final void rule__RollerCoaster__TrackUnitLengthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1254:1: ( ( RULE_INT ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1255:1: ( RULE_INT )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1255:1: ( RULE_INT )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1256:1: RULE_INT
            {
             before(grammarAccess.getRollerCoasterAccess().getTrackUnitLengthINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RollerCoaster__TrackUnitLengthAssignment_52518); 
             after(grammarAccess.getRollerCoasterAccess().getTrackUnitLengthINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__RollerCoaster__TrackUnitLengthAssignment_5"


    // $ANTLR start "rule__Straight__NameAssignment_1"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1265:1: rule__Straight__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Straight__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1269:1: ( ( RULE_ID ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1270:1: ( RULE_ID )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1270:1: ( RULE_ID )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1271:1: RULE_ID
            {
             before(grammarAccess.getStraightAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Straight__NameAssignment_12549); 
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1280:1: rule__Straight__PoweredAssignment_2 : ( ( 'powered' ) ) ;
    public final void rule__Straight__PoweredAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1284:1: ( ( ( 'powered' ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1285:1: ( ( 'powered' ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1285:1: ( ( 'powered' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1286:1: ( 'powered' )
            {
             before(grammarAccess.getStraightAccess().getPoweredPoweredKeyword_2_0()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1287:1: ( 'powered' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1288:1: 'powered'
            {
             before(grammarAccess.getStraightAccess().getPoweredPoweredKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Straight__PoweredAssignment_22585); 
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


    // $ANTLR start "rule__Straight__QualityAssignment_3"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1303:1: rule__Straight__QualityAssignment_3 : ( ( rule__Straight__QualityAlternatives_3_0 ) ) ;
    public final void rule__Straight__QualityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1307:1: ( ( ( rule__Straight__QualityAlternatives_3_0 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1308:1: ( ( rule__Straight__QualityAlternatives_3_0 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1308:1: ( ( rule__Straight__QualityAlternatives_3_0 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1309:1: ( rule__Straight__QualityAlternatives_3_0 )
            {
             before(grammarAccess.getStraightAccess().getQualityAlternatives_3_0()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1310:1: ( rule__Straight__QualityAlternatives_3_0 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1310:2: rule__Straight__QualityAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Straight__QualityAlternatives_3_0_in_rule__Straight__QualityAssignment_32624);
            rule__Straight__QualityAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getStraightAccess().getQualityAlternatives_3_0()); 

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
    // $ANTLR end "rule__Straight__QualityAssignment_3"


    // $ANTLR start "rule__Straight__LengthAssignment_4"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1319:1: rule__Straight__LengthAssignment_4 : ( RULE_INT ) ;
    public final void rule__Straight__LengthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1323:1: ( ( RULE_INT ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1324:1: ( RULE_INT )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1324:1: ( RULE_INT )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1325:1: RULE_INT
            {
             before(grammarAccess.getStraightAccess().getLengthINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Straight__LengthAssignment_42657); 
             after(grammarAccess.getStraightAccess().getLengthINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Straight__LengthAssignment_4"


    // $ANTLR start "rule__Straight__ElevationChangeAssignment_5"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1334:1: rule__Straight__ElevationChangeAssignment_5 : ( ruleSignedInt ) ;
    public final void rule__Straight__ElevationChangeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1338:1: ( ( ruleSignedInt ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1339:1: ( ruleSignedInt )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1339:1: ( ruleSignedInt )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1340:1: ruleSignedInt
            {
             before(grammarAccess.getStraightAccess().getElevationChangeSignedIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleSignedInt_in_rule__Straight__ElevationChangeAssignment_52688);
            ruleSignedInt();

            state._fsp--;

             after(grammarAccess.getStraightAccess().getElevationChangeSignedIntParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Straight__ElevationChangeAssignment_5"


    // $ANTLR start "rule__Corner__NameAssignment_1"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1349:1: rule__Corner__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Corner__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1353:1: ( ( RULE_ID ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1354:1: ( RULE_ID )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1354:1: ( RULE_ID )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1355:1: RULE_ID
            {
             before(grammarAccess.getCornerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Corner__NameAssignment_12719); 
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1364:1: rule__Corner__DirectionAssignment_2 : ( ( rule__Corner__DirectionAlternatives_2_0 ) ) ;
    public final void rule__Corner__DirectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1368:1: ( ( ( rule__Corner__DirectionAlternatives_2_0 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1369:1: ( ( rule__Corner__DirectionAlternatives_2_0 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1369:1: ( ( rule__Corner__DirectionAlternatives_2_0 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1370:1: ( rule__Corner__DirectionAlternatives_2_0 )
            {
             before(grammarAccess.getCornerAccess().getDirectionAlternatives_2_0()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1371:1: ( rule__Corner__DirectionAlternatives_2_0 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1371:2: rule__Corner__DirectionAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__Corner__DirectionAlternatives_2_0_in_rule__Corner__DirectionAssignment_22750);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1380:1: rule__Corner__TypeAssignment_3 : ( ( rule__Corner__TypeAlternatives_3_0 ) ) ;
    public final void rule__Corner__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1384:1: ( ( ( rule__Corner__TypeAlternatives_3_0 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1385:1: ( ( rule__Corner__TypeAlternatives_3_0 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1385:1: ( ( rule__Corner__TypeAlternatives_3_0 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1386:1: ( rule__Corner__TypeAlternatives_3_0 )
            {
             before(grammarAccess.getCornerAccess().getTypeAlternatives_3_0()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1387:1: ( rule__Corner__TypeAlternatives_3_0 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1387:2: rule__Corner__TypeAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Corner__TypeAlternatives_3_0_in_rule__Corner__TypeAssignment_32783);
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


    // $ANTLR start "rule__Corner__QualityAssignment_4"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1396:1: rule__Corner__QualityAssignment_4 : ( ( rule__Corner__QualityAlternatives_4_0 ) ) ;
    public final void rule__Corner__QualityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1400:1: ( ( ( rule__Corner__QualityAlternatives_4_0 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1401:1: ( ( rule__Corner__QualityAlternatives_4_0 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1401:1: ( ( rule__Corner__QualityAlternatives_4_0 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1402:1: ( rule__Corner__QualityAlternatives_4_0 )
            {
             before(grammarAccess.getCornerAccess().getQualityAlternatives_4_0()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1403:1: ( rule__Corner__QualityAlternatives_4_0 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1403:2: rule__Corner__QualityAlternatives_4_0
            {
            pushFollow(FOLLOW_rule__Corner__QualityAlternatives_4_0_in_rule__Corner__QualityAssignment_42816);
            rule__Corner__QualityAlternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getCornerAccess().getQualityAlternatives_4_0()); 

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
    // $ANTLR end "rule__Corner__QualityAssignment_4"


    // $ANTLR start "rule__Cart__NameAssignment_1"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1412:1: rule__Cart__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Cart__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1416:1: ( ( RULE_ID ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1417:1: ( RULE_ID )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1417:1: ( RULE_ID )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1418:1: RULE_ID
            {
             before(grammarAccess.getCartAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Cart__NameAssignment_12849); 
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


    // $ANTLR start "rule__Cart__QualityAssignment_2"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1427:1: rule__Cart__QualityAssignment_2 : ( ( rule__Cart__QualityAlternatives_2_0 ) ) ;
    public final void rule__Cart__QualityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1431:1: ( ( ( rule__Cart__QualityAlternatives_2_0 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1432:1: ( ( rule__Cart__QualityAlternatives_2_0 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1432:1: ( ( rule__Cart__QualityAlternatives_2_0 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1433:1: ( rule__Cart__QualityAlternatives_2_0 )
            {
             before(grammarAccess.getCartAccess().getQualityAlternatives_2_0()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1434:1: ( rule__Cart__QualityAlternatives_2_0 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1434:2: rule__Cart__QualityAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__Cart__QualityAlternatives_2_0_in_rule__Cart__QualityAssignment_22880);
            rule__Cart__QualityAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCartAccess().getQualityAlternatives_2_0()); 

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
    // $ANTLR end "rule__Cart__QualityAssignment_2"


    // $ANTLR start "rule__Cart__SeatNumberAssignment_3"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1443:1: rule__Cart__SeatNumberAssignment_3 : ( RULE_INT ) ;
    public final void rule__Cart__SeatNumberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1447:1: ( ( RULE_INT ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1448:1: ( RULE_INT )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1448:1: ( RULE_INT )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1449:1: RULE_INT
            {
             before(grammarAccess.getCartAccess().getSeatNumberINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Cart__SeatNumberAssignment_32913); 
             after(grammarAccess.getCartAccess().getSeatNumberINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Cart__SeatNumberAssignment_3"


    // $ANTLR start "rule__SignedInt__SignAssignment_0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1458:1: rule__SignedInt__SignAssignment_0 : ( ( '-' ) ) ;
    public final void rule__SignedInt__SignAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1462:1: ( ( ( '-' ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1463:1: ( ( '-' ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1463:1: ( ( '-' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1464:1: ( '-' )
            {
             before(grammarAccess.getSignedIntAccess().getSignHyphenMinusKeyword_0_0()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1465:1: ( '-' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1466:1: '-'
            {
             before(grammarAccess.getSignedIntAccess().getSignHyphenMinusKeyword_0_0()); 
            match(input,25,FOLLOW_25_in_rule__SignedInt__SignAssignment_02949); 
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1481:1: rule__SignedInt__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__SignedInt__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1485:1: ( ( RULE_INT ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1486:1: ( RULE_INT )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1486:1: ( RULE_INT )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1487:1: RULE_INT
            {
             before(grammarAccess.getSignedIntAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SignedInt__ValueAssignment_12988); 
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
    public static final BitSet FOLLOW_11_in_rule__RollerCoaster__BaseQualityAlternatives_2_0431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RollerCoaster__BaseQualityAlternatives_2_0451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RollerCoaster__BaseQualityAlternatives_2_0471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStraight_in_rule__RollerCoaster__TrackAlternatives_3_0505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCorner_in_rule__RollerCoaster__TrackAlternatives_3_0522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Straight__QualityAlternatives_3_0555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Straight__QualityAlternatives_3_0575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Straight__QualityAlternatives_3_0595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Corner__DirectionAlternatives_2_0630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Corner__DirectionAlternatives_2_0650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Corner__TypeAlternatives_3_0685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Corner__TypeAlternatives_3_0705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Corner__TypeAlternatives_3_0725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Corner__TypeAlternatives_3_0745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Corner__QualityAlternatives_4_0780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Corner__QualityAlternatives_4_0800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Corner__QualityAlternatives_4_0820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Cart__QualityAlternatives_2_0855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Cart__QualityAlternatives_2_0875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Cart__QualityAlternatives_2_0895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__0__Impl_in_rule__RollerCoaster__Group__0927 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__1_in_rule__RollerCoaster__Group__0930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RollerCoaster__Group__0__Impl958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__1__Impl_in_rule__RollerCoaster__Group__1989 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__2_in_rule__RollerCoaster__Group__1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__NameAssignment_1_in_rule__RollerCoaster__Group__1__Impl1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__2__Impl_in_rule__RollerCoaster__Group__21049 = new BitSet(new long[]{0x0000000000E00020L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__3_in_rule__RollerCoaster__Group__21052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__BaseQualityAssignment_2_in_rule__RollerCoaster__Group__2__Impl1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__3__Impl_in_rule__RollerCoaster__Group__31109 = new BitSet(new long[]{0x0000000000E00020L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__4_in_rule__RollerCoaster__Group__31112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__TrackAssignment_3_in_rule__RollerCoaster__Group__3__Impl1139 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__4__Impl_in_rule__RollerCoaster__Group__41170 = new BitSet(new long[]{0x0000000000E00020L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__5_in_rule__RollerCoaster__Group__41173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__CartAssignment_4_in_rule__RollerCoaster__Group__4__Impl1200 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__5__Impl_in_rule__RollerCoaster__Group__51231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__TrackUnitLengthAssignment_5_in_rule__RollerCoaster__Group__5__Impl1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__Group__0__Impl_in_rule__Straight__Group__01300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Straight__Group__1_in_rule__Straight__Group__01303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Straight__Group__0__Impl1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__Group__1__Impl_in_rule__Straight__Group__11362 = new BitSet(new long[]{0x0000000001003820L});
    public static final BitSet FOLLOW_rule__Straight__Group__2_in_rule__Straight__Group__11365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__NameAssignment_1_in_rule__Straight__Group__1__Impl1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__Group__2__Impl_in_rule__Straight__Group__21422 = new BitSet(new long[]{0x0000000001003820L});
    public static final BitSet FOLLOW_rule__Straight__Group__3_in_rule__Straight__Group__21425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__PoweredAssignment_2_in_rule__Straight__Group__2__Impl1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__Group__3__Impl_in_rule__Straight__Group__31483 = new BitSet(new long[]{0x0000000001003820L});
    public static final BitSet FOLLOW_rule__Straight__Group__4_in_rule__Straight__Group__31486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__QualityAssignment_3_in_rule__Straight__Group__3__Impl1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__Group__4__Impl_in_rule__Straight__Group__41544 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_rule__Straight__Group__5_in_rule__Straight__Group__41547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__LengthAssignment_4_in_rule__Straight__Group__4__Impl1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__Group__5__Impl_in_rule__Straight__Group__51604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__ElevationChangeAssignment_5_in_rule__Straight__Group__5__Impl1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__Group__0__Impl_in_rule__Corner__Group__01674 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Corner__Group__1_in_rule__Corner__Group__01677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Corner__Group__0__Impl1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__Group__1__Impl_in_rule__Corner__Group__11736 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Corner__Group__2_in_rule__Corner__Group__11739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__NameAssignment_1_in_rule__Corner__Group__1__Impl1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__Group__2__Impl_in_rule__Corner__Group__21796 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_rule__Corner__Group__3_in_rule__Corner__Group__21799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__DirectionAssignment_2_in_rule__Corner__Group__2__Impl1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__Group__3__Impl_in_rule__Corner__Group__31856 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__Corner__Group__4_in_rule__Corner__Group__31859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__TypeAssignment_3_in_rule__Corner__Group__3__Impl1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__Group__4__Impl_in_rule__Corner__Group__41916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__QualityAssignment_4_in_rule__Corner__Group__4__Impl1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cart__Group__0__Impl_in_rule__Cart__Group__01984 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Cart__Group__1_in_rule__Cart__Group__01987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Cart__Group__0__Impl2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cart__Group__1__Impl_in_rule__Cart__Group__12046 = new BitSet(new long[]{0x0000000000003820L});
    public static final BitSet FOLLOW_rule__Cart__Group__2_in_rule__Cart__Group__12049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cart__NameAssignment_1_in_rule__Cart__Group__1__Impl2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cart__Group__2__Impl_in_rule__Cart__Group__22106 = new BitSet(new long[]{0x0000000000003820L});
    public static final BitSet FOLLOW_rule__Cart__Group__3_in_rule__Cart__Group__22109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cart__QualityAssignment_2_in_rule__Cart__Group__2__Impl2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cart__Group__3__Impl_in_rule__Cart__Group__32167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cart__SeatNumberAssignment_3_in_rule__Cart__Group__3__Impl2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedInt__Group__0__Impl_in_rule__SignedInt__Group__02232 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_rule__SignedInt__Group__1_in_rule__SignedInt__Group__02235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedInt__SignAssignment_0_in_rule__SignedInt__Group__0__Impl2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedInt__Group__1__Impl_in_rule__SignedInt__Group__12293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedInt__ValueAssignment_1_in_rule__SignedInt__Group__1__Impl2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRollerCoaster_in_rule__Model__RollerCoasterAssignment2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RollerCoaster__NameAssignment_12390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__BaseQualityAlternatives_2_0_in_rule__RollerCoaster__BaseQualityAssignment_22421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__TrackAlternatives_3_0_in_rule__RollerCoaster__TrackAssignment_32454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCart_in_rule__RollerCoaster__CartAssignment_42487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RollerCoaster__TrackUnitLengthAssignment_52518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Straight__NameAssignment_12549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Straight__PoweredAssignment_22585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__QualityAlternatives_3_0_in_rule__Straight__QualityAssignment_32624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Straight__LengthAssignment_42657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInt_in_rule__Straight__ElevationChangeAssignment_52688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Corner__NameAssignment_12719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__DirectionAlternatives_2_0_in_rule__Corner__DirectionAssignment_22750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__TypeAlternatives_3_0_in_rule__Corner__TypeAssignment_32783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__QualityAlternatives_4_0_in_rule__Corner__QualityAssignment_42816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Cart__NameAssignment_12849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cart__QualityAlternatives_2_0_in_rule__Cart__QualityAssignment_22880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Cart__SeatNumberAssignment_32913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SignedInt__SignAssignment_02949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SignedInt__ValueAssignment_12988 = new BitSet(new long[]{0x0000000000000002L});

}