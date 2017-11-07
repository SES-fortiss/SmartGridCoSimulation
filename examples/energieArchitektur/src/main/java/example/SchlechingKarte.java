/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package example;

import topology.ActorTopology;

public class SchlechingKarte {

	
	private static String simulationName = "Schleching";
	private static boolean RECORDER = true;
	
	public static ActorTopology createTopology(){
		
		ActorTopology top = new ActorTopology(simulationName);
		
		top.addActor("Aggregator", GemeindeErstellen.createAggregator());
		
		
		
		
		
		/*
		top.addActorAsChild("Aggregator/HausProfil1_Landerhausen1", GemeindeErstellen.createHaus(4300));
		top.addActorAsChild("Aggregator/HausProfil1_Landerhausen2", GemeindeErstellen.createHaus(4300));
		top.addActorAsChild("Aggregator/HausProfil1_Landerhausen3", GemeindeErstellen.createHaus(4300));
		top.addActorAsChild("Aggregator/HausProfil1_Landerhausen4", GemeindeErstellen.createHaus(4300));
		top.addActorAsChild("Aggregator/HausProfil1_Landerhausen5", GemeindeErstellen.createHaus(4300));
				
		top.addActorAsChild("Aggregator/HausProfil1_LanderhausenerWeg13", GemeindeErstellen.createHaus(4300));
		top.addActorAsChild("Aggregator/HausProfil1_LanderhausenerWeg11", GemeindeErstellen.createHaus(4300));
		top.addActorAsChild("Aggregator/HausProfil1_LanderhausenerWeg9", GemeindeErstellen.createHaus(4300));
		top.addActorAsChild("Aggregator/HausProfil1_LanderhausenerWeg7", GemeindeErstellen.createHaus(4300));
		top.addActorAsChild("Aggregator/HausProfil1_LanderhausenerWeg5", GemeindeErstellen.createHaus(4300));
		top.addActorAsChild("Aggregator/HausProfil1_LanderhausenerWeg6", GemeindeErstellen.createHaus(4300));
		top.addActorAsChild("Aggregator/HausProfil1_LanderhausenerWeg2", GemeindeErstellen.createHaus(4300));
		
		top.addActorAsChild("Aggregator/HausProfil1_Lindäckerweg2", GemeindeErstellen.createHaus(4300));
		top.addActorAsChild("Aggregator/HausProfil1_Lindäckerweg4", GemeindeErstellen.createHaus(4300));
		top.addActorAsChild("Aggregator/HausProfil1_Lindäckerweg6", GemeindeErstellen.createHaus(4300));
		top.addActorAsChild("Aggregator/HausProfil1_Lindäckerweg8", GemeindeErstellen.createHaus(4300));
		top.addActorAsChild("Aggregator/HausProfil1_Lindäckerweg10", GemeindeErstellen.createHaus(4300));
		top.addActorAsChild("Aggregator/HausProfil1_Lindäckerweg11", GemeindeErstellen.createHaus(4300));
		top.addActorAsChild("Aggregator/HausProfil1_Lindäckerweg12", GemeindeErstellen.createHaus(4300));
		
		top.addActorAsChild("Aggregator/HausProfil1_Hauptstraße1", GemeindeErstellen.createHaus(4300));
		top.addActorAsChild("Aggregator/HausProfil1_Hauptstraße3", GemeindeErstellen.createHaus(4300));
		top.addActorAsChild("Aggregator/HausProfil1_Hauptstraße5", GemeindeErstellen.createHaus(4300));
		
		*/
		
		top.addActorAsChild("Aggregator/HausProfil1_4000o", GemeindeErstellen.createHaus(4300, RECORDER));
		top.addActorAsChild("Aggregator/HausProfil1_4000o/Solar", GemeindeErstellen.createSolar(4000));
		
		top.addActorAsChild("Aggregator/HausProfil1_7000o", GemeindeErstellen.createHaus(4300, RECORDER));
		top.addActorAsChild("Aggregator/HausProfil1_7000o/Solar", GemeindeErstellen.createSolar(7000));
		
		top.addActorAsChild("Aggregator/HausProfil1_10000o", GemeindeErstellen.createHaus(4300, RECORDER));
		top.addActorAsChild("Aggregator/HausProfil1_10000o/Solar", GemeindeErstellen.createSolar(10000));
		
		top.addActorAsChild("Aggregator/HausProfil1_4000m", GemeindeErstellen.createHaus(4300, RECORDER));
		top.addActorAsChild("Aggregator/HausProfil1_4000m/Solar", GemeindeErstellen.createSolar(4000));
		top.addActorAsChild("Aggregator/HausProfil1_4000m/Battery", GemeindeErstellen.createBattery(4));
		
		top.addActorAsChild("Aggregator/HausProfil1_7000m", GemeindeErstellen.createHaus(4300, RECORDER));
		top.addActorAsChild("Aggregator/HausProfil1_7000m/Solar", GemeindeErstellen.createSolar(7000));
		top.addActorAsChild("Aggregator/HausProfil1_7000m/Battery", GemeindeErstellen.createBattery(10));
		
		top.addActorAsChild("Aggregator/HausProfil1_10000m", GemeindeErstellen.createHaus(4300, RECORDER));
		top.addActorAsChild("Aggregator/HausProfil1_10000m/Solar", GemeindeErstellen.createSolar(10000));
		top.addActorAsChild("Aggregator/HausProfil1_10000m/Battery", GemeindeErstellen.createBattery(10));
		
		/*
		top.addActorAsChild("Aggregator/HausProfil1_4", GemeindeErstellen.createHaus(0));
		top.addActorAsChild("Aggregator/HausProfil1_4/Solar", GemeindeErstellen.createSolar(4300));
		*/
				
		/*		
		for (int i = 1; i <= 209; i++) {
			path = "Aggregator/HausProfil2_"+i;
			top.addActorAsChild(path, GemeindeErzeugung.createHaus(8000));
		}
		
		
		for (int i = 1; i <= 24; i++) {
			path = "Aggregator/HausProfil3_"+i;
			top.addActorAsChild(path, GemeindeErzeugung.createHaus(18000));
		}
		
		
		for (int i = 1; i <= 8; i++) {
			path = "Aggregator/GastGewerbe_Profil4_"+i;
			top.addActorAsChild(path, GemeindeErzeugung.createGewerbe(15000));
		}
		
		for (int i = 1; i <= 5; i++) {
			path = "Aggregator/GastGewerbe_Profil5_"+i;
			top.addActorAsChild(path, GemeindeErzeugung.createGewerbe(12000));
		}
		
		path = "Aggregator/GastGewerbe_Profil6_1";
		top.addActorAsChild(path, GemeindeErzeugung.createGewerbe(30000)); 
		
		for (int i = 1; i <= 8; i++) {
			path = "Aggregator/Handwerk_Profil7_"+i;
			top.addActorAsChild(path, GemeindeErzeugung.createGewerbe(20000));
		}
		
		for (int i = 1; i <= 2; i++) {
			path = "Aggregator/Handel_Profil8_"+i;
			top.addActorAsChild(path, GemeindeErzeugung.createGewerbe(20000));
		}
		
		for (int i = 1; i <= 27; i++) {
			path = "Aggregator/Landwirtschaft_Profil9_"+i;
			top.addActorAsChild(path, GemeindeErzeugung.createLandwirtschaft(11000));
		}
		
		for (int i = 1; i <= 3; i++) {
			path = "Aggregator/Landwirtschaft_Profil10_"+i;
			top.addActorAsChild(path, GemeindeErzeugung.createLandwirtschaft(35000));
		}
				
		path = "Aggregator/Strassenbeleuchtung";
		top.addActorAsChild(path, GemeindeErzeugung.createStrassenBeleuchtung(54299)); 		
		
		path = "Aggregator/KommunaleGebaude";
		top.addActorAsChild(path, GemeindeErzeugung.createGewerbe(8197));
		
		path = "Aggregator/Solar";
		//top.addActorAsChild(path, HelferErzeugung.createSolar(119272));
		top.addActorAsChild(path, GemeindeErzeugung.createSolar(827000));
		*/
		
		return top;
	}
}
