package haus.messageContents;

import akka.basicMessages.RequestContent;

/**
 * BasicRequestContent
 * 29.04.2014
 * @author Markus
 *
 * Dies ist der Minimale Befehlssatz den ein Elternobjekt seinem Kind sendet.
 * Andere Requests sollen hiervon erben!!!
 */
public class _BasicRequestContent implements RequestContent{
	public double acceptedConsumption = 10000.0;
	public boolean istEnergieSparModusAN = false;
	@Override
	public String toString(){
		return ("BasicRequestContent: { acceptedConsumption: " + acceptedConsumption
				+ " istEnergieSparModusAN: " + istEnergieSparModusAN);
	}
	

}
