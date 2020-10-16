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
import memap.helper.profilehandler.TimedConsumerData;
import memap.helper.profilehandler.TimedConsumerDataHandler;
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
	 * Assign values to heatProfile and electricityProfile. Maybe this should be replaced into a distinct init helper class.
	 */
	private void setProfiles(String csvFile) {
		try {
			
			FileManager fm = new FileManager();
			if (csvFile.isEmpty()) {
				
				OriginalCSVHandler ocsv = new OriginalCSVHandler(fm.getBuffer("CONSUMPTIONEXAMPLE0"), topologyConfig);
				electricityProfile = ocsv.getElectricityProfile();
				heatProfile = ocsv.getHeatProfile();
				
			} else {
				
				// We handle the original way (old data format) first
				BufferedReader br = fm.getBuffer(csvFile);
				OriginalCSVHandler ocsv = new OriginalCSVHandler(br, topologyConfig);				
				electricityProfile = ocsv.getElectricityProfile();
				heatProfile = ocsv.getHeatProfile();
				
			}
		} catch (IOException | ParseException e) {
			
			System.out.println("Reading new format of " + csvFile);			
			try {
				// If the first reader does not work, we try a second format style, that is specified as another scenario
				
				FileManager fm = new FileManager();
				BufferedReader br = fm.getBuffer(csvFile);
				TimedConsumerData timedConsumerData = new TimedConsumerData(br);
				TimedConsumerDataHandler tdh = new TimedConsumerDataHandler(timedConsumerData, topologyConfig);
				electricityProfile = tdh.getElectricityProfile();
				heatProfile = tdh.getHeatProfile();
				
				// After the creation of the profiles, we must be sure to consider the MPC Horizon.
				// We append the first part of the profile again to the end to make sure that MPC data is available.
				
				int requiredProfileWithMPC = topologyConfig.getNrSteps() + topologyConfig.getNrStepsMPC() - 1;				
				if ( electricityProfile.size() < requiredProfileWithMPC) {
					electricityProfile.addAll(electricityProfile.subList(0, topologyConfig.getNrStepsMPC()));
					heatProfile.addAll(heatProfile.subList(0, topologyConfig.getNrStepsMPC()));
				}
				
			} catch (Exception e2) {
				SimulationStarter.stopSimulation();
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
