/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package de.tum.in.i13.padres.dops.agents.odc;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.math3.linear.MatrixUtils;


import com.google.inject.Inject;
import com.jmatio.io.MatFileReader;
import com.jmatio.types.MLDouble;

public class ODC_Aggregator{

	public static final int NUMBER_EVS = 100;
	public static final double STEP_SIZE = 1/((double)NUMBER_EVS);
	private final double SCALE_FACTOR = 0.001;
	
	private double[] initialDemandProfile;	// D
	private double[] scaledDemandProfile;	// scaled D
	private double[] oldPrice;		  		// old price
	private double[] currentPrice;	   		// updated price	

	private String filePath;
	
	private List<double[]> initialControlSignal = null;
	
	public ODC_OptimizationStrategy os;
	
	@Inject
	public ODC_Aggregator(ODC_OptimizationStrategy optimizationStrategy) {
		os = optimizationStrategy;
	}

	public List<double[]> getInitialControlSignal() {
		if (initialControlSignal == null) {
			List<double[]> list = new ArrayList<double[]>();
			list.add(scaledDemandProfile);
			double[] parameters = new double[1];
			parameters[0] = STEP_SIZE;
			list.add(parameters);
			initialControlSignal = list;
		}
		return initialControlSignal;
	}

	public void reset() {
		if(filePath != null && !filePath.equals("")) {
			File file = new File(filePath);
			initialize(file);
		}
	}

	public void initialize(File file) {
		if (file == null || !file.exists()) {
			System.out.println("Aggregator data file not found: " + file);
		} else {
			filePath = file.getAbsolutePath();
		}

		try {
			MatFileReader mfr = new MatFileReader(file.getAbsolutePath());;
			MLDouble demandVector = (MLDouble) mfr.getMLArray("D");
			System.out.println(demandVector);
			
			int M = demandVector.getM();
			System.out.println(M);
			double [] result = new double[M];
			for (int i = 0; i < M; i++) {
				result[i] = demandVector.get(i, 0);
			}			
			System.out.println(Arrays.toString(result));
			
			initialDemandProfile = result;
			//initialDemandProfile = MatrixUtil.getFirstColumn(demandVector.getArray(), demandVector.getM());
			
			scaledDemandProfile = MatrixUtils.createRealVector(initialDemandProfile).mapMultiplyToSelf(SCALE_FACTOR).toArray();
			System.out.println("Aggregator INITIAL demand profile: " + Arrays.toString(initialDemandProfile));
			System.out.println("Aggregator SCALED demand profile: " + Arrays.toString(scaledDemandProfile));
			currentPrice = scaledDemandProfile;
			oldPrice = scaledDemandProfile;
			System.out.println("Data loaded.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public double[] getPrice() {
		return currentPrice;
	}
	
	public double[] getOldPrice() {
		return oldPrice;
	}

	public void setPrice(double[] newVal) {
		System.out.println("SET VALUE: " + Arrays.toString(newVal));
		oldPrice = currentPrice;
		currentPrice = newVal;
	}
	
	public double[] getScaledInitialDemand() {
		return scaledDemandProfile;
	}
	
	protected void initialize() {
	}
	
	public static void main(String[] args) {
		ODC_OptimizationStrategy odcStrategy = new ODC_OptimizationStrategy();
		ODC_Aggregator testAggregator = new ODC_Aggregator(odcStrategy);
		File aggFile = new File("src/data/aggregator.mat");
		testAggregator.initialize(aggFile);
	}

	/**
	 * @param averageOfAllAgents
	 * @param sumOfAllEVs
	 * @param controlSignal
	 * @param evCount
	 */
	public void performOptimization(double[] averageOfAllAgents,
			double[] sumOfAllEVs, List<double[]> controlSignal, int evCount) {
		// TODO Auto-generated method stub
		
		this.os.aggregatorOptimization(this, averageOfAllAgents, sumOfAllEVs, controlSignal, evCount);
		
	}

	/**
	 * @param averageOfAllAgents
	 * @param controlSignal
	 * @param evCount
	 * @return
	 */
	public List<double[]> updateControlSignal(double[] averageOfAllAgents,
			List<double[]> controlSignal, int evCount) {		
		List<double[]> result;
		
		result = this.os.updateControlSignal(this, averageOfAllAgents, getInitialControlSignal(), evCount);		
		return result;
	}
}
