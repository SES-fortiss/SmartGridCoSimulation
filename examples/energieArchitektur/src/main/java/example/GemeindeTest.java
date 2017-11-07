package example;

import topology.ActorTopology;

/**
 * 
 * This is the topology for the simulation
 * 
 * @author bytschkow
 *
 */

public class GemeindeTest {
	
	private static String simulationName = "Simulation";
	private static boolean RECORDER = true;
	
	public static ActorTopology createTopology(){
		
		ActorTopology top = new ActorTopology(simulationName);
		
		top.addActor("Aggregator", GemeindeErstellen.createAggregator());		
		top.addActorAsChild("Aggregator/PrivatSommer", GemeindeErstellen.createHaus(5000, RECORDER));
		top.addActorAsChild("Aggregator/PrivatSommer/Solar", GemeindeErstellen.createSolar(5000));
		top.addActorAsChild("Aggregator/Landwirtschaft", GemeindeErstellen.createLandwirtschaft(5000));
		top.addActorAsChild("Aggregator/Gewerbe", GemeindeErstellen.createGewerbe(5000));
		/*
		top.addActorAsChild("Aggregator/PrivatWinter", GemeindeErstellen.createHaus(5000, RECORDER));		
		
		top.addActorAsChild("Aggregator/PrivatSommerPVgross", GemeindeErstellen.createHaus(5000, RECORDER));
		top.addActorAsChild("Aggregator/PrivatSommerPVgross/Solar", GemeindeErstellen.createSolar(8892));
		
		top.addActorAsChild("Aggregator/PrivatWinterPVgross", GemeindeErstellen.createHaus(5000, RECORDER));
		top.addActorAsChild("Aggregator/PrivatWinterPVgross/Solar", GemeindeErstellen.createSolar(8892));
		
		top.addActorAsChild("Aggregator/PrivatSommerPVmittel", GemeindeErstellen.createHaus(5000, RECORDER));
		top.addActorAsChild("Aggregator/PrivatSommerPVmittel/Solar", GemeindeErstellen.createSolar(6652));
		
		top.addActorAsChild("Aggregator/PrivatWinterPVmittel", GemeindeErstellen.createHaus(5000, RECORDER));
		top.addActorAsChild("Aggregator/PrivatWinterPVmittel/Solar", GemeindeErstellen.createSolar(6652));
		
		top.addActorAsChild("Aggregator/PrivatSommerPVklein", GemeindeErstellen.createHaus(5000, RECORDER));
		top.addActorAsChild("Aggregator/PrivatSommerPVklein/Solar", GemeindeErstellen.createSolar(4212));
		
		top.addActorAsChild("Aggregator/PrivatWinterPVklein", GemeindeErstellen.createHaus(5000, RECORDER));
		top.addActorAsChild("Aggregator/PrivatWinterPVklein/Solar", GemeindeErstellen.createSolar(4212));
				
		top.addActorAsChild("Aggregator/Landwirtschaft", GemeindeErstellen.createLandwirtschaft(5000));
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
