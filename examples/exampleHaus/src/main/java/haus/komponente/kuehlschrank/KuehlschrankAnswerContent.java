package haus.komponente.kuehlschrank;

import haus.komponente._messageContents._iVerbraucherAnswerContent;

/**
 * KuehlschrankAnswerContent
 * 05.08.2014
 * @author Markus
 *
 */
public class KuehlschrankAnswerContent extends _iVerbraucherAnswerContent{
	public String INFO = "";
	/**
	 * Standardkonstruktor KURZ: gefüllt mit 25kgWasser, 20kG Glas
	 * -> Puffergröße: 215Wh , Erlaubte Temperatur: 1.0-1.2°C
	 * ERKLÄRUNG:Berechnet die Temperatur aus bufferMAX wie folgt:
	 * Annahme: Kühlschrank ist mit 5Liter Gedränken, 10kg Glas und 17,5kg Gemüse/Joghurt... gefüllt.
	 * -> Wassermenge von ca. 25kg + 20kg Glas
	 * Die Temperatur darf zwischen 1°C und 1,2°C schwanken.
	 * Spezifische Wärmekapazität: cglas = 0,7 cwasser = 4 [kJ/°C/kg]
	 * Es folgt als Puffer: dE = 0.7kJ*0,2*10 + 4kJ*12,5*0,2= 8kJ + 48kJ = ca 56kJ 
	 * Wirkungsgrad = 1/14 (laut Wikipedia)
	 * Virtueller Puffer: 56kJ*14 = 780kJ = 215Wh(Wirkungsgrad einberechnet)
	 * -> Puffer benötigt folgende Leistungsaufnahme um nach 1 Stunde voll zu sein: 780kJ*4/3600 = 215Watt
	 * -> Da die Logik in Wh/4 rechnet ist der Puffer 215*4 Wh/4 = 860 Wh/4
	 * 
	 * Ergebnis: Puffergröße: 140kJ , Wirkungsgrad: 1/14 , Maximale Leistung: ca.90W , Puffergröße(Wirkungsgrad,[Wh/4] beachtet):860Wh/4
	 * @param name Dient zur eindeutigen Identifikation
	 * @param consumptionMAX Maximale Leistungsaufnahme (Normaler Wert: ca.90Watt)
	 * @param Temperatur aktuelle Temperatur zwischen 1.0 und 1.2
	 * OK
	 */
	public KuehlschrankAnswerContent(String name, double consumptionMAX,
			double Temperatur) {
		super(name, consumptionMAX, getBuffer(Temperatur,860), 860);
		debug("KuehlschrankAnswerContent("+name+","+consumptionMAX+","+Temperatur+"):isbuffer"+getBuffer());
	}
	
	

	/**
	 * ACHTUNG: Erweiterter Konstruktor
	 * KURZ: gefüllt mit 25kgWasser, 20kG Glas
	 * -> Puffergröße: 215Wh , Erlaubte Temperatur: 1.0-1.2°C
	 * ERKLÄRUNG:Berechnet die Temperatur aus bufferMAX wie folgt:
	 * Annahme: Kühlschrank ist mit 5Liter Gedränken, 10kg Glas und 17,5kg Gemüse/Joghurt... gefüllt.
	 * -> Wassermenge von ca. 25kg + 20kg Glas
	 * Die Temperatur darf zwischen 1°C und 1,2°C schwanken.
	 * Spezifische Wärmekapazität: cglas = 0,7 cwasser = 4 [kJ/°C/kg]
	 * Es folgt als Puffer: dE = 0.7kJ*0,2*10 + 4kJ*12,5*0,2= 8kJ + 48kJ = ca 56kJ 
	 * Wirkungsgrad = 1/14 (laut Wikipedia)
	 * Virtueller Puffer: 56kJ*14 = 780kJ = 215Wh(Wirkungsgrad einberechnet)
	 * -> Puffer benötigt folgende Leistungsaufnahme um nach 1 Stunde voll zu sein: 780kJ*4/3600 = 215Watt
	 * -> Da die Logik in Wh/4 rechnet ist der Puffer 215*4 Wh/4 = 860 Wh/4
	 * 
	 * Ergebnis: Puffergröße: 140kJ , Wirkungsgrad: 1/14 , Maximale Leistung: ca.90W , Puffergröße(Wirkungsgrad,[Wh/4] beachtet):860Wh/4
	 * @param name Dient zur eindeutigen Identifikation
	 * @param consumptionMAX Maximale Leistungsaufnahme (ca. 25 (90Watt))
	 * @param isBuffer aktueller bufferZustand
	 * @param bufferMAX Maximaler Bufferkapazität (Normaler Wert: 4400)
	 */
	public KuehlschrankAnswerContent(String name, double consumptionMAX,
			double isBuffer, double bufferMAX) {
		super(name, consumptionMAX, isBuffer, bufferMAX);
	}

