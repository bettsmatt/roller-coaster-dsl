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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'wood'", "'iron'", "'steel'", "'left'", "'right'", "'sharp45'", "'sharp90'", "'easy45'", "'easy90'", "'RollerCoaster'", "';'", "'Base Quality ='", "'Track =('", "');'", "'Carts =('", "'DefaultTrackUnitLength ='", "'Straight'", "'length ='", "'elevationChange ='", "'Corner'", "'Cart'", "'seats ='", "'powered'", "'-'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
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
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:69:1: ruleModel : ( ( rule__Model__RollerCoasterAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:73:2: ( ( ( rule__Model__RollerCoasterAssignment )* ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:74:1: ( ( rule__Model__RollerCoasterAssignment )* )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:74:1: ( ( rule__Model__RollerCoasterAssignment )* )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:75:1: ( rule__Model__RollerCoasterAssignment )*
            {
             before(grammarAccess.getModelAccess().getRollerCoasterAssignment()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:76:1: ( rule__Model__RollerCoasterAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:76:2: rule__Model__RollerCoasterAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__RollerCoasterAssignment_in_ruleModel94);
            	    rule__Model__RollerCoasterAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

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
            pushFollow(FOLLOW_ruleRollerCoaster_in_entryRuleRollerCoaster122);
            ruleRollerCoaster();

            state._fsp--;

             after(grammarAccess.getRollerCoasterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRollerCoaster129); 

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
            pushFollow(FOLLOW_rule__RollerCoaster__Group__0_in_ruleRollerCoaster155);
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
            pushFollow(FOLLOW_ruleStraight_in_entryRuleStraight182);
            ruleStraight();

            state._fsp--;

             after(grammarAccess.getStraightRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStraight189); 

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
            pushFollow(FOLLOW_rule__Straight__Group__0_in_ruleStraight215);
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
            pushFollow(FOLLOW_ruleCorner_in_entryRuleCorner242);
            ruleCorner();

            state._fsp--;

             after(grammarAccess.getCornerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCorner249); 

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
            pushFollow(FOLLOW_rule__Corner__Group__0_in_ruleCorner275);
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
            pushFollow(FOLLOW_ruleCart_in_entryRuleCart302);
            ruleCart();

            state._fsp--;

             after(grammarAccess.getCartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCart309); 

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
            pushFollow(FOLLOW_rule__Cart__Group__0_in_ruleCart335);
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
            pushFollow(FOLLOW_ruleSignedInt_in_entryRuleSignedInt362);
            ruleSignedInt();

            state._fsp--;

             after(grammarAccess.getSignedIntRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedInt369); 

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
            pushFollow(FOLLOW_rule__SignedInt__Group__0_in_ruleSignedInt395);
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


    // $ANTLR start "rule__RollerCoaster__BaseQualityAlternatives_4_0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:228:1: rule__RollerCoaster__BaseQualityAlternatives_4_0 : ( ( 'wood' ) | ( 'iron' ) | ( 'steel' ) );
    public final void rule__RollerCoaster__BaseQualityAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:232:1: ( ( 'wood' ) | ( 'iron' ) | ( 'steel' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:233:1: ( 'wood' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:233:1: ( 'wood' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:234:1: 'wood'
                    {
                     before(grammarAccess.getRollerCoasterAccess().getBaseQualityWoodKeyword_4_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__RollerCoaster__BaseQualityAlternatives_4_0432); 
                     after(grammarAccess.getRollerCoasterAccess().getBaseQualityWoodKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:241:6: ( 'iron' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:241:6: ( 'iron' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:242:1: 'iron'
                    {
                     before(grammarAccess.getRollerCoasterAccess().getBaseQualityIronKeyword_4_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__RollerCoaster__BaseQualityAlternatives_4_0452); 
                     after(grammarAccess.getRollerCoasterAccess().getBaseQualityIronKeyword_4_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:249:6: ( 'steel' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:249:6: ( 'steel' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:250:1: 'steel'
                    {
                     before(grammarAccess.getRollerCoasterAccess().getBaseQualitySteelKeyword_4_0_2()); 
                    match(input,13,FOLLOW_13_in_rule__RollerCoaster__BaseQualityAlternatives_4_0472); 
                     after(grammarAccess.getRollerCoasterAccess().getBaseQualitySteelKeyword_4_0_2()); 

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
    // $ANTLR end "rule__RollerCoaster__BaseQualityAlternatives_4_0"


    // $ANTLR start "rule__RollerCoaster__TrackAlternatives_7_0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:262:1: rule__RollerCoaster__TrackAlternatives_7_0 : ( ( ruleStraight ) | ( ruleCorner ) );
    public final void rule__RollerCoaster__TrackAlternatives_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:266:1: ( ( ruleStraight ) | ( ruleCorner ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                alt3=1;
            }
            else if ( (LA3_0==30) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:267:1: ( ruleStraight )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:267:1: ( ruleStraight )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:268:1: ruleStraight
                    {
                     before(grammarAccess.getRollerCoasterAccess().getTrackStraightParserRuleCall_7_0_0()); 
                    pushFollow(FOLLOW_ruleStraight_in_rule__RollerCoaster__TrackAlternatives_7_0506);
                    ruleStraight();

                    state._fsp--;

                     after(grammarAccess.getRollerCoasterAccess().getTrackStraightParserRuleCall_7_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:273:6: ( ruleCorner )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:273:6: ( ruleCorner )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:274:1: ruleCorner
                    {
                     before(grammarAccess.getRollerCoasterAccess().getTrackCornerParserRuleCall_7_0_1()); 
                    pushFollow(FOLLOW_ruleCorner_in_rule__RollerCoaster__TrackAlternatives_7_0523);
                    ruleCorner();

                    state._fsp--;

                     after(grammarAccess.getRollerCoasterAccess().getTrackCornerParserRuleCall_7_0_1()); 

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
    // $ANTLR end "rule__RollerCoaster__TrackAlternatives_7_0"


    // $ANTLR start "rule__Straight__QualityAlternatives_3_0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:284:1: rule__Straight__QualityAlternatives_3_0 : ( ( 'wood' ) | ( 'iron' ) | ( 'steel' ) );
    public final void rule__Straight__QualityAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:288:1: ( ( 'wood' ) | ( 'iron' ) | ( 'steel' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:289:1: ( 'wood' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:289:1: ( 'wood' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:290:1: 'wood'
                    {
                     before(grammarAccess.getStraightAccess().getQualityWoodKeyword_3_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Straight__QualityAlternatives_3_0556); 
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
                    match(input,12,FOLLOW_12_in_rule__Straight__QualityAlternatives_3_0576); 
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
                    match(input,13,FOLLOW_13_in_rule__Straight__QualityAlternatives_3_0596); 
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
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:323:1: ( 'left' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:323:1: ( 'left' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:324:1: 'left'
                    {
                     before(grammarAccess.getCornerAccess().getDirectionLeftKeyword_2_0_0()); 
                    match(input,14,FOLLOW_14_in_rule__Corner__DirectionAlternatives_2_0631); 
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
                    match(input,15,FOLLOW_15_in_rule__Corner__DirectionAlternatives_2_0651); 
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
            int alt6=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            case 19:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:349:1: ( 'sharp45' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:349:1: ( 'sharp45' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:350:1: 'sharp45'
                    {
                     before(grammarAccess.getCornerAccess().getTypeSharp45Keyword_3_0_0()); 
                    match(input,16,FOLLOW_16_in_rule__Corner__TypeAlternatives_3_0686); 
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
                    match(input,17,FOLLOW_17_in_rule__Corner__TypeAlternatives_3_0706); 
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
                    match(input,18,FOLLOW_18_in_rule__Corner__TypeAlternatives_3_0726); 
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
                    match(input,19,FOLLOW_19_in_rule__Corner__TypeAlternatives_3_0746); 
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
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:391:1: ( 'wood' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:391:1: ( 'wood' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:392:1: 'wood'
                    {
                     before(grammarAccess.getCornerAccess().getQualityWoodKeyword_4_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Corner__QualityAlternatives_4_0781); 
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
                    match(input,12,FOLLOW_12_in_rule__Corner__QualityAlternatives_4_0801); 
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
                    match(input,13,FOLLOW_13_in_rule__Corner__QualityAlternatives_4_0821); 
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
            int alt8=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt8=1;
                }
                break;
            case 12:
                {
                alt8=2;
                }
                break;
            case 13:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:425:1: ( 'wood' )
                    {
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:425:1: ( 'wood' )
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:426:1: 'wood'
                    {
                     before(grammarAccess.getCartAccess().getQualityWoodKeyword_2_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Cart__QualityAlternatives_2_0856); 
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
                    match(input,12,FOLLOW_12_in_rule__Cart__QualityAlternatives_2_0876); 
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
                    match(input,13,FOLLOW_13_in_rule__Cart__QualityAlternatives_2_0896); 
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
            pushFollow(FOLLOW_rule__RollerCoaster__Group__0__Impl_in_rule__RollerCoaster__Group__0928);
            rule__RollerCoaster__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RollerCoaster__Group__1_in_rule__RollerCoaster__Group__0931);
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
            match(input,20,FOLLOW_20_in_rule__RollerCoaster__Group__0__Impl959); 
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
            pushFollow(FOLLOW_rule__RollerCoaster__Group__1__Impl_in_rule__RollerCoaster__Group__1990);
            rule__RollerCoaster__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RollerCoaster__Group__2_in_rule__RollerCoaster__Group__1993);
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
            pushFollow(FOLLOW_rule__RollerCoaster__NameAssignment_1_in_rule__RollerCoaster__Group__1__Impl1020);
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
            pushFollow(FOLLOW_rule__RollerCoaster__Group__2__Impl_in_rule__RollerCoaster__Group__21050);
            rule__RollerCoaster__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RollerCoaster__Group__3_in_rule__RollerCoaster__Group__21053);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:528:1: rule__RollerCoaster__Group__2__Impl : ( ';' ) ;
    public final void rule__RollerCoaster__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:532:1: ( ( ';' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:533:1: ( ';' )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:533:1: ( ';' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:534:1: ';'
            {
             before(grammarAccess.getRollerCoasterAccess().getSemicolonKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__RollerCoaster__Group__2__Impl1081); 
             after(grammarAccess.getRollerCoasterAccess().getSemicolonKeyword_2()); 

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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:547:1: rule__RollerCoaster__Group__3 : rule__RollerCoaster__Group__3__Impl rule__RollerCoaster__Group__4 ;
    public final void rule__RollerCoaster__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:551:1: ( rule__RollerCoaster__Group__3__Impl rule__RollerCoaster__Group__4 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:552:2: rule__RollerCoaster__Group__3__Impl rule__RollerCoaster__Group__4
            {
            pushFollow(FOLLOW_rule__RollerCoaster__Group__3__Impl_in_rule__RollerCoaster__Group__31112);
            rule__RollerCoaster__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RollerCoaster__Group__4_in_rule__RollerCoaster__Group__31115);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:559:1: rule__RollerCoaster__Group__3__Impl : ( 'Base Quality =' ) ;
    public final void rule__RollerCoaster__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:563:1: ( ( 'Base Quality =' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:564:1: ( 'Base Quality =' )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:564:1: ( 'Base Quality =' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:565:1: 'Base Quality ='
            {
             before(grammarAccess.getRollerCoasterAccess().getBaseQualityKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__RollerCoaster__Group__3__Impl1143); 
             after(grammarAccess.getRollerCoasterAccess().getBaseQualityKeyword_3()); 

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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:578:1: rule__RollerCoaster__Group__4 : rule__RollerCoaster__Group__4__Impl rule__RollerCoaster__Group__5 ;
    public final void rule__RollerCoaster__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:582:1: ( rule__RollerCoaster__Group__4__Impl rule__RollerCoaster__Group__5 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:583:2: rule__RollerCoaster__Group__4__Impl rule__RollerCoaster__Group__5
            {
            pushFollow(FOLLOW_rule__RollerCoaster__Group__4__Impl_in_rule__RollerCoaster__Group__41174);
            rule__RollerCoaster__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RollerCoaster__Group__5_in_rule__RollerCoaster__Group__41177);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:590:1: rule__RollerCoaster__Group__4__Impl : ( ( rule__RollerCoaster__BaseQualityAssignment_4 ) ) ;
    public final void rule__RollerCoaster__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:594:1: ( ( ( rule__RollerCoaster__BaseQualityAssignment_4 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:595:1: ( ( rule__RollerCoaster__BaseQualityAssignment_4 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:595:1: ( ( rule__RollerCoaster__BaseQualityAssignment_4 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:596:1: ( rule__RollerCoaster__BaseQualityAssignment_4 )
            {
             before(grammarAccess.getRollerCoasterAccess().getBaseQualityAssignment_4()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:597:1: ( rule__RollerCoaster__BaseQualityAssignment_4 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:597:2: rule__RollerCoaster__BaseQualityAssignment_4
            {
            pushFollow(FOLLOW_rule__RollerCoaster__BaseQualityAssignment_4_in_rule__RollerCoaster__Group__4__Impl1204);
            rule__RollerCoaster__BaseQualityAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRollerCoasterAccess().getBaseQualityAssignment_4()); 

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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:607:1: rule__RollerCoaster__Group__5 : rule__RollerCoaster__Group__5__Impl rule__RollerCoaster__Group__6 ;
    public final void rule__RollerCoaster__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:611:1: ( rule__RollerCoaster__Group__5__Impl rule__RollerCoaster__Group__6 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:612:2: rule__RollerCoaster__Group__5__Impl rule__RollerCoaster__Group__6
            {
            pushFollow(FOLLOW_rule__RollerCoaster__Group__5__Impl_in_rule__RollerCoaster__Group__51234);
            rule__RollerCoaster__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RollerCoaster__Group__6_in_rule__RollerCoaster__Group__51237);
            rule__RollerCoaster__Group__6();

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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:619:1: rule__RollerCoaster__Group__5__Impl : ( ';' ) ;
    public final void rule__RollerCoaster__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:623:1: ( ( ';' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:624:1: ( ';' )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:624:1: ( ';' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:625:1: ';'
            {
             before(grammarAccess.getRollerCoasterAccess().getSemicolonKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__RollerCoaster__Group__5__Impl1265); 
             after(grammarAccess.getRollerCoasterAccess().getSemicolonKeyword_5()); 

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


    // $ANTLR start "rule__RollerCoaster__Group__6"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:638:1: rule__RollerCoaster__Group__6 : rule__RollerCoaster__Group__6__Impl rule__RollerCoaster__Group__7 ;
    public final void rule__RollerCoaster__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:642:1: ( rule__RollerCoaster__Group__6__Impl rule__RollerCoaster__Group__7 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:643:2: rule__RollerCoaster__Group__6__Impl rule__RollerCoaster__Group__7
            {
            pushFollow(FOLLOW_rule__RollerCoaster__Group__6__Impl_in_rule__RollerCoaster__Group__61296);
            rule__RollerCoaster__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RollerCoaster__Group__7_in_rule__RollerCoaster__Group__61299);
            rule__RollerCoaster__Group__7();

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
    // $ANTLR end "rule__RollerCoaster__Group__6"


    // $ANTLR start "rule__RollerCoaster__Group__6__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:650:1: rule__RollerCoaster__Group__6__Impl : ( 'Track =(' ) ;
    public final void rule__RollerCoaster__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:654:1: ( ( 'Track =(' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:655:1: ( 'Track =(' )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:655:1: ( 'Track =(' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:656:1: 'Track =('
            {
             before(grammarAccess.getRollerCoasterAccess().getTrackKeyword_6()); 
            match(input,23,FOLLOW_23_in_rule__RollerCoaster__Group__6__Impl1327); 
             after(grammarAccess.getRollerCoasterAccess().getTrackKeyword_6()); 

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
    // $ANTLR end "rule__RollerCoaster__Group__6__Impl"


    // $ANTLR start "rule__RollerCoaster__Group__7"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:669:1: rule__RollerCoaster__Group__7 : rule__RollerCoaster__Group__7__Impl rule__RollerCoaster__Group__8 ;
    public final void rule__RollerCoaster__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:673:1: ( rule__RollerCoaster__Group__7__Impl rule__RollerCoaster__Group__8 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:674:2: rule__RollerCoaster__Group__7__Impl rule__RollerCoaster__Group__8
            {
            pushFollow(FOLLOW_rule__RollerCoaster__Group__7__Impl_in_rule__RollerCoaster__Group__71358);
            rule__RollerCoaster__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RollerCoaster__Group__8_in_rule__RollerCoaster__Group__71361);
            rule__RollerCoaster__Group__8();

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
    // $ANTLR end "rule__RollerCoaster__Group__7"


    // $ANTLR start "rule__RollerCoaster__Group__7__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:681:1: rule__RollerCoaster__Group__7__Impl : ( ( rule__RollerCoaster__TrackAssignment_7 )* ) ;
    public final void rule__RollerCoaster__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:685:1: ( ( ( rule__RollerCoaster__TrackAssignment_7 )* ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:686:1: ( ( rule__RollerCoaster__TrackAssignment_7 )* )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:686:1: ( ( rule__RollerCoaster__TrackAssignment_7 )* )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:687:1: ( rule__RollerCoaster__TrackAssignment_7 )*
            {
             before(grammarAccess.getRollerCoasterAccess().getTrackAssignment_7()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:688:1: ( rule__RollerCoaster__TrackAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27||LA9_0==30) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:688:2: rule__RollerCoaster__TrackAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__RollerCoaster__TrackAssignment_7_in_rule__RollerCoaster__Group__7__Impl1388);
            	    rule__RollerCoaster__TrackAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRollerCoasterAccess().getTrackAssignment_7()); 

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
    // $ANTLR end "rule__RollerCoaster__Group__7__Impl"


    // $ANTLR start "rule__RollerCoaster__Group__8"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:698:1: rule__RollerCoaster__Group__8 : rule__RollerCoaster__Group__8__Impl rule__RollerCoaster__Group__9 ;
    public final void rule__RollerCoaster__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:702:1: ( rule__RollerCoaster__Group__8__Impl rule__RollerCoaster__Group__9 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:703:2: rule__RollerCoaster__Group__8__Impl rule__RollerCoaster__Group__9
            {
            pushFollow(FOLLOW_rule__RollerCoaster__Group__8__Impl_in_rule__RollerCoaster__Group__81419);
            rule__RollerCoaster__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RollerCoaster__Group__9_in_rule__RollerCoaster__Group__81422);
            rule__RollerCoaster__Group__9();

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
    // $ANTLR end "rule__RollerCoaster__Group__8"


    // $ANTLR start "rule__RollerCoaster__Group__8__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:710:1: rule__RollerCoaster__Group__8__Impl : ( ');' ) ;
    public final void rule__RollerCoaster__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:714:1: ( ( ');' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:715:1: ( ');' )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:715:1: ( ');' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:716:1: ');'
            {
             before(grammarAccess.getRollerCoasterAccess().getRightParenthesisSemicolonKeyword_8()); 
            match(input,24,FOLLOW_24_in_rule__RollerCoaster__Group__8__Impl1450); 
             after(grammarAccess.getRollerCoasterAccess().getRightParenthesisSemicolonKeyword_8()); 

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
    // $ANTLR end "rule__RollerCoaster__Group__8__Impl"


    // $ANTLR start "rule__RollerCoaster__Group__9"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:729:1: rule__RollerCoaster__Group__9 : rule__RollerCoaster__Group__9__Impl rule__RollerCoaster__Group__10 ;
    public final void rule__RollerCoaster__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:733:1: ( rule__RollerCoaster__Group__9__Impl rule__RollerCoaster__Group__10 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:734:2: rule__RollerCoaster__Group__9__Impl rule__RollerCoaster__Group__10
            {
            pushFollow(FOLLOW_rule__RollerCoaster__Group__9__Impl_in_rule__RollerCoaster__Group__91481);
            rule__RollerCoaster__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RollerCoaster__Group__10_in_rule__RollerCoaster__Group__91484);
            rule__RollerCoaster__Group__10();

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
    // $ANTLR end "rule__RollerCoaster__Group__9"


    // $ANTLR start "rule__RollerCoaster__Group__9__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:741:1: rule__RollerCoaster__Group__9__Impl : ( 'Carts =(' ) ;
    public final void rule__RollerCoaster__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:745:1: ( ( 'Carts =(' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:746:1: ( 'Carts =(' )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:746:1: ( 'Carts =(' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:747:1: 'Carts =('
            {
             before(grammarAccess.getRollerCoasterAccess().getCartsKeyword_9()); 
            match(input,25,FOLLOW_25_in_rule__RollerCoaster__Group__9__Impl1512); 
             after(grammarAccess.getRollerCoasterAccess().getCartsKeyword_9()); 

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
    // $ANTLR end "rule__RollerCoaster__Group__9__Impl"


    // $ANTLR start "rule__RollerCoaster__Group__10"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:760:1: rule__RollerCoaster__Group__10 : rule__RollerCoaster__Group__10__Impl rule__RollerCoaster__Group__11 ;
    public final void rule__RollerCoaster__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:764:1: ( rule__RollerCoaster__Group__10__Impl rule__RollerCoaster__Group__11 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:765:2: rule__RollerCoaster__Group__10__Impl rule__RollerCoaster__Group__11
            {
            pushFollow(FOLLOW_rule__RollerCoaster__Group__10__Impl_in_rule__RollerCoaster__Group__101543);
            rule__RollerCoaster__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RollerCoaster__Group__11_in_rule__RollerCoaster__Group__101546);
            rule__RollerCoaster__Group__11();

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
    // $ANTLR end "rule__RollerCoaster__Group__10"


    // $ANTLR start "rule__RollerCoaster__Group__10__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:772:1: rule__RollerCoaster__Group__10__Impl : ( ( rule__RollerCoaster__CartAssignment_10 )* ) ;
    public final void rule__RollerCoaster__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:776:1: ( ( ( rule__RollerCoaster__CartAssignment_10 )* ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:777:1: ( ( rule__RollerCoaster__CartAssignment_10 )* )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:777:1: ( ( rule__RollerCoaster__CartAssignment_10 )* )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:778:1: ( rule__RollerCoaster__CartAssignment_10 )*
            {
             before(grammarAccess.getRollerCoasterAccess().getCartAssignment_10()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:779:1: ( rule__RollerCoaster__CartAssignment_10 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:779:2: rule__RollerCoaster__CartAssignment_10
            	    {
            	    pushFollow(FOLLOW_rule__RollerCoaster__CartAssignment_10_in_rule__RollerCoaster__Group__10__Impl1573);
            	    rule__RollerCoaster__CartAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRollerCoasterAccess().getCartAssignment_10()); 

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
    // $ANTLR end "rule__RollerCoaster__Group__10__Impl"


    // $ANTLR start "rule__RollerCoaster__Group__11"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:789:1: rule__RollerCoaster__Group__11 : rule__RollerCoaster__Group__11__Impl rule__RollerCoaster__Group__12 ;
    public final void rule__RollerCoaster__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:793:1: ( rule__RollerCoaster__Group__11__Impl rule__RollerCoaster__Group__12 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:794:2: rule__RollerCoaster__Group__11__Impl rule__RollerCoaster__Group__12
            {
            pushFollow(FOLLOW_rule__RollerCoaster__Group__11__Impl_in_rule__RollerCoaster__Group__111604);
            rule__RollerCoaster__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RollerCoaster__Group__12_in_rule__RollerCoaster__Group__111607);
            rule__RollerCoaster__Group__12();

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
    // $ANTLR end "rule__RollerCoaster__Group__11"


    // $ANTLR start "rule__RollerCoaster__Group__11__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:801:1: rule__RollerCoaster__Group__11__Impl : ( ');' ) ;
    public final void rule__RollerCoaster__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:805:1: ( ( ');' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:806:1: ( ');' )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:806:1: ( ');' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:807:1: ');'
            {
             before(grammarAccess.getRollerCoasterAccess().getRightParenthesisSemicolonKeyword_11()); 
            match(input,24,FOLLOW_24_in_rule__RollerCoaster__Group__11__Impl1635); 
             after(grammarAccess.getRollerCoasterAccess().getRightParenthesisSemicolonKeyword_11()); 

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
    // $ANTLR end "rule__RollerCoaster__Group__11__Impl"


    // $ANTLR start "rule__RollerCoaster__Group__12"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:820:1: rule__RollerCoaster__Group__12 : rule__RollerCoaster__Group__12__Impl rule__RollerCoaster__Group__13 ;
    public final void rule__RollerCoaster__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:824:1: ( rule__RollerCoaster__Group__12__Impl rule__RollerCoaster__Group__13 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:825:2: rule__RollerCoaster__Group__12__Impl rule__RollerCoaster__Group__13
            {
            pushFollow(FOLLOW_rule__RollerCoaster__Group__12__Impl_in_rule__RollerCoaster__Group__121666);
            rule__RollerCoaster__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RollerCoaster__Group__13_in_rule__RollerCoaster__Group__121669);
            rule__RollerCoaster__Group__13();

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
    // $ANTLR end "rule__RollerCoaster__Group__12"


    // $ANTLR start "rule__RollerCoaster__Group__12__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:832:1: rule__RollerCoaster__Group__12__Impl : ( 'DefaultTrackUnitLength =' ) ;
    public final void rule__RollerCoaster__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:836:1: ( ( 'DefaultTrackUnitLength =' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:837:1: ( 'DefaultTrackUnitLength =' )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:837:1: ( 'DefaultTrackUnitLength =' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:838:1: 'DefaultTrackUnitLength ='
            {
             before(grammarAccess.getRollerCoasterAccess().getDefaultTrackUnitLengthKeyword_12()); 
            match(input,26,FOLLOW_26_in_rule__RollerCoaster__Group__12__Impl1697); 
             after(grammarAccess.getRollerCoasterAccess().getDefaultTrackUnitLengthKeyword_12()); 

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
    // $ANTLR end "rule__RollerCoaster__Group__12__Impl"


    // $ANTLR start "rule__RollerCoaster__Group__13"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:851:1: rule__RollerCoaster__Group__13 : rule__RollerCoaster__Group__13__Impl rule__RollerCoaster__Group__14 ;
    public final void rule__RollerCoaster__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:855:1: ( rule__RollerCoaster__Group__13__Impl rule__RollerCoaster__Group__14 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:856:2: rule__RollerCoaster__Group__13__Impl rule__RollerCoaster__Group__14
            {
            pushFollow(FOLLOW_rule__RollerCoaster__Group__13__Impl_in_rule__RollerCoaster__Group__131728);
            rule__RollerCoaster__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RollerCoaster__Group__14_in_rule__RollerCoaster__Group__131731);
            rule__RollerCoaster__Group__14();

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
    // $ANTLR end "rule__RollerCoaster__Group__13"


    // $ANTLR start "rule__RollerCoaster__Group__13__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:863:1: rule__RollerCoaster__Group__13__Impl : ( ( rule__RollerCoaster__TrackUnitLengthAssignment_13 ) ) ;
    public final void rule__RollerCoaster__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:867:1: ( ( ( rule__RollerCoaster__TrackUnitLengthAssignment_13 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:868:1: ( ( rule__RollerCoaster__TrackUnitLengthAssignment_13 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:868:1: ( ( rule__RollerCoaster__TrackUnitLengthAssignment_13 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:869:1: ( rule__RollerCoaster__TrackUnitLengthAssignment_13 )
            {
             before(grammarAccess.getRollerCoasterAccess().getTrackUnitLengthAssignment_13()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:870:1: ( rule__RollerCoaster__TrackUnitLengthAssignment_13 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:870:2: rule__RollerCoaster__TrackUnitLengthAssignment_13
            {
            pushFollow(FOLLOW_rule__RollerCoaster__TrackUnitLengthAssignment_13_in_rule__RollerCoaster__Group__13__Impl1758);
            rule__RollerCoaster__TrackUnitLengthAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getRollerCoasterAccess().getTrackUnitLengthAssignment_13()); 

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
    // $ANTLR end "rule__RollerCoaster__Group__13__Impl"


    // $ANTLR start "rule__RollerCoaster__Group__14"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:880:1: rule__RollerCoaster__Group__14 : rule__RollerCoaster__Group__14__Impl ;
    public final void rule__RollerCoaster__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:884:1: ( rule__RollerCoaster__Group__14__Impl )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:885:2: rule__RollerCoaster__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__RollerCoaster__Group__14__Impl_in_rule__RollerCoaster__Group__141788);
            rule__RollerCoaster__Group__14__Impl();

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
    // $ANTLR end "rule__RollerCoaster__Group__14"


    // $ANTLR start "rule__RollerCoaster__Group__14__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:891:1: rule__RollerCoaster__Group__14__Impl : ( ';' ) ;
    public final void rule__RollerCoaster__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:895:1: ( ( ';' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:896:1: ( ';' )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:896:1: ( ';' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:897:1: ';'
            {
             before(grammarAccess.getRollerCoasterAccess().getSemicolonKeyword_14()); 
            match(input,21,FOLLOW_21_in_rule__RollerCoaster__Group__14__Impl1816); 
             after(grammarAccess.getRollerCoasterAccess().getSemicolonKeyword_14()); 

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
    // $ANTLR end "rule__RollerCoaster__Group__14__Impl"


    // $ANTLR start "rule__Straight__Group__0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:940:1: rule__Straight__Group__0 : rule__Straight__Group__0__Impl rule__Straight__Group__1 ;
    public final void rule__Straight__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:944:1: ( rule__Straight__Group__0__Impl rule__Straight__Group__1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:945:2: rule__Straight__Group__0__Impl rule__Straight__Group__1
            {
            pushFollow(FOLLOW_rule__Straight__Group__0__Impl_in_rule__Straight__Group__01877);
            rule__Straight__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Straight__Group__1_in_rule__Straight__Group__01880);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:952:1: rule__Straight__Group__0__Impl : ( 'Straight' ) ;
    public final void rule__Straight__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:956:1: ( ( 'Straight' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:957:1: ( 'Straight' )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:957:1: ( 'Straight' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:958:1: 'Straight'
            {
             before(grammarAccess.getStraightAccess().getStraightKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Straight__Group__0__Impl1908); 
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:971:1: rule__Straight__Group__1 : rule__Straight__Group__1__Impl rule__Straight__Group__2 ;
    public final void rule__Straight__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:975:1: ( rule__Straight__Group__1__Impl rule__Straight__Group__2 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:976:2: rule__Straight__Group__1__Impl rule__Straight__Group__2
            {
            pushFollow(FOLLOW_rule__Straight__Group__1__Impl_in_rule__Straight__Group__11939);
            rule__Straight__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Straight__Group__2_in_rule__Straight__Group__11942);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:983:1: rule__Straight__Group__1__Impl : ( ( rule__Straight__NameAssignment_1 ) ) ;
    public final void rule__Straight__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:987:1: ( ( ( rule__Straight__NameAssignment_1 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:988:1: ( ( rule__Straight__NameAssignment_1 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:988:1: ( ( rule__Straight__NameAssignment_1 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:989:1: ( rule__Straight__NameAssignment_1 )
            {
             before(grammarAccess.getStraightAccess().getNameAssignment_1()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:990:1: ( rule__Straight__NameAssignment_1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:990:2: rule__Straight__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Straight__NameAssignment_1_in_rule__Straight__Group__1__Impl1969);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1000:1: rule__Straight__Group__2 : rule__Straight__Group__2__Impl rule__Straight__Group__3 ;
    public final void rule__Straight__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1004:1: ( rule__Straight__Group__2__Impl rule__Straight__Group__3 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1005:2: rule__Straight__Group__2__Impl rule__Straight__Group__3
            {
            pushFollow(FOLLOW_rule__Straight__Group__2__Impl_in_rule__Straight__Group__21999);
            rule__Straight__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Straight__Group__3_in_rule__Straight__Group__22002);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1012:1: rule__Straight__Group__2__Impl : ( ( rule__Straight__PoweredAssignment_2 )? ) ;
    public final void rule__Straight__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1016:1: ( ( ( rule__Straight__PoweredAssignment_2 )? ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1017:1: ( ( rule__Straight__PoweredAssignment_2 )? )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1017:1: ( ( rule__Straight__PoweredAssignment_2 )? )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1018:1: ( rule__Straight__PoweredAssignment_2 )?
            {
             before(grammarAccess.getStraightAccess().getPoweredAssignment_2()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1019:1: ( rule__Straight__PoweredAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1019:2: rule__Straight__PoweredAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Straight__PoweredAssignment_2_in_rule__Straight__Group__2__Impl2029);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1029:1: rule__Straight__Group__3 : rule__Straight__Group__3__Impl rule__Straight__Group__4 ;
    public final void rule__Straight__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1033:1: ( rule__Straight__Group__3__Impl rule__Straight__Group__4 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1034:2: rule__Straight__Group__3__Impl rule__Straight__Group__4
            {
            pushFollow(FOLLOW_rule__Straight__Group__3__Impl_in_rule__Straight__Group__32060);
            rule__Straight__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Straight__Group__4_in_rule__Straight__Group__32063);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1041:1: rule__Straight__Group__3__Impl : ( ( rule__Straight__QualityAssignment_3 )? ) ;
    public final void rule__Straight__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1045:1: ( ( ( rule__Straight__QualityAssignment_3 )? ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1046:1: ( ( rule__Straight__QualityAssignment_3 )? )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1046:1: ( ( rule__Straight__QualityAssignment_3 )? )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1047:1: ( rule__Straight__QualityAssignment_3 )?
            {
             before(grammarAccess.getStraightAccess().getQualityAssignment_3()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1048:1: ( rule__Straight__QualityAssignment_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=11 && LA12_0<=13)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1048:2: rule__Straight__QualityAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Straight__QualityAssignment_3_in_rule__Straight__Group__3__Impl2090);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1058:1: rule__Straight__Group__4 : rule__Straight__Group__4__Impl rule__Straight__Group__5 ;
    public final void rule__Straight__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1062:1: ( rule__Straight__Group__4__Impl rule__Straight__Group__5 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1063:2: rule__Straight__Group__4__Impl rule__Straight__Group__5
            {
            pushFollow(FOLLOW_rule__Straight__Group__4__Impl_in_rule__Straight__Group__42121);
            rule__Straight__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Straight__Group__5_in_rule__Straight__Group__42124);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1070:1: rule__Straight__Group__4__Impl : ( 'length =' ) ;
    public final void rule__Straight__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1074:1: ( ( 'length =' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1075:1: ( 'length =' )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1075:1: ( 'length =' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1076:1: 'length ='
            {
             before(grammarAccess.getStraightAccess().getLengthKeyword_4()); 
            match(input,28,FOLLOW_28_in_rule__Straight__Group__4__Impl2152); 
             after(grammarAccess.getStraightAccess().getLengthKeyword_4()); 

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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1089:1: rule__Straight__Group__5 : rule__Straight__Group__5__Impl rule__Straight__Group__6 ;
    public final void rule__Straight__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1093:1: ( rule__Straight__Group__5__Impl rule__Straight__Group__6 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1094:2: rule__Straight__Group__5__Impl rule__Straight__Group__6
            {
            pushFollow(FOLLOW_rule__Straight__Group__5__Impl_in_rule__Straight__Group__52183);
            rule__Straight__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Straight__Group__6_in_rule__Straight__Group__52186);
            rule__Straight__Group__6();

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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1101:1: rule__Straight__Group__5__Impl : ( ( rule__Straight__LengthAssignment_5 ) ) ;
    public final void rule__Straight__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1105:1: ( ( ( rule__Straight__LengthAssignment_5 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1106:1: ( ( rule__Straight__LengthAssignment_5 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1106:1: ( ( rule__Straight__LengthAssignment_5 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1107:1: ( rule__Straight__LengthAssignment_5 )
            {
             before(grammarAccess.getStraightAccess().getLengthAssignment_5()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1108:1: ( rule__Straight__LengthAssignment_5 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1108:2: rule__Straight__LengthAssignment_5
            {
            pushFollow(FOLLOW_rule__Straight__LengthAssignment_5_in_rule__Straight__Group__5__Impl2213);
            rule__Straight__LengthAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getStraightAccess().getLengthAssignment_5()); 

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


    // $ANTLR start "rule__Straight__Group__6"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1118:1: rule__Straight__Group__6 : rule__Straight__Group__6__Impl ;
    public final void rule__Straight__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1122:1: ( rule__Straight__Group__6__Impl )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1123:2: rule__Straight__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Straight__Group__6__Impl_in_rule__Straight__Group__62243);
            rule__Straight__Group__6__Impl();

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
    // $ANTLR end "rule__Straight__Group__6"


    // $ANTLR start "rule__Straight__Group__6__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1129:1: rule__Straight__Group__6__Impl : ( ( rule__Straight__Group_6__0 )? ) ;
    public final void rule__Straight__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1133:1: ( ( ( rule__Straight__Group_6__0 )? ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1134:1: ( ( rule__Straight__Group_6__0 )? )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1134:1: ( ( rule__Straight__Group_6__0 )? )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1135:1: ( rule__Straight__Group_6__0 )?
            {
             before(grammarAccess.getStraightAccess().getGroup_6()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1136:1: ( rule__Straight__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1136:2: rule__Straight__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Straight__Group_6__0_in_rule__Straight__Group__6__Impl2270);
                    rule__Straight__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStraightAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Straight__Group__6__Impl"


    // $ANTLR start "rule__Straight__Group_6__0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1160:1: rule__Straight__Group_6__0 : rule__Straight__Group_6__0__Impl rule__Straight__Group_6__1 ;
    public final void rule__Straight__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1164:1: ( rule__Straight__Group_6__0__Impl rule__Straight__Group_6__1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1165:2: rule__Straight__Group_6__0__Impl rule__Straight__Group_6__1
            {
            pushFollow(FOLLOW_rule__Straight__Group_6__0__Impl_in_rule__Straight__Group_6__02315);
            rule__Straight__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Straight__Group_6__1_in_rule__Straight__Group_6__02318);
            rule__Straight__Group_6__1();

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
    // $ANTLR end "rule__Straight__Group_6__0"


    // $ANTLR start "rule__Straight__Group_6__0__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1172:1: rule__Straight__Group_6__0__Impl : ( 'elevationChange =' ) ;
    public final void rule__Straight__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1176:1: ( ( 'elevationChange =' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1177:1: ( 'elevationChange =' )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1177:1: ( 'elevationChange =' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1178:1: 'elevationChange ='
            {
             before(grammarAccess.getStraightAccess().getElevationChangeKeyword_6_0()); 
            match(input,29,FOLLOW_29_in_rule__Straight__Group_6__0__Impl2346); 
             after(grammarAccess.getStraightAccess().getElevationChangeKeyword_6_0()); 

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
    // $ANTLR end "rule__Straight__Group_6__0__Impl"


    // $ANTLR start "rule__Straight__Group_6__1"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1191:1: rule__Straight__Group_6__1 : rule__Straight__Group_6__1__Impl ;
    public final void rule__Straight__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1195:1: ( rule__Straight__Group_6__1__Impl )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1196:2: rule__Straight__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Straight__Group_6__1__Impl_in_rule__Straight__Group_6__12377);
            rule__Straight__Group_6__1__Impl();

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
    // $ANTLR end "rule__Straight__Group_6__1"


    // $ANTLR start "rule__Straight__Group_6__1__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1202:1: rule__Straight__Group_6__1__Impl : ( ( rule__Straight__ElevationChangeAssignment_6_1 ) ) ;
    public final void rule__Straight__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1206:1: ( ( ( rule__Straight__ElevationChangeAssignment_6_1 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1207:1: ( ( rule__Straight__ElevationChangeAssignment_6_1 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1207:1: ( ( rule__Straight__ElevationChangeAssignment_6_1 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1208:1: ( rule__Straight__ElevationChangeAssignment_6_1 )
            {
             before(grammarAccess.getStraightAccess().getElevationChangeAssignment_6_1()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1209:1: ( rule__Straight__ElevationChangeAssignment_6_1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1209:2: rule__Straight__ElevationChangeAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Straight__ElevationChangeAssignment_6_1_in_rule__Straight__Group_6__1__Impl2404);
            rule__Straight__ElevationChangeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getStraightAccess().getElevationChangeAssignment_6_1()); 

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
    // $ANTLR end "rule__Straight__Group_6__1__Impl"


    // $ANTLR start "rule__Corner__Group__0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1223:1: rule__Corner__Group__0 : rule__Corner__Group__0__Impl rule__Corner__Group__1 ;
    public final void rule__Corner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1227:1: ( rule__Corner__Group__0__Impl rule__Corner__Group__1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1228:2: rule__Corner__Group__0__Impl rule__Corner__Group__1
            {
            pushFollow(FOLLOW_rule__Corner__Group__0__Impl_in_rule__Corner__Group__02438);
            rule__Corner__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Corner__Group__1_in_rule__Corner__Group__02441);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1235:1: rule__Corner__Group__0__Impl : ( 'Corner' ) ;
    public final void rule__Corner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1239:1: ( ( 'Corner' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1240:1: ( 'Corner' )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1240:1: ( 'Corner' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1241:1: 'Corner'
            {
             before(grammarAccess.getCornerAccess().getCornerKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Corner__Group__0__Impl2469); 
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1254:1: rule__Corner__Group__1 : rule__Corner__Group__1__Impl rule__Corner__Group__2 ;
    public final void rule__Corner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1258:1: ( rule__Corner__Group__1__Impl rule__Corner__Group__2 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1259:2: rule__Corner__Group__1__Impl rule__Corner__Group__2
            {
            pushFollow(FOLLOW_rule__Corner__Group__1__Impl_in_rule__Corner__Group__12500);
            rule__Corner__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Corner__Group__2_in_rule__Corner__Group__12503);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1266:1: rule__Corner__Group__1__Impl : ( ( rule__Corner__NameAssignment_1 ) ) ;
    public final void rule__Corner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1270:1: ( ( ( rule__Corner__NameAssignment_1 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1271:1: ( ( rule__Corner__NameAssignment_1 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1271:1: ( ( rule__Corner__NameAssignment_1 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1272:1: ( rule__Corner__NameAssignment_1 )
            {
             before(grammarAccess.getCornerAccess().getNameAssignment_1()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1273:1: ( rule__Corner__NameAssignment_1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1273:2: rule__Corner__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Corner__NameAssignment_1_in_rule__Corner__Group__1__Impl2530);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1283:1: rule__Corner__Group__2 : rule__Corner__Group__2__Impl rule__Corner__Group__3 ;
    public final void rule__Corner__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1287:1: ( rule__Corner__Group__2__Impl rule__Corner__Group__3 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1288:2: rule__Corner__Group__2__Impl rule__Corner__Group__3
            {
            pushFollow(FOLLOW_rule__Corner__Group__2__Impl_in_rule__Corner__Group__22560);
            rule__Corner__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Corner__Group__3_in_rule__Corner__Group__22563);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1295:1: rule__Corner__Group__2__Impl : ( ( rule__Corner__DirectionAssignment_2 ) ) ;
    public final void rule__Corner__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1299:1: ( ( ( rule__Corner__DirectionAssignment_2 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1300:1: ( ( rule__Corner__DirectionAssignment_2 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1300:1: ( ( rule__Corner__DirectionAssignment_2 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1301:1: ( rule__Corner__DirectionAssignment_2 )
            {
             before(grammarAccess.getCornerAccess().getDirectionAssignment_2()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1302:1: ( rule__Corner__DirectionAssignment_2 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1302:2: rule__Corner__DirectionAssignment_2
            {
            pushFollow(FOLLOW_rule__Corner__DirectionAssignment_2_in_rule__Corner__Group__2__Impl2590);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1312:1: rule__Corner__Group__3 : rule__Corner__Group__3__Impl rule__Corner__Group__4 ;
    public final void rule__Corner__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1316:1: ( rule__Corner__Group__3__Impl rule__Corner__Group__4 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1317:2: rule__Corner__Group__3__Impl rule__Corner__Group__4
            {
            pushFollow(FOLLOW_rule__Corner__Group__3__Impl_in_rule__Corner__Group__32620);
            rule__Corner__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Corner__Group__4_in_rule__Corner__Group__32623);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1324:1: rule__Corner__Group__3__Impl : ( ( rule__Corner__TypeAssignment_3 ) ) ;
    public final void rule__Corner__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1328:1: ( ( ( rule__Corner__TypeAssignment_3 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1329:1: ( ( rule__Corner__TypeAssignment_3 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1329:1: ( ( rule__Corner__TypeAssignment_3 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1330:1: ( rule__Corner__TypeAssignment_3 )
            {
             before(grammarAccess.getCornerAccess().getTypeAssignment_3()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1331:1: ( rule__Corner__TypeAssignment_3 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1331:2: rule__Corner__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Corner__TypeAssignment_3_in_rule__Corner__Group__3__Impl2650);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1341:1: rule__Corner__Group__4 : rule__Corner__Group__4__Impl ;
    public final void rule__Corner__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1345:1: ( rule__Corner__Group__4__Impl )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1346:2: rule__Corner__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Corner__Group__4__Impl_in_rule__Corner__Group__42680);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1352:1: rule__Corner__Group__4__Impl : ( ( rule__Corner__QualityAssignment_4 )? ) ;
    public final void rule__Corner__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1356:1: ( ( ( rule__Corner__QualityAssignment_4 )? ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1357:1: ( ( rule__Corner__QualityAssignment_4 )? )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1357:1: ( ( rule__Corner__QualityAssignment_4 )? )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1358:1: ( rule__Corner__QualityAssignment_4 )?
            {
             before(grammarAccess.getCornerAccess().getQualityAssignment_4()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1359:1: ( rule__Corner__QualityAssignment_4 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=11 && LA14_0<=13)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1359:2: rule__Corner__QualityAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Corner__QualityAssignment_4_in_rule__Corner__Group__4__Impl2707);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1379:1: rule__Cart__Group__0 : rule__Cart__Group__0__Impl rule__Cart__Group__1 ;
    public final void rule__Cart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1383:1: ( rule__Cart__Group__0__Impl rule__Cart__Group__1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1384:2: rule__Cart__Group__0__Impl rule__Cart__Group__1
            {
            pushFollow(FOLLOW_rule__Cart__Group__0__Impl_in_rule__Cart__Group__02748);
            rule__Cart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cart__Group__1_in_rule__Cart__Group__02751);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1391:1: rule__Cart__Group__0__Impl : ( 'Cart' ) ;
    public final void rule__Cart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1395:1: ( ( 'Cart' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1396:1: ( 'Cart' )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1396:1: ( 'Cart' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1397:1: 'Cart'
            {
             before(grammarAccess.getCartAccess().getCartKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Cart__Group__0__Impl2779); 
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1410:1: rule__Cart__Group__1 : rule__Cart__Group__1__Impl rule__Cart__Group__2 ;
    public final void rule__Cart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1414:1: ( rule__Cart__Group__1__Impl rule__Cart__Group__2 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1415:2: rule__Cart__Group__1__Impl rule__Cart__Group__2
            {
            pushFollow(FOLLOW_rule__Cart__Group__1__Impl_in_rule__Cart__Group__12810);
            rule__Cart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cart__Group__2_in_rule__Cart__Group__12813);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1422:1: rule__Cart__Group__1__Impl : ( ( rule__Cart__NameAssignment_1 ) ) ;
    public final void rule__Cart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1426:1: ( ( ( rule__Cart__NameAssignment_1 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1427:1: ( ( rule__Cart__NameAssignment_1 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1427:1: ( ( rule__Cart__NameAssignment_1 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1428:1: ( rule__Cart__NameAssignment_1 )
            {
             before(grammarAccess.getCartAccess().getNameAssignment_1()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1429:1: ( rule__Cart__NameAssignment_1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1429:2: rule__Cart__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Cart__NameAssignment_1_in_rule__Cart__Group__1__Impl2840);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1439:1: rule__Cart__Group__2 : rule__Cart__Group__2__Impl rule__Cart__Group__3 ;
    public final void rule__Cart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1443:1: ( rule__Cart__Group__2__Impl rule__Cart__Group__3 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1444:2: rule__Cart__Group__2__Impl rule__Cart__Group__3
            {
            pushFollow(FOLLOW_rule__Cart__Group__2__Impl_in_rule__Cart__Group__22870);
            rule__Cart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cart__Group__3_in_rule__Cart__Group__22873);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1451:1: rule__Cart__Group__2__Impl : ( ( rule__Cart__QualityAssignment_2 )? ) ;
    public final void rule__Cart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1455:1: ( ( ( rule__Cart__QualityAssignment_2 )? ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1456:1: ( ( rule__Cart__QualityAssignment_2 )? )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1456:1: ( ( rule__Cart__QualityAssignment_2 )? )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1457:1: ( rule__Cart__QualityAssignment_2 )?
            {
             before(grammarAccess.getCartAccess().getQualityAssignment_2()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1458:1: ( rule__Cart__QualityAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=11 && LA15_0<=13)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1458:2: rule__Cart__QualityAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Cart__QualityAssignment_2_in_rule__Cart__Group__2__Impl2900);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1468:1: rule__Cart__Group__3 : rule__Cart__Group__3__Impl rule__Cart__Group__4 ;
    public final void rule__Cart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1472:1: ( rule__Cart__Group__3__Impl rule__Cart__Group__4 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1473:2: rule__Cart__Group__3__Impl rule__Cart__Group__4
            {
            pushFollow(FOLLOW_rule__Cart__Group__3__Impl_in_rule__Cart__Group__32931);
            rule__Cart__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cart__Group__4_in_rule__Cart__Group__32934);
            rule__Cart__Group__4();

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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1480:1: rule__Cart__Group__3__Impl : ( 'seats =' ) ;
    public final void rule__Cart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1484:1: ( ( 'seats =' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1485:1: ( 'seats =' )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1485:1: ( 'seats =' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1486:1: 'seats ='
            {
             before(grammarAccess.getCartAccess().getSeatsKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__Cart__Group__3__Impl2962); 
             after(grammarAccess.getCartAccess().getSeatsKeyword_3()); 

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


    // $ANTLR start "rule__Cart__Group__4"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1499:1: rule__Cart__Group__4 : rule__Cart__Group__4__Impl ;
    public final void rule__Cart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1503:1: ( rule__Cart__Group__4__Impl )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1504:2: rule__Cart__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Cart__Group__4__Impl_in_rule__Cart__Group__42993);
            rule__Cart__Group__4__Impl();

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
    // $ANTLR end "rule__Cart__Group__4"


    // $ANTLR start "rule__Cart__Group__4__Impl"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1510:1: rule__Cart__Group__4__Impl : ( ( rule__Cart__SeatNumberAssignment_4 ) ) ;
    public final void rule__Cart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1514:1: ( ( ( rule__Cart__SeatNumberAssignment_4 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1515:1: ( ( rule__Cart__SeatNumberAssignment_4 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1515:1: ( ( rule__Cart__SeatNumberAssignment_4 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1516:1: ( rule__Cart__SeatNumberAssignment_4 )
            {
             before(grammarAccess.getCartAccess().getSeatNumberAssignment_4()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1517:1: ( rule__Cart__SeatNumberAssignment_4 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1517:2: rule__Cart__SeatNumberAssignment_4
            {
            pushFollow(FOLLOW_rule__Cart__SeatNumberAssignment_4_in_rule__Cart__Group__4__Impl3020);
            rule__Cart__SeatNumberAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCartAccess().getSeatNumberAssignment_4()); 

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
    // $ANTLR end "rule__Cart__Group__4__Impl"


    // $ANTLR start "rule__SignedInt__Group__0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1537:1: rule__SignedInt__Group__0 : rule__SignedInt__Group__0__Impl rule__SignedInt__Group__1 ;
    public final void rule__SignedInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1541:1: ( rule__SignedInt__Group__0__Impl rule__SignedInt__Group__1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1542:2: rule__SignedInt__Group__0__Impl rule__SignedInt__Group__1
            {
            pushFollow(FOLLOW_rule__SignedInt__Group__0__Impl_in_rule__SignedInt__Group__03060);
            rule__SignedInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignedInt__Group__1_in_rule__SignedInt__Group__03063);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1549:1: rule__SignedInt__Group__0__Impl : ( ( rule__SignedInt__SignAssignment_0 )? ) ;
    public final void rule__SignedInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1553:1: ( ( ( rule__SignedInt__SignAssignment_0 )? ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1554:1: ( ( rule__SignedInt__SignAssignment_0 )? )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1554:1: ( ( rule__SignedInt__SignAssignment_0 )? )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1555:1: ( rule__SignedInt__SignAssignment_0 )?
            {
             before(grammarAccess.getSignedIntAccess().getSignAssignment_0()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1556:1: ( rule__SignedInt__SignAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1556:2: rule__SignedInt__SignAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SignedInt__SignAssignment_0_in_rule__SignedInt__Group__0__Impl3090);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1566:1: rule__SignedInt__Group__1 : rule__SignedInt__Group__1__Impl ;
    public final void rule__SignedInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1570:1: ( rule__SignedInt__Group__1__Impl )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1571:2: rule__SignedInt__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SignedInt__Group__1__Impl_in_rule__SignedInt__Group__13121);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1577:1: rule__SignedInt__Group__1__Impl : ( ( rule__SignedInt__ValueAssignment_1 ) ) ;
    public final void rule__SignedInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1581:1: ( ( ( rule__SignedInt__ValueAssignment_1 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1582:1: ( ( rule__SignedInt__ValueAssignment_1 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1582:1: ( ( rule__SignedInt__ValueAssignment_1 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1583:1: ( rule__SignedInt__ValueAssignment_1 )
            {
             before(grammarAccess.getSignedIntAccess().getValueAssignment_1()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1584:1: ( rule__SignedInt__ValueAssignment_1 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1584:2: rule__SignedInt__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SignedInt__ValueAssignment_1_in_rule__SignedInt__Group__1__Impl3148);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1599:1: rule__Model__RollerCoasterAssignment : ( ruleRollerCoaster ) ;
    public final void rule__Model__RollerCoasterAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1603:1: ( ( ruleRollerCoaster ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1604:1: ( ruleRollerCoaster )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1604:1: ( ruleRollerCoaster )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1605:1: ruleRollerCoaster
            {
             before(grammarAccess.getModelAccess().getRollerCoasterRollerCoasterParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleRollerCoaster_in_rule__Model__RollerCoasterAssignment3187);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1614:1: rule__RollerCoaster__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RollerCoaster__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1618:1: ( ( RULE_ID ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1619:1: ( RULE_ID )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1619:1: ( RULE_ID )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1620:1: RULE_ID
            {
             before(grammarAccess.getRollerCoasterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RollerCoaster__NameAssignment_13218); 
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


    // $ANTLR start "rule__RollerCoaster__BaseQualityAssignment_4"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1629:1: rule__RollerCoaster__BaseQualityAssignment_4 : ( ( rule__RollerCoaster__BaseQualityAlternatives_4_0 ) ) ;
    public final void rule__RollerCoaster__BaseQualityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1633:1: ( ( ( rule__RollerCoaster__BaseQualityAlternatives_4_0 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1634:1: ( ( rule__RollerCoaster__BaseQualityAlternatives_4_0 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1634:1: ( ( rule__RollerCoaster__BaseQualityAlternatives_4_0 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1635:1: ( rule__RollerCoaster__BaseQualityAlternatives_4_0 )
            {
             before(grammarAccess.getRollerCoasterAccess().getBaseQualityAlternatives_4_0()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1636:1: ( rule__RollerCoaster__BaseQualityAlternatives_4_0 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1636:2: rule__RollerCoaster__BaseQualityAlternatives_4_0
            {
            pushFollow(FOLLOW_rule__RollerCoaster__BaseQualityAlternatives_4_0_in_rule__RollerCoaster__BaseQualityAssignment_43249);
            rule__RollerCoaster__BaseQualityAlternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getRollerCoasterAccess().getBaseQualityAlternatives_4_0()); 

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
    // $ANTLR end "rule__RollerCoaster__BaseQualityAssignment_4"


    // $ANTLR start "rule__RollerCoaster__TrackAssignment_7"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1645:1: rule__RollerCoaster__TrackAssignment_7 : ( ( rule__RollerCoaster__TrackAlternatives_7_0 ) ) ;
    public final void rule__RollerCoaster__TrackAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1649:1: ( ( ( rule__RollerCoaster__TrackAlternatives_7_0 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1650:1: ( ( rule__RollerCoaster__TrackAlternatives_7_0 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1650:1: ( ( rule__RollerCoaster__TrackAlternatives_7_0 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1651:1: ( rule__RollerCoaster__TrackAlternatives_7_0 )
            {
             before(grammarAccess.getRollerCoasterAccess().getTrackAlternatives_7_0()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1652:1: ( rule__RollerCoaster__TrackAlternatives_7_0 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1652:2: rule__RollerCoaster__TrackAlternatives_7_0
            {
            pushFollow(FOLLOW_rule__RollerCoaster__TrackAlternatives_7_0_in_rule__RollerCoaster__TrackAssignment_73282);
            rule__RollerCoaster__TrackAlternatives_7_0();

            state._fsp--;


            }

             after(grammarAccess.getRollerCoasterAccess().getTrackAlternatives_7_0()); 

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
    // $ANTLR end "rule__RollerCoaster__TrackAssignment_7"


    // $ANTLR start "rule__RollerCoaster__CartAssignment_10"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1661:1: rule__RollerCoaster__CartAssignment_10 : ( ruleCart ) ;
    public final void rule__RollerCoaster__CartAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1665:1: ( ( ruleCart ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1666:1: ( ruleCart )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1666:1: ( ruleCart )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1667:1: ruleCart
            {
             before(grammarAccess.getRollerCoasterAccess().getCartCartParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleCart_in_rule__RollerCoaster__CartAssignment_103315);
            ruleCart();

            state._fsp--;

             after(grammarAccess.getRollerCoasterAccess().getCartCartParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__RollerCoaster__CartAssignment_10"


    // $ANTLR start "rule__RollerCoaster__TrackUnitLengthAssignment_13"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1676:1: rule__RollerCoaster__TrackUnitLengthAssignment_13 : ( RULE_INT ) ;
    public final void rule__RollerCoaster__TrackUnitLengthAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1680:1: ( ( RULE_INT ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1681:1: ( RULE_INT )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1681:1: ( RULE_INT )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1682:1: RULE_INT
            {
             before(grammarAccess.getRollerCoasterAccess().getTrackUnitLengthINTTerminalRuleCall_13_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RollerCoaster__TrackUnitLengthAssignment_133346); 
             after(grammarAccess.getRollerCoasterAccess().getTrackUnitLengthINTTerminalRuleCall_13_0()); 

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
    // $ANTLR end "rule__RollerCoaster__TrackUnitLengthAssignment_13"


    // $ANTLR start "rule__Straight__NameAssignment_1"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1691:1: rule__Straight__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Straight__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1695:1: ( ( RULE_ID ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1696:1: ( RULE_ID )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1696:1: ( RULE_ID )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1697:1: RULE_ID
            {
             before(grammarAccess.getStraightAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Straight__NameAssignment_13377); 
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1706:1: rule__Straight__PoweredAssignment_2 : ( ( 'powered' ) ) ;
    public final void rule__Straight__PoweredAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1710:1: ( ( ( 'powered' ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1711:1: ( ( 'powered' ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1711:1: ( ( 'powered' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1712:1: ( 'powered' )
            {
             before(grammarAccess.getStraightAccess().getPoweredPoweredKeyword_2_0()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1713:1: ( 'powered' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1714:1: 'powered'
            {
             before(grammarAccess.getStraightAccess().getPoweredPoweredKeyword_2_0()); 
            match(input,33,FOLLOW_33_in_rule__Straight__PoweredAssignment_23413); 
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1729:1: rule__Straight__QualityAssignment_3 : ( ( rule__Straight__QualityAlternatives_3_0 ) ) ;
    public final void rule__Straight__QualityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1733:1: ( ( ( rule__Straight__QualityAlternatives_3_0 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1734:1: ( ( rule__Straight__QualityAlternatives_3_0 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1734:1: ( ( rule__Straight__QualityAlternatives_3_0 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1735:1: ( rule__Straight__QualityAlternatives_3_0 )
            {
             before(grammarAccess.getStraightAccess().getQualityAlternatives_3_0()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1736:1: ( rule__Straight__QualityAlternatives_3_0 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1736:2: rule__Straight__QualityAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Straight__QualityAlternatives_3_0_in_rule__Straight__QualityAssignment_33452);
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


    // $ANTLR start "rule__Straight__LengthAssignment_5"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1745:1: rule__Straight__LengthAssignment_5 : ( RULE_INT ) ;
    public final void rule__Straight__LengthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1749:1: ( ( RULE_INT ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1750:1: ( RULE_INT )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1750:1: ( RULE_INT )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1751:1: RULE_INT
            {
             before(grammarAccess.getStraightAccess().getLengthINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Straight__LengthAssignment_53485); 
             after(grammarAccess.getStraightAccess().getLengthINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Straight__LengthAssignment_5"


    // $ANTLR start "rule__Straight__ElevationChangeAssignment_6_1"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1760:1: rule__Straight__ElevationChangeAssignment_6_1 : ( ruleSignedInt ) ;
    public final void rule__Straight__ElevationChangeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1764:1: ( ( ruleSignedInt ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1765:1: ( ruleSignedInt )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1765:1: ( ruleSignedInt )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1766:1: ruleSignedInt
            {
             before(grammarAccess.getStraightAccess().getElevationChangeSignedIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleSignedInt_in_rule__Straight__ElevationChangeAssignment_6_13516);
            ruleSignedInt();

            state._fsp--;

             after(grammarAccess.getStraightAccess().getElevationChangeSignedIntParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Straight__ElevationChangeAssignment_6_1"


    // $ANTLR start "rule__Corner__NameAssignment_1"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1775:1: rule__Corner__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Corner__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1779:1: ( ( RULE_ID ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1780:1: ( RULE_ID )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1780:1: ( RULE_ID )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1781:1: RULE_ID
            {
             before(grammarAccess.getCornerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Corner__NameAssignment_13547); 
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1790:1: rule__Corner__DirectionAssignment_2 : ( ( rule__Corner__DirectionAlternatives_2_0 ) ) ;
    public final void rule__Corner__DirectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1794:1: ( ( ( rule__Corner__DirectionAlternatives_2_0 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1795:1: ( ( rule__Corner__DirectionAlternatives_2_0 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1795:1: ( ( rule__Corner__DirectionAlternatives_2_0 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1796:1: ( rule__Corner__DirectionAlternatives_2_0 )
            {
             before(grammarAccess.getCornerAccess().getDirectionAlternatives_2_0()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1797:1: ( rule__Corner__DirectionAlternatives_2_0 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1797:2: rule__Corner__DirectionAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__Corner__DirectionAlternatives_2_0_in_rule__Corner__DirectionAssignment_23578);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1806:1: rule__Corner__TypeAssignment_3 : ( ( rule__Corner__TypeAlternatives_3_0 ) ) ;
    public final void rule__Corner__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1810:1: ( ( ( rule__Corner__TypeAlternatives_3_0 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1811:1: ( ( rule__Corner__TypeAlternatives_3_0 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1811:1: ( ( rule__Corner__TypeAlternatives_3_0 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1812:1: ( rule__Corner__TypeAlternatives_3_0 )
            {
             before(grammarAccess.getCornerAccess().getTypeAlternatives_3_0()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1813:1: ( rule__Corner__TypeAlternatives_3_0 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1813:2: rule__Corner__TypeAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Corner__TypeAlternatives_3_0_in_rule__Corner__TypeAssignment_33611);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1822:1: rule__Corner__QualityAssignment_4 : ( ( rule__Corner__QualityAlternatives_4_0 ) ) ;
    public final void rule__Corner__QualityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1826:1: ( ( ( rule__Corner__QualityAlternatives_4_0 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1827:1: ( ( rule__Corner__QualityAlternatives_4_0 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1827:1: ( ( rule__Corner__QualityAlternatives_4_0 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1828:1: ( rule__Corner__QualityAlternatives_4_0 )
            {
             before(grammarAccess.getCornerAccess().getQualityAlternatives_4_0()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1829:1: ( rule__Corner__QualityAlternatives_4_0 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1829:2: rule__Corner__QualityAlternatives_4_0
            {
            pushFollow(FOLLOW_rule__Corner__QualityAlternatives_4_0_in_rule__Corner__QualityAssignment_43644);
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1838:1: rule__Cart__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Cart__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1842:1: ( ( RULE_ID ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1843:1: ( RULE_ID )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1843:1: ( RULE_ID )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1844:1: RULE_ID
            {
             before(grammarAccess.getCartAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Cart__NameAssignment_13677); 
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1853:1: rule__Cart__QualityAssignment_2 : ( ( rule__Cart__QualityAlternatives_2_0 ) ) ;
    public final void rule__Cart__QualityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1857:1: ( ( ( rule__Cart__QualityAlternatives_2_0 ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1858:1: ( ( rule__Cart__QualityAlternatives_2_0 ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1858:1: ( ( rule__Cart__QualityAlternatives_2_0 ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1859:1: ( rule__Cart__QualityAlternatives_2_0 )
            {
             before(grammarAccess.getCartAccess().getQualityAlternatives_2_0()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1860:1: ( rule__Cart__QualityAlternatives_2_0 )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1860:2: rule__Cart__QualityAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__Cart__QualityAlternatives_2_0_in_rule__Cart__QualityAssignment_23708);
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


    // $ANTLR start "rule__Cart__SeatNumberAssignment_4"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1869:1: rule__Cart__SeatNumberAssignment_4 : ( RULE_INT ) ;
    public final void rule__Cart__SeatNumberAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1873:1: ( ( RULE_INT ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1874:1: ( RULE_INT )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1874:1: ( RULE_INT )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1875:1: RULE_INT
            {
             before(grammarAccess.getCartAccess().getSeatNumberINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Cart__SeatNumberAssignment_43741); 
             after(grammarAccess.getCartAccess().getSeatNumberINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Cart__SeatNumberAssignment_4"


    // $ANTLR start "rule__SignedInt__SignAssignment_0"
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1884:1: rule__SignedInt__SignAssignment_0 : ( ( '-' ) ) ;
    public final void rule__SignedInt__SignAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1888:1: ( ( ( '-' ) ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1889:1: ( ( '-' ) )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1889:1: ( ( '-' ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1890:1: ( '-' )
            {
             before(grammarAccess.getSignedIntAccess().getSignHyphenMinusKeyword_0_0()); 
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1891:1: ( '-' )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1892:1: '-'
            {
             before(grammarAccess.getSignedIntAccess().getSignHyphenMinusKeyword_0_0()); 
            match(input,34,FOLLOW_34_in_rule__SignedInt__SignAssignment_03777); 
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
    // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1907:1: rule__SignedInt__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__SignedInt__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1911:1: ( ( RULE_INT ) )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1912:1: ( RULE_INT )
            {
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1912:1: ( RULE_INT )
            // ../org.xtext.rollercoaster.dsl.ui/src-gen/org/xtext/rollercoaster/dsl/ui/contentassist/antlr/internal/InternalCoaster.g:1913:1: RULE_INT
            {
             before(grammarAccess.getSignedIntAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SignedInt__ValueAssignment_13816); 
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
    public static final BitSet FOLLOW_rule__Model__RollerCoasterAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleRollerCoaster_in_entryRuleRollerCoaster122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRollerCoaster129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__0_in_ruleRollerCoaster155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStraight_in_entryRuleStraight182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStraight189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__Group__0_in_ruleStraight215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCorner_in_entryRuleCorner242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCorner249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__Group__0_in_ruleCorner275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCart_in_entryRuleCart302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCart309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cart__Group__0_in_ruleCart335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInt_in_entryRuleSignedInt362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedInt369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedInt__Group__0_in_ruleSignedInt395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__RollerCoaster__BaseQualityAlternatives_4_0432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RollerCoaster__BaseQualityAlternatives_4_0452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RollerCoaster__BaseQualityAlternatives_4_0472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStraight_in_rule__RollerCoaster__TrackAlternatives_7_0506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCorner_in_rule__RollerCoaster__TrackAlternatives_7_0523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Straight__QualityAlternatives_3_0556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Straight__QualityAlternatives_3_0576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Straight__QualityAlternatives_3_0596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Corner__DirectionAlternatives_2_0631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Corner__DirectionAlternatives_2_0651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Corner__TypeAlternatives_3_0686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Corner__TypeAlternatives_3_0706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Corner__TypeAlternatives_3_0726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Corner__TypeAlternatives_3_0746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Corner__QualityAlternatives_4_0781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Corner__QualityAlternatives_4_0801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Corner__QualityAlternatives_4_0821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Cart__QualityAlternatives_2_0856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Cart__QualityAlternatives_2_0876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Cart__QualityAlternatives_2_0896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__0__Impl_in_rule__RollerCoaster__Group__0928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__1_in_rule__RollerCoaster__Group__0931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RollerCoaster__Group__0__Impl959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__1__Impl_in_rule__RollerCoaster__Group__1990 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__2_in_rule__RollerCoaster__Group__1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__NameAssignment_1_in_rule__RollerCoaster__Group__1__Impl1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__2__Impl_in_rule__RollerCoaster__Group__21050 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__3_in_rule__RollerCoaster__Group__21053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RollerCoaster__Group__2__Impl1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__3__Impl_in_rule__RollerCoaster__Group__31112 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__4_in_rule__RollerCoaster__Group__31115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RollerCoaster__Group__3__Impl1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__4__Impl_in_rule__RollerCoaster__Group__41174 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__5_in_rule__RollerCoaster__Group__41177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__BaseQualityAssignment_4_in_rule__RollerCoaster__Group__4__Impl1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__5__Impl_in_rule__RollerCoaster__Group__51234 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__6_in_rule__RollerCoaster__Group__51237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RollerCoaster__Group__5__Impl1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__6__Impl_in_rule__RollerCoaster__Group__61296 = new BitSet(new long[]{0x0000000049000000L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__7_in_rule__RollerCoaster__Group__61299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RollerCoaster__Group__6__Impl1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__7__Impl_in_rule__RollerCoaster__Group__71358 = new BitSet(new long[]{0x0000000049000000L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__8_in_rule__RollerCoaster__Group__71361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__TrackAssignment_7_in_rule__RollerCoaster__Group__7__Impl1388 = new BitSet(new long[]{0x0000000048000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__8__Impl_in_rule__RollerCoaster__Group__81419 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__9_in_rule__RollerCoaster__Group__81422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RollerCoaster__Group__8__Impl1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__9__Impl_in_rule__RollerCoaster__Group__91481 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__10_in_rule__RollerCoaster__Group__91484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RollerCoaster__Group__9__Impl1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__10__Impl_in_rule__RollerCoaster__Group__101543 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__11_in_rule__RollerCoaster__Group__101546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__CartAssignment_10_in_rule__RollerCoaster__Group__10__Impl1573 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__11__Impl_in_rule__RollerCoaster__Group__111604 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__12_in_rule__RollerCoaster__Group__111607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RollerCoaster__Group__11__Impl1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__12__Impl_in_rule__RollerCoaster__Group__121666 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__13_in_rule__RollerCoaster__Group__121669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__RollerCoaster__Group__12__Impl1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__13__Impl_in_rule__RollerCoaster__Group__131728 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__14_in_rule__RollerCoaster__Group__131731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__TrackUnitLengthAssignment_13_in_rule__RollerCoaster__Group__13__Impl1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__Group__14__Impl_in_rule__RollerCoaster__Group__141788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RollerCoaster__Group__14__Impl1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__Group__0__Impl_in_rule__Straight__Group__01877 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Straight__Group__1_in_rule__Straight__Group__01880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Straight__Group__0__Impl1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__Group__1__Impl_in_rule__Straight__Group__11939 = new BitSet(new long[]{0x0000000210003800L});
    public static final BitSet FOLLOW_rule__Straight__Group__2_in_rule__Straight__Group__11942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__NameAssignment_1_in_rule__Straight__Group__1__Impl1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__Group__2__Impl_in_rule__Straight__Group__21999 = new BitSet(new long[]{0x0000000210003800L});
    public static final BitSet FOLLOW_rule__Straight__Group__3_in_rule__Straight__Group__22002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__PoweredAssignment_2_in_rule__Straight__Group__2__Impl2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__Group__3__Impl_in_rule__Straight__Group__32060 = new BitSet(new long[]{0x0000000210003800L});
    public static final BitSet FOLLOW_rule__Straight__Group__4_in_rule__Straight__Group__32063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__QualityAssignment_3_in_rule__Straight__Group__3__Impl2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__Group__4__Impl_in_rule__Straight__Group__42121 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Straight__Group__5_in_rule__Straight__Group__42124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Straight__Group__4__Impl2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__Group__5__Impl_in_rule__Straight__Group__52183 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Straight__Group__6_in_rule__Straight__Group__52186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__LengthAssignment_5_in_rule__Straight__Group__5__Impl2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__Group__6__Impl_in_rule__Straight__Group__62243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__Group_6__0_in_rule__Straight__Group__6__Impl2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__Group_6__0__Impl_in_rule__Straight__Group_6__02315 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_rule__Straight__Group_6__1_in_rule__Straight__Group_6__02318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Straight__Group_6__0__Impl2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__Group_6__1__Impl_in_rule__Straight__Group_6__12377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__ElevationChangeAssignment_6_1_in_rule__Straight__Group_6__1__Impl2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__Group__0__Impl_in_rule__Corner__Group__02438 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Corner__Group__1_in_rule__Corner__Group__02441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Corner__Group__0__Impl2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__Group__1__Impl_in_rule__Corner__Group__12500 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Corner__Group__2_in_rule__Corner__Group__12503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__NameAssignment_1_in_rule__Corner__Group__1__Impl2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__Group__2__Impl_in_rule__Corner__Group__22560 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_rule__Corner__Group__3_in_rule__Corner__Group__22563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__DirectionAssignment_2_in_rule__Corner__Group__2__Impl2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__Group__3__Impl_in_rule__Corner__Group__32620 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__Corner__Group__4_in_rule__Corner__Group__32623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__TypeAssignment_3_in_rule__Corner__Group__3__Impl2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__Group__4__Impl_in_rule__Corner__Group__42680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__QualityAssignment_4_in_rule__Corner__Group__4__Impl2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cart__Group__0__Impl_in_rule__Cart__Group__02748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Cart__Group__1_in_rule__Cart__Group__02751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Cart__Group__0__Impl2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cart__Group__1__Impl_in_rule__Cart__Group__12810 = new BitSet(new long[]{0x0000000100003800L});
    public static final BitSet FOLLOW_rule__Cart__Group__2_in_rule__Cart__Group__12813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cart__NameAssignment_1_in_rule__Cart__Group__1__Impl2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cart__Group__2__Impl_in_rule__Cart__Group__22870 = new BitSet(new long[]{0x0000000100003800L});
    public static final BitSet FOLLOW_rule__Cart__Group__3_in_rule__Cart__Group__22873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cart__QualityAssignment_2_in_rule__Cart__Group__2__Impl2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cart__Group__3__Impl_in_rule__Cart__Group__32931 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Cart__Group__4_in_rule__Cart__Group__32934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Cart__Group__3__Impl2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cart__Group__4__Impl_in_rule__Cart__Group__42993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cart__SeatNumberAssignment_4_in_rule__Cart__Group__4__Impl3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedInt__Group__0__Impl_in_rule__SignedInt__Group__03060 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_rule__SignedInt__Group__1_in_rule__SignedInt__Group__03063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedInt__SignAssignment_0_in_rule__SignedInt__Group__0__Impl3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedInt__Group__1__Impl_in_rule__SignedInt__Group__13121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedInt__ValueAssignment_1_in_rule__SignedInt__Group__1__Impl3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRollerCoaster_in_rule__Model__RollerCoasterAssignment3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RollerCoaster__NameAssignment_13218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__BaseQualityAlternatives_4_0_in_rule__RollerCoaster__BaseQualityAssignment_43249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RollerCoaster__TrackAlternatives_7_0_in_rule__RollerCoaster__TrackAssignment_73282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCart_in_rule__RollerCoaster__CartAssignment_103315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RollerCoaster__TrackUnitLengthAssignment_133346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Straight__NameAssignment_13377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Straight__PoweredAssignment_23413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Straight__QualityAlternatives_3_0_in_rule__Straight__QualityAssignment_33452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Straight__LengthAssignment_53485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInt_in_rule__Straight__ElevationChangeAssignment_6_13516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Corner__NameAssignment_13547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__DirectionAlternatives_2_0_in_rule__Corner__DirectionAssignment_23578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__TypeAlternatives_3_0_in_rule__Corner__TypeAssignment_33611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__QualityAlternatives_4_0_in_rule__Corner__QualityAssignment_43644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Cart__NameAssignment_13677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cart__QualityAlternatives_2_0_in_rule__Cart__QualityAssignment_23708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Cart__SeatNumberAssignment_43741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__SignedInt__SignAssignment_03777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SignedInt__ValueAssignment_13816 = new BitSet(new long[]{0x0000000000000002L});

}