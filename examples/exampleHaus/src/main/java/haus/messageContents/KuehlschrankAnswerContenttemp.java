package haus.messageContents;

import akka.basicMessages.AnswerContent;

/**
 * KuehlschrankAnswerContent
 * 07.05.2014
 * @author Markus
 *
 */
public class KuehlschrankAnswerContenttemp implements AnswerContent{
	public double MAXConsumption;
	public double sollVerbrauchMAX; 		// maximal m�glicher Verbrauch
	public boolean istEnergieSparModusAN;
	
	public double currentConsumption; 		// aktueller Verbrauch
	public double futureConsumption;  		// geplanter Verbrauch 
	public double istPrioritaet;	  		// gibt die Priorit�t an mit der der Strom verbraucht wird.
	//Bsp: 50.0 bedeutet: die H�lfte wird dringend ben�tigt, das Doppelte w�re aber gut.
	
	public KuehlschrankAnswerContenttemp(double MAXConsumption){
		this.MAXConsumption = MAXConsumption;
		
		sollVerbrauchMAX = this.MAXConsumption;
		istEnergieSparModusAN = false;
		currentConsumption = 3;
		futureConsumption = 3;
		istPrioritaet = 0.0;
	}
	
	@Override
	public String toString(){
		return ("K�hlschrank:{ MAXConsumption:" + MAXConsumption 
				+"  sollVerbrauchMAX:" + sollVerbrauchMAX
				+"  istEnergieSparModusAN:" + istEnergieSparModusAN
				+"  currentConsumption:" + currentConsumption
				+"  futureConsumption:" + futureConsumption
				+"  istPrioritaet:" + istPrioritaet +" }");
	}

}
