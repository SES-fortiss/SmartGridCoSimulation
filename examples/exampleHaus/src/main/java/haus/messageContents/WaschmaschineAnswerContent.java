package haus.messageContents;

/**
 * WaschmaschineAnswerContent
 * 14.05.2014
 * @author Markus
 *
 */
public class WaschmaschineAnswerContent extends _BasicAnswerContent{
	public boolean  istAutomatik;		//EMS kann Client steuern
	public boolean	istAuftrag;			//Wenn Wäsche vorhanden: true
	public boolean 	istAN;				//Waschmaschine läuft gerade
	
	/**
	 * Standardkonstruktor
	 */
	public WaschmaschineAnswerContent(){
		
		istAutomatik		= true;
		istAuftrag 			= false;
		istAN 				= false;
		futureConsumption 	= 3;
		currentConsumtion	= 3;
	}
		
	@Override
	public String toString(){
		return (  "Waschmaschine:{ ConsumptionMAX:" + ConsumptionMAX 
			+"  sollVerbrauchMAX:" + sollVerbrauchMAX
			+"  istEnergieSparModusAN:" + istEnergieSparModusAN
			+"  currentConsumption:" + currentConsumtion
			+"  futureConsumption:" + futureConsumption
			+"  istPrioritaet:" + istPrioritaet 
		   +" istAN: "+ istAN
		   +" futureConsumption: "+ futureConsumption
		   +" currentConsumption: "+ currentConsumtion 
		   +" istAutomatik: " + istAutomatik + " }");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
