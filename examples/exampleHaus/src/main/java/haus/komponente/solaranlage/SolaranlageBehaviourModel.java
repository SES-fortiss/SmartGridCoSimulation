package haus.komponente.solaranlage;

import haus.komponente._behaviorModel._ErzeugerBehaviourModel;
import haus.komponente._schedule.__BasicSchedule;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;

/**
 * SolaranlageBehaviourModel
 * Implementiert das Verhalten einer Solaranlage
 * Verhalten:
 * Beim initialisieren wird ein __BasicSchedule übergeben, der die Kennlinie des Tages im 
 * Viertelstundentakt speichert(Maximalerzeugung, Delta)
 * Möglichkeiten der Regelung:
 * 1. Absolute Leistungsbegrenzung
 * 2. Absolute Unsicherheitsbegrenzung (für konstantere Produktionswerte
 * 3. ??
 * Information an EMS: (siehe _ErzeugerAnswerContent)
 * 1. Standardwerte, wie name, currentConsumption, futureConsumption (2-Stunden-Vorhersage), consumptionMIN, consumptionMAX
 * 2. Erzeugerspezifisch: futureConsumptionDelta (2-Stunden-Vorhersage)
 * 
 * Tests durchgeführt: 
 * 1. Konstruktor 									OK
 * 2. Verhalten nach Request (zeitunabhängig) 		OK
 * 3. Verhalten nach Request (zeitabhängig)			OK
 * 4. Requests emfangen								OK
 * 5. Antwort senden								OK
 * 6. Ungültige Requests senden -> Fehlerbehandlung	OK
 * 
 * 
 * 01.06.2014
 * @author Markus
 * FERTIG (Getestet, funktioniert)
 */
public class SolaranlageBehaviourModel extends _ErzeugerBehaviourModel{
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
	public SolaranlageAnswerContent getAnswer(){		return ((SolaranlageAnswerContent)answer);}
	public SolaranlageRequestContent getRequest(){	return ((SolaranlageRequestContent)request);}
	public void error(String text){	System.out.println("ERROR: (SolaranlageBehaviourModel)"+text);	}
	public void debug(String text){	if(isDebug){System.out.println("DEBUG: (SolaranlageBehaviourModel)"+ text);}}
	
//Variablen <-----------------------------------------------------------------------------------------
	public __BasicSchedule schedule;
//Konstruktoren <--------------------------------------------------------------------------------------
	/**
	 * Standardkonstruktor
	 * @param answer Initilaantwort
	 * @param request Initialrequest
	 * @param schedule InitialSchedule beeinhaltet die Kennlinie des Tages der Solaranlage (abhängig von Jahreszeit, Wettter...)
	 */
	public SolaranlageBehaviourModel(SolaranlageAnswerContent answer, SolaranlageRequestContent request, __BasicSchedule schedule) {
		super(answer, request);
		this.schedule = schedule;
		debug("Konstruktor aufgerufen!!");
	}
		
//Methoden aus BehaviourModel <------------------------------------------------------------------------		
	@Override
	public void makeDecision() {
		if(this.getActualTimeStep()==36){
			debug("Checkpoint");
		}
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
			SolaranlageRequestContent befehl = (SolaranlageRequestContent) requestContentReceived;
			if(befehl.name == getAnswer().name){
				request = befehl;
				repairRequest();
				debug("SolaranlageBehaviourModel.updateRequest() hat request geupdatet");
				return true;
			}else{
				debug("SolaranlageBehaviourModel.updateRequest() hat request NICHT geupdatet");
			}
		}catch(Exception e){}
		return false;
	}
	@Override
	public boolean step2simulateStep() {
		//currentConsumption ändern
		getAnswer().setCurrentConsumption(getAnswer().getFutureConsumption(0)+Math.random()*getAnswer().getFutureConsumptionDelta(0));
		//futureConsumption ändern
		for(int i = 0; i < 7 ; i++){
			getAnswer().setFutureConsumption(getAnswer().getFutureConsumption(i+1), i);
			getAnswer().setFutureConsumptionDelta(getAnswer().getFutureConsumptionDelta(i+1), i);
		}
		getAnswer().setFutureConsumption(0, 7);
		getAnswer().setFutureConsumptionDelta(0, 7);
		return true;
	}
	/**
	 * Wird nicht benötigt!!!
	 */
	@Override
	public boolean step3simulateInflueces() {
		//Erstmal keine unvorhersehbaren Ereignisse!!!
		return false;
	}
	@Override
	public boolean step4calculateFutureConsumption() {
		loadWeather();
		begrenzeLeistung();
		begrenzeDelta();
		return true;
	}
	@Override
	public boolean step5updateAnswer() {
		return false;
	}
//Hilfsmethoden-Solaranlagenspezifisch <---------------------------------------------------------------
	/**
	 * Aktualisiert FutureConsumption[] und setFutureConsumptionDelta[] auf Basis des Wetters.
	 * Bezieht die Daten aus dem im Konstruktor übergebenen Schedule
	 * TESTED
	 */
	private void loadWeather() {
		for(int i = 0 ; i < 8 ; i++){
			getAnswer().setFutureConsumption(schedule.getSolarConsumption(this.getActualTimeStep()+1+i), i);
			getAnswer().setFutureConsumptionDelta(schedule.getSolarConsumptionDelta(this.getActualTimeStep()+1+i), i);
		}
	}
	/**
	 * überprüft FutureConsumption[] und FutureConsumptionDelta[] und begrenzt ggf. die Leistung
	 * TESTED
	 */
	private void begrenzeLeistung() {
		for(int i = 0 ; i < 8 ; i++){
			double delta = getAnswer().getFutureConsumption(i) - getRequest().getExpectedConsumptionMIN(this.getActualTimeStep()+1+i);
			if(getRequest().getExpectedConsumptionMIN(this.getActualTimeStep()+1+i)>0){delta = getAnswer().getFutureConsumption(i);}
			if(delta < 0){
				//Leistungsabgabe zu hoch -> Leistung begrenzen
				debug("Leistungsbegrenzung in futureConsumption["+i+"] Requestbegrenzung: "+getRequest().getExpectedConsumptionMIN(this.getActualTimeStep()+1+i)+" FutureConsumption["
						+ i + "]="+ getAnswer().getFutureConsumption(i));
				getAnswer().changeFutureConsumptionDelta(delta, i);
				getAnswer().setFutureConsumption(getRequest().getExpectedConsumptionMIN(this.getActualTimeStep()+1+i), i);
			}
		}		
	}
	/**
	 * Begrenzt den Zufälligen Anteil, indem futureConsumption[0] 
	 * um FutureConsumptionDelta[0] geändert wird zugunsten der Stabilität
	 * TESTED
	 */
	private void begrenzeDelta() {
		for(int i = 0 ; i < 8 ; i++){
			//System.out.println(this.getActualTimeStep()+1+i);
			double delta = getAnswer().getFutureConsumptionDelta(i) - getRequest().getexpectedConsumptionDeltaMAX(this.getActualTimeStep()+1+i);
			if(getRequest().getexpectedConsumptionDeltaMAX(this.getActualTimeStep()+1+i)<0){delta = getAnswer().getFutureConsumptionDelta(i);}
			if(delta>0){
				//absoluter Unsicherheitswert zu hoch -> Maximalleistung um delta reduzieren
				debug("DeltaBegrenzung in futureConsumption["+i+"] Requestbegrenzung: "+getRequest().getexpectedConsumptionDeltaMAX(this.getActualTimeStep()+1+i)+" FutureConsumptionDelta["
						+ i + "]="+ getAnswer().getFutureConsumptionDelta(i));
				getAnswer().changeFutureConsumptionDelta(-delta, i);
				double neuVerbrauch = getAnswer().getFutureConsumption(i) + delta;
				getAnswer().setFutureConsumption(neuVerbrauch, i);
			}
		}
	}
	/**
	 * Hilfsmethode zu updateRequest()
	 * Verändert evtl falsche/unrealistische Eingaben
	 * Bsp.: futureConsumption > consumptionMAX -> futureConsumption = consumptionMAX
	 */
	public void repairRequest() {
		for(int i = 0 ; i < 96 ; i++){
			if(getRequest().getExpectedConsumptionMIN(i)>0){
				getRequest().setExpectedConsumptionMIN(0,i);
			}
			if(getRequest().getExpectedConsumptionMAX(i)!=0){
				getRequest().setExpectedConsumptionMAX(0, i);
			}
			//neue Reparaturen einfügen, wenn nötig
		}		
	}

	


	

	/* (non-Javadoc)
	 * @see behavior.BehaviorModel#handleError()
	 */
	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {
		
	}

}
