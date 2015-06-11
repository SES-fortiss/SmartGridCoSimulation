package haus.komponente.elektroheizung;

import haus.komponente._messageContents._iVerbraucherAnswerContent;

/**
 * ElektroheizungAnswerContent
 * 13.08.2014
 * @author Markus
 * FERTIG (Umstellung auf Rechnung mit Puffer in [Wh]
 */
public class ElektroheizungAnswerContent extends _iVerbraucherAnswerContent{
	/**
	 * Standardkonstruktor
	 * WICHTIG: Typische Einfamilienhausheizung: 300L Wärmespeicher, 12,5kW Maximalleistung. Puffer am anfang 50%
	 * @param name eindeutige Identifikation mit Behaviourmodel
	 */
	public ElektroheizungAnswerContent(String name) {
		super(name, 12500, 14000, 28000);
		debug("Typische Einfamilienhausheizung erstellt: 300L Wärmespeicher, 12,5kW Maximalleistung. Puffer am anfang 50%");
	}
	
	
	/**
	 * Standardkonstruktor
	 * WICHTIG: Dieser Konstruktor erstellt eine typische Einfamilienhausheizung, d.h. 
	 * ein Wärmespeicher von 300Liter dient als Energiepuffer und ermöglicht variable Steuerung.
	 * cwasser=4.2kJ/(K*kg), dT=20°C -> BufferMAX=300*20*4.2kJ=25,2*10^6 ~ 7kW -> Leistung in 1/4Stunden: 28kW TODO Evtl. Fehler
	 * @param name eindeutige Identifikation mit BehaviorModel
	 * @param consumptionMAX [W] Maximale Leistungsaufnahme Standard 10-15kW
	 * @param Temperatur [°C] Anfangstemperatur Sollbereich liegt zwischen 40-60°C
	 */
	public ElektroheizungAnswerContent(String name, double consumptionMAX,
			double Temperatur) {
		super(name, consumptionMAX, getBuffer(Temperatur,28000), 28000);
		debug("ElektroheizungAnswerContent("+name+","+consumptionMAX+","+Temperatur+"):isbuffer"+getBuffer());
	}
	
	/**
	 * Erweiterter Konstruktor
	 * @param name eindeutige Identifikation mit BehaviorModel
	 * @param consumptionMAX Maximale Leistungsaufnahme [Watt]
	 * @param isBuffer aktueller Energiezustand des Buffers [Wh]
	 * @param bufferMAX Maximaler Wert des Energiebuffers Angabe in [Wh]
	 */
	public ElektroheizungAnswerContent(String name, double consumptionMAX,
			double isBuffer, double bufferMAX) {
		super(name, consumptionMAX, isBuffer*4, bufferMAX*4);
	}
	
	public String INFOausgeben() {
		String intro = name + ":(consMIN="+this.getConsumptionMIN()+
				" consMAX="+this.getConsumptionMAX()+
				" BufferMAX="+this.bufferMAX+") {\n"; 
		String currCons = 	"                currentConsumption: " + getCurrentConsumption() + "\n";
		String futCons = 	"                futureConsumption: ";
		String isBuff =		"                isBuffer:"+getBuffer() +"(" + (getBuffer()/bufferMAX*100) + "%)\n";
		String needCons =	"                needConsumption: ";
		String wishCons = 	"                wishConsumption: ";
		for(int i = 0 ; i < 8 ; i++){
			futCons = futCons + (int)this.getFutureConsumption(i) + " ";
			needCons = needCons + (int)this.getNeedFutureConsumption(i) + " ";
			wishCons = wishCons + (int)this.getWishFutureConsumption(i) + " ";
		}
		futCons = futCons +"\n";
		needCons = needCons + "\n";
		
		return intro + currCons + futCons + isBuff + needCons + wishCons +" }";
	}
	
	/**
	 * Berechnet aus Energiewert die Temperatur im Puffer dT=20°C,40-60°C
	 * @param isBuffer
	 * @return Temperatur in °C
	 */
	public double getTemperatur(double isBuffer) {
		return (40+(((int)10*isBuffer)/((int)10*this.bufferMAX)*20));
	}
	
	/**
	 * Berechnet aus der Temperatur den aktuellen Pufferzustand
	 * @param temperatur Temperatur
	 * @return Puffer [Wh/4]
	 * Fertig (getestet)
	 */
	public static double getBuffer(double temperatur, double BufferMAX) {
		double erg = (int)((temperatur-40)/20*BufferMAX);
		//System.out.println("DEBUG: (ElektroheizungAnswerContent) getBuffer("+temperatur+","+BufferMAX+")="+erg);
		return erg;
	}
	
	public void error(String text){
		System.out.println("ERROR: (ElektroheizungAnswerContent)"+text);
	}
	public void debug(String text){
		if(isDebug){
			System.out.println("DEBUG: (ElektroheizungAnswerContent)"+ text);
		}
	}
}
	

