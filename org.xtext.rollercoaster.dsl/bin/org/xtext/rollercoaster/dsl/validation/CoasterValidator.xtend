/*
 * generated by Xtext
 */
package org.xtext.rollercoaster.dsl.validation

import org.xtext.rollercoaster.dsl.coaster.RollerCoaster
import org.eclipse.xtext.validation.Check
import org.xtext.rollercoaster.dsl.coaster.CoasterPackage
import org.xtext.rollercoaster.dsl.coaster.Corner
import org.xtext.rollercoaster.dsl.coaster.Straight
import org.xtext.rollercoaster.dsl.coaster.Cart
import org.rollercoaster.utils.RollerCoasterInfo

//import org.eclipse.xtext.validation.Check

/**
 * Custom validation rules. 
 *		
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class CoasterValidator extends AbstractCoasterValidator {


@Check
def checkCompletePath(RollerCoaster rc){
	var totalAngle = 0;
	for(Corner t: rc.track.filter(Corner)){
			var dir = 1;
		if(t.direction.equals('left')){
			dir = -1;
		}
		if(t.type.equals('sharp45')||t.type.equals('easy45')){
				totalAngle = totalAngle + (45*dir);
			}
		else{
				totalAngle = totalAngle + (90*dir);
			}
		}
		
	if(totalAngle%360 != 0){
		warning("Track angles do not form a cycle! "+totalAngle%360+" degrees from a cycle.", CoasterPackage.Literals.ROLLER_COASTER.getEStructuralFeature("track"));
	}
	//println("totalAngle = "+totalAngle);
}

@Check
def checkStartMeetsEnd(RollerCoaster rc){
	var distance = 0.0;
	var currentX = 0.0;
	var currentY = 0.0;
	var currentAngle = 0.0;
	for(Object t: rc.track){
		var Corner c = null;
			var Straight s = null;
		switch (t) {
			Corner:  c = t
			Straight: s =t
		}
	// It's a Corner
		if(c != null){
			var dir = 1.0;
			var angle = 0.0;
			if(c.direction.equals('left')){
			dir = -1;
			}
		   if(c.type.equals('sharp45')||c.type.equals('easy45')){
				angle = Math.toRadians((22.5*dir));
			}
			else{
				angle = Math.toRadians((45*dir));
			}
			var r = rc.trackUnitLength;
			if(c.type.equals('sharp45')){
				currentX = (currentX + (Math.cos(currentAngle+angle)*Math.sqrt((Math.pow(r/2.0,2)+Math.pow(r,2)))));
				currentY = (currentY + (Math.sin(currentAngle+angle)*Math.sqrt((Math.pow(r/2.0,2)+Math.pow(r,2)))));
			}
			else if(c.type.equals('sharp90')){
				currentX = (currentX + Math.cos(currentAngle+angle)*Math.sqrt((Math.pow(r/2.0,2)+Math.pow(r/2.0,2))));
				currentY = (currentY + Math.sin(currentAngle+angle)*Math.sqrt((Math.pow(r/2.0,2)+Math.pow(r/2.0,2))));
				
			}
			else if(c.type.equals('easy45')){
				currentX = (currentX + (Math.cos(currentAngle+angle)*Math.sqrt((Math.pow(r,2)+Math.pow(r*2,2)))));
				currentY = (currentY + (Math.sin(currentAngle+angle)*Math.sqrt((Math.pow(r,2)+Math.pow(r*2,2)))));
			}
			else if(c.type.equals('easy90')){
				currentX = (currentX + (Math.cos(currentAngle+angle)*Math.sqrt((Math.pow(r,2)+Math.pow(r,2)))));
				currentY = (currentY + (Math.sin(currentAngle+angle)*Math.sqrt((Math.pow(r,2)+Math.pow(r,2)))));
			}
			
			currentAngle = currentAngle+(angle*2);
		}
		// ITs a straight
		else if (s != null){
			currentX = (currentX + (Math.cos(currentAngle)*s.length));
			currentY = (currentY + (Math.sin(currentAngle)*s.length));
			
		}
	}
	distance = Math.sqrt(Math.pow(currentX, 2) + Math.pow(currentY, 2));
	
	if( distance >= 0.5){
		warning("End of Track does not meet start! End of track is"+(distance.intValue+1)+"m from the start.", CoasterPackage.Literals.ROLLER_COASTER.getEStructuralFeature("track"));
	}
}

@Check
def elevationMeetsAtStartAndEnd(RollerCoaster rc){
	var elevation = 0;
	for(Object t: rc.track){
		
		var Corner c = null;
		var Straight s = null;
		switch (t) {
			Corner:  c = t
			Straight: s =t
		}

				println(c+">>"+s);

		if(s != null && s.elevationChange != null){
			println("first val: "+s.elevationChange.value+" track:"+s.name);
			var change = s.elevationChange.value;
			println("1");
			if(s.elevationChange.sign != null){
				change = change * -1;
			}
			println("2");
			elevation = elevation + change;
			println("3");
		}
		println("4");
		}
		println("5");
		println("final elevation: "+elevation);
		if(elevation != 0){
			warning("End of Track does not meet start! Height of last track unit is "+(elevation)+"m from start.", CoasterPackage.Literals.ROLLER_COASTER.getEStructuralFeature("track"));
		}
}

	@Check
	def hasEnoughPower(RollerCoaster rc){
		
		var speed = 0;
		
		for(Object t: rc.track){
			
			switch (t) {
				
				Corner: {
					checkSpeedOnCurve(rc, t, speed);
				} 
				
				Straight: {
					
					val quality = RollerCoasterInfo.getQuality(rc, t);
					
					//if straight is powered
					if(t.powered != null){
						
						var temp = RollerCoasterInfo.getTotalWeight(rc) / (quality * 100);
						speed = speed + (t.length * quality ) / temp; //fine tune
					}
					
					// If there is an elevation change.
					if(t.elevationChange != null){
						var change = t.elevationChange.value/2;
						//downhill
						if (t.elevationChange.sign != null){
							speed = speed + (change *  t.length *quality); //weight has no effect going downhill
						}
					 // uphill
						else {
							change = change * -1;
							
							var temp = RollerCoasterInfo.getTotalWeight(rc) / (quality * 1000);
							speed = speed + (change *  t.length/quality)-temp;
						}
					}
					
					//on flat slowly decrease
					else {
						speed = speed - t.length/(quality*10);
					} //weight has no effect on the flat 
									
					checkSpeedOnStraights(rc, t, speed);
					
					if (speed <= 0){
						warning("Cart is moving backwards or stopped on Track: "+(t.name)+", add powered units or downhill slopes.", CoasterPackage.Literals.ROLLER_COASTER.getEStructuralFeature("track"));
					}
				}
			}
		}
	}

	def getTotalWeight(RollerCoaster rc){
		RollerCoasterInfo.getTotalWeight(rc);
	}

	def checkSpeedOnStraights(RollerCoaster rc, Straight s, int speed){
		
		for(Cart c: rc.cart){
			
			val cartQuality = RollerCoasterInfo.getQuality(rc, c);
			var qualityFactor = RollerCoasterInfo.getQuality(rc, s) + cartQuality;
		
			if(speed/qualityFactor > 75){
				warning("Cart "+ c.name +" has been destroyed due to the excessive speed of "+speed+"kph on Track: "+s.name+", please improve quality of track or cart or reduce speed.", CoasterPackage.Literals.ROLLER_COASTER.getEStructuralFeature("track"));		
			}
			
		}
	}

	def checkSpeedOnCurve(RollerCoaster rc, Corner corner, int speed){
		for(Cart c: rc.cart){
			
			val gforce = RollerCoasterInfo.getCornerGForce(rc, speed, corner);
		
			if(gforce > 100){ 
				warning("Cart " + c.name + " has left the track due the excessive speed of " +speed+ "kph on Corner: "+corner.name+", please improve quality of track or cart or reduce speed.", CoasterPackage.Literals.ROLLER_COASTER.getEStructuralFeature("track"));
			}
		}
	}
	

}



