package haus.behaviorModels;

import haus.messageContents.testAnswerContent;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;

/**
 * testVererbung
 * 14.05.2014
 * @author Markus
 *
 */
public class testVererbung extends BehaviorModel{

	/* (non-Javadoc)
	 * @see behavior.BehaviorModel#makeDecision()
	 */
	@Override
	public void makeDecision() {
		
		
	}

	/* (non-Javadoc)
	 * @see behavior.BehaviorModel#returnAnswerContentToSend()
	 */
	@Override
	public AnswerContent returnAnswerContentToSend() {
		testAnswerContent a = new testAnswerContent();
		a.currentConsumtion=2000;
		return a;
	}

	/* (non-Javadoc)
	 * @see behavior.BehaviorModel#returnRequestContentToSend()
	 */
	@Override
	public RequestContent returnRequestContentToSend() {
		
		return null;
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
