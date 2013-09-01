package org.rollercoaster.utils

import org.eclipse.emf.ecore.EObject
import org.xtext.rollercoaster.dsl.coaster.Straight
import org.xtext.rollercoaster.dsl.coaster.Corner
import org.xtext.rollercoaster.dsl.coaster.Cart

/**
 * Factory to pull description information about each object
 */
class Descriptions {
	
	/**
	 * Takes in a modeling object and returns the long description
	 */
	def static getLong(EObject object){
		
		// Table of item descriptions
		switch object {
			Straight: "A lovely straight piece of track"
			Corner: "A curvey corner piece of track"
			Cart: "A cart that goes on the track"
			default: "indescribable"
		}
		
	}
	
	/**
	 * Takes in a modeling object and returns the short description
	 */
	def static getShort(EObject object){
		
		// Table of item names
		switch object {
			Straight: "Straight Track"
			Corner: "Corner Track"
			Cart: "Cart"
			default: "Indescribable"
		}
		
	}
	
}