/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package de.tum.in.i13.padres.dops.tests;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import de.tum.in.i13.padres.dops.agents.odc.ODC_Aggregator;
import de.tum.in.i13.padres.dops.agents.odc.ODC_ElectricVehicle;
import de.tum.in.i13.padres.dops.agents.odc.ODC_OptimizationStrategy;
import de.tum.in.i13.padres.dops.communication.SequentialComputation;

public class OdcTestSequantial {

	@Test
	public void test() {
		System.out.println("Test");
		// create evs

		List<ODC_ElectricVehicle> evList = new ArrayList<>();

		
		/**
		 * old: erzeuge Electric Vehicles mit Hilfe des Injectors
		 * new: erzeuge Electric Vehicles
		 */
		for (int i = 1; i <= 20; i++) {
			ODC_ElectricVehicle ev = new ODC_ElectricVehicle(new ODC_OptimizationStrategy());
			ev.initialize(new File("src/data/" + i + ".mat"));
			ev.name = "EV" + i;
			evList.add(ev);
		}

		/**
		 *  old: erzeuge aggregator mit Hilfe des Injectors
		 *  new: erzeuge ODC_Aggregator
		 */
		ODC_Aggregator aggregator = new ODC_Aggregator(new ODC_OptimizationStrategy());
		aggregator.initialize(new File("src/data/aggregator.mat"));
		
		/**
		 * Starte die Stopuhr
		 */
		long startTime = System.currentTimeMillis();
		
		/**
		 * TODO Algorithmus!!!
		 */
		SequentialComputation sc = new SequentialComputation();
		sc.execute(aggregator, evList);

		long endTime = System.currentTimeMillis();

		System.out.println("Elapsed time: " + (endTime - startTime) + " ms");
//		for (ODC_ElectricVehicle electricVehicle : evList) {
//			System.out.println.info("EV " + electricVehicle.getId() + " value: " +
//			Arrays.toString(electricVehicle.getValue()));
//		}

		/**
		 * print result
		 */
//		PrintWriter writer;
//		try {
//			writer = new PrintWriter("result.dat", "UTF-8");
//			for (int i = 0; i < DopsSettings.VECTOR_LENGTH; i++) {
//				writer.write(aggregator.getInitialControlSignal().get(0)[i]
//						+ "\t" + aggregator.getValue()[i] + "\n");
//			}
//			writer.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
//
//		System.out.println("Aggregator value: "
//				+ Arrays.toString(aggregator.getValue()));
	}
}