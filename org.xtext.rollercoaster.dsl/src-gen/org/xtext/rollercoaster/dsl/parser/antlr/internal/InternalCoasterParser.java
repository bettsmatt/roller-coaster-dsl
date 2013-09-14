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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RollerCoaster'", "'wood'", "'iron'", "'steel'", "'Straight'", "'powered'", "'Corner'", "'left'", "'right'", "'sharp45'", "'sharp90'", "'easy45'", "'easy90'", "'Cart'", "'-'"
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
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:76:1: ruleModel returns [EObject current=null] : ( (lv_rollerCoaster_0_0= ruleRollerCoaster ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_rollerCoaster_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:79:28: ( ( (lv_rollerCoaster_0_0= ruleRollerCoaster ) ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:80:1: ( (lv_rollerCoaster_0_0= ruleRollerCoaster ) )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:80:1: ( (lv_rollerCoaster_0_0= ruleRollerCoaster ) )
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
            pushFollow(FOLLOW_ruleRollerCoaster_in_entryRuleRollerCoaster165);
            iv_ruleRollerCoaster=ruleRollerCoaster();

            state._fsp--;

             current =iv_ruleRollerCoaster; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRollerCoaster175); 

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
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:115:1: ruleRollerCoaster returns [EObject current=null] : (otherlv_0= 'RollerCoaster' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_baseQuality_2_1= 'wood' | lv_baseQuality_2_2= 'iron' | lv_baseQuality_2_3= 'steel' ) ) ) ( ( (lv_track_3_1= ruleStraight | lv_track_3_2= ruleCorner ) ) )* ( (lv_cart_4_0= ruleCart ) )* ( (lv_trackUnitLength_5_0= RULE_INT ) ) ) ;
    public final EObject ruleRollerCoaster() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_baseQuality_2_1=null;
        Token lv_baseQuality_2_2=null;
        Token lv_baseQuality_2_3=null;
        Token lv_trackUnitLength_5_0=null;
        EObject lv_track_3_1 = null;

        EObject lv_track_3_2 = null;

        EObject lv_cart_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:118:28: ( (otherlv_0= 'RollerCoaster' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_baseQuality_2_1= 'wood' | lv_baseQuality_2_2= 'iron' | lv_baseQuality_2_3= 'steel' ) ) ) ( ( (lv_track_3_1= ruleStraight | lv_track_3_2= ruleCorner ) ) )* ( (lv_cart_4_0= ruleCart ) )* ( (lv_trackUnitLength_5_0= RULE_INT ) ) ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:119:1: (otherlv_0= 'RollerCoaster' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_baseQuality_2_1= 'wood' | lv_baseQuality_2_2= 'iron' | lv_baseQuality_2_3= 'steel' ) ) ) ( ( (lv_track_3_1= ruleStraight | lv_track_3_2= ruleCorner ) ) )* ( (lv_cart_4_0= ruleCart ) )* ( (lv_trackUnitLength_5_0= RULE_INT ) ) )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:119:1: (otherlv_0= 'RollerCoaster' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_baseQuality_2_1= 'wood' | lv_baseQuality_2_2= 'iron' | lv_baseQuality_2_3= 'steel' ) ) ) ( ( (lv_track_3_1= ruleStraight | lv_track_3_2= ruleCorner ) ) )* ( (lv_cart_4_0= ruleCart ) )* ( (lv_trackUnitLength_5_0= RULE_INT ) ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:119:3: otherlv_0= 'RollerCoaster' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_baseQuality_2_1= 'wood' | lv_baseQuality_2_2= 'iron' | lv_baseQuality_2_3= 'steel' ) ) ) ( ( (lv_track_3_1= ruleStraight | lv_track_3_2= ruleCorner ) ) )* ( (lv_cart_4_0= ruleCart ) )* ( (lv_trackUnitLength_5_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleRollerCoaster212); 

                	newLeafNode(otherlv_0, grammarAccess.getRollerCoasterAccess().getRollerCoasterKeyword_0());
                
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:124:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRollerCoaster229); 

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

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:141:2: ( ( (lv_baseQuality_2_1= 'wood' | lv_baseQuality_2_2= 'iron' | lv_baseQuality_2_3= 'steel' ) ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:142:1: ( (lv_baseQuality_2_1= 'wood' | lv_baseQuality_2_2= 'iron' | lv_baseQuality_2_3= 'steel' ) )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:142:1: ( (lv_baseQuality_2_1= 'wood' | lv_baseQuality_2_2= 'iron' | lv_baseQuality_2_3= 'steel' ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:143:1: (lv_baseQuality_2_1= 'wood' | lv_baseQuality_2_2= 'iron' | lv_baseQuality_2_3= 'steel' )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:143:1: (lv_baseQuality_2_1= 'wood' | lv_baseQuality_2_2= 'iron' | lv_baseQuality_2_3= 'steel' )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            case 14:
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
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:144:3: lv_baseQuality_2_1= 'wood'
                    {
                    lv_baseQuality_2_1=(Token)match(input,12,FOLLOW_12_in_ruleRollerCoaster254); 

                            newLeafNode(lv_baseQuality_2_1, grammarAccess.getRollerCoasterAccess().getBaseQualityWoodKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRollerCoasterRule());
                    	        }
                           		setWithLastConsumed(current, "baseQuality", lv_baseQuality_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:156:8: lv_baseQuality_2_2= 'iron'
                    {
                    lv_baseQuality_2_2=(Token)match(input,13,FOLLOW_13_in_ruleRollerCoaster283); 

                            newLeafNode(lv_baseQuality_2_2, grammarAccess.getRollerCoasterAccess().getBaseQualityIronKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRollerCoasterRule());
                    	        }
                           		setWithLastConsumed(current, "baseQuality", lv_baseQuality_2_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:168:8: lv_baseQuality_2_3= 'steel'
                    {
                    lv_baseQuality_2_3=(Token)match(input,14,FOLLOW_14_in_ruleRollerCoaster312); 

                            newLeafNode(lv_baseQuality_2_3, grammarAccess.getRollerCoasterAccess().getBaseQualitySteelKeyword_2_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRollerCoasterRule());
                    	        }
                           		setWithLastConsumed(current, "baseQuality", lv_baseQuality_2_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:183:2: ( ( (lv_track_3_1= ruleStraight | lv_track_3_2= ruleCorner ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15||LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:184:1: ( (lv_track_3_1= ruleStraight | lv_track_3_2= ruleCorner ) )
            	    {
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:184:1: ( (lv_track_3_1= ruleStraight | lv_track_3_2= ruleCorner ) )
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:185:1: (lv_track_3_1= ruleStraight | lv_track_3_2= ruleCorner )
            	    {
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:185:1: (lv_track_3_1= ruleStraight | lv_track_3_2= ruleCorner )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==15) ) {
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
            	            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:186:3: lv_track_3_1= ruleStraight
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getRollerCoasterAccess().getTrackStraightParserRuleCall_3_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleStraight_in_ruleRollerCoaster351);
            	            lv_track_3_1=ruleStraight();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getRollerCoasterRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"track",
            	                    		lv_track_3_1, 
            	                    		"Straight");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:201:8: lv_track_3_2= ruleCorner
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getRollerCoasterAccess().getTrackCornerParserRuleCall_3_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleCorner_in_ruleRollerCoaster370);
            	            lv_track_3_2=ruleCorner();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getRollerCoasterRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"track",
            	                    		lv_track_3_2, 
            	                    		"Corner");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:219:3: ( (lv_cart_4_0= ruleCart ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:220:1: (lv_cart_4_0= ruleCart )
            	    {
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:220:1: (lv_cart_4_0= ruleCart )
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:221:3: lv_cart_4_0= ruleCart
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRollerCoasterAccess().getCartCartParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCart_in_ruleRollerCoaster395);
            	    lv_cart_4_0=ruleCart();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRollerCoasterRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cart",
            	            		lv_cart_4_0, 
            	            		"Cart");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:237:3: ( (lv_trackUnitLength_5_0= RULE_INT ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:238:1: (lv_trackUnitLength_5_0= RULE_INT )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:238:1: (lv_trackUnitLength_5_0= RULE_INT )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:239:3: lv_trackUnitLength_5_0= RULE_INT
            {
            lv_trackUnitLength_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRollerCoaster413); 

            			newLeafNode(lv_trackUnitLength_5_0, grammarAccess.getRollerCoasterAccess().getTrackUnitLengthINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRollerCoasterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"trackUnitLength",
                    		lv_trackUnitLength_5_0, 
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
    // $ANTLR end "ruleRollerCoaster"


    // $ANTLR start "entryRuleStraight"
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:263:1: entryRuleStraight returns [EObject current=null] : iv_ruleStraight= ruleStraight EOF ;
    public final EObject entryRuleStraight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStraight = null;


        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:264:2: (iv_ruleStraight= ruleStraight EOF )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:265:2: iv_ruleStraight= ruleStraight EOF
            {
             newCompositeNode(grammarAccess.getStraightRule()); 
            pushFollow(FOLLOW_ruleStraight_in_entryRuleStraight454);
            iv_ruleStraight=ruleStraight();

            state._fsp--;

             current =iv_ruleStraight; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStraight464); 

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
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:272:1: ruleStraight returns [EObject current=null] : (otherlv_0= 'Straight' ( (lv_name_1_0= RULE_ID ) ) ( (lv_powered_2_0= 'powered' ) )? ( ( (lv_quality_3_1= 'wood' | lv_quality_3_2= 'iron' | lv_quality_3_3= 'steel' ) ) )? ( (lv_length_4_0= RULE_INT ) ) ( (lv_elevationChange_5_0= ruleSignedInt ) )? ) ;
    public final EObject ruleStraight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_powered_2_0=null;
        Token lv_quality_3_1=null;
        Token lv_quality_3_2=null;
        Token lv_quality_3_3=null;
        Token lv_length_4_0=null;
        EObject lv_elevationChange_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:275:28: ( (otherlv_0= 'Straight' ( (lv_name_1_0= RULE_ID ) ) ( (lv_powered_2_0= 'powered' ) )? ( ( (lv_quality_3_1= 'wood' | lv_quality_3_2= 'iron' | lv_quality_3_3= 'steel' ) ) )? ( (lv_length_4_0= RULE_INT ) ) ( (lv_elevationChange_5_0= ruleSignedInt ) )? ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:276:1: (otherlv_0= 'Straight' ( (lv_name_1_0= RULE_ID ) ) ( (lv_powered_2_0= 'powered' ) )? ( ( (lv_quality_3_1= 'wood' | lv_quality_3_2= 'iron' | lv_quality_3_3= 'steel' ) ) )? ( (lv_length_4_0= RULE_INT ) ) ( (lv_elevationChange_5_0= ruleSignedInt ) )? )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:276:1: (otherlv_0= 'Straight' ( (lv_name_1_0= RULE_ID ) ) ( (lv_powered_2_0= 'powered' ) )? ( ( (lv_quality_3_1= 'wood' | lv_quality_3_2= 'iron' | lv_quality_3_3= 'steel' ) ) )? ( (lv_length_4_0= RULE_INT ) ) ( (lv_elevationChange_5_0= ruleSignedInt ) )? )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:276:3: otherlv_0= 'Straight' ( (lv_name_1_0= RULE_ID ) ) ( (lv_powered_2_0= 'powered' ) )? ( ( (lv_quality_3_1= 'wood' | lv_quality_3_2= 'iron' | lv_quality_3_3= 'steel' ) ) )? ( (lv_length_4_0= RULE_INT ) ) ( (lv_elevationChange_5_0= ruleSignedInt ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleStraight501); 

                	newLeafNode(otherlv_0, grammarAccess.getStraightAccess().getStraightKeyword_0());
                
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:280:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:281:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:281:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:282:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStraight518); 

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

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:298:2: ( (lv_powered_2_0= 'powered' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:299:1: (lv_powered_2_0= 'powered' )
                    {
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:299:1: (lv_powered_2_0= 'powered' )
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:300:3: lv_powered_2_0= 'powered'
                    {
                    lv_powered_2_0=(Token)match(input,16,FOLLOW_16_in_ruleStraight541); 

                            newLeafNode(lv_powered_2_0, grammarAccess.getStraightAccess().getPoweredPoweredKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStraightRule());
                    	        }
                           		setWithLastConsumed(current, "powered", lv_powered_2_0, "powered");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:313:3: ( ( (lv_quality_3_1= 'wood' | lv_quality_3_2= 'iron' | lv_quality_3_3= 'steel' ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=12 && LA7_0<=14)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:314:1: ( (lv_quality_3_1= 'wood' | lv_quality_3_2= 'iron' | lv_quality_3_3= 'steel' ) )
                    {
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:314:1: ( (lv_quality_3_1= 'wood' | lv_quality_3_2= 'iron' | lv_quality_3_3= 'steel' ) )
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:315:1: (lv_quality_3_1= 'wood' | lv_quality_3_2= 'iron' | lv_quality_3_3= 'steel' )
                    {
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:315:1: (lv_quality_3_1= 'wood' | lv_quality_3_2= 'iron' | lv_quality_3_3= 'steel' )
                    int alt6=3;
                    switch ( input.LA(1) ) {
                    case 12:
                        {
                        alt6=1;
                        }
                        break;
                    case 13:
                        {
                        alt6=2;
                        }
                        break;
                    case 14:
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
                            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:316:3: lv_quality_3_1= 'wood'
                            {
                            lv_quality_3_1=(Token)match(input,12,FOLLOW_12_in_ruleStraight575); 

                                    newLeafNode(lv_quality_3_1, grammarAccess.getStraightAccess().getQualityWoodKeyword_3_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getStraightRule());
                            	        }
                                   		setWithLastConsumed(current, "quality", lv_quality_3_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:328:8: lv_quality_3_2= 'iron'
                            {
                            lv_quality_3_2=(Token)match(input,13,FOLLOW_13_in_ruleStraight604); 

                                    newLeafNode(lv_quality_3_2, grammarAccess.getStraightAccess().getQualityIronKeyword_3_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getStraightRule());
                            	        }
                                   		setWithLastConsumed(current, "quality", lv_quality_3_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:340:8: lv_quality_3_3= 'steel'
                            {
                            lv_quality_3_3=(Token)match(input,14,FOLLOW_14_in_ruleStraight633); 

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

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:355:3: ( (lv_length_4_0= RULE_INT ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:356:1: (lv_length_4_0= RULE_INT )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:356:1: (lv_length_4_0= RULE_INT )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:357:3: lv_length_4_0= RULE_INT
            {
            lv_length_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStraight667); 

            			newLeafNode(lv_length_4_0, grammarAccess.getStraightAccess().getLengthINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStraightRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"length",
                    		lv_length_4_0, 
                    		"INT");
            	    

            }


            }

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:373:2: ( (lv_elevationChange_5_0= ruleSignedInt ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT) ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==RULE_INT||LA8_2==15||LA8_2==17||LA8_2==24) ) {
                    alt8=1;
                }
                else if ( (LA8_2==EOF) ) {
                    int LA8_4 = input.LA(3);

                    if ( (LA8_4==EOF) ) {
                        alt8=1;
                    }
                }
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:374:1: (lv_elevationChange_5_0= ruleSignedInt )
                    {
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:374:1: (lv_elevationChange_5_0= ruleSignedInt )
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:375:3: lv_elevationChange_5_0= ruleSignedInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getStraightAccess().getElevationChangeSignedIntParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSignedInt_in_ruleStraight693);
                    lv_elevationChange_5_0=ruleSignedInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStraightRule());
                    	        }
                           		set(
                           			current, 
                           			"elevationChange",
                            		lv_elevationChange_5_0, 
                            		"SignedInt");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:399:1: entryRuleCorner returns [EObject current=null] : iv_ruleCorner= ruleCorner EOF ;
    public final EObject entryRuleCorner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCorner = null;


        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:400:2: (iv_ruleCorner= ruleCorner EOF )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:401:2: iv_ruleCorner= ruleCorner EOF
            {
             newCompositeNode(grammarAccess.getCornerRule()); 
            pushFollow(FOLLOW_ruleCorner_in_entryRuleCorner730);
            iv_ruleCorner=ruleCorner();

            state._fsp--;

             current =iv_ruleCorner; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCorner740); 

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
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:408:1: ruleCorner returns [EObject current=null] : (otherlv_0= 'Corner' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' ) ) ) ( ( (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' ) ) ) ( ( (lv_quality_4_1= 'wood' | lv_quality_4_2= 'iron' | lv_quality_4_3= 'steel' ) ) )? ) ;
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
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:411:28: ( (otherlv_0= 'Corner' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' ) ) ) ( ( (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' ) ) ) ( ( (lv_quality_4_1= 'wood' | lv_quality_4_2= 'iron' | lv_quality_4_3= 'steel' ) ) )? ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:412:1: (otherlv_0= 'Corner' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' ) ) ) ( ( (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' ) ) ) ( ( (lv_quality_4_1= 'wood' | lv_quality_4_2= 'iron' | lv_quality_4_3= 'steel' ) ) )? )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:412:1: (otherlv_0= 'Corner' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' ) ) ) ( ( (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' ) ) ) ( ( (lv_quality_4_1= 'wood' | lv_quality_4_2= 'iron' | lv_quality_4_3= 'steel' ) ) )? )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:412:3: otherlv_0= 'Corner' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' ) ) ) ( ( (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' ) ) ) ( ( (lv_quality_4_1= 'wood' | lv_quality_4_2= 'iron' | lv_quality_4_3= 'steel' ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleCorner777); 

                	newLeafNode(otherlv_0, grammarAccess.getCornerAccess().getCornerKeyword_0());
                
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:416:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:417:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:417:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:418:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCorner794); 

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

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:434:2: ( ( (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' ) ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:435:1: ( (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' ) )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:435:1: ( (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:436:1: (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:436:1: (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:437:3: lv_direction_2_1= 'left'
                    {
                    lv_direction_2_1=(Token)match(input,18,FOLLOW_18_in_ruleCorner819); 

                            newLeafNode(lv_direction_2_1, grammarAccess.getCornerAccess().getDirectionLeftKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCornerRule());
                    	        }
                           		setWithLastConsumed(current, "direction", lv_direction_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:449:8: lv_direction_2_2= 'right'
                    {
                    lv_direction_2_2=(Token)match(input,19,FOLLOW_19_in_ruleCorner848); 

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

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:464:2: ( ( (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' ) ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:465:1: ( (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' ) )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:465:1: ( (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:466:1: (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:466:1: (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt10=1;
                }
                break;
            case 21:
                {
                alt10=2;
                }
                break;
            case 22:
                {
                alt10=3;
                }
                break;
            case 23:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:467:3: lv_type_3_1= 'sharp45'
                    {
                    lv_type_3_1=(Token)match(input,20,FOLLOW_20_in_ruleCorner884); 

                            newLeafNode(lv_type_3_1, grammarAccess.getCornerAccess().getTypeSharp45Keyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCornerRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:479:8: lv_type_3_2= 'sharp90'
                    {
                    lv_type_3_2=(Token)match(input,21,FOLLOW_21_in_ruleCorner913); 

                            newLeafNode(lv_type_3_2, grammarAccess.getCornerAccess().getTypeSharp90Keyword_3_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCornerRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:491:8: lv_type_3_3= 'easy45'
                    {
                    lv_type_3_3=(Token)match(input,22,FOLLOW_22_in_ruleCorner942); 

                            newLeafNode(lv_type_3_3, grammarAccess.getCornerAccess().getTypeEasy45Keyword_3_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCornerRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:503:8: lv_type_3_4= 'easy90'
                    {
                    lv_type_3_4=(Token)match(input,23,FOLLOW_23_in_ruleCorner971); 

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

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:518:2: ( ( (lv_quality_4_1= 'wood' | lv_quality_4_2= 'iron' | lv_quality_4_3= 'steel' ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=12 && LA12_0<=14)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:519:1: ( (lv_quality_4_1= 'wood' | lv_quality_4_2= 'iron' | lv_quality_4_3= 'steel' ) )
                    {
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:519:1: ( (lv_quality_4_1= 'wood' | lv_quality_4_2= 'iron' | lv_quality_4_3= 'steel' ) )
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:520:1: (lv_quality_4_1= 'wood' | lv_quality_4_2= 'iron' | lv_quality_4_3= 'steel' )
                    {
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:520:1: (lv_quality_4_1= 'wood' | lv_quality_4_2= 'iron' | lv_quality_4_3= 'steel' )
                    int alt11=3;
                    switch ( input.LA(1) ) {
                    case 12:
                        {
                        alt11=1;
                        }
                        break;
                    case 13:
                        {
                        alt11=2;
                        }
                        break;
                    case 14:
                        {
                        alt11=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }

                    switch (alt11) {
                        case 1 :
                            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:521:3: lv_quality_4_1= 'wood'
                            {
                            lv_quality_4_1=(Token)match(input,12,FOLLOW_12_in_ruleCorner1007); 

                                    newLeafNode(lv_quality_4_1, grammarAccess.getCornerAccess().getQualityWoodKeyword_4_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCornerRule());
                            	        }
                                   		setWithLastConsumed(current, "quality", lv_quality_4_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:533:8: lv_quality_4_2= 'iron'
                            {
                            lv_quality_4_2=(Token)match(input,13,FOLLOW_13_in_ruleCorner1036); 

                                    newLeafNode(lv_quality_4_2, grammarAccess.getCornerAccess().getQualityIronKeyword_4_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCornerRule());
                            	        }
                                   		setWithLastConsumed(current, "quality", lv_quality_4_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:545:8: lv_quality_4_3= 'steel'
                            {
                            lv_quality_4_3=(Token)match(input,14,FOLLOW_14_in_ruleCorner1065); 

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
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:568:1: entryRuleCart returns [EObject current=null] : iv_ruleCart= ruleCart EOF ;
    public final EObject entryRuleCart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCart = null;


        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:569:2: (iv_ruleCart= ruleCart EOF )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:570:2: iv_ruleCart= ruleCart EOF
            {
             newCompositeNode(grammarAccess.getCartRule()); 
            pushFollow(FOLLOW_ruleCart_in_entryRuleCart1118);
            iv_ruleCart=ruleCart();

            state._fsp--;

             current =iv_ruleCart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCart1128); 

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
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:577:1: ruleCart returns [EObject current=null] : (otherlv_0= 'Cart' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_quality_2_1= 'wood' | lv_quality_2_2= 'iron' | lv_quality_2_3= 'steel' ) ) )? ( (lv_seatNumber_3_0= RULE_INT ) ) ) ;
    public final EObject ruleCart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_quality_2_1=null;
        Token lv_quality_2_2=null;
        Token lv_quality_2_3=null;
        Token lv_seatNumber_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:580:28: ( (otherlv_0= 'Cart' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_quality_2_1= 'wood' | lv_quality_2_2= 'iron' | lv_quality_2_3= 'steel' ) ) )? ( (lv_seatNumber_3_0= RULE_INT ) ) ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:581:1: (otherlv_0= 'Cart' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_quality_2_1= 'wood' | lv_quality_2_2= 'iron' | lv_quality_2_3= 'steel' ) ) )? ( (lv_seatNumber_3_0= RULE_INT ) ) )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:581:1: (otherlv_0= 'Cart' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_quality_2_1= 'wood' | lv_quality_2_2= 'iron' | lv_quality_2_3= 'steel' ) ) )? ( (lv_seatNumber_3_0= RULE_INT ) ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:581:3: otherlv_0= 'Cart' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_quality_2_1= 'wood' | lv_quality_2_2= 'iron' | lv_quality_2_3= 'steel' ) ) )? ( (lv_seatNumber_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleCart1165); 

                	newLeafNode(otherlv_0, grammarAccess.getCartAccess().getCartKeyword_0());
                
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:585:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:586:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:586:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:587:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCart1182); 

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

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:603:2: ( ( (lv_quality_2_1= 'wood' | lv_quality_2_2= 'iron' | lv_quality_2_3= 'steel' ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=12 && LA14_0<=14)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:604:1: ( (lv_quality_2_1= 'wood' | lv_quality_2_2= 'iron' | lv_quality_2_3= 'steel' ) )
                    {
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:604:1: ( (lv_quality_2_1= 'wood' | lv_quality_2_2= 'iron' | lv_quality_2_3= 'steel' ) )
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:605:1: (lv_quality_2_1= 'wood' | lv_quality_2_2= 'iron' | lv_quality_2_3= 'steel' )
                    {
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:605:1: (lv_quality_2_1= 'wood' | lv_quality_2_2= 'iron' | lv_quality_2_3= 'steel' )
                    int alt13=3;
                    switch ( input.LA(1) ) {
                    case 12:
                        {
                        alt13=1;
                        }
                        break;
                    case 13:
                        {
                        alt13=2;
                        }
                        break;
                    case 14:
                        {
                        alt13=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }

                    switch (alt13) {
                        case 1 :
                            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:606:3: lv_quality_2_1= 'wood'
                            {
                            lv_quality_2_1=(Token)match(input,12,FOLLOW_12_in_ruleCart1207); 

                                    newLeafNode(lv_quality_2_1, grammarAccess.getCartAccess().getQualityWoodKeyword_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCartRule());
                            	        }
                                   		setWithLastConsumed(current, "quality", lv_quality_2_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:618:8: lv_quality_2_2= 'iron'
                            {
                            lv_quality_2_2=(Token)match(input,13,FOLLOW_13_in_ruleCart1236); 

                                    newLeafNode(lv_quality_2_2, grammarAccess.getCartAccess().getQualityIronKeyword_2_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCartRule());
                            	        }
                                   		setWithLastConsumed(current, "quality", lv_quality_2_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:630:8: lv_quality_2_3= 'steel'
                            {
                            lv_quality_2_3=(Token)match(input,14,FOLLOW_14_in_ruleCart1265); 

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

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:645:3: ( (lv_seatNumber_3_0= RULE_INT ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:646:1: (lv_seatNumber_3_0= RULE_INT )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:646:1: (lv_seatNumber_3_0= RULE_INT )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:647:3: lv_seatNumber_3_0= RULE_INT
            {
            lv_seatNumber_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCart1299); 

            			newLeafNode(lv_seatNumber_3_0, grammarAccess.getCartAccess().getSeatNumberINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"seatNumber",
                    		lv_seatNumber_3_0, 
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
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:671:1: entryRuleSignedInt returns [EObject current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final EObject entryRuleSignedInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedInt = null;


        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:672:2: (iv_ruleSignedInt= ruleSignedInt EOF )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:673:2: iv_ruleSignedInt= ruleSignedInt EOF
            {
             newCompositeNode(grammarAccess.getSignedIntRule()); 
            pushFollow(FOLLOW_ruleSignedInt_in_entryRuleSignedInt1340);
            iv_ruleSignedInt=ruleSignedInt();

            state._fsp--;

             current =iv_ruleSignedInt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedInt1350); 

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
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:680:1: ruleSignedInt returns [EObject current=null] : ( ( (lv_sign_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleSignedInt() throws RecognitionException {
        EObject current = null;

        Token lv_sign_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:683:28: ( ( ( (lv_sign_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:684:1: ( ( (lv_sign_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:684:1: ( ( (lv_sign_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:684:2: ( (lv_sign_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:684:2: ( (lv_sign_0_0= '-' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:685:1: (lv_sign_0_0= '-' )
                    {
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:685:1: (lv_sign_0_0= '-' )
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:686:3: lv_sign_0_0= '-'
                    {
                    lv_sign_0_0=(Token)match(input,25,FOLLOW_25_in_ruleSignedInt1393); 

                            newLeafNode(lv_sign_0_0, grammarAccess.getSignedIntAccess().getSignHyphenMinusKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSignedIntRule());
                    	        }
                           		setWithLastConsumed(current, "sign", lv_sign_0_0, "-");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:699:3: ( (lv_value_1_0= RULE_INT ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:700:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:700:1: (lv_value_1_0= RULE_INT )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:701:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignedInt1424); 

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
    public static final BitSet FOLLOW_ruleRollerCoaster_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRollerCoaster_in_entryRuleRollerCoaster165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRollerCoaster175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleRollerCoaster212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRollerCoaster229 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_12_in_ruleRollerCoaster254 = new BitSet(new long[]{0x0000000001028020L});
    public static final BitSet FOLLOW_13_in_ruleRollerCoaster283 = new BitSet(new long[]{0x0000000001028020L});
    public static final BitSet FOLLOW_14_in_ruleRollerCoaster312 = new BitSet(new long[]{0x0000000001028020L});
    public static final BitSet FOLLOW_ruleStraight_in_ruleRollerCoaster351 = new BitSet(new long[]{0x0000000001028020L});
    public static final BitSet FOLLOW_ruleCorner_in_ruleRollerCoaster370 = new BitSet(new long[]{0x0000000001028020L});
    public static final BitSet FOLLOW_ruleCart_in_ruleRollerCoaster395 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRollerCoaster413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStraight_in_entryRuleStraight454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStraight464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStraight501 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStraight518 = new BitSet(new long[]{0x0000000000017020L});
    public static final BitSet FOLLOW_16_in_ruleStraight541 = new BitSet(new long[]{0x0000000000007020L});
    public static final BitSet FOLLOW_12_in_ruleStraight575 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13_in_ruleStraight604 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14_in_ruleStraight633 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStraight667 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_ruleSignedInt_in_ruleStraight693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCorner_in_entryRuleCorner730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCorner740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleCorner777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCorner794 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleCorner819 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_19_in_ruleCorner848 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_20_in_ruleCorner884 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_21_in_ruleCorner913 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_22_in_ruleCorner942 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_23_in_ruleCorner971 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_12_in_ruleCorner1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleCorner1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleCorner1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCart_in_entryRuleCart1118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCart1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCart1165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCart1182 = new BitSet(new long[]{0x0000000000007020L});
    public static final BitSet FOLLOW_12_in_ruleCart1207 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13_in_ruleCart1236 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14_in_ruleCart1265 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCart1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInt_in_entryRuleSignedInt1340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedInt1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSignedInt1393 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignedInt1424 = new BitSet(new long[]{0x0000000000000002L});

}