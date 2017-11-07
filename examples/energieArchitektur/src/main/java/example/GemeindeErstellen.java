package example;

import java.util.HashSet;

import akka.basicActors.ActorOptions;
import akka.basicActors.LoggingMode;
import example.aggregator.AggregatorModel;
import example.batterie.BatterieModel;
import example.gewerbe.GewerbeModel;
import example.haus.HausModel;
import example.landwirtschaft.LandwirtschaftModel;
import example.solar.SolarModel;
import example.strasse.StrassenBeleuchtungModel;

/**
 * 
 * The ActorFactory initializes the Actors with the corresponding BehaviorModels
 * 
 * @author bytschkow
 * 
 */
public abstract class GemeindeErstellen {

		public static ActorOptions createLandwirtschaft(double jahresVerbrauch){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new LandwirtschaftModel(jahresVerbrauch));		
		return result;
	}
	
	public static ActorOptions createGewerbe(double jahresVerbrauch){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new GewerbeModel(jahresVerbrauch));		
		return result;
	}
	
	public static ActorOptions createHaus(double jahresVerbrauch){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new HausModel(jahresVerbrauch));		
		return result;
	}
	
	public static ActorOptions createHaus(double jahresVerbrauch, boolean recorder){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new HausModel(jahresVerbrauch, recorder));		
		return result;
	}
	
	public static ActorOptions createAggregator(){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new AggregatorModel());		
		return result;
	}

	public static ActorOptions createStrassenBeleuchtung(double jahresVerbrauch) {
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new StrassenBeleuchtungModel(jahresVerbrauch));		
		return result;
	}

	public static ActorOptions createSolar(double jahresVerbrauch) {
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new SolarModel(jahresVerbrauch));		
		return result;
	}
	
	public static ActorOptions createBattery(double capacity) {
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new BatterieModel(capacity));		
		return result;
	}
}
