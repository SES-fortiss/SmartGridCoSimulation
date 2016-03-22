/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package dems.helper;

import java.util.HashSet;

import akka.basicActors.ActorOptions;
import akka.basicActors.LoggingMode;
import dems.behaviorModels.TradingBehaviorModel;
import dems.behaviorModels.DEMS.DEMSNoControl;
import dems.behaviorModels.DEMS.DEMSPriorityControl;
import dems.behaviorModels.plants.BioGasBehaviorModel;
import dems.behaviorModels.plants.BioMassBehaviorModel;
import dems.behaviorModels.plants.SolarBehaviorModel;
import dems.behaviorModels.plants.UnreliableCommunicationWater;
import dems.behaviorModels.plants.UnreliablePlantBioGas;
import dems.behaviorModels.plants.WaterBehaviorModel;
import dems.behaviorModels.plants.WindBehaviorModel;

/**
 * 
 * The ActorFactory initializes the Actors with the corresponding BehaviorModels
 * 
 * @author bytschkow
 * 
 */
public abstract class DEMSActorFactory {

	// SolarBehavior with installed Power
	public static ActorOptions createSolarActor(double installedPower){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new SolarBehaviorModel(installedPower));		
		return result;		
	}

	// WaterOptions with installed Power
	public static ActorOptions createWaterActor(double installedPower){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new WaterBehaviorModel(installedPower));		
		return result;
	}

	// WindOptions with installed Power
	public static ActorOptions createWindActor(double installedPower){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new WindBehaviorModel(installedPower));		
		return result;
	}

	// BioGasOptions with installed Power
	public static ActorOptions createBioGasActor(double installedPower){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new BioGasBehaviorModel(installedPower));		
		return result;
	}	

	// BioMassOptions with installed Power
	public static ActorOptions createBioMassActor(double installedPower){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new BioMassBehaviorModel(installedPower));		
		return result;
	}
	
	// DEMS - NO Schedule
	public static ActorOptions createDEMSNoSchedule(){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new DEMSNoControl());		
		return result;		
	}
	
	// DEMS - Priority
	public static ActorOptions createDEMSPriority(){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new DEMSPriorityControl());		
		return result;		
	}
	
	// Handel
	public static ActorOptions createTradingActor(){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new TradingBehaviorModel());		
		return result;		
	}
	
	// Unreliable Communication	
	public static ActorOptions createComOutWaterActor(double installedPower){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new UnreliableCommunicationWater(installedPower));		
		return result;
	}
	
	// Unreliable Power Plant
	public static ActorOptions createUnreliableBioGas(double installedPower){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new UnreliablePlantBioGas(installedPower));		
		return result;
	}
	
}
