package haus.komponente._messageContents;

import haus.komponente._schedule.Auftrag;

/**
 * _eVerbraucherRequestContent
 * Implementiert den Standard-Request von dem EMS an einen aktivierbaren Verbraucher (Waschmaschine, Trockner,...)
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
 * 
 * 27.08.2014
 * @author Markus
 *
 */
public class _eVerbraucherRequestContent extends __BasicRequestContent{
	/**Siehe Klassenbeschreibung _eVerbraucherRequestContent*/
	private boolean istModusAN; /** Siehe Klassenbeschreibung _eVerbraucherRequestContent*/
	private boolean istModusAutomatik;/** Siehe Klassenbeschreibung _eVerbraucherRequestContent*/
	private boolean istModusAbschnittAN;
	/**
	 * Neuer Auftrag der von EMS erstellt wurde.
	 */
	private Auftrag neuerAuftrag;
	/**
	 * Wert zwischen 0 und 1, Wert(Verhältnis von erlaubter zu benötigter Leistungsaufnahme) der mindestens erreicht sein muss bevor ein neuer Abschnitt gestartet wird.
	 *  
	 * (nur im Automatikmodus wichtig) 
	 */
	private double schwellenwert;
	
	/**Standardkonstruktor*/
	public _eVerbraucherRequestContent(String name, double[] expectedConsumption, 
			double[] expectedConsumptionMAX){
		super(name,expectedConsumption,null,expectedConsumptionMAX);
		this.neuerAuftrag = null;
		this.schwellenwert = 0.8;
		this.istModusAN = false;
		this.istModusAutomatik = false;
		this.istModusAbschnittAN = false;
	}
	/**Aktiviert den AutomatikModus. Parameter schwellenwert*/
	public double activateModusAutomatik(double schwellenwert){
		this.istModusAN=false;
		this.istModusAbschnittAN = false;
		this.istModusAutomatik = true;
		this.schwellenwert = schwellenwert;
		if(this.schwellenwert<0.0){ this.schwellenwert=0;}
		if(this.schwellenwert>1.0){ this.schwellenwert=1;}
		return this.schwellenwert;
	}
	public boolean activateModusAbschnittAN(){
		this.istModusAbschnittAN = true;
		return this.istModusAbschnittAN;
	}
	public boolean activateModusAN(){
		this.istModusAN = true;
		return this.istModusAN;
	}
	/** Schaltet den Verbraucher aus (Der aktuelle Abschnitt wird noch abgearbeitet)*/
	public boolean activateModusAUS(){
		this.istModusAN = false;
		this.istModusAbschnittAN = false;
		this.istModusAutomatik = false;
		return true;
	}
	
	
	public double deactivateModusAutomatik(){
		this.istModusAutomatik = false;
		return this.schwellenwert;
	}
	public boolean deactivateModusAbschnittAN(){
		this.istModusAbschnittAN = false;
		return this.istModusAbschnittAN;
	}
	public boolean deactivateModusAN(){
		this.istModusAN = false;
		return this.istModusAN;
	}
	public boolean setNeuerAuftrag(Auftrag auftrag){
		if(auftrag==null){ return false;}
		this.neuerAuftrag = auftrag;
		return true;		
	}
	/**
	 * Aufrufen, wenn Auftrag von Request in Answer geladen wird.
	 * Löscht den Auftrag aus dem Request.
	 * @return Neuer Auftrag
	 */
	public Auftrag takeNeuerAuftrag(){
		Auftrag temp = this.neuerAuftrag;
		this.neuerAuftrag = null;
		return temp;
	}
	
	
	public boolean isNeuerAuftrag(){
		if(this.neuerAuftrag==null){ return false;}
		return true;
	}
	public boolean isModusAN(){
		return this.istModusAN;
	}
	public boolean isModusAutomatik(){
		return this.istModusAutomatik;
	}
	public boolean isModusAbschnittAN(){
		return this.istModusAbschnittAN;
	}
	public double getSchwellenwert(){
		return this.schwellenwert;
	}
	public Auftrag getNeuerAuftrag(){
		return this.neuerAuftrag;
	}
}
