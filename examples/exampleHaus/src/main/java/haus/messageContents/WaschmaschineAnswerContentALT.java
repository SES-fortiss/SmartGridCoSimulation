package haus.messageContents;

import akka.basicMessages.AnswerContent;

/**
 * WaschmaschineAnswerContent
 * 04.05.2014
 * @author Markus
 *
 */
public class WaschmaschineAnswerContentALT implements AnswerContent {
	public boolean  istAutomatik;		//EMS kann Client steuern
	public boolean	istAuftrag;			//Wenn Wäsche vorhanden: true
	public boolean 	istAN;				//Waschmaschine läuft gerade
	public double 	futureConsumption;	//geplante Leistungsaufnahme
	public double 	currentConsumption;	//aktuelle Leistungsaufnahme
	
	/**
	 * Standardkonstruktor
	 */
	public WaschmaschineAnswerContentALT(){
		istAutomatik		= true;
		istAuftrag 			= false;
		istAN 				= false;
		futureConsumption 	= 3;
		currentConsumption	= 3;
	}
	
	@Override
	public String toString(){
		return (  "Waschmaschine:{ Aktueller Stromverbrauch: "+ currentConsumption
			   +" istAN: "+ istAN
			   +" futureConsumption: "+ futureConsumption
			   +" currentConsumption: "+ currentConsumption 
			   +" istAutomatik: " + istAutomatik + " }");
	}


}
