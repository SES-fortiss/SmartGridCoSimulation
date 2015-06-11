package haus.behaviorModels;

import haus.messageContents.EMSAnswerContent;
import haus.messageContents.HeizungAnswerContent;
import haus.messageContents.HeizungRequestContent;
import haus.messageContents.KuehlschrankAnswerContent;
import haus.messageContents.WaschmaschineAnswerContent;
import haus.messageContents.WaschmaschineRequestContent;
import haus.messageContents._BasicAnswerContent;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;

/**
 * EMSBehaviorModel
 * 29.04.2014
 * @author Markus
 *
 */
public class EMSBehaviorModel extends BehaviorModel{
	//Variablen:
	public double currentConsumtion = 0.0;
	public double futureConsumtion = 0.0;
	public boolean Sparmodus = false;
	

	
	
	
	//Antwort, die nach makeDecision automatisch an das Elternobjekt gesendet wird
	public EMSAnswerContent answerContentToSend = new EMSAnswerContent();
	
	//Request, die nach makeDecision automatisch an die Kindobjekte gesendet wird???? <-----------
	public RequestContent requestContentToSend = new WaschmaschineRequestContent();
	
	
	/**
	 * Ablauf:
	 * 1. Antwort von Elternobjekt auslesen
	 * 2. Logik entscheiden lassen, was zu tun ist...
	 * 3. answerContentToSend und requestContentToSend initialisieren
	 * 4. Ausgaben in der Konsole
	 */
	@Override
	public void makeDecision(){
		System.out.println("makeDecision von EMS wird ausgeführt!!");
		currentConsumtion = 0;
		futureConsumtion = 0;
		//Bisher bestes Gerät zum optimieren:
		_BasicAnswerContent optimize = null;
		

		for(BasicAnswer msg : super.answerListReceived){	//Was ist das für eine Syntax???? <----------
    		if(msg.answerContent instanceof _BasicAnswerContent){
    			//System.out.println("Antwort BasicAnswerContent erhalten!");
    			_BasicAnswerContent ans = (_BasicAnswerContent) msg.answerContent;
    			currentConsumtion += ans.currentConsumtion;
    			futureConsumtion  += ans.futureConsumption;
    			if(Sparmodus){
    				if(optimize==null){
    					optimize = ans;
    					System.out.println("Check: 1");
    				}
    				if((!ans.istEnergieSparModusAN)&&((100-ans.istPrioritaet)*ans.currentConsumtion)>(optimize.currentConsumtion*(100-optimize.istPrioritaet))){
    					optimize = ans;
    					System.out.println("Check: 2");
    				}
    			}
    			if(!Sparmodus){
    				if(optimize==null){
    					optimize = ans;
    					System.out.println("Check: 3");
    				}
    				if(ans.istEnergieSparModusAN&&((ans.ConsumptionMAX-ans.currentConsumtion)>(optimize.ConsumptionMAX-optimize.currentConsumtion))){
    					optimize = ans;
    					System.out.println("Check: 4");
    				}
    			}
    		}
			
    		/*
			if (msg.answerContent instanceof WaschmaschineAnswerContent){
    			WaschmaschineAnswerContent WM = (WaschmaschineAnswerContent)msg.answerContent;
    			//Aktionen die ausgeführt werden, wenn eine Antwort von der Waschmaschine erkannt wurde!
    			actualConsuption += WM.currentConsumtion;
    			System.out.println("Waschmaschine erkannt");
    			
    			if(WM.istAuftrag && WM.istAutomatik){
    				requestContentToSend.istAenderung = true;
    				requestContentToSend.ausschalten = false;
    				System.out.println("EMS hat Waschmaschine angeschaltet!");
    			}
    			
    			
    			
    			
    			BioGasAnswerContent bioGasAnswerContent = (BioGasAnswerContent) msg.answerContent;
    			childProduction = bioGasAnswerContent.currentProducton;
    			childPlannedProduction = bioGasAnswerContent.expectedProduction;
    		}
    		if (msg.answerContent instanceof testAnswerContent){
    			testAnswerContent WM = (testAnswerContent)msg.answerContent;
    			
    			System.out.println("Zahl: " + WM.zahl);
    			//Aktionen die ausgeführt werden, wenn eine Antwort von der Waschmaschine erkannt wurde!
       		}
    		*/
    	}
		
		createRequest(optimize);
		answerContentToSend.currentConsumtion = currentConsumtion;
		answerContentToSend.futureConsumption = currentConsumtion;
	}
	
	/**
	 * @param optimize
	 */
	private void createRequest(_BasicAnswerContent optimize) {
		if(optimize instanceof HeizungAnswerContent){
			System.out.println("Die Heizung wird optimiert!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			requestContentToSend = new HeizungRequestContent();
			((HeizungRequestContent)requestContentToSend).istEnergieSparModusAN = Sparmodus;
			if(Sparmodus){
				((HeizungRequestContent)requestContentToSend).acceptedConsumption = optimize.currentConsumtion*optimize.istPrioritaet/100;
			}else{
				((HeizungRequestContent)requestContentToSend).acceptedConsumption = optimize.ConsumptionMAX;
			}
		}
		if(optimize instanceof KuehlschrankAnswerContent){
			System.out.println("Die Kuehlschrank wird optimiert!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
		if(optimize instanceof WaschmaschineAnswerContent){
			System.out.println("Die Waschmaschine wird optimiert!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
		
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		System.out.println(answerContentToSend.toString());
		return answerContentToSend;
	}
	
	@Override
	public RequestContent returnRequestContentToSend() {
		System.out.println(requestContentToSend.toString());
		return requestContentToSend;
	}

	/* (non-Javadoc)
	 * @see behavior.BehaviorModel#handleRequest()
	 */
	@Override
	public void handleRequest() {
		
		
	}

	/* (non-Javadoc)
	 * @see behavior.BehaviorModel#handleError()
	 */
	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {
		
		
	}
	
	
}