/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package dems.behaviorModels.DEMS;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import dems.Simulation;
import dems.helper.Costs;
import dems.helper.DEMSSchedule;
import dems.helper.PowerPlantProperties;
import dems.helper.SortCost;
import dems.messageContents.DEMSAggregatorAnswerContent;
import dems.messageContents.DEMSRequestContent;
import dems.messageContents.GenericAnswerContent;
import dems.messageContents.IndividualRequest;
import helper.IoHelper;
import helper.MyDateTimeFormatter;

/**
 * DEMSAggregator bekommt alle Nachrichten und kann diese Verarbeiten
 * 
 * @author bytschkow
 */

public class DEMSPriorityControl extends BehaviorModel{
	
    public DEMSAggregatorAnswerContent answerContentToSend = new DEMSAggregatorAnswerContent(0.0,0.0);
    public DEMSRequestContent requestContentToSend = new DEMSRequestContent();
    
    public double actualAggregatedPowerProduction = 0.0;
    public double expectedAggregatedPowerProduction = 0.0;
	public double scheduledPowerProduction = 0.0;

	// PowerPlantProperties handling
	public List<PowerPlantProperties> powerPlantList = new ArrayList<PowerPlantProperties>();
	public PowerPlantProperties selectedPowerPlant;
	public List<IndividualRequest> individualRequestList = new ArrayList<IndividualRequest>();
	public boolean powerPlantListAvailable = false;
	public boolean powerPlantListSorted = false;
    
    public boolean fileWritten = false;
	
    // some extra fields
    private double costPowerPlants;
	private double costPurchase;
	private double costPunishment;
	private double costTotalPowerPlants;
	private double costTotalPunishment;
	private double costTotalPurchase;
    
    /*
     * Constructor
     */
    public DEMSPriorityControl() {
    	this.actorName = "DEMSPriorityControl";
    }
	
	@Override
	public void handleRequest() {
		scheduledPowerProduction = DEMSSchedule.getSchedule(this.actor.getCurrentTime());			
    	requestContentToSend.reductionFactor = decideGeneralReductionFactor();    	
    	updatePlantList();
    	
    	if (powerPlantListAvailable){
    		requestContentToSend.individualContent = true;
    		
    		// Bestimme den Stellwert f�r der individuellen Anlagen
        	setIndividualContents();
        	
        	requestContentToSend.individualRequestList = individualRequestList;
    	} else {
    		requestContentToSend.individualContent = false;
    	}
	}

	@Override
    public void makeDecision() {
		
		LocalDateTime currentTime = this.actor.getCurrentTime();
		
    	actualAggregatedPowerProduction = 0.0;
    	expectedAggregatedPowerProduction = 0.0;
    	costPowerPlants = 0.0;
    	costPurchase = 0.0;
    	costPunishment = 0.0;
    	double guesses = 0.0;

    	for (BasicAnswer message : super.answerListReceived){
    		if (message.answerContent instanceof GenericAnswerContent) {    			    			
    			GenericAnswerContent answer = (GenericAnswerContent) message.answerContent;
    			
    			// Filtere den Handel aus der Aggregation, damit man diesen separat behandeln kann
    			String childName = message.senderPath.substring(message.senderPath.lastIndexOf("/")+1, message.senderPath.length());    			
    			if (childName.equals(".Handel")) costPurchase = answer.currentProduction * answer.costs / 1e3;
    			
				actualAggregatedPowerProduction += answer.currentProduction;
    			costPowerPlants += answer.currentProduction * answer.costs / 1e3;
    			expectedAggregatedPowerProduction += answer.expectedProduction;
    			
    			if (!answer.communicationOK) guesses += answer.currentProduction;
    		}
    	}
      	
      	final double PERIOD = this.actor.getTimeStepDuration().getSeconds() / 3600.0;
      	
      	costPowerPlants -= costPurchase;
      	costPunishment = Math.abs(actualAggregatedPowerProduction - scheduledPowerProduction) * Costs.PENALTY / 1e3;      	
      	costTotalPowerPlants += costPowerPlants * PERIOD;
      	costTotalPunishment  += costPunishment * PERIOD;      	
      	costTotalPurchase  += costPurchase * PERIOD;
      	
    	answerContentToSend.currentProduction = actualAggregatedPowerProduction;
    	answerContentToSend.expectedProduction = expectedAggregatedPowerProduction;
    	answerContentToSend.dateTime = currentTime.format(MyDateTimeFormatter.formatter);
    	answerContentToSend.scheduledProduction = scheduledPowerProduction;
    	answerContentToSend.cpMinusGuesses = actualAggregatedPowerProduction - guesses;
    	
    	answerContentToSend.costPowerPlants = costPowerPlants;
    	answerContentToSend.costPunishment = costPunishment;
    	answerContentToSend.costPurchase = costPurchase;
    	answerContentToSend.costTotalPowerPlants = costTotalPowerPlants;
    	answerContentToSend.costTotalPunishment = costTotalPunishment;
    	answerContentToSend.costTotalPurchase = costTotalPurchase;
    	
    	boolean test = false;
    	
    	if(test){
    		System.out.println(actorName + ": " + requestContentToSend);
    		System.out.println(actorName + ": " + answerContentToSend);
    	}
    	
    	if(!fileWritten){
    		createJsonStrings();
    		addDatatoJson();
    	}
    }
	
