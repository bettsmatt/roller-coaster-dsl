package org.rollercoaster.utils

import org.xtext.rollercoaster.dsl.coaster.RollerCoaster
import org.xtext.rollercoaster.dsl.coaster.Cart
import org.xtext.rollercoaster.dsl.coaster.Straight
import org.xtext.rollercoaster.dsl.coaster.Corner

/**
 * Find out some interesting facts about the roller coaster
 * Used for common statistics needed for validation and generating reports.
 * 
 */
class RollerCoasterInfo {

	/**
	 * Weight of roller coaster carts
	 */ 
	def static getTotalWeight(RollerCoaster rc){
		
		var totalWeight = 0;
		for(Cart c: rc.cart){
			totalWeight = totalWeight + c.seatNumber*120 + 250;
		}
		
		return totalWeight;

	}
	
	// Get the quality of a single track piece
	def static getQuality (RollerCoaster rc, Object trackPiece) {
		
		val qual = switch (trackPiece) {
			
			Straight: {
				trackPiece.quality;
			} Corner : {
				trackPiece.quality;
			}
		}
		
		switch (qual) {
			String case "wood" :  1
			String case "iron": 2
			String case "steel": 3
			default: switch (rc.baseQuality) {
				String case "wood" :  1
				String case "iron": 2
				String case "steel": 3
			}
		
		}
		
	}
	
	// Max speed, based of has power method
	def getMaxSpeed(RollerCoaster rc){
		
		var speed = 0;
		var maxSpeed = 0;
		
		for(Object s: rc.track){
		
			switch (s) {
				
				Straight: {
					
					val quality = getQuality(rc, s);
			
					//if straight is powered
					if(s.powered != null){
						
						var temp = getTotalWeight(rc)/(quality*100);
						speed = speed + (s.length*quality)/temp; //fine tune
					}
					
					// If there is an elevation change.
					if(s.elevationChange != null){
						var change = s.elevationChange.value/2;
						//downhill
						if(s.elevationChange.sign != null){
							speed = speed + (change *  s.length *quality); //weight has no effect going downhill
						}
					 // uphill
						else {
							change = change * -1;
							
							var temp = getTotalWeight(rc)/(quality*1000);
							speed = speed + (change *  s.length/quality)-temp;
						}
					}
					//on flat slowly decrease
					else{
						speed = speed - s.length / ( quality * 10 );
					} //weight has no effect on the flat 
								
					if (speed > maxSpeed){
						maxSpeed = speed;
					}
				}
			}
		}
		
		return maxSpeed;
	}
	
}