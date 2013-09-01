/*
 * generated by Xtext
 */
package org.xtext.rollercoaster.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtext.rollercoaster.dsl.coaster.RollerCoaster
import java.util.Date
import org.eclipse.emf.ecore.EObject
import org.xtext.rollercoaster.dsl.coaster.Straight
import org.xtext.rollercoaster.dsl.coaster.Corner
import org.rollercoaster.utils.Costs
import org.rollercoaster.utils.Descriptions


/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class CoasterGenerator implements IGenerator {
	
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
	
		resource.allContents.toIterable.filter(RollerCoaster).forEach[ rc | 
			fsa.generateFile(rc.name + ".html", genReport(rc));
		]
		
	}
	
	/**
	 * Generate an html report of the coasters stats
	 * For starting off this is going to include the 
	 * 	Max Speed
	 * 	Cost
	 * 	Fun
	 * 	Name
	 */	
	def genReport (RollerCoaster rc)
	
		'''
		<html>
			<body>
				<h4>Roller Coaster report for the « rc.name » roller coaster on the  « new Date() »</h4>
				<p>Number of Pieces of track 	: « rc.track.length »</p>
				<p>Number of Carts 				: « rc.cart.length»</p>
				<h4>Itemized Cost of Track</h4>
				<ul> 
					« val listOfStraight = rc.track.filter[t | t instanceof Straight ]»
					« IF listOfStraight.length > 0 »
						« val head = listOfStraight.head »
						<li> « Descriptions.getShort(head) » : « Costs.get(head) » * « listOfStraight.length » : « Costs.get(head) * listOfStraight.length » </li>
					« ENDIF »
					
					« val listOfCorner = rc.track.filter[t | t instanceof Corner ]»
					« IF listOfCorner.length > 0 »
						« val head = listOfCorner.head »
						<li> « Descriptions.getShort(head) » : « Costs.get(head) » * « listOfCorner.length » : « Costs.get(head) * listOfCorner.length » </li>
					« ENDIF »
					
					<li> Total Track Cost : «rc.track.fold(0.00)[seed,item | seed + Costs.get(item)]»</li>
					
				</ul>
				
				<h4>Itemized Cost of Carts</h4> 
				<ul> 
					« FOR o: rc.cart »
						<li> « Descriptions.getShort(o) » : « Costs.get(o) » </li>
					« ENDFOR »
					<li> Total : «rc.cart.fold(0.00)[seed,item | seed + Costs.get(item)]»</li>
				</ul>
				<h4> Sample rendering of the track </h4>
  				« getPathForTrack (rc)»
			</body>
		</html>	
		'''

	/**
	 * Build a svg path from a list of tracks
	 */
	def getPathForTrack (RollerCoaster rc){
		// The start of the svg
		var tracks = rc.track;
		val start = '''<svg width="2000px" height="2000px" version="1.1" xmlns="http://www.w3.org/2000/svg"> '''
		val pathStart = '''<path d=" M 400 300 '''
		
		var path = "";
		
		// Track the current angle of the track as it changes 
		var currentAngle = 0.0;
		
		for(EObject trackPiece : tracks){
			
			// Find out what type of track we are dealing with
			path = path + switch trackPiece {
		
				/*
				 * Straight Track
				 */
				Straight: {
					
					// Calculate the end position
					val length = trackPiece.length;
					
					// Project in the current direction
					val endX = Math.sin(Math.toRadians(currentAngle)) *  length;
					val endY = Math.cos(Math.toRadians(currentAngle)) *  length;
					
					" l " + endX + " " +endY;
					
				}
				
				/*
				 * Cornered Track
				 */
				Corner: {
				
					// For now with all corners we are going to fix arc size at 100.
					var arcSize = " 0 0 ";
					
					// -1 for anti-clockwise and 1 for clockwise
					val modifier = switch trackPiece.direction {
						case 'left': -1 
						case 'right': 1
					};
					
					// Flags for the direction of the arc
					val flags = switch trackPiece.direction {
						case 'left':  " 0 0 1 "
						case 'right': " 0 0 0 "
					}
	
					// Work out where the curve will end up
					var x = 0;
					var y = 0;
					var angle = 0.0;
				
					var r = rc.trackUnitLength
					switch trackPiece.type {
						case 'sharp45': {
							x = r/2;//25;
							y = r;//50; // Possibly break
							angle = 22.5;
							arcSize = " "+y+" "+y+" ";
						} case 'sharp90': {
							x = r/2;//50;
							y = r/2;//50;
							angle = 45;
							arcSize = " "+y+" "+y+" ";
						} case 'easy45': {
							x = r/2;//50;
							y = r;//100;
							angle = 22.5;
							arcSize = " "+y+" "+y+" ";
						} case 'easy90': {
							x = r;//100;
							y = r;//100;
							angle = 45;
							arcSize = " "+y+" "+y+" ";
						}
					}
					
					// Rotate end points around the current angle, the modifier controls the direction
					val endX = Math.sin(Math.toRadians((modifier * angle) + currentAngle)) *  Math.sqrt(x * x + y * y);
					val endY = Math.cos(Math.toRadians((modifier * angle) + currentAngle)) *  Math.sqrt(x * x + y * y);
					
					// Update the coasters angle
					currentAngle = currentAngle + (angle * 2 * modifier);
					
					// Return the arc
					" a " + arcSize + " "+ flags + " " + endX + " " + endY + " ";
					
				}
				
			}

		}

		val pathEnd = '''"stroke="black" fill="transparent"/>'''
		
		// Closing of the path tag			
		var end = '''</svg>'''
		
		// Build the path with enclosing svg 
		start + pathStart + path + pathEnd + end;
		
	}
}
	
	

//	/**
//	 * Example to generate a java program to print all the tracks
//	 */
//	def compile (Iterable <Track> tracks) 
//	
//	''' 
//	public class Track { 
//	
//	String name,corner,slope;
//	
//	public Track (String name, String corner) {
//	this.name = name;
//	this.corner = corner;
//	}
//	
//	public String toString (){
//		return "I am a track with the name"+ this.name + ", with a corner of " +this.corner;
//	}
//	
//	public static void main(String[]args){
//		
//		Track t = null;
//		
//«FOR t:tracks»
// 	t = new Track("«t.name»" «IF t.angle != null» "«t.angle»" «ELSE» "NO ANGLE" «ENDIF»);
// 	System.out.println(t);
//«ENDFOR»
//  		
//  		System.out.println("Thoes are all the tracks");
//	}
//}
//	'''
//}

