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
	
	// Get the quality of a single track piece, or a cart
	// Convert text quality to numeric and if nothing provided get rc base quality
	def static getQuality (RollerCoaster rc, Object trackPiece) {
		
		val qual = switch (trackPiece) {
			
			Straight: {
				trackPiece.quality;
			} Corner : {
				trackPiece.quality;
			} Cart: {
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
	
	def static getCornerGRaiting (Corner c){
		
		switch (c.type){
			String case "easy90" :  2
			String case "easy45": 1
			String case "sharp90": 4
			String case "sharp45": 3
		}
		
	}
	
	def static getCornerGForce(RollerCoaster rc, int currentSpeed, Corner corner){
		
		// Quality Factor = corner quality + cart quality
		val qualityFactor = RollerCoasterInfo.getQuality(rc,corner) + RollerCoasterInfo.getQuality(rc, corner);
		val cornerType = RollerCoasterInfo.getCornerGRaiting(corner);
		
		(currentSpeed / qualityFactor) * cornerType;
	}
	
	// Max speed, based of has power method
	def static getMaxGForce(RollerCoaster rc){
		
		var speed = 0;
		var maxGForce = 0;
		
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
								

				}
				
				Corner: {
					
					val gForce = getCornerGForce(rc, speed, s);
					
					if (gForce > maxGForce){
						maxGForce = gForce;
					}
				}
			}
		}
		
		return maxGForce;
	}
	
	// Max speed, based of has power method
	def static getMaxSpeed(RollerCoaster rc){
		
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
	
	def static getTrackConstructionCost(RollerCoaster rc){
		var cost = 0;
		for(Object s: rc.track){
		switch (s) {
				
				Straight: {
					cost = cost + getQuality(rc, s)*s.length*75;
				}
				Corner:{
					cost = cost + getQuality(rc, s)*rc.trackUnitLength*75;
				}
			}
		}
		return cost;
	}
	
	def static getCartConstructionCost(RollerCoaster rc){
		var cost = 0;
		for(Cart s: rc.cart){

			cost = cost + getQuality(rc, s)*s.seatNumber*500;

		}
		return cost;
	}
	
		def static getRunningCost(RollerCoaster rc){
		var cost = 0;
		for(Cart s: rc.cart){
			cost = cost + getQuality(rc, s)*s.seatNumber;
		}
		for(Object s: rc.track){
		switch (s) {
				Straight: {
					cost = cost + getQuality(rc, s)*s.length/150;
				}
				Corner:{
					cost = cost + getQuality(rc, s)*rc.trackUnitLength/150;
				}
			}
		}
		return cost;
	}
	
	def static getProfitPerRun(RollerCoaster rc){
		var profit = 0;
		for(Cart s: rc.cart){
			profit = profit + (s.seatNumber*rc.ticketPrice);
		}
		return profit;
	}
	
}