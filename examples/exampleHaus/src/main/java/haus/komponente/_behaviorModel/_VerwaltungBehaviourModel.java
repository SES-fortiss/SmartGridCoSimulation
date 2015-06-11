package haus.komponente._behaviorModel;

import haus.komponente._messageContents._VerwaltungAnswerContent;
import haus.komponente._messageContents._VerwaltungRequestContent;
import haus.komponente._messageContents.__BasicAnswerContent;
import haus.komponente._messageContents.__BasicRequestContent;
import behavior.BehaviorModel;


/**
 * _BasicEMSBehaviourModel
 * Diese Klasse definiert grundlegende Funktionen, die ein Verwaltungsobjekt wie z.B. ein EMS haben muss.
 * TODO Viele Erweiterungen nötig!
 * HINWEIß: Alle Verwaltungsobjekte soltten von dieser Klasse erben.
 * HINWEIß: Diese Klasse erbt NICHT von __BasicBehaviorModel
 * 30.05.2014
 * @author Markus
 * FERTIG
 */
public abstract class _VerwaltungBehaviourModel extends BehaviorModel{
	public __BasicAnswerContent answer;
	public __BasicRequestContent request;
	public boolean isDebug = true;
	
	public _VerwaltungBehaviourModel(_VerwaltungAnswerContent answer, _VerwaltungRequestContent request){
		this.answer = answer;
		this.request= request;
	}
	
	
	public void error(String text){
		System.out.println("ERROR: (_VerwaltungBehaviourModel)"+text);
	}
	public void debug(String text){
		if(isDebug){System.out.println("DEBUG: (_VerwaltungBehaviourModel)"+ text);}
	}
}
