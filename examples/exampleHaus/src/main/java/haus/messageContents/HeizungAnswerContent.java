package haus.messageContents;

/**
 * HeizungAnswerContent
 * 14.05.2014
 * @author Markus
 *
 */
public class HeizungAnswerContent extends _BasicAnswerContent{
	
	public HeizungAnswerContent(){
		this.currentConsumtion = 3;
		this.futureConsumption = 3;
		this.istEnergieSparModusAN = true;
		this.istPrioritaet = 100.0;
		this.ConsumptionMAX = 10000.0;
		this.sollVerbrauchMAX = 10000.0;
	}
	
	@Override
	public String toString(){
		return ("HeizungAnswerContent:{ ConsumptionMAX:" + ConsumptionMAX 
				+"  sollVerbrauchMAX:" + sollVerbrauchMAX
				+"  istEnergieSparModusAN:" + istEnergieSparModusAN
				+"  currentConsumption:" + currentConsumtion
				+"  futureConsumption:" + futureConsumption
				+"  istPrioritaet:" + istPrioritaet +" }");
	}
}
