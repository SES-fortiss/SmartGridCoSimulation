package haus.komponente._messageContents;

import akka.basicMessages.AnswerContent;

/**
 * __BasicAnswerContent
 * Stellt allgemeine Attribute/Methoden zur Verfügung, die jede Komponente, egal von welchem Typ, unterstützt.
 * Implementiert die minimale Kommunikation zwischen der Komponente und dem EMS
 * WICHTIG: jedes AnswerContent einer Komponente erbt von dieser Klasse!!!
 * 
 * wichtige Attribute: name, currentConsumption, futureConsumption[8], consumptionMIN, consumptionMAX
 * 06.10.2014
 * @author Markus
 * @version 1.0
 */
public abstract class __BasicAnswerContent implements AnswerContent{
//Variablen <----------------------------------------------------------------------------------------------
	//Grundlegende Attribute, die der EMS von den Komponenten kennen muss!!
	/**
	 * WICHTIG: Dient zur Identifikation der Antworten
	 */
	public String name = "ungueltig";
	/**
	 * aktuelle Leistungsaufnahme (+ Verbraucher, - Erzeuger)
	 */
	private double currentConsumption = 0;
	/**
	 * zukünftige Leistungsaufnahme(im Viertel-Stunden-Takt)
	 * 0: noch kein Plan vorhanden
	 * WICHTIG: für futureConsumption[0] muss IMMER ein Plan vorhanden sein!
	 * HINWEIß: Prognose bis zu 2 Stunden.
	 */
	private double[] futureConsumption = new double[8];		
	/**
	 * Untergrenze für Stromverbrauch / Maximale Stromproduktion			
	 */
	private double consumptionMIN = -10000;
	/**
	 * Obergrenze für Stromverbrauch / Minimale Produktion
	 */
	private double consumptionMAX = 10000;
	public boolean isDebug = false;
//Konstruktoren <------------------------------------------------------------------------------------------
	/**
	 * Standardkonstruktor
	 * @param name Requests müssen den selben Namen haben um der Komponente zugeordnet zu werden.
	 * @param consumptionMIN Maximalstromerzeugung (Erzeugung: -, Verbrauch: +)
	 * @param consumptionMAX Maximalverbrauch (Erzeugung: -, Verbrauch: +)
	 */
	public __BasicAnswerContent(String name, double consumptionMIN, double consumptionMAX){
		this.name = name;
		this.consumptionMIN = consumptionMIN;
		this.consumptionMAX = consumptionMAX;
		if(consumptionMIN>consumptionMAX){
			error("ACHTUNG! consumptionMIN>consumptionMAX <------");
		}
	}
/**
	 * @return currentConsumption
	 */
	public double getCurrentConsumption() {
		return currentConsumption;
	}
	/**
 * @param currentConsumption
 * @return neuer Wert
 */
public double setCurrentConsumption(double currentConsumption) {
	this.currentConsumption = currentConsumption;
	if(currentConsumption> consumptionMAX){
		this.currentConsumption = this.consumptionMAX;
	}
	if(currentConsumption< consumptionMIN){
		this.currentConsumption = this.consumptionMIN;
	}
	return this.currentConsumption;
}
	//get/set-Methoden <---------------------------------------------------------------------------------------
	/**
	 * @return futureConsumption[]
	 */
	public double[] getFutureConsumption() {
		return futureConsumption;
	}
	/**
	 * Gibt zukünftigigen geplanten Stromverbrauch zurück
	 * @param index 0: Verbrauch im nächsten Simulationsschritt
	 * @return futureConsumption[index]
	 */
	public double getFutureConsumption(int index) {
		if(index>=0 && index<8){
			return futureConsumption[index];
		}
		System.out.println("FEHLER: __BasicAnswerContent.getFutureConsumption(int index)");
		return 0;
	}
	/**
	 * ändert den Verbrauchsplan
	 * @param futureConsumption neuer Wert
	 * @param index gibt Zeitintervall an, das aktualisiert wird. (0: nächster Schritt (in 15min), n: in n Schritten (in n*15min)
	 * @return Erfolgreich geändert (false: falsche Parameterübergabe)
	 * TODO
	 */
	public boolean setFutureConsumption(double futureConsumption, int index) {
		if(index>=0 && index<8){
			if(futureConsumption>= consumptionMIN && futureConsumption<=consumptionMAX){
				this.futureConsumption[index] = futureConsumption;
				return true;
			}
		}
		error("setFutureConsumption("+futureConsumption+","+index+")");
		return false;
	}
	/**
	 * ändert FutureConsumption
	 * @param futureConsumption 
	 * @return new Value
	 */
	public double[] setFutureConsumption(double[] futureConsumption) {
		if(futureConsumption==null){debug("setFutureConsumption(null)"); return this.getFutureConsumption();}
		for(int i = 0 ; i < 8 ; i++){
			if(futureConsumption.length>i){
				setFutureConsumption(futureConsumption[i], i);
			}else{
				setFutureConsumption(0, i);
			}
		}
		return getFutureConsumption();
	}
	/**
	 * @return consumptionMIN
	 */
	public double getConsumptionMIN() {
		return consumptionMIN;
	}
	/**
	 * @param consumptionMIN consumptionMIN to set
	 */
	public void setConsumptionMIN(double consumptionMIN) {
		this.consumptionMIN = consumptionMIN;
	}
	/**
	 * @return consumptionMAX
	 */
	public double getConsumptionMAX() {
		return consumptionMAX;
	}
	/**
	 * @param consumptionMAX consumptionMAX to set
	 */
	public void setConsumptionMAX(double consumptionMAX) {
		this.consumptionMAX = consumptionMAX;
	}
/**
	 * Bitte nur in einer Zeile ausgeben, wenn möglich!
	 * Dient zur Information des Benutzers.
	 * @return Gibt INFO zurück!
	 */
	public abstract String INFOausgeben();
	public abstract String toString();
	//Hilfsmethoden <-------------------------------------------------------------------------------------------
	public void error(String text){
		System.out.println("ERROR: "+text+ "<----------------------------------------------------------");
	}
	public void debug(String text){
		if(isDebug){
			System.out.println("DEBUG: "+ text);
		}
	}
}
