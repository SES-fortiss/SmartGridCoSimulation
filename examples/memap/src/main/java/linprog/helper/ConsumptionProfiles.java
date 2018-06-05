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

import com.google.gson.Gson;

import linprog.Simulation;
import meritorder.helper.ReadMemapFiles;
import simulation.SimulationStarter;

public class ConsumptionProfiles {

	private HashMap<Integer, ArrayList<Double>> heatProfiles = new HashMap<Integer, ArrayList<Double>>();
	private HashMap<Integer, ArrayList<Double>> electricityProfile = new HashMap<Integer, ArrayList<Double>>();
//	private ArrayList<Double> electricityProfile = new ArrayList<Double>();
	private final int nrOfProfiles;
	
	public ConsumptionProfiles(int nrOfProfiles) {
		this.nrOfProfiles = nrOfProfiles;

		// kWh / Minute - für 1 Tag
		heatProfiles = readConsumption("WaermeVerbraeuche.csv", nrOfProfiles);
		electricityProfile = readConsumption("StromVerbraeucheMatlab.csv", nrOfProfiles);
	}
	
	/**
	 * Returns the current heat consumption at a given timestep.
	 * 
	 * @param time the timestep for which to get the heat consumption
	 * @return heat consumption at given timestep
	 */
	public double getHeatConsumption(int consumptionIndex, int timestep) {
		if (consumptionIndex > nrOfProfiles) {
			//TODO throw Exception;
		}
//		System.out.println("Timestep :" + timestep % heatProfiles.size());
//		return heatProfiles.get(consumptionIndex).get(timestep % heatProfiles.size());
		return heatProfiles.get(consumptionIndex).get(timestep);
	}
	
	public double getElectricConsumption(int consumptionIndex, int timestep) {
		if (consumptionIndex > nrOfProfiles) {
			//TODO throw Exception;
		}
//		return electricityProfile.get(consumptionIndex).get(timestep % heatProfiles.size());
		return electricityProfile.get(consumptionIndex).get(timestep);
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
				SimulationStarter.stopSimulation();
				return null;
		}
		
		return profiles;
	}
	
	private void read(BufferedReader br, HashMap<Integer, ArrayList<Double>> dailyProfiles, HashMap<Integer, ArrayList<Double>> profiles) throws IOException, ParseException{
	    
		Gson gson = new Gson();
		
		String zeile;
	    String[] buffer;  
	    NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
    	
	    int i = 0;
	    int k = 0;
	
    	while ( (zeile = br.readLine()) != null) {		
			buffer = zeile.split(";");	
			// Zur Korrektur des Zeitschritts werden 143 Zeitschritte übersprungen
			if ( (i++ == k*Simulation.stepLength(TimeUnit.MINUTES)) && (buffer.length != 0) ) {
				try {
					for(int j = 0; j < buffer.length; j++) {
						dailyProfiles.get(j).add(nf.parse(buffer[j]).doubleValue());
					}
					System.out.println(gson.toJson(nf.parse(buffer[1]).doubleValue()));
					k++;
				} catch (Exception e) {
					// do nothing
				}
			}
		}
    	
	    br.close();  
	    
	 // Das Wärmeprofil eines Tages wird auf n_days kopiert
    	System.out.println(gson.toJson(dailyProfiles.get(1).size()));   
    	
	    for (int m = 0; m < (Simulation.N_STEPS/k); m++) {
	    	for(int j = 0; j < nrOfProfiles; j++) {
	    		for (int v=0; v<dailyProfiles.get(1).size(); v++) {
	    			profiles.get(j).add(dailyProfiles.get(j).get(v));
	    		}
			}
	    }
	    
//	    for (int m = 0; m < (Simulation.N_STEPS % k); m++) {
//    	for(int j = 0; j < nrOfProfiles; j++) {
//    		profiles.get(j).add(profiles.get(j).get(m));
//    	}
//    }

    System.out.println(Simulation.N_STEPS/k);
    System.out.println(gson.toJson(profiles.get(1).size()));
    
	}

	
		
//  Hier werden 144 Minuten/Einträge aus dem csv Zusammengefasst damit sie dem Zeitschritt 2,4 Std der Sim entsprechen		
			
//			i++;
//			if(i < Simulation.stepLength(TimeUnit.MINUTES)) {
//				for( int j = 0; j < nrOfProfiles; j++) {
//					profiles.get(j).add(sumsPerTimestep[j]/Simulation.stepLength(TimeUnit.MINUTES));
//				}
//
//			} else { 
//				System.out.println(gson.toJson(sumsPerTimestep[0]));
//				sumsPerTimestep = new double[nrOfProfiles];
//				i = 0;
//			}
// =================================================================================		
			


	
}
