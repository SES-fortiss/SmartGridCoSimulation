package exampleScenario.helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

import exampleScenario.helper.ReadMemapFiles;
import simulation.SimulationStarter;

public class ConsumptionProfiles {

	private ArrayList<Double> heatProfile = new ArrayList<Double>();
	//private ArrayList<Double> electricityProfile = new ArrayList<Double>();
	
	public ConsumptionProfiles() {
		heatProfile = readConsumption("WaermeVerbraeuche.csv");
		//electricityProfile = readConsumption("StromVerbraeuche.csv");
	}

	/**
	 * Returns the current consumption at a given point in time.
	 * 
	 * @param time the point in time for which to get the gas price
	 * @return solar radiation in kW/m�
	 */
	public static double getConsumption(Calendar time) {
		return 0.0;
	}
	
	/**
	 * Returns the current heat consumption at a given point in time.
	 * 
	 * @param time the point in time for which to get the gas price
	 * @return solar radiation in kW/m�
	 */
	public double getHeatConsumption(int timestep) {
		return heatProfile.get(timestep % heatProfile.size());
	}
	
	private ArrayList<Double> readConsumption(String filename){
		ArrayList<Double> profile = new ArrayList<Double>();
		try {
			String source = "res/"+ filename;			
			String location = ReadMemapFiles.class.getProtectionDomain().getCodeSource().getLocation().getPath();
			location = location.replace("%20", " ");
			location = location.substring(0, location.length()-15);
			location = location + source;			
			FileReader fr = new FileReader(location);
			BufferedReader br = new BufferedReader(fr);
		    read(br, profile);	
		} catch (IOException | ParseException e1) {
				e1.printStackTrace();
				SimulationStarter.stopSimulationStatic();
				return null;
		}
		
		return profile;
	}
	
	private void read(BufferedReader br, ArrayList<Double> profile) throws IOException, ParseException{
	    String zeile;
	      
	    NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
    	int i = 0;
    	double hourlySum= 0.0;
    	while ((zeile = br.readLine()) != null){	
				
			try {
				hourlySum +=nf.parse(zeile).doubleValue();	
			} catch (Exception e) {
				// do nothing
			}
			
			if(++i == 60) {
				profile.add(hourlySum);
				hourlySum = 0.0;
				i = 0;
			}
		}
    	
	    br.close();
	}	
	
}
