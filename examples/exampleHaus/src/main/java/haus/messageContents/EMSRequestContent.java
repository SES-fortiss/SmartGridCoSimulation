package haus.messageContents;

import akka.basicMessages.RequestContent;

/**
 * BasicRequestContent
 * 29.04.2014
 * @author Markus
 *
 */
public class EMSRequestContent implements RequestContent{
	
	@Override
	public String toString(){
		return "EMSRequestContent: Das ist die Steuerzentrale des Hauses!";
	}

}
