package haus.komponente._messageContents;

/**
 * _SpeicherRequestContent
 * Implementiert den Standard-Request von dem EMS an den Speicher
 * Steuerm�glichkeit:
 * Modus 0: expectedConsumption[8]: M�glichkeit, die Auf/Abgabe zwei Stunden im voraus festzulegen.
 * Modus 1: Energieauf/abgabe nach festem Plan (expectedConsumptionDay)
 * 
 * 29.05.2014
 * @author Markus
 * FERTIG
 */
public abstract class _SpeicherRequestContent extends __BasicRequestContent{
	//diese Variable wurde durch expectedConsumption in der Oberklasse ersetzt!!!!!
	//public double futureConsumption = 0;		//Gew�nschte Stromaufnahme/Stromabgabe
	
	
	
	public _SpeicherRequestContent(String name, double expectedConsumption){
		super(name,expectedConsumption,0,0);
	}
	
	public _SpeicherRequestContent(String name, double[] expectedConsumption){
		super(name,expectedConsumption);		
	}
	
//Hilfsmethoden f�r EMS <--------------------------------------------------------------------------------------
	
	
	
}
