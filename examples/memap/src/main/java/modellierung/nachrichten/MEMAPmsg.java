package modellierung.nachrichten;

import akka.basicMessages.RequestContent;

public class MEMAPmsg implements RequestContent {

	public double preis;
	public double production;
	public double verbrauch;
	public double grenzwertprozent;
	
}
