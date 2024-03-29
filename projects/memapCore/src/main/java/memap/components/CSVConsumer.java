package memap.components;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import akka.timeManagement.CurrentTimeStepSubscriber;
import memap.components.prototypes.Consumer;
import memap.controller.TopologyController;
import memap.helper.FileManager;
import memap.helper.profilehandler.OriginalCSVHandler;
import memap.helper.profilehandler.TimedData;
import memap.helper.profilehandler.TimedDataHandler;
import memap.main.SimulationProgress;
import memap.main.Status;
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

		demandMessage.name = actorName;
		demandMessage.id = fullActorPath;
		demandMessage.setDemandVector(demandVectorB);
		demandMessage.forecastType = "Profile";
		demandMessage.networkType = NetworkType.DEMANDWITHBOTH;

		super.updateDisplay(demandMessage);
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
	 * Assign values to heatProfile and electricityProfile. Maybe this should be
	 * replaced into a distinct init helper class.
	 */
	private void setProfiles(String csvFile) {
		try {
			FileManager fm = new FileManager();
			if (csvFile.isEmpty()) {
				OriginalCSVHandler ocsv;
				csvFile = "CONSUMPTIONEXAMPLE0"; // Necessary in case parsing fails
				ocsv = new OriginalCSVHandler(fm.getBuffer(csvFile), topologyConfig);
				electricityProfile = ocsv.getElectricityProfile();
				heatProfile = ocsv.getHeatProfile();
			} else {
				// We handle the original way (old data format) first
				BufferedReader br = fm.getBuffer(csvFile);
				OriginalCSVHandler ocsv;
				ocsv = new OriginalCSVHandler(br, topologyConfig);
				electricityProfile = ocsv.getElectricityProfile();
				heatProfile = ocsv.getHeatProfile();
			}
		} catch (IOException | ParseException e) {

			System.out.println("Reading new format of " + csvFile);
			try {
				// If the first reader does not work, we try a second format style, that is
				// specified as another scenario

				FileManager fm = new FileManager();
				BufferedReader br = fm.getBuffer(csvFile);
				String[] columnNames = new String[] { "Heat", "Electricity" };
				TimedData timedConsumerData = new TimedData(br, columnNames);
				TimedDataHandler tdh = new TimedDataHandler(timedConsumerData, topologyConfig, columnNames);
				electricityProfile = tdh.get(columnNames[0]);
				heatProfile = tdh.get(columnNames[1]);

				// After the creation of the profiles, we must be sure to consider the MPC
				// Horizon.
				// We append the first part of the profile again to the end to make sure that
				// MPC data is available.

				int requiredProfileWithMPC = topologyConfig.getNrSteps() + topologyConfig.getNrStepsMPC() - 1;
				if (electricityProfile.size() < requiredProfileWithMPC) {
					electricityProfile.addAll(electricityProfile.subList(0, topologyConfig.getNrStepsMPC()));
					heatProfile.addAll(heatProfile.subList(0, topologyConfig.getNrStepsMPC()));
				}

			} catch (Exception e2) {
				SimulationProgress.getInstance().setStatus(Status.ERROR, getClass() + " - wrong format");
				SimulationStarter.stopSimulationStatic();
				e.printStackTrace();
				e2.printStackTrace();
			}
		}
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
