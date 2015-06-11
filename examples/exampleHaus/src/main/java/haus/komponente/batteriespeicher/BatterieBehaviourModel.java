package haus.komponente.batteriespeicher;

import haus.komponente._behaviorModel._SpeicherBehaviourModel;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;

/**
 * BatterieBehaviourModel
 * Implementiert das Verhalten einer Batterie
 * Verhalten:
 * Beim initialisieren können beliebige Werte übergeben werden, so dass ein beliebiger Zustand vorinitialisiert wird.
 * Die Batterie folgt solange den Requests, bis sie leer/voll ist. 
 * Falsche Werte der Requests werden auf das maximal mögliche im Konstruktor festgelegte verringert
 * Als Antwort wird eine Prognose der nächsten 2 Stunden geliefert.
 * UPDATE: Änderung auf Variable Leistungsaufnahme
 * 
 * Tests durchgeführt: 
1. Konstruktor
2. Batterie entleeren
3. Batterie aufladen
4. Requests emfangen
5. Antwort senden
6. Ungültige Requests senden -> Fehlerbehandlung
 

 * 30.05.2014
 * @author Markus
 * @version 1.0
 * FERTIG (getestet, funktioniert)
 */
public class BatterieBehaviourModel extends _SpeicherBehaviourModel{
//Abstrakte Methoden aus BehaviourModel <---------------------------------------------------------
	//public abstract void handleRequest();
    //public abstract void makeDecision();
    //public abstract void handleError(LinkedList<ErrorAnswerContent> errors);
    //public abstract AnswerContent returnAnswerContentToSend();
    //public abstract RequestContent returnRequestContentToSend();
//Abstrakte Methoden zum Aufteilen in kleinere Schritte (__BasicBehaviourModel) <-------------------
	//public abstract boolean step1updateRequest();
	//public abstract boolean step2simulateStep();
	//public abstract boolean step3simulateInflueces();
	//public abstract boolean step4calculateFutureConsumption();
	//public abstract boolean step5updateAnswer();
//Hilfsmethoden! <--------------------------------------------------------------------------------
	//Diese Methoden sollten in Unterklassen überschrieben werden!!!!
	public BatterieAnswerContent getAnswer(){		return ((BatterieAnswerContent)answer);}
	public BatterieRequestContent getRequest(){	return ((BatterieRequestContent)request);}
	public void error(String text){	System.out.println("ERROR: (BatterieBehaviourModel)"+text);	}
	public void debug(String text){	if(isDebug){System.out.println("DEBUG: (BatterieBehaviourModel)"+ text);}}

//Konstruktoren <--------------------------------------------------------------------------------------
	/**
	 * Standardkonstruktor
	 * @param answer
	 * @param request
	 */
	public BatterieBehaviourModel(BatterieAnswerContent answer, BatterieRequestContent request) {
		super(answer, request);
		//debug("Konstruktor aufgerufen!!");
	}
	
//Methoden aus BehaviourModel <------------------------------------------------------------------------
	
	@Override
	public void makeDecision() {
		//debug("makedecision aufgerufen");
		step1updateRequest();
		step2simulateStep();
		step3simulateInflueces();
		step4calculateFutureConsumption();
		step5updateAnswer();
	}
	@Override
	public void handleRequest() {
	}
	@Override
	public AnswerContent returnAnswerContentToSend() {
		return answer;
	}
	@Override
	public RequestContent returnRequestContentToSend() {
		return request;
	}
	
//Methoden aus __BasicBehaviorModel <------------------------------------------------------------------
	@Override
	public boolean step1updateRequest() {
		try{	
			BatterieRequestContent befehl = (BatterieRequestContent) requestContentReceived;
			if(befehl.name == getAnswer().name){
				request = befehl;
				repairRequest();
				debug("BatterieBehaviourModel.updateRequest() hat request geupdatet");
				return true;
			}else{
				debug("BatterieBehaviourModel.updateRequest() hat request NICHT geupdatet");
			}
		}catch(Exception e){}
		return false;
	}
	@Override
	public boolean step2simulateStep() {
		//currentCapacity ändern:
		getAnswer().changeCurrentCapacity(getAnswer().getCurrentConsumption());
		//currentConsumption ändern
		answer.setCurrentConsumption(answer.getFutureConsumption(0));
		//futureConsumption ändern
		for(int i = 0; i < 7 ; i++){
			answer.setFutureConsumption(answer.getFutureConsumption(i+1), i);
		}
		answer.setFutureConsumption(0, 7);
		return true;
	}
	@Override
	public boolean step3simulateInflueces() {
		//Erstmal keine unvorhersehbaren Ereignisse!!!
		return false;
	}
	@Override
	public boolean step4calculateFutureConsumption() {
		//NEU Variable Leistungsaufnahme:
		double maxCap = getAnswer().CapacityMAX;
		double actCap = getAnswer().getCurrentCapacity()+getAnswer().getCurrentConsumption();
		for(int i = 0 ; i < 8 ; i++){								//			  ->!
			if((actCap+getRequest().getExpectedConsumption(this.getActualTimeStep()+1+i))>=0){
				//! Erklärung: ActualTimestep: 2 -> 3-11 entspricht FurtureConsumption->!
				if((actCap+getRequest().getExpectedConsumption(this.getActualTimeStep()+1+i))<=maxCap){
					//Alles in Ordnung:                                                                      
					//! Erklärung: ActualTimestep: 2 -> 3-11 entspricht FurtureConsumption                 ->!
					getAnswer().setFutureConsumption(getRequest().getExpectedConsumption(getActualTimeStep()+1+i), i);
					actCap = actCap + getAnswer().getFutureConsumption(i);
				}else{
					//Zu hohe aktuelle Kapazit�t -> Die Batterie kann nicht mehr geladen werden.
					double rest = maxCap - actCap;
					getAnswer().setFutureConsumption(rest, i);
					actCap = actCap + rest;
				}
			}else{
				//Die Batterie ist leer. Die gew�nschte Leistung kann nicht abgegeben werden.
				getAnswer().setFutureConsumption(-actCap, i);
				actCap = 0;
			}
		}
		return false;
	}
	@Override
	public boolean step5updateAnswer() {
		return false;
	}

//Hilfsmethoden! <-------------------------------------------------------------------------------------
//Diese Methoden sollten in Unterklassen �berschrieben werden!!!!
	/**
	 * Hilfsmethode zu updateRequest()
	 * Ver�ndert evtl falsche/unrealistische Eingaben
	 * Bsp.: futureConsumption > consumptionMAX -> futureConsumption = consumptionMAX
	 */
	private void repairRequest() {
		for(int i = 0 ; i < 96 ;i++){
			if(getRequest().getExpectedConsumption(i)< getAnswer().getConsumptionMIN()){
				//Wert ist unter dem Minimum
				getRequest().setExpectedConsumption(getAnswer().getConsumptionMIN(), i);
			}
			if(getRequest().getExpectedConsumption(i) > getAnswer().getConsumptionMAX()){
				//Wert ist �ber Maximum
				getRequest().setExpectedConsumption(getAnswer().getConsumptionMAX(), i);
			}
		}
	}
	

	/* (non-Javadoc)
	 * @see behavior.BehaviorModel#handleError()
	 */
	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {
		//TODO
	}
}
