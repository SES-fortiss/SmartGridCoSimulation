/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package helper;

/**
 * Summer Solar Profiles based on VDI
 * 
 * @author bytschkow
 * 
 */

public class SolarProfile {

	private static double[] solarSummer = {
			0,0,0,0,
			0,0,0,0,
			0,0,0,0,
			0,0,0,0,
			0,0,0,0,
			0,0,0,0,
			0,0,0.001362314,0.007948583,
			.017125322,.028803475,.042869746,.059187700,
			.077599082,.097925352,.119969415,.143517531,
			.168341384,.194200298,.220843567,.248012883,
			.275444841,.302873492,.330032918,.356659809,
			.382496016,.407291050,.430804511,.452808418,
			.473089417,.491450847,.507714648,.521723086,
			.533340280,.542453520,.548974358,.552839468,
			.554011254,.552478220,.548255079,.541382609,
			.531927261,.519980512,.505657981,.489098309,
			.470461810,.449928927,.427698476,.403985721,
			.379020291,.353043952,.326308265,.299072150,
			.271599375,.244156000,.217007802,.190417696,
			.164643189,.139933885,.116529067,.094655376,
			.074524617,.056331706,.040252781,.026443497,
			.015037514,.006145206,0,0,
			0,0,0,0,
			0,0,0,0};
	
	private final static double maxValue = getMax(solarSummer);
	
	private static double getMax(double[] array){
		double result = array[0];
		for (int i = 1; i < array.length; i++) {
			if (result < array[i]) result = array[i];
		}
		return result;
	}
	
	/**
	 * returns a solar radiation (0..100%) for the given timeStep
	 * based on a 96 timeStep resolution
	 */
	public static double getSolarProfileSummer(int timeStep){
		return solarSummer[(timeStep % 96)] / maxValue;
	}
	
	public static double getAvgSolarProfileSummer(int timeStep){
		return solarSummer[(timeStep % 96)];
	}
}