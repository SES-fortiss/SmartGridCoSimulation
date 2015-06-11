package haus.komponente._messageContents;

import akka.basicMessages.RequestContent;

/**
 * __BasicRequestContent
 * Implementiert die minimale Kommunikation zwischen dem EMS und der Komponente
 * WICHTIG: jedes RequestContent einer Komponente erbt von dieser Klasse!!!
 * 29.05.2014
 * @author Markus
 *
 */
public abstract class __BasicRequestContent implements RequestContent{
//Variablen <------------------------------------------------------------------------------------------
	/**
	 * Dient zur Identifikation der Request und dem dazugehörigen Behaviour-Objekt
	 */
	public String name;
	/**
	 * Schaltet den Debugmodus der Requests bei Komponenten ein/aus
	 */
	public boolean isDebug = false;
	
	/**
	 * Wunsch Erzeugung/Verbrauch
	 * Die Leistungsaufnahme, die die Verwaltung sich für die Komponente wünscht!
	 * Bsp: expectedConsumption=3000 bedeutet bei einer Batterie, dass diese mit 3000Watt aufladen soll.
	 */
	private double[] expectedConsumption;
	/**
	 * Begrenzt Wunsch Verbrauch nach unten /Erzeugung nach oben
	 * Bsp: expectedConsumptionMIN= -3000 bei einer Solaranlage bedeutet, dass die Erzeugung auf 3000Watt begrenzt ist.
	 * ACHTUNG: Falsche Werte werden evtl. nicht erkannt -> kann zu nicht definierbarem Verhalten führen!
	 * benötigt bsp. in iVerbraucher
	 */
	private double[] expectedConsumptionMIN;
	/**
	 * Begrenzt Wunsch Verbrauch nach oben /Erzeugung nach unten
	 * Bsp: expectedConsumptionMIN= -3000 bei einer Solaranlage bedeutet, dass die Erzeugung auf 3000Watt begrenzt ist.
	 * ACHTUNG: Falsche Werte werden evtl. nicht erkannt -> kann zu nicht definierbarem Verhalten f�hren!
	 * ben�tigt bsp. in iVerbraucher
	 */
	private double[] expectedConsumptionMAX;
	
//Konstruktoren <--------------------------------------------------------------------------------------	
	public __BasicRequestContent(String name, double[] expectedConsumption, 
			double[] expectedConsumptionMIN, double[] expectedConsumptionMAX){
		this.name = name;
		this.initExpectedConsumption(expectedConsumption);
		this.initExpectedConsumptionMIN(expectedConsumptionMIN);
		this.initExpectedConsumptionMAX(expectedConsumptionMAX);
	}
	public __BasicRequestContent(String name, double expectedConsumption, 
			double expectedConsumptionMIN, double expectedConsumptionMAX){
		this.name = name;
		this.initExpectedConsumption(expectedConsumption);
		this.initExpectedConsumptionMIN(expectedConsumptionMIN);
		this.initExpectedConsumptionMAX(expectedConsumptionMAX);
	}
	public __BasicRequestContent(String name, double[] expectedConsumption, 
			double expectedConsumptionMIN, double expectedConsumptionMAX){
		this.name = name;
		this.initExpectedConsumption(expectedConsumption);
		this.initExpectedConsumptionMIN(expectedConsumptionMIN);
		this.initExpectedConsumptionMAX(expectedConsumptionMAX);
	}
	public __BasicRequestContent(String name, double[] expectedConsumption){
		this.name = name;
		this.initExpectedConsumption(expectedConsumption);
		this.initExpectedConsumptionMIN(0);
		this.initExpectedConsumptionMAX(0);
	}
	public __BasicRequestContent(String name, double expectedConsumption){
		this.name = name;
		this.initExpectedConsumption(expectedConsumption);
		this.initExpectedConsumptionMIN(0);
		this.initExpectedConsumptionMAX(0);
	}
	
//Init/Get-Methoden <---------------------------------------------------------------------------------------
	//ExpectedConsumption-Methoden <----------------------------------------------------------------------
	/**
	 * Gibt den Erwarteten Verbrauch als Array in Timesteps zurück.
	 * @return the expectedConsumption als Array
	 */
	public double[] getExpectedConsumption() {
		return expectedConsumption;
	}
	/**
	 * Gibt den Erwarteten Verbrauch als Array in Timesteps zurück.
	 * @actTimestep gewünschter Timestep
	 * @return the expectedConsumption als Array
	 */
	public double getExpectedConsumption(int actTimestep) {
		return expectedConsumption[actTimestep%96];
	}
	/**
	 * Initialisiert die Membervaariable ExpectedCosumption mit übergebenen Daten ab startPos
	 * @param expectedConsumption neue Werte
	 * @param startPos erste Position, die aktualisiert wird
	 * @return old value
	 */
	public double[] setExpectedConsumption(double[] expectedConsumption, int startPos) {
		if(expectedConsumption==null){return this.expectedConsumption;}
		double[] old = this.expectedConsumption;
		for(int i = startPos ; i < 96 ; i++){
			if(expectedConsumption.length > (i-startPos)){
				this.expectedConsumption[i] = expectedConsumption[i-startPos];
			}else{
				this.expectedConsumption[i] = 0;
			}
		}
		return old;
	}
	/**
	 * ändert den Wert an Pos
	 * @param expectedConsumption
	 * @param Pos Position im Array
	 * @return old Value
	 */
	public double[] setExpectedConsumption(double expectedConsumption, int Pos){
		double[] old = this.expectedConsumption;
		this.expectedConsumption[Pos%96] =expectedConsumption;
		return old;
	}
	/**
	 * Initialisiert die Membervaariable ExpectedCosumption
	 * @param expectedConsumption neue Werte
	 * @return old value
	 */
	public double[] setExpectedConsumption(double[] expectedConsumption){
		return setExpectedConsumption(expectedConsumption,0);
	}
	
	/**
	 * Initialisiert die Membervariable ExpectedConsumption
	 * @param expectedConsumption
	 * @return übernommene Werte
	 */
	public double[] initExpectedConsumption(double expectedConsumption){
		return initExpectedConsumption(expectedConsumption, 0);
	}
	/**
	 * Initialisiert die Membervariable ExpectedConsumption
	 * @param expectedConsumption neuer gewünschter Verbrauch
	 * @param startPos Timestep ab dem der Wert geändert wird
	 * @return übernommene Werte
	 */
	public double[] initExpectedConsumption(double expectedConsumption, int startPos){
		this.expectedConsumption = new double[96];
		for(int i = startPos ; i < 96 ; i++){
			this.expectedConsumption[i] = expectedConsumption;
		}
		return this.expectedConsumption;
	}
	/**
	 * Initialisiert die Membervariable ExpectedConsumption
	 * @param expectedConsumption Initialarray
	 * @return übernommene Werte
	 */
	public double[] initExpectedConsumption(double[] expectedConsumption){
		this.expectedConsumption = new double[96];
		if(expectedConsumption==null){return this.expectedConsumption;}
		for(int i = 0 ; i < 96 ; i++){
			if(expectedConsumption.length > i){
				this.expectedConsumption[i] = expectedConsumption[i];
			}else{
				this.expectedConsumption[i] = 0;
			}
		}
		return this.expectedConsumption;
	}
	
	//ExpectedConsumptionMIN-Methoden <-------------------------------------------------------------------
	/**
	 * Gibt expectedConsmptionMIN zurück
	 * WICHTIG: Diese Methode NUR verwenden, wenn expectedConsmptionMIN nicht zeitabhängig
	 * @return expectedConsmptionMIN
	 */
	public double getExpectedConsumptionMIN() {
		return expectedConsumptionMIN[0];
	}
	/**
	 * Gibt expectedConsmptionMIN als Array zurück
	 * @return expectedConsmptionMIN
	 */
	public double[] getExpectedConsumptionMINArray() {
		return expectedConsumptionMIN;
	}
	/**
	 * Gibt ExpectedConsumptionMIN im Timestep actTimestep zurück
	 * @param actTimestep Zeitschritt im Viertelstundentakt
	 * @return expectedConsumptionMIN[actTimestep%96]
	 */
	public double getExpectedConsumptionMIN(int actTimestep) {
		return expectedConsumptionMIN[actTimestep%96];
	}
	/**
	 * Setzt einen festen Wert unabhängig von der Zeit
	 * @param newexpectedConsumptionMIN
	 * @return old value
	 */
	public double[] setExpectedConsumptionMIN(double newexpectedConsumptionMIN){
		double[] old = expectedConsumptionMIN;
		for(int i = 0 ; i < 96 ; i++){
			expectedConsumptionMIN[i] = newexpectedConsumptionMIN;
		}
		return old;
	}
	
	/**
	 * ändert expectedconsumptionMIN ab startPos
	 * @param newexpectedConsumptionMIN neue Werte 
	 * @param startPos Timestep ab dem geändert wird
	 * @return old value
	 */
	public double[] setExpectedConsumptionMIN(double[] newexpectedConsumptionMIN, int startPos){
		if(newexpectedConsumptionMIN==null){return this.expectedConsumptionMIN;}
		double[] old = expectedConsumptionMIN;
		for(int i = startPos ; i < 96+startPos ; i++){
			if(newexpectedConsumptionMIN.length> i-startPos){
				expectedConsumptionMIN[i%96] = newexpectedConsumptionMIN[i-startPos];
			}
		}
		return old;
	}
	/**
	 * ändert expectedconsumptionMIN
	 * @param newexpectedConsumptionMIN neuer Wert
	 * @param Pos Position, die geändert werden soll (=Timestep-1)
	 * @return new Value
	 */
	public double[] setExpectedConsumptionMIN(double newexpectedConsumptionMIN, int Pos) {
		this.expectedConsumptionMIN[Pos%96] = newexpectedConsumptionMIN;
		return this.expectedConsumptionMIN;
	}
	/**
	 * initialisert expectedConsumptionMIN
	 * @param newexpectedConsumptionMIN Initialwerte
	 * @return übernommene Werte
	 */
	public double[] initExpectedConsumptionMIN(double[] newexpectedConsumptionMIN){
		this.expectedConsumptionMIN = new double[96];
		if(newexpectedConsumptionMIN==null){return this.expectedConsumptionMIN;}
		for(int i = 0 ; i < 96 ; i++){
			if(newexpectedConsumptionMIN.length > i){
				expectedConsumptionMIN[i] = newexpectedConsumptionMIN[i];
			}else{
				expectedConsumptionMIN[i] = 0;
			}
		}
		return expectedConsumptionMIN;
	}
	/**
	 * initialisert expectedConsumptionMIN
	 * @param newexpectedConsumptionMIN Initialwerte
	 * @return übernommene Werte
	 */
	public double[] initExpectedConsumptionMIN(double newexpectedConsumptionMIN){
		expectedConsumptionMIN = new double[96];
		for(int i = 0 ; i < 96 ; i++){
			this.expectedConsumptionMIN[i] = newexpectedConsumptionMIN;
		}
		return expectedConsumptionMIN;
	}
	
	
	//ExpectedConsumptionMAX-Methoden <-------------------------------------------------------------------
		/**
	 * Gibt expectedConsmptionMAX zurück
	 * WICHTIG: Diese Methode NUR verwenden, wenn expectedConsmptionMAX nicht zeitabhängig
	 * @return expectedConsmptionMAX
	 */
	public double getExpectedConsumptionMAX() {
		return expectedConsumptionMAX[0];
	}
	/**
	 * Gibt expectedConsmptionMAX als Array zurück
	 * @return expectedConsmptionMAX
	 */
	public double[] getExpectedConsumptionMAXArray() {
		return expectedConsumptionMAX;
	}
	/**
	 * Gibt ExpectedConsumptionMAX im Timestep actTimestep zurück
	 * @param actTimestep Zeitschritt im Viertelstundentakt
	 * @return expectedConsumptionMAX[actTimestep%96]
	 */
	public double getExpectedConsumptionMAX(int actTimestep) {
		return expectedConsumptionMAX[actTimestep%96];
	}
	/**
	 * Setzt einen festen Wert unabhängig von der Zeit
	 * @param newexpectedConsumptionMAX
	 * @return old value
	 */
	public double[] setExpectedConsumptionMAX(double newexpectedConsumptionMAX){
		double[] old = expectedConsumptionMAX;
		for(int i = 0 ; i < 96 ; i++){
			expectedConsumptionMAX[i] = newexpectedConsumptionMAX;
		}
		return old;
	}
	/**
	 * ändert expectedconsumptionMAX ab startPos
	 * @param newexpectedConsumptionMAX neue Werte 
	 * @param startPos Timestep ab dem geändert wird
	 * @return old value
	 */
	public double[] setExpectedConsumptionMAX(double[] newexpectedConsumptionMAX, int startPos){
		if(newexpectedConsumptionMAX==null){return this.expectedConsumptionMAX;}
		double[] old = expectedConsumptionMAX;
		for(int i = startPos ; i < 96+startPos ; i++){
			if(newexpectedConsumptionMAX.length> i-startPos){
				expectedConsumptionMAX[i%96] = newexpectedConsumptionMAX[i-startPos];
			}
		}
		return old;
	}
	/**
	 * ändert expectedConsumptionMAX
	 * @param wert neuer Wert
	 * @param Pos Position die geändert wird (=Timestep-1)
	 * @return
	 */
	public double[] setExpectedConsumptionMAX(double wert, int Pos) {
		this.expectedConsumptionMAX[Pos%96] = wert;
		return this.expectedConsumptionMAX;		
	}
	/**
	 * initialisert expectedConsumptionMAX
	 * @param newexpectedConsumptionMIN Initialwerte
	 * @return übernommene Werte
	 */
	public double[] initExpectedConsumptionMAX(double[] newexpectedConsumptionMAX){
		expectedConsumptionMAX = new double[96];
		if(newexpectedConsumptionMAX==null){return this.expectedConsumptionMAX;}
		for(int i = 0 ; i < 96 ; i++){
			if(newexpectedConsumptionMAX.length > i){
				expectedConsumptionMAX[i] = newexpectedConsumptionMAX[i];
			}else{
				expectedConsumptionMAX[i] = 0;
			}
		}
		return expectedConsumptionMAX;
	}
	/**
	 * initialisert expectedConsumptionMAX
	 * @param newexpectedConsumptionMIN Initialwerte
	 * @return übernommene Werte
	 */
	public double[] initExpectedConsumptionMAX(double newexpectedConsumptionMAX){
		expectedConsumptionMAX = new double[96];
		for(int i = 0 ; i < 96 ; i++){
			expectedConsumptionMAX[i] = newexpectedConsumptionMAX;
		}
		return expectedConsumptionMAX;
	}
	
//Hilfsmethoden! <-------------------------------------------------------------------------------------
//Diese Methoden sollten in Unterklassen überschrieben werden!!!!
	public void error(String text){
		System.out.println("ERROR: __BasiscRequestContent"+text);
	}
	public void debug(String text){
		if(isDebug){
			System.out.println("DEBUG: __BasiscRequestContent"+ text);
		}
	}
}
