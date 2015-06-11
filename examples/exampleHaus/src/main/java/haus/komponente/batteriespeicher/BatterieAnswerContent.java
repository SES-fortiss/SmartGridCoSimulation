package haus.komponente.batteriespeicher;

import haus.komponente._messageContents._SpeicherAnswerContent;

/**
 * BatterieAnswerContent
 * Implementiert die Antwort eines Batteriespeichers an den EMS
 * 29.05.2014
 * @author Markus
 * FERTIG
 */
public class BatterieAnswerContent extends _SpeicherAnswerContent{
	
	/**
	 * Standardkonstruktor
	 * @param name
	 * @param consumptionMIN
	 * @param consumptionMAX
	 * @param CapacityMAX
	 * @param wirkungsgrad
	 * @param currentCapacity
	 */
	public BatterieAnswerContent(String name, double consumptionMIN, double consumptionMAX, double CapacityMAX, double wirkungsgrad, double currentCapacity){
		super(name,consumptionMIN,consumptionMAX,CapacityMAX,wirkungsgrad,currentCapacity);
		debug("Konstruktor: BatterieAnswerContent(...) aufgerufen!!!");
		this.isDebug=true;
	}

	/* (non-Javadoc)
	 * @see haus.komponente.messageContents.__BasicAnswerContent#INFOausgeben()
	 */
	@Override
	public String INFOausgeben() {
		String intro = name + ":(consMIN="+this.getConsumptionMIN()+
				" consMAX="+this.getConsumptionMAX()+
				" Wirkungsgrad="+this.getWirkungsgrad()+
				" CapMAX="+this.CapacityMAX + ") {\n"; 
		String currCons = 	"                currentConsumption: " + getCurrentConsumption() + "\n";
		String futCons = 	"                futureConsumption: ";
		String currCap = 	"                currentCapacity: "+getCurrentCapacity() +"(" + (getCurrentCapacity()/CapacityMAX*100) + "%)";
		for(int i = 0 ; i < 8 ; i++){
			futCons = futCons + (int)this.getFutureConsumption(i) + " ";
		}
		futCons = futCons + "\n";
		
		return intro + currCons + futCons + currCap + " }";
	}
}
