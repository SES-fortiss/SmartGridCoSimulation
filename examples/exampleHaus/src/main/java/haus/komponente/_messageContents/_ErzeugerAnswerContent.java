package haus.komponente._messageContents;

/**
 * _ErzeugerAnswerContent
 * Stellt allgemeine Attribute/Methoden zur Verfügung, die jeder Erzeuger unterstützt.
 * Implementiert die Standard-Antwort von Erzeugern an den EMS.
 * Erbt von __BasicAnswerContent
 * Wichtige Attribute: geerbte + futureConsumptionDelta[8]
 * 06.10.2014
 * @see __BasicAnswerContent
 * @author Markus
 * @version 1.0
 */
public abstract class _ErzeugerAnswerContent extends __BasicAnswerContent{
//Variablen <------------------------------------------------------------------------------------------
	/**
	 * Unsicherheitsfaktor bei der Prognose. 
	 * Der tatsächliche Wert zwischen dem prognostizierten Wert und dem negativen Delta.
	 * BEISPIEL: futureConsumption= - 2000, futureConsumptionDelta=300 -> der Realwert liegt zwischen -2000 und -1700
	 * HINWEIS: immer >=0
	 */
	private double[] futureConsumptionDelta = new double[8];
//Konstruktoren <--------------------------------------------------------------------------------------	
	/**
	 * Standardkonstruktor (Erzeugung: -, Verbrauch: +)
	 * @param name
	 * @param consumptionMIN
	 * @param consumptionMAX
	 * @see __BasicAnswerContent
	 */
	public _ErzeugerAnswerContent(String name, double consumptionMIN) {
		super(name, consumptionMIN, 0);
	}
	public double[] getFutureConsumptionDelta() {
		return futureConsumptionDelta;
	}
	/**
	 * Gibt absoluten Unsicherheitswert des futureConsumptionDelta[] Arrays zurück
	 * @param index zwischen 0 und 7
	 * @return futureConsumptionDelta[index]
	 */
	public double getFutureConsumptionDelta(int index) {
		if(index>=0 &&index <8){
			return futureConsumptionDelta[index];
		}
		return 0;
	}
	/**
	 * absoluter Unsicherheitswert
	 * @param futureConsumptionDelta >0
	 */
	public double[] setFutureConsumptionDelta(double[] futureConsumptionDelta) {
		for(int i = 0 ; i < 8 ; i++){
			if(futureConsumptionDelta.length>i){
				this.futureConsumptionDelta[i] = futureConsumptionDelta[i];
			}else{
				this.futureConsumptionDelta[i]=0;
			}
		}
		return this.futureConsumptionDelta;
	}
	/**
	 * Setzt einen neuen Wert für futureConsumptionDelta
	 * @param delta neuer Wert
	 * @param index Position
	 * @return -1: Fehler
	 */
	public double setFutureConsumptionDelta(double delta, int index){
		if(index>=0 && index<8){
			this.futureConsumptionDelta[index] = delta;
			if(this.futureConsumptionDelta[index]<0){
				this.futureConsumptionDelta[index]=-delta;
			}
			return delta;
		}
		return -1;
	}
	/**
	 * ändert den aktulellen Wert um 
	 * @param aenderung delta
	 * @param index zu änddernde Stelle
	 * @return -1: Fehler
	 */
	public double changeFutureConsumptionDelta(double aenderung, int index){
		return setFutureConsumptionDelta(getFutureConsumptionDelta(index)+aenderung, index);
	}
//Abstrakte Methoden <---------------------------------------------------------------------------------	
				
//Hilfsmethoden! <-------------------------------------------------------------------------------------
//Diese Methoden sollten in Unterklassen überschrieben werden!!!!
	public void error(String text){
		System.out.println("ERROR: (_ErzeugerAnswerContent)"+text + "<-------------------------------");
	}
	public void debug(String text){
		if(isDebug){
			System.out.println("DEBUG: (_ErzeugerAnswerContent)"+ text);
		}
	}
}