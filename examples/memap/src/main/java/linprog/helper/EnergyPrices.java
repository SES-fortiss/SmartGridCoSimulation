package linprog.helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import linprog.Simulation;
import meritorder.helper.ReadMemapFiles;
import simulation.SimulationStarter;

/**
 * Helper class to return the gas price.
 */
public class EnergyPrices {
	
	private static final String STROMPREISE_CSV_FILENAME = "Strompreise_7Tage.csv";
	
	private ArrayList<Double> electricityPrices;

	public EnergyPrices() {
		electricityPrices = readElectricityPrices(STROMPREISE_CSV_FILENAME);
	}
	
	/**
	 * Returns the gas price in cents per kWh at any given point in time. For now, it constantly returns .0017ct/kJ,
	 * which equals 6.12 ct/kWh, but here CSV-files or web services or other mechanisms could be plugged in.
	 * 
	 * @param time the point in time for which to get the gas price
	 * @return gas price in ct/kWh at specified point in time
	 */
	public static double getGasPriceForTimestepInEuro(Calendar time) {
		// 0.0017 ct/kJ, covert to Eur / kWh times timestep in hours = Eur / (kW*timestep)
		// double gasPrice = 6.12d*Simulation.stepLength(TimeUnit.HOURS)/100;
		// Example N_Steps 70/ n_Days 7 : 0.014 Euro
		double gasPrice = 6.12d*Simulation.stepLength(TimeUnit.HOURS)/100;
		return 0.0612d;
	}
	
	/**
	 * Returns the electricity price in cents per kWh at any given point in time. For now, it constantly returns
	 * a value between 27.5 and 32.5 ct/kWh, but here CSV-files or web services or other mechanisms could be plugged in.
	 * 
	 * @param time the point in time for which to get the electricity price
	 * @return electricity price in ct/kWh at specified point in time
	 */
//	public static double getElectricityPriceInCent(Calendar time) {
//		return 30 + (new Random()).nextDouble()*5 - 2.5;
//	}
	
	/**
	 * Returns the gas price in cents per kWh at any given timestep. For now, it constantly returns .0017ct/kJ,
	 * which equals 6.12 ct/kWh, but here CSV-files or web services or other mechanisms could be plugged in.
	 * 
	 * @param time the timestep for which to get the gas price
	 * @return gas price in ct/kWh at specified timestep
	 */
	public static double getGasPriceInEuro(int timestep) {
		return 0.0612d;
	}
	
	/**
	 * Returns the electricity price in cents per kWh at any given timestep in ct/kJ, read from a CSV-file.
	 * 
	 * Prices vary between 25-50 ct/kWh within 7days
	 * Coverted to EUR/kWh 
	 * The prices are set to be constant throughout one day
	 * 
	 * @param time the timestep for which to get the electricity price
	 * @return electricity price in ct/kWh at specified timestep
	 */
	public double getElectricityPriceInEuro(int timestep) {
//		return electricityPrices.get(timestep)/100;
		return electricityPrices.get(timestep % electricityPrices.size())/100;
	}
		
	
	
	
	private ArrayList<Double> readElectricityPrices(String filename){
		ArrayList<Double> electricityPrices = new ArrayList<Double>();
		try {
			String source = "res/"+ filename;			
			String location = ReadMemapFiles.class.getProtectionDomain().getCodeSource().getLocation().getPath();
			location = location.replace("%20", " ");
			location = location.substring(0, location.length()-15);
			location = location + source;			
			FileReader fr = new FileReader(location);
			BufferedReader br = new BufferedReader(fr);
		    read(br, electricityPrices);	
		} catch (IOException | ParseException e1) {
				e1.printStackTrace();
				SimulationStarter.stopSimulation();
				return null;
		}
		
		return electricityPrices;
	}
	

	
	private void read(BufferedReader br, ArrayList<Double> electricityPrices) throws IOException, ParseException{
	    String zeile;
	      
	    NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
    	
	    int i = 0;
	    int k = 0;
	    double valueToRead = 0;
	    
	 // Number of hours per timestep
	    double stepsize = Simulation.stepLength(TimeUnit.HOURS); 
	    ArrayList<Double> originialValues = new  ArrayList<Double>();
	    
    	while ((zeile = br.readLine()) != null){	
    		
    		originialValues.add(nf.parse(zeile).doubleValue());
    				
    		if (++i >= k*stepsize+1) {
				try {	
    				// linear calculation of value in between two source-timesteps
					double fraction = (k*stepsize+1) - (i-1);
					if (k == 0) {
						valueToRead = nf.parse(zeile).doubleValue();
					} else {
						double stepDifference = nf.parse(zeile).doubleValue()-originialValues.get(originialValues.size() - 2);		
						valueToRead = originialValues.get(originialValues.size() - 2) + fraction*stepDifference;
					}
					// Unit in ct / KWh
					electricityPrices.add(valueToRead);	
					
				} catch (Exception e) {
					// do nothing
					System.out.println("Error in reading Electricity prices");
					
				}
				k++;
    		}
		}
    	
    	// This Part is necessary if price should not vary over one day:
    	double stepsPerDay = (double)Simulation.N_STEPS/(double)Simulation.N_DAYS;
    	int m = 1;
	
    	for (int j = 0; j < electricityPrices.size(); j++) {
    		
			double dailyPrice = electricityPrices.get((int)((m-1)*stepsPerDay+stepsPerDay/2));
			electricityPrices.set(j, dailyPrice);
			
			if ( j+1 == m*(int)stepsPerDay ) {
				m++;
    		}
    	}
    	
	    br.close();

	}	
	
	

}
