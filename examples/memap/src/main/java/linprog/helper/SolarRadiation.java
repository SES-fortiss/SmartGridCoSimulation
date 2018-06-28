package linprog.helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;

import meritorder.helper.ReadMemapFiles;
import simulation.SimulationStarter;

public class SolarRadiation {
	
	
	private static final String SOLARRADIATION_FILENAME = "PStrahlung.csv";
	
	private ArrayList<Double> solarRadiation;
	
	public SolarRadiation() {
		solarRadiation = readSolarRadiation(SOLARRADIATION_FILENAME);
	}
	
	
	/**
	 * Returns the current solar radiation at a given point in time.
	 * 
	 * @param time the point in time for which to get the radiation
	 * @return solar radiation in kW/m²
	 */
//	public static double getRadiation(Calendar time) {
//		return 0.0;
//	}
	
	/**
	 * Returns the current solar radiation at a given timestep. Assumes timestep 0 at 12 am.
	 * 
	 * @param time the timestep for which to get the radiation
	 * @return solar radiation in kW/m²
	 */
	
	public double getRadiation(int timestep) {
		return solarRadiation.get(timestep % solarRadiation.size());
	}
	
//	public static double getRadiation(int timestep) {
//		double hourOfDay = (timestep * Simulation.stepLength(TimeUnit.HOURS)) % 24;
//		if(hourOfDay > 5 && hourOfDay < 21) {
//			return 0.1*Math.pow(Math.exp(-(hourOfDay-13.5)),2)/10*Math.random();
//		}
//		else return 0.0;
//	}
	
	private ArrayList<Double> readSolarRadiation(String filename){
		ArrayList<Double> solarRadiation = new ArrayList<Double>();
		try {
			String source = "res/"+ filename;			
			String location = ReadMemapFiles.class.getProtectionDomain().getCodeSource().getLocation().getPath();
			location = location.replace("%20", " ");
			location = location.substring(0, location.length()-15);
			location = location + source;	
			FileReader fr = new FileReader(location);
			BufferedReader br = new BufferedReader(fr);
		    read(br, solarRadiation);	
		} catch (IOException | ParseException e1) {
				e1.printStackTrace();
				SimulationStarter.stopSimulation();
				return null;
		}
		
		return solarRadiation;
	}
	
	private void read(BufferedReader br, ArrayList<Double> solarRadiation) throws IOException, ParseException{
	    String zeile;
	      
	    NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
    	
    	while ((zeile = br.readLine()) != null){	
				
			try {
				solarRadiation.add(nf.parse(zeile).doubleValue());	
			} catch (Exception e) {
				// do nothing
			}
		}
    	
	    br.close();
	}	

}
