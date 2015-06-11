package haus.komponente._behaviorModel;

import haus.komponente._messageContents._eVerbraucherAnswerContent;
import haus.komponente._messageContents._eVerbraucherRequestContent;
import haus.komponente._schedule.Auftrag;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;

/**
 * _eVerbraucherBehaviorModel
 * Stellt Methoden/Attribute zur Verfügung, die für jedes Verhalten eines ereignisgesteuerten Verbrauchers benötigt werden.
 * 06.10.2014
 * @author Markus
 * @version 1.0
 */
public abstract class _eVerbraucherBehaviorModel extends __BasicBehaviorModel{
//Abstrakte Methoden aus BehaviourModel <---------------------------------------------------------
	public abstract void handleRequest();
    //public abstract void makeDecision();
    public abstract void handleError(LinkedList<ErrorAnswerContent> errors);
    public abstract AnswerContent returnAnswerContentToSend();
    public abstract RequestContent returnRequestContentToSend();
//Abstrakte Methoden zum Aufteilen in kleinere Schritte (__BasicBehaviourModel) <-------------------
	public abstract boolean step1updateRequest();
	//public abstract boolean step2simulateStep();
	public abstract boolean step3simulateInflueces();
	//public abstract boolean step4calculateFutureConsumption();
	public abstract boolean step5updateAnswer();
//Hilfsmethoden! <--------------------------------------------------------------------------------
	//Diese Methoden sollten in Unterklassen überschrieben werden!!!!
	public _eVerbraucherAnswerContent getAnswer(){		return ((_eVerbraucherAnswerContent)answer);}
	public _eVerbraucherRequestContent getRequest(){	return ((_eVerbraucherRequestContent)request);}
	public void error(String text){	System.out.println("ERROR: (_eVerbraucherBehaviorModel)"+text);	}
	public void debug(String text){	if(isDebug){System.out.println("DEBUG: (_eVerbraucherBehaviorModel)"+ text);}}
    
	/**Standardkonstruktor*/
	public _eVerbraucherBehaviorModel(_eVerbraucherAnswerContent answer,
			_eVerbraucherRequestContent request) {
		super(answer, request);
	}	
	/*
	 * folgende Tests wurden ausgeführt:
	 * getAnteil()		OK
	 * decideActivate()	OK
	 * Modi getestet:
	 * 000				OK
	 * 001				OK
	 * 011				OK
	 * 1??				OK
	 */
	public void makeDecision() {
		step1updateRequest();
		step2simulateStep();
		step3simulateInflueces();
		step4calculateFutureConsumption();
		String debug = "FutureConsumption";
		for(int i = 0 ; i < 8 ; i++){
			debug = debug + "["+i+"]="+getAnswer().getFutureConsumption(i)+" ";
		}
		debug(debug);
		step5updateAnswer();
	}
	public boolean step2simulateStep() {
		//currentCapacity ändern:
		debug("step2:");
		getAnswer().setCurrentConsumption(getAnswer().getFutureConsumption(0));
		for(int i = 0 ; i < 7 ; i++){
			getAnswer().setFutureConsumption(getAnswer().getFutureConsumption(i+1), i);
		}
		double deb = getAnswer().getAuftrag().simulateStep();
		//Test: der Wert im Auftrag soll mit der aktuellen Leistung übereinstimmen!
		if(deb!=getAnswer().getCurrentConsumption()){ 
			debug("Test failed: 001");
		}
		debug("AuftragFertig:"+getAnswer().getAuftrag().istAuftragFertig());
		return true;
	}
	/**
	 * Folgende Steuerungen sind möglich:
	 * 1. neuen Auftrag übermitteln (istNeuerAuftrag, neuerAuftrag)
	 * 2. bei vorhandenem Auftrag Verbraucher aktivieren.
	 * 		a. (AutomatikModus) Automatisch über die erlaubte Leistungsaufnahme abhängig von einem Schwellenwert 
	 * 			(istModusAutomatik, expectedConsumption, expectedConsumptionMAX, schwellenwert)
	 * 		b. direkt über das Request
	 * 3.Frist verändern
	 * Verhalten: (istModusAN, istModusAutomatik, istModusAbschnittAN)
	 * 0 0 0: ausgeschaltet.
	 * 0 0 1: Bearbeitung des aktuellen Abschnitt, danach Standby
	 * 0 1 0: Automatikmodus (Aktivierung bei genügend erlaubter Leistung, oder aufgrund von Fristeinhaltung
	 * 0 1 1: Aktueller Abschnitt sofort bearbeiten, dann Automatikmodus
	 * 1 0 0: der Verbraucher bearbeitet ohne Beachtung der Leistungsaufnahme den Auftrag.
	 * 1 0 1:   "
	 * 1 1 0:   "
	 * 1 1 1:   "
	 */
	public boolean step4calculateFutureConsumption() {
		if(getRequest().isModusAN()==false&&getRequest().isModusAutomatik()==false&&getRequest().isModusAbschnittAN()==false){
			debug("Zustand 0 0 0");
			getAnswer().setFutureConsumption(calculateFutureConsumptionMode000());
			return true;
		}
		if(getRequest().isModusAN()==false&&getRequest().isModusAutomatik()==false&&getRequest().isModusAbschnittAN()==true){
			debug("Zustand 0 0 1");
			//0 0 1 -> 0 0 0 
			getAnswer().getAuftrag().startAbschnitt();
			getRequest().activateModusAUS();
			//Berechnung
			getAnswer().setFutureConsumption(calculateFutureConsumptionMode001());
			return true;
		}
		if(getRequest().isModusAN()==false&&getRequest().isModusAutomatik()==true&&getRequest().isModusAbschnittAN()==false){
			debug("Zustand 0 1 0");
			getAnswer().setFutureConsumption(calculateFutureConsumptionMode010());
			if(decideActivate(getAnswer().getAuftrag().getRestOfTeilauftrag(), 
					getRequest().getExpectedConsumption(), 
					getRequest().getExpectedConsumptionMAXArray(), 
					getRequest().getSchwellenwert(), 
					this.getActualTimeStep()+1)&&getAnswer().getAuftrag().istAN()==false&&getAnswer().getAuftrag().istAuftragFertig()==false){
				debug("step4calculateFutureConsumption()-010: Abschnitt starten");
				getAnswer().getAuftrag().startAbschnitt();
			}
			return true;
		}
		if(getRequest().isModusAN()==false&&getRequest().isModusAutomatik()==true&&getRequest().isModusAbschnittAN()==true){
			debug("Zustand 0 1 1");
			//0 1 1 -> 0 1 0
			debug("step4calculateFutureConsumption()-011: Abschnitt starten");
			getAnswer().getAuftrag().startAbschnitt();
			getRequest().deactivateModusAbschnittAN();
			//Berechnung
			getAnswer().setFutureConsumption(calculateFutureConsumptionMode011());
			return true;
		}
		if(getRequest().isModusAN()==true){
			debug("Zustand 1 ? ?");
			debug("step4calculateFutureConsumption()-1??: Abschnitt starten");
			getAnswer().getAuftrag().startAbschnitt();
			getAnswer().setFutureConsumption(calculateFutureConsumptionMode1XX());
			return true;
		}
		error("step4calculateFutureConsumption() meldet: Undefinierter Zustand");
		return false;
	}
	/**
	 * Hilfsmethode von step4calculateFutureConsumption
	 * @return berechnet den Verbrauch für Modus 0 0 0
	 */
	public double[] calculateFutureConsumptionMode000() {
		//Beenden des laufenden Abschnittes -> Danach keine Leistungsaufnahme
		double [] future = {0,0,0,0,0,0,0,0};
		if(getAnswer().getAuftrag().istAN()){
			double [] rest = getAnswer().getAuftrag().getRestOfTeilauftrag();
			for(int i = 0; i < rest.length && i < 8 ; i++ ){
				future[i] = rest[i];
			}
		}
		return future;
	}
	/**
	 * Hilfsmethode von step4calculateFutureConsumption
	 * @return berechnet den Verbrauch für Modus 0 0 1
	 */
	public double[] calculateFutureConsumptionMode001() {
		//Beenden des laufenden und (folgenden Abschnittes->joker=true) -> Danach keine Leistungsaufnahme
		double [] future = {0,0,0,0,0,0,0,0};
		Auftrag task = new Auftrag(getAnswer().getAuftrag());
		boolean joker = false;
		for(int i = 0 ; i < 8 ; i++){
			if(joker&&task.istAN()==false){
				task.startAbschnitt();
				joker=false;
			}
			future[i] = task.simulateStep();
		}
		return future;
	}
	/**
	 * Hilfsmethode von step4calculateFutureConsumption
	 * @return berechnet den Verbrauch für Modus 0 1 0
	 */
	public double[] calculateFutureConsumptionMode010() {
		double [] future = {0,0,0,0,0,0,0,0};
		Auftrag task = new Auftrag(getAnswer().getAuftrag());
		for(int i = 0 ; i < 8 ; i++){
			if(decideActivate(task.getRestOfTeilauftrag(),getRequest().getExpectedConsumption(),getRequest().getExpectedConsumptionMAXArray(),getRequest().getSchwellenwert(),getActualTimeStep()+1+i)){
				//Teilabschnitt ausführen:
				task.startAbschnitt();
				while(i<8&&task.istAN()){
					future[i] = task.simulateStep();
					i++;
				}
				i--;
			}
		}
		return future;
	}
	/**
	 * Hilfsmethode von step4calculateFutureConsumption
	 * @return berechnet den Verbrauch für Modus 0 1 1
	 */
	public double[] calculateFutureConsumptionMode011() {
		double[] future = {0,0,0,0,0,0,0,0};
		Auftrag task = new Auftrag(getAnswer().getAuftrag());
		task.startAbschnitt();
		int index = 0;
		while(index<8&&task.istAN()){
			future[index] = task.simulateStep();
			index++;
		}
		while(index < 8){
			if(decideActivate(task.getRestOfTeilauftrag(),
					getRequest().getExpectedConsumption(),
					getRequest().getExpectedConsumptionMAXArray(),
					getRequest().getSchwellenwert(),
					getActualTimeStep()+1+index)){
				//Teilabschnitt ausführen:
				task.startAbschnitt();
				while(index<8&&task.istAN()){
					future[index] = task.simulateStep();
					index++;
				}
			}
			index++;
		}
		return future;
	}
	/**
	 * Hilfsmethode von step4calculateFutureConsumption
	 * @return berechnet den Verbrauch für Modus 1 X X
	 */
	public double[] calculateFutureConsumptionMode1XX() {
		double[] future = {0,0,0,0,0,0,0,0};
		Auftrag task = new Auftrag(getAnswer().getAuftrag());
		for(int i = 0 ; i < 8 ; i++){
			task.startAbschnitt();
			future[i] = task.simulateStep();
		}
		return future;
	}
	/**
	 * Entscheidet, ob in Abhängigkeit von den übergebenen Parametern ab angegebenen Zeitpunkt der Teilabschnitt
	 * ausgeführt werden soll.
	 * @param neuerAbschnitt Leistungaufnahme in Timesteps, unbestimmte Länge des Arrays
	 * @param expectedConsumption gewünschte Leistungsaufnahme, von EMS
	 * @param expectedConsumptionMAX maximal gewünschte Leistungsaufnahme, von EMS
	 * @param schwellenwert Wert(Verhältnis von erlaubter zu benötigter Leistungsaufnahme) der mindestens erreicht sein muss bevor ein neuer Abschnitt gestartet wird.
	 * @param timestep zu überprüfender Timestep, die Teilaufgabe wird ab diesem Zeitpunkt ausgeführt
	 * @return true: Ausführung wünschenswert
	 * Fertig, getestet
	 */
	public boolean decideActivate(double[] neuerAbschnitt,
			double[] expectedConsumption, 
			double[] expectedConsumptionMAX, 
			double schwellenwert,
			int timestep) {
		//Auftrag wurde noch nicht gestartet...
		if(getActualTimeStep()<getAnswer().getAuftrag().getTimestepCreated()){ return false; }
		//Auftrag muss gestartet werden da er sonst nicht rechtzeitig fertig ist...
		if(getAnswer().getAuftrag().getRestAnzahlOfAuftrag()+this.getActualTimeStep()>=getAnswer().getAuftrag().getTimestepPlanedFinished()){return true;}
		//berechne Verbrauch...
		//berechne Verbrauch der erlaubt ist.
		//entscheide ob Verhältnis OK
		if(getAnteil(neuerAbschnitt, expectedConsumptionMAX, timestep)>=schwellenwert){
			//debug("decideActivate()=true");
			return true;
		}else{
			//debug("decideActivate()=false");
			return false;
		}
	}
	/**
	 * Berechnet den prozentualen Anteil der erlaubten Leistung zur benötigten Leistung
	 * HINWEIß: Hilfsmethode für decideActivate()
	 * @param neuerAbschnitt benötigte Leistung [Watt]
	 * @param erlaubt Erlaubte Leistung [Watt]
	 * @param timestep ab dem betrachtet wird.
	 * @return Anteil erlaubter Leistung / Gesammtleistung
	 */
	public double getAnteil(double[] neuerAbschnitt, double[] erlaubt, int timestep){
		//Fehlerprüfung
		if(neuerAbschnitt==null||erlaubt==null){ return 1;}
		//Berechnung
		double gesammtVerbrauchAbschnitt = 0;
		for(int i = 0 ; i < neuerAbschnitt.length ; i++){
			gesammtVerbrauchAbschnitt += neuerAbschnitt[i];
		}
		double gesammtVerbrauchErlaubt = 0;
		for(int i = 0 ; i < neuerAbschnitt.length ; i++){
			if(neuerAbschnitt[i]<=erlaubt[(timestep+i)%96]){
				gesammtVerbrauchErlaubt += neuerAbschnitt[i];
			}else{
				gesammtVerbrauchErlaubt += erlaubt[(timestep+i)%96];
			}
		}
		return gesammtVerbrauchErlaubt/gesammtVerbrauchAbschnitt;
	}
	/**Erledigt folgendes: 1.Lädt Auftrag in Answer*/
	public void repairRequest() {
		//Prüfen ob aktueller Auftrag fertig, wenn ja Auftrag aus Request laden falls vorhanden.
		if(getAnswer().getAuftrag().istAuftragFertig()&&getRequest().isNeuerAuftrag()){
			getAnswer().setAuftrag(getRequest().takeNeuerAuftrag());
			debug("Neuer Auftrag wurde in answer geladen!");
		}
	}
}