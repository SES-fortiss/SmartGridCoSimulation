package memap.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import memap.examples.ExampleFiles;
import memap.main.TopologyConfig;
import simulation.SimulationStarter;

public class SolarRadiation {

	/** Solar production per KWp */
	private ArrayList<Double> solarProductionPerKWp;

	public SolarRadiation(String csvFile) {
		setSolarProductionPerKWp(csvFile);
	}

	/**
	 * @param timestep the time step for which to get the solar production per KWp
	 * @return solar production per KWp
	 */
	public double getSolarProductionPerKWp(int timestep) {
		// divide through 15 to get the Production per kWp
		return solarProductionPerKWp.get(timestep % solarProductionPerKWp.size()) / 15.0;
	}

	/**
	 * Assign values to SolarProductionPerKWp
	 */
	private void setSolarProductionPerKWp(String csvFile) {
		try {
			if (csvFile.isEmpty()) {
				readSolarProduction(getBuffer("SOLARPRODUCTIONEXAMPLE"));
			} else {
				readSolarProduction(getBuffer(csvFile));
			}
		} catch (IOException | ParseException e) {
			System.err.println("Error reading or parsing CSV data from " + csvFile);
			SimulationStarter.stopSimulation();
			e.printStackTrace();
		}

	}
	
	/**
	 * @return a buffer with the data from CSV filename
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
	 * Assign values to solar production {@link #solarProductionPerKWp} from buffer
	 * @param br buffer
	 */
	private void readSolarProduction(BufferedReader br) throws IOException, ParseException {
		NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
		ArrayList<Double> originalValues = new ArrayList<Double>();
		solarProductionPerKWp = new ArrayList<Double>();
		String row;
		String[] buffer;

		int j = 0;
		while ((row = br.readLine()) != null) {
			buffer = row.split(",");
			if (j != 0) { // Skip header
				try {
					// write Value in kW
					originalValues.add(nf.parse(buffer[2]).doubleValue() / 1000);
				} catch (Exception e) {
					// do nothing
				}
			}
			j++;
		}

		double[] x = new double[originalValues.size()];
		double[] y = new double[originalValues.size()];
		for (int i = 0; i < originalValues.size(); i++) {
			x[i] = 15 * i; // 15 min * 1 Days = 96
			y[i] = originalValues.get(i);
		}

		int timestepsPerDay = TopologyConfig.TIMESTEPS_PER_DAY;
		double[] xi = new double[timestepsPerDay];
		for (int j1 = 0; j1 < timestepsPerDay; j1++) {
			xi[j1] = j1 * MyTimeUnit.stepLength(TimeUnit.MINUTES);
		}

		double[] yi = Interpolation.interpLinear(x, y, xi);
		// Sometimes NAN appears, which is bad
		for (int i = 0; i < yi.length; i++) {
			if (Double.isNaN(yi[i])) {
				yi[i] = 0.0;
			}
		}

		for (int k = 0; k < yi.length; k++) {
			solarProductionPerKWp.add(yi[k]);
		}
		br.close();
	}
}
