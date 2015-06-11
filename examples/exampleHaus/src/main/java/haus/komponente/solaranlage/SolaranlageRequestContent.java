package haus.komponente.solaranlage;

import haus.komponente._messageContents._ErzeugerRequestContent;

/**
 * SolaranlageRequestContent
 * 01.06.2014
 * @author Markus
 * FERTIG
 */
public class SolaranlageRequestContent extends _ErzeugerRequestContent{
//Variablen <--------------------------------------------------------------------------------------------
	
//Konstruktoren <---------------------------------------------------------------------------------------- 	
	/**
	 * Standardkonstruktor für zeitabhängige Werte
	 * HINWEIß: expectedConsumption, expectedConsumptionMAX werden bei Solaranlagen nicht benötigt da 
	 * die Funktion mit Solaranlagen nicht umsetzbar ist.
	 * @param name eindeutige Identifikation zum Behaviormodel
	 * @param expectedConsumptionMIN Array mit Maximalerzeugung (=-|Maximalerzeugung|)
	 * @param expectedConsumptionDeltaMAX Array mit Maximaler Unsicherheitsfaktor
	 */
	public SolaranlageRequestContent(String name, 
			double[] expectedConsumptionMIN,
			double[] expectedConsumptionDeltaMAX){
		super(name,null,expectedConsumptionMIN,null,expectedConsumptionDeltaMAX);
		debug("zeitabhängiger Konstruktor aufgerufen!");
	}
	/**
	 * Standardkonstruktor für ZEITUNABHÄNGIGE Werte
	 * HINWEIß: expectedConsumption, expectedConsumptionMAX werden bei Solaranlagen nicht benötigt da 
	 * die Funktion mit Solaranlagen nicht umsetzbar ist.
	 * @param name eindeutige Identifikation zum Behaviormodel
	 * @param expectedConsumptionMIN Maximalerzeugung (=-|Maximalerzeugung|)
	 * @param expectedConsumptionDeltaMAX Maximaler Unsicherheitsfaktor
	 */
	public SolaranlageRequestContent(String name, double expectedConsumptionMIN, double expectedConsumptionDeltaMAX){
		super(name,0,expectedConsumptionMIN,0,expectedConsumptionDeltaMAX);
		debug("zeitunabhängiger Konstruktor aufgerufen!");
	}
	
//Abstrakte Methoden <---------------------------------------------------------------------------------
		
//Hilfsmethoden! <-------------------------------------------------------------------------------------
//Diese Methoden sollten in Unterklassen überschrieben werden!!!!
	@Override
	public void error(String text){
		System.out.println("ERROR: (SolaranlageRequestContent)"+text);
	}
	@Override
	public void debug(String text){
		if(isDebug){
			System.out.println("DEBUG: (SolaranlageRequestContent)"+ text);
		}
	}
}
