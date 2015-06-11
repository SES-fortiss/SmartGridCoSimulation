package haus.komponente.testBehaviour;


import haus.komponente._messageContents.__BasicAnswerContent;
import haus.komponente._messageContents.__BasicRequestContent;
import haus.komponente.batteriespeicher.BatterieAnswerContent;
import haus.komponente.batteriespeicher.BatterieRequestContent;
import haus.komponente.elektroheizung.ElektroheizungAnswerContent;
import haus.komponente.elektroheizung.ElektroheizungRequestContent;
import haus.komponente.homematik.HomematikAnswerContent;
import haus.komponente.homematik.HomematikRequestContent;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.BasicAnswer;
import behavior.BehaviorModel;

/**
 * Testklasse für die Batterie.
 * @author Markus
 * OK getestet 29.9.14
 */
@SuppressWarnings("unused")
public class TestEMSElektroheizungBehaviourModel extends BehaviorModel{
	
	public TestEMSElektroheizungBehaviourModel(
			HomematikAnswerContent homematikanswer,
			HomematikRequestContent homematikrequest) {
	}

	public void handleRequest() {}
	public void handleError(LinkedList<ErrorAnswerContent> errors) {}
	public __BasicAnswerContent returnAnswerContentToSend() {return null;}

	public void makeDecision() {
		System.out.println("makeDecision():");
		String meldung = "";
		try{
			for(BasicAnswer msg : super.answerListReceived){	
	    		try{
					if(msg.answerContent instanceof ElektroheizungAnswerContent){
		    			meldung = meldung +((ElektroheizungAnswerContent)msg.answerContent).INFOausgeben();
		    		}
	    		}catch(Exception e){}
			}
		}catch(Exception e){}
		System.out.println("'"+meldung+"'");
	}

	public __BasicRequestContent returnRequestContentToSend() {
		ElektroheizungRequestContent re = new ElektroheizungRequestContent("Elektroheizung1");
		re.istModusAutomatik=true;
		re.istModusPufferEntladen=false;
		re.istModusPufferLaden=false;
		//System.out.println("returnRequestContentToSend():"+getActualTimeStep());
		
		//benötigte Tests: Fälle siehe _iVerbraucherBehaviourModel.step4calculateFutureConsumption()
		//Fall 1.1 Automatikmodus
		if(this.getActualTimeStep()==1){
			System.out.println("Automatik testen!");
			re.istModusAutomatik = true;
			re.istModusPufferEntladen = false;
			re.istModusPufferLaden = false;
			for(int i = 0 ; i < 10 ; i++){
				re.setExpectedConsumptionMIN(3000, i);
				re.setExpectedConsumption(9500, i);
			}
			return re;
		}
		/*
		//Fall 1.2 Automatik entladen
		if(this.getActualTimeStep()==1){ //OK getestet und Fehler behoben
			//Den zukünftigen Verbrauch festlegen...
			System.out.println("Automatik entladen testen!");
			re.istModusAutomatik = true;
			re.istModusPufferEntladen = true;
			re.istModusPufferLaden = false;
			return re;
		}
		//Fall 1.3 Automatik laden
		if(this.getActualTimeStep()==1){ //OK getestet Logik verbessert
			//Den zukünftigen Verbrauch festlegen...
			System.out.println("Automatik laden testen!");
			re.istModusAutomatik = true;
			re.istModusPufferEntladen = false;
			re.istModusPufferLaden = true;
			return re;
		}*/
		//Fall 2.0 Manuell
		/*
		if(this.getActualTimeStep()==1){  //OK getestet, Logik verbessert
			//Den zukünftigen Verbrauch festlegen...
			System.out.println("Manuel testen!");
			re.istModusAutomatik = false;
			re.istModusPufferEntladen = false;
			re.istModusPufferLaden = false;
			return re;
		}*/
		
		
		//Testrequests generieren...
		
		
		return null;
	}
}