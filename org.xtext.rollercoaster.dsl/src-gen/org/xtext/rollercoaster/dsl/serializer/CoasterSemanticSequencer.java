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
import org.xtext.rollercoaster.dsl.coaster.Model;
import org.xtext.rollercoaster.dsl.coaster.RollerCoaster;
import org.xtext.rollercoaster.dsl.coaster.SignedInt;
import org.xtext.rollercoaster.dsl.coaster.Track;
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
			case CoasterPackage.TRACK:
				if(context == grammarAccess.getTrackRule()) {
					sequence_Track(context, (Track) semanticObject); 
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
	 *     rollerCoaster+=RollerCoaster
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID track+=Track* cart+=Cart*)
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
	 *     (name=ID length=INT elevationChange=INT? angle=SignedInt?)
	 */
	protected void sequence_Track(EObject context, Track semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
