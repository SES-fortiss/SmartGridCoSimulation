package haus.messageContents;


/**
 * KuehlschrankAnswerContent
 * 07.05.2014
 * @author Markus
 *
 */
public class KuehlschrankAnswerContent extends _BasicAnswerContent{
	
	
	public KuehlschrankAnswerContent(double MAXConsumption){
		this.ConsumptionMAX = MAXConsumption;
		sollVerbrauchMAX = this.ConsumptionMAX;
		istEnergieSparModusAN = false;
		currentConsumtion = 3;
		futureConsumption = 3;
		istPrioritaet = 0.0;
	}
	
	@Override
	public String toString(){
		return ("Kühlschrank:{ ConsumptionMAX:" + ConsumptionMAX 
				+"  sollVerbrauchMAX:" + sollVerbrauchMAX
				+"  istEnergieSparModusAN:" + istEnergieSparModusAN
				+"  currentConsumtion:" + currentConsumtion
				+"  futureConsumption:" + futureConsumption
				+"  istPrioritaet:" + istPrioritaet +" }");
	}
}
