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
import java.util.List;

import com.google.inject.Inject;
import com.jmatio.io.MatFileReader;
import com.jmatio.types.MLDouble;

public class ODC_ElectricVehicle {
	
	/**
	 * Die Klasse hat
	 * - drivingProfile : double[]
	 * - requiredEnergyProfile : double []
	 * 
	 */
	
	public static final double EV_THRESHOLD = 0.001;
	public ODC_OptimizationStrategy os;
	
	private double requiredEnergy;			// R
	private double[] drivingProfile;  		// d
	private double[] value;
	
	private double lowerChargingBound = 0;
	private double upperChargingBound = 4;
	
	private String filePath;
	public String name;
	
	@Inject
	public ODC_ElectricVehicle(ODC_OptimizationStrategy odcStrategy ) {
		os = odcStrategy;
	}

	public double[] getInitialPrice() {
		return value;
	}

	public void reset() {
		if(filePath != null && !filePath.equals("")) {
			File file = new File(filePath);
			initialize(file);
		}
	}

	public void initialize(File file) {
		if (file == null || !file.exists()) {
			System.out.println("EV data file not found: " + file);
		} else {
			filePath = file.getAbsolutePath();
		}

		try {
			//System.out.println(file.getName());		
			MatFileReader mfr = new MatFileReader(file.getAbsolutePath());
			MLDouble drivingProfileVector = (MLDouble) mfr.getMLArray("d");
			double[][] test = drivingProfileVector.getArray();
			drivingProfile = test[0];
			// System.out.println(Arrays.toString(test[0]));
			// drivingProfile = MatrixUtil.getFirstRow(drivingProfileVector.getArray(), drivingProfileVector.getN());
			MLDouble requiredEnergyVector = (MLDouble) mfr.getMLArray("R");
			requiredEnergy = requiredEnergyVector.getArray()[0][0];
			System.out.println(this.name +  " requiredEnergy: " +  requiredEnergy);			
			value = new double[96];
			
			//value = MatrixUtil.createVector(DopsSettings.VECTOR_LENGTH, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public double[] getDrivingProfile() {
		return drivingProfile;
	}
	
	public double getRequiredEnergy() {
		return requiredEnergy;
	}
	
	public double[] getValue() {
		return value;
	}

	public void setValue(double[] value) {
		this.value = value;
	}
	
	protected void initialize() {
	}
	
	public double getUpperChargingBound() {
		return upperChargingBound;
	}
	
	public double getLowerChargingBound() {
		return lowerChargingBound;
	}
	
	public double[] update(List<double[]> values){
		double [] result = this.os.electricVehicleOptimization(this, values);
		return result;		
	}

	public static void main(String[] args) {
		ODC_OptimizationStrategy odcStrategy = new ODC_OptimizationStrategy();
		ODC_ElectricVehicle testVehicle = new ODC_ElectricVehicle(odcStrategy);
		File evFile = new File("src/data/1.mat");
		testVehicle.initialize(evFile);
	}
	
}
