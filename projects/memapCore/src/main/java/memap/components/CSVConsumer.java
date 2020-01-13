package memap.components;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import memap.components.prototypes.Consumer;
import memap.examples.ExampleFiles;
import memap.helper.FileManager;
import memap.helper.MyTimeUnit;
import memap.main.TopologyConfig;
import simulation.SimulationStarter;

public class CSVConsumer extends Consumer {
	private ArrayList<Double> heatProfile = new ArrayList<Double>();
	private ArrayList<Double> electricityProfile = new ArrayList<Double>();

	/**
	 * @param name    consumer name
	 * @param csvFile consumption profile file path
	 * @param port
	 */
	public CSVConsumer(String name, String csvFile, int port) {
		super(name, port);
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
			SimulationStarter.stopSimulation();
			e.printStackTrace();
		}

	}

	/**
	 * @return a buffer with the data from csvFile
	 * @param csvFile consumption profiles CSV file
	 */
	private BufferedReader getBuffer(String csvFile) {
		FileManager mgr = new FileManager();
		ExampleFiles examples = new ExampleFiles();
		if (examples.isExample(csvFile)) {
			System.out.println(">> Consumer construction - reading from resources: " + csvFile);
			return mgr.readFromResources(examples.getFile(csvFile));
		} else {
			System.out.println(">> Consumer construction - reading from source: " + csvFile);
			return mgr.readFromSource(csvFile);
		}
	}

	/**
	 * Interpolates the consumption profiles.
	 * The method is called by the constructor.
	 * 
	 * @param br a buffer reader with the data to be interpolated
	 * @throws IOException
	 * @throws ParseException
	 */
	private void interpolate(BufferedReader br) throws IOException, ParseException {

		NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
		//NumberFormat nf = NumberFormat.getInstance(Locale.ENGLISH);

		HashMap<Integer, ArrayList<Double>> profiles = new HashMap<Integer, ArrayList<Double>>();
		HashMap<Integer, ArrayList<Double>> dailyProfiles = new HashMap<Integer, ArrayList<Double>>();

		profiles.put(0, heatProfile);
		profiles.put(1, electricityProfile);
		for (int i = 0; i < 2; i++) {
			dailyProfiles.put(i, new ArrayList<Double>());
		}

		String row;
		String[] buffer;
		double[] consumptionBuffer = new double[2]; // Heat[0] + Electricity[1]

		int rowIndex = 0;
		int k = 0;

		// Read-in of consumption values for every minute (in the example files) // TODO make this more flexible, i.e. the time resolution in the file might not be always the one minute resolution.
		while ((row = br.readLine()) != null) {
			// get values
			buffer = row.split(";");
			consumptionBuffer[0] += nf.parse(buffer[0]).doubleValue() / MyTimeUnit.stepLength(TimeUnit.MINUTES);
			consumptionBuffer[1] += nf.parse(buffer[1]).doubleValue() / MyTimeUnit.stepLength(TimeUnit.MINUTES);
			rowIndex++;			

			// Sum up consumption over the number of minutes per time step
			if ((rowIndex >= (k + 1) * MyTimeUnit.stepLength(TimeUnit.MINUTES)) && (buffer.length != 0)) {
				
				/*
				System.out.println("I'm here");
				System.out.println("MyTimeUnit.stepLength(TimeUnit.MINUTES): " + MyTimeUnit.stepLength(TimeUnit.MINUTES));
				System.out.println("File exist + rowIndex = " + rowIndex);

				System.out.println("Heat Avg. Consumption: " + consumptionBuffer[0]);
				System.out.println("Elec Avg. Consumption: " + consumptionBuffer[1]);
				*/
				
				for (int j = 0; j < buffer.length; j++) {
					/**
					// Necessary if the time step is not exactly one minute.
					double deltaOverMinute = rowIndex - (k + 1) * MyTimeUnit.stepLength(TimeUnit.MINUTES);
					double deduction = nf.parse(buffer[j]).doubleValue() * deltaOverMinute;
					consumptionBuffer[j] = consumptionBuffer[j] - deduction;
					* We ignore this for now
					*/
					dailyProfiles.get(j).add(consumptionBuffer[j]);
					consumptionBuffer[j] = 0;
				}
				k++;
			}
		}

		br.close();

		// Calculate the consumption for one day longer than necessary because of MPC horizon		
		// the heat profile of one day is copied for n_days; ( k = N_STEPS/N_Days )
		int daysToConsider = (int) Math.round(TopologyConfig.N_STEPS / k + 0.5);
		for (int m = 0; m < daysToConsider; m++) {
			for (int j = 0; j < 2; j++) {
				for (int i = 0; i < dailyProfiles.get(1).size(); i++) {
					profiles.get(j).add(dailyProfiles.get(j).get(i));
				}
			}
		}
		
		System.out.println("Profiles available. Heat: " + profiles.get(0).size() + " : " + gson.toJson(profiles.get(0)));
		System.out.println("Profiles available. Elec: " + profiles.get(1).size() + " : " + gson.toJson(profiles.get(1)));
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
