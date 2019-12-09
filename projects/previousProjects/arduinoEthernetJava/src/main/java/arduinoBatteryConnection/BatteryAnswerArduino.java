/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package arduinoBatteryConnection;

public class BatteryAnswerArduino {
	String type = "battery";
	double soc = 0.0;
	double charging = 0.0;
	
	// charging is positive, when battery charges
	// charging is negative, when battery discharges
}
