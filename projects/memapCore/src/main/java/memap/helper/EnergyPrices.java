package memap.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;

import memap.examples.ExampleFiles;
import memap.main.TopologyConfig;
import simulation.SimulationStarter;

/**
 * Helper class to return the energy prices.
 */
public class EnergyPrices {

	private static EnergyPrices instance = new EnergyPrices();

	/** Electricity price per KWp */
	private ArrayList<Double> electricityPrices;
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
		electricityPrices = new ArrayList<Double>();
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
		setElectricityPrices(MarketPriceCSV);
	}

	public void initGas(String MarketPriceCSV) {
		gasPrices = new ArrayList<Double>();
		setGasPrices(gasPrices, MarketPriceCSV);
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
			if (csvFile.isEmpty()) {
				readEnergyPrices(electricityPrices, getBuffer("ELECTRICITYPRICEEXAMPLE"));
				System.err
						.println("Variable market price selected but not input file was provided. Using example file");
			} else {
				readEnergyPrices(electricityPrices, getBuffer(csvFile));
			}
		} catch (IOException | ParseException e) {
			System.err.println("Error reading or parsing CSV data from " + csvFile);
			SimulationStarter.stopSimulation();
			e.printStackTrace();
		}
	}

	/**
	 * Assign values to gasPrices
	 * 
	 * @param csvFile
	 */
	private void setGasPrices(ArrayList<Double> gasPrices, String csvFile) {
		try {
			if (csvFile.isEmpty()) {
				readEnergyPrices(gasPrices, getBuffer("GASPRICEEXAMPLE"));
				System.err
						.println("Variable market price selected but not input file was provided. Using example file");
			} else {
				readEnergyPrices(gasPrices, getBuffer(csvFile));
			}
		} catch (IOException | ParseException e) {
			System.err.println("Error reading or parsing CSV data from " + csvFile);
			SimulationStarter.stopSimulation();
			e.printStackTrace();
		}
	}
	
	/**
	 * Returns the gas price in cents per kWh at any given time step in
	 * ct/kWh, read from a CSV-file. The prices
	 * are expected to have a time interval of 15 minutes (see readEnergyPrices)
	 * 
	 * @param time the time step for which to get the gas price
	 * @return gas price in ct/kWh at specified time step
	 */
//	public double getGasPriceInEuro(int timestep) {
//		return 0.0685d;
//	}
	public double getGasPriceInEuro(int timestep) {
		return gasPrices.get(timestep % gasPrices.size());
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
	private void readEnergyPrices(ArrayList<Double> energyPrices, BufferedReader br) throws IOException, ParseException {
		NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
		int mpcSteps = TopologyConfig.getInstance().getNrStepsMPC();
		double stepLenghtInHours = TopologyConfig.getInstance().getStepLengthInHours();
		ArrayList<Double> originalValues = new ArrayList<Double>();
		String row;

		while ((row = br.readLine()) != null) {
			originalValues.add(nf.parse(row).doubleValue());
		}

		double[] x = new double[originalValues.size()];
		double[] y = new double[originalValues.size()];
		for (int i = 0; i < originalValues.size(); i++) {
			x[i] = i; 
			y[i] = originalValues.get(i);
		}

		double[] xi = new double[mpcSteps];
		for (int j = 0; j < mpcSteps; j++) {
			xi[j] = 4*j * stepLenghtInHours; // 15 min steps in original data
		}

		double[] yi = Interpolation.interpLinear(x, y, xi);
		for (int k = 0; k < yi.length; k++) {
			energyPrices.add(yi[k]);
		}
		br.close();
	}

}
