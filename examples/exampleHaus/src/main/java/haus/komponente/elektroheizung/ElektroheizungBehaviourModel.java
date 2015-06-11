package haus.komponente.elektroheizung;

import haus.komponente._behaviorModel._iVerbraucherBehaviorModel;
import haus.komponente._schedule.HausSchedule;
import haus.komponente._schedule.__BasicSchedule;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;

import akka.basicMessages.RequestContent;

/**
 * ElektroheizungBehaviourModel
 * Implementiert eine intelligente, steuerbare Elektroheizung.
 * Reagiert auf Requests mit dem in _iVerbraucherbehaviorModel implementiertem calculateFairConsumption-Verhalten
 * d.h. die Variablen expectedConsumption[], expectedConsumptionMIN[] und expectedConsumptionMAX[] werden betrachtet.
 * In ElektroheizungAnswerContent sind spezifische Attribute, wie Buffergröße, Maximale Leistungsaufnahme... gespeichert.
 * 
 * Tests: (Verhalten gleich wie Kühlschrank)
 * Werte außerhalb des zulässigen Bereichs (consumptionMIN/MAX) 
 * falsche Requestwerte 
 * Speicher leeren 
 * Mindestleistung 
 * überfüllen 
 * 13.08.2014
 * @author Markus
 * FERTIG
 */
public class ElektroheizungBehaviourModel extends _iVerbraucherBehaviorModel{
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
//Abstrakte Methoden in _iVerbraucherBehaviourModel
	//public abstract double getMindestbedarf(int length, int actTimestep);
//Hilfsmethoden! <--------------------------------------------------------------------------------
	//Diese Methoden sollten in Unterklassen überschrieben werden!!!!
	public ElektroheizungAnswerContent getAnswer(){		return ((ElektroheizungAnswerContent)answer);}
	public ElektroheizungRequestContent getRequest(){	return ((ElektroheizungRequestContent)request);}
	public void error(String text){	System.out.println("ERROR: (ElektroheizungBehaviourModel)Name:"+getAnswer().name+text);	}
	public void debug(String text){	if(isDebug){System.out.println("DEBUG: (ElektroheizungBehaviourModel)Name:"+getAnswer().name+ text);}}

//Variablen <---------------------------------------------------------------------------------------------------
	/**
	 * über den schedule ist es möglich, unterschiedliche Verbrauchswerte
	 * zu testen die aufgrund unterschiedlichem Wetter, Jahreszeit,... entstehen.
	 */
	public __BasicSchedule schedule = new HausSchedule();
	
	/**
	 * Standardkonstruktor
	 * @param answer spezifische Antwort mit spezifischen Attributen für diese Heizung
	 * @param request Standard-Request für diese Heizung
	 */
	public ElektroheizungBehaviourModel(ElektroheizungAnswerContent answer,
			ElektroheizungRequestContent request, __BasicSchedule schedule) {
		super(answer, request);
		this.schedule = schedule;
		if(this.schedule == null){ this.schedule = new HausSchedule();}
		debug("Konstruktor aufgerufen: name:"+getAnswer().name);
	}
	
//Methoden aus BehaviourModel <------------------------------------------------------------------------

	@Override
	public void makeDecision() {
		debug("makedecision aufgerufen");
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
	public ElektroheizungAnswerContent returnAnswerContentToSend() {
		return (ElektroheizungAnswerContent)answer;
	}
	@Override
	public RequestContent returnRequestContentToSend() {
		return null;
	}
	
//Methoden aus __BasicBehaviorModel <------------------------------------------------------------------
	
	@Override
	public boolean step1updateRequest() {
		try{	
			ElektroheizungRequestContent befehl = (ElektroheizungRequestContent) requestContentReceived;
			if(befehl.name == getAnswer().name){
				request = befehl;
				repairRequest();
				debug("ElektroheizungBehaviourModel.updateRequest() hat Request geupdatet("+getAnswer().name+")");
				return true;
			}/*else{
				debug("ElektroheizungBehaviourModel.updateRequest() hat request NICHT geupdatet");
			}*/
		}catch(Exception e){}
		repairRequest();
		return false;
	}
	
	
	@Override
	public boolean step3simulateInflueces() {
		//Unerwartete Ereignisse: (noch nichts unerwartetes implementiert.
		//TODO
		return false;
	}
	
	


	
	/**
	 * Hilfsmethode zu updateRequest()
	 * Verändert evtl falsche/unrealistische Eingaben
	 * Bsp.: futureConsumption > consumptionMAX -> futureConsumption = consumptionMAX
	 */
	private void repairRequest() {
		for(int i = 0 ; i < 96 ; i++){
			//Request auf Maximale Leistungsaufnahme des Verbrauchers beschr�nken
			if(getRequest().getExpectedConsumption(i)>getAnswer().getConsumptionMAX()){
				getRequest().setExpectedConsumption(getAnswer().getConsumptionMAX(), i);
			}
			if(getRequest().getExpectedConsumptionMIN(i)>getAnswer().getConsumptionMAX()){
				getRequest().setExpectedConsumptionMIN(getAnswer().getConsumptionMAX(), i);
			}
			if(getRequest().getExpectedConsumptionMAX(i)>getAnswer().getConsumptionMAX()){
				getRequest().setExpectedConsumptionMAX(getAnswer().getConsumptionMAX(), i);
			}
			//Request auf minimale Leistungsaufnahme des Verbrauchers beschr�nken
			if(getRequest().getExpectedConsumption(i)<getAnswer().getConsumptionMIN()){
				getRequest().setExpectedConsumption(getAnswer().getConsumptionMIN(), i);
			}
			if(getRequest().getExpectedConsumptionMIN(i)<getAnswer().getConsumptionMIN()){
				getRequest().setExpectedConsumptionMIN(getAnswer().getConsumptionMIN(), i);
			}
			if(getRequest().getExpectedConsumptionMAX(i)<getAnswer().getConsumptionMIN()){
				getRequest().setExpectedConsumptionMAX(getAnswer().getConsumptionMIN(), i);
			}
			//ConsumptionMIN>Consumption
			if(getRequest().getExpectedConsumption(i)<getRequest().getExpectedConsumptionMIN(i)){
				getRequest().setExpectedConsumptionMIN(getRequest().getExpectedConsumption(i), i);
			}
			//ConsumptionMAX<Consumption
			if(getRequest().getExpectedConsumption(i)>getRequest().getExpectedConsumptionMAX(i)){
				getRequest().setExpectedConsumptionMAX(getRequest().getExpectedConsumption(i), i);
			}
			
		}
		//test
	}
	

	/* (non-Javadoc)
	 * @see behavior.BehaviorModel#handleError()
	 */
	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {}


	/**
	 * Simuliert/berechnet den Mindestbedarf an Energie, den der Verbraucher in length Zeitschritten ab 
	 * Timestep actTimestep mindestens aufnimmt
	 * Elektroheizung: Der Verbrauch wird aus dem Scheduler geladen. Er ist 
	 * abhängig von der Jahreszeit, Außentemperatur, Wetter,...
	 * @param length Anzahl Simulationsschritte
	 * @param actTimestep Zeitschritt ab dem simuliert wird
	 * @return Mindestbedarf [WattStunden/4]
	 */
	public double getMindestbedarf(int length, int actTimestep) {
		//Liest den Wert aus dem Schedule ein. Dieser gibt einen realistischen Wert abh�ngig von Wetter, Jahreszeit zur�ck.
		double aenderung = 0;
		for(int i = actTimestep ; i< actTimestep+length ; i++){
			aenderung += this.schedule.getWaermebedarf(i);
		}
		//debug("getMindestbedarf: Anderung um:"+aenderung);
		return aenderung;
	}
}