	Gson gson = new Gson();
    List<String> jsonStringList = new ArrayList<String>();
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
		
		if (this.actor.getCurrentTimeStep() + 1 == Simulation.getMaxTimeSteps()){				
			
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
			
			jsonString = "{\"name\" : \""+ this.actorName+"\" ,\n \"data\": [\n";
			
			for (BasicAnswer message : super.answerListReceived){
				String sender = message.senderPath;
			    sender = sender.substring(sender.lastIndexOf('/')+1, sender.length());
				jsonStringList.add("\"name\" : \""+ sender + "\" ,\n "
						+ "\"data\": [\n" );				
			}			
			jsonStringsNotInitiated = false;
		}
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
	
	private double decideGeneralReductionFactor() {        
		double reductionFactorToSend;
        if (scheduledPowerProduction >= expectedAggregatedPowerProduction){
        	reductionFactorToSend = 1.0;
        } else {
        	reductionFactorToSend = scheduledPowerProduction / expectedAggregatedPowerProduction;
        }
		return reductionFactorToSend;
	}
	
	private void updatePlantList() {
    	if(super.answerListReceived != null){
			for (BasicAnswer message : super.answerListReceived){
				updatePowerPlantList(message);    				
    		}
			powerPlantListAvailable = true;			
		}
    	
		if (!powerPlantListSorted) {			
			Collections.sort(powerPlantList, new SortCost());
			powerPlantListSorted = true;
		}
	}
	
    /**
	 *	 This method updates the PlantList Information based on the received Answers.
	 *   AND
	 *   Prepares the individual requests??
	 */
	private void updatePowerPlantList(BasicAnswer message) {		
		
		String childName = message.senderPath.substring(message.senderPath.lastIndexOf("/")+1, message.senderPath.length());
		
		if (message.answerContent instanceof GenericAnswerContent){
			GenericAnswerContent content = (GenericAnswerContent) message.answerContent;			
			
			int i = getListID(powerPlantList, childName);						
			if (i == -1){
				//System.out.println(childName + " " + content.type);
				PowerPlantProperties powerPlantProperties = new PowerPlantProperties(childName, content.installedPower, content.costs, content.expectedProduction, content.type);
				powerPlantList.add(powerPlantProperties);
				individualRequestList.add(new IndividualRequest(childName, 1.0));
				powerPlantListSorted = false;
			} else {
				powerPlantList.get(i).expectedProduction = content.expectedProduction;
				if (powerPlantList.get(i).cost != content.costs) {
					powerPlantListSorted = false;
				}
			}
		}		
	}

	/**
	 * Helper method for updatePlantList
	 * @return int of the Plant inside the list
	 */
	private int getListID(List<PowerPlantProperties> plantListIn, String identifier) {
		for (int i = 0; i < plantListIn.size(); i++) {			
			if (plantListIn.get(i).id.equals(identifier)) return i;			
		}
		return -1;
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return answerContentToSend;
	}
	
	@Override
	public RequestContent returnRequestContentToSend() {
		return requestContentToSend;
	}
	
	private void setIndividualContents() {

    	// Beachte: Die powerPlantList bereits nach aufsteigenden Kosten sortiert
    	double remainingPowerProductionToFill = scheduledPowerProduction;    	

    	for (int i = 0; i < powerPlantList.size(); i++) {
    		// Selektiere die ID aus der Liste
    		selectedPowerPlant = powerPlantList.get(i);
			individualRequestList.get(i).id = selectedPowerPlant.id;		
			
    		// Wenn noch was produziert werden soll 
    		if (remainingPowerProductionToFill > 0.0) {
    			
    			// Wenn mehr produziert werden soll als die Vorhersage 
				if (remainingPowerProductionToFill > selectedPowerPlant.expectedProduction) {
					
					// Teste ob sich das Kraftwerk hochregeln l�sst.
					if (selectedPowerPlant.upControl) {
						// Wenn mehr produziert werden soll, als installierte Leistung
						if (remainingPowerProductionToFill > selectedPowerPlant.installedPower) {
							individualRequestList.get(i).setPointPower = selectedPowerPlant.installedPower;
						} else {
							individualRequestList.get(i).setPointPower = remainingPowerProductionToFill;
						}
					} 
					// Wenn sich das nicht hochregeln l�sst, dann produzierte entsprechend der Vorhersage 
					else {
						individualRequestList.get(i).setPointPower = selectedPowerPlant.expectedProduction;						
					}
					
					remainingPowerProductionToFill -= individualRequestList.get(i).setPointPower;

				} else if (remainingPowerProductionToFill < selectedPowerPlant.expectedProduction){
					individualRequestList.get(i).setPointPower = remainingPowerProductionToFill;
					remainingPowerProductionToFill = 0.0;
				}
			} else individualRequestList.get(i).setPointPower = 0.0;
		}
    	
	}

	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {}
}