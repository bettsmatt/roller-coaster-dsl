/*
* generated by Xtext
*/
grammar InternalCoaster;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.xtext.rollercoaster.dsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}

@parser::members {
 
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

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getRollerCoasterAssignment()); }
(rule__Model__RollerCoasterAssignment)*
{ after(grammarAccess.getModelAccess().getRollerCoasterAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleRollerCoaster
entryRuleRollerCoaster 
:
{ before(grammarAccess.getRollerCoasterRule()); }
	 ruleRollerCoaster
{ after(grammarAccess.getRollerCoasterRule()); } 
	 EOF 
;

// Rule RollerCoaster
ruleRollerCoaster
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getRollerCoasterAccess().getGroup()); }
(rule__RollerCoaster__Group__0)
{ after(grammarAccess.getRollerCoasterAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleStraight
entryRuleStraight 
:
{ before(grammarAccess.getStraightRule()); }
	 ruleStraight
{ after(grammarAccess.getStraightRule()); } 
	 EOF 
;

// Rule Straight
ruleStraight
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getStraightAccess().getGroup()); }
(rule__Straight__Group__0)
{ after(grammarAccess.getStraightAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleCorner
entryRuleCorner 
:
{ before(grammarAccess.getCornerRule()); }
	 ruleCorner
{ after(grammarAccess.getCornerRule()); } 
	 EOF 
;

// Rule Corner
ruleCorner
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCornerAccess().getGroup()); }
(rule__Corner__Group__0)
{ after(grammarAccess.getCornerAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleCart
entryRuleCart 
:
{ before(grammarAccess.getCartRule()); }
	 ruleCart
{ after(grammarAccess.getCartRule()); } 
	 EOF 
;

// Rule Cart
ruleCart
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCartAccess().getGroup()); }
(rule__Cart__Group__0)
{ after(grammarAccess.getCartAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSignedInt
entryRuleSignedInt 
:
{ before(grammarAccess.getSignedIntRule()); }
	 ruleSignedInt
{ after(grammarAccess.getSignedIntRule()); } 
	 EOF 
;

// Rule SignedInt
ruleSignedInt
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSignedIntAccess().getGroup()); }
(rule__SignedInt__Group__0)
{ after(grammarAccess.getSignedIntAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__RollerCoaster__BaseQualityAlternatives_4_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRollerCoasterAccess().getBaseQualityWoodKeyword_4_0_0()); }

	'wood' 

