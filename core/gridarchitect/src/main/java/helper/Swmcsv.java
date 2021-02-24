/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import simulation.SimulationStarter;

/**
 * SWM Profiles
 * 
 * @author bytschkow
 * 
 */

public class Swmcsv {	
	
	// fixe Werte weil die Datei mit SWM Daten nicht mehr hergeben
	private final static int maxSteps = 672*2;
	static double[] waterProfile = new double[maxSteps];
	static double[] solarProfile = new double[maxSteps];
	static double[] windProfile = new double[maxSteps];
	static double[] bioGasProfile = new double[maxSteps];
	static double[] bioMassProfile = new double[maxSteps];
	static LocalDateTime[] timeProfile = new LocalDateTime[maxSteps];
	
	static boolean isDataThere = false;	
	static double divisor = Duration.ofMinutes(15).getSeconds();
	
	public static double getSWMProfileSolar(int timeStep){		
		if (!isDataThere) readFiles();
		return solarProfile[( timeStep % maxSteps)];
	}
	
	public static int findCorrectTimeInterval(LocalDateTime time) {
		
		if (!isDataThere) readFiles();
		
		int low = 0;
		int high = timeProfile.length;
		int middle = 0;		
		boolean found = false;
		
		if (timeProfile[0] != null ){
			while (!found){
				middle = (high - low) / 2 + low;			
				if (checkCorrectTimeIndex(middle, time)){
					found = true;
				}
				if (time.isAfter(timeProfile[middle])) {
					low = middle;
				}
				if (time.isBefore(timeProfile[middle])) {
					high = middle;
				}
			}
		}		
		return middle;
	}
	
	private static double interpolate(double bevor, double dannach, int index, LocalDateTime time) {
		double diff = dannach - bevor;		
		double durationInSeconds = Duration.between(timeProfile[index], time).getSeconds();
		double factor = durationInSeconds / divisor; 
		double result = bevor + factor * diff;	
		return result;
	}
	
	public static double getSWMProfileSolar(LocalDateTime time){
		
		int index = findCorrectTimeInterval(time);
		
		if (checkCorrectTimeIndex(index, time)) {			
			if (time.equals(timeProfile[index])) return getSWMProfileSolar(index);
			
			double bevor = getSWMProfileSolar(index);
			double dannach = getSWMProfileSolar(index+1);
			
			double result = interpolate(bevor, dannach, index, time);					
			return result;
		}
		return 0.0;
	}

	public static double getSWMProfileWater(int timeStep){
		if (!isDataThere) readFiles();
		return waterProfile[( timeStep % maxSteps)];
	}
	
	public static double getSWMProfileWater(LocalDateTime time){
		int index = findCorrectTimeInterval(time);
		
		if (checkCorrectTimeIndex(index, time)){
			
			if (time.equals(timeProfile[index])) return getSWMProfileWater(index);			
			double bevor = getSWMProfileWater(index);
			double dannach = getSWMProfileWater(index+1);
			double result = interpolate(bevor, dannach, index, time);
			return result;
		}
		return 0.0;
	}

	public static double getSWMProfileWind(int timeStep){
		if (!isDataThere) readFiles();
		return windProfile[( timeStep % maxSteps)];
	}
	
	public static double getSWMProfileWind(LocalDateTime time){
		int index = findCorrectTimeInterval(time);		
		if (checkCorrectTimeIndex(index, time)) {
			if (time.equals(timeProfile[index])) return getSWMProfileWind(index);			
			double bevor = getSWMProfileWind(index);
			double dannach = getSWMProfileWind(index+1);			
			double result = interpolate(bevor, dannach, index, time);			
			return result;	
		}
		return 0.0;
	}

	public static double getSWMProfileBioGas(int timeStep){
		if (!isDataThere) readFiles();
		return bioGasProfile[( timeStep % maxSteps)];
	}
	
	public static double getSWMProfileBioGas(LocalDateTime time){
		int index = findCorrectTimeInterval(time);	
		if (checkCorrectTimeIndex(index, time)) {
			if (time.equals(timeProfile[index])) return getSWMProfileBioGas(index);
			
			double bevor = getSWMProfileBioGas(index);
			double dannach = getSWMProfileBioGas(index+1);
			
			double result = interpolate(bevor, dannach, index, time);				
			return result;	
		}
		return 0.0;
	}
	
