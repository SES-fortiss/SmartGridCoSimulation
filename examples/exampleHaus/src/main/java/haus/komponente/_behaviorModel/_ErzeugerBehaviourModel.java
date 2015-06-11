package haus.komponente._behaviorModel;

import haus.komponente._messageContents._ErzeugerAnswerContent;
import haus.komponente._messageContents._ErzeugerRequestContent;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;

/**
 * _ErzeugerBehaviourModel
 * Stellt Methoden/Attribute zur Verfügung, die für jedes Erzeugerverhalten benötigt werden.
 * 06.10.2014
 * @author Markus
 * @version 1.0
 */
public abstract class _ErzeugerBehaviourModel extends __BasicBehaviorModel{
	//Abstrakte Methoden aus BehaviourModel <---------------------------------------------------------
		public abstract void handleRequest();
	    public abstract void makeDecision();
	    public abstract void handleError(LinkedList<ErrorAnswerContent> errors);
	    public abstract AnswerContent returnAnswerContentToSend();
	    public abstract RequestContent returnRequestContentToSend();
	//Abstrakte Methoden zum Aufteilen in kleinere Schritte (__BasicBehaviourModel) <-------------------
		public abstract boolean step1updateRequest();
		public abstract boolean step2simulateStep();
		public abstract boolean step3simulateInflueces();
		public abstract boolean step4calculateFutureConsumption();
		public abstract boolean step5updateAnswer();
	//Hilfsmethoden! <--------------------------------------------------------------------------------
		//Diese Methoden sollten in Unterklassen überschrieben werden!!!!
		public _ErzeugerAnswerContent getAnswer(){		return ((_ErzeugerAnswerContent)answer);}
		public _ErzeugerRequestContent getRequest(){	return ((_ErzeugerRequestContent)request);}
		public void error(String text){	System.out.println("ERROR: (_ErzeugerBehaviourModel)"+text);	}
		public void debug(String text){	if(isDebug){System.out.println("DEBUG: (_ErzeugerBehaviourModel)"+ text);}}
	//Variablen <-------------------------------------------------------------------------------------
	
	//Konstruktoren <--------------------------------------------------------------------------------------	
		/**
		 * Standardkonstruktor
		 * @param answer
		 * @param request
		 */
		public _ErzeugerBehaviourModel(_ErzeugerAnswerContent answer, _ErzeugerRequestContent request){
			super(answer,request);
		}
}
