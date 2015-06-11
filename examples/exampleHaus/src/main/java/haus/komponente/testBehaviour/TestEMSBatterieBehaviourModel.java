package haus.komponente.testBehaviour;

import haus.komponente._messageContents.__BasicAnswerContent;
import haus.komponente._messageContents.__BasicRequestContent;
import haus.komponente.batteriespeicher.BatterieAnswerContent;
import haus.komponente.batteriespeicher.BatterieRequestContent;
import haus.komponente.homematik.HomematikAnswerContent;
import haus.komponente.homematik.HomematikRequestContent;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.BasicAnswer;
import behavior.BehaviorModel;

/**
 * Testklasse für die Batterie.
 * @author Markus
 * OK Getestet 26.9.14
 */
public class TestEMSBatterieBehaviourModel extends BehaviorModel{
	
	public TestEMSBatterieBehaviourModel(
			HomematikAnswerContent homematikanswer,
			HomematikRequestContent homematikrequest) {
		
	}

	@Override
	public void handleRequest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeDecision() {
		System.out.println("makeDecision():");
		String meldung = "";
		try{
			for(BasicAnswer msg : super.answerListReceived){	
	    		try{
					if(msg.answerContent instanceof BatterieAnswerContent){
		    			meldung = meldung +((BatterieAnswerContent)msg.answerContent).INFOausgeben();
		    		}
	    		}catch(Exception e){}
			}
		}catch(Exception e){}
		System.out.println(meldung);
	}

	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public __BasicAnswerContent returnAnswerContentToSend() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public __BasicRequestContent returnRequestContentToSend() {
		BatterieRequestContent request = new BatterieRequestContent("Hausspeicher1", 1000);
		System.out.println("returnRequestContentToSend():"+getActualTimeStep());
		// Testrequests anpassen...
		//double[] neueWerte = { 1,2,3,4,5};
		//request.setExpectedConsumption(neueWerte, getActualTimeStep()+1);
		
		double [] array = {3000, -300,69,145,63,-200000};
		if(this.getActualTimeStep()==2){
			//Den zukünftigen Verbrauch festlegen...
			request.setExpectedConsumption(array,getActualTimeStep()+1);
			return request;
		}
		
		return null;
	}

}
