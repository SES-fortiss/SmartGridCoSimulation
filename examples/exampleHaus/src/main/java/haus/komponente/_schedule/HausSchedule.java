package haus.komponente._schedule;

/**
 * HausSchedule
 * Dieser Plan stellt alle wichtigen Werte für ein Haus zur Verfügung
 * Darunter sind: Solaranlage
 * 02.06.2014
 * @author Markus
 * FERTIG
 */
public class HausSchedule extends __BasicSchedule {
//Variablen <----------------------------------------------------------------------------------------------
	/**
	 * Speichert die Maximalleistung in dem jewiligen Zeitschritt (abhängig von Uhrzeit, Jahreszeit,...
	 */
	private double[] SolarConsumption;
	/**
	 * Speichert den durchschnittlichen Unsicherheitswert abhängig nach Uhrzeit, Jahreszeit,...
	 */
	private double[] SolarConsumptionDelta;
	/**
	 * Speichert den Verbrauch des Fernsehers
	 */
	private double[] FernseherConsumption;
	/**
	 * Speichert den Verbrauch aller elektronischen Geräte
	 */
	private double[] ITConsumption;
	/**
	 * Speichert den Verbrauch aller Küchengeräte
	 */
	private double[] KuecheConsumption;
	/**
	 * Speichert den Verbrauch aller Beleuchtungen
	 */
	private double[] BeleuchtungConsumption;
	/**
	 * Speichert den Wärmeverbrauch der Heizung
	 */
	private double[] Waermebedarf;
		
//Konstruktoren <------------------------------------------------------------------------------------------
	/**
	 * Testkonstruktor nach Testen löschen!!!
	 * TODO
	 */
 	public HausSchedule(){
		double[] solarconsumption = {0.0,0.0,0.0,0.0,
				1.0,1.0,1.0,1.0,
				0.1,0.2,0.3,0.4,
				0.5,0.6,0.7,0.8,
				0.9,1.0,1.0,1.0,
				0.9,0.8,0.7,0.6,
				0.5,0.4,0.3,0.2,
				0.1,0.0,0.0,0.0,
				0.0,0.0,0.0,0.0,
				0.0,0.0,0.0,0.0,
				0.0,0.0,0.0,0.0,
				};
		for(int i = 0 ; i < solarconsumption.length ; i++){
			solarconsumption[i] = solarconsumption[i]*-4000;
		}
		initSolarConsumption(solarconsumption);
		for(int i = 0 ; i < solarconsumption.length ; i++){
			solarconsumption[i] = solarconsumption[i]/-10;
		}
		initSolarConsumptionDelta(solarconsumption);
		initConsumptionBeleuchtung();
		initConsumptionFernseher();
		initConsumptionIT();
		initConsumptionKueche();
	}
	
	public HausSchedule(double[] SolarConsumption, double[] SolarConsumptionDelta){
		initSolarConsumption(SolarConsumption);
		initSolarConsumptionDelta(SolarConsumptionDelta);
		initConsumptionBeleuchtung();
		initConsumptionFernseher();
		initConsumptionIT();
		initConsumptionKueche();
	}
	
//Initialisierung <----------------------------------------------------------------------------------------
	/**
	 * Initialisiert die SolarConsumption mit den übergebenen Werten
	 * @param SolarConsumption Werte
	 * @return old Value
	 */
	public double[] initSolarConsumption(double[] SolarConsumption){
		if(SolarConsumption==null){
			//Default: TODO perfekter Sommertag 
			double [] profil ={ 0,0,0,0, 0,0,0,0, 0,0,0,0, 0,0,0,0, 0,0,0,0, 0,0,0,0.05, 
					0.13,0.16,0.19,0.22, 0.25,0.28,0.31,0.34, 0.37,0.4,0.43,0.46, 0.5,0.55,0.6,0.65, 0.7,0.75,0.8,0.84, 0.88,0.91,0.94,0.97,
					1.0,1.0,1.0,1.0, 1.0,1.0,1.0,1.0, 0.97,0.94,0.91,0.88, 0.85,0.82,0.79,0.75, 0.68,0.62,0.56,0.51, 0.46,0.44,0.41,0.8,
					0.35,0.32,0.29,0.26, 0.23,0.2,0.18,0.16, 0.13,0.1,0.05,0.0, 0.0,0.0,0.0,0.0, 0.0,0.0,0.0,0.0, 0.0,0.0,0.0,0.0};
			double[] old = this.SolarConsumption;
			this.SolarConsumption = new double[96];
			for(int i = 0 ; i < 96 ; i++){
				this.SolarConsumption[i] = profil[i]*-4000;
			}
			return old;
		}
		double[] old = this.SolarConsumption;
		this.SolarConsumption = new double[96];
		for(int i = 0 ; i < 96 ; i++){
			if(SolarConsumption.length>i){
				this.SolarConsumption[i] = SolarConsumption[i];
				if(SolarConsumption[i]>0){
					System.out.println("ACHTUNG!!! _schedule.HausSchedule.initSolarConsumption() Positiver Wert übergeben!(Solaranlage verbraucht Energie");
				}
			}else{
				this.SolarConsumption[i]=0;
			}
		}
		return old;
	}
	/**
	 * Initialisiert SolarConsumptionDelta mit den übergebenen Werten
	 * @param SolarConsumtionDelta
	 * @return old Value
	 */
	public double[] initSolarConsumptionDelta(double[] SolarConsumptionDelta){
		double[] old = this.SolarConsumptionDelta;
		this.SolarConsumptionDelta = new double[96];
		if(SolarConsumptionDelta==null){
			//Default 10% von der erreichbaren Leistung
			for(int i = 0 ; i < 96 ; i++){
				this.SolarConsumptionDelta[i] = this.SolarConsumption[i]*0.1;
			}
			return old;
		}
		for(int i = 0 ; i < 96 ; i++){
			if(SolarConsumptionDelta.length>i){
				this.SolarConsumptionDelta[i] = SolarConsumptionDelta[i];
			}else{
				this.SolarConsumptionDelta[i]=0;
			}
		}
		return old;
	}
	/**
	 * initialisiert FernseherConsumption[]
	 * @return alter Verbrauchsplan double[96] - 1Tag
	 */
	public double[] initConsumptionFernseher(){
		//Wahrscheinlichkeit mit der der Fernseher läuft
		double[] verbrauch = new double[96];
		double[] propability = {
				0.1,0.1,0.1,0.0,  0.0,0.1,0.0,0.1,  0.0,0.0,0.0,0.0, 0.0,0.0,0.0,0.0,  //00:00 - 04:00
				0.0,0.0,0.0,0.0,  0.1,0.1,0.1,0.1,  0.1,0.1,0.1,0.1, 0.1,0.1,0.1,0.1,  //04:00 - 08:00
				0.2,0.2,0.2,0.2,  0.2,0.2,0.2,0.2,  0.2,0.3,0.3,0.3, 0.3,0.3,0.3,0.3,  //08:00 - 12:00
				0.4,0.3,0.3,0.3,  0.3,0.3,0.4,0.3,  0.2,0.1,0.1,0.1, 0.1,0.1,0.2,0.2,  //12:00 - 16:00
				0.2,0.2,0.2,0.2,  0.3,0.3,0.3,0.3,  0.4,0.5,0.6,0.7, 0.8,0.8,0.6,0.7,  //16:00 - 20:00
				0.6,0.6,0.5,0.6,  0.6,0.5,0.4,0.4,  0.4,0.4,0.3,0.3, 0.3,0.2,0.2,0.2};  //16:00 - 20:00
		
		for(int i = 0; i < 96 ; i++){
			double prob = propability[i];
			if(i>0 && verbrauch[i-1]>0){
				prob = prob + (1-prob)*0.5;
			}
			if(Math.random()<prob){
				verbrauch[i]=100;
			}
		}
		double[] old = this.FernseherConsumption;
		this.FernseherConsumption = verbrauch;
		return old;
	}
	/**
	 * initialisiert ITConsumption[]
	 * @return alter Verbrauchsplan double[96] - 1Tag
	 */
	public double[] initConsumptionIT(){
		//Parameteter
		double grundlast = 30;
		double LastProPC = 100;

		//Wahrscheinlichkeit mit der der Fernseher läuft
		double[] verbrauch = new double[96];
		//Gibt an wie viel PCs maxiaml gleichzeitig an sind
		int [] max = { 	1,1,1,1, 1,1,1,1, 1,1,1,1, 1,1,1,1,
						1,1,1,1, 1,1,1,1, 1,1,1,1, 1,1,1,1,
						1,1,1,1, 1,1,1,1, 2,2,2,2, 2,2,2,2,
						2,2,2,2, 3,2,3,2, 2,2,2,2, 2,2,3,3,
						3,3,3,3, 3,3,3,3, 3,3,3,2, 2,3,3,3,
						2,2,2,2, 2,2,2,2, 3,2,2,2, 2,1,1,1};
		//Wahrscheinlichkeit, mit der ein PC an ist
		double[] propability = { 
				0.2,0.1,0.1,0.1,  0.1,0.1,0.1,0.1,  0.1,0.1,0.2,0.1, 0.2,0.3,0.1,0.1,  //00:00 - 04:00
				0.2,0.1,0.2,0.1,  0.2,0.2,0.3,0.3,  0.4,0.4,0.3,0.3, 0.4,0.4,0.3,0.4,  //04:00 - 08:00
				0.4,0.4,0.3,0.3,  0.5,0.5,0.5,0.5,  0.5,0.5,0.5,0.5, 0.6,0.4,0.4,0.4,  //08:00 - 12:00
				0.3,0.3,0.3,0.3,  0.5,0.5,0.5,0.5,  0.5,0.5,0.5,0.5, 0.5,0.6,0.5,0.5,  //12:00 - 16:00
				0.5,0.6,0.6,0.5,  0.5,0.6,0.6,0.5,  0.4,0.4,0.3,0.4, 0.4,0.4,0.5,0.5,  //16:00 - 20:00
				0.5,0.6,0.7,0.7,  0.7,0.7,0.6,0.6,  0.5,0.5,0.4,0.4, 0.4,0.3,0.2,0.2}; //20:00 - 24:00
		
		for(int i = 0; i < 96 ; i++){
			double consumption = grundlast;
			for(int j = 0 ; j < max[j];j++){
				if(Math.random()<propability[i]){
					consumption += LastProPC;
				}
			}
			verbrauch[i] = consumption;
		}
		double[] old = this.ITConsumption;
		this.ITConsumption = verbrauch;
		return old;
	}
	/**
	 * initialisiert KuecheConsumption[]
	 * @return alter Verbrauchsplan double[96] - 1Tag
	 */
	public double[] initConsumptionKueche(){
		//Parameteter
		double grundlast = 0;
		double LastProVerbraucher = 700;

		//Wahrscheinlichkeit mit der der Fernseher läuft
		double[] verbrauch = new double[96];
		//Gibt an wie viel PCs maxiaml gleichzeitig an sind
		int [] max = { 	0,0,0,0, 0,0,0,0, 0,0,0,0, 0,0,0,0, //00:00 - 04:00
						0,0,0,0, 0,0,0,0, 1,1,1,1, 1,1,1,0, //04:00 - 08:00
						0,0,0,0, 0,0,1,1, 2,2,2,3, 4,4,4,4, //08:00 - 12:00
						3,3,3,3, 2,2,1,1, 0,0,0,0, 0,0,0,0, //12:00 - 16:00
						1,1,2,2, 2,2,2,2, 1,2,2,1, 0,0,0,0, //16:00 - 20:00
						0,0,0,0, 0,0,0,0, 0,0,0,0, 0,0,0,0};//20:00 - 24:00
		//Wahrscheinlichkeit, mit der ein Verbraucher an ist
		double[] propability = { 
				0.0,0.0,0.0,0.0,  0.0,0.0,0.0,0.0,  0.0,0.0,0.0,0.0, 0.0,0.0,0.0,0.0, //00:00 - 04:00
				0.0,0.0,0.0,0.0,  0.0,0.0,0.0,0.0,  0.4,0.5,0.6,0.6, 0.6,0.5,0.4,0.3,  //04:00 - 08:00
				0.0,0.0,0.0,0.0,  0.0,0.0,0.0,0.0,  0.3,0.4,0.5,0.6, 0.5,0.6,0.6,0.6,  //08:00 - 12:00
				0.5,0.5,0.4,0.4,  0.3,0.2,0.1,0.1,  0.0,0.0,0.0,0.0, 0.0,0.0,0.0,0.0,  //12:00 - 16:00
				0.4,0.4,0.4,0.4,  0.4,0.3,0.2,0.2,  0.3,0.4,0.5,0.5, 0.3,0.4,0.2,0.1,  //16:00 - 20:00
				0.0,0.0,0.0,0.0,  0.0,0.0,0.0,0.0,  0.0,0.0,0.0,0.0, 0.0,0.0,0.0,0.0}; //20:00 - 24:00
		
		for(int i = 0; i < 96 ; i++){
			double consumption = grundlast;
			for(int j = 0 ; j < max[i];j++){
				double zufall = Math.random();
				if(zufall<propability[i]){
					consumption += LastProVerbraucher;
				}
			}
			verbrauch[i] = consumption;
		}
		double[] old = this.KuecheConsumption;
		this.KuecheConsumption = verbrauch;
		return old;
	}
	/**
	 * initialisiert BeleuchtungConsumption[]
	 * @return alter Verbrauchsplan double[96] - 1Tag
	 */
	public double[] initConsumptionBeleuchtung(){
		//Parameteter
		double grundlastAnteil = 0.7;
		double [] verbrauch = new double[96];

		double[] consumption = { 
				20.0,20.0,20.0,20.0, 		20.0,20.0,20.0,20.0, 		20.0,20.0,20.0,20.0, 		20.0,20.0,20.0,20.0, 		//00:00 - 04:00	
				20.0,20.0,20.0,20.0, 		20.0,30.0,40.0,50.0, 		60.0,60.0,60.0,60.0, 		60.0,60.0,50.0,40.0, 		//04:00 - 08:00
				30.0,30.0,30.0,30.0, 		30.0,30.0,30.0,30.0, 		40.0,40.0,40.0,40.0, 		50.0,50.0,50.0,50.0, 		//08:00 - 12:00
				50.0,50.0,50.0,50.0, 		50.0,50.0,60.0,60.0, 		60.0,60.0,60.0,60.0, 		60.0,50.0,50.0,50.0,  		//12:00 - 16:00
				50.0,50.0,40.0,40.0,  		40.0,40.0,40.0,40.0,  		50.0,60.0,60.0,70.0,		70.0,70.0,70.0,80.0,  //16:00 - 20:00
				90.0,90.0,100.0,100.0,  	100.0,100.0,100.0,100.0,  	900.0,80.0,60.0,60.0, 		60.0,60.0,50.0,40.0}; 		//20:00 - 24:00
		
		for(int i = 0; i < 96 ; i++){
			verbrauch[i] = grundlastAnteil*consumption[i] + Math.random()*(1-grundlastAnteil)*consumption[i];
		}
				
		double[] old = this.BeleuchtungConsumption;
		this.BeleuchtungConsumption = verbrauch;
		return old;
	}
	/**
	 * Initialisiert den Wärmebedarf der Heizung
	 * @param waermebedarf null: Standard wird initialisiert
	 * @return old
	 */
	public double[] initConsumptionWaerme(double[] waermebedarf){
		double [] puffer = { 	0,0,0,0, 0,0,0,0, 0,0,0,0, 0,0,0,0, 						//00:00-04:00
				500,500,500,500,  1000,1000,1000,1000, 2000,2000,2000,2000, 2000,2000,2000,2000,//04:00-08:00
				1000,1000,1000,1000, 600,600,600,600, 400,400,400,400, 700,700,700,700, 300,300,300,300, //08:00-12:00
				300,300,300,300, 500,500,300,300, 300,300,300,300, 400,400,400,400, //12:00-16:00
				300,300,300,300, 400,400,400,400, 700,700,700,700, 1000,1000,1000,1000, //16:00-20:00
				1500,1500,1500,1500, 1500,1500,1500,1500, 1000,1000,500,500, 0,0,0,0};//20:00-24:00
		if(waermebedarf!=null){
			puffer = waermebedarf;
		}
		double[] temp = Waermebedarf;
		this.Waermebedarf = new double[96];
		for(int i = 0 ; i < waermebedarf.length&&i<96;i++){
			this.Waermebedarf[i]= puffer[i];			
		}
		return temp;
	}
		
//Solaranlage <--------------------------------------------------------------------------------------------
	public double getSolarConsumption(int actTimestep) {
		return SolarConsumption[actTimestep%96];
	}
	public double[] getSolarConsumtion() {
		return SolarConsumption;
	}
	public double getSolarConsumptionDelta(int actTimestep) {
		return SolarConsumptionDelta[actTimestep%96];
	}
	public double[] getSolarConsumptionDelta() {
		return SolarConsumptionDelta;
	}
	
//Elektroheizung <-----------------------------------------------------------------------------------------
	public double getWaermebedarf(int actTimestep) {
		@SuppressWarnings("unused")
		double [] waermebedarf = { 	0,0,0,0, 0,0,0,0, 0,0,0,0, 0,0,0,0, 						//00:00-04:00
				500,500,500,500,  1000,1000,1000,1000, 2000,2000,2000,2000, 2000,2000,2000,2000,//04:00-08:00
				1000,1000,1000,1000, 600,600,600,600, 400,400,400,400, 700,700,700,700, 300,300,300,300, //08:00-12:00
				300,300,300,300, 500,500,300,300, 300,300,300,300, 400,400,400,400, //12:00-16:00
				300,300,300,300, 400,400,400,400, 700,700,700,700, 1000,1000,1000,1000, //16:00-20:00
				1500,1500,1500,1500, 1500,1500,1500,1500, 1000,1000,500,500, 0,0,0,0};//20:00-24:0
		//return waermebedarf[actTimestep%96]; TODO
		return 5000+actTimestep*100;
	}

//Fixe Verbraucher <---------------------------------------------------------------------------------------
	public double getFixenVerbrauch(int actTimestep) {
		return getConsumptionBeleuchtung(actTimestep)+getConsumptionFernseher(actTimestep)+getConsumptionIT(actTimestep)+getConsumptionKueche(actTimestep);
	}
	@Override
	public String getFixenVerbrauchINFO(int actTimestep) {
		double gesammtverbrauch = getFixenVerbrauch(actTimestep);
		String info = "Fernseher:"+(int)getConsumptionFernseher(actTimestep)+"("+(int)(getConsumptionFernseher(actTimestep)/gesammtverbrauch*100)+"%) ";
		info = info +"IT:"+(int)getConsumptionIT(actTimestep)+"("+(int)(getConsumptionIT(actTimestep)/gesammtverbrauch*100)+"%) ";
		info = info +"Küche:"+(int)getConsumptionKueche(actTimestep)+"("+(int)(getConsumptionKueche(actTimestep)/gesammtverbrauch*100)+"%) ";
		info = info +"Beleuchtung:"+(int)getConsumptionBeleuchtung(actTimestep)+"("+(int)(getConsumptionBeleuchtung(actTimestep)/gesammtverbrauch*100)+"%) ";
		return info;
	}
	//Hilfsmethoden
	public double getConsumptionFernseher(int actTimestep){
		return FernseherConsumption[actTimestep%96];
	}
	public double getConsumptionIT(int actTimestep){
		return ITConsumption[actTimestep%96];
	}
	public double getConsumptionKueche(int actTimestep){
		return KuecheConsumption[actTimestep%96];
	}
	public double getConsumptionBeleuchtung(int actTimestep){
		return BeleuchtungConsumption[actTimestep%96];
	}
	
//Sonstiges <----------------------------------------------------------------------------------------------	
	public double[] getFutureConsumption(int aktTimestep) {
		//TODO Was genau macht diese Methode? N�her spezifizieren!!
		return null;
	}
	public double getConsumption(int aktTimestep) {
		// TODO Was genau macht diese Methode? N�her spezifizieren
		return 0;
	}

	
}