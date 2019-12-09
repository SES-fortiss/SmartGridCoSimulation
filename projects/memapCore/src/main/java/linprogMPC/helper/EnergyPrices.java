package linprogMPC.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import linprogMPC.TopologyConfig;
import linprogMPC.examples.ExampleFiles;
import simulation.SimulationStarter;

/**
 * Helper class to return the gas price.
 */
public class EnergyPrices {
	/** Electricity price per KWp */
	private ArrayList<Double> electricityPrices;

	/**
	 * Constructor with double value. Creates a array list with all its entries
	 * equal to MarketPrice
	 * @param MarketPrice a double value
	 */
	public EnergyPrices(double MarketPrice) {
		electricityPrices = new ArrayList<Double>();
		for (int i = 0; i < TopologyConfig.N_STEPS * 2; i++) {
			electricityPrices.add(MarketPrice);
		}
	}

	/**
	 * Constructor with CSV. Creates a array list reading from the file path MarketPrice
	 * @param MarketPriceCSV a path to a CSV file
	 */
	public EnergyPrices(String MarketPriceCSV) {
		setEnergyPrices(MarketPriceCSV);
	}

	/**
	 * Assign values to electricityPrices
	 * @param csvFile
	 */	
	private void setEnergyPrices(String csvFile) {
		try {
			if (csvFile.isEmpty()) {
				readElectricityPrices(getBuffer("ELECTRICITYPRICEEXAMPLE"));
			} else {
				readElectricityPrices(getBuffer(csvFile));
			}
		} catch (IOException | ParseException e) {
			System.err.println("Error reading or parsing CSV data from " + csvFile);
			SimulationStarter.stopSimulation();
			e.printStackTrace();
		}
	}

	/**
	 * Returns the gas price in cents per kWh at any given timestep. For now, it
	 * constantly returns .0017ct/kJ, which equals 6.12 ct/kWh, but here CSV-files
	 * or web services or other mechanisms could be plugged in.
	 * 
	 * @param time the timestep for which to get the gas price
	 * @return gas price in ct/kWh at specified timestep
	 */
	public double getGasPriceInEuro(int timestep) {
		return 0.0685d;
	}

	/**
	 * Returns the heat price in Euro per kWh at any given timestep. For now, it
	 * constantly returns 5,34 ct/kWh (Stadtwerke Würzburg), but here CSV-files or
	 * web services or other mechanisms could be plugged in.
	 * 
	 * @param time the timestep for which to get the gas price
	 * @return gas price in ct/kWh at specified timestep
	 */
	public double getHeatPriceInEuro(int timestep) {
		double value = 0.0534d;
		value = 0.7;
		return value;
	}

	/**
	 * Returns the electricity price in cents per kWh at any given timestep in
	 * ct/kJ, read from a CSV-file.
	 * 
	 * Prices vary between 25-50 ct/kWh within 7days Coverted to EUR/kWh The prices
	 * are set to be constant throughout one day
	 * 
	 * @param time the timestep for which to get the electricity price
	 * @return electricity price in ct/kWh at specified timestep
	 */
	public double getElectricityPriceInEuro(int timestep) {
		return electricityPrices.get(timestep % electricityPrices.size()) / 100;
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
	private void readElectricityPrices(BufferedReader br) throws IOException, ParseException {
		NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
		ArrayList<Double> originalValues = new ArrayList<Double>();
		electricityPrices = new ArrayList<Double>();
		String row;

		while ((row = br.readLine()) != null) {
			originalValues.add(nf.parse(row).doubleValue());
		}

		double[] x = new double[originalValues.size()];
		double[] y = new double[originalValues.size()];
		for (int i = 0; i < originalValues.size(); i++) {
			x[i] = i; // 24h * 7 Days -1 = 167
			y[i] = originalValues.get(i);
		}

		double[] xi = new double[TopologyConfig.N_STEPS];
		for (int j = 0; j < TopologyConfig.N_STEPS; j++) {
			xi[j] = j * MyTimeUnit.stepLength(TimeUnit.HOURS);
		}

		double[] yi = Interpolation.interpLinear(x, y, xi);
		for (int k = 0; k < yi.length; k++) {
			electricityPrices.add(yi[k]);
		}
		br.close();
	}

}
