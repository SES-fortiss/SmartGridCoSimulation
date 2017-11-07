package example.aggregator;

import akka.basicMessages.AnswerContent;
import akka.systemActors.GlobalTime;
import example.helper.TypKlasse;

/**
 * 
 * @author bytschkow
 * 
 */
public class HouseToAggregator implements AnswerContent  {
	public double verbrauch = 0;
	public double erzeugung = 0;
	public double batterie = 0;
	public double last = 0; 		// last = erzeugung + batterie - verbrauch
	public double soc = 0;
	
	public double einspeisung = 0;
	public double eigenverbrauch = 0;
	public double bezug = 0;
	public double selbstversorgung = 0;
	public double autarkie = 0;
	
	public TypKlasse typ = null;
	
	public String toString(){
		return 
				//typ + ", " +
				GlobalTime.currentTime + ", " + 
				verbrauch*(-1) + ", " + 
				erzeugung + ", " +
				batterie + ", " + 
				last + ", " +
				soc + ", " +
				einspeisung + ", " +
				eigenverbrauch + ", " +
				bezug + ", " +
				autarkie + ", " + 
				selbstversorgung;
	}
}
