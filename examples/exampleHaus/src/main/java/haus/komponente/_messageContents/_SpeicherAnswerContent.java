package haus.komponente._messageContents;

/**
 * _SpeicherAnswerContent
 * Stellt allgemeine Attribute/Methoden zur Verfügung, die jeder elektrische Speicher unterstützt.
 * Implementiert die Standard-Antwort eines Speichers an den EMS.
 * Erbt von __BasicAnswerContent
 * Wichtige Attribute: geerbte + CapacityMAX, wirkungsgrad, currentCapacity 
 * (bitte über verfügbare Methoden drauf zugreifen!)
 * 06.10.2014
 * @see __BasicAnswerContent
 * @author Markus
 * @version 1.0
 */
public abstract class _SpeicherAnswerContent extends __BasicAnswerContent{
//Variablen <------------------------------------------------------------------------------------------
	/**
	 * Kapazität des Speichers [Wh/4]
	 */
	public double CapacityMAX;
	/**
	 * Wirkungsgrad, mit der der Strom gespeichert wird. [0.0<wirkungsgrad<=1.0]
	 */
	private double wirkungsgrad;
	/**
	 * Aktuell im Speicher gespeicherte Energie [Wh/4]
	 */
	private double currentCapacity;
//Konstruktoren <--------------------------------------------------------------------------------------	
	/**
	 * Standardkonstruktor (Erzeugung: -, Verbrauch: +)
	 * @param name
	 * @param consumptionMIN [Watt]
	 * @param consumptionMAX [Watt]
	 * @param CapacityMAX [Wh/4]
	 * @param wirkungsgrad
	 * @param currentCapacity [Wh/4]
	 */
	public _SpeicherAnswerContent(	String name, 
									double consumptionMIN, 
									double consumptionMAX, 
									double CapacityMAX, 
									double wirkungsgrad, 
									double currentCapacity){
		super(name, consumptionMIN,consumptionMAX);
		this.CapacityMAX = CapacityMAX;
		this.wirkungsgrad = wirkungsgrad;
		this.currentCapacity = currentCapacity;
	}	
//Abstrakte Methoden <---------------------------------------------------------------------------------	
		
//Fertige Hilfsfunktionen
//get/set-Methoden
	/**
	 * @return the wirkungsgrad
	 */
	public double getWirkungsgrad() {
		return wirkungsgrad;
	}
	/**
	 * ändert Wirkungsgrad
	 * @param wirkungsgrad neuer Wert
	 * @return false: falscher übergabeparameter
	 */
	public boolean setWirkungsgrad(double wirkungsgrad) {
		if(wirkungsgrad<=0.0 && wirkungsgrad<=1.0){
			this.wirkungsgrad = wirkungsgrad;
			return true;
		}
		return false;
	}
	/**
	 * Aktuell gespeicherter Strom
	 * @return the currentCapacity
	 */
	public double getCurrentCapacity() {
		return currentCapacity;
	}
	/**
	 * ändert CurrentCapacity
	 * @param newcurrentCapacity
	 * @return 
	 */
	public boolean setCurrentCapacity(double newcurrentCapacity) {
		if(newcurrentCapacity>=0 && newcurrentCapacity<= CapacityMAX){
			this.currentCapacity = newcurrentCapacity;
			return true;
		}
		error("Ungültige Kapazität");
		return false;
	}
	/**
	 * ändert die gespeicherte Kapazität des Speichers (+ Laden, - Entladung/Stromerzeugung)
	 * @param currentConsumption + Laden, - Entladung/Stromerzeugung
	 * @return
	 */
	public boolean changeCurrentCapacity(double currentConsumption){
		if(currentConsumption >= this.getConsumptionMIN()&&currentConsumption<= this.getConsumptionMAX()){
			double newcurrentCapacity;
			if(currentConsumption>0){
				//Lademodus
				newcurrentCapacity = currentCapacity + (currentConsumption*this.wirkungsgrad);
			}else{
				//Entladung
				newcurrentCapacity = currentCapacity + (currentConsumption);
			}
			this.setCurrentCapacity(newcurrentCapacity);
			return true;
		}
		return false;
	}
//Hilfsmethoden! <-------------------------------------------------------------------------------------
//Diese Methoden sollten in Unterklassen überschrieben werden!!!!
	public String INFOausgeben(){
		return (name + 	": { currentConsumption: " + getCurrentConsumption() + 
						"     furtureConsumption: " + getFutureConsumption(0) +
						"     Füllstand: "+currentCapacity + "(" + (currentCapacity/CapacityMAX) + "%)" +
						" }");
	}
	public String toString(){
		return  INFOausgeben();
	}
}