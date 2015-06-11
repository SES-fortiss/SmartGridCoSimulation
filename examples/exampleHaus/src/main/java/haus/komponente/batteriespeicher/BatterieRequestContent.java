package haus.komponente.batteriespeicher;

import haus.komponente._messageContents._SpeicherRequestContent;

/**
 * BatterieRequestContent
 * 29.05.2014
 * @author Markus
 *
 */
public class BatterieRequestContent extends _SpeicherRequestContent{

	/**
	 * Standardkonstruktor
	 * @param name
	 * @param expectedConsumption
	 */
	public BatterieRequestContent(String name, double expectedConsumption) {
		super(name, expectedConsumption);
		debug("Konstruktoraufruf: BatterieRequestContent(...)");
	}

	@Override
	public String toString(){
		return (name + " futureConsumption:" + getExpectedConsumption());
	}
}
