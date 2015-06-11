

package haus.messageContents;


/**
 * BasicAnswerContent
 * 29.04.2014
 * @author Markus
 *
 */
public class EMSAnswerContent extends _IntelligentBasicAnswerContent{
	
	public EMSAnswerContent(){
		this.currentConsumtion = 3.0;
		this.futureConsumption = 3.0;
	}
	
	
	@Override
	public String toString(){
		return ("Aktueller Gesamtstromverbrauch: "+ currentConsumtion);
	}
	
}
