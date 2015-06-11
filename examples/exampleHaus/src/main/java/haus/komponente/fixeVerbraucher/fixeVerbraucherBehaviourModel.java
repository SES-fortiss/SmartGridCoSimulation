package haus.komponente.fixeVerbraucher;

import haus.komponente._behaviorModel.__BasicBehaviorModel;
import haus.komponente._messageContents.__BasicAnswerContent;
import haus.komponente._messageContents.__BasicRequestContent;
import haus.komponente._schedule.HausSchedule;
import haus.komponente._schedule.__BasicSchedule;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.RequestContent;

/**
 * fixeVerbraucherBehaviourModel
 * Implementiert das Verhalten aller fixen Verbraucher. Der Verbrauch wird über den schedule.getFixenVerbrauch()
 * gewonnen. Diesen Verbraucher kann man nicht steuern.
 * 12.09.2014
 * @author Markus
 * OK durchschnittlich 9-10kWh pro Tag
 */
public class fixeVerbraucherBehaviourModel extends __BasicBehaviorModel{
	__BasicSchedule schedule = new HausSchedule();

//Konstruktor------------------------------------------------------------------------------------------
	/**
	 * Standardkonstuktor
	 * @param answer
	 * @param request
	 */
	public fixeVerbraucherBehaviourModel(__BasicAnswerContent answer,
			__BasicRequestContent request, __BasicSchedule schedule) {
		super(answer, request);
		if(schedule != null){
			this.schedule = schedule;
		}else{
			System.out.println("FEHLER: fixeVerbraucherBehaviourModel(*,*,null)");
			throw new NullPointerException();
		}
		//Maximalleistung berechnen und in Answer schreiben
		double max = 0; 
		for(int i = 0 ; i < 96 ; i++){
			if(this.schedule.getFixenVerbrauch(i)>max){ max = this.schedule.getFixenVerbrauch(i);}
		}
		getAnswer().setConsumptionMAX(max);
	}

	public void makeDecision() {
		step1updateRequest();
		step2simulateStep();
		step3simulateInflueces();
		step4calculateFutureConsumption();
		step5updateAnswer();		
	}
	
	//Abstrakte Methoden zum Aufteilen in kleinere Schritte <-------------------------------------------
	public boolean step1updateRequest() {
		//Es gibt keine Requests für fixe Verbraucher
		return false;
	}
	public boolean step2simulateStep() {
		getAnswer().setCurrentConsumption(getAnswer().getFutureConsumption(0));
		getAnswer().INFO = schedule.getFixenVerbrauchINFO(getActualTimeStep());
		return true;
	}
	public boolean step3simulateInflueces() {
		//Keine Einflüsse
		return false;
	}
	public boolean step4calculateFutureConsumption() {
		for(int i = 0 ; i < 8 ; i++){
			getAnswer().setFutureConsumption(schedule.getFixenVerbrauch(this.getActualTimeStep()+1+i), i);
		}
		return true;
	}
	public boolean step5updateAnswer() {
		//nichts benötigt
		return false;
	}

	
//Hilfsmethoden! <-------------------------------------------------------------------------------------
	//Diese Methoden sollten in Unterklassen überschrieben werden!!!!
		public fixeVerbraucherAnswerContent getAnswer(){return ((fixeVerbraucherAnswerContent)answer);}
		public fixeVerbraucherRequestContent getRequest(){return ((fixeVerbraucherRequestContent)request);}
		public void error(String text){	System.out.println("ERROR: (fixeVerbraucherBehaviorModel)"+text);	}
		public void debug(String text){	if(isDebug){System.out.println("DEBUG: (fixeVerbraucherBehaviorModel)"+ text);}}
		
	
	public fixeVerbraucherAnswerContent returnAnswerContentToSend() {return getAnswer();}
	public RequestContent returnRequestContentToSend() {return null;}

	
	
	public void handleRequest() {}
	public void handleError(LinkedList<ErrorAnswerContent> errors) {}
}
