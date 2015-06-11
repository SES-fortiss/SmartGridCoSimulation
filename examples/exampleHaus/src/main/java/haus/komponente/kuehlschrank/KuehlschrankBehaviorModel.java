package haus.komponente.kuehlschrank;

import haus.komponente._behaviorModel._iVerbraucherBehaviorModel;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;

/**
 * KuehlschrankBehaviorModel
 * Implementiert einen intelligenten, steuerbaren Kühlschrank.
 * Reagiert auf Requests mit dem in _iVerbraucherbehaviorModel implementiertem calculateFairConsumption-Verhalten
 * d.h. die Variablen expectedConsumption[], expectedConsumptionMIN[] und expectedConsumptionMAX[] werden betrachtet.
 * Angenommen wird ein Kühlschrank, der Energieeffizienzklasse a+++ hat 
 * 
 * Tests:
 * Realitätsnah OK verbrauch ca. 0.26-0.33kWh/24h -> ca. 100kWh/a
 * Werte auüerhalb des zulässigen Bereichs (consumptionMIN/MAX) OK
 * falsche Requestwerte OK
 * Speicher leeren OK
 * Mindestleistung OK
 * überfüllen OK
 * 
 * 05.08.2014
 * @author Markus
 * FERTIG
 */
public class KuehlschrankBehaviorModel extends _iVerbraucherBehaviorModel{
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
	public KuehlschrankAnswerContent getAnswer(){		return ((KuehlschrankAnswerContent)answer);}
	public KuehlschrankRequestContent getRequest(){	return ((KuehlschrankRequestContent)request);}
	public void error(String text){	System.out.println("ERROR: (KuehlschrankBehaviorModel)"+text);	}
	public void debug(String text){	if(isDebug){System.out.println("DEBUG: (KuehlschrankBehaviorModel)"+ text);}}

//Implementierte Methoden <------------------------------------------------------------------------
	/**
	 * Standardkonstruktor
	 * @param answer spezifische Antwort mit spezifischen Attributen für diesen Kühlschrank
	 * @param request Standard-Request für diesen Kühlschrank
	 */
	public KuehlschrankBehaviorModel(KuehlschrankAnswerContent answer,
			KuehlschrankRequestContent request) {
		super(answer, request);
		debug("Konstruktor aufgerufen!!");
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
		return null;
	}
	
//Methoden aus __BasicBehaviorModel <------------------------------------------------------------------
	@Override
	public boolean step1updateRequest() {
		try{	
			KuehlschrankRequestContent befehl = (KuehlschrankRequestContent) requestContentReceived;
			if(befehl.name == getAnswer().name){
				request = befehl;
				repairRequest();
				debug("KuehlschrankBehaviourModel.updateRequest() hat request geupdatet");
				return true;
			}/*else{
				debug("KuehlschrankBehaviourModel.updateRequest() hat request NICHT geupdatet");
			}*/
		}catch(Exception e){}
		repairRequest();
		return false;
	}
	@Override
	//OK
	public boolean step3simulateInflueces() {
		double aenderung = 0;
		//ändert den Buffer aufgrund äußerlichen Einflüssen, wie z.B. öffnen der Tür
		//Annahme: Kühlschnrank mit 300 Litern Luft wovon 100 Liter durch das öffnen 
		//der Tür durch Luft im Raum ausgetauscht werden: 100Liter=128g
		//dE = 0,128*dT*1kJ ~ 2,3kJ(mit dT~18) 
		//dPuffer = dE/Wirkungsgrad *4 = 46
		int TS = this.getActualTimeStep();
		int haeufigkeit = 1;
		double propability = 0.1;
		if(TS>24&&TS<30){ haeufigkeit = 1; propability = 0.3;}
		if(TS>40&&TS<52){ haeufigkeit = 1; propability = 0.3;}
		if(TS>72&&TS<80){ haeufigkeit = 1; propability = 0.3;}
		for(int i = 0 ; i < haeufigkeit ; i++){
			if(Math.random()<propability){
				//Tür geöffnet
				aenderung += 46;
			}
		}
		getAnswer().changeBuffer(-aenderung);
		return true;
	}
	/**
	 * Bestimmt abhängig vom Zeitschritt die Änderung des Puffers.
	 * @param actTimestep aktueller Timestep
	 * @return Änderung [Wh/4] +:Energie wird Verbraucht
	 * TODO nicht mehr gebraucht
	 */
	public double helpstep3simulateInfluenceOfBuffer(int actTimestep){
		double aenderung = 0;
		//ändert den Buffer aufgrund äußerlichen Einflüssen, wie z.B. öffnen der Tür
		//Annahme: Kühlschnrank mit 300 Litern Luft wovon 100 Liter durch das öffnen 
		//der Tür durch Luft im Raum ausgetauscht werden: 100Liter=128g
		//dE = 0,128*dT*1kJ ~ 2,3kJ(mit dT~18) 
		//dPuffer = dE/Wirkungsgrad *4 = 46
		int TS = actTimestep;
		int haeufigkeit = 1;
		double propability = 0.05;
		if(TS>24&&TS<30){ haeufigkeit = 1; propability = 0.3;}
		if(TS>40&&TS<52){ haeufigkeit = 1; propability = 0.3;}
		if(TS>72&&TS<80){ haeufigkeit = 1; propability = 0.3;}
		for(int i = 0 ; i < haeufigkeit ; i++){
			if(Math.random()<propability){
				//Tür geöffnet
				aenderung += 46;
			}
		}
		return aenderung;
	}

//Hilfsmethoden! <-------------------------------------------------------------------------------------	
	/**
	 * Hilfsmethode zu updateRequest()
	 * Ver�ndert evtl falsche/unrealistische Eingaben
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
	}
	
	public void handleError(LinkedList<ErrorAnswerContent> errors) {}
	/**
	 * Simuliert/berechnet den Mindestbedarf an Energie, den der Verbraucher in length Zeitschritten ab 
	 * Timestep actTimestep mindestens aufnimmt
	 * Kühlschrank: Energieeffizienzklass a+++ benötigt 75kWh/a ~9Watt
	 * @param length Anzahl Simulationsschritte
	 * @param actTimestep Zeitschritt ab dem simuliert wird
	 * @return Mindestbedarf [WattStunden/4]
	 */
	public double getMindestbedarf(int length, int actTimestep) {
		//Verluste durch nicht perfekte Wärmeisolation
		return 5;
	}
}
