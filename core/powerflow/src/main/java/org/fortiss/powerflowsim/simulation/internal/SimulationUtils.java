/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package org.fortiss.powerflowsim.simulation.internal;

import org.fortiss.powerflowsim.model.Model;

import CIM15.IEC61970.Wires.ACLineSegment;

public abstract class SimulationUtils {

	/**
	 * calculates the total line loss. Note: losses are negative to the system
	 * (a line can create reactive power though)
	 * 
	 * @param model
	 *            the model to calculte the line loss for
	 * @return a double array with active and reactive loss
	 */
	public static double[] calculateTotalLineLosses(Model model) {
		double totalActiveLoss = 0.0;
		double totalReactiveLoss = 0.0;

		for (ACLineSegment line : model.getLines()) {
			float activePowerLoss = line.getTerminals().get(0).getSvPowerFlow().getP() - line.getTerminals().get(1).getSvPowerFlow().getP();
			float reactivePowerLoss = line.getTerminals().get(0).getSvPowerFlow().getQ() - line.getTerminals().get(1).getSvPowerFlow().getQ();

			totalActiveLoss += activePowerLoss;
			totalReactiveLoss += reactivePowerLoss;
		}

		double[] complexLoss = new double[] { totalActiveLoss, totalReactiveLoss };
		return complexLoss;
	}
}
