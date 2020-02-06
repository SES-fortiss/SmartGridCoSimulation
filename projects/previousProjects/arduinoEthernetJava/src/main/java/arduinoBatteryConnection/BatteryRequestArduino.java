/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package arduinoBatteryConnection;

public class BatteryRequestArduino {
	
	int socFlag = 0; // to for setting soc purpose, for testing
	double soc = 0.0; // to set a soc, for testing
	
	int chargeFlag = 0;
	double chargeRate = 0.0;
	double dischargeRate = 0.0;

}
