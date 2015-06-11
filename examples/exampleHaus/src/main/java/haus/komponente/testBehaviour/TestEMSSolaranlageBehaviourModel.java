package haus.komponente.testBehaviour;

import haus.komponente._messageContents.__BasicAnswerContent;
import haus.komponente._messageContents.__BasicRequestContent;
import haus.komponente.elektroheizung.ElektroheizungAnswerContent;
import haus.komponente.elektroheizung.ElektroheizungRequestContent;
import haus.komponente.fixeVerbraucher.fixeVerbraucherAnswerContent;
import haus.komponente.homematik.HomematikAnswerContent;
import haus.komponente.homematik.HomematikRequestContent;
import haus.komponente.kuehlschrank.KuehlschrankAnswerContent;
import haus.komponente.kuehlschrank.KuehlschrankRequestContent;
import haus.komponente.solaranlage.SolaranlageAnswerContent;
import haus.komponente.solaranlage.SolaranlageRequestContent;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.BasicAnswer;
import behavior.BehaviorModel;

/**
 * Testklasse für den Solaranlage.
 * @author Markus
 * Ein Sommertag wird simuliert
 * Reaktion auf Requests getestet OK
 */
@SuppressWarnings("unused")
public class TestEMSSolaranlageBehaviourModel extends BehaviorModel{
	public String tabelle = "#timestep , Uhrzeit , currCon , fut[0] , fut[1] , fut[2] , fut[3] , fut[4] , fut[5] , fut[6] , fut[7] , INFO\n";
	public double stromverbrauch = 0;

	
	public TestEMSSolaranlageBehaviourModel(
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
					if(msg.answerContent instanceof SolaranlageAnswerContent){
						SolaranlageAnswerContent antwort = (SolaranlageAnswerContent)msg.answerContent;
						meldung = meldung +(antwort).INFOausgeben();
		    			stromverbrauch +=antwort.getCurrentConsumption();
						tabelle = tabelle + this.getActualTimeStep() +" Uhr: "+ (int)this.getActualTimeStep()/4 +":";
		    			switch(this.getActualTimeStep()%4){
		    			case 0: tabelle = tabelle + "00 "; break;
		    			case 1: tabelle = tabelle + "15 "; break;
		    			case 2: tabelle = tabelle + "30 "; break;
		    			case 3: tabelle = tabelle + "45 "; break;
		    			}
		    			tabelle = tabelle +" , "+(int) antwort.getCurrentConsumption()
		    					+" , "+(int) antwort.getFutureConsumption(0)
    							+" , "+(int) antwort.getFutureConsumption(1)
    							+" , "+(int) antwort.getFutureConsumption(2)
    							+" , "+(int) antwort.getFutureConsumption(3)
    							+" , "+(int) antwort.getFutureConsumption(4)
    							+" , "+(int) antwort.getFutureConsumption(5)
    							+" , "+(int) antwort.getFutureConsumption(6)
    							+" , "+(int) antwort.getFutureConsumption(7)+"\n";
    							//+" , "+antwort.INFO+"\n";
		    			System.out.println(tabelle);
		    			System.out.println("Stromverbrauch: "+((stromverbrauch/400)/10) +"kWh");
		    		}
	    		}catch(Exception e){}
			}
		}catch(Exception e){}
		System.out.println("'"+meldung+"'");
	}
	
	public __BasicRequestContent returnRequestContentToSend() {
		SolaranlageRequestContent re = new SolaranlageRequestContent("Solaranlage1",-3700,0);
		//System.out.println("returnRequestContentToSend():"+getActualTimeStep());
		
		//benötigte Tests: Fälle siehe _iVerbraucherBehaviourModel.step4calculateFutureConsumption()
		//Fall 1.1 Automatikmodus
		if(this.getActualTimeStep()==20){
			return re;
		}
		return null;
	}
}