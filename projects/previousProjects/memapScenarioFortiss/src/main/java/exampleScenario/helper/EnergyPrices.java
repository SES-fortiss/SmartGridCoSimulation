package exampleScenario.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.Random;

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
	public static double getGasPriceInCent(Calendar time) {
		return 0.0017d;
	}
	
	/**
	 * Returns the electricity price in cents per kWh at any given point in time. For now, it constantly returns
	 * a value between 27.5 and 32.5 ct/kWh, but here CSV-files or web services or other mechanisms could be plugged in.
	 * 
	 * @param time the point in time for which to get the electricity price
	 * @return electricity price in ct/kWh at specified point in time
	 */
	public static double getElectricityPriceInCent(Calendar time) {
		return 30 + (new Random()).nextDouble()*5 - 2.5;
	}
	
	/**
	 * Returns the gas price in cents per kWh at any given timestep. For now, it constantly returns .0017ct/kJ,
	 * which equals 6.12 ct/kWh, but here CSV-files or web services or other mechanisms could be plugged in.
	 * 
	 * @param time the timestep for which to get the gas price
	 * @return gas price in ct/kWh at specified timestep
	 */
	public static double getGasPriceInCent(int timestep) {
		return 0.0017d;
	}
	
	/**
	 * Returns the electricity price in cents per kWh at any given timestep in ct/kJ, read from a CSV-file.
	 * 
	 * @param time the timestep for which to get the electricity price
	 * @return electricity price in ct/kWh at specified timestep
	 */
	public double getElectricityPriceInCent(int timestep) {
		return electricityPrices.get(timestep % electricityPrices.size());
	}
	
	/**
	 * Returns the electricity price in cents per kWh at any given point in time in ct/kJ, read from a CSV-file.
	 * 
	 * @param time the point in time for which to get the electricity price
	 * @return electricity price in ct/kWh at specified timestep
	 */
	public double getElectricityPriceInCent(LocalDateTime time) {
		int day = time.getDayOfWeek().getValue();
		int hour = time.getHour();
		if ((1+(day-1)*24+hour) < electricityPrices.size()) {
			return electricityPrices.get(1+(day-1)*24+hour);
		}
		else {
			return electricityPrices.get(electricityPrices.size()-1);
		}
	}
	
	private ArrayList<Double> readElectricityPrices(String filename){
		ArrayList<Double> electricityPrices = new ArrayList<Double>();
		try {		
			ClassLoader cl = ReadMemapFiles.class.getClassLoader();
			InputStream is = cl.getResourceAsStream(filename);

			BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
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
    	
    	while ((zeile = br.readLine()) != null){	
				
			try {
				electricityPrices.add(nf.parse(zeile).doubleValue()/3600.0);	
			} catch (Exception e) {
				// do nothing
			}
		}
    	
	    br.close();
	}	

}
