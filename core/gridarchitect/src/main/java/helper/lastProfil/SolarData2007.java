/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package helper.lastProfil;

/**
 * This class contains the data which is used to generate the solarprofiles for a yearly simulation.
 * The data is based on the year 2007 from a house in 83250 Marquartstein.
 * The solar panel had a peak installation of 8.1 KWp.
 *  
 * @author denis
 *
 */
public class SolarData2007 {

	// Daily data of production
	static final double[] januar = {1,1,2,4,1,3,2,16,11,7,19,6,24,10,21,21,14,4,10,3,5,5,0,1,1,1,1,17,2,31,32};
	static final double[] februar = {5,22,5,31,31,3,14,19,32,31,16,4,4,26,1,37,38,38,18,30,38,30,17,28,10,5,4,10};
	static final double[] maerz = {5,7,10,29,21,34,24,3,13,3,43,45,42,40,39,36,15,33,0,0,5,24,36,12,43,47,45,43,34,34,15};
	static final double[] april = {41,43,29,5,52,49,41,36,43,43,49,48,47,49,49,50,49,14,45,49,49,48,45,11,51,51,50,49,46,50};
	static final double[] mai = {52,53,31,30,42,4,24,31,10,42,36,42,51,43,15,36,15,47,52,53,50,42,39,53,34,47,43,21,6,27,42};
	static final double[] juni = {22,22,43,48,29,45,48,49,50,33,32,30,31,50,41,37,53,40,43,48,17,19,19,52,42,48,29,26,47,29};
	static final double[] juli = {46,7,46,19,16,13,30,40,10,26,26,20,47,49,51,50,49,35,48,47,48,20,45,14,35,51,24,34,29,27,26};
	static final double[] august = {52,30,12,26,50,51,19,35,10,15,24,33,32,29,36,5,9,44,33,13,38,44,35,40,42,44,37,27,14,11,14};
	static final double[] september = {12,23,20,11,13,2,3,6,11,35,11,28,46,32,20,15,18,24,30,45,45,42,42,42,3,3,28,16,30,29};
	static final double[] oktober = {36,32,31,8,7,6,33,39,33,11,36,23,25,34,38,37,29,10,8,0,0,0,5,7,9,18,21,14,29,3,9};
	static final double[] november = {33,21,15,3,31,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,14,20,5,0,0,8,22,1};
	static final double[] dezember = {8,8,16,4,6,4,3,3,2,4,4,0,0,0,0,0,0,0,1,7,23,20,21,9,15,19,24,22,27,2,0};

	static final double installedPower = 8.1;
	
}