	public static double getSWMProfileBioMass(int timeStep){
		if (!isDataThere) readFiles();
		return bioMassProfile[( timeStep % maxSteps)];
	}
	
	public static double getSWMProfileBioMass(LocalDateTime time){
		int index = findCorrectTimeInterval(time);			
		if (checkCorrectTimeIndex(index, time)) {		
			if (time.equals(timeProfile[index])) return getSWMProfileBioMass(index);
			double bevor = getSWMProfileBioMass(index);
			double dannach = getSWMProfileBioMass(index+1);				
			double result = interpolate(bevor, dannach, index, time);		
			return result;		
		}
		return 0.0;
	}
	
	
	/** 
	 * 
	 * helper methods. This checks only if the correct TimeInterval is found
	 * 
	 * @param i
	 * @param time
	 * @return
	 */	
	private static boolean checkCorrectTimeIndex(int i, LocalDateTime time) {		
		try {
			if (time.equals(timeProfile[i % maxSteps])) return true;
			if (time.isAfter(timeProfile[i % maxSteps]) && time.isBefore(timeProfile[(i+1) % maxSteps ])) return true;
		} catch (Exception e) {
			System.out.println("index: " + i);
			e.printStackTrace();
		}		
		return false;
	}
	
	static synchronized void readFiles(){
		if (!isDataThere){
			readWinterFile();
			readSummerFile();
			isDataThere = true;
		}		
	}
	
	public static void readWinterFile(){
		try {			
		    BufferedReader br = new BufferedReader(new FileReader("src/main/resources/strategy/SWMWinter.csv")); 
		    readFile(br);
		} catch (IOException e) {
				try {					
					InputStreamReader isr = new InputStreamReader(Swmcsv.class.getResourceAsStream("/resources/strategy/SWMWinter.csv"));					
					BufferedReader br2 = new BufferedReader(isr);					
					readFile(br2);					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
		}
	}
	
	public static void readFile(BufferedReader br) throws IOException{
	    String zeile;
	    String[] buffer;
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
	    
    	int i = 0;
    	zeile = br.readLine();
    	
    	while ((zeile = br.readLine()) != null){		    			
				buffer = zeile.split(";");
				timeProfile[i] = LocalDateTime.parse(buffer[0], formatter); 
				waterProfile[i] = Double.parseDouble(buffer[1]);
				solarProfile[i] = Double.parseDouble(buffer[2]);
				windProfile[i] = Double.parseDouble(buffer[3]);
				bioGasProfile[i] = Double.parseDouble(buffer[4]);
				bioMassProfile[i] = Double.parseDouble(buffer[5]);
				i++;
		}
    	
	    br.close();
	}
	
	private static void readSummerFile(){
		try {
		    BufferedReader br = new BufferedReader(new FileReader("src/main/resources/strategy/SWMSommer.csv")); 
		    readFile2(br);
		} catch (IOException e) {
				try {
					InputStreamReader isr = new InputStreamReader(Swmcsv.class.getResourceAsStream("/resources/strategy/SWMSommer.csv"));
					BufferedReader br2 = new BufferedReader(isr);
					readFile2(br2);
				} catch (IOException e1) {
					e1.printStackTrace();
					SimulationStarter.stopSimulationStatic();
				}
		}
	}
	
	private static void readFile2(BufferedReader br) throws IOException{
		String zeile;
	    String[] buffer;
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
	    
	    zeile = br.readLine();		    	
	    for (int i = maxSteps/2; i < maxSteps; i++) {
			if (zeile != null){
		   		zeile = br.readLine();
				buffer = zeile.split(";");
				timeProfile[i] = LocalDateTime.parse(buffer[0], formatter); 
				waterProfile[i] = Double.parseDouble(buffer[1]);
				windProfile[i] = Double.parseDouble(buffer[2]);
				bioMassProfile[i] = Double.parseDouble(buffer[3]);
				bioGasProfile[i] = Double.parseDouble(buffer[4]);
				solarProfile[i] = Double.parseDouble(buffer[5]);
				}
			}
	    
	    br.close();
	    //System.out.println(Arrays.toString(timeProfile));
	    System.out.println("SWM Profiles available");
	    System.out.println("****************************************************************");
	    
	}
}
