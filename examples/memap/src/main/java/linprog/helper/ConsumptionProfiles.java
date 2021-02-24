package linprog.helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import linprog.LinProgSimulation;
import meritorder.helper.ReadMemapFiles;
import simulation.SimulationStarter;

public class ConsumptionProfiles {

	private HashMap<Integer, ArrayList<Double>> heatProfiles = new HashMap<Integer, ArrayList<Double>>();
	private HashMap<Integer, ArrayList<Double>> electricityProfile = new HashMap<Integer, ArrayList<Double>>();
//	private ArrayList<Double> electricityProfile = new ArrayList<Double>();
	private final int nrOfProfiles;
	
	public ConsumptionProfiles(int nrOfProfiles) {
		this.nrOfProfiles = nrOfProfiles;

		// kWh / Minute - für 24 Stunden, 1440 Minuten = Einträge
		heatProfiles = readConsumption("WaermeVerbraeuche.csv", nrOfProfiles);
		electricityProfile = readConsumption("StromVerbraeuche_reduced.csv", nrOfProfiles);
	}
	
	/**
	 * Returns the current heat consumption at a given timestep.
	 * 
	 * Inputs are kW per Minute
	 * Converted to kWh and the multiplied by timestep in hours
	 * 
	 * @param time the timestep for which to get the heat consumption
	 * @return heat consumption at given timestep
	 */
	
	public double getHeatConsumption(int consumptionIndex, int timestep) {
		if (consumptionIndex > nrOfProfiles) {
			//TODO throw Exception;
		}
		return heatProfiles.get(consumptionIndex).get(timestep)/60;
		//*Simulation.stepLength(TimeUnit.HOURS)	
		}
	
	public double getElectricConsumption(int consumptionIndex, int timestep) {
		if (consumptionIndex > nrOfProfiles) {
			//TODO throw Exception;
		}
		return electricityProfile.get(consumptionIndex).get(timestep)/60;
		//*Simulation.stepLength(TimeUnit.HOURS)
	}
	
	/**
	 * Returns the number of profiles for which this object was initialized
	 * @return number of profiles
	 */
	public int getNrOfProfiles() {
		return nrOfProfiles;
	}
	
	private HashMap<Integer, ArrayList<Double>> readConsumption(String filename, int nrOfProfiles){
		
		HashMap<Integer, ArrayList<Double>> profiles = new HashMap<Integer, ArrayList<Double>>();
		HashMap<Integer, ArrayList<Double>> dailyProfiles = new HashMap<Integer, ArrayList<Double>>();
		for(int i = 0; i < nrOfProfiles; i++) {
	    	profiles.put(i, new ArrayList<Double>());
	    	dailyProfiles.put(i, new ArrayList<Double>());
	    }
	    
		try {
			String source = "res/"+ filename;			
			String location = ReadMemapFiles.class.getProtectionDomain().getCodeSource().getLocation().getPath();
			location = location.replace("%20", " ");
			location = location.substring(0, location.length()-15);
			location = location + source;	

			FileReader fr = new FileReader(location);
			BufferedReader br = new BufferedReader(fr);	
			read(br, dailyProfiles, profiles);		    
		    
		} catch (IOException | ParseException e1) {
				e1.printStackTrace();
				SimulationStarter.stopSimulationStatic();
				return null;
		}
		return profiles;
	}
	
	
	private void read(BufferedReader br, HashMap<Integer, ArrayList<Double>> dailyProfiles, HashMap<Integer, ArrayList<Double>> profiles) throws IOException, ParseException{
	    
		String zeile;
	    String[] buffer;  
	    NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
    	
	    int i = 0;
	    int k = 0;
	    
	    double[] consumptionBuffer = new double[nrOfProfiles];
	
		// Read-in of consumption values in kJ for every minute 			
		while ( (zeile = br.readLine()) != null) {		
			buffer = zeile.split(";");	
			
			for(int j = 0; j < nrOfProfiles; j++) {
				consumptionBuffer[j] += nf.parse(buffer[j]).doubleValue();
			}
			i++;
			// Sum up consumption over the number of minutes per timestep
			if ( (i == (k+1)*LinProgSimulation.stepLength(TimeUnit.MINUTES)) && (buffer.length != 0) ) {
				try {
					for(int j = 0; j < buffer.length; j++) {
						dailyProfiles.get(j).add(consumptionBuffer[j]);
						consumptionBuffer[j] = 0;
					}
					k++;
				} catch (Exception e) {
					// do nothing
				}
			}
		}
					
	    br.close();  

	 // the heat profile of one day is copied for n_days;  ( k = N_STEPS/N_Days )
	    for (int m = 0; m < (LinProgSimulation.N_STEPS/k); m++) {
	    	for(int j = 0; j < nrOfProfiles; j++) {
	    		for (int v=0; v<dailyProfiles.get(1).size(); v++) {
	    			profiles.get(j).add(dailyProfiles.get(j).get(v));
	    		}
			}
	    }

	}
		
}
