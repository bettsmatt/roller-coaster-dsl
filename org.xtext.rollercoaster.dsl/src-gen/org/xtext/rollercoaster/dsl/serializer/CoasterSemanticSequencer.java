package org.xtext.rollercoaster.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.rollercoaster.dsl.coaster.Cart;
import org.xtext.rollercoaster.dsl.coaster.CoasterPackage;
import org.xtext.rollercoaster.dsl.coaster.Corner;
import org.xtext.rollercoaster.dsl.coaster.Model;
import org.xtext.rollercoaster.dsl.coaster.RollerCoaster;
import org.xtext.rollercoaster.dsl.coaster.SignedInt;
import org.xtext.rollercoaster.dsl.coaster.Straight;
import org.xtext.rollercoaster.dsl.services.CoasterGrammarAccess;

@SuppressWarnings("all")
public class CoasterSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CoasterGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CoasterPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CoasterPackage.CART:
				if(context == grammarAccess.getCartRule()) {
					sequence_Cart(context, (Cart) semanticObject); 
					return; 
				}
				else break;
			case CoasterPackage.CORNER:
				if(context == grammarAccess.getCornerRule()) {
					sequence_Corner(context, (Corner) semanticObject); 
					return; 
				}
				else break;
			case CoasterPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case CoasterPackage.ROLLER_COASTER:
				if(context == grammarAccess.getRollerCoasterRule()) {
					sequence_RollerCoaster(context, (RollerCoaster) semanticObject); 
					return; 
				}
				else break;
			case CoasterPackage.SIGNED_INT:
				if(context == grammarAccess.getSignedIntRule()) {
					sequence_SignedInt(context, (SignedInt) semanticObject); 
					return; 
				}
				else break;
			case CoasterPackage.STRAIGHT:
				if(context == grammarAccess.getStraightRule()) {
					sequence_Straight(context, (Straight) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Cart(EObject context, Cart semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CoasterPackage.Literals.CART__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoasterPackage.Literals.CART__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCartAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (direction='left' | direction='right') (type='sharp45' | type='sharp90' | type='easy45' | type='easy90'))
	 */
	protected void sequence_Corner(EObject context, Corner semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     rollerCoaster+=RollerCoaster
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (track+=Straight | track+=Corner)* cart+=Cart* trackUnitLength=INT)
	 */
	protected void sequence_RollerCoaster(EObject context, RollerCoaster semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sign='-'? value=INT)
	 */
	protected void sequence_SignedInt(EObject context, SignedInt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID length=INT elevationChange=INT?)
	 */
	protected void sequence_Straight(EObject context, Straight semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
