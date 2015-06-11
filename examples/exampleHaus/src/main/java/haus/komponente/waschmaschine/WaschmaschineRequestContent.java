package haus.komponente.waschmaschine;

import haus.komponente._messageContents._eVerbraucherRequestContent;
import haus.komponente._schedule.Auftrag;

/**
 * WaschmaschineRequestContent
 * Implementiert den Request an eine Waschmaschine
 * Folgende Steuerungen sind möglich:
 * 1. neuen Auftrag übermitteln (istNeuerAuftrag, neuerAuftrag)
 * 		->initNeuerWaschAuftrag(ProgrammID)
 * 		->initNeuerWaschAuftragStart(Timestep)
 * 		->initNeuerWaschAuftragEnde(Timestep)
 * 2. bei vorhandenem Auftrag Verbraucher aktivieren.
 * 		a. (AutomatikModus) Automatisch über die erlaubte Leistungsaufnahme abhängig von einem Schwellenwert 
 * 			(istModusAutomatik, expectedConsumption, expectedConsumptionMAX, schwellenwert)
 * 			->initSetupModusAutomatik(expectedConsumption,expectedConsumptionMAX,schwellenwert)
 * 		b. direkt über das Request
 * 			->activateModusAN()
 * 			->activateModusAbschnittAN()
 * 			->activateModusAUS()
 * 			...
 * 3.Frist verändern
 * 			->getNeuerAuftrag().setTimestepPlanedFinished(TimestepEnde)
 * 27.08.2014
 * @author Markus
 * FERTIG
 * TODO Prüfen
 */
public class WaschmaschineRequestContent extends _eVerbraucherRequestContent{
	/**
	 * Standardrequest
	 * @param name dient zur eindeutigen Identifikation zwischen Answer und Request
	 */
	public WaschmaschineRequestContent(String name) {
		super(name, null, null);
	}
	/**
	 * Lädt das genünschte Waschprogramm und speichert es im Request
	 * @param ProgrammID 	0:Standard {[1500,200],[100,200,100],[400,750,750]}	
	 * 						1:Intensiv TODO
	 * @return Erfolg?
	 */
	public boolean initNeuerWaschAuftrag(int ProgrammID){
		Auftrag waschprogramm = new Auftrag(0,0);
		switch(ProgrammID){
			case 0:{
				//Auftrag mit Waschprogramm 0 befüllen...
				double[] teilauftrag1 = {1500,2};
				waschprogramm.addTeilauftrag(teilauftrag1);
				double[] teilauftrag2 = {100,200,100};
				waschprogramm.addTeilauftrag(teilauftrag2);
				double[] teilauftrag3 = {400,750,750};
				waschprogramm.addTeilauftrag(teilauftrag3);
				break;
			}
			default:{
				error("initNeuerWaschAuftrag("+ProgrammID+"): ProgrammID ungueltig!");
			}
		}
		return setNeuerAuftrag(waschprogramm);
	}
	/**
	 * Initialisiert den gewünschten Start des Auftrags
	 * @param TimestepStart Start
	 * @return Erfolg?
	 */
	public boolean initNeuerWaschAuftragStart(int TimestepStart){
		if(isNeuerAuftrag()){
			getNeuerAuftrag().setTimestepCreated(TimestepStart);
			return true;
		}
		debug("Kein Auftrag vorhanden!");
		return false;
	}
	/**
	 * Initialisiert das gewünschte Ende des Auftrags
	 * @param TimestepEnde Ende
	 * @return Erfolg?
	 */
	public boolean initNeuerWaschAuftragEnde(int TimestepEnde){
		if(isNeuerAuftrag()){
			getNeuerAuftrag().setTimestepPlanedFinished(TimestepEnde);
			return true;
		}
		debug("Kein Auftrag vorhanden!");
		return false;
	}
	/**
	 * Aktiviert den Automatikmodus und initialisiert Request mit übergebenen Parametern.
	 * @param expectedConsumption Gewünschter Verbrauch. Länge: 96 Angabe in Timestep, d.h. 1/4Stunden
	 * @param expectedConsumptionMAX Gewünschter maximaler Verbrauch. Länge: 96 Angabe in Timestep, d.h. 1/4Stunden
	 * @param schwellenwert 
	 * @return
	 */
	public boolean initSetupModusAutomatik(double[] expectedConsumption, double[] expectedConsumptionMAX, double schwellenwert){
		setExpectedConsumption(expectedConsumption);
		setExpectedConsumptionMAX(expectedConsumptionMAX, 0);
		activateModusAutomatik(schwellenwert);
		return true;
	}
}
