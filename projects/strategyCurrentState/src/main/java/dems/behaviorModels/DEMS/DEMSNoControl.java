/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package dems.behaviorModels.DEMS;

import helper.IoHelper;
import helper.MyDateTimeFormatter;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import akka.systemActors.GlobalTime;
import behavior.BehaviorModel;

import com.google.gson.Gson;

import dems.Simulation;
import dems.helper.DEMSSchedule;
import dems.helper.PowerPlantProperties;
import dems.messageContents.DEMSAggregatorAnswerContent;
import dems.messageContents.DEMSRequestContent;
import dems.messageContents.GenericAnswerContent;
import dems.messageContents.IndividualRequest;

/**
 * DEMSAggregator bekommt alle Nachrichten und kann diese Verarbeiten
 * 
 * @author bytschkow
 */

public class DEMSNoControl extends BehaviorModel{
	
    public DEMSAggregatorAnswerContent answerContentToSend = new DEMSAggregatorAnswerContent(0.0,0.0);
    public DEMSRequestContent requestContentToSend = new DEMSRequestContent();
    
    public double actualAggregatedPowerProduction = 0.0;
    public double expectedAggregatedPowerProduction = 0.0;
	public double scheduledPowerProduction = 0.0;
	
	// costs of the System
	public double costPowerPlants = 0.0;
	public double costPunishment = 0.0;
	public double costPurchase = 0.0;
	public double costTotalPowerPlants = 0.0;
	public double costTotalPunishment = 0.0;
	public double costTotalPurchase = 0.0;
	public double earnings = 0.0;	

	// PowerPlantProperties handling
	public ArrayList<PowerPlantProperties> powerPlantList = new ArrayList<PowerPlantProperties>();
	public PowerPlantProperties selectedPowerPlant;
	public ArrayList<IndividualRequest> individualRequestList = new ArrayList<IndividualRequest>();
	public boolean powerPlantListAvailable = false;
	public boolean powerPlantListSorted = false;
    
    public boolean fileWritten = false;    
    
    /*
     * Constructor
     */
    public DEMSNoControl() {
    	this.actorName = "DEMSNoControl";
    }
	
	@Override
	public void handleRequest() {
		scheduledPowerProduction = DEMSSchedule.getSchedule(GlobalTime.currentTime);			
    	requestContentToSend.reductionFactor = 1;
    	requestContentToSend.individualContent = false;
	}

	@Override
    public void makeDecision() {
    	actualAggregatedPowerProduction = 0.0;
    	expectedAggregatedPowerProduction = 0.0;
    	costPowerPlants = 0.0;
    	costPurchase = 0.0;
    	costPunishment = 0.0;
    	
    	double guesses = 0.0;

      	for (BasicAnswer message : super.answerListReceived){
    		if (message.answerContent instanceof GenericAnswerContent) {    			    			
    			GenericAnswerContent answer = (GenericAnswerContent) message.answerContent;
    			
    			// Filtere den Handel aus der Aggregation raus, damit man diesen separat behandelt
    			String childName = message.senderPath.substring(message.senderPath.lastIndexOf("/")+1, message.senderPath.length());    			
    			if (childName.equals(".Handel")) costPurchase = answer.currentProduction * answer.costs / 1e3;
    			
    			// Aggregiere alle Daten
				actualAggregatedPowerProduction += answer.currentProduction;
    			costPowerPlants += answer.currentProduction * answer.costs / 1e3;
    			expectedAggregatedPowerProduction += answer.expectedProduction;
    			
    			if (!answer.communicationOK) guesses += answer.currentProduction;
    		}
    	}
      	
      	final double PERIOD = GlobalTime.period.getSeconds() / 3600.0;
      	
      	costPowerPlants -= costPurchase;
      	// Punishment costs 150 �/MWh --> 0.15�/kWh (is a little hacky but works)
      	costPunishment = Math.abs(actualAggregatedPowerProduction - scheduledPowerProduction) * 0.15;
      	
      	costTotalPowerPlants += costPowerPlants * PERIOD;
      	costTotalPunishment  += costPunishment * PERIOD;      	
      	costTotalPurchase  += costPurchase * PERIOD;
      	
    	answerContentToSend.currentProduction = actualAggregatedPowerProduction;
    	answerContentToSend.expectedProduction = expectedAggregatedPowerProduction;
    	answerContentToSend.time = GlobalTime.currentTimeStep;
    	answerContentToSend.dateTime = GlobalTime.currentTime.format(MyDateTimeFormatter.formatter);
    	answerContentToSend.scheduledProduction = scheduledPowerProduction;
    	answerContentToSend.cpMinusGuesses = actualAggregatedPowerProduction - guesses;
    	
    	answerContentToSend.costPowerPlants = costPowerPlants;
    	answerContentToSend.costPunishment = costPunishment;
    	answerContentToSend.costPurchase = costPurchase;
    	answerContentToSend.costTotalPowerPlants = costTotalPowerPlants;
    	answerContentToSend.costTotalPunishment = costTotalPunishment;
    	answerContentToSend.costTotalPurchase = costTotalPurchase;
    	
    	answerContentToSend.OUT = answerContentToSend.toHtml();    	    
    	
    	if(true){
    		System.out.println(actorName + ": " + requestContentToSend);
    		System.out.println(actorName + ": " + answerContentToSend);
    	}
    	
    	if(!fileWritten){
    		createJsonStrings();
    		addDatatoJson();
    	}
    }
	
	Gson gson = new Gson();
    ArrayList<String> jsonStringList = new ArrayList<String>();
    boolean jsonStringsNotInitiated = true;
    String jsonString = "";    
    
	private void addDatatoJson() {
		jsonString = jsonString + gson.toJson(answerContentToSend)+ ",\n";		
		
		int i = 0;
		for (BasicAnswer message : super.answerListReceived){			
			String string = jsonStringList.get(i);
			string = string + gson.toJson(message.answerContent) + ",\n";
			jsonStringList.set(i, string);
			i++;
		}		
		
		if (GlobalTime.currentTimeStep + 1 == GlobalTime.lastTimeStep){			
			jsonString = jsonString.substring(0, jsonString.length()-2) +"], \n\"children\" : [";
			for (int j = 0; j < super.answerListReceived.size(); j++){
				String string = jsonStringList.get(j);
				string = "{" + string.substring(0, string.length()-2) + "]}";				
				jsonString = jsonString + string + ",";				
			}
			jsonString = jsonString.substring(0, jsonString.length()-1) + "]}";
			printJsonFile();
			fileWritten = true;
		}
	}
    
	private void createJsonStrings() {
		if (jsonStringsNotInitiated){			
			jsonString = "{\"name\" : \""+ this.actorName+"\" ,\n "+ getProperties() +" \"data\": [\n";
			
			for (BasicAnswer message : super.answerListReceived){
				String sender = message.senderPath;
			    sender = sender.substring(sender.lastIndexOf('/')+1, sender.length());
				jsonStringList.add("\"name\" : \""+ sender + "\" ,\n "
						+ "\"data\": [\n" );				
			}			
			jsonStringsNotInitiated = false;
		}
	}

	private String getProperties() {
		DecimalFormatSymbols format = new DecimalFormatSymbols(Locale.ENGLISH);
		DecimalFormat df = new DecimalFormat("#0.0", format);
		String result = "";
		double installedPower = 0;
		
		for (BasicAnswer message : super.answerListReceived){
    		if (message.answerContent instanceof GenericAnswerContent) {
    			GenericAnswerContent answer = (GenericAnswerContent) message.answerContent;
    			installedPower += answer.installedPower;
    		}
    	}
		
		String properties = "Installierte Leistung: " + df.format(installedPower) + " kW";				
		result = " \"properties\": \""+ properties +"\",";		
		return result;
		
	}

	/**
	 * This method prints the Results as a JSON file
	 */
	private void printJsonFile() {
		System.out.println("Writing the files... path: " + Simulation.fileName);
		
		String path = System.getProperty("user.home") + "/sessim/VPP-Grid-Simulation/Input/DEMSResults.json";
		IoHelper.saveFile(path, jsonString);

		path = System.getProperty("user.home") + "/www2/root/simulation/data/"+Simulation.fileName;
		IoHelper.saveFile(path, jsonString);
		
//		try {
//			// Write the file in a global folder
//			
//
//			
//			
//			//FileWriter writer = new FileWriter(path + "/Sessim/VPP-Grid-Simulation/Input/DEMSResults.json");
//			//writer.write(jsonString);
//			//writer.close();
//			
//			// Write the file in a www folder
////			writer = new FileWriter("~/xampp/htdocs/root/simulation/data/"+Simulation.fileName);
////			writer.write(jsonString);
////			writer.close();
//	 
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return answerContentToSend;
	}
	
	@Override
	public RequestContent returnRequestContentToSend() {
		return requestContentToSend;
	}
	

	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {}
}