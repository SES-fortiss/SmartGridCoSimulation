package haus.komponente._behaviorModel;

import haus.komponente._messageContents._SpeicherAnswerContent;
import haus.komponente._messageContents._SpeicherRequestContent;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;

/**
 * _SpeicherBehaviourModel
 * Stellt Methoden/Attribute zur Verfügung, die für jedes Verhalten eines elektrischen Energiespeichers benötigt werden.
 * 06.10.2014
 * @author Markus
 * @version 1.0
 */
public abstract class _SpeicherBehaviourModel extends __BasicBehaviorModel{
//Abstrakte Methoden aus BehaviourModel <---------------------------------------------------------
	public abstract void handleRequest();
    public abstract void makeDecision();
    public abstract void handleError(LinkedList<ErrorAnswerContent> errors);
    public abstract AnswerContent returnAnswerContentToSend();
    public abstract RequestContent returnRequestContentToSend();
//Abstrakte Methoden zum Aufteilen in kleinere Schritte (__BasicBehaviourModel) <-------------------
	public abstract boolean step1updateRequest();
	//public abstract boolean step2simulateStep();
	public abstract boolean step3simulateInflueces();
	//public abstract boolean step4calculateFutureConsumption();
	//public abstract boolean step5updateAnswer();
//Hilfsmethoden! <--------------------------------------------------------------------------------
	//Diese Methoden sollten in Unterklassen überschrieben werden!!!!
	public _SpeicherAnswerContent getAnswer(){		return ((_SpeicherAnswerContent)answer);}
	public _SpeicherRequestContent getRequest(){	return ((_SpeicherRequestContent)request);}
	public void error(String text){	System.out.println("ERROR: (_SpeicherBehaviourModel)"+text);	}
	public void debug(String text){	if(isDebug){System.out.println("DEBUG: (_SpeicherBehaviourModel)"+ text);}}	
//Variablen <------------------------------------------------------------------------------------------	
//Konstruktoren <--------------------------------------------------------------------------------------		
	/**
	 * Standardkonstruktor
	 * @param answer
	 * @param request
	 */
	public _SpeicherBehaviourModel(_SpeicherAnswerContent answer,_SpeicherRequestContent request) {
		super(answer, request);
	}
//Fertige Hilfsfunktionen
	/**
	 * Prüft ob gültiger Kapazitätswert.
	 * @param wert Zu überprüfender Wert
	 * @return 
	 */
	public boolean isValidCapacity(double wert){
		if(wert >= 0 && wert<= getAnswer().CapacityMAX){
			return true;
		}
		return false;
	}
	/**
	 * Prüft ob Kapazitätsänderung gültig ist.
	 * @param aenderung Wert um den sich CurrentCapacity ändern soll.
	 * @return
	 */
	public boolean isValidCapacityChange(double aenderung){
		if(isValidCapacity(getAnswer().getCurrentCapacity()+aenderung)){
			return true;
		}
		return false;
	}
}