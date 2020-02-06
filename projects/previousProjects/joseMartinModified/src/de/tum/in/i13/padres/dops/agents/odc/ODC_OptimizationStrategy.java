/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package de.tum.in.i13.padres.dops.agents.odc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class ODC_OptimizationStrategy {
	
	private double convergenceVal;
	private double avgPrice;
	
	private boolean firstCall = true;
	
	public ODC_OptimizationStrategy() {
		convergenceVal = Math.sqrt(ODC_Aggregator.NUMBER_EVS)*0.1;
	}
	
	public void aggregatorOptimization(ODC_Aggregator aggregator, double[] averageOfAllAgents, double[] sumOfAllEVs, List<double[]> controlSignal, int evCount) {
		//System.out.println("Aggregator " + aggregator.getId() + " optimization. EvCount: " + evCount);
		if (sumOfAllEVs == null)
			return;
		
		ODC_Aggregator odcAggregator = (ODC_Aggregator)aggregator;
		RealVector rvScaledDemand = MatrixUtils.createRealVector(odcAggregator.getScaledInitialDemand());
		RealVector rvEvAverage = MatrixUtils.createRealVector(sumOfAllEVs);
		RealVector newAggValue = rvScaledDemand.add(rvEvAverage);
		odcAggregator.setPrice(newAggValue.toArray());
		System.out.println("Aggregator new Price: " + Arrays.toString(aggregator.getPrice()));
	}

	public List<double[]> updateControlSignal(ODC_Aggregator aggregator,
			double[] averageOfAllAgents, List<double[]> oldControlSignal, int evCount) {
		
		// Es sieht so aus als ob averageOfAllAgents nicht gebraucht wird.
		
		if (firstCall) {
			return oldControlSignal;
		}
		
		ODC_Aggregator odcAggregator = (ODC_Aggregator)aggregator;
		
		List<double[]> list = new ArrayList<>();
		list.add(odcAggregator.getPrice());
		
		// Das ist wirklich seltsamm.... Die liste hat eine double[96] mit den Preisen und eine double[1] mit der StepSize...
		double[] parameters = new double[1];
		parameters[0] = ODC_Aggregator.STEP_SIZE;
		list.add(parameters);
		
		return list;
	}

	public double[] electricVehicleOptimization(ODC_ElectricVehicle electricVehicle, List<double[]> controlSignal) {
		//System.out.println("EV " + electricVehicle.getId() + " optimization.");
		
		avgPrice = 0;
		ODC_ElectricVehicle eVehicle = (ODC_ElectricVehicle) electricVehicle;
		double[] newEvValue = eVehicle.getValue();
		double[] price = controlSignal.get(0);
		double stepSize = controlSignal.get(1)[0];
		for (int k = 0; k < price.length; k++) {
			avgPrice += price[k];
		}
		avgPrice = avgPrice / price.length;
		//System.out.println("AVG price: " + avgPrice);
		
		for(int i = 0; i < newEvValue.length; i++) {
			double factor = avgPrice/price[i];
			double val = newEvValue[i] + Math.log10(factor) * 2 * stepSize * price[i];
			newEvValue[i] = val;
		}
		
		do {
			newEvValue = projectA(newEvValue, eVehicle.getRequiredEnergy());
			newEvValue = projectB(newEvValue, eVehicle);
		} while (!checkAlternateProjectionConvergence(newEvValue, eVehicle.getRequiredEnergy(), ODC_ElectricVehicle.EV_THRESHOLD));

		eVehicle.setValue(newEvValue);
		System.out.println(eVehicle.name + " new Value after optimization: " + Arrays.toString(newEvValue));
		return newEvValue;
	}
	
	private double[] projectA(double[] value, double requiredEnergy) {
		double sum = 0;
		for (double val : value) {
			sum += val;
		}

		double R = ((requiredEnergy - sum) / (double) value.length);
		for (int i = 0; i < value.length; i++) {
			value[i] += R;
		}

		return value;
	}

	private double[] projectB(double[] value, ODC_ElectricVehicle eVehicle) {
		for (int i = 0; i < value.length; i++) {
			if (value[i] <= eVehicle.getLowerChargingBound()) {
				value[i] = eVehicle.getLowerChargingBound();

			} else if (value[i] > eVehicle.getDrivingProfile()[i] * eVehicle.getUpperChargingBound()) {
				value[i] = eVehicle.getDrivingProfile()[i] *  eVehicle.getUpperChargingBound();
			}
		}
		return value;
	}

	private boolean checkAlternateProjectionConvergence(double[] value, double requiredEnergy, double evThreshold) {
		
		double sum = 0;
		for (double val : value) {
			sum += val;
		}
		return (Math.abs( sum - requiredEnergy) <= evThreshold ? true : false);
	}

	public boolean checkConvergenceCriteria(ODC_Aggregator aggregator,
			double[] averageOfAllAgents, int evCount) {
		
		if (firstCall) {
			firstCall = false;
			return false;
		}
		
		ODC_Aggregator odcAggregator = (ODC_Aggregator)aggregator;
		RealVector rvOldPrice = MatrixUtils.createRealVector(odcAggregator.getOldPrice());
		RealVector rvNewPrice = MatrixUtils.createRealVector(odcAggregator.getPrice());
		double l2Norm = (rvNewPrice.subtract(rvOldPrice)).getNorm();
		System.out.println("Convergence: " + l2Norm);
		return l2Norm <= convergenceVal ? true : false;
	}
	
	public void reset() {
	}

}
