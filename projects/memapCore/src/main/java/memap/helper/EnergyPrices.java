package memap.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import memap.examples.ExampleFiles;
import memap.helper.profilehandler.Interpolation;
import memap.main.TopologyConfig;
import simulation.SimulationStarter;

/**
 * Helper class to return the energy prices.
 */
public class EnergyPrices {

	private static EnergyPrices instance = new EnergyPrices();

	/** Electricity price per KWp */
	private ArrayList<Double> electricityPrices = new ArrayList<Double>();
	private ArrayList<Double> gasPrices;
	
	/**
	 * Set values to the parameters of {@link EnergyPrices} using a double value.
	 * Creates a array list with all its entries equal to MarketPrice
	 * 
	 * Note: {@link TopologyConfig} values must be set before calling this method.
	 * 
	 * @param MarketPrice a double value
	 * 
	 */
	public void init(double MarketPrice) {
		for (int i = 0; i < TopologyConfig.getInstance().getNrStepsMPC() * 2; i++) {
			electricityPrices.add(MarketPrice);
		}
	}

	
	public void initGas(double MarketPrice) {
		gasPrices = new ArrayList<Double>();
		for (int i = 0; i < TopologyConfig.getInstance().getNrStepsMPC() * 2; i++) {
			gasPrices.add(MarketPrice);
		}
	}
	
	/**
	 * Set values to the parameters of {@link EnergyPrices} using a CSV. Creates a
	 * array list reading from the file path MarketPriceCSV
	 * 
	 * Note: {@link TopologyConfig} values must be set before calling this method.
	 * 
	 * @param MarketPriceCSV a path to a CSV file
	 * 
	 */
	public void init(String MarketPriceCSV) {
		
		// if an empty string is provided, then load standard example.
		if (MarketPriceCSV.length() <= 1) {
			MarketPriceCSV = "ELECTRICITYPRICEEXAMPLE";
		}		
		setElectricityPrices(MarketPriceCSV);
	}
	
	/** @return the instance of {@link EnergyPrices} */
	public static EnergyPrices getInstance() {
		return instance;
	}

	/**
	 * Assign values to electricityPrices
	 * 
	 * @param csvFile
	 */
	private void setElectricityPrices(String csvFile) {
		try {			
			electricityPrices = readEnergyPrices(electricityPrices, getBuffer(csvFile));					 
		} catch (Exception e) {
			System.err.println("Variable market price selected but input file [" + csvFile + "] is not provided. Using example file");
			try {
				
				BufferedReader bf = getBuffer("ELECTRICITYPRICEEXAMPLE");				
				electricityPrices = readEnergyPrices(electricityPrices, bf);
				
				
			} catch (Exception e2) {
				System.err.println("Error reading or parsing electricity price data " + csvFile);
				SimulationStarter.stopSimulation();
				e.printStackTrace();
			}						
		}
	}
	
	
	/**
	 * Returns the heat price in Euro per kWh at any given time step. For now, it
	 * constantly returns 5,34 ct/kWh (Stadtwerke Wuerzburg), but here CSV-files or
	 * web services or other mechanisms could be plugged in.
	 * 
	 * @param time the time step for which to get the gas price
	 * @return gas price in ct/kWh at specified time step
	 */
	public double getHeatPriceInEuro(int timestep) {
		double value = 0.0534d;
		value = 0.7;
		return value;
	}

	
	/**
	 * Returns the electricity price in cents per kWh at any given time step in
	 * ct/kJ, read from a CSV-file.
	 * 
	 * Prices vary between 25-50 ct/kWh within 7days converted to EUR/kWh The prices
	 * are expected to have a time interval of 15 minutes (see readEnergyPrices)
	 * 
	 * @param time the time step for which to get the electricity price
	 * @return electricity price in ct/kWh at specified time step
	 */
	public double getElectricityPriceInEuro(int timestep) {
		return electricityPrices.get(timestep % electricityPrices.size());
	}

	/**
	 * @return a buffer with the data from csv filename
	 * @param filename CSV file
	 */
	private BufferedReader getBuffer(String csvFile) {
		FileManager mgr = new FileManager();
		ExampleFiles examples = new ExampleFiles();
		
		if (examples.isExample(csvFile)) {
			System.out.println(">> Reading from resources: " + csvFile);
			return mgr.readFromResources(examples.getFile(csvFile));
		} else {
			System.out.println(">> Reading from source: " + csvFile);
			return mgr.readFromSource(csvFile);
		}
	}

	/**
	 * Assign values to electricity prices {@link #electricityPrices} from buffer
	 * 
	 * @return br buffer
	 */
	private ArrayList<Double> readEnergyPrices(ArrayList<Double> energyPrices, BufferedReader br) throws IOException, ParseException {

		/*
		 * the current logic:
		 * - x should represent the step length in the data file (intrinsic knowledge)
		 * - y should represent the price related to x
		 * - xi should represent the selected time step in the simulation
		 * - yi should represent the price related to xi
		 */
		
		NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);

		double stepLenghtInHours = TopologyConfig.getInstance().getStepLengthInHours();
		ArrayList<Double> originalValues = new ArrayList<Double>();
		String row;

		while ((row = br.readLine()) != null) {
			
			if (row.charAt(0) != '#') // skipping the header which starts with '#'
			{	
				List<String> br_values = Arrays.asList(row.split(";"));
				originalValues.add(nf.parse(br_values.get(2)).doubleValue());
			}
			
			// TODO add the time information, i.e. LocalDateTime.
		}

		double[] x = new double[originalValues.size()];
		double[] y = new double[originalValues.size()];
		for (int i = 0; i < originalValues.size(); i++) {
			x[i] = i / 4.0 ; 
			y[i] = originalValues.get(i);
		}
		
		int mpcSteps = y.length -1;

		double[] xi = new double[mpcSteps];
		for (int j = 0; j < mpcSteps; j++) {
			xi[j] = j * stepLenghtInHours;
		}

		double[] yi = Interpolation.interpLinear(x, y, xi);
		for (int k = 0; k < yi.length; k++) {
			energyPrices.add(yi[k]);
		}
		br.close();
		
		return energyPrices;
	}

}
