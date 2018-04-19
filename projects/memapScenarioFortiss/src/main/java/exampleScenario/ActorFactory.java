/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package exampleScenario;

import java.util.HashSet;

import akka.basicActors.ActorOptions;
import akka.basicActors.LoggingMode;
import exampleScenario.components.MEMAPBehavior;
import exampleScenario.components.Battery;
import exampleScenario.components.Building;
import exampleScenario.components.CHP;
import exampleScenario.components.Consumer;
import exampleScenario.components.GasBoiler;
import exampleScenario.components.HeatPump;
import exampleScenario.components.OilBoiler;
import exampleScenario.components.PV;
import exampleScenario.components.SolarThermic;
import exampleScenario.components.ThermalStorage;

/**
 * 
 * The ActorFactory initializes the Actors with the corresponding BehaviorModels
 * 
 * @author bytschkow
 * 
 */
public abstract class ActorFactory {
	
	public static ActorOptions createMEMAP(){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new MEMAPBehavior());		
		return result;		
	}
	
	public static ActorOptions createBuilding(String name, int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Building(name, port));	
		return result;
	}
	
	public static ActorOptions createCHP(String name, double qdot_max, double efficiency_el, double efficiency_H){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new CHP(name, qdot_max, efficiency_el, efficiency_H));	
		return result;
	}
	
	public static ActorOptions createGasBoiler(String name, double qdot_max, double efficiency){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new GasBoiler(name, qdot_max, efficiency));	
		return result;
	}
	
	public static ActorOptions createOilBoiler(String name, double qdot_max, double efficiency){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new OilBoiler(name, qdot_max, efficiency));	
		return result;
	}
	
	public static ActorOptions createHeatPump(String name, double qdot_max, double efficiency){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new HeatPump(name, qdot_max, efficiency));	
		return result;
	}
	
	public static ActorOptions createBattery(String name, double qdot_max_in, double qdot_max_out, double capacity){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Battery(name, qdot_max_in, qdot_max_out, capacity));	
		return result;
	}
	
	public static ActorOptions createConsumer(String name, String filename){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Consumer(name, filename));	
		return result;
	}
	
	public static ActorOptions createPV(String name, double area, double efficiency){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new PV(name, area, efficiency));	
		return result;
	}
	
	public static ActorOptions createSolarThermic(String name, double area, double efficiency){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new SolarThermic(name, area, efficiency));	
		return result;
	}
	
	public static ActorOptions createThermalStorage(String name, double qdot_max_in, double qdot_max_out, double capacity, double efficiency){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new ThermalStorage(name, qdot_max_in, qdot_max_out, capacity, efficiency));	
		return result;
	}
	

}