{ after(grammarAccess.getRollerCoasterAccess().getBaseQualityWoodKeyword_4_0_0()); }
)

    |(
{ before(grammarAccess.getRollerCoasterAccess().getBaseQualityIronKeyword_4_0_1()); }

	'iron' 

{ after(grammarAccess.getRollerCoasterAccess().getBaseQualityIronKeyword_4_0_1()); }
)

    |(
{ before(grammarAccess.getRollerCoasterAccess().getBaseQualitySteelKeyword_4_0_2()); }

	'steel' 

{ after(grammarAccess.getRollerCoasterAccess().getBaseQualitySteelKeyword_4_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RollerCoaster__TrackAlternatives_7_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRollerCoasterAccess().getTrackStraightParserRuleCall_7_0_0()); }
	ruleStraight
{ after(grammarAccess.getRollerCoasterAccess().getTrackStraightParserRuleCall_7_0_0()); }
)

    |(
{ before(grammarAccess.getRollerCoasterAccess().getTrackCornerParserRuleCall_7_0_1()); }
	ruleCorner
{ after(grammarAccess.getRollerCoasterAccess().getTrackCornerParserRuleCall_7_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Straight__QualityAlternatives_3_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStraightAccess().getQualityWoodKeyword_3_0_0()); }

	'wood' 

{ after(grammarAccess.getStraightAccess().getQualityWoodKeyword_3_0_0()); }
)

    |(
{ before(grammarAccess.getStraightAccess().getQualityIronKeyword_3_0_1()); }

	'iron' 

{ after(grammarAccess.getStraightAccess().getQualityIronKeyword_3_0_1()); }
)

    |(
{ before(grammarAccess.getStraightAccess().getQualitySteelKeyword_3_0_2()); }

	'steel' 

{ after(grammarAccess.getStraightAccess().getQualitySteelKeyword_3_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Corner__DirectionAlternatives_2_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCornerAccess().getDirectionLeftKeyword_2_0_0()); }

	'left' 

{ after(grammarAccess.getCornerAccess().getDirectionLeftKeyword_2_0_0()); }
)

    |(
{ before(grammarAccess.getCornerAccess().getDirectionRightKeyword_2_0_1()); }

	'right' 

{ after(grammarAccess.getCornerAccess().getDirectionRightKeyword_2_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Corner__TypeAlternatives_3_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCornerAccess().getTypeSharp45Keyword_3_0_0()); }

	'sharp45' 

{ after(grammarAccess.getCornerAccess().getTypeSharp45Keyword_3_0_0()); }
)

    |(
{ before(grammarAccess.getCornerAccess().getTypeSharp90Keyword_3_0_1()); }

	'sharp90' 

{ after(grammarAccess.getCornerAccess().getTypeSharp90Keyword_3_0_1()); }
)

    |(
{ before(grammarAccess.getCornerAccess().getTypeEasy45Keyword_3_0_2()); }

	'easy45' 

{ after(grammarAccess.getCornerAccess().getTypeEasy45Keyword_3_0_2()); }
)

    |(
{ before(grammarAccess.getCornerAccess().getTypeEasy90Keyword_3_0_3()); }

	'easy90' 

{ after(grammarAccess.getCornerAccess().getTypeEasy90Keyword_3_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Corner__QualityAlternatives_4_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCornerAccess().getQualityWoodKeyword_4_0_0()); }

	'wood' 

{ after(grammarAccess.getCornerAccess().getQualityWoodKeyword_4_0_0()); }
)

    |(
{ before(grammarAccess.getCornerAccess().getQualityIronKeyword_4_0_1()); }

	'iron' 

{ after(grammarAccess.getCornerAccess().getQualityIronKeyword_4_0_1()); }
)

    |(
{ before(grammarAccess.getCornerAccess().getQualitySteelKeyword_4_0_2()); }

	'steel' 

{ after(grammarAccess.getCornerAccess().getQualitySteelKeyword_4_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Cart__QualityAlternatives_2_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCartAccess().getQualityWoodKeyword_2_0_0()); }

	'wood' 

{ after(grammarAccess.getCartAccess().getQualityWoodKeyword_2_0_0()); }
)

    |(
{ before(grammarAccess.getCartAccess().getQualityIronKeyword_2_0_1()); }

	'iron' 

{ after(grammarAccess.getCartAccess().getQualityIronKeyword_2_0_1()); }
)

    |(
{ before(grammarAccess.getCartAccess().getQualitySteelKeyword_2_0_2()); }

	'steel' 

{ after(grammarAccess.getCartAccess().getQualitySteelKeyword_2_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__RollerCoaster__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RollerCoaster__Group__0__Impl
	rule__RollerCoaster__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RollerCoaster__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRollerCoasterAccess().getRollerCoasterKeyword_0()); }

	'RollerCoaster' 

{ after(grammarAccess.getRollerCoasterAccess().getRollerCoasterKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RollerCoaster__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RollerCoaster__Group__1__Impl
	rule__RollerCoaster__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RollerCoaster__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRollerCoasterAccess().getNameAssignment_1()); }
(rule__RollerCoaster__NameAssignment_1)
{ after(grammarAccess.getRollerCoasterAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RollerCoaster__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RollerCoaster__Group__2__Impl
	rule__RollerCoaster__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RollerCoaster__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRollerCoasterAccess().getSemicolonKeyword_2()); }

	';' 

{ after(grammarAccess.getRollerCoasterAccess().getSemicolonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RollerCoaster__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RollerCoaster__Group__3__Impl
	rule__RollerCoaster__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RollerCoaster__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRollerCoasterAccess().getBaseQualityKeyword_3()); }

	'Base Quality =' 

{ after(grammarAccess.getRollerCoasterAccess().getBaseQualityKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RollerCoaster__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RollerCoaster__Group__4__Impl
	rule__RollerCoaster__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__RollerCoaster__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRollerCoasterAccess().getBaseQualityAssignment_4()); }
(rule__RollerCoaster__BaseQualityAssignment_4)
{ after(grammarAccess.getRollerCoasterAccess().getBaseQualityAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RollerCoaster__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RollerCoaster__Group__5__Impl
	rule__RollerCoaster__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__RollerCoaster__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRollerCoasterAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getRollerCoasterAccess().getSemicolonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RollerCoaster__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RollerCoaster__Group__6__Impl
	rule__RollerCoaster__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__RollerCoaster__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRollerCoasterAccess().getTrackKeyword_6()); }

	'Track =(' 

{ after(grammarAccess.getRollerCoasterAccess().getTrackKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RollerCoaster__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RollerCoaster__Group__7__Impl
	rule__RollerCoaster__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__RollerCoaster__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRollerCoasterAccess().getTrackAssignment_7()); }
(rule__RollerCoaster__TrackAssignment_7)*
{ after(grammarAccess.getRollerCoasterAccess().getTrackAssignment_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RollerCoaster__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RollerCoaster__Group__8__Impl
	rule__RollerCoaster__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__RollerCoaster__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRollerCoasterAccess().getRightParenthesisSemicolonKeyword_8()); }

	');' 

{ after(grammarAccess.getRollerCoasterAccess().getRightParenthesisSemicolonKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RollerCoaster__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RollerCoaster__Group__9__Impl
	rule__RollerCoaster__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__RollerCoaster__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRollerCoasterAccess().getCartsKeyword_9()); }

	'Carts =(' 

{ after(grammarAccess.getRollerCoasterAccess().getCartsKeyword_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RollerCoaster__Group__10
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RollerCoaster__Group__10__Impl
	rule__RollerCoaster__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__RollerCoaster__Group__10__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRollerCoasterAccess().getCartAssignment_10()); }
(rule__RollerCoaster__CartAssignment_10)*
{ after(grammarAccess.getRollerCoasterAccess().getCartAssignment_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RollerCoaster__Group__11
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RollerCoaster__Group__11__Impl
	rule__RollerCoaster__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__RollerCoaster__Group__11__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRollerCoasterAccess().getRightParenthesisSemicolonKeyword_11()); }

	');' 

{ after(grammarAccess.getRollerCoasterAccess().getRightParenthesisSemicolonKeyword_11()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RollerCoaster__Group__12
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RollerCoaster__Group__12__Impl
	rule__RollerCoaster__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__RollerCoaster__Group__12__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRollerCoasterAccess().getDefaultTrackUnitLengthKeyword_12()); }

	'DefaultTrackUnitLength =' 

{ after(grammarAccess.getRollerCoasterAccess().getDefaultTrackUnitLengthKeyword_12()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RollerCoaster__Group__13
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RollerCoaster__Group__13__Impl
	rule__RollerCoaster__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__RollerCoaster__Group__13__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRollerCoasterAccess().getTrackUnitLengthAssignment_13()); }
(rule__RollerCoaster__TrackUnitLengthAssignment_13)
{ after(grammarAccess.getRollerCoasterAccess().getTrackUnitLengthAssignment_13()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RollerCoaster__Group__14
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RollerCoaster__Group__14__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RollerCoaster__Group__14__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRollerCoasterAccess().getSemicolonKeyword_14()); }

	';' 

{ after(grammarAccess.getRollerCoasterAccess().getSemicolonKeyword_14()); }
)

;
finally {
	restoreStackSize(stackSize);
}
































rule__Straight__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Straight__Group__0__Impl
	rule__Straight__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Straight__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStraightAccess().getStraightKeyword_0()); }

	'Straight' 

{ after(grammarAccess.getStraightAccess().getStraightKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Straight__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Straight__Group__1__Impl
	rule__Straight__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Straight__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStraightAccess().getNameAssignment_1()); }
(rule__Straight__NameAssignment_1)
{ after(grammarAccess.getStraightAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Straight__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Straight__Group__2__Impl
	rule__Straight__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Straight__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStraightAccess().getPoweredAssignment_2()); }
(rule__Straight__PoweredAssignment_2)?
{ after(grammarAccess.getStraightAccess().getPoweredAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Straight__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Straight__Group__3__Impl
	rule__Straight__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Straight__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStraightAccess().getQualityAssignment_3()); }
(rule__Straight__QualityAssignment_3)?
{ after(grammarAccess.getStraightAccess().getQualityAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Straight__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Straight__Group__4__Impl
	rule__Straight__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Straight__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStraightAccess().getLengthKeyword_4()); }

	'length =' 

{ after(grammarAccess.getStraightAccess().getLengthKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Straight__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Straight__Group__5__Impl
	rule__Straight__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Straight__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStraightAccess().getLengthAssignment_5()); }
(rule__Straight__LengthAssignment_5)
{ after(grammarAccess.getStraightAccess().getLengthAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Straight__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Straight__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Straight__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStraightAccess().getGroup_6()); }
(rule__Straight__Group_6__0)?
{ after(grammarAccess.getStraightAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__Straight__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Straight__Group_6__0__Impl
	rule__Straight__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Straight__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStraightAccess().getElevationChangeKeyword_6_0()); }

	'elevationChange =' 

{ after(grammarAccess.getStraightAccess().getElevationChangeKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Straight__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Straight__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Straight__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStraightAccess().getElevationChangeAssignment_6_1()); }
(rule__Straight__ElevationChangeAssignment_6_1)
{ after(grammarAccess.getStraightAccess().getElevationChangeAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Corner__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Corner__Group__0__Impl
	rule__Corner__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Corner__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCornerAccess().getCornerKeyword_0()); }

	'Corner' 

{ after(grammarAccess.getCornerAccess().getCornerKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Corner__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Corner__Group__1__Impl
	rule__Corner__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Corner__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCornerAccess().getNameAssignment_1()); }
(rule__Corner__NameAssignment_1)
{ after(grammarAccess.getCornerAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Corner__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Corner__Group__2__Impl
	rule__Corner__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Corner__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCornerAccess().getDirectionAssignment_2()); }
(rule__Corner__DirectionAssignment_2)
{ after(grammarAccess.getCornerAccess().getDirectionAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Corner__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Corner__Group__3__Impl
	rule__Corner__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Corner__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCornerAccess().getTypeAssignment_3()); }
(rule__Corner__TypeAssignment_3)
{ after(grammarAccess.getCornerAccess().getTypeAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Corner__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Corner__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Corner__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCornerAccess().getQualityAssignment_4()); }
(rule__Corner__QualityAssignment_4)?
{ after(grammarAccess.getCornerAccess().getQualityAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Cart__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Cart__Group__0__Impl
	rule__Cart__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cart__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCartAccess().getCartKeyword_0()); }

	'Cart' 

{ after(grammarAccess.getCartAccess().getCartKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Cart__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Cart__Group__1__Impl
	rule__Cart__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Cart__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCartAccess().getNameAssignment_1()); }
(rule__Cart__NameAssignment_1)
{ after(grammarAccess.getCartAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Cart__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Cart__Group__2__Impl
	rule__Cart__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Cart__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCartAccess().getQualityAssignment_2()); }
(rule__Cart__QualityAssignment_2)?
{ after(grammarAccess.getCartAccess().getQualityAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Cart__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Cart__Group__3__Impl
	rule__Cart__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Cart__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCartAccess().getSeatsKeyword_3()); }

	'seats =' 

{ after(grammarAccess.getCartAccess().getSeatsKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Cart__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Cart__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cart__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCartAccess().getSeatNumberAssignment_4()); }
(rule__Cart__SeatNumberAssignment_4)
{ after(grammarAccess.getCartAccess().getSeatNumberAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__SignedInt__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SignedInt__Group__0__Impl
	rule__SignedInt__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedInt__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSignedIntAccess().getSignAssignment_0()); }
(rule__SignedInt__SignAssignment_0)?
{ after(grammarAccess.getSignedIntAccess().getSignAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SignedInt__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SignedInt__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedInt__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSignedIntAccess().getValueAssignment_1()); }
(rule__SignedInt__ValueAssignment_1)
{ after(grammarAccess.getSignedIntAccess().getValueAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Model__RollerCoasterAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getRollerCoasterRollerCoasterParserRuleCall_0()); }
	ruleRollerCoaster{ after(grammarAccess.getModelAccess().getRollerCoasterRollerCoasterParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RollerCoaster__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRollerCoasterAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getRollerCoasterAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RollerCoaster__BaseQualityAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRollerCoasterAccess().getBaseQualityAlternatives_4_0()); }
(rule__RollerCoaster__BaseQualityAlternatives_4_0)
{ after(grammarAccess.getRollerCoasterAccess().getBaseQualityAlternatives_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RollerCoaster__TrackAssignment_7
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRollerCoasterAccess().getTrackAlternatives_7_0()); }
(rule__RollerCoaster__TrackAlternatives_7_0)
{ after(grammarAccess.getRollerCoasterAccess().getTrackAlternatives_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RollerCoaster__CartAssignment_10
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRollerCoasterAccess().getCartCartParserRuleCall_10_0()); }
	ruleCart{ after(grammarAccess.getRollerCoasterAccess().getCartCartParserRuleCall_10_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RollerCoaster__TrackUnitLengthAssignment_13
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRollerCoasterAccess().getTrackUnitLengthINTTerminalRuleCall_13_0()); }
	RULE_INT{ after(grammarAccess.getRollerCoasterAccess().getTrackUnitLengthINTTerminalRuleCall_13_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Straight__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStraightAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getStraightAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Straight__PoweredAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStraightAccess().getPoweredPoweredKeyword_2_0()); }
(
{ before(grammarAccess.getStraightAccess().getPoweredPoweredKeyword_2_0()); }

	'powered' 

{ after(grammarAccess.getStraightAccess().getPoweredPoweredKeyword_2_0()); }
)

{ after(grammarAccess.getStraightAccess().getPoweredPoweredKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Straight__QualityAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStraightAccess().getQualityAlternatives_3_0()); }
(rule__Straight__QualityAlternatives_3_0)
{ after(grammarAccess.getStraightAccess().getQualityAlternatives_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Straight__LengthAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStraightAccess().getLengthINTTerminalRuleCall_5_0()); }
	RULE_INT{ after(grammarAccess.getStraightAccess().getLengthINTTerminalRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Straight__ElevationChangeAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStraightAccess().getElevationChangeSignedIntParserRuleCall_6_1_0()); }
	ruleSignedInt{ after(grammarAccess.getStraightAccess().getElevationChangeSignedIntParserRuleCall_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Corner__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCornerAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getCornerAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Corner__DirectionAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCornerAccess().getDirectionAlternatives_2_0()); }
(rule__Corner__DirectionAlternatives_2_0)
{ after(grammarAccess.getCornerAccess().getDirectionAlternatives_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Corner__TypeAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCornerAccess().getTypeAlternatives_3_0()); }
(rule__Corner__TypeAlternatives_3_0)
{ after(grammarAccess.getCornerAccess().getTypeAlternatives_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Corner__QualityAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCornerAccess().getQualityAlternatives_4_0()); }
(rule__Corner__QualityAlternatives_4_0)
{ after(grammarAccess.getCornerAccess().getQualityAlternatives_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Cart__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCartAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getCartAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Cart__QualityAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCartAccess().getQualityAlternatives_2_0()); }
(rule__Cart__QualityAlternatives_2_0)
{ after(grammarAccess.getCartAccess().getQualityAlternatives_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Cart__SeatNumberAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCartAccess().getSeatNumberINTTerminalRuleCall_4_0()); }
	RULE_INT{ after(grammarAccess.getCartAccess().getSeatNumberINTTerminalRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SignedInt__SignAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSignedIntAccess().getSignHyphenMinusKeyword_0_0()); }
(
{ before(grammarAccess.getSignedIntAccess().getSignHyphenMinusKeyword_0_0()); }

	'-' 

{ after(grammarAccess.getSignedIntAccess().getSignHyphenMinusKeyword_0_0()); }
)

{ after(grammarAccess.getSignedIntAccess().getSignHyphenMinusKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SignedInt__ValueAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSignedIntAccess().getValueINTTerminalRuleCall_1_0()); }
	RULE_INT{ after(grammarAccess.getSignedIntAccess().getValueINTTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


