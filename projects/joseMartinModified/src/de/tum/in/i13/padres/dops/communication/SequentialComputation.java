/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package de.tum.in.i13.padres.dops.communication;

import java.util.ArrayList;
import java.util.List;

import cern.colt.Arrays;
import de.tum.in.i13.padres.dops.MyChart;
import de.tum.in.i13.padres.dops.Settings;
import de.tum.in.i13.padres.dops.agents.odc.ODC_Aggregator;
import de.tum.in.i13.padres.dops.agents.odc.ODC_ElectricVehicle;


public class SequentialComputation {
	
	public double[] execute(ODC_Aggregator aggregator, List<ODC_ElectricVehicle> evList) {
		/**
		 * 
		 * Initiere den Algorithmus
		 * 
		 */
		
		System.out.println("Perform sequential ccomputation");
		
		aggregator.reset();
		
		System.out.println("Initial value of the aggregator: " + Arrays.toString(aggregator.getPrice()));
		
		for (ODC_ElectricVehicle electricVehicle : evList) {
			electricVehicle.reset();
			System.out.println("EV initial value: " + Arrays.toString(electricVehicle.getInitialPrice()));
		}
		
		/**
		 * List von double arrays erzeugen (controlSignal)
		 */		
		List<double[]> controlSignal = aggregator.getInitialControlSignal();
		System.out.println("Aggregator initial values: ");
		for (double[] aggregatorValue : controlSignal) {
			System.out.println(Arrays.toString(aggregatorValue));
		}
		
		double[] averageOfAllAgents = null;
		int evCount = evList.size();
		int i = 0; // Itrationsanzahl
		double[] sumOfAllEVs = null; // in the beginning, the sum is not known
		do {
			System.out.println("Iteration: " + i++);
			List<double[]> newValuesList = new ArrayList<double[]>();
			for (ODC_ElectricVehicle electricVehicle : evList) {
				
				// das ist wohl sowas wie sende ein controlSignal an das EV, bekomme einen neuen Wert zurück
				double[] newEvValue =  
						electricVehicle.update(controlSignal);
				//System.out.println(electricVehicle.name+ " value: " + Arrays.toString(newEvValue));
				
				// hier sind die Ergebnisse der Autos gespeichert
				newValuesList.add(newEvValue);
			}
			
			// hier wird eine Optimierung gemacht - TODO es ist noch nicht klar was genau passiert			
			aggregator.performOptimization(averageOfAllAgents, sumOfAllEVs, controlSignal, evCount);
			
			sumOfAllEVs = computeSum(newValuesList);
			newValuesList.add(aggregator.getPrice());
			averageOfAllAgents = computeAverageValue(newValuesList);
			
			// hier wird ein neues Control Signal an die Agenten geschickt?
			controlSignal = aggregator.updateControlSignal(averageOfAllAgents, controlSignal, evCount);
			drawchart("iteration"+i, aggregator.getPrice());
		} 
		while(!aggregator.os.checkConvergenceCriteria(aggregator, averageOfAllAgents, evCount));		
		//while(i<=10);
		//while(!aggregator.shouldStop(averageOfAllAgents, evCount));
				
		System.out.println("Aggregator values at the end: ");
		System.out.println(Arrays.toString(aggregator.getPrice()));
		
//		for (double[] aggregatorValue : controlSignal) {
//			System.out.println(Arrays.toString(aggregatorValue));
//		}
		
		
		drawchart("Final", aggregator.getPrice());
		
		return aggregator.getPrice();
	}
	
	/**
	 * @param price
	 */
	private void drawchart(String title, double[] price) {
		System.out.println("createChart");
		System.out.println(Arrays.toString(price));
		MyChart.createChart(title, price);		
	}

	private double[] computeAverageValue(List<double[]> values) {
		double[] temp = new double[Settings.N];
		
		for (double[] value: values) {
			for (int i = 0; i < value.length; i++) {
				temp[i] = temp[i] + value[i];
			}
		}
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = temp[i] / values.size();
		}
		
		return temp;
	}
	
	private double[] computeSum(List<double[]> values) {
		double[] temp = new double[Settings.N];
		
		for (double[] value: values) {
			for (int i = 0; i < temp.length; i++) {
				temp[i] = temp[i] + value[i];
			}
		}
		return temp;
	}
}
