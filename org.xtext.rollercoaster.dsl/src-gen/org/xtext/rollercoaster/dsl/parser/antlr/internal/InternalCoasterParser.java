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
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_greetings_0_1= ruleGreeting | lv_greetings_0_2= ruleInsult ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_1 = null;

        EObject lv_greetings_0_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:79:28: ( ( ( (lv_greetings_0_1= ruleGreeting | lv_greetings_0_2= ruleInsult ) ) )* )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:80:1: ( ( (lv_greetings_0_1= ruleGreeting | lv_greetings_0_2= ruleInsult ) ) )*
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:80:1: ( ( (lv_greetings_0_1= ruleGreeting | lv_greetings_0_2= ruleInsult ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11||LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:81:1: ( (lv_greetings_0_1= ruleGreeting | lv_greetings_0_2= ruleInsult ) )
            	    {
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:81:1: ( (lv_greetings_0_1= ruleGreeting | lv_greetings_0_2= ruleInsult ) )
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:82:1: (lv_greetings_0_1= ruleGreeting | lv_greetings_0_2= ruleInsult )
            	    {
            	    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:82:1: (lv_greetings_0_1= ruleGreeting | lv_greetings_0_2= ruleInsult )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==11) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==13) ) {
            	        alt1=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:83:3: lv_greetings_0_1= ruleGreeting
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleGreeting_in_ruleModel132);
            	            lv_greetings_0_1=ruleGreeting();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"greetings",
            	                    		lv_greetings_0_1, 
            	                    		"Greeting");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:98:8: lv_greetings_0_2= ruleInsult
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsInsultParserRuleCall_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleInsult_in_ruleModel151);
            	            lv_greetings_0_2=ruleInsult();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"greetings",
            	                    		lv_greetings_0_2, 
            	                    		"Insult");
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


    // $ANTLR start "entryRuleGreeting"
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:124:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:125:2: (iv_ruleGreeting= ruleGreeting EOF )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:126:2: iv_ruleGreeting= ruleGreeting EOF
            {
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting190);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting200); 

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
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:133:1: ruleGreeting returns [EObject current=null] : (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:136:28: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:137:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:137:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:137:3: otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleGreeting237); 

                	newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getHelloKeyword_0());
                
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:141:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:142:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:142:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:143:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGreeting254); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGreetingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGreeting271); 

                	newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2());
                

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
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleInsult"
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:171:1: entryRuleInsult returns [EObject current=null] : iv_ruleInsult= ruleInsult EOF ;
    public final EObject entryRuleInsult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsult = null;


        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:172:2: (iv_ruleInsult= ruleInsult EOF )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:173:2: iv_ruleInsult= ruleInsult EOF
            {
             newCompositeNode(grammarAccess.getInsultRule()); 
            pushFollow(FOLLOW_ruleInsult_in_entryRuleInsult307);
            iv_ruleInsult=ruleInsult();

            state._fsp--;

             current =iv_ruleInsult; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsult317); 

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
    // $ANTLR end "entryRuleInsult"


    // $ANTLR start "ruleInsult"
    // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:180:1: ruleInsult returns [EObject current=null] : (otherlv_0= 'Die' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) ;
    public final EObject ruleInsult() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:183:28: ( (otherlv_0= 'Die' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:184:1: (otherlv_0= 'Die' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:184:1: (otherlv_0= 'Die' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:184:3: otherlv_0= 'Die' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleInsult354); 

                	newLeafNode(otherlv_0, grammarAccess.getInsultAccess().getDieKeyword_0());
                
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:188:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:189:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:189:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.rollercoaster.dsl/src-gen/org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.g:190:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsult371); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInsultAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInsultRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInsult388); 

                	newLeafNode(otherlv_2, grammarAccess.getInsultAccess().getExclamationMarkKeyword_2());
                

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
    // $ANTLR end "ruleInsult"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel132 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_ruleInsult_in_ruleModel151 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleGreeting237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGreeting254 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGreeting271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsult_in_entryRuleInsult307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsult317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleInsult354 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsult371 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInsult388 = new BitSet(new long[]{0x0000000000000002L});

}