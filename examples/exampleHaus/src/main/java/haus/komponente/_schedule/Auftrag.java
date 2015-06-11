package haus.komponente._schedule;

/**
 * Auftrag
 * Container zum speichern von Aufträgen, die von Verbrauchern(Waschmaschine, Trockner,...) bearbeitet werden.
 * Ein Auftrag besteht aus bis zu 10 Teilaufträgen.
 * Teilaufträge können einmal angefangen nicht mehr unterbrochen werden.
 * 26.08.2014
 * @author Markus
 * FERTIG
 */
public class Auftrag {
//Variablen <-------------------------------------------------------------------------------------------------------------
	/**
	 * Timestep, an dem der Auftrag erstellt wurde.
	 */
	private int TimestepCreated;
	/**
	 * Timestep, an dem der Auftrag abgeschlossen sein soll.
	 */
	private int TimestepPlanedFinished;
	/**
	 * Verbrauch während der Auftrag bearbeitet wird.
	 * WICHTIG: 2dim. Array. Ein Teilbereich kann nicht mehr unterbrochen werden.
	 */
	private double[][]consumption;
	/**
	 * aktueller Abschnitt der bearbeitet wird.
	 * HINWEIß: iterator für consumption[i][]
	 */
	private int IndexTeilauftrag;
	/**
	 * Teilabschnitt der bearbeitet wird.
	 * HINWEIß: iterator für consumption[][j]
	 */
	private int IndexAbschnitt;
	/**
	 * true: Auftrag wird bearbeitet.
	 */
	private boolean istAN;

	/**
	 * Standardkonstruktor
	 */
	public Auftrag(int actTimestep, int length){
		TimestepCreated = actTimestep;
		TimestepPlanedFinished = actTimestep+length;
		consumption = new double[10][];
	}
	/**
	 * Copy-Konstruktor
	 * @param auftrag
	 */
	public Auftrag(Auftrag auftrag) {
		this.TimestepCreated=auftrag.getTimestepCreated();
		this.TimestepPlanedFinished=auftrag.getTimestepPlanedFinished();
		this.IndexTeilauftrag= auftrag.getIndexTeilauftrag();
		this.IndexAbschnitt=auftrag.getIndexAbschnitt();
		this.istAN=auftrag.istAN;
		//consumption �bernehmen...
		this.consumption = auftrag.getWholeConsumption();
	}
	/**
	 * Gibt Membervariable consumption zurück
	 * @return 2-dim. Array aus Verbrauchswerten. Siehe Auftrag
	 */
	private double[][] getWholeConsumption() {
		return consumption;
	}
	public void setTimestepCreated(int TimestepCreated){
		this.TimestepCreated = TimestepCreated;
	}
	public int getTimestepCreated(){
		return TimestepCreated;
	}
	public void setTimestepPlanedFinished(int TimestepPlanedFinished){
		this.TimestepPlanedFinished = TimestepPlanedFinished;
	}
	public int getTimestepPlanedFinished(){
		return TimestepPlanedFinished;
	}
	/**
	 * Fügt einen Teilauftrag hinzu
	 * @param Teilauftrag Angabe des Verbrauchs in Timesteps
	 * @return Erfolg?
	 */
	public boolean addTeilauftrag(double[] Teilauftrag){
		for(int i = 0 ; i < 10 ; i++){
			if(consumption[i]== null){
				consumption[i] = Teilauftrag;
				return true;
			}
		}
		return false;
	}
	public int getIndexTeilauftrag(){
		return IndexTeilauftrag;		
	}
	public int getIndexAbschnitt(){
		return IndexAbschnitt;
	}
	public boolean istAN(){
		return istAN;
	}
	/**
	 * WICHTIG: Hauptmethode, aktualisiert Werte wie istAN,IndexTeilauftrag,IndexAbschnitt
	 * ACHTUNG: Darf NUR EINMAL pro Timestep aufgerufen werden, sonst kann es zu Fehlern kommen
	 * @return aktueller Verbrauch
	 */
	public double simulateStep(){
		double wert = 0;
		if(istAN){
			//Fehler abfangen:
			if(IndexTeilauftrag>=10&&IndexTeilauftrag<0){ istAN = false; return wert;}
			if(consumption[IndexTeilauftrag]==null){ istAN = false; return wert;}
			if(consumption[IndexTeilauftrag].length<IndexAbschnitt){ 
				istAN = false; return wert;}
			
			wert = consumption[IndexTeilauftrag][IndexAbschnitt];
			IndexAbschnitt++;
			if(consumption[IndexTeilauftrag].length<=IndexAbschnitt){
				IndexTeilauftrag++;
				IndexAbschnitt=0;
				this.istAN=false;
			}
		}
		return wert;
	}
	public void startAbschnitt(){
		istAN = true;
	}
	/**
	 * Gibt den Rest des Teilauftrags zurück.
	 * @return unterschiedlich lang, null: kein Auftrag mehr
	 */
	public double[] getRestOfTeilauftrag(){
		if(getIndexTeilauftrag()>=10||consumption[IndexTeilauftrag]==null){
			return null;
		}
		double[] rest = new double[consumption[IndexTeilauftrag].length-IndexAbschnitt];
		for(int i = IndexAbschnitt ; i < consumption[IndexTeilauftrag].length ; i++){
			rest[i-IndexAbschnitt] = consumption[IndexTeilauftrag][i];
		}
		return rest;
	}
	
	/**
	 * Prüft ob der Auftrag fertig ist.
	 * @return Auftrag fertig?
	 */
	public boolean istAuftragFertig(){
		if(IndexTeilauftrag>=10){return true;}
		if(consumption[IndexTeilauftrag]==null){ return true;}
		return false;
	}
	public int getRestAnzahlOfAuftrag() {
		int erg = 0;
		int indexTeilauftrag = this.IndexTeilauftrag;
		if(istAN){
			erg += consumption[IndexTeilauftrag].length-IndexAbschnitt;
			indexTeilauftrag++;
		}
		for(int i = indexTeilauftrag ; i < consumption.length ; i++){
			if(consumption[i]!=null){
				erg += consumption[i].length;
			}
		}
		return erg;
	}
	/**
	 * Gibt Informationen über den Auftrag als String zurück
	 * @return wenn möglich in einer Zeile!!
	 */
	public String INFOausgeben() {
		String info = "istAN:" + istAN() + " Start:" +getTimestepCreated() + " Ende:" + getTimestepPlanedFinished() + " TimestepBisFertig:"+ getRestAnzahlOfAuftrag()
				+" AuftragFertig:"+istAuftragFertig();
		if(!istAuftragFertig()){
				info = info + " aktuellePosition:consumption["+getIndexTeilauftrag()+"]["+getIndexAbschnitt()+"]="+consumption[getIndexTeilauftrag()][getIndexAbschnitt()];
		}
		return info;	
	}
}