	/* (non-Javadoc)
	 * @see haus.komponente._messageContents.__BasicAnswerContent#INFOausgeben()
	 */
	@Override
	public String INFOausgeben() {
		String intro = name + ":(consMIN="+this.getConsumptionMIN()+
				" consMAX=" + this.getConsumptionMAX() + 
				" bufferMAX=" + this.bufferMAX + 
				" akt.Temperatur=" + getTemperatur(getBuffer()) + ") { \n"; 
		String currCons = 	"                currentConsumption: " + getCurrentConsumption() + "\n";
		String futCons = 	"                futureConsumption: ";
		for(int i = 0 ; i < 8 ; i++){
			futCons = futCons + (int)this.getFutureConsumption(i) + " ";
		}
		futCons = futCons + "\n";
		
		String info = "                "+INFO;
		
		return intro + currCons + futCons + info + " }";
	}

	/**
	 * KURZ: gefüllt mit 25kgWasser, 20kG Glas
	 * -> Puffergröße: 215Wh , Erlaubte Temperatur: 1.0-1.2°C
	 * ERKLÄRUNG:Berechnet die Temperatur aus bufferMAX wie folgt:
	 * Annahme: Kühlschrank ist mit 5Liter Gedränken, 10kg Glas und 17,5kg Gemüse/Joghurt... gefüllt.
	 * -> Wassermenge von ca. 25kg + 20kg Glas
	 * Die Temperatur darf zwischen 1°C und 1,2°C schwanken.
	 * Spezifische Wärmekapazität: cglas = 0,7 cwasser = 4 [kJ/°C/kg]
	 * Es folgt als Puffer: dE = 0.7kJ*0,2*10 + 4kJ*12,5*0,2= 8kJ + 48kJ = ca 56kJ 
	 * Wirkungsgrad = 1/14 (laut Wikipedia)
	 * Virtueller Puffer: 56kJ*14 = 780kJ = 215Wh(Wirkungsgrad einberechnet)
	 * -> Puffer benötigt folgende Leistungsaufnahme um nach 1 Stunde voll zu sein: 780kJ*4/3600 = 215Watt
	 * -> Da die Logik in Wh/4 rechnet ist der Puffer 215*4 Wh/4 = 860 Wh/4
	 * 
	 * Ergebnis: Puffergröße: 140kJ , Wirkungsgrad: 1/14 , Maximale Leistung: ca.90W , Puffergröße(Wirkungsgrad,[Wh/4] beachtet):860Wh/4
* 
	 * @return
	 */
	public double getTemperatur(double isBuffer) {
		return (1.2-(((int)100*isBuffer)/((int)100*this.bufferMAX)*0.2));
	}
	
	/**
	 * Berechnet aus der Temperatur den aktuellen Pufferzustand
	 * @param temperatur Temperatur
	 * @param BufferMAX [Wh/4]
	 * @return Puffer [Wh/4]
	 * Fertig (getestet)
	 */
	public static double getBuffer(double temperatur, double BufferMAX) {
		double erg = (int)((1.2-temperatur)/0.2*(BufferMAX));
		System.out.println("DEBUG: (KuehlschrankAnswerContent) getBuffer([°C],[Wh]:"+temperatur+","+BufferMAX+")="+erg);
		return erg;
	}
	
	
	
	
	
	public void error(String text){
		System.out.println("ERROR: (KuehlschrankAnswerContent)"+text);
	}
	public void debug(String text){
		INFO = INFO + text + " , ";
		if(isDebug){
			System.out.println("DEBUG: (KuehlschrankAnswerContent)"+ text);
		}
	}
}
