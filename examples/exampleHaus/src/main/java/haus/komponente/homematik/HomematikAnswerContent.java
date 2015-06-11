package haus.komponente.homematik;

import haus.komponente._messageContents._VerwaltungAnswerContent;

/**
 * EMSAnswerContent
 * 30.05.2014
 * @author Markus
 *
 */
public class HomematikAnswerContent extends _VerwaltungAnswerContent{

	/**
	 * Standardknstuktor
	 * @param name
	 * @param consumptionMIN
	 * @param consumptionMAX
	 */
	public HomematikAnswerContent(String name, double consumptionMIN,double consumptionMAX) {
		super(name, consumptionMIN, consumptionMAX);
	}

	/* (non-Javadoc)
	 * @see haus.komponente.messageContents.__BasicAnswerContent#toString()
	 */
	@Override
	public String toString() {
		return "toString() von " + name;
	}

	/* (non-Javadoc)
	 * @see haus.komponente.messageContents.__BasicAnswerContent#INFOausgeben()
	 */
	@Override
	public String INFOausgeben() {
		return "INFO von "+name;
	}
}
