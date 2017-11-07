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

public class SchlechingExcel {

	
	private static String simulationName = "Schleching";
	private static boolean RECORDER = true;
	
	public static ActorTopology createTopology(){
		
		ActorTopology top = new ActorTopology(simulationName);
		
		top.addActor("Aggregator", GemeindeErstellen.createAggregator());		
		String path;
		
		
		for (int i = 2; i <= 365; i++) {
			path = "Aggregator/HausProfil1_"+i;
			top.addActorAsChild(path, GemeindeErstellen.createHaus(4300));
		}
		
		top.addActorAsChild("Aggregator/HausProfil1_1", GemeindeErstellen.createHaus(4300, RECORDER));
		top.addActorAsChild("Aggregator/HausProfil1_1/Solar", GemeindeErstellen.createSolar(1100));
		top.addActorAsChild("Aggregator/HausProfil1_1/Battery", GemeindeErstellen.createBattery(4));		
		
		top.addActorAsChild("Aggregator/HausProfil1_2/Solar", GemeindeErstellen.createSolar(14400));
		top.addActorAsChild("Aggregator/HausProfil1_3/Solar", GemeindeErstellen.createSolar(5900));
		top.addActorAsChild("Aggregator/HausProfil1_4/Solar", GemeindeErstellen.createSolar(2100));
		top.addActorAsChild("Aggregator/HausProfil1_5/Solar", GemeindeErstellen.createSolar(1300));
		top.addActorAsChild("Aggregator/HausProfil1_6/Solar", GemeindeErstellen.createSolar(5400));
		top.addActorAsChild("Aggregator/HausProfil1_7/Solar", GemeindeErstellen.createSolar(4800));
		top.addActorAsChild("Aggregator/HausProfil1_8/Solar", GemeindeErstellen.createSolar(8100));
		top.addActorAsChild("Aggregator/HausProfil1_9/Solar", GemeindeErstellen.createSolar(4300));
		top.addActorAsChild("Aggregator/HausProfil1_10/Solar", GemeindeErstellen.createSolar(12500));
		top.addActorAsChild("Aggregator/HausProfil1_11/Solar", GemeindeErstellen.createSolar(9000));
		top.addActorAsChild("Aggregator/HausProfil1_12/Solar", GemeindeErstellen.createSolar(12500));
		top.addActorAsChild("Aggregator/HausProfil1_13/Solar", GemeindeErstellen.createSolar(15200));
		top.addActorAsChild("Aggregator/HausProfil1_14/Solar", GemeindeErstellen.createSolar(9200));
		top.addActorAsChild("Aggregator/HausProfil1_15/Solar", GemeindeErstellen.createSolar(10300));
		top.addActorAsChild("Aggregator/HausProfil1_16/Solar", GemeindeErstellen.createSolar(13700));		
		
		for (int i = 1; i <= 209; i++) {
			path = "Aggregator/HausProfil2_"+i;
			top.addActorAsChild(path, GemeindeErstellen.createHaus(6200));
		}
		
		
		for (int i = 1; i <= 24; i++) {
			path = "Aggregator/HausProfil3_"+i;
			top.addActorAsChild(path, GemeindeErstellen.createHaus(15000));
		}
		
		
		for (int i = 1; i <= 8; i++) {
			path = "Aggregator/GastGewerbe_Profil4_"+i;
			top.addActorAsChild(path, GemeindeErstellen.createGewerbe(40000));
		}
		
		for (int i = 1; i <= 5; i++) {
			path = "Aggregator/GastGewerbe_Profil5_"+i;
			top.addActorAsChild(path, GemeindeErstellen.createGewerbe(20000));
		}
		
		path = "Aggregator/GastGewerbe_Profil6_1";
		top.addActorAsChild(path, GemeindeErstellen.createGewerbe(70000)); 
		
		for (int i = 1; i <= 8; i++) {
			path = "Aggregator/Handwerk_Profil7_"+i;
			top.addActorAsChild(path, GemeindeErstellen.createGewerbe(40000));
		}
		
		for (int i = 1; i <= 2; i++) {
			path = "Aggregator/Handel_Profil8_"+i;
			top.addActorAsChild(path, GemeindeErstellen.createGewerbe(50000));
		}
		
		for (int i = 1; i <= 27; i++) {
			path = "Aggregator/Landwirtschaft_Profil9_"+i;
			top.addActorAsChild(path, GemeindeErstellen.createLandwirtschaft(11000));
		}
		
		for (int i = 1; i <= 3; i++) {
			path = "Aggregator/Landwirtschaft_Profil10_"+i;
			top.addActorAsChild(path, GemeindeErstellen.createLandwirtschaft(20000));
		}
				
		path = "Aggregator/Strassenbeleuchtung";
		top.addActorAsChild(path, GemeindeErstellen.createStrassenBeleuchtung(54299)); 		
		
		path = "Aggregator/KommunaleGebaude";
		top.addActorAsChild(path, GemeindeErstellen.createGewerbe(8197));
		
		path = "Aggregator/Speicher";
		top.addActorAsChild(path, GemeindeErstellen.createGewerbe(344474)); //TODO profil nachbessern
		
		/*
		path = "Aggregator/Solar";
		top.addActorAsChild(path, GemeindeErstellen.createSolar(827000));
		*/
		
		return top;
	}
}
