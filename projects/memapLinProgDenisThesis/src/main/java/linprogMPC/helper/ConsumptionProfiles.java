package linprogMPC.helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import linprogMPC.ThesisTopologySimple;
import simulation.SimulationStarter;

public class ConsumptionProfiles {

	private HashMap<Integer, ArrayList<Double>> heatProfiles = new HashMap<Integer, ArrayList<Double>>();
	private HashMap<Integer, ArrayList<Double>> electricityProfile = new HashMap<Integer, ArrayList<Double>>();
	private final int nrOfProfiles;
	
	public ConsumptionProfiles(int nrOfProfiles) {
		this.nrOfProfiles = nrOfProfiles;

		// kWh / Minute - für 24 Stunden, 1440 Minuten = Einträge
		heatProfiles = readConsumption("WaermeVerbraeucheAngepasst.csv", nrOfProfiles);
		electricityProfile = readConsumption("StromVerbraeucheAngepasst.csv", nrOfProfiles);
		
		/*
		heatProfiles = readConsumption("WaermeVerbraeuche.csv", nrOfProfiles);
		electricityProfile = readConsumption("StromVerbraeuche.csv", nrOfProfiles);
		*/
		
		System.out.println("heatProfiles: " + heatProfiles.get(0).size());
	}
	
	/**
	 * Returns the current heat consumption at a given timestep.
	 * 
	 * Inputs are kW per Minute
	 * Converted to kWh and the multiplied by timestep in hours
	 * 
	 * @param time the timestep for which to get the heat consumption
	 * @return heat consumption at given timestep
	 * @throws Exception 
	 */
	
	public double getHeatConsumption(int consumptionIndex, int timestep) throws Exception {
		if (consumptionIndex > nrOfProfiles) {
			throw new Exception();
		}
		return heatProfiles.get(consumptionIndex).get(timestep)/60;
	}
	
	public double getElectricConsumption(int consumptionIndex, int timestep) throws Exception {
		if (consumptionIndex > nrOfProfiles) {
			throw new Exception();
		}
		return electricityProfile.get(consumptionIndex).get(timestep)/60;
	}
	
	/**
	 * Returns the number of profiles for which this object was initialized
	 * @return number of profiles
	 */
	public int getNrOfProfiles() {
		return nrOfProfiles;
	}
	
	private HashMap<Integer, ArrayList<Double>> readConsumption(String filename, int nrOfProfiles) {

		HashMap<Integer, ArrayList<Double>> profiles = new HashMap<Integer, ArrayList<Double>>();
		HashMap<Integer, ArrayList<Double>> dailyProfiles = new HashMap<Integer, ArrayList<Double>>();
		for (int i = 0; i < nrOfProfiles; i++) {
			profiles.put(i, new ArrayList<Double>());
			dailyProfiles.put(i, new ArrayList<Double>());
		}
		try {
			// Retrieve Consumptionprofiles from res folder. Note that actual path
			// to res folder varies across different systems
			// and using explicit paths is therefore not recommended.
			BufferedReader br = new BufferedReader(
					new InputStreamReader(this.getClass().getResourceAsStream("/" + filename)));
			read(br, dailyProfiles, profiles);
		} catch (IOException | ParseException e1) {
			e1.printStackTrace();
			SimulationStarter.stopSimulation();
			return null;
		}
		return profiles;
	}
	
	
	/**
	 * 
	 * this reads and interpolates!!!
	 * 
	 * @param br
	 * @param dailyProfiles
	 * @param profiles
	 * @throws IOException
	 * @throws ParseException
	 */
	private void read(BufferedReader br, HashMap<Integer, ArrayList<Double>> dailyProfiles, HashMap<Integer, ArrayList<Double>> profiles) throws IOException, ParseException{
	    
		String zeile;
	    String[] buffer;  
	    NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
    	
	    int indexZeile = 0;
	    int k = 0;
	    
	    double[] consumptionBuffer = new double[nrOfProfiles];
	
		// Read-in of consumption values in kJ for every minute 			
		while ( (zeile = br.readLine()) != null) {		
			buffer = zeile.split(";");
			
			for(int j = 0; j < nrOfProfiles; j++) { // nr Anzahl Häuser
				consumptionBuffer[j] += nf.parse(buffer[j]).doubleValue();
			}
			indexZeile++;
			// Sum up consumption over the number of minutes per timestep
						
			if ( (indexZeile >= (k+1)*MyTimeUnit.stepLength(TimeUnit.MINUTES)) && (buffer.length != 0) ) {
				try {
					for(int j = 0; j < buffer.length; j++) {
						
						//*********das ist nötig, falls der Zeitschritt nicht genau einer minute entspricht.
						
						double deltaOverMinute = indexZeile - (k+1) * MyTimeUnit.stepLength(TimeUnit.MINUTES);
						double abzug = nf.parse(buffer[j]).doubleValue() * deltaOverMinute;
						consumptionBuffer[j] = consumptionBuffer[j] - abzug;
						
						//*********Anpassung abgeschlossen
						
						// TODO den rest noch draufAddieren
						
						dailyProfiles.get(j).add(consumptionBuffer[j]);
						consumptionBuffer[j] = 0;
					}
					k++;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
					
	    br.close();  

	    // Calculate the consumption for one day longer than necessary because of MPC horizon
	    int daysToConsider = (int) Math.round(ThesisTopologySimple.N_STEPS/k + 0.5);
	    System.out.println("Days to Consider because of MPC: " + daysToConsider);

	    // TODO das kommt doppelt vor
	    
	    // the heat profile of one day is copied for n_days;  ( k = N_STEPS/N_Days )
	    for (int m = 0; m < daysToConsider; m++) {
	    	for(int j = 0; j < nrOfProfiles; j++) {
	    		for (int v=0; v<dailyProfiles.get(1).size(); v++) {
	    			profiles.get(j).add(dailyProfiles.get(j).get(v));
	    		}
			}
	    }

	}		
}