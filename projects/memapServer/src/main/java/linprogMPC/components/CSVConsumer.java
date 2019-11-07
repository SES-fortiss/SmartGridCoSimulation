package linprogMPC.components;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import linprogMPC.TopologyConfig;
import linprogMPC.components.prototypes.Consumer;
import linprogMPC.examples.ExampleFiles;
import linprogMPC.helper.FileManager;
import linprogMPC.helper.MyTimeUnit;

public class CSVConsumer extends Consumer {

	private FileManager mgr = new FileManager();
	private ArrayList<Double> heatProfile = new ArrayList<Double>();
	private ArrayList<Double> electricityProfile = new ArrayList<Double>();

	public CSVConsumer(String csvFile, int port) {
		super(port);
		setProfiles(csvFile);
	}

	/**
	 * @return Heat profile
	 */
	@Override
	public List<Double> getHeatProfile(int timeStep, int mpcHorizon) {
		return heatProfile.subList(timeStep, timeStep + mpcHorizon);

	}

	/**
	 * @return Electricity profile
	 */
	@Override
	public List<Double> getElectricityProfile(int timeStep, int mpcHorizon) {
		return electricityProfile.subList(timeStep, timeStep + mpcHorizon);
	}

	/**
	 * Assign values to heatProfile and electricityProfile
	 */
	private void setProfiles(String csvFile) {
		try {
			if (csvFile.isEmpty()) {
				interpolate(getBuffer("EXAMPLE1"));
			} else {
				interpolate(getBuffer(csvFile));
			}
		} catch (IOException | ParseException e) {
			System.err.println("Error reading or parsing CSV data from " + csvFile);
			e.printStackTrace();
		}

	}

	/**
	 * @return a buffer with the data from csvFile
	 * @param csvFile consumption profiles CSV file
	 */
	private BufferedReader getBuffer(String csvFile) {
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
	 * Interpolates the consumption profiles
	 * 
	 * @param br a buffer reader with the data to be interpolated
	 * @throws IOException
	 * @throws ParseException
	 */
	private void interpolate(BufferedReader br) throws IOException, ParseException {

		NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);

		HashMap<Integer, ArrayList<Double>> profiles = new HashMap<Integer, ArrayList<Double>>();
		HashMap<Integer, ArrayList<Double>> dailyProfiles = new HashMap<Integer, ArrayList<Double>>();

		profiles.put(0, heatProfile);
		profiles.put(1, electricityProfile);
		for (int i = 0; i < 2; i++) {
			dailyProfiles.put(i, new ArrayList<Double>());
		}

		String row;
		String[] buffer;
		double[] consumptionBuffer = new double[2];

		int rowIndex = 0;
		int k = 0;

		// Read-in of consumption values in kJ for every minute
		while ((row = br.readLine()) != null) {
			// get values
			buffer = row.split(";");
			consumptionBuffer[0] += nf.parse(buffer[0]).doubleValue();
			consumptionBuffer[1] += nf.parse(buffer[1]).doubleValue();
			rowIndex++;

			// Sum up consumption over the number of minutes per time step
			if ((rowIndex >= (k + 1) * MyTimeUnit.stepLength(TimeUnit.MINUTES)) && (buffer.length != 0)) {

				for (int j = 0; j < buffer.length; j++) {
					// Necessary if the time step is not exactly one minute.
					double deltaOverMinute = rowIndex - (k + 1) * MyTimeUnit.stepLength(TimeUnit.MINUTES);
					double deduction = nf.parse(buffer[j]).doubleValue() * deltaOverMinute;
					consumptionBuffer[j] = consumptionBuffer[j] - deduction;
					dailyProfiles.get(j).add(consumptionBuffer[j]);
					consumptionBuffer[j] = 0;
				}
				k++;
			}
		}

		br.close();

		// Calculate the consumption for one day longer than necessary because of MPC
		// horizon
		int daysToConsider = (int) Math.round(TopologyConfig.N_STEPS / k + 0.5);
		System.out.println("Days to Consider because of MPC: " + daysToConsider);

		// the heat profile of one day is copied for n_days; ( k = N_STEPS/N_Days )
		for (int m = 0; m < daysToConsider; m++) {
			for (int j = 0; j < 2; j++) {
				for (int i = 0; i < dailyProfiles.get(1).size(); i++) {
					profiles.get(j).add(dailyProfiles.get(j).get(i));
				}
			}
		}
	}
}
