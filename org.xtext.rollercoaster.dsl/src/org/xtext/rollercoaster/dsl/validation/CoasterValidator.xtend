/*
 * generated by Xtext
 */
package org.xtext.rollercoaster.dsl.validation

import org.xtext.rollercoaster.dsl.coaster.RollerCoaster
import org.eclipse.xtext.validation.Check
import org.xtext.rollercoaster.dsl.coaster.CoasterPackage
import org.xtext.rollercoaster.dsl.coaster.Corner
import org.xtext.rollercoaster.dsl.coaster.Straight

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
		error("Track angles do not form a cycle! "+totalAngle%360+" degrees from a cycle.", CoasterPackage.Literals.ROLLER_COASTER.getEStructuralFeature("track"));
	}
	println("totalAngle = "+totalAngle);
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
		//println(currentX+">>"+currentY);
	}
	distance = Math.sqrt(Math.pow(currentX, 2) + Math.pow(currentY, 2));
	
	if( distance >= 0.5){
		error("End of Track does not meet start! End of track is"+(distance.intValue+1)+"m from the start.", CoasterPackage.Literals.ROLLER_COASTER.getEStructuralFeature("track"));
	}
}
	
	
	
}

