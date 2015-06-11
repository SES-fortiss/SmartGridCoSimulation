package haus.komponente._messageContents;

/**
 * _ErzeugerRequestContent
 * Implementiert den Standard-Request von dem EMS an den Erzeuger.
 * Wichtige Attribute: 
 * - expectedConsumption<0 (angestrebte Erzeugung)
 * - expectedConsumptionMIN<expectedConsumption(Maximale Stromerzeugung)
 * - expectedConsumptionDeltaMAX=0 (maximaler Unsicherheitsfaktor zur Prognose)
 * 29.05.2014
 * @author Markus
 * FERTIG
 */
public abstract class _ErzeugerRequestContent extends __BasicRequestContent{
//Variablen <------------------------------------------------------------------------------------------
	/**
	 * Maximal erlaubter absoluter Unsicherheitsfaktor, den der Erzeuger haben darf.
	 * ZWECK: Stabilisierung der Erzeugung
	 * UPDATE: Zeitabhängigkeit Implementiert
	 * BEISPIEL: zukünftige Erzeugung einer Solaranlage von 3000 mit 
	 * expectedConsumptionDelta=1000Watt und expectedConsumptionDeltaMAX=300Watt führt zu einer Senkung von expectedConsumption um 700Watt
	 */
	private double[] expectedConsumptionDeltaMAX = new double[96];

//Konstruktoren <--------------------------------------------------------------------------------------	
	
	/**
	 * Standardkonstruktor Zeitabhängige Einstellungen!
	 * @param name Identifikation der Komponente
	 * @param expectedConsumption Array mit erwarteter Leistungsaufnahme
	 * @param expectedConsumptionMIN Array mit minimaler erwarteter Leistungsaufnahme
	 * @param expectedConsumptionMAX Array mit maximaler erwarteter Leistungsaufnahme
	 * @param expectedConsumptionDeltaMAX maximaler Wert des Unsicherheitsfaktors
	 */
	public _ErzeugerRequestContent(String name, double[] expectedConsumption, double[] expectedConsumptionMIN, 
			double[] expectedConsumptionMAX, double[] expectedConsumptionDeltaMAX) {
		super(name, expectedConsumption,expectedConsumptionMIN,expectedConsumptionMAX);
		this.initexpectedConsumptionDeltaMAX(expectedConsumptionDeltaMAX);
	}
	/**
	 * Standardkonstruktor für zeitunabhängige Einstellungen.
	 * @param name Identifikation der Komponente
	 * @param expectedConsumption erwartete Leistungsaufnahme
	 * @param expectedConsumptionMIN minimale erwartete Leistungsaufnahme
	 * @param expectedConsumptionMAX maximale erwartete Leistungsaufnahme
	 * @param expectedConsumptionDeltaMAX maximaler Wert des Unsicherheitsfaktors
	 */
	public _ErzeugerRequestContent(String name, double expectedConsumption, double expectedConsumptionMIN, 
			double expectedConsumptionMAX, double expectedConsumptionDeltaMAX) {
		super(name, expectedConsumption,expectedConsumptionMIN,expectedConsumptionMAX);
		this.initexpectedConsumptionDeltaMAX(null);
		this.setexpectedConsumptionDeltaMAX(expectedConsumptionDeltaMAX);
	}

//init/set/get-Methoden
	/**
	 * Initialisiert die Variable expectedConsumptionDeltaMAX[]
	 * @param newDeltaMAX Array mit den Initialwerten, abhängig vom Timestep
	 * @return übernommene Werte
	 */
	public double[] initexpectedConsumptionDeltaMAX(double[] newDeltaMAX){
		this.expectedConsumptionDeltaMAX =  new double[96];
		if(newDeltaMAX==null){
			return this.expectedConsumptionDeltaMAX;
		}
		for(int i = 0 ; i < 96 ; i++){
			if(newDeltaMAX.length>i){
				this.expectedConsumptionDeltaMAX[i] = newDeltaMAX[i];
			}else{
				this.expectedConsumptionDeltaMAX[i] = 0;
			}
		}
		return this.expectedConsumptionDeltaMAX;
	}
	/**
	 * ändert expectedConsumptionDeltaMAX[]
	 * @param wert neuer Wert
	 * @param Pos Position, an der der Wert gändert wird. (Timestep%96-1)
	 * @return
	 */
	public double[] setexpectedConsumptionDeltaMAX(double wert, int Pos){
		this.expectedConsumptionDeltaMAX[Pos%96] = wert;
		return this.expectedConsumptionDeltaMAX;
	}
	/**
	 * ändert die Werte ab startPos 
	 * @param wert Array mit den neuen Werten
	 * @param startPos erste Posiotion die geändert wird.
	 * @return new Value
	 */
	public double[] setexpectedConsumptionDeltaMAX(double[] werte, int startPos){
		if(werte==null){
			return this.expectedConsumptionDeltaMAX;
		}
		for(int i = 0 ; i < werte.length ; i++){
			this.setexpectedConsumptionDeltaMAX(werte[i%96], startPos+i);
		}
		return this.expectedConsumptionDeltaMAX;
	}
	/**
	 * ändert expectedConsumptionDeltaMAX auf einen FESTEN Wert!!
	 * HINWEIß: Nur für Zeitunabhägiges expectedConsumptionDeltaMAX verwenden!
	 * @param wert fester zeitunabhängiger Wert
	 * @return new Value
	 */
	public double[] setexpectedConsumptionDeltaMAX(double wert){
		for(int i = 0 ; i < 96 ; i++){
			setexpectedConsumptionDeltaMAX(wert, i);
		}
		return this.expectedConsumptionDeltaMAX;
	}
	/**
	 * Gibt expectedConsumptionDeltaMAX als Array zurück.
	 * @return Array expectedConsumptionDeltaMAX[96]
	 */
	public double[] getexpectedConsumptionDeltaMAX(){
		return this.expectedConsumptionDeltaMAX;
	}
	/**
	 * Gibt expectedConsumptionDeltaMAX an der Stelle Pos zurück.
	 * @param Pos Position
	 * @return expectedConsumptionDeltaMAX[Pos%96]
	 */
	public double getexpectedConsumptionDeltaMAX(int Pos){
		return this.expectedConsumptionDeltaMAX[(Pos%96)];
	}
		
//Abstrakte Methoden <---------------------------------------------------------------------------------	
			
			
//Hilfsmethoden! <-------------------------------------------------------------------------------------
//Diese Methoden sollten in Unterklassen überschrieben werden!!!!
	
}
