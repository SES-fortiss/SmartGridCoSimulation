package haus.komponente._messageContents;

/**
 * _VerbraucherRequestContent
 * Implementiert den Standard-Request von dem EMS an den intelligenten Verbraucher
 * Verhalten: (istModusAutomatik, istModusPufferLaden, istModusPufferEntladen)
 * 0 0 0 : Manueller Betrieb Puffer wird entladen, Leistungsaufnahme=0
 * 0 0 1 : Manueller Betrieb Puffer wird entladen, Leistungsaufnahme=0
 * 0 1 0 : Manueller Betrieb Puffer wird geladen, Leistungsaufnahme=getAnswer().cunsumptionMAX
 * 0 1 1 : Manueller Betrieb Puffer wird geladen, Leistungsaufnahme=getAnswer().cunsumptionMAX
 * 1 0 0 : Automatik -> (Standard) möglichst an expectedConsumption halten UND Puffer auf 50%+-10% halten
 * 			ab Puffer<10% wird Mindestmodus geschaltet bis Puffer>30%
 * 1 0 1 : Automatik -> Verbrauch wird auf 0 gesenkt bis Mindestmodus aktiviert werden muss
 * 1 1 0 : Automatik -> Verbrauch steigt auf Maximum bis Puffer voll ist
 * 1 1 1 : Undefinierter Zustand -> Fehler
 * 
 * 
 * 29.05.2014
 * @author Markus
 * FERTIG
 */
public class _iVerbraucherRequestContent extends __BasicRequestContent{
//Variablen <----------------------------------------------------------------------------------------------------
	/**
	 * true: Automatikmodus(Standard)
	 * false: Manueller Modus(keine Beeinflussung möglich)
	 */
	public boolean istModusAutomatik 	= true;
	/**
	 * Diese Variable wird nur im Automatikmodus betrachtet
	 * true: Der Verbraucher füllt seinen Puffer möglichst schnell auf. 
	 * 		 (Der Verbrauch kann bis auf das Maximum steigen)
	 * false:Puffer laden deaktiviert (Standard)
	 * UPDATE: wird wahrscheinlich doch nicht gebraucht
	 */
	public boolean istModusPufferLaden	 	= false;
	/**
	 * Diese Variable wird nur im AutomatikModus betrachtet
	 * true: temporäres aktivieren ermöglicht Spitzenlasten auszugleichen, dieser 
	 * Modus sollte zur kurzzeitig aktiviert sein, da er sonst keine Wirkung zeigt 
	 * false: Sparmodus deaktiviert (Standard)
	 * UPDATE: wird wahrscheinlich doch nicht gebraucht
	 */
	public boolean istModusPufferEntladen	= false;
	
	/**
	 * Standardkonstruktor für Zeitabhängige Einstellungen
	 * @param name
	 * @param expectedConsumption
	 * @param expectedConsumptionMIN
	 * @param expectedConsumptionMAX
	 * @param istModusAutomatik
	 * @param istModusPufferLaden
	 * @param istModusPufferEntladen
	 */
	public _iVerbraucherRequestContent(String name, double[] expectedConsumption,
			double[] expectedConsumptionMIN, double[] expectedConsumptionMAX,
			boolean istModusAutomatik, boolean istModusPufferLaden, boolean istModusPufferEntladen) {
		super(name, expectedConsumption, expectedConsumptionMIN, expectedConsumptionMAX);
		this.istModusAutomatik = istModusAutomatik;
		this.istModusPufferEntladen = istModusPufferEntladen;
		this.istModusPufferLaden = istModusPufferLaden;
	}
	
	/**
	 * @param name
	 * @param expectedConsumption
	 * @param expectedConsumptionMIN
	 * @param expectedConsumptionMAX
	 */
	public _iVerbraucherRequestContent(String name, double expectedConsumption,
			double expectedConsumptionMIN, double expectedConsumptionMAX) {
		super(name, expectedConsumption, expectedConsumptionMIN, expectedConsumptionMAX);
	}
}
