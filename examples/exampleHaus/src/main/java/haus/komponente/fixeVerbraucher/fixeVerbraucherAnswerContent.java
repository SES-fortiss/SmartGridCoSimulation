package haus.komponente.fixeVerbraucher;

import haus.komponente._messageContents.__BasicAnswerContent;

/**
 * fixeVerbraucherAnswerContent
 * Definiert die Antwort eines nicht steuerbaren Verbrauchers an den EMS
 * 12.09.2014
 * @author Markus
 *
 */
public class fixeVerbraucherAnswerContent extends __BasicAnswerContent{
	public String INFO = "Info:";
	/**
	 * Standardkonstruktor
	 * @param name
	 * @param consumptionMAX
	 */
	public fixeVerbraucherAnswerContent(String name) {
		//Maximalverbrauch wird in Behaviour ermittelt und überschrieben
		super(name,0,0);
	}

	
//Hilfsmethoden <-------------------------------------------------------------------------------------------
	public void error(String text){
		System.out.println("ERROR:(fixeVerbraucherAnswerContent) "+text);
	}
	public void debug(String text){
		if(isDebug){
			System.out.println("DEBUG:(fixeVerbraucherAnswerContent) "+ text);
		}
	}


	public String toString() {
		return "toString von fixeVerbraucherAnswerContent";
	}
	public String INFOausgeben() {		
		String text = name + ":(consMIN="+this.getConsumptionMIN()+
				" consMAX="+this.getConsumptionMAX() + ") { \n" 
			+"                currentConsumption:" + (int)getCurrentConsumption()+"\n"
			+"                futureConsumption: ";
		for(int i = 0 ; i < 8 ; i++){
			text = text + (int)this.getFutureConsumption(i) + " ";
		}
		text = text + "\n                "+INFO;
		
		return text;
	}
}
