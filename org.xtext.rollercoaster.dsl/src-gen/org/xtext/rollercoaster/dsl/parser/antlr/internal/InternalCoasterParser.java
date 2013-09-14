package org.xtext.rollercoaster.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.rollercoaster.dsl.services.CoasterGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCoasterParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RollerCoaster'", "';'", "'Base Quality ='", "'wood'", "'iron'", "'steel'", "'Track =('", "');'", "'Carts =('", "'DefaultTrackUnitLength ='", "'Straight'", "'powered'", "'length ='", "'elevationChange ='", "'Corner'", "'left'", "'right'", "'sharp45'", "'sharp90'", "'easy45'", "'easy90'", "'Cart'", "'seats ='", "'-'"
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
    public String getGrammarFileName() { return "../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g"; }



     	private CoasterGrammarAccess grammarAccess;
     	
        public InternalCoasterParser(TokenStream input, CoasterGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected CoasterGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:76:1: ruleModel returns [EObject current=null] : ( (lv_rollerCoaster_0_0= ruleRollerCoaster ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_rollerCoaster_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:79:28: ( ( (lv_rollerCoaster_0_0= ruleRollerCoaster ) )* )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:80:1: ( (lv_rollerCoaster_0_0= ruleRollerCoaster ) )*
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:80:1: ( (lv_rollerCoaster_0_0= ruleRollerCoaster ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:81:1: (lv_rollerCoaster_0_0= ruleRollerCoaster )
            	    {
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:81:1: (lv_rollerCoaster_0_0= ruleRollerCoaster )
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:82:3: lv_rollerCoaster_0_0= ruleRollerCoaster
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getRollerCoasterRollerCoasterParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRollerCoaster_in_ruleModel130);
            	    lv_rollerCoaster_0_0=ruleRollerCoaster();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rollerCoaster",
            	            		lv_rollerCoaster_0_0, 
            	            		"RollerCoaster");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRollerCoaster"
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:106:1: entryRuleRollerCoaster returns [EObject current=null] : iv_ruleRollerCoaster= ruleRollerCoaster EOF ;
    public final EObject entryRuleRollerCoaster() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRollerCoaster = null;


        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:107:2: (iv_ruleRollerCoaster= ruleRollerCoaster EOF )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:108:2: iv_ruleRollerCoaster= ruleRollerCoaster EOF
            {
             newCompositeNode(grammarAccess.getRollerCoasterRule()); 
            pushFollow(FOLLOW_ruleRollerCoaster_in_entryRuleRollerCoaster166);
            iv_ruleRollerCoaster=ruleRollerCoaster();

            state._fsp--;

             current =iv_ruleRollerCoaster; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRollerCoaster176); 

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
    // $ANTLR end "entryRuleRollerCoaster"


    // $ANTLR start "ruleRollerCoaster"
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:115:1: ruleRollerCoaster returns [EObject current=null] : (otherlv_0= 'RollerCoaster' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' otherlv_3= 'Base Quality =' ( ( (lv_baseQuality_4_1= 'wood' | lv_baseQuality_4_2= 'iron' | lv_baseQuality_4_3= 'steel' ) ) ) otherlv_5= ';' otherlv_6= 'Track =(' ( ( (lv_track_7_1= ruleStraight | lv_track_7_2= ruleCorner ) ) )* otherlv_8= ');' otherlv_9= 'Carts =(' ( (lv_cart_10_0= ruleCart ) )* otherlv_11= ');' otherlv_12= 'DefaultTrackUnitLength =' ( (lv_trackUnitLength_13_0= RULE_INT ) ) otherlv_14= ';' ) ;
    public final EObject ruleRollerCoaster() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_baseQuality_4_1=null;
        Token lv_baseQuality_4_2=null;
        Token lv_baseQuality_4_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_trackUnitLength_13_0=null;
        Token otherlv_14=null;
        EObject lv_track_7_1 = null;

        EObject lv_track_7_2 = null;

        EObject lv_cart_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:118:28: ( (otherlv_0= 'RollerCoaster' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' otherlv_3= 'Base Quality =' ( ( (lv_baseQuality_4_1= 'wood' | lv_baseQuality_4_2= 'iron' | lv_baseQuality_4_3= 'steel' ) ) ) otherlv_5= ';' otherlv_6= 'Track =(' ( ( (lv_track_7_1= ruleStraight | lv_track_7_2= ruleCorner ) ) )* otherlv_8= ');' otherlv_9= 'Carts =(' ( (lv_cart_10_0= ruleCart ) )* otherlv_11= ');' otherlv_12= 'DefaultTrackUnitLength =' ( (lv_trackUnitLength_13_0= RULE_INT ) ) otherlv_14= ';' ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:119:1: (otherlv_0= 'RollerCoaster' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' otherlv_3= 'Base Quality =' ( ( (lv_baseQuality_4_1= 'wood' | lv_baseQuality_4_2= 'iron' | lv_baseQuality_4_3= 'steel' ) ) ) otherlv_5= ';' otherlv_6= 'Track =(' ( ( (lv_track_7_1= ruleStraight | lv_track_7_2= ruleCorner ) ) )* otherlv_8= ');' otherlv_9= 'Carts =(' ( (lv_cart_10_0= ruleCart ) )* otherlv_11= ');' otherlv_12= 'DefaultTrackUnitLength =' ( (lv_trackUnitLength_13_0= RULE_INT ) ) otherlv_14= ';' )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:119:1: (otherlv_0= 'RollerCoaster' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' otherlv_3= 'Base Quality =' ( ( (lv_baseQuality_4_1= 'wood' | lv_baseQuality_4_2= 'iron' | lv_baseQuality_4_3= 'steel' ) ) ) otherlv_5= ';' otherlv_6= 'Track =(' ( ( (lv_track_7_1= ruleStraight | lv_track_7_2= ruleCorner ) ) )* otherlv_8= ');' otherlv_9= 'Carts =(' ( (lv_cart_10_0= ruleCart ) )* otherlv_11= ');' otherlv_12= 'DefaultTrackUnitLength =' ( (lv_trackUnitLength_13_0= RULE_INT ) ) otherlv_14= ';' )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:119:3: otherlv_0= 'RollerCoaster' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' otherlv_3= 'Base Quality =' ( ( (lv_baseQuality_4_1= 'wood' | lv_baseQuality_4_2= 'iron' | lv_baseQuality_4_3= 'steel' ) ) ) otherlv_5= ';' otherlv_6= 'Track =(' ( ( (lv_track_7_1= ruleStraight | lv_track_7_2= ruleCorner ) ) )* otherlv_8= ');' otherlv_9= 'Carts =(' ( (lv_cart_10_0= ruleCart ) )* otherlv_11= ');' otherlv_12= 'DefaultTrackUnitLength =' ( (lv_trackUnitLength_13_0= RULE_INT ) ) otherlv_14= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleRollerCoaster213); 

                	newLeafNode(otherlv_0, grammarAccess.getRollerCoasterAccess().getRollerCoasterKeyword_0());
                
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:124:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRollerCoaster230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRollerCoasterAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRollerCoasterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRollerCoaster247); 

                	newLeafNode(otherlv_2, grammarAccess.getRollerCoasterAccess().getSemicolonKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleRollerCoaster259); 

                	newLeafNode(otherlv_3, grammarAccess.getRollerCoasterAccess().getBaseQualityKeyword_3());
                
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:149:1: ( ( (lv_baseQuality_4_1= 'wood' | lv_baseQuality_4_2= 'iron' | lv_baseQuality_4_3= 'steel' ) ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:150:1: ( (lv_baseQuality_4_1= 'wood' | lv_baseQuality_4_2= 'iron' | lv_baseQuality_4_3= 'steel' ) )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:150:1: ( (lv_baseQuality_4_1= 'wood' | lv_baseQuality_4_2= 'iron' | lv_baseQuality_4_3= 'steel' ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:151:1: (lv_baseQuality_4_1= 'wood' | lv_baseQuality_4_2= 'iron' | lv_baseQuality_4_3= 'steel' )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:151:1: (lv_baseQuality_4_1= 'wood' | lv_baseQuality_4_2= 'iron' | lv_baseQuality_4_3= 'steel' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
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
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:152:3: lv_baseQuality_4_1= 'wood'
                    {
                    lv_baseQuality_4_1=(Token)match(input,14,FOLLOW_14_in_ruleRollerCoaster279); 

                            newLeafNode(lv_baseQuality_4_1, grammarAccess.getRollerCoasterAccess().getBaseQualityWoodKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRollerCoasterRule());
                    	        }
                           		setWithLastConsumed(current, "baseQuality", lv_baseQuality_4_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:164:8: lv_baseQuality_4_2= 'iron'
                    {
                    lv_baseQuality_4_2=(Token)match(input,15,FOLLOW_15_in_ruleRollerCoaster308); 

                            newLeafNode(lv_baseQuality_4_2, grammarAccess.getRollerCoasterAccess().getBaseQualityIronKeyword_4_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRollerCoasterRule());
                    	        }
                           		setWithLastConsumed(current, "baseQuality", lv_baseQuality_4_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:176:8: lv_baseQuality_4_3= 'steel'
                    {
                    lv_baseQuality_4_3=(Token)match(input,16,FOLLOW_16_in_ruleRollerCoaster337); 

                            newLeafNode(lv_baseQuality_4_3, grammarAccess.getRollerCoasterAccess().getBaseQualitySteelKeyword_4_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRollerCoasterRule());
                    	        }
                           		setWithLastConsumed(current, "baseQuality", lv_baseQuality_4_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleRollerCoaster365); 

                	newLeafNode(otherlv_5, grammarAccess.getRollerCoasterAccess().getSemicolonKeyword_5());
                
            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleRollerCoaster377); 

                	newLeafNode(otherlv_6, grammarAccess.getRollerCoasterAccess().getTrackKeyword_6());
                
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:199:1: ( ( (lv_track_7_1= ruleStraight | lv_track_7_2= ruleCorner ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21||LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:200:1: ( (lv_track_7_1= ruleStraight | lv_track_7_2= ruleCorner ) )
            	    {
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:200:1: ( (lv_track_7_1= ruleStraight | lv_track_7_2= ruleCorner ) )
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:201:1: (lv_track_7_1= ruleStraight | lv_track_7_2= ruleCorner )
            	    {
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:201:1: (lv_track_7_1= ruleStraight | lv_track_7_2= ruleCorner )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==21) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==25) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:202:3: lv_track_7_1= ruleStraight
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getRollerCoasterAccess().getTrackStraightParserRuleCall_7_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleStraight_in_ruleRollerCoaster400);
            	            lv_track_7_1=ruleStraight();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getRollerCoasterRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"track",
            	                    		lv_track_7_1, 
            	                    		"Straight");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:217:8: lv_track_7_2= ruleCorner
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getRollerCoasterAccess().getTrackCornerParserRuleCall_7_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleCorner_in_ruleRollerCoaster419);
            	            lv_track_7_2=ruleCorner();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getRollerCoasterRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"track",
            	                    		lv_track_7_2, 
            	                    		"Corner");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleRollerCoaster435); 

                	newLeafNode(otherlv_8, grammarAccess.getRollerCoasterAccess().getRightParenthesisSemicolonKeyword_8());
                
            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleRollerCoaster447); 

                	newLeafNode(otherlv_9, grammarAccess.getRollerCoasterAccess().getCartsKeyword_9());
                
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:243:1: ( (lv_cart_10_0= ruleCart ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==32) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:244:1: (lv_cart_10_0= ruleCart )
            	    {
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:244:1: (lv_cart_10_0= ruleCart )
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:245:3: lv_cart_10_0= ruleCart
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRollerCoasterAccess().getCartCartParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCart_in_ruleRollerCoaster468);
            	    lv_cart_10_0=ruleCart();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRollerCoasterRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cart",
            	            		lv_cart_10_0, 
            	            		"Cart");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleRollerCoaster481); 

                	newLeafNode(otherlv_11, grammarAccess.getRollerCoasterAccess().getRightParenthesisSemicolonKeyword_11());
                
            otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleRollerCoaster493); 

                	newLeafNode(otherlv_12, grammarAccess.getRollerCoasterAccess().getDefaultTrackUnitLengthKeyword_12());
                
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:269:1: ( (lv_trackUnitLength_13_0= RULE_INT ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:270:1: (lv_trackUnitLength_13_0= RULE_INT )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:270:1: (lv_trackUnitLength_13_0= RULE_INT )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:271:3: lv_trackUnitLength_13_0= RULE_INT
            {
            lv_trackUnitLength_13_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRollerCoaster510); 

            			newLeafNode(lv_trackUnitLength_13_0, grammarAccess.getRollerCoasterAccess().getTrackUnitLengthINTTerminalRuleCall_13_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRollerCoasterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"trackUnitLength",
                    		lv_trackUnitLength_13_0, 
                    		"INT");
            	    

            }


            }

            otherlv_14=(Token)match(input,12,FOLLOW_12_in_ruleRollerCoaster527); 

                	newLeafNode(otherlv_14, grammarAccess.getRollerCoasterAccess().getSemicolonKeyword_14());
                

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
    // $ANTLR end "ruleRollerCoaster"


    // $ANTLR start "entryRuleStraight"
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:299:1: entryRuleStraight returns [EObject current=null] : iv_ruleStraight= ruleStraight EOF ;
    public final EObject entryRuleStraight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStraight = null;


        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:300:2: (iv_ruleStraight= ruleStraight EOF )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:301:2: iv_ruleStraight= ruleStraight EOF
            {
             newCompositeNode(grammarAccess.getStraightRule()); 
            pushFollow(FOLLOW_ruleStraight_in_entryRuleStraight563);
            iv_ruleStraight=ruleStraight();

            state._fsp--;

             current =iv_ruleStraight; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStraight573); 

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
    // $ANTLR end "entryRuleStraight"


    // $ANTLR start "ruleStraight"
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:308:1: ruleStraight returns [EObject current=null] : (otherlv_0= 'Straight' ( (lv_name_1_0= RULE_ID ) ) ( (lv_powered_2_0= 'powered' ) )? ( ( (lv_quality_3_1= 'wood' | lv_quality_3_2= 'iron' | lv_quality_3_3= 'steel' ) ) )? otherlv_4= 'length =' ( (lv_length_5_0= RULE_INT ) ) (otherlv_6= 'elevationChange =' ( (lv_elevationChange_7_0= ruleSignedInt ) ) )? ) ;
    public final EObject ruleStraight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_powered_2_0=null;
        Token lv_quality_3_1=null;
        Token lv_quality_3_2=null;
        Token lv_quality_3_3=null;
        Token otherlv_4=null;
        Token lv_length_5_0=null;
        Token otherlv_6=null;
        EObject lv_elevationChange_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:311:28: ( (otherlv_0= 'Straight' ( (lv_name_1_0= RULE_ID ) ) ( (lv_powered_2_0= 'powered' ) )? ( ( (lv_quality_3_1= 'wood' | lv_quality_3_2= 'iron' | lv_quality_3_3= 'steel' ) ) )? otherlv_4= 'length =' ( (lv_length_5_0= RULE_INT ) ) (otherlv_6= 'elevationChange =' ( (lv_elevationChange_7_0= ruleSignedInt ) ) )? ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:312:1: (otherlv_0= 'Straight' ( (lv_name_1_0= RULE_ID ) ) ( (lv_powered_2_0= 'powered' ) )? ( ( (lv_quality_3_1= 'wood' | lv_quality_3_2= 'iron' | lv_quality_3_3= 'steel' ) ) )? otherlv_4= 'length =' ( (lv_length_5_0= RULE_INT ) ) (otherlv_6= 'elevationChange =' ( (lv_elevationChange_7_0= ruleSignedInt ) ) )? )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:312:1: (otherlv_0= 'Straight' ( (lv_name_1_0= RULE_ID ) ) ( (lv_powered_2_0= 'powered' ) )? ( ( (lv_quality_3_1= 'wood' | lv_quality_3_2= 'iron' | lv_quality_3_3= 'steel' ) ) )? otherlv_4= 'length =' ( (lv_length_5_0= RULE_INT ) ) (otherlv_6= 'elevationChange =' ( (lv_elevationChange_7_0= ruleSignedInt ) ) )? )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:312:3: otherlv_0= 'Straight' ( (lv_name_1_0= RULE_ID ) ) ( (lv_powered_2_0= 'powered' ) )? ( ( (lv_quality_3_1= 'wood' | lv_quality_3_2= 'iron' | lv_quality_3_3= 'steel' ) ) )? otherlv_4= 'length =' ( (lv_length_5_0= RULE_INT ) ) (otherlv_6= 'elevationChange =' ( (lv_elevationChange_7_0= ruleSignedInt ) ) )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleStraight610); 

                	newLeafNode(otherlv_0, grammarAccess.getStraightAccess().getStraightKeyword_0());
                
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:316:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:317:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:317:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:318:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStraight627); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStraightAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStraightRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:334:2: ( (lv_powered_2_0= 'powered' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:335:1: (lv_powered_2_0= 'powered' )
                    {
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:335:1: (lv_powered_2_0= 'powered' )
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:336:3: lv_powered_2_0= 'powered'
                    {
                    lv_powered_2_0=(Token)match(input,22,FOLLOW_22_in_ruleStraight650); 

                            newLeafNode(lv_powered_2_0, grammarAccess.getStraightAccess().getPoweredPoweredKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStraightRule());
                    	        }
                           		setWithLastConsumed(current, "powered", lv_powered_2_0, "powered");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:349:3: ( ( (lv_quality_3_1= 'wood' | lv_quality_3_2= 'iron' | lv_quality_3_3= 'steel' ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=14 && LA8_0<=16)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:350:1: ( (lv_quality_3_1= 'wood' | lv_quality_3_2= 'iron' | lv_quality_3_3= 'steel' ) )
                    {
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:350:1: ( (lv_quality_3_1= 'wood' | lv_quality_3_2= 'iron' | lv_quality_3_3= 'steel' ) )
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:351:1: (lv_quality_3_1= 'wood' | lv_quality_3_2= 'iron' | lv_quality_3_3= 'steel' )
                    {
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:351:1: (lv_quality_3_1= 'wood' | lv_quality_3_2= 'iron' | lv_quality_3_3= 'steel' )
                    int alt7=3;
                    switch ( input.LA(1) ) {
                    case 14:
                        {
                        alt7=1;
                        }
                        break;
                    case 15:
                        {
                        alt7=2;
                        }
                        break;
                    case 16:
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
                            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:352:3: lv_quality_3_1= 'wood'
                            {
                            lv_quality_3_1=(Token)match(input,14,FOLLOW_14_in_ruleStraight684); 

                                    newLeafNode(lv_quality_3_1, grammarAccess.getStraightAccess().getQualityWoodKeyword_3_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getStraightRule());
                            	        }
                                   		setWithLastConsumed(current, "quality", lv_quality_3_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:364:8: lv_quality_3_2= 'iron'
                            {
                            lv_quality_3_2=(Token)match(input,15,FOLLOW_15_in_ruleStraight713); 

                                    newLeafNode(lv_quality_3_2, grammarAccess.getStraightAccess().getQualityIronKeyword_3_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getStraightRule());
                            	        }
                                   		setWithLastConsumed(current, "quality", lv_quality_3_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:376:8: lv_quality_3_3= 'steel'
                            {
                            lv_quality_3_3=(Token)match(input,16,FOLLOW_16_in_ruleStraight742); 

                                    newLeafNode(lv_quality_3_3, grammarAccess.getStraightAccess().getQualitySteelKeyword_3_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getStraightRule());
                            	        }
                                   		setWithLastConsumed(current, "quality", lv_quality_3_3, null);
                            	    

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleStraight771); 

                	newLeafNode(otherlv_4, grammarAccess.getStraightAccess().getLengthKeyword_4());
                
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:395:1: ( (lv_length_5_0= RULE_INT ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:396:1: (lv_length_5_0= RULE_INT )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:396:1: (lv_length_5_0= RULE_INT )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:397:3: lv_length_5_0= RULE_INT
            {
            lv_length_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStraight788); 

            			newLeafNode(lv_length_5_0, grammarAccess.getStraightAccess().getLengthINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStraightRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"length",
                    		lv_length_5_0, 
                    		"INT");
            	    

            }


            }

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:413:2: (otherlv_6= 'elevationChange =' ( (lv_elevationChange_7_0= ruleSignedInt ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:413:4: otherlv_6= 'elevationChange =' ( (lv_elevationChange_7_0= ruleSignedInt ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleStraight806); 

                        	newLeafNode(otherlv_6, grammarAccess.getStraightAccess().getElevationChangeKeyword_6_0());
                        
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:417:1: ( (lv_elevationChange_7_0= ruleSignedInt ) )
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:418:1: (lv_elevationChange_7_0= ruleSignedInt )
                    {
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:418:1: (lv_elevationChange_7_0= ruleSignedInt )
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:419:3: lv_elevationChange_7_0= ruleSignedInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getStraightAccess().getElevationChangeSignedIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSignedInt_in_ruleStraight827);
                    lv_elevationChange_7_0=ruleSignedInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStraightRule());
                    	        }
                           		set(
                           			current, 
                           			"elevationChange",
                            		lv_elevationChange_7_0, 
                            		"SignedInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleStraight"


    // $ANTLR start "entryRuleCorner"
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:443:1: entryRuleCorner returns [EObject current=null] : iv_ruleCorner= ruleCorner EOF ;
    public final EObject entryRuleCorner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCorner = null;


        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:444:2: (iv_ruleCorner= ruleCorner EOF )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:445:2: iv_ruleCorner= ruleCorner EOF
            {
             newCompositeNode(grammarAccess.getCornerRule()); 
            pushFollow(FOLLOW_ruleCorner_in_entryRuleCorner865);
            iv_ruleCorner=ruleCorner();

            state._fsp--;

             current =iv_ruleCorner; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCorner875); 

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
    // $ANTLR end "entryRuleCorner"


    // $ANTLR start "ruleCorner"
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:452:1: ruleCorner returns [EObject current=null] : (otherlv_0= 'Corner' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' ) ) ) ( ( (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' ) ) ) ( ( (lv_quality_4_1= 'wood' | lv_quality_4_2= 'iron' | lv_quality_4_3= 'steel' ) ) )? ) ;
    public final EObject ruleCorner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_direction_2_1=null;
        Token lv_direction_2_2=null;
        Token lv_type_3_1=null;
        Token lv_type_3_2=null;
        Token lv_type_3_3=null;
        Token lv_type_3_4=null;
        Token lv_quality_4_1=null;
        Token lv_quality_4_2=null;
        Token lv_quality_4_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:455:28: ( (otherlv_0= 'Corner' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' ) ) ) ( ( (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' ) ) ) ( ( (lv_quality_4_1= 'wood' | lv_quality_4_2= 'iron' | lv_quality_4_3= 'steel' ) ) )? ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:456:1: (otherlv_0= 'Corner' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' ) ) ) ( ( (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' ) ) ) ( ( (lv_quality_4_1= 'wood' | lv_quality_4_2= 'iron' | lv_quality_4_3= 'steel' ) ) )? )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:456:1: (otherlv_0= 'Corner' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' ) ) ) ( ( (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' ) ) ) ( ( (lv_quality_4_1= 'wood' | lv_quality_4_2= 'iron' | lv_quality_4_3= 'steel' ) ) )? )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:456:3: otherlv_0= 'Corner' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' ) ) ) ( ( (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' ) ) ) ( ( (lv_quality_4_1= 'wood' | lv_quality_4_2= 'iron' | lv_quality_4_3= 'steel' ) ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleCorner912); 

                	newLeafNode(otherlv_0, grammarAccess.getCornerAccess().getCornerKeyword_0());
                
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:460:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:461:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:461:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:462:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCorner929); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCornerAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCornerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:478:2: ( ( (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' ) ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:479:1: ( (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' ) )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:479:1: ( (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:480:1: (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:480:1: (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            else if ( (LA10_0==27) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:481:3: lv_direction_2_1= 'left'
                    {
                    lv_direction_2_1=(Token)match(input,26,FOLLOW_26_in_ruleCorner954); 

                            newLeafNode(lv_direction_2_1, grammarAccess.getCornerAccess().getDirectionLeftKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCornerRule());
                    	        }
                           		setWithLastConsumed(current, "direction", lv_direction_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:493:8: lv_direction_2_2= 'right'
                    {
                    lv_direction_2_2=(Token)match(input,27,FOLLOW_27_in_ruleCorner983); 

                            newLeafNode(lv_direction_2_2, grammarAccess.getCornerAccess().getDirectionRightKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCornerRule());
                    	        }
                           		setWithLastConsumed(current, "direction", lv_direction_2_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:508:2: ( ( (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' ) ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:509:1: ( (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' ) )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:509:1: ( (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:510:1: (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:510:1: (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt11=1;
                }
                break;
            case 29:
                {
                alt11=2;
                }
                break;
            case 30:
                {
                alt11=3;
                }
                break;
            case 31:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:511:3: lv_type_3_1= 'sharp45'
                    {
                    lv_type_3_1=(Token)match(input,28,FOLLOW_28_in_ruleCorner1019); 

                            newLeafNode(lv_type_3_1, grammarAccess.getCornerAccess().getTypeSharp45Keyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCornerRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:523:8: lv_type_3_2= 'sharp90'
                    {
                    lv_type_3_2=(Token)match(input,29,FOLLOW_29_in_ruleCorner1048); 

                            newLeafNode(lv_type_3_2, grammarAccess.getCornerAccess().getTypeSharp90Keyword_3_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCornerRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:535:8: lv_type_3_3= 'easy45'
                    {
                    lv_type_3_3=(Token)match(input,30,FOLLOW_30_in_ruleCorner1077); 

                            newLeafNode(lv_type_3_3, grammarAccess.getCornerAccess().getTypeEasy45Keyword_3_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCornerRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:547:8: lv_type_3_4= 'easy90'
                    {
                    lv_type_3_4=(Token)match(input,31,FOLLOW_31_in_ruleCorner1106); 

                            newLeafNode(lv_type_3_4, grammarAccess.getCornerAccess().getTypeEasy90Keyword_3_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCornerRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_4, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:562:2: ( ( (lv_quality_4_1= 'wood' | lv_quality_4_2= 'iron' | lv_quality_4_3= 'steel' ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=14 && LA13_0<=16)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:563:1: ( (lv_quality_4_1= 'wood' | lv_quality_4_2= 'iron' | lv_quality_4_3= 'steel' ) )
                    {
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:563:1: ( (lv_quality_4_1= 'wood' | lv_quality_4_2= 'iron' | lv_quality_4_3= 'steel' ) )
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:564:1: (lv_quality_4_1= 'wood' | lv_quality_4_2= 'iron' | lv_quality_4_3= 'steel' )
                    {
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:564:1: (lv_quality_4_1= 'wood' | lv_quality_4_2= 'iron' | lv_quality_4_3= 'steel' )
                    int alt12=3;
                    switch ( input.LA(1) ) {
                    case 14:
                        {
                        alt12=1;
                        }
                        break;
                    case 15:
                        {
                        alt12=2;
                        }
                        break;
                    case 16:
                        {
                        alt12=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }

                    switch (alt12) {
                        case 1 :
                            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:565:3: lv_quality_4_1= 'wood'
                            {
                            lv_quality_4_1=(Token)match(input,14,FOLLOW_14_in_ruleCorner1142); 

                                    newLeafNode(lv_quality_4_1, grammarAccess.getCornerAccess().getQualityWoodKeyword_4_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCornerRule());
                            	        }
                                   		setWithLastConsumed(current, "quality", lv_quality_4_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:577:8: lv_quality_4_2= 'iron'
                            {
                            lv_quality_4_2=(Token)match(input,15,FOLLOW_15_in_ruleCorner1171); 

                                    newLeafNode(lv_quality_4_2, grammarAccess.getCornerAccess().getQualityIronKeyword_4_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCornerRule());
                            	        }
                                   		setWithLastConsumed(current, "quality", lv_quality_4_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:589:8: lv_quality_4_3= 'steel'
                            {
                            lv_quality_4_3=(Token)match(input,16,FOLLOW_16_in_ruleCorner1200); 

                                    newLeafNode(lv_quality_4_3, grammarAccess.getCornerAccess().getQualitySteelKeyword_4_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCornerRule());
                            	        }
                                   		setWithLastConsumed(current, "quality", lv_quality_4_3, null);
                            	    

                            }
                            break;

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleCorner"


    // $ANTLR start "entryRuleCart"
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:612:1: entryRuleCart returns [EObject current=null] : iv_ruleCart= ruleCart EOF ;
    public final EObject entryRuleCart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCart = null;


        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:613:2: (iv_ruleCart= ruleCart EOF )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:614:2: iv_ruleCart= ruleCart EOF
            {
             newCompositeNode(grammarAccess.getCartRule()); 
            pushFollow(FOLLOW_ruleCart_in_entryRuleCart1253);
            iv_ruleCart=ruleCart();

            state._fsp--;

             current =iv_ruleCart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCart1263); 

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
    // $ANTLR end "entryRuleCart"


    // $ANTLR start "ruleCart"
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:621:1: ruleCart returns [EObject current=null] : (otherlv_0= 'Cart' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_quality_2_1= 'wood' | lv_quality_2_2= 'iron' | lv_quality_2_3= 'steel' ) ) )? otherlv_3= 'seats =' ( (lv_seatNumber_4_0= RULE_INT ) ) ) ;
    public final EObject ruleCart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_quality_2_1=null;
        Token lv_quality_2_2=null;
        Token lv_quality_2_3=null;
        Token otherlv_3=null;
        Token lv_seatNumber_4_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:624:28: ( (otherlv_0= 'Cart' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_quality_2_1= 'wood' | lv_quality_2_2= 'iron' | lv_quality_2_3= 'steel' ) ) )? otherlv_3= 'seats =' ( (lv_seatNumber_4_0= RULE_INT ) ) ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:625:1: (otherlv_0= 'Cart' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_quality_2_1= 'wood' | lv_quality_2_2= 'iron' | lv_quality_2_3= 'steel' ) ) )? otherlv_3= 'seats =' ( (lv_seatNumber_4_0= RULE_INT ) ) )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:625:1: (otherlv_0= 'Cart' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_quality_2_1= 'wood' | lv_quality_2_2= 'iron' | lv_quality_2_3= 'steel' ) ) )? otherlv_3= 'seats =' ( (lv_seatNumber_4_0= RULE_INT ) ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:625:3: otherlv_0= 'Cart' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_quality_2_1= 'wood' | lv_quality_2_2= 'iron' | lv_quality_2_3= 'steel' ) ) )? otherlv_3= 'seats =' ( (lv_seatNumber_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleCart1300); 

                	newLeafNode(otherlv_0, grammarAccess.getCartAccess().getCartKeyword_0());
                
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:629:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:630:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:630:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:631:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCart1317); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCartAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:647:2: ( ( (lv_quality_2_1= 'wood' | lv_quality_2_2= 'iron' | lv_quality_2_3= 'steel' ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=14 && LA15_0<=16)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:648:1: ( (lv_quality_2_1= 'wood' | lv_quality_2_2= 'iron' | lv_quality_2_3= 'steel' ) )
                    {
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:648:1: ( (lv_quality_2_1= 'wood' | lv_quality_2_2= 'iron' | lv_quality_2_3= 'steel' ) )
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:649:1: (lv_quality_2_1= 'wood' | lv_quality_2_2= 'iron' | lv_quality_2_3= 'steel' )
                    {
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:649:1: (lv_quality_2_1= 'wood' | lv_quality_2_2= 'iron' | lv_quality_2_3= 'steel' )
                    int alt14=3;
                    switch ( input.LA(1) ) {
                    case 14:
                        {
                        alt14=1;
                        }
                        break;
                    case 15:
                        {
                        alt14=2;
                        }
                        break;
                    case 16:
                        {
                        alt14=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }

                    switch (alt14) {
                        case 1 :
                            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:650:3: lv_quality_2_1= 'wood'
                            {
                            lv_quality_2_1=(Token)match(input,14,FOLLOW_14_in_ruleCart1342); 

                                    newLeafNode(lv_quality_2_1, grammarAccess.getCartAccess().getQualityWoodKeyword_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCartRule());
                            	        }
                                   		setWithLastConsumed(current, "quality", lv_quality_2_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:662:8: lv_quality_2_2= 'iron'
                            {
                            lv_quality_2_2=(Token)match(input,15,FOLLOW_15_in_ruleCart1371); 

                                    newLeafNode(lv_quality_2_2, grammarAccess.getCartAccess().getQualityIronKeyword_2_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCartRule());
                            	        }
                                   		setWithLastConsumed(current, "quality", lv_quality_2_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:674:8: lv_quality_2_3= 'steel'
                            {
                            lv_quality_2_3=(Token)match(input,16,FOLLOW_16_in_ruleCart1400); 

                                    newLeafNode(lv_quality_2_3, grammarAccess.getCartAccess().getQualitySteelKeyword_2_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCartRule());
                            	        }
                                   		setWithLastConsumed(current, "quality", lv_quality_2_3, null);
                            	    

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleCart1429); 

                	newLeafNode(otherlv_3, grammarAccess.getCartAccess().getSeatsKeyword_3());
                
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:693:1: ( (lv_seatNumber_4_0= RULE_INT ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:694:1: (lv_seatNumber_4_0= RULE_INT )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:694:1: (lv_seatNumber_4_0= RULE_INT )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:695:3: lv_seatNumber_4_0= RULE_INT
            {
            lv_seatNumber_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCart1446); 

            			newLeafNode(lv_seatNumber_4_0, grammarAccess.getCartAccess().getSeatNumberINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"seatNumber",
                    		lv_seatNumber_4_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleCart"


    // $ANTLR start "entryRuleSignedInt"
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:719:1: entryRuleSignedInt returns [EObject current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final EObject entryRuleSignedInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedInt = null;


        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:720:2: (iv_ruleSignedInt= ruleSignedInt EOF )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:721:2: iv_ruleSignedInt= ruleSignedInt EOF
            {
             newCompositeNode(grammarAccess.getSignedIntRule()); 
            pushFollow(FOLLOW_ruleSignedInt_in_entryRuleSignedInt1487);
            iv_ruleSignedInt=ruleSignedInt();

            state._fsp--;

             current =iv_ruleSignedInt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedInt1497); 

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
    // $ANTLR end "entryRuleSignedInt"


    // $ANTLR start "ruleSignedInt"
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:728:1: ruleSignedInt returns [EObject current=null] : ( ( (lv_sign_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleSignedInt() throws RecognitionException {
        EObject current = null;

        Token lv_sign_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:731:28: ( ( ( (lv_sign_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:732:1: ( ( (lv_sign_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:732:1: ( ( (lv_sign_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:732:2: ( (lv_sign_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:732:2: ( (lv_sign_0_0= '-' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:733:1: (lv_sign_0_0= '-' )
                    {
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:733:1: (lv_sign_0_0= '-' )
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:734:3: lv_sign_0_0= '-'
                    {
                    lv_sign_0_0=(Token)match(input,34,FOLLOW_34_in_ruleSignedInt1540); 

                            newLeafNode(lv_sign_0_0, grammarAccess.getSignedIntAccess().getSignHyphenMinusKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSignedIntRule());
                    	        }
                           		setWithLastConsumed(current, "sign", lv_sign_0_0, "-");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:747:3: ( (lv_value_1_0= RULE_INT ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:748:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:748:1: (lv_value_1_0= RULE_INT )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:749:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignedInt1571); 

            			newLeafNode(lv_value_1_0, grammarAccess.getSignedIntAccess().getValueINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSignedIntRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleSignedInt"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRollerCoaster_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleRollerCoaster_in_entryRuleRollerCoaster166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRollerCoaster176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleRollerCoaster213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRollerCoaster230 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRollerCoaster247 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRollerCoaster259 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_14_in_ruleRollerCoaster279 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_15_in_ruleRollerCoaster308 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_16_in_ruleRollerCoaster337 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRollerCoaster365 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRollerCoaster377 = new BitSet(new long[]{0x0000000002240000L});
    public static final BitSet FOLLOW_ruleStraight_in_ruleRollerCoaster400 = new BitSet(new long[]{0x0000000002240000L});
    public static final BitSet FOLLOW_ruleCorner_in_ruleRollerCoaster419 = new BitSet(new long[]{0x0000000002240000L});
    public static final BitSet FOLLOW_18_in_ruleRollerCoaster435 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRollerCoaster447 = new BitSet(new long[]{0x0000000100040000L});
    public static final BitSet FOLLOW_ruleCart_in_ruleRollerCoaster468 = new BitSet(new long[]{0x0000000100040000L});
    public static final BitSet FOLLOW_18_in_ruleRollerCoaster481 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRollerCoaster493 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRollerCoaster510 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRollerCoaster527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStraight_in_entryRuleStraight563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStraight573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleStraight610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStraight627 = new BitSet(new long[]{0x0000000000C1C000L});
    public static final BitSet FOLLOW_22_in_ruleStraight650 = new BitSet(new long[]{0x000000000081C000L});
    public static final BitSet FOLLOW_14_in_ruleStraight684 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15_in_ruleStraight713 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16_in_ruleStraight742 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleStraight771 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStraight788 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleStraight806 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_ruleSignedInt_in_ruleStraight827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCorner_in_entryRuleCorner865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCorner875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCorner912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCorner929 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleCorner954 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_27_in_ruleCorner983 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_28_in_ruleCorner1019 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_29_in_ruleCorner1048 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_30_in_ruleCorner1077 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_31_in_ruleCorner1106 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_14_in_ruleCorner1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleCorner1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleCorner1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCart_in_entryRuleCart1253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCart1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCart1300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCart1317 = new BitSet(new long[]{0x000000020001C000L});
    public static final BitSet FOLLOW_14_in_ruleCart1342 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15_in_ruleCart1371 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_16_in_ruleCart1400 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleCart1429 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCart1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInt_in_entryRuleSignedInt1487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedInt1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleSignedInt1540 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignedInt1571 = new BitSet(new long[]{0x0000000000000002L});

}