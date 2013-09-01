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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RollerCoaster'", "'Straight'", "'powered'", "'Corner'", "'left'", "'right'", "'sharp45'", "'sharp90'", "'easy45'", "'easy90'", "'Cart'", "'-'"
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
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:115:1: ruleRollerCoaster returns [EObject current=null] : (otherlv_0= 'RollerCoaster' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_track_2_1= ruleStraight | lv_track_2_2= ruleCorner ) ) )* ( (lv_cart_3_0= ruleCart ) )* ( (lv_trackUnitLength_4_0= RULE_INT ) ) ) ;
    public final EObject ruleRollerCoaster() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_trackUnitLength_4_0=null;
        EObject lv_track_2_1 = null;

        EObject lv_track_2_2 = null;

        EObject lv_cart_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:118:28: ( (otherlv_0= 'RollerCoaster' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_track_2_1= ruleStraight | lv_track_2_2= ruleCorner ) ) )* ( (lv_cart_3_0= ruleCart ) )* ( (lv_trackUnitLength_4_0= RULE_INT ) ) ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:119:1: (otherlv_0= 'RollerCoaster' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_track_2_1= ruleStraight | lv_track_2_2= ruleCorner ) ) )* ( (lv_cart_3_0= ruleCart ) )* ( (lv_trackUnitLength_4_0= RULE_INT ) ) )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:119:1: (otherlv_0= 'RollerCoaster' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_track_2_1= ruleStraight | lv_track_2_2= ruleCorner ) ) )* ( (lv_cart_3_0= ruleCart ) )* ( (lv_trackUnitLength_4_0= RULE_INT ) ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:119:3: otherlv_0= 'RollerCoaster' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_track_2_1= ruleStraight | lv_track_2_2= ruleCorner ) ) )* ( (lv_cart_3_0= ruleCart ) )* ( (lv_trackUnitLength_4_0= RULE_INT ) )
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

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:141:2: ( ( (lv_track_2_1= ruleStraight | lv_track_2_2= ruleCorner ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12||LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:142:1: ( (lv_track_2_1= ruleStraight | lv_track_2_2= ruleCorner ) )
            	    {
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:142:1: ( (lv_track_2_1= ruleStraight | lv_track_2_2= ruleCorner ) )
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:143:1: (lv_track_2_1= ruleStraight | lv_track_2_2= ruleCorner )
            	    {
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:143:1: (lv_track_2_1= ruleStraight | lv_track_2_2= ruleCorner )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==12) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==14) ) {
            	        alt1=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:144:3: lv_track_2_1= ruleStraight
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getRollerCoasterAccess().getTrackStraightParserRuleCall_2_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleStraight_in_ruleRollerCoaster257);
            	            lv_track_2_1=ruleStraight();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getRollerCoasterRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"track",
            	                    		lv_track_2_1, 
            	                    		"Straight");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:159:8: lv_track_2_2= ruleCorner
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getRollerCoasterAccess().getTrackCornerParserRuleCall_2_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleCorner_in_ruleRollerCoaster276);
            	            lv_track_2_2=ruleCorner();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getRollerCoasterRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"track",
            	                    		lv_track_2_2, 
            	                    		"Corner");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:177:3: ( (lv_cart_3_0= ruleCart ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:178:1: (lv_cart_3_0= ruleCart )
            	    {
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:178:1: (lv_cart_3_0= ruleCart )
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:179:3: lv_cart_3_0= ruleCart
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRollerCoasterAccess().getCartCartParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCart_in_ruleRollerCoaster301);
            	    lv_cart_3_0=ruleCart();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRollerCoasterRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cart",
            	            		lv_cart_3_0, 
            	            		"Cart");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:195:3: ( (lv_trackUnitLength_4_0= RULE_INT ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:196:1: (lv_trackUnitLength_4_0= RULE_INT )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:196:1: (lv_trackUnitLength_4_0= RULE_INT )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:197:3: lv_trackUnitLength_4_0= RULE_INT
            {
            lv_trackUnitLength_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRollerCoaster319); 

            			newLeafNode(lv_trackUnitLength_4_0, grammarAccess.getRollerCoasterAccess().getTrackUnitLengthINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRollerCoasterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"trackUnitLength",
                    		lv_trackUnitLength_4_0, 
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
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:221:1: entryRuleStraight returns [EObject current=null] : iv_ruleStraight= ruleStraight EOF ;
    public final EObject entryRuleStraight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStraight = null;


        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:222:2: (iv_ruleStraight= ruleStraight EOF )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:223:2: iv_ruleStraight= ruleStraight EOF
            {
             newCompositeNode(grammarAccess.getStraightRule()); 
            pushFollow(FOLLOW_ruleStraight_in_entryRuleStraight360);
            iv_ruleStraight=ruleStraight();

            state._fsp--;

             current =iv_ruleStraight; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStraight370); 

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
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:230:1: ruleStraight returns [EObject current=null] : (otherlv_0= 'Straight' ( (lv_name_1_0= RULE_ID ) ) ( (lv_powered_2_0= 'powered' ) )? ( (lv_length_3_0= RULE_INT ) ) ( (lv_elevationChange_4_0= ruleSignedInt ) )? ) ;
    public final EObject ruleStraight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_powered_2_0=null;
        Token lv_length_3_0=null;
        EObject lv_elevationChange_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:233:28: ( (otherlv_0= 'Straight' ( (lv_name_1_0= RULE_ID ) ) ( (lv_powered_2_0= 'powered' ) )? ( (lv_length_3_0= RULE_INT ) ) ( (lv_elevationChange_4_0= ruleSignedInt ) )? ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:234:1: (otherlv_0= 'Straight' ( (lv_name_1_0= RULE_ID ) ) ( (lv_powered_2_0= 'powered' ) )? ( (lv_length_3_0= RULE_INT ) ) ( (lv_elevationChange_4_0= ruleSignedInt ) )? )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:234:1: (otherlv_0= 'Straight' ( (lv_name_1_0= RULE_ID ) ) ( (lv_powered_2_0= 'powered' ) )? ( (lv_length_3_0= RULE_INT ) ) ( (lv_elevationChange_4_0= ruleSignedInt ) )? )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:234:3: otherlv_0= 'Straight' ( (lv_name_1_0= RULE_ID ) ) ( (lv_powered_2_0= 'powered' ) )? ( (lv_length_3_0= RULE_INT ) ) ( (lv_elevationChange_4_0= ruleSignedInt ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleStraight407); 

                	newLeafNode(otherlv_0, grammarAccess.getStraightAccess().getStraightKeyword_0());
                
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:238:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:239:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:239:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:240:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStraight424); 

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

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:256:2: ( (lv_powered_2_0= 'powered' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:257:1: (lv_powered_2_0= 'powered' )
                    {
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:257:1: (lv_powered_2_0= 'powered' )
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:258:3: lv_powered_2_0= 'powered'
                    {
                    lv_powered_2_0=(Token)match(input,13,FOLLOW_13_in_ruleStraight447); 

                            newLeafNode(lv_powered_2_0, grammarAccess.getStraightAccess().getPoweredPoweredKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStraightRule());
                    	        }
                           		setWithLastConsumed(current, "powered", lv_powered_2_0, "powered");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:271:3: ( (lv_length_3_0= RULE_INT ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:272:1: (lv_length_3_0= RULE_INT )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:272:1: (lv_length_3_0= RULE_INT )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:273:3: lv_length_3_0= RULE_INT
            {
            lv_length_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStraight478); 

            			newLeafNode(lv_length_3_0, grammarAccess.getStraightAccess().getLengthINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStraightRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"length",
                    		lv_length_3_0, 
                    		"INT");
            	    

            }


            }

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:289:2: ( (lv_elevationChange_4_0= ruleSignedInt ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INT) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==EOF) ) {
                    int LA5_4 = input.LA(3);

                    if ( (LA5_4==EOF) ) {
                        alt5=1;
                    }
                }
                else if ( (LA5_2==RULE_INT||LA5_2==12||LA5_2==14||LA5_2==21) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:290:1: (lv_elevationChange_4_0= ruleSignedInt )
                    {
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:290:1: (lv_elevationChange_4_0= ruleSignedInt )
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:291:3: lv_elevationChange_4_0= ruleSignedInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getStraightAccess().getElevationChangeSignedIntParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSignedInt_in_ruleStraight504);
                    lv_elevationChange_4_0=ruleSignedInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStraightRule());
                    	        }
                           		set(
                           			current, 
                           			"elevationChange",
                            		lv_elevationChange_4_0, 
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
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:315:1: entryRuleCorner returns [EObject current=null] : iv_ruleCorner= ruleCorner EOF ;
    public final EObject entryRuleCorner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCorner = null;


        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:316:2: (iv_ruleCorner= ruleCorner EOF )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:317:2: iv_ruleCorner= ruleCorner EOF
            {
             newCompositeNode(grammarAccess.getCornerRule()); 
            pushFollow(FOLLOW_ruleCorner_in_entryRuleCorner541);
            iv_ruleCorner=ruleCorner();

            state._fsp--;

             current =iv_ruleCorner; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCorner551); 

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
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:324:1: ruleCorner returns [EObject current=null] : (otherlv_0= 'Corner' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' ) ) ) ( ( (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' ) ) ) ) ;
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

         enterRule(); 
            
        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:327:28: ( (otherlv_0= 'Corner' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' ) ) ) ( ( (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' ) ) ) ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:328:1: (otherlv_0= 'Corner' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' ) ) ) ( ( (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' ) ) ) )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:328:1: (otherlv_0= 'Corner' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' ) ) ) ( ( (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' ) ) ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:328:3: otherlv_0= 'Corner' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' ) ) ) ( ( (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' ) ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleCorner588); 

                	newLeafNode(otherlv_0, grammarAccess.getCornerAccess().getCornerKeyword_0());
                
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:332:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:333:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:333:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:334:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCorner605); 

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

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:350:2: ( ( (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' ) ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:351:1: ( (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' ) )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:351:1: ( (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:352:1: (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:352:1: (lv_direction_2_1= 'left' | lv_direction_2_2= 'right' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:353:3: lv_direction_2_1= 'left'
                    {
                    lv_direction_2_1=(Token)match(input,15,FOLLOW_15_in_ruleCorner630); 

                            newLeafNode(lv_direction_2_1, grammarAccess.getCornerAccess().getDirectionLeftKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCornerRule());
                    	        }
                           		setWithLastConsumed(current, "direction", lv_direction_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:365:8: lv_direction_2_2= 'right'
                    {
                    lv_direction_2_2=(Token)match(input,16,FOLLOW_16_in_ruleCorner659); 

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

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:380:2: ( ( (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' ) ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:381:1: ( (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' ) )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:381:1: ( (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:382:1: (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:382:1: (lv_type_3_1= 'sharp45' | lv_type_3_2= 'sharp90' | lv_type_3_3= 'easy45' | lv_type_3_4= 'easy90' )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 20:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:383:3: lv_type_3_1= 'sharp45'
                    {
                    lv_type_3_1=(Token)match(input,17,FOLLOW_17_in_ruleCorner695); 

                            newLeafNode(lv_type_3_1, grammarAccess.getCornerAccess().getTypeSharp45Keyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCornerRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:395:8: lv_type_3_2= 'sharp90'
                    {
                    lv_type_3_2=(Token)match(input,18,FOLLOW_18_in_ruleCorner724); 

                            newLeafNode(lv_type_3_2, grammarAccess.getCornerAccess().getTypeSharp90Keyword_3_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCornerRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:407:8: lv_type_3_3= 'easy45'
                    {
                    lv_type_3_3=(Token)match(input,19,FOLLOW_19_in_ruleCorner753); 

                            newLeafNode(lv_type_3_3, grammarAccess.getCornerAccess().getTypeEasy45Keyword_3_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCornerRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:419:8: lv_type_3_4= 'easy90'
                    {
                    lv_type_3_4=(Token)match(input,20,FOLLOW_20_in_ruleCorner782); 

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
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:442:1: entryRuleCart returns [EObject current=null] : iv_ruleCart= ruleCart EOF ;
    public final EObject entryRuleCart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCart = null;


        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:443:2: (iv_ruleCart= ruleCart EOF )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:444:2: iv_ruleCart= ruleCart EOF
            {
             newCompositeNode(grammarAccess.getCartRule()); 
            pushFollow(FOLLOW_ruleCart_in_entryRuleCart834);
            iv_ruleCart=ruleCart();

            state._fsp--;

             current =iv_ruleCart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCart844); 

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
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:451:1: ruleCart returns [EObject current=null] : (otherlv_0= 'Cart' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:454:28: ( (otherlv_0= 'Cart' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:455:1: (otherlv_0= 'Cart' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:455:1: (otherlv_0= 'Cart' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:455:3: otherlv_0= 'Cart' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleCart881); 

                	newLeafNode(otherlv_0, grammarAccess.getCartAccess().getCartKeyword_0());
                
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:459:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:460:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:460:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:461:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCart898); 

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
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:485:1: entryRuleSignedInt returns [EObject current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final EObject entryRuleSignedInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedInt = null;


        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:486:2: (iv_ruleSignedInt= ruleSignedInt EOF )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:487:2: iv_ruleSignedInt= ruleSignedInt EOF
            {
             newCompositeNode(grammarAccess.getSignedIntRule()); 
            pushFollow(FOLLOW_ruleSignedInt_in_entryRuleSignedInt939);
            iv_ruleSignedInt=ruleSignedInt();

            state._fsp--;

             current =iv_ruleSignedInt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedInt949); 

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
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:494:1: ruleSignedInt returns [EObject current=null] : ( ( (lv_sign_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleSignedInt() throws RecognitionException {
        EObject current = null;

        Token lv_sign_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:497:28: ( ( ( (lv_sign_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:498:1: ( ( (lv_sign_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:498:1: ( ( (lv_sign_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:498:2: ( (lv_sign_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:498:2: ( (lv_sign_0_0= '-' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:499:1: (lv_sign_0_0= '-' )
                    {
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:499:1: (lv_sign_0_0= '-' )
                    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:500:3: lv_sign_0_0= '-'
                    {
                    lv_sign_0_0=(Token)match(input,22,FOLLOW_22_in_ruleSignedInt992); 

                            newLeafNode(lv_sign_0_0, grammarAccess.getSignedIntAccess().getSignHyphenMinusKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSignedIntRule());
                    	        }
                           		setWithLastConsumed(current, "sign", lv_sign_0_0, "-");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:513:3: ( (lv_value_1_0= RULE_INT ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:514:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:514:1: (lv_value_1_0= RULE_INT )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:515:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignedInt1023); 

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
    public static final BitSet FOLLOW_RULE_ID_in_ruleRollerCoaster229 = new BitSet(new long[]{0x0000000000205020L});
    public static final BitSet FOLLOW_ruleStraight_in_ruleRollerCoaster257 = new BitSet(new long[]{0x0000000000205020L});
    public static final BitSet FOLLOW_ruleCorner_in_ruleRollerCoaster276 = new BitSet(new long[]{0x0000000000205020L});
    public static final BitSet FOLLOW_ruleCart_in_ruleRollerCoaster301 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRollerCoaster319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStraight_in_entryRuleStraight360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStraight370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleStraight407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStraight424 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_13_in_ruleStraight447 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStraight478 = new BitSet(new long[]{0x0000000000400022L});
    public static final BitSet FOLLOW_ruleSignedInt_in_ruleStraight504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCorner_in_entryRuleCorner541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCorner551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleCorner588 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCorner605 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleCorner630 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_16_in_ruleCorner659 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_17_in_ruleCorner695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleCorner724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleCorner753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCorner782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCart_in_entryRuleCart834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCart844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCart881 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCart898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInt_in_entryRuleSignedInt939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedInt949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSignedInt992 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignedInt1023 = new BitSet(new long[]{0x0000000000000002L});

}