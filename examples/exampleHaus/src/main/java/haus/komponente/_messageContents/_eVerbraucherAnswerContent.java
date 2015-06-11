package haus.komponente._messageContents;

import haus.komponente._schedule.Auftrag;

/**
 * _eVerbraucherAnswerContent
 * Stellt allgemeine Attribute/Methoden zur Verfügung, die jeder ereignisgesteuerte Verbraucher unterstützt.
 * Implementiert Standard-Antwort von ereignisgesteuertem Verbrauchern(z.B. Waschmaschine, Trockner)an den EMS.
 * Wichtige Attribute: geerbte + wishFutureConsumption, needFutureConsumption, auftrag 
 * 06.10.2014
 * @see __BasicAnswerContent
 * @author Markus
 * @version 1.0
 */
public abstract class _eVerbraucherAnswerContent extends __BasicAnswerContent{
//Variablen <------------------------------------------------------------------------------------------------
	//futureConsumption: vom intelligenten Verbraucher geplante Stromverbrauch
	/**
	 * Speichert den Auftrag des Verbrauchers
	 */
	private Auftrag auftrag = new Auftrag(0,0);
	/**
	 * Wird vom intelligenten Verbraucher berechnet. Gibt den Verbrauch an wenn nicht abgeregelt wird.
	 * TODO Bezieht sich auf die Summe. jetzt noch nicht! Wahrscheinlich auch unpraktisch
	 * Bsp: Speicher ist voll und der Mindestverbrauch ist 100 -> {100,200,300,...}
	 */
	private double[] wishFutureConsumption = new double[8];
	/**
	 * Wird vom intelligenten Verbraucher berechnet. 
	 * Gibt den Grundbedarf an, den der Verbraucher in den nächsten 2 Stunden mindestens hat.
	 * TODO Bezieht sich auf die Summe. jetzt noch nicht! Wahrscheinlich auch unpraktisch
	 * Bsp: Speicher ist voll und der Mindestverbrauch ist 100 -> {100,200,300,...}
	 */
	private double[] needFutureConsumption = new double[8];
//Konstruktor <----------------------------------------------------------------------------------------------
	/**
	 * Standardkonstruktor (Erzeugung: -, Verbrauch: +)
	 * @param name eindeutige Identifikation zum BehaviorModel
	 * @param consumptionMAX maximale mögliche Leistungsaufnahme
	 * @param auftrag Startauftrag
	 */
	public _eVerbraucherAnswerContent(String name, double consumptionMAX, Auftrag auftrag) {
		super(name, 0, consumptionMAX);
		if(auftrag!=null){
			this.auftrag = auftrag;
		}
	}	
//Abstrakte Methoden <---------------------------------------------------------------------------------------
	
//Get-Set-Methoden <-----------------------------------------------------------------------------------------
	/**
	 * Setzt neuen Auftrag. 
	 * ACHTUNG: Der Auftrag wird nur gesetzt, wenn der alte abgeschlossen ist!
	 * @param auftrag neuer Auftrag
	 * @return Erfolg?
	 */
	public boolean setAuftrag(Auftrag auftrag){
		if(this.auftrag.istAuftragFertig()&&(auftrag!=null)){
			this.auftrag = auftrag;
			debug("setAuftrag() -> neuer Auftrag gespeichert");
			return true;
		}
		error("setAuftrag() -> alter Auftrag noch nicht abgeschlossen!");
		return false;
	}
	public Auftrag getAuftrag(){
		return this.auftrag;
	}
	/**
	 * gibt wishFutureConsumption als Array zurück
	 * @return wishFutureConsumption
	 */
	public double[] getWishFutureConsumption() {
		return wishFutureConsumption;
	}
	/**
	 * Gibt wishFutureConsumption an gesuchter Position zurück
	 * @param index (index+1)en Zeitschritt
	 * @return wishFutureConsumption[index]
	 */
	public double getWishFutureConsumption(int index) {
		if(index>=0 && index<8){
			return wishFutureConsumption[index];
		}
		return 0;
	}
	/**
	 * Aktualisiert wishFutureConsumption mit der übergebenen Liste
	 * HINWEIß: Bei zu kurzen Listen werden die übrigen Elemente auf den vorherigen Wert gesetzt
	 * HINWEIß: Beachte die Spezifikation von WishFutureConsumption
	 * @param wishFutureConsumption Array mit neuen Werten
	 * @return übernommene Liste
	 */
	public double[] setWishFutureConsumption(double[] wishFutureConsumption) {
		if(wishFutureConsumption==null){ this.wishFutureConsumption = new double[8]; return this.wishFutureConsumption;}
		for(int i=0 ; i<8 ; i++){
			if(i==0){	this.wishFutureConsumption[0] = wishFutureConsumption[0];}
			else{
				if(wishFutureConsumption.length>i&&i>0){
					this.wishFutureConsumption[i] = wishFutureConsumption[i];
				}else{
					this.wishFutureConsumption[i] = this.wishFutureConsumption[i-1];
				}
			}
		}
		return this.wishFutureConsumption;
	}
	/**
	 * Gibt das Array mit dringend benötigter Leistung zurück
	 * @return needFutureConsumption[8]
	 */
	public double[] getNeedFutureConsumption() {
		return needFutureConsumption;
	}
	/**
	 * Dringend benötigte Leistung
	 * @param index im (index+1)en Zeitschritt
	 * @return benötigte Mindestleistung
	 */
	public double getNeedFutureConsumption(int index) {
		if(index>=0 && index<8){return this.needFutureConsumption[index];}
		return 0;
	}
	/**
	 * Aktualisiert needFutureConsumption mit der übergebenen Liste
	 * HINWEIß: Beachte die Spezifikation von NeedFutureConsumption
	 * HINWeiß: Bei zu kurzen Listen werden die übrigen Elemente auf den vorherigen Wert gesetzt
	 * @param needFutureConsumption Array mit neuen Werten
	 * @return übernommene Liste
	 */
	public double[] setNeedFutureConsumption(double[] needFutureConsumption) {
		if(needFutureConsumption==null){ this.needFutureConsumption = new double[8]; return this.needFutureConsumption;}
		for(int i=0 ; i<8 ; i++){
			if(i==0){	this.needFutureConsumption[0] = needFutureConsumption[0];}
			else{
				if(needFutureConsumption.length>i&&i>0){
					this.needFutureConsumption[i] = needFutureConsumption[i];
				}else{
					this.needFutureConsumption[i] = this.needFutureConsumption[i-1];
				}
			}
		}
		return this.needFutureConsumption;
	}
//Hilfsfunktionen <------------------------------------------------------------------------------------------
	public String toString(){
		return (name + 	": { currentConsumption: " + getCurrentConsumption() + 
						"     furtureConsumption: " + getFutureConsumption(0) +
						" }");
	}
	public void error(String text){
		System.out.println("ERROR: (_eVerbraucherAnswerContent)"+text +"<----------------------------------");
	}
	public void debug(String text){
		if(isDebug){
			System.out.println("DEBUG: (_eVerbraucherAnswerContent)"+ text);
		}
	}
}