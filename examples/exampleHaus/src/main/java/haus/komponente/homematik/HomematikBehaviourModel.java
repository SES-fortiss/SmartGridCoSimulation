package haus.komponente.homematik;

import haus.komponente._behaviorModel._VerwaltungBehaviourModel;
import haus.komponente._messageContents.__BasicAnswerContent;
import haus.komponente._messageContents.__BasicRequestContent;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;


/**
 * WICHTIG: Dient derzeit zum Testen der einzelnen Komponenten
 * EMSBehaviourModel
 * 30.05.2014
 * @author Markus
 *
 */
public class HomematikBehaviourModel extends _VerwaltungBehaviourModel{
	
	
	
	/**
	 * Request das an die Kinder gesended wird.
	 */
	__BasicRequestContent generatedRequest = null;
	
	/**
	 * Standardkonstruktor
	 * @param answer
	 * @param request
	 */
	public HomematikBehaviourModel(HomematikAnswerContent answer,
			HomematikRequestContent request) {
		super(answer, request);
	}

	
	

	
	public void makeDecision() {
		debug("Makedecision aufgerufen!");
		//Aufgaben:
		//1.Verbrauch aufzeichnen. (fertig, nicht getestet)
		aufzeichnen();
		//2.Request erstellen.
		
	}
	
	//Variablen:
	boolean jsonStringsNotInitiated =true;
	String jsonString = "";
	
	
	/**
	 * Liest die erhaltenen Ansers aus und speichert sie in Variablen
	 * Im Timestep 95 wird eine csv-Datei erstellt und gespeichert.
	 */
	public void aufzeichnen() {
		if (jsonStringsNotInitiated){			
			jsonString = "#timestep , ";
			try{
				for(BasicAnswer msg : super.answerListReceived){	
		    		try{
						if(msg.answerContent instanceof __BasicAnswerContent){
			    			jsonString = jsonString + ((__BasicAnswerContent)msg.answerContent).name + " , ";
			    		}
		    		}catch(Exception e){}
				}
			}catch(Exception e){}	
			jsonString = jsonString + "\n";
			jsonStringsNotInitiated = false;
			debug("aufzeichen.initialise: jsonString='"+jsonString+"'");
		}
		jsonString = jsonString + this.getActualTimeStep() + " , ";
		try{
			for(BasicAnswer msg : super.answerListReceived){	
	    		try{
					if(msg.answerContent instanceof __BasicAnswerContent){
		    			jsonString = jsonString + ((__BasicAnswerContent)msg.answerContent).getCurrentConsumption() + " , ";
		    			
					}
	    		}catch(Exception e){}
			}
		}catch(Exception e){}	
		jsonString = jsonString + "\n";
		debug("Neuer JSonString"+jsonString);
	}

	
	//Hilfsmethoden:
	/**
	 * @return gibt die Anzahl der registrierten Geräte zurück.
	 */
	@SuppressWarnings("unused")
	private int getAnzahlAntworten() {
		try{
			return this.answerListReceived.size();
		}catch(Exception e){
			if(this.answerListReceived == null){
			error("NULL Pointer");
			}
			return 0;
		}
	}
	
	
	




	public AnswerContent returnAnswerContentToSend() {
		return answer;
	}
	public RequestContent returnRequestContentToSend() {
		// TODO Auto-generated method stub
		return request;
	}
	
	public void handleRequest() {}
	public void handleError(LinkedList<ErrorAnswerContent> errors) {}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/* (non-Javadoc)
	 * @see behavior.BehaviorModel#makeDecision()
	 */
	/*
	public void makeDecision() {
		//Aufgaben:
		//Verbrauchsaufzeichnung
		aufzeichnen();
		
 		//Entscheidung treffen
		
		request = null;
		Statusausgeben();
		if(this.getActualTimeStep() == 1){
			System.out.println("getActualTimeStep():"+this.getActualTimeStep());
			request = new BatterieRequestContent("Hausspeicher2", 2000);
		}
		if(this.getActualTimeStep() == 5){
			System.out.println("getActualTimeStep():"+this.getActualTimeStep());
			double[] werte = {0.0 , 1000,-1000,3000,-5000,5000,6000,-9000};
			request = new BatterieRequestContent("Hausspeicher1", 1000);
			request.setExpectedConsumption(werte, 5+2);
		}
		if(this.getActualTimeStep() == 6){
			System.out.println("getActualTimeStep():"+this.getActualTimeStep());
			request = new BatterieRequestContent("Hausspeicher2", -2000);
		}
		if(this.getActualTimeStep() == 11){
			System.out.println("getActualTimeStep():"+this.getActualTimeStep());
			request = new BatterieRequestContent("Hausspeicher1", -7000);
		}
		if(this.getActualTimeStep() == 15){
			System.out.println("getActualTimeStep():"+this.getActualTimeStep());
			request = new BatterieRequestContent("Hausspeicher1", 7000);
		}
		
	}*/

	/* (non-Javadoc)
	 * @see behavior.BehaviorModel#handleRequest()
	 */
	/*
	public void handleRequest() {
		
	}

	/**
	 * Gibt den Status des Homematik in der Konsole aus...
	 *//*
	private void Statusausgeben() {
		System.out.println("Statusmedung von "+answer.name + ": " + getAnzahlAntworten() + "Ger�te erkannt!");
		try{
			for(BasicAnswer msg : super.answerListReceived){	
	    		if(msg.answerContent instanceof __BasicAnswerContent){
	    			System.out.println("     "+((__BasicAnswerContent)msg.answerContent).INFOausgeben());
	    		}
			}
		}catch(Exception e){}
	}

	/**
	 * @return gibt die Anzahl der registrierten Ger�te zur�ck.
	 *//*
	private int getAnzahlAntworten() {
		//return 0;
		try{
			return this.answerListReceived.size();
		}catch(Exception e){
			if(this.answerListReceived == null){
			error("NULL Pointer");
			}
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see behavior.BehaviorModel#returnAnswerContentToSend()
	 */
	/*
	public AnswerContent returnAnswerContentToSend() {
		return answer;
	}

	/* (non-Javadoc)
	 * @see behavior.BehaviorModel#returnRequestContentToSend()
	 */
	/*
	public RequestContent returnRequestContentToSend() {
		return request;
	}

	/* (non-Javadoc)
	 * @see behavior.BehaviorModel#handleError()
	 */
	/*
	public void handleError(LinkedList<ErrorAnswerContent> errors) {

		
	}*/

	

}
