package haus.messageContents;

import akka.basicMessages.AnswerContent;

/**
 * BasicAnswerContent
 * 29.04.2014
 * @author Markus
 * Das ist das Minimum an Informationen, die ein "Intelligentes" Objekt von seinem  Kind (Blatt) als Information bekommt!!
 */
public class _BasicAnswerContent implements AnswerContent{
	public double ConsumptionMAX;
	public double sollVerbrauchMAX;
	public boolean istEnergieSparModusAN;
	public double currentConsumtion;
	public double futureConsumption;
	public double istPrioritaet;
	
	
	
	public _BasicAnswerContent(){
		ConsumptionMAX = 2000.0;
		sollVerbrauchMAX = 2000.0;
		istEnergieSparModusAN = false;
		currentConsumtion = 3.0;
		futureConsumption = 3.0;
		istPrioritaet = 100.0;
	}
	
	@Override
	public String toString(){
		return ("BasicAnswer:{  currentConsumption:" + currentConsumtion
				+"  futureConsumption:" + futureConsumption
				+"  istPrioritaet:" + istPrioritaet 
				+"  sollVerbrauchMAX:" + sollVerbrauchMAX
				+"  istEnergieSparModusAN:" + istEnergieSparModusAN
				+" }");
		
		//Asuführlich:
		/*
		return ("BasicAnswer:{ ConsumptionMAX:" + ConsumptionMAX 
				+"  sollVerbrauchMAX:" + sollVerbrauchMAX
				+"  istEnergieSparModusAN:" + istEnergieSparModusAN
				+"  currentConsumption:" + currentConsumtion
				+"  futureConsumption:" + futureConsumption
				+"  istPrioritaet:" + istPrioritaet +" }");
				
		 */
	}
	

}
