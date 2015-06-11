package haus.messageContents;

import akka.basicMessages.AnswerContent;

/**
 * IntelligentBasicAnswerContent
* Das ist das Minimum an Informationen, die ein Verwalter(z.B. EMS) dem übergeordneten Objekt sendet!!
 * 16.05.2014
 * @author Markus
 *
 */
public class _IntelligentBasicAnswerContent implements AnswerContent{
	public double currentConsumtion;	
	public double futureConsumption;
	
	@Override
	public String toString(){
		return ("IntelligentBasicAnswerContent:{  currentConsumption:" + currentConsumtion
				+"  futureConsumption:" + futureConsumption
				+" }");
	}

}
