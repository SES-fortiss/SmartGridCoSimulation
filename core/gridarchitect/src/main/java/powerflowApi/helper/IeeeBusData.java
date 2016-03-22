/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package powerflowApi.helper;

public class IeeeBusData {
	
	public int number;
	public String name;
	public int type;
	public double voltageMagnitude;
	public double voltageAngle;
	public double loadP;
	public double loadQ;
	public double genP;
	public double genQ;
	public double shuntSusceptance;
	
	
	public boolean parseDate(String string ){
		this.number = Integer.parseInt(string.substring(0, 4).replaceAll("\\s+",""));
		this.name = string.substring(5, 17).replaceAll("\\s+","");						
		this.type = Integer.parseInt(string.substring(25, 26));
		this.voltageMagnitude = Double.parseDouble(string.substring(27, 32));		
		this.voltageAngle = Double.parseDouble(string.substring(33, 40));
		
		this.loadP = Double.parseDouble(string.substring(41, 49));
		this.loadQ = Double.parseDouble(string.substring(50, 59));
		this.genP = Double.parseDouble(string.substring(60, 67));
		this.genQ = Double.parseDouble(string.substring(68, 75));			
		// note, we do not consider limits yet			
		this.shuntSusceptance = Double.parseDouble(string.substring(115, 122));
		
		//System.out.println(number + "\t" + name + " \t" + type + "\t" + voltageMagnitude + "\t" + voltageAngle + "\t" +
				//loadP + "\t" + loadQ + "\t" + genP + "\t" + genQ+ "\t" + shuntSusceptance);
		
		return true;
	}

}
