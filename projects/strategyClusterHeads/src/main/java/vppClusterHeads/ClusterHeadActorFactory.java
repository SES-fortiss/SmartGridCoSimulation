/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package vppClusterHeads;

import java.util.HashSet;

import vppClusterHeads.bioGas.BioGasBehaviorModel;
import vppClusterHeads.bioMass.BioMassBehaviorModel;
import vppClusterHeads.clusterHead.ClusterHead;
import vppClusterHeads.dems.DEMS;
import vppClusterHeads.externalClusterHead.ExternalClusterHead;
import vppClusterHeads.genericStuff.EmptyBehavior;
import vppClusterHeads.solar.SolarBehaviorModel;
import vppClusterHeads.water.WaterBehaviorModel;
import vppClusterHeads.wind.WindBehaviorModel;
import akka.basicActors.ActorOptions;
import akka.basicActors.LoggingMode;

/**
 * 
 * The ActorFactory initializes the Actors with the corresponding BehaviorModels
 * 
 * @author bytschkow
 * 
 */
public abstract class ClusterHeadActorFactory {

	public static ActorOptions createSolarActor(double installedPower) {
		ActorOptions result =
				new ActorOptions(LoggingMode.MINIMAL, new HashSet<String>(),
						new HashSet<String>(), new HashSet<String>(),
						new SolarBehaviorModel(installedPower));
		return result;
	}

	public static ActorOptions createWaterActor(double installedPower) {
		ActorOptions result =
				new ActorOptions(LoggingMode.MINIMAL, new HashSet<String>(),
						new HashSet<String>(), new HashSet<String>(),
						new WaterBehaviorModel(installedPower));
		return result;
	}

	public static ActorOptions createWindActor(double installedPower) {
		ActorOptions result =
				new ActorOptions(LoggingMode.MINIMAL, new HashSet<String>(),
						new HashSet<String>(), new HashSet<String>(),
						new WindBehaviorModel(installedPower));
		return result;
	}

	public static ActorOptions createBioGasActor(double installedPower) {
		ActorOptions result =
				new ActorOptions(LoggingMode.MINIMAL, new HashSet<String>(),
						new HashSet<String>(), new HashSet<String>(),
						new BioGasBehaviorModel(installedPower));
		return result;
	}

	public static ActorOptions createBioMassActor(double installedPower) {
		ActorOptions result =
				new ActorOptions(LoggingMode.MINIMAL, new HashSet<String>(),
						new HashSet<String>(), new HashSet<String>(),
						new BioMassBehaviorModel(installedPower));
		return result;
	}

	// ClusterHead
	public static ActorOptions createClusterHeadActor() {
		ActorOptions result =
				new ActorOptions(LoggingMode.MINIMAL, new HashSet<String>(),
						new HashSet<String>(), new HashSet<String>(),
						new ClusterHead());
		return result;
	}

	// External ClusterHead
	public static ActorOptions createExternalClusterHeadActor() {
		ActorOptions result =
				new ActorOptions(LoggingMode.MINIMAL, new HashSet<String>(),
						new HashSet<String>(), new HashSet<String>(),
						new ExternalClusterHead());
		return result;
	}

	// DEMS
	public static ActorOptions createDEMSActor() {
		ActorOptions result =
				new ActorOptions(LoggingMode.MINIMAL, new HashSet<String>(),
						new HashSet<String>(), new HashSet<String>(),
						new DEMS());
		return result;
	}

	// EmptyBehavior
	public static ActorOptions createEmptyActor() {
		ActorOptions result =
				new ActorOptions(LoggingMode.MINIMAL, new HashSet<String>(),
						new HashSet<String>(), new HashSet<String>(),
						new EmptyBehavior());
		return result;
	}

}
