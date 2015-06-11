package haus.behaviorModels;

import haus.messageContents._BasicAnswerContent;
import haus.messageContents._BasicRequestContent;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;

/**
 * Basic
 * 29.04.2014
 * @author Markus
 *
 */
public class BasicBehaviorModel extends BehaviorModel{
	//Variablen:
	
	
	//Antwort, die nach makeDecision automatisch an das Elternobjekt gesendet wird
	public _BasicAnswerContent answerContentToSend = new _BasicAnswerContent();
	
	//Request, die nach makeDecision automatisch an die Kindobjekte gesendet wird???? <-----------
	public _BasicRequestContent requestContentToSend = new _BasicRequestContent();
	
	
	
	/**
	 * Ablauf:
	 * 1. Antwort von Elternobjekt auslesen
	 * 2. Logik entscheiden lassen, was zu tun ist...
	 * 3. answerContentToSend und requestContentToSend initialisieren
	 * 4. Ausgaben in der Konsole
	 */
	@Override
	public void makeDecision(){
		System.out.println("makeDecision erfolgreich ausgeführt!!");
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
