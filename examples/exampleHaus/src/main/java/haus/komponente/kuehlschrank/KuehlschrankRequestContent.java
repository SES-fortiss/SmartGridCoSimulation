package haus.komponente.kuehlschrank;

import haus.komponente._messageContents._iVerbraucherRequestContent;

/**
 * KuehlschrankRequestContent
 * 05.08.2014
 * @author Markus
 * FERTIG
 */
public class KuehlschrankRequestContent extends _iVerbraucherRequestContent{

	/**
	 * Standardkonstruktor
	 * @param name eindeutige Identifikation
	 * @param expectedConsumption Wunschverbrauch
	 * @param expectedConsumptionMIN Wunsch Mindestverbrauch
	 * @param expectedConsumptionMAX Wunsch Maximalverbrauch
	 * @param istModusAutomatik 
	 * @param istModusPufferLaden
	 * @param istModusPufferEntladen
	 * OK
	 */
	public KuehlschrankRequestContent(String name,
			double[] expectedConsumption, double[] expectedConsumptionMIN,
			double[] expectedConsumptionMAX, boolean istModusAutomatik,
			boolean istModusPufferLaden, boolean istModusPufferEntladen) {
		super(name, expectedConsumption, expectedConsumptionMIN,
				expectedConsumptionMAX, istModusAutomatik, istModusPufferLaden,
				istModusPufferEntladen);
		debug("KuehlschrankRequestContent("+name+",...) aufgerufen");
		/*debug("Index | expCon | expMIN | expMAX");
		for(int i = 0 ; i < 96 ; i++){
			debug(i+" | "+this.getExpectedConsumption(i)+" | "+this.getExpectedConsumptionMIN(i)+" | "+this.getExpectedConsumptionMAX(i));
		}*/
	}

	

}
