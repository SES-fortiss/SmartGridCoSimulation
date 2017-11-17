package modellierung.nachrichten;

import akka.basicMessages.AnswerContent;

public class EMSmsg implements AnswerContent {

	public double aktuellerVerbrauch;
	public double aktuelleProduktion;
	public double erzeugungsKapazitat;
	public double kosten;
	public double wirtschaflicheBilanz;
	public MEMAPmsg receivedMsg;
	
	
}
