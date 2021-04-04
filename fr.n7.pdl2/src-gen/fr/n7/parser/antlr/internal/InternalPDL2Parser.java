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
import fr.n7.services.PDL2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDL2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'process'", "'{'", "'}'", "'wd'", "'starts'", "'if'", "'finishes'", "'re'", "'Quantity'", "'need'", "'to'", "'start'", "'started'", "'finished'", "'note'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPDL2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPDL2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPDL2Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalPDL2.g"; }



     	private PDL2GrammarAccess grammarAccess;

        public InternalPDL2Parser(TokenStream input, PDL2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Process";
       	}

       	@Override
       	protected PDL2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProcess"
    // InternalPDL2.g:64:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalPDL2.g:64:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalPDL2.g:65:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalPDL2.g:71:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_processElements_3_0 = null;



        	enterRule();

        try {
            // InternalPDL2.g:77:2: ( (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' ) )
            // InternalPDL2.g:78:2: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' )
            {
            // InternalPDL2.g:78:2: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' )
            // InternalPDL2.g:79:3: otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
            		
            // InternalPDL2.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPDL2.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPDL2.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalPDL2.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPDL2.g:105:3: ( (lv_processElements_3_0= ruleProcessElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||LA1_0==18||LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPDL2.g:106:4: (lv_processElements_3_0= ruleProcessElement )
            	    {
            	    // InternalPDL2.g:106:4: (lv_processElements_3_0= ruleProcessElement )
            	    // InternalPDL2.g:107:5: lv_processElements_3_0= ruleProcessElement
            	    {

            	    					newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_processElements_3_0=ruleProcessElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"processElements",
            	    						lv_processElements_3_0,
            	    						"fr.n7.PDL2.ProcessElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessElement"
    // InternalPDL2.g:132:1: entryRuleProcessElement returns [EObject current=null] : iv_ruleProcessElement= ruleProcessElement EOF ;
    public final EObject entryRuleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessElement = null;


        try {
            // InternalPDL2.g:132:55: (iv_ruleProcessElement= ruleProcessElement EOF )
            // InternalPDL2.g:133:2: iv_ruleProcessElement= ruleProcessElement EOF
            {
             newCompositeNode(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessElement=ruleProcessElement();

            state._fsp--;

             current =iv_ruleProcessElement; 
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
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // InternalPDL2.g:139:1: ruleProcessElement returns [EObject current=null] : (this_WorkDefinition_0= ruleWorkDefinition | this_Guidance_1= ruleGuidance | this_Ressource_2= ruleRessource ) ;
    public final EObject ruleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject this_WorkDefinition_0 = null;

        EObject this_Guidance_1 = null;

        EObject this_Ressource_2 = null;



        	enterRule();

        try {
            // InternalPDL2.g:145:2: ( (this_WorkDefinition_0= ruleWorkDefinition | this_Guidance_1= ruleGuidance | this_Ressource_2= ruleRessource ) )
            // InternalPDL2.g:146:2: (this_WorkDefinition_0= ruleWorkDefinition | this_Guidance_1= ruleGuidance | this_Ressource_2= ruleRessource )
            {
            // InternalPDL2.g:146:2: (this_WorkDefinition_0= ruleWorkDefinition | this_Guidance_1= ruleGuidance | this_Ressource_2= ruleRessource )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 18:
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
                    // InternalPDL2.g:147:3: this_WorkDefinition_0= ruleWorkDefinition
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_WorkDefinition_0=ruleWorkDefinition();

                    state._fsp--;


                    			current = this_WorkDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPDL2.g:156:3: this_Guidance_1= ruleGuidance
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Guidance_1=ruleGuidance();

                    state._fsp--;


                    			current = this_Guidance_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPDL2.g:165:3: this_Ressource_2= ruleRessource
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getRessourceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ressource_2=ruleRessource();

                    state._fsp--;


                    			current = this_Ressource_2;
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
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalPDL2.g:177:1: entryRuleWorkDefinition returns [EObject current=null] : iv_ruleWorkDefinition= ruleWorkDefinition EOF ;
    public final EObject entryRuleWorkDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDefinition = null;


        try {
            // InternalPDL2.g:177:55: (iv_ruleWorkDefinition= ruleWorkDefinition EOF )
            // InternalPDL2.g:178:2: iv_ruleWorkDefinition= ruleWorkDefinition EOF
            {
             newCompositeNode(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkDefinition=ruleWorkDefinition();

            state._fsp--;

             current =iv_ruleWorkDefinition; 
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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalPDL2.g:184:1: ruleWorkDefinition returns [EObject current=null] : (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'starts' otherlv_4= 'if' ( (lv_linksToPredecessors_5_0= ruleDependanceStart ) )+ )? (otherlv_6= 'finishes' otherlv_7= 'if' ( (lv_linksToPredecessors_8_0= ruleDependanceFinish ) )+ )? otherlv_9= '}' ) ;
    public final EObject ruleWorkDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_linksToPredecessors_5_0 = null;

        EObject lv_linksToPredecessors_8_0 = null;



        	enterRule();

        try {
            // InternalPDL2.g:190:2: ( (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'starts' otherlv_4= 'if' ( (lv_linksToPredecessors_5_0= ruleDependanceStart ) )+ )? (otherlv_6= 'finishes' otherlv_7= 'if' ( (lv_linksToPredecessors_8_0= ruleDependanceFinish ) )+ )? otherlv_9= '}' ) )
            // InternalPDL2.g:191:2: (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'starts' otherlv_4= 'if' ( (lv_linksToPredecessors_5_0= ruleDependanceStart ) )+ )? (otherlv_6= 'finishes' otherlv_7= 'if' ( (lv_linksToPredecessors_8_0= ruleDependanceFinish ) )+ )? otherlv_9= '}' )
            {
            // InternalPDL2.g:191:2: (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'starts' otherlv_4= 'if' ( (lv_linksToPredecessors_5_0= ruleDependanceStart ) )+ )? (otherlv_6= 'finishes' otherlv_7= 'if' ( (lv_linksToPredecessors_8_0= ruleDependanceFinish ) )+ )? otherlv_9= '}' )
            // InternalPDL2.g:192:3: otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'starts' otherlv_4= 'if' ( (lv_linksToPredecessors_5_0= ruleDependanceStart ) )+ )? (otherlv_6= 'finishes' otherlv_7= 'if' ( (lv_linksToPredecessors_8_0= ruleDependanceFinish ) )+ )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkDefinitionAccess().getWdKeyword_0());
            		
            // InternalPDL2.g:196:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPDL2.g:197:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPDL2.g:197:4: (lv_name_1_0= RULE_ID )
            // InternalPDL2.g:198:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPDL2.g:218:3: (otherlv_3= 'starts' otherlv_4= 'if' ( (lv_linksToPredecessors_5_0= ruleDependanceStart ) )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPDL2.g:219:4: otherlv_3= 'starts' otherlv_4= 'if' ( (lv_linksToPredecessors_5_0= ruleDependanceStart ) )+
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getWorkDefinitionAccess().getStartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getWorkDefinitionAccess().getIfKeyword_3_1());
                    			
                    // InternalPDL2.g:227:4: ( (lv_linksToPredecessors_5_0= ruleDependanceStart ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalPDL2.g:228:5: (lv_linksToPredecessors_5_0= ruleDependanceStart )
                    	    {
                    	    // InternalPDL2.g:228:5: (lv_linksToPredecessors_5_0= ruleDependanceStart )
                    	    // InternalPDL2.g:229:6: lv_linksToPredecessors_5_0= ruleDependanceStart
                    	    {

                    	    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsDependanceStartParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_linksToPredecessors_5_0=ruleDependanceStart();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"linksToPredecessors",
                    	    							lv_linksToPredecessors_5_0,
                    	    							"fr.n7.PDL2.DependanceStart");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }

            // InternalPDL2.g:247:3: (otherlv_6= 'finishes' otherlv_7= 'if' ( (lv_linksToPredecessors_8_0= ruleDependanceFinish ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPDL2.g:248:4: otherlv_6= 'finishes' otherlv_7= 'if' ( (lv_linksToPredecessors_8_0= ruleDependanceFinish ) )+
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getWorkDefinitionAccess().getFinishesKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getWorkDefinitionAccess().getIfKeyword_4_1());
                    			
                    // InternalPDL2.g:256:4: ( (lv_linksToPredecessors_8_0= ruleDependanceFinish ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalPDL2.g:257:5: (lv_linksToPredecessors_8_0= ruleDependanceFinish )
                    	    {
                    	    // InternalPDL2.g:257:5: (lv_linksToPredecessors_8_0= ruleDependanceFinish )
                    	    // InternalPDL2.g:258:6: lv_linksToPredecessors_8_0= ruleDependanceFinish
                    	    {

                    	    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsDependanceFinishParserRuleCall_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_linksToPredecessors_8_0=ruleDependanceFinish();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"linksToPredecessors",
                    	    							lv_linksToPredecessors_8_0,
                    	    							"fr.n7.PDL2.DependanceFinish");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


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
                    break;

            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleRessource"
    // InternalPDL2.g:284:1: entryRuleRessource returns [EObject current=null] : iv_ruleRessource= ruleRessource EOF ;
    public final EObject entryRuleRessource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRessource = null;


        try {
            // InternalPDL2.g:284:50: (iv_ruleRessource= ruleRessource EOF )
            // InternalPDL2.g:285:2: iv_ruleRessource= ruleRessource EOF
            {
             newCompositeNode(grammarAccess.getRessourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRessource=ruleRessource();

            state._fsp--;

             current =iv_ruleRessource; 
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
    // $ANTLR end "entryRuleRessource"


    // $ANTLR start "ruleRessource"
    // InternalPDL2.g:291:1: ruleRessource returns [EObject current=null] : (otherlv_0= 're' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Quantity' this_INT_4= RULE_INT ( ( (otherlv_5= RULE_ID ) ) otherlv_6= 'need' this_INT_7= RULE_INT otherlv_8= 'to' otherlv_9= 'start' )* otherlv_10= '}' ) ;
    public final EObject ruleRessource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_INT_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_INT_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalPDL2.g:297:2: ( (otherlv_0= 're' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Quantity' this_INT_4= RULE_INT ( ( (otherlv_5= RULE_ID ) ) otherlv_6= 'need' this_INT_7= RULE_INT otherlv_8= 'to' otherlv_9= 'start' )* otherlv_10= '}' ) )
            // InternalPDL2.g:298:2: (otherlv_0= 're' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Quantity' this_INT_4= RULE_INT ( ( (otherlv_5= RULE_ID ) ) otherlv_6= 'need' this_INT_7= RULE_INT otherlv_8= 'to' otherlv_9= 'start' )* otherlv_10= '}' )
            {
            // InternalPDL2.g:298:2: (otherlv_0= 're' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Quantity' this_INT_4= RULE_INT ( ( (otherlv_5= RULE_ID ) ) otherlv_6= 'need' this_INT_7= RULE_INT otherlv_8= 'to' otherlv_9= 'start' )* otherlv_10= '}' )
            // InternalPDL2.g:299:3: otherlv_0= 're' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Quantity' this_INT_4= RULE_INT ( ( (otherlv_5= RULE_ID ) ) otherlv_6= 'need' this_INT_7= RULE_INT otherlv_8= 'to' otherlv_9= 'start' )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRessourceAccess().getReKeyword_0());
            		
            // InternalPDL2.g:303:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPDL2.g:304:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPDL2.g:304:4: (lv_name_1_0= RULE_ID )
            // InternalPDL2.g:305:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRessourceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRessourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRessourceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getRessourceAccess().getQuantityKeyword_3());
            		
            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_9); 

            			newLeafNode(this_INT_4, grammarAccess.getRessourceAccess().getINTTerminalRuleCall_4());
            		
            // InternalPDL2.g:333:3: ( ( (otherlv_5= RULE_ID ) ) otherlv_6= 'need' this_INT_7= RULE_INT otherlv_8= 'to' otherlv_9= 'start' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPDL2.g:334:4: ( (otherlv_5= RULE_ID ) ) otherlv_6= 'need' this_INT_7= RULE_INT otherlv_8= 'to' otherlv_9= 'start'
            	    {
            	    // InternalPDL2.g:334:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalPDL2.g:335:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalPDL2.g:335:5: (otherlv_5= RULE_ID )
            	    // InternalPDL2.g:336:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRessourceRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    						newLeafNode(otherlv_5, grammarAccess.getRessourceAccess().getWdWorkDefinitionCrossReference_5_0_0());
            	    					

            	    }


            	    }

            	    otherlv_6=(Token)match(input,20,FOLLOW_11); 

            	    				newLeafNode(otherlv_6, grammarAccess.getRessourceAccess().getNeedKeyword_5_1());
            	    			
            	    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_13); 

            	    				newLeafNode(this_INT_7, grammarAccess.getRessourceAccess().getINTTerminalRuleCall_5_2());
            	    			
            	    otherlv_8=(Token)match(input,21,FOLLOW_14); 

            	    				newLeafNode(otherlv_8, grammarAccess.getRessourceAccess().getToKeyword_5_3());
            	    			
            	    otherlv_9=(Token)match(input,22,FOLLOW_9); 

            	    				newLeafNode(otherlv_9, grammarAccess.getRessourceAccess().getStartKeyword_5_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getRessourceAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleRessource"


    // $ANTLR start "entryRuleDependanceStart"
    // InternalPDL2.g:372:1: entryRuleDependanceStart returns [EObject current=null] : iv_ruleDependanceStart= ruleDependanceStart EOF ;
    public final EObject entryRuleDependanceStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependanceStart = null;


        try {
            // InternalPDL2.g:372:56: (iv_ruleDependanceStart= ruleDependanceStart EOF )
            // InternalPDL2.g:373:2: iv_ruleDependanceStart= ruleDependanceStart EOF
            {
             newCompositeNode(grammarAccess.getDependanceStartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependanceStart=ruleDependanceStart();

            state._fsp--;

             current =iv_ruleDependanceStart; 
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
    // $ANTLR end "entryRuleDependanceStart"


    // $ANTLR start "ruleDependanceStart"
    // InternalPDL2.g:379:1: ruleDependanceStart returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_link_1_0= ruleWorkSequenceKindStart ) ) ) ;
    public final EObject ruleDependanceStart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_link_1_0 = null;



        	enterRule();

        try {
            // InternalPDL2.g:385:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_link_1_0= ruleWorkSequenceKindStart ) ) ) )
            // InternalPDL2.g:386:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_link_1_0= ruleWorkSequenceKindStart ) ) )
            {
            // InternalPDL2.g:386:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_link_1_0= ruleWorkSequenceKindStart ) ) )
            // InternalPDL2.g:387:3: ( (otherlv_0= RULE_ID ) ) ( (lv_link_1_0= ruleWorkSequenceKindStart ) )
            {
            // InternalPDL2.g:387:3: ( (otherlv_0= RULE_ID ) )
            // InternalPDL2.g:388:4: (otherlv_0= RULE_ID )
            {
            // InternalPDL2.g:388:4: (otherlv_0= RULE_ID )
            // InternalPDL2.g:389:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependanceStartRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_0, grammarAccess.getDependanceStartAccess().getPredecessorWorkDefinitionCrossReference_0_0());
            				

            }


            }

            // InternalPDL2.g:400:3: ( (lv_link_1_0= ruleWorkSequenceKindStart ) )
            // InternalPDL2.g:401:4: (lv_link_1_0= ruleWorkSequenceKindStart )
            {
            // InternalPDL2.g:401:4: (lv_link_1_0= ruleWorkSequenceKindStart )
            // InternalPDL2.g:402:5: lv_link_1_0= ruleWorkSequenceKindStart
            {

            					newCompositeNode(grammarAccess.getDependanceStartAccess().getLinkWorkSequenceKindStartParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_link_1_0=ruleWorkSequenceKindStart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDependanceStartRule());
            					}
            					set(
            						current,
            						"link",
            						lv_link_1_0,
            						"fr.n7.PDL2.WorkSequenceKindStart");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleDependanceStart"


    // $ANTLR start "entryRuleWorkSequenceKindStart"
    // InternalPDL2.g:423:1: entryRuleWorkSequenceKindStart returns [EObject current=null] : iv_ruleWorkSequenceKindStart= ruleWorkSequenceKindStart EOF ;
    public final EObject entryRuleWorkSequenceKindStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequenceKindStart = null;


        try {
            // InternalPDL2.g:423:62: (iv_ruleWorkSequenceKindStart= ruleWorkSequenceKindStart EOF )
            // InternalPDL2.g:424:2: iv_ruleWorkSequenceKindStart= ruleWorkSequenceKindStart EOF
            {
             newCompositeNode(grammarAccess.getWorkSequenceKindStartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkSequenceKindStart=ruleWorkSequenceKindStart();

            state._fsp--;

             current =iv_ruleWorkSequenceKindStart; 
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
    // $ANTLR end "entryRuleWorkSequenceKindStart"


    // $ANTLR start "ruleWorkSequenceKindStart"
    // InternalPDL2.g:430:1: ruleWorkSequenceKindStart returns [EObject current=null] : ( ( (lv_Started2Start_0_0= 'started' ) ) | ( (lv_Started2Finish_1_0= 'finished' ) ) ) ;
    public final EObject ruleWorkSequenceKindStart() throws RecognitionException {
        EObject current = null;

        Token lv_Started2Start_0_0=null;
        Token lv_Started2Finish_1_0=null;


        	enterRule();

        try {
            // InternalPDL2.g:436:2: ( ( ( (lv_Started2Start_0_0= 'started' ) ) | ( (lv_Started2Finish_1_0= 'finished' ) ) ) )
            // InternalPDL2.g:437:2: ( ( (lv_Started2Start_0_0= 'started' ) ) | ( (lv_Started2Finish_1_0= 'finished' ) ) )
            {
            // InternalPDL2.g:437:2: ( ( (lv_Started2Start_0_0= 'started' ) ) | ( (lv_Started2Finish_1_0= 'finished' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPDL2.g:438:3: ( (lv_Started2Start_0_0= 'started' ) )
                    {
                    // InternalPDL2.g:438:3: ( (lv_Started2Start_0_0= 'started' ) )
                    // InternalPDL2.g:439:4: (lv_Started2Start_0_0= 'started' )
                    {
                    // InternalPDL2.g:439:4: (lv_Started2Start_0_0= 'started' )
                    // InternalPDL2.g:440:5: lv_Started2Start_0_0= 'started'
                    {
                    lv_Started2Start_0_0=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_Started2Start_0_0, grammarAccess.getWorkSequenceKindStartAccess().getStarted2StartStartedKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getWorkSequenceKindStartRule());
                    					}
                    					setWithLastConsumed(current, "Started2Start", lv_Started2Start_0_0, "started");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPDL2.g:453:3: ( (lv_Started2Finish_1_0= 'finished' ) )
                    {
                    // InternalPDL2.g:453:3: ( (lv_Started2Finish_1_0= 'finished' ) )
                    // InternalPDL2.g:454:4: (lv_Started2Finish_1_0= 'finished' )
                    {
                    // InternalPDL2.g:454:4: (lv_Started2Finish_1_0= 'finished' )
                    // InternalPDL2.g:455:5: lv_Started2Finish_1_0= 'finished'
                    {
                    lv_Started2Finish_1_0=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_Started2Finish_1_0, grammarAccess.getWorkSequenceKindStartAccess().getStarted2FinishFinishedKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getWorkSequenceKindStartRule());
                    					}
                    					setWithLastConsumed(current, "Started2Finish", lv_Started2Finish_1_0, "finished");
                    				

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
    // $ANTLR end "ruleWorkSequenceKindStart"


    // $ANTLR start "entryRuleDependanceFinish"
    // InternalPDL2.g:471:1: entryRuleDependanceFinish returns [EObject current=null] : iv_ruleDependanceFinish= ruleDependanceFinish EOF ;
    public final EObject entryRuleDependanceFinish() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependanceFinish = null;


        try {
            // InternalPDL2.g:471:57: (iv_ruleDependanceFinish= ruleDependanceFinish EOF )
            // InternalPDL2.g:472:2: iv_ruleDependanceFinish= ruleDependanceFinish EOF
            {
             newCompositeNode(grammarAccess.getDependanceFinishRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependanceFinish=ruleDependanceFinish();

            state._fsp--;

             current =iv_ruleDependanceFinish; 
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
    // $ANTLR end "entryRuleDependanceFinish"


    // $ANTLR start "ruleDependanceFinish"
    // InternalPDL2.g:478:1: ruleDependanceFinish returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_link_1_0= ruleWorkSequenceKindFinish ) ) ) ;
    public final EObject ruleDependanceFinish() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_link_1_0 = null;



        	enterRule();

        try {
            // InternalPDL2.g:484:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_link_1_0= ruleWorkSequenceKindFinish ) ) ) )
            // InternalPDL2.g:485:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_link_1_0= ruleWorkSequenceKindFinish ) ) )
            {
            // InternalPDL2.g:485:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_link_1_0= ruleWorkSequenceKindFinish ) ) )
            // InternalPDL2.g:486:3: ( (otherlv_0= RULE_ID ) ) ( (lv_link_1_0= ruleWorkSequenceKindFinish ) )
            {
            // InternalPDL2.g:486:3: ( (otherlv_0= RULE_ID ) )
            // InternalPDL2.g:487:4: (otherlv_0= RULE_ID )
            {
            // InternalPDL2.g:487:4: (otherlv_0= RULE_ID )
            // InternalPDL2.g:488:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependanceFinishRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_0, grammarAccess.getDependanceFinishAccess().getPredecessorWorkDefinitionCrossReference_0_0());
            				

            }


            }

            // InternalPDL2.g:499:3: ( (lv_link_1_0= ruleWorkSequenceKindFinish ) )
            // InternalPDL2.g:500:4: (lv_link_1_0= ruleWorkSequenceKindFinish )
            {
            // InternalPDL2.g:500:4: (lv_link_1_0= ruleWorkSequenceKindFinish )
            // InternalPDL2.g:501:5: lv_link_1_0= ruleWorkSequenceKindFinish
            {

            					newCompositeNode(grammarAccess.getDependanceFinishAccess().getLinkWorkSequenceKindFinishParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_link_1_0=ruleWorkSequenceKindFinish();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDependanceFinishRule());
            					}
            					set(
            						current,
            						"link",
            						lv_link_1_0,
            						"fr.n7.PDL2.WorkSequenceKindFinish");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleDependanceFinish"


    // $ANTLR start "entryRuleWorkSequenceKindFinish"
    // InternalPDL2.g:522:1: entryRuleWorkSequenceKindFinish returns [EObject current=null] : iv_ruleWorkSequenceKindFinish= ruleWorkSequenceKindFinish EOF ;
    public final EObject entryRuleWorkSequenceKindFinish() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequenceKindFinish = null;


        try {
            // InternalPDL2.g:522:63: (iv_ruleWorkSequenceKindFinish= ruleWorkSequenceKindFinish EOF )
            // InternalPDL2.g:523:2: iv_ruleWorkSequenceKindFinish= ruleWorkSequenceKindFinish EOF
            {
             newCompositeNode(grammarAccess.getWorkSequenceKindFinishRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkSequenceKindFinish=ruleWorkSequenceKindFinish();

            state._fsp--;

             current =iv_ruleWorkSequenceKindFinish; 
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
    // $ANTLR end "entryRuleWorkSequenceKindFinish"


    // $ANTLR start "ruleWorkSequenceKindFinish"
    // InternalPDL2.g:529:1: ruleWorkSequenceKindFinish returns [EObject current=null] : ( ( (lv_Finished2Start_0_0= 'started' ) ) | ( (lv_Finished2Finish_1_0= 'finished' ) ) ) ;
    public final EObject ruleWorkSequenceKindFinish() throws RecognitionException {
        EObject current = null;

        Token lv_Finished2Start_0_0=null;
        Token lv_Finished2Finish_1_0=null;


        	enterRule();

        try {
            // InternalPDL2.g:535:2: ( ( ( (lv_Finished2Start_0_0= 'started' ) ) | ( (lv_Finished2Finish_1_0= 'finished' ) ) ) )
            // InternalPDL2.g:536:2: ( ( (lv_Finished2Start_0_0= 'started' ) ) | ( (lv_Finished2Finish_1_0= 'finished' ) ) )
            {
            // InternalPDL2.g:536:2: ( ( (lv_Finished2Start_0_0= 'started' ) ) | ( (lv_Finished2Finish_1_0= 'finished' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPDL2.g:537:3: ( (lv_Finished2Start_0_0= 'started' ) )
                    {
                    // InternalPDL2.g:537:3: ( (lv_Finished2Start_0_0= 'started' ) )
                    // InternalPDL2.g:538:4: (lv_Finished2Start_0_0= 'started' )
                    {
                    // InternalPDL2.g:538:4: (lv_Finished2Start_0_0= 'started' )
                    // InternalPDL2.g:539:5: lv_Finished2Start_0_0= 'started'
                    {
                    lv_Finished2Start_0_0=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_Finished2Start_0_0, grammarAccess.getWorkSequenceKindFinishAccess().getFinished2StartStartedKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getWorkSequenceKindFinishRule());
                    					}
                    					setWithLastConsumed(current, "Finished2Start", lv_Finished2Start_0_0, "started");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPDL2.g:552:3: ( (lv_Finished2Finish_1_0= 'finished' ) )
                    {
                    // InternalPDL2.g:552:3: ( (lv_Finished2Finish_1_0= 'finished' ) )
                    // InternalPDL2.g:553:4: (lv_Finished2Finish_1_0= 'finished' )
                    {
                    // InternalPDL2.g:553:4: (lv_Finished2Finish_1_0= 'finished' )
                    // InternalPDL2.g:554:5: lv_Finished2Finish_1_0= 'finished'
                    {
                    lv_Finished2Finish_1_0=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_Finished2Finish_1_0, grammarAccess.getWorkSequenceKindFinishAccess().getFinished2FinishFinishedKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getWorkSequenceKindFinishRule());
                    					}
                    					setWithLastConsumed(current, "Finished2Finish", lv_Finished2Finish_1_0, "finished");
                    				

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
    // $ANTLR end "ruleWorkSequenceKindFinish"


    // $ANTLR start "entryRuleGuidance"
    // InternalPDL2.g:570:1: entryRuleGuidance returns [EObject current=null] : iv_ruleGuidance= ruleGuidance EOF ;
    public final EObject entryRuleGuidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidance = null;


        try {
            // InternalPDL2.g:570:49: (iv_ruleGuidance= ruleGuidance EOF )
            // InternalPDL2.g:571:2: iv_ruleGuidance= ruleGuidance EOF
            {
             newCompositeNode(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuidance=ruleGuidance();

            state._fsp--;

             current =iv_ruleGuidance; 
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
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // InternalPDL2.g:577:1: ruleGuidance returns [EObject current=null] : (otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGuidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_texte_1_0=null;


        	enterRule();

        try {
            // InternalPDL2.g:583:2: ( (otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) ) ) )
            // InternalPDL2.g:584:2: (otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) ) )
            {
            // InternalPDL2.g:584:2: (otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) ) )
            // InternalPDL2.g:585:3: otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getGuidanceAccess().getNoteKeyword_0());
            		
            // InternalPDL2.g:589:3: ( (lv_texte_1_0= RULE_STRING ) )
            // InternalPDL2.g:590:4: (lv_texte_1_0= RULE_STRING )
            {
            // InternalPDL2.g:590:4: (lv_texte_1_0= RULE_STRING )
            // InternalPDL2.g:591:5: lv_texte_1_0= RULE_STRING
            {
            lv_texte_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_texte_1_0, grammarAccess.getGuidanceAccess().getTexteSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGuidanceRule());
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
    // $ANTLR end "ruleGuidance"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002046000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000002A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000022010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});

}