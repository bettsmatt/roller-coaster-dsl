package org.rollercoaster.utils

import org.eclipse.emf.ecore.EObject
import org.xtext.rollercoaster.dsl.coaster.Straight
import org.xtext.rollercoaster.dsl.coaster.Corner
import org.xtext.rollercoaster.dsl.coaster.Cart

/**
 * Factory to pull cost information about each object
 */
class Costs {
	
	/**
	 * Takes in a modeling object and returns the cost information
	 */
	def static get(EObject object){
		
		// Table of item costs
		switch object {
			Straight: 20.0
			Corner: 10.0
			Cart: 5.0
			default:0.0
		}
		
	}
	
}