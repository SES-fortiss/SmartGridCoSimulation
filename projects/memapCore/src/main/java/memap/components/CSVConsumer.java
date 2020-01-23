package memap.components;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import akka.timeManagement.CurrentTimeStepSubscriber;
import memap.components.prototypes.Consumer;
import memap.controller.TopologyController;
import memap.examples.ExampleFiles;
import memap.helper.FileManager;
import memap.messages.extension.NetworkType;
import simulation.SimulationStarter;

public class CSVConsumer extends Consumer implements CurrentTimeStepSubscriber {

	/** Current time step */
	private int currentTimeStep;
	/** Heat profile values */
	private ArrayList<Double> heatProfile = new ArrayList<Double>();
	/** Electricity profile values */
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

	@Override
	public void makeDecision() {
		int nStepsMPC = topologyConfig.getNrStepsMPC();
		double[] demandVectorB = new double[2 * nStepsMPC];
		int cts = currentTimeStep;
		// Getting the HeatProfiles at the current time step with predictions
		List<Double> currentHeatProfile = getHeatProfile(cts, nStepsMPC);
		List<Double> currentElectricityProfile = getElectricityProfile(cts, nStepsMPC);
		// Creating demand vector
		for (int i = 0; i < nStepsMPC; i++) {
			try {
				demandVectorB[i] = -currentHeatProfile.get(0 + i);
				demandVectorB[nStepsMPC + i] = -currentElectricityProfile.get(0 + i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		consumptionMessage.name = actorName;
		consumptionMessage.id = fullActorPath;
		consumptionMessage.setDemandVector(demandVectorB);
		consumptionMessage.forecastType = "Profile";
		consumptionMessage.networkType = NetworkType.DEMANDWITHBOTH;

		super.updateDisplay(consumptionMessage);
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
				interpolate(getBuffer("EXAMPLE0"));
			} else {
				BufferedReader br = getBuffer(csvFile);
				interpolate(br);
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
	 * Interpolates the consumption profiles. The method is called by the
	 * constructor.
	 * 
	 * @param br a buffer reader with the data to be interpolated
	 * @throws IOException
	 * @throws ParseException
	 */
	private void interpolate(BufferedReader br) throws IOException, ParseException {
		double stepLengthInMinutes = topologyConfig.getStepLengthInMinutes();
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
		double[] consumptionBuffer = new double[2]; // Heat[0] + Electricity[1]

		int rowIndex = 0;
		int k = 0;

		/*
		 * TODO make this more flexible, i.e. the time resolution in the file might not
		 * be always the one minute resolution.
		 */

		// Read-in of consumption values for every minute (in the example files)
		while ((row = br.readLine()) != null) {
			// get values
			buffer = row.split(";");
			consumptionBuffer[0] += nf.parse(buffer[0]).doubleValue() / stepLengthInMinutes;
			consumptionBuffer[1] += nf.parse(buffer[1]).doubleValue() / stepLengthInMinutes;
			rowIndex++;

			// Sum up consumption over the number of minutes per time step
			if ((rowIndex >= (k + 1) * stepLengthInMinutes) && (buffer.length != 0)) {
				for (int j = 0; j < buffer.length; j++) {
					/**
					 * // Necessary if the time step is not exactly one minute. double
					 * deltaOverMinute = rowIndex - (k + 1) *
					 * MyTimeUnit.stepLength(TimeUnit.MINUTES); double deduction =
					 * nf.parse(buffer[j]).doubleValue() * deltaOverMinute; consumptionBuffer[j] =
					 * consumptionBuffer[j] - deduction; We ignore this for now
					 */
					dailyProfiles.get(j).add(consumptionBuffer[j]);
					consumptionBuffer[j] = 0;
				}
				k++;
			}
		}

		br.close();

		// Calculate the consumption for one day longer than necessary because of MPC
		// horizon
		// the heat profile of one day is copied for n_days; ( k = N_STEPS/N_Days )
		int daysToConsider = (int) Math.round(topologyConfig.getNrSteps() / k + 0.5);
		for (int m = 0; m < daysToConsider; m++) {
			for (int j = 0; j < 2; j++) {
				for (int i = 0; i < dailyProfiles.get(1).size(); i++) {
					profiles.get(j).add(dailyProfiles.get(j).get(i));
				}
			}
		}

		System.out
				.println("Profiles available. Heat: " + profiles.get(0).size() + " : " + gson.toJson(profiles.get(0)));
		System.out
				.println("Profiles available. Elec: " + profiles.get(1).size() + " : " + gson.toJson(profiles.get(1)));
	}

	@Override
	public void update(int currentTimeStep) {
		this.currentTimeStep = currentTimeStep;
	}

	/**
	 * Passes a reference of an object of class {@link TopologyController} to the
	 * parent class and subscribe to global currentTimeStep
	 */
	@Override
	public void setTopologyController(TopologyController topologyController) {
		super.setTopologyController(topologyController);
		this.topologyController.subscribeToCurrentTimeStep(this);
	}
}
