package linprog.helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.Random;

import meritorder.helper.ReadMemapFiles;
import simulation.SimulationStarter;

/**
 * Helper class to return the gas price.
 */
public class EnergyPrices {
	
	private static final String STROMPREISE_CSV_FILENAME = "Strompreise_7Tage_interpolated.csv";
	private static final String STROMPREISE_CSV_FILENAME_PV = "Strompreise_7Tage.csv";
	
	private ArrayList<Double> electricityPrices;
	private ArrayList<Double> electricityPricesPV;
	
	public EnergyPrices() {
		electricityPrices = readElectricityPrices(STROMPREISE_CSV_FILENAME);
		electricityPricesPV = readElectricityPrices(STROMPREISE_CSV_FILENAME_PV);
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

//	public static double getElectricityPriceInCent(Calendar time) {
//		return 10 + new Random().nextDouble()*20; // value now between [10..30], but not used at the moment
//	}
	
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
	
	public double getElectricityPricePVInCent(int timestep) {
		return electricityPricesPV.get(timestep % electricityPrices.size());
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
    	
    	while ((zeile = br.readLine()) != null){	
				
			try {
				electricityPrices.add(nf.parse(zeile).doubleValue());	
			} catch (Exception e) {
				// do nothing
			}
		}
    	
	    br.close();
	}	

}
