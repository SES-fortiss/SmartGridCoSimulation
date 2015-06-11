/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package eCarStreet;

import java.util.HashSet;

import powerflowApi.PowerflowModel;
import topology.ActorTopology;
import eCarStreet.eCar.helper.configurations.*;
import eCarStreet.eCar.helper.decisions.*;

public class ECarStreetTopology{
	
	/**
	 * ACHTUNG Simulations Name muss ohne Leerzeichen sein! (wg. AKKA)
	 */
	public static String simulationName = "ECAR-Simulation";
	public static DecisionType modus = DecisionType.SIMPLE;
	public static int houseWithoutCars = 135;
	public static boolean coordinatorControl = false;
	
	
	public static ActorTopology createTopology() {
		ActorTopology top = new ActorTopology(simulationName);
		
		top.addActor("Coordinator", ECarStreetActorFactory.createCoordinator());
		top.addActor("Market", ECarStreetActorFactory.createMarket());
		
		//modus = DecisionType.TIMETRIGGERED;
		//modus = DecisionType.OPTIMAL;
		coordinatorControl = true;
	
		top.addActorAsChild("Coordinator/HouseA1", ECarStreetActorFactory.createHouse(4940 , new CarConfiguration1(), modus));
		top.addActorAsChild("Coordinator/HouseB1", ECarStreetActorFactory.createHouse(4940 , new CarConfiguration2(), modus));
		top.addActorAsChild("Coordinator/HouseC1", ECarStreetActorFactory.createHouse(4940 , new CarConfiguration3(), modus));
		top.addActorAsChild("Coordinator/HouseD1", ECarStreetActorFactory.createHouse(4940 , new CarConfiguration4(), modus));
		top.addActorAsChild("Coordinator/HouseE1", ECarStreetActorFactory.createHouse(4940 , new CarConfiguration5(), modus));
		top.addActorAsChild("Coordinator/HouseA2", ECarStreetActorFactory.createHouse(4940 , new CarConfiguration1(), modus));
		top.addActorAsChild("Coordinator/HouseB2", ECarStreetActorFactory.createHouse(4940 , new CarConfiguration2(), modus));
		top.addActorAsChild("Coordinator/HouseC2", ECarStreetActorFactory.createHouse(4940 , new CarConfiguration3(), modus));
		top.addActorAsChild("Coordinator/HouseD2", ECarStreetActorFactory.createHouse(4940 , new CarConfiguration4(), modus));
		top.addActorAsChild("Coordinator/HouseE2", ECarStreetActorFactory.createHouse(4940 , new CarConfiguration5(), modus));
		top.addActorAsChild("Coordinator/HouseA3", ECarStreetActorFactory.createHouse(4940 , new CarConfiguration1(), modus));
		top.addActorAsChild("Coordinator/HouseB3", ECarStreetActorFactory.createHouse(4940 , new CarConfiguration2(), modus));
		top.addActorAsChild("Coordinator/HouseC3", ECarStreetActorFactory.createHouse(4940 , new CarConfiguration3(), modus));
		top.addActorAsChild("Coordinator/HouseD3", ECarStreetActorFactory.createHouse(4940 , new CarConfiguration4(), modus));
		top.addActorAsChild("Coordinator/HouseE3", ECarStreetActorFactory.createHouse(4940 , new CarConfiguration5(), modus));
		
		/*
		 * Notizen zum Modell:
		 * 
		 * 14,1%  4 Personen Haushalt mit 4940kwh --> also 7*3 Häuser
		 * 13,4%  3 Personen Haushalt mit 4050kwh --> also 7*3 Häuser
		 * 34,8%  2 Personen Haushalt mit 3440kwh --> also 17*3 Häuser
		 * 37,8%  1 Personen Haushalt mit 2050kwh --> also 19*3 Häuser
		 * 
		 */
		
		String name = "";
		double verbrauch = 0;
		
		int _1Person = 19*3;
		int _2Person = 17*3;
		int _3Person = 7*3;
		//int _4Person = 7*3;
		
		for (int i = 1; i <= houseWithoutCars; i++) {
			name = "Coordinator/h" + i;
			verbrauch = 2050;
			if (i > _1Person) verbrauch = 3440;
			if (i > _1Person + _2Person) verbrauch = 4050;
			if (i > _1Person + _2Person + _3Person) verbrauch = 4950;
			top.addActorAsChild(name, ECarStreetActorFactory.createHouse(verbrauch));
		}
		
		//createPowerFlow(top);
		
		return top;
	}

	/**
	 * @param top
	 */
	@SuppressWarnings("unused")
	private static void createPowerFlow(ActorTopology top) {
		HashSet<String> children = top.getActorOptions("Coordinator").childrenPathList;
		System.out.println(children.size());
		
		PowerflowModel model = new PowerflowModel();
		model.setStandardVoltage(1000);
		for (String childName : children) {
			model.addNodeBelow(childName);
		}
		model.autoMap(top);		
	}
}
