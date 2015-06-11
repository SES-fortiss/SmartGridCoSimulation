/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akkaAndSolver.behaviorModels;

public class SolverAggregatorSchedule {

	private static double[] schedule = generateSchedule();
	
	public static double getSchedule(int timestep){				
		return schedule[timestep % 96];
	}

	private static double[] generateSchedule() {
		double[] result = new double[96];
		for (int i = 0; i < result.length; i++) {
			if (i >= 0 && i < 16) {
				result[i] = 0.0;
			}
			
			if (i >= 16 && i < 32) {
				result[i] = 20000.0;
			}
			
			if (i >= 32 && i < 64) {
				result[i] = 50000.0;
			}
			
			if (i >= 64 && i < 80) {
				result[i] = 20000.0;
			}
			
			if (i >= 80){
				result[i] = 0.0;
			}
		}
		return result;
	}
}
