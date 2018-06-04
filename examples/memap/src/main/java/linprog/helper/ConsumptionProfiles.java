package linprog.helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import linprog.Simulation;
import meritorder.helper.ReadMemapFiles;
import simulation.SimulationStarter;

public class ConsumptionProfiles {

	private HashMap<Integer, ArrayList<Double>> heatProfiles = new HashMap<Integer, ArrayList<Double>>();
	private HashMap<Integer, ArrayList<Double>> electricityProfiles = new HashMap<Integer, ArrayList<Double>>();
	private final int nrOfProfiles;
	
	public ConsumptionProfiles(int nrOfProfiles) {
		this.nrOfProfiles = nrOfProfiles;
		heatProfiles = readConsumption("WaermeVerbraeuche.csv", nrOfProfiles);
		electricityProfiles = readConsumption("StromVerbraeuche.csv", nrOfProfiles);
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
		return heatProfiles.get(consumptionIndex).get(timestep % heatProfiles.size());
	}
	
	/**
	 * Returns the current heat consumption at a given timestep.
	 * 
	 * @param time the timestep for which to get the heat consumption
	 * @return heat consumption at given timestep
	 */
	public double getElectricityConsumption(int consumptionIndex, int timestep) {
		if (consumptionIndex > nrOfProfiles) {
			//TODO throw Exception;
		}
		return electricityProfiles.get(consumptionIndex).get(timestep % electricityProfiles.size());
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
		try {
			String source = "res/"+ filename;			
			String location = ReadMemapFiles.class.getProtectionDomain().getCodeSource().getLocation().getPath();
			location = location.replace("%20", " ");
			location = location.substring(0, location.length()-15);
			location = location + source;			
			FileReader fr = new FileReader(location);
			BufferedReader br = new BufferedReader(fr);
		    read(br, profiles);	
		} catch (IOException | ParseException e1) {
				e1.printStackTrace();
				SimulationStarter.stopSimulation();
				return null;
		}
		
		return profiles;
	}
	
	private void read(BufferedReader br, HashMap<Integer, ArrayList<Double>> profiles) throws IOException, ParseException{
	    String zeile;
	    String[] buffer;
	    for(int i = 0; i < nrOfProfiles; i++) {
	    	profiles.put(i, new ArrayList<Double>());
	    }
	      
	    NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
    	int i = 0;
    	double[] sumsPerTimestep = new double[nrOfProfiles];
    	while ((zeile = br.readLine()) != null){	
			
			buffer = zeile.split(";");
			
			if (buffer.length != 0) {
				try {
					for(int j = 0; j < nrOfProfiles; j++) {
						sumsPerTimestep[j] += nf.parse(buffer[j]).doubleValue();
					}
				} catch (Exception e) {
					// do nothing
				}
			}
			
			if(++i >= Simulation.stepLength(TimeUnit.MINUTES)) {
				for( int j = 0; j < nrOfProfiles; j++) {
					profiles.get(j).add(sumsPerTimestep[j]/Simulation.stepLength(TimeUnit.MINUTES));
				}
				sumsPerTimestep = new double[nrOfProfiles];
				i = 0;
			}
		}
    	
	    br.close();
	}	
	
}
