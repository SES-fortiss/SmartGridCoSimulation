package example;

import java.util.HashSet;

import akka.basicActors.ActorOptions;
import akka.basicActors.LoggingMode;
import example.aggregator.AggregatorModel;
import example.commericalComponents.CommercialBuildingModel;
import example.farmComponents.FarmModel;
import example.houseComponents.HouseModel;
import example.solarComponents.SolarModel;
import example.streetLights.StreetLightsModel;

/**
 * 
 * The ActorFactory initializes the Actors with the corresponding BehaviorModels
 * 
 * @author bytschkow
 * 
 */
public abstract class HelperClassForCreation {

		public static ActorOptions createFarm(double jahresVerbrauch){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new FarmModel(jahresVerbrauch));		
		return result;
	}
	
	public static ActorOptions createCommercial(double jahresVerbrauch){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new CommercialBuildingModel(jahresVerbrauch));		
		return result;
	}
	
	public static ActorOptions createHouse(double jahresVerbrauch){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new HouseModel(jahresVerbrauch));		
		return result;
	}
	
	public static ActorOptions createAggregator(){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new AggregatorModel());		
		return result;		
	}

	public static ActorOptions createStreetLights(double jahresVerbrauch) {
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new StreetLightsModel(jahresVerbrauch));		
		return result;
	}

	public static ActorOptions createSolar(double jahresVerbrauch) {
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new SolarModel(jahresVerbrauch));		
		return result;
	}
}
