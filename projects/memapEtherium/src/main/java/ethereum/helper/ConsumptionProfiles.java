package ethereum.helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

import ethereum.Simulation;
import simulation.SimulationStarter;

public class ConsumptionProfiles {

	private HashMap<Integer, ArrayList<BigInteger>> heatProfiles = new HashMap<Integer, ArrayList<BigInteger>>();
	private HashMap<Integer, ArrayList<BigInteger>> electricityProfiles = new HashMap<Integer, ArrayList<BigInteger>>();
	private final int nrOfProfiles;
	
	public ConsumptionProfiles(int nrOfProfiles) {
		this.nrOfProfiles = nrOfProfiles;
		heatProfiles = readConsumption("WaermeVerbraeuche.csv", nrOfProfiles);
		electricityProfiles = readConsumption("StromVerbraeuche.csv", nrOfProfiles);
	}
	
	/**
	 * Returns the current heat consumption in Ws at a given timestep.
	 * 
	 * @param time the timestep for which to get the heat consumption
	 * @return heat consumption in Ws at given timestep
	 */
	public BigInteger getHeatConsumption(int consumptionIndex, int timestep) {
		if (consumptionIndex > nrOfProfiles) {
			//TODO throw Exception;
		}
		return heatProfiles.get(consumptionIndex).get(timestep % heatProfiles.get(0).size());
	}
	
	/**
	 * Returns the current electricity consumption in Ws at a given timestep.
	 * 
	 * @param time the timestep for which to get the electricity consumption
	 * @return electricity consumption in Ws at given timestep
	 */
	public BigInteger getElectricityConsumption(int consumptionIndex, int timestep) {
		if (consumptionIndex > nrOfProfiles) {
			//TODO throw Exception;
		}
		return electricityProfiles.get(consumptionIndex).get(timestep % electricityProfiles.get(0).size());
	}
	
	/**
	 * Returns the number of profiles for which this object was initialized
	 * @return number of profiles
	 */
	public int getNrOfProfiles() {
		return nrOfProfiles;
	}
	
	private HashMap<Integer, ArrayList<BigInteger>> readConsumption(String filename, int nrOfProfiles){
		HashMap<Integer, ArrayList<BigInteger>> profiles = new HashMap<Integer, ArrayList<BigInteger>>();
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
	
	private void read(BufferedReader br, HashMap<Integer, ArrayList<BigInteger>> profiles) throws IOException, ParseException{
	    String zeile;
	    String[] buffer;
	    for(int i = 0; i < nrOfProfiles; i++) {
	    	profiles.put(i, new ArrayList<BigInteger>());
	    }
	      
	    NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
    	int i = 0;
    	BigInteger[] sumsPerTimestep = newBigIntegerArray(nrOfProfiles);
    	while ((zeile = br.readLine()) != null){	
			
			buffer = zeile.split(";");
			
			if (buffer.length != 0) {
				try {
					for(int j = 0; j < nrOfProfiles; j++) {
						sumsPerTimestep[j] = sumsPerTimestep[j].add(UnitHelper.getWSfromKWH(nf.parse(buffer[j]).doubleValue()));
					}
				} catch (Exception e) {
					// do nothing
				}
			}
			
			int timeStepDurationInMinutes = Simulation.TIMESTEP_DURATION_IN_SECONDS.divide(BigInteger.valueOf(60)).intValue();
			if(++i >= timeStepDurationInMinutes) {
				for( int j = 0; j < nrOfProfiles; j++) {
					profiles.get(j).add(sumsPerTimestep[j]
							.divide(BigInteger.valueOf(60)));
				}
				sumsPerTimestep = newBigIntegerArray(nrOfProfiles);
				i = 0;
			}
		}
    	
	    br.close();
	}

	private BigInteger[] newBigIntegerArray(int nrOfProfiles) {
		BigInteger[] toReturn = new BigInteger[nrOfProfiles];
		for(int i = 0; i < nrOfProfiles; i++) {
			toReturn[i] = BigInteger.ZERO;
		}
		return toReturn;
	}	
	
}
