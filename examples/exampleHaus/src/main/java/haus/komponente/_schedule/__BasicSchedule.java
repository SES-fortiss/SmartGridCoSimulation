package haus.komponente._schedule;

/**
 * __BasicSchedule
 * Dient als Interface f�r einen Verbrauchsplan
 * Es können Pläne aller wichtigen Komponenten gespeichert werden.
 * HINWEIS: Zur Benutzung bitte in createTopology erstellen und den Komponenten übergeben!!
 * 01.06.2014
 * @author Markus
 * FERTIG
 */
public abstract class __BasicSchedule {
//Solaranlage <----------------------------------------------------------------------------------------------
	/**
	 * Gibt die geplante Maximalerzeugung (-MAXIMUMERZEUGUNG) einer Solaranlage zurück
	 * @param actTimestep abgefragter Timestep
	 * @return 
	 */
	public abstract double getSolarConsumption(int actTimestep);	
	/**
	 * Gibt den Plan "geplante Maximalerzeugung" (-MAXIMUMERZEUGUNG) einer Solaranlage für einen Tag zurück.
	 * @return Tag in viertelStunden Intervallen
	 */
	public abstract double[] getSolarConsumtion();	
	/**
	 * Gibt den absoluten Unsicherheitswert am Zeitschritt  zurück
	 * @param actTimestep abgefragter Timestep
	 * @return 
	 */
	public abstract double getSolarConsumptionDelta(int actTimestep);
	/**
	 * Gibt den absoluten Unsicherheitswert eines Tages im Viertelstundenbereich als Array zurück
	 * @return Tag in viertelStunden Intervallen
	 */	
	public abstract double[] getSolarConsumptionDelta();	
	
//Elektroheizung <-------------------------------------------------------------------------------------------
	/**
	 * Gibt den vorausichtlichen Wärmebedarf an den die Heizung zum bestimmten Zeitpunkt liefern muss
	 * @param actTimestep Zeitpunkt(Angabe in Timestep, d.h. viertelStunden
	 * @return Energieverbrauch in dem Timestep, d.h. 15min.
	 */
	public abstract double getWaermebedarf(int actTimestep);
	
//Fixe-Verbraucher <-----------------------------------------------------------------------------------------
	/**
	 * Gibt den Verbrauch an, der durch nicht regelbare Geräte entsteht. Dies sind z.B. Fernseher Herd...
	 * @param actTimestep
	 * @return
	 */
	public abstract double getFixenVerbrauch(int actTimestep);
	/**
	 * Gibt einen String mit Informationen über die Aufteilung der Fixen Verbraucher zurück.
	 * @param actTimestep
	 * @return InfoString
	 */
	public abstract String getFixenVerbrauchINFO(int actTimestep);
	
	
//Sonstiges <------------------------------------------------------------------------------------------------
	/**
	 * geplanter Verbrauch der nächsten 2 Stunden
	 * @param index Timestep, ab dem der Plan zur�ckgegeben werden soll
	 * @return Plan (2h)
	 */
	public abstract double[] getFutureConsumption(int aktTimestep);	
	/**
	 * geplanter Verbrauch
	 * @param index Timestep
	 * @return
	 */
	public abstract double   getConsumption(int aktTimestep);
}
