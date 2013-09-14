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
import org.rollercoaster.utils.RollerCoasterInfo

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
	def genReport (RollerCoaster rc) {
	
		// Set up basic structure of the report
		// A title and brief introduction
		// Two columns,  
		//		Preview
		//		Statistics
		// Then a table of costs.
		var report = '''
			
			<div class="row"> ''' + genTitle(rc) +'''</div> 
			
			<div class="row">
  				<div class="col-md-6">''' + getPathForTrack(rc) + '''</div>
  				<div class="col-md-6"> ''' + genSummary (rc) +'''</div>
			</div>
			
			<div class="row"> ''' + genFinincial (rc) +'''</div> 
		
		''';
		/*
		var reportContent = '''
		<h4>Roller Coaster report for the « rc.name » roller coaster on the  « new Date() »</h4>
		<p>Number of Pieces of track 	: « rc.track.length»</p>
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
		'''
		 */
		// Add this HTML into the bootstrap template
		return addIntoBootstrapTemplate(report);
		
	}
	
	/**
	 * Generate the title information
	 */
	def genTitle (RollerCoaster rc){
		
		'''<h1> ''' + rc.name + '''</h1>''' +
		'''<p> '''  +  '''Roller Coaster Report''' + '''</p>'''
		
	}

	def genSummary (RollerCoaster rc){
		
		val pieces =  rc.track.length;
		val carts = rc.cart.length;
		val speed = RollerCoasterInfo.getMaxSpeed(rc);
		val cartWeight = RollerCoasterInfo.getTotalWeight(rc);
		val gForce = RollerCoasterInfo.getMaxGForce(rc);
			
		'''
		<h1> Summary </h1>
		<ul class="list-group">
			<li class="list-group-item">''' + pieces + ''' pieces of track </li>
			<li class="list-group-item">''' + carts + ''' carts </li>
			<li class="list-group-item">''' + speed + ''' max speed</li>
			<li class="list-group-item">''' + cartWeight + ''' cart weight</li>
			<li class="list-group-item">''' + gForce + ''' gforces </li>
		</ul>
		'''
	}
	
	def genFinincial (RollerCoaster rc){
		'''Finincials Goes Here'''
	}

	/**
	 * Build a svg path from a list of tracks
	 */
	def getPathForTrack (RollerCoaster rc){
		// The start of the svg
		var tracks = rc.track;
		val start = '''<svg width="100%" height="400px" version="1.1" xmlns="http://www.w3.org/2000/svg"> '''
		val zeroZeroPoint = '''<circle xmlns="http://www.w3.org/2000/svg" cx="100" cy="100" r="4" fill="#ff0000" stroke="#000000" stroke-width="2"/>'''
		val pathStart = '''<path d=" M 100 100 '''
		
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
						case 'left': 1 
						case 'right': -1
					};
					
					// Flags for the direction of the arc
					val flags = switch trackPiece.direction {
						case 'left':  " 0 0 0 "
						case 'right': " 0 0 1 "
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
		start + zeroZeroPoint + pathStart + path + pathEnd + end;
		
	}
	
	/**
	 * This method injects what ever HTML we have into the content part of a bootstrap basic template.
	 * There may be better ways to do this like a web api, but given the scope of the project this will do.
	 */
	def addIntoBootstrapTemplate (String content){
		'''
		<!DOCTYPE html>
		<!-- saved from url=(0050)http://getbootstrap.com/examples/starter-template/ -->
		<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		    <meta charset="utf-8">
		    <meta name="viewport" content="width=device-width, initial-scale=1.0">
		    <meta name="description" content="">
		    <meta name="author" content="">
		    <link rel="shortcut icon" href="http://getbootstrap.com/assets/ico/favicon.png">
		
		    <title>Roller Coaster Report</title>
		
		    <!-- Bootstrap core CSS -->
		    <link href="http://getbootstrap.com/dist/css/bootstrap.css" rel="stylesheet">
		
		    <!-- Custom styles for this template -->
		    <link href="http://getbootstrap.com/examples/starter-template/starter-template.css" rel="stylesheet">
		
		    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
		    <!--[if lt IE 9]>
		      <script src="../../assets/js/html5shiv.js"></script>
		      <script src="../../assets/js/respond.min.js"></script>
		    <![endif]-->
		    
		  </head>
		
		  <body style="">
		
		    <div class="navbar navbar-inverse navbar-fixed-top">
		      <div class="container">
		        <div class="navbar-header">
		          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
		            <span class="icon-bar"></span>
		            <span class="icon-bar"></span>
		            <span class="icon-bar"></span>
		          </button>
		          <a class="navbar-brand" href="http://getbootstrap.com/examples/starter-template/#">Roller Coaster Report</a>
		        </div>
		        <div class="collapse navbar-collapse">
		          <ul class="nav navbar-nav">
		            <li class="active"><a href="http://getbootstrap.com/examples/starter-template/#">Preview</a></li>
		            <li><a href="http://getbootstrap.com/examples/starter-template/#about">Statistics</a></li>
		            <li><a href="http://getbootstrap.com/examples/starter-template/#contact">Finincials</a></li>
		          </ul>
		        </div><!--/.nav-collapse -->
		      </div>
		    </div>
		
		    <div class="container">
		
		      <div class="starter-template">
		        <h1>Bootstrap starter template</h1>
		        <p class="lead">Use this document as a way to quickly start any new project.<br> All you get is this text and a mostly barebones HTML document.</p>
		      </div> ''' +
		
		content
		
		+ '''
		    </div><!-- /.container -->
		
		
		    <!-- Bootstrap core JavaScript
		    ================================================== -->
		    <!-- Placed at the end of the document so the pages load faster -->
		    <script src="./Starter Template for Bootstrap_files/jquery.js"></script>
		    <script src="./Starter Template for Bootstrap_files/bootstrap.min.js"></script>
		  
		</body>
		</html>
		'''
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

