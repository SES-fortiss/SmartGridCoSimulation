package haus.komponente._messageContents;


/**
 * _VerbraucherAnswerContent
 * Stellt allgemeine Attribute/Methoden zur Verfügung, die jeder intelligente Verbraucher unterstützt.
 * Implementiert Standard-Antwort von intelligenten Verbrauchern an den EMS.
 * Erbt von __BasicAnswerContent
 * Wichtige Attribute: geerbte + wishFutureConsumption, needFutureConsumption, isBuffer, bufferMAX 
 * 06.10.2014
 * @see __BasicAnswerContent
 * @author Markus
 * @version 1.0
 */
public abstract class _iVerbraucherAnswerContent extends __BasicAnswerContent{
//Variablen <------------------------------------------------------------------------------------------------
	//futureConsumption: vom intelligenten Verbraucher geplante Stromverbrauch
	/**
	 * Wird vom intelligenten Verbraucher berechnet. Gibt den Verbrauch an wenn nicht abgeregelt wird.
	 * WICHTIG: Bezieht sich auf die Summe.		
	 * Bsp: Speicher ist voll und der Mindestverbrauch ist 100 -> {100,200,300,...}
	 */
	private double[] wishFutureConsumption = new double[8];
	/**
	 * Wird vom intelligenten Verbraucher berechnet. 
	 * Gibt den Grundbedarf an, den der Verbraucher in den nächsten 2 Stunden mindestens hat.
	 * WICHTIG: Bezieht sich auf die Summe.
	 * Bsp: Speicher ist voll und der Mindestverbrauch ist 100 -> {100,200,300,...}
	 */
	private double[] needFutureConsumption = new double[8];
	/**
	 * Spielraum nach unten, bis ein kritischer Zustand erreicht wird.
	 */
	private double   isBuffer = 0;
	/**
	 * Maximalwert, stellt Ziel für den Verbraucher dar. Verbraucher wird durch Begrenzungen daran 
	 * gehindert das Ziel leicht zu erreichen und aufracht zu erhalten.
	 */
	public  double   bufferMAX = 0;
//Konstruktor <----------------------------------------------------------------------------------------------
	/**
	 * Standardkonstruktor (Erzeugung: -, Verbrauch: +)
	 * @param name eindeutige Identifikation zum BehaviorModel
	 * @param consumptionMAX maximale mögliche Leistungsaufnahme
	 * @param isBuffer Handlungsspielraum
	 * @param bufferMAX Maximaler Handlungsspielraum
	 */
	public _iVerbraucherAnswerContent(String name, double consumptionMAX, double isBuffer, double bufferMAX) {
		super(name, 0, consumptionMAX);
		this.isBuffer = isBuffer;
		this.bufferMAX= bufferMAX;
	}
//Abstrakte Methoden <---------------------------------------------------------------------------------------
	
//Get-Set-Methoden <-----------------------------------------------------------------------------------------
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
	 * HINWEIß: Bei zu kurzen Listen werden die übrigen Elemente auf den vorherigen Wert gesetzt
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
	/**
	 * Gibt Puffer zurück, den der intelligente Verbraucher hat bis der Midestverbrauchsmodus aktiviert wird.
	 * Bsp: Kühlschrank Energie, bis die Maximaltemperatur erreicht ist.
	 * @return Leistung die einen Timestep gespaart werden kann [Wh/4]
	 */
	public double getBuffer() {
		return isBuffer;
	}
	/**
	 * ändert isBuffer im erlaubten Bereich [0.0,bufferMAX]
	 * @param isBuffer neuer Wert
	 * @return übernommener Wert
	 */
	public double setBuffer(double isBuffer) {
		if(isBuffer<0)									{this.isBuffer = isBuffer; error("setBuffer: ung�ltiger Wert:"+isBuffer);}
		if(isBuffer>this.bufferMAX)						{this.isBuffer = isBuffer; error("setBuffer: ung�ltiger Wert:"+isBuffer);}
		if(isBuffer>=0 && isBuffer <= this.bufferMAX)	{this.isBuffer = isBuffer;}
		return this.isBuffer;
	}
	/**
	 * ändert den aktuellen Buffer um delta
	 * WICHTIG: es findet KEINE überprüfung auf Gültigkeit statt!
	 * @param delta Delta/Unterschied (+:erhöhen; -:senken)
	 * @return neuer Wert
	 */
	public double changeBuffer(double delta){
		this.isBuffer += delta;
		return this.isBuffer;
	}
//Hilfsfunktionen <------------------------------------------------------------------------------------------
	public String toString(){
		return (name + 	": { currentConsumption: " + getCurrentConsumption() + 
						"     furtureConsumption: " + getFutureConsumption(0) +
						" }");
	}
	public void error(String text){
		System.out.println("ERROR: (_iVerbraucherAnswerContent)"+text + "<---------------------------------");
	}
	public void debug(String text){
		if(isDebug){
			System.out.println("DEBUG: (_iVerbraucherAnswerContent)"+ text);
		}
	}
}