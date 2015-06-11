package haus.komponente.solaranlage;

import haus.komponente._messageContents._ErzeugerAnswerContent;

/**
 * SolaranlageAnswerContent
 * Diese Antwort ist spezifisch für Solaranlagen
 * 01.06.2014
 * @author Markus
 *
 */
public class SolaranlageAnswerContent extends _ErzeugerAnswerContent{

	/**
	 * Standardkonstruktor
	 * @param name dient zur eindeutigen Identifikation mit dem Behaviormodel
	 * @param consumptionMIN Maximalerzeugung
	 */
	public SolaranlageAnswerContent(String name, double consumptionMIN) {
		super(name, consumptionMIN);
		debug("Konstruktor: SolaranlageAnswerContent("+ name +", "+ consumptionMIN);
	}

	/* (non-Javadoc)
	 * @see haus.komponente._messageContents.__BasicAnswerContent#toString()
	 */
	@Override
	public String toString() {
		return INFOausgeben();
	}

	/* (non-Javadoc)
	 * @see haus.komponente._messageContents.__BasicAnswerContent#INFOausgeben()
	 */
	@Override
	public String INFOausgeben() {
		String intro = name + ":(consMIN="+this.getConsumptionMIN()+
				" consMAX=" + this.getConsumptionMAX() +") { \n"; 
		String currCons = 	"                currentConsumption: " + getCurrentConsumption() + "\n";
		String futCons = 	"                futureConsumption: ";
		String consDelta=	"                futureConsumptionDelta: ";
		for(int i = 0 ; i < 8 ; i++){
			futCons = futCons + (int)this.getFutureConsumption(i) + " ";
			consDelta = consDelta + (int)this.getFutureConsumptionDelta(i) + " ";
		}
		futCons = futCons + "\n";
		
		return intro + currCons + futCons + consDelta + " }";
	}

}
