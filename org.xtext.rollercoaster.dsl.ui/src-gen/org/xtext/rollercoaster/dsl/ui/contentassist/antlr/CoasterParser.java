/*
* generated by Xtext
*/
package org.xtext.rollercoaster.dsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.rollercoaster.dsl.services.CoasterGrammarAccess;

public class CoasterParser extends AbstractContentAssistParser {
	
	@Inject
	private CoasterGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.rollercoaster.dsl.ui.contentassist.antlr.internal.InternalCoasterParser createParser() {
		org.xtext.rollercoaster.dsl.ui.contentassist.antlr.internal.InternalCoasterParser result = new org.xtext.rollercoaster.dsl.ui.contentassist.antlr.internal.InternalCoasterParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getRollerCoasterAccess().getBaseQualityAlternatives_4_0(), "rule__RollerCoaster__BaseQualityAlternatives_4_0");
					put(grammarAccess.getRollerCoasterAccess().getTrackAlternatives_7_0(), "rule__RollerCoaster__TrackAlternatives_7_0");
					put(grammarAccess.getStraightAccess().getQualityAlternatives_3_0(), "rule__Straight__QualityAlternatives_3_0");
					put(grammarAccess.getCornerAccess().getDirectionAlternatives_2_0(), "rule__Corner__DirectionAlternatives_2_0");
					put(grammarAccess.getCornerAccess().getTypeAlternatives_3_0(), "rule__Corner__TypeAlternatives_3_0");
					put(grammarAccess.getCornerAccess().getQualityAlternatives_4_0(), "rule__Corner__QualityAlternatives_4_0");
					put(grammarAccess.getCartAccess().getQualityAlternatives_2_0(), "rule__Cart__QualityAlternatives_2_0");
					put(grammarAccess.getRollerCoasterAccess().getGroup(), "rule__RollerCoaster__Group__0");
					put(grammarAccess.getStraightAccess().getGroup(), "rule__Straight__Group__0");
					put(grammarAccess.getStraightAccess().getGroup_6(), "rule__Straight__Group_6__0");
					put(grammarAccess.getCornerAccess().getGroup(), "rule__Corner__Group__0");
					put(grammarAccess.getCartAccess().getGroup(), "rule__Cart__Group__0");
					put(grammarAccess.getSignedIntAccess().getGroup(), "rule__SignedInt__Group__0");
					put(grammarAccess.getModelAccess().getRollerCoasterAssignment(), "rule__Model__RollerCoasterAssignment");
					put(grammarAccess.getRollerCoasterAccess().getNameAssignment_1(), "rule__RollerCoaster__NameAssignment_1");
					put(grammarAccess.getRollerCoasterAccess().getBaseQualityAssignment_4(), "rule__RollerCoaster__BaseQualityAssignment_4");
					put(grammarAccess.getRollerCoasterAccess().getTrackAssignment_7(), "rule__RollerCoaster__TrackAssignment_7");
					put(grammarAccess.getRollerCoasterAccess().getCartAssignment_10(), "rule__RollerCoaster__CartAssignment_10");
					put(grammarAccess.getRollerCoasterAccess().getTicketPriceAssignment_13(), "rule__RollerCoaster__TicketPriceAssignment_13");
					put(grammarAccess.getRollerCoasterAccess().getTrackUnitLengthAssignment_16(), "rule__RollerCoaster__TrackUnitLengthAssignment_16");
					put(grammarAccess.getStraightAccess().getNameAssignment_1(), "rule__Straight__NameAssignment_1");
					put(grammarAccess.getStraightAccess().getPoweredAssignment_2(), "rule__Straight__PoweredAssignment_2");
					put(grammarAccess.getStraightAccess().getQualityAssignment_3(), "rule__Straight__QualityAssignment_3");
					put(grammarAccess.getStraightAccess().getLengthAssignment_5(), "rule__Straight__LengthAssignment_5");
					put(grammarAccess.getStraightAccess().getElevationChangeAssignment_6_1(), "rule__Straight__ElevationChangeAssignment_6_1");
					put(grammarAccess.getCornerAccess().getNameAssignment_1(), "rule__Corner__NameAssignment_1");
					put(grammarAccess.getCornerAccess().getDirectionAssignment_2(), "rule__Corner__DirectionAssignment_2");
					put(grammarAccess.getCornerAccess().getTypeAssignment_3(), "rule__Corner__TypeAssignment_3");
					put(grammarAccess.getCornerAccess().getQualityAssignment_4(), "rule__Corner__QualityAssignment_4");
					put(grammarAccess.getCartAccess().getNameAssignment_1(), "rule__Cart__NameAssignment_1");
					put(grammarAccess.getCartAccess().getQualityAssignment_2(), "rule__Cart__QualityAssignment_2");
					put(grammarAccess.getCartAccess().getSeatNumberAssignment_4(), "rule__Cart__SeatNumberAssignment_4");
					put(grammarAccess.getSignedIntAccess().getSignAssignment_0(), "rule__SignedInt__SignAssignment_0");
					put(grammarAccess.getSignedIntAccess().getValueAssignment_1(), "rule__SignedInt__ValueAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.rollercoaster.dsl.ui.contentassist.antlr.internal.InternalCoasterParser typedParser = (org.xtext.rollercoaster.dsl.ui.contentassist.antlr.internal.InternalCoasterParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public CoasterGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CoasterGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
