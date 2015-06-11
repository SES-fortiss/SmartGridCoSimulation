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

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.BasicAnswer;
import behavior.BehaviorModel;

/**
 * Testklasse für den Kühlschrank.
 * @author Markus
 * Getestet und auf einen durchschnittlichen Verbrauch eingestellt: 0.27-0.33kWh/d -> ca 100 kWh/d
 */
@SuppressWarnings("unused")
public class TestEMSKuehlschrankBehaviourModel extends BehaviorModel{
	public String tabelle = "#timestep , Uhrzeit , currCon , fut[0] , fut[1] , fut[2] , fut[3] , fut[4] , fut[5] , fut[6] , fut[7] , isBuffer , INFO\n";
	public double stromverbrauch = 0;

	
	public TestEMSKuehlschrankBehaviourModel(
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
					if(msg.answerContent instanceof KuehlschrankAnswerContent){
						KuehlschrankAnswerContent antwort = (KuehlschrankAnswerContent)msg.answerContent;
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
    							+" , "+(int) antwort.getFutureConsumption(7)
    							+" , "+antwort.getBuffer() + "\n";
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
		KuehlschrankRequestContent re = new KuehlschrankRequestContent("Elektroheizung1",null,null,null,false,false,false);
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