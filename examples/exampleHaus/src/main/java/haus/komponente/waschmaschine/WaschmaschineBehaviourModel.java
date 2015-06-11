package haus.komponente.waschmaschine;

import haus.komponente._behaviorModel._eVerbraucherBehaviorModel;
import haus.komponente._schedule.Auftrag;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;

/**
 * WaschmaschineBehaviourModel
 * Implementiert das Verhalten einen intelligenten steuerbaren Waschmachine.
 * 27.08.2014
 * @author Markus
 * TODO Prüfen
 */
public class WaschmaschineBehaviourModel extends _eVerbraucherBehaviorModel{
//Abstrakte Methoden aus BehaviourModel <---------------------------------------------------------
	//public  void handleRequest();
    //public abstract void makeDecision();
    //public abstract void handleError(LinkedList<ErrorAnswerContent> errors);
    //public abstract AnswerContent returnAnswerContentToSend();
    //public abstract RequestContent returnRequestContentToSend();
//Abstrakte Methoden zum Aufteilen in kleinere Schritte (__BasicBehaviourModel) <-------------------
	//public abstract boolean step1updateRequest();
	//public abstract boolean step2simulateStep();
	//public abstract boolean step3simulateInflueces();
	//public abstract boolean step4calculateFutureConsumption();
	//public abstract boolean step5updateAnswer();
//Hilfsmethoden! <--------------------------------------------------------------------------------
	//Diese Methoden sollten in Unterklassen überschrieben werden!!!!
	public WaschmaschineAnswerContent getAnswer(){		return ((WaschmaschineAnswerContent)answer);}
	public WaschmaschineRequestContent getRequest(){	return ((WaschmaschineRequestContent)request);}
	public void error(String text){	System.out.println("ERROR: (WaschmaschineBehaviorModel)"+text);	}
	public void debug(String text){	if(isDebug){System.out.println("DEBUG: (WaschmaschineBehaviorModel)"+ text);}}
	
	/**Standardkonstruktor*/
	public WaschmaschineBehaviourModel(WaschmaschineAnswerContent answer,
			WaschmaschineRequestContent request) {
		super(answer, request);
	}
	public boolean step1updateRequest() {
		
		try{	
			WaschmaschineRequestContent befehl = (WaschmaschineRequestContent) requestContentReceived;
			if(befehl.name == getAnswer().name){
				//Meldung ausgeben, wenn Auftrag überschrieben wird.
				if(getRequest().isNeuerAuftrag()){ error("step1updateRequest() -> Auftrag wird überschrieben");}
				request = befehl;
				repairRequest();
				debug("WaschmaschineBehaviourModel.updateRequest() hat request geupdatet");
				return true;
			}/*else{
				debug("WaschmaschineBehaviourModel.updateRequest() hat request NICHT geupdatet");
			}*/
		}catch(Exception e){}
		repairRequest();
		return false;
	}
	public boolean step3simulateInflueces() {
		// Aufträge generieren - nicht gewollt. Aufträge können auch über den EMS generiert werden.
		return false;
	}
	public boolean step5updateAnswer() {
		//wish/needFutureConsumption berechnen
		//1. Wenn Zeit abläuft, muss needFuture erhöht werden
		//2. wenn istAN -> needFuture aktualisieren...
		double [] wish = new double[8];
		double [] need = new double[8];
		//Wish
		Auftrag awish = new Auftrag(getAnswer().getAuftrag());
		for(int i = 0 ; i < 8 ; i++){
			awish.startAbschnitt();
			wish[i]=awish.simulateStep();
		}
		
		//need
		Auftrag t = new Auftrag(getAnswer().getAuftrag());
		for(int i = 0 ; i < 8 ; i++){
			if(t.istAN()){
				need[i] = t.simulateStep();
			}else{
				if(t.getRestAnzahlOfAuftrag()+this.getActualTimeStep()+i+1>=t.getTimestepPlanedFinished()){
					t.startAbschnitt();
				}
			}
		}
		getAnswer().setNeedFutureConsumption(need);
		getAnswer().setWishFutureConsumption(wish);
		return true;
	}//OK
	
	public WaschmaschineAnswerContent returnAnswerContentToSend() {	return getAnswer();}
	
	public WaschmaschineRequestContent returnRequestContentToSend() {return null;}
	
	
	
	
	public void handleRequest() {}
	public void handleError(LinkedList<ErrorAnswerContent> errors) {}
}
