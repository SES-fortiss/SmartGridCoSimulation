package memap.helper.milp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Map.Entry;

import lpsolve.LpSolve;
import lpsolve.LpSolveException;
import memap.controller.TopologyController;
import memap.helper.DirectoryConfiguration;
import memap.helper.MetricsHandler;
import memap.helper.SolutionHandler;
import memap.main.TopologyConfig;
import memap.messages.BuildingMessage;
import memap.messages.OptimizationResultMessage;
import memap.messages.extension.NetworkType;
import memap.messages.planning.CouplerMessage;
import memap.messages.planning.ProducerMessage;
import memap.messages.planning.StorageMessage;

public class MILPMetricsHandler implements MetricsHandler {

	TopologyConfig topologyConfig = TopologyConfig.getInstance();
	BuildingMessage buildingMessage;
	OptimizationResultMessage optResult;
	LpSolve problem;
	SolutionHandler milpSolutionHandler;
	double[] optSolution;
	int currentTimeStep;
	int nStepsMPC;

	TopologyController tc;

	public MILPMetricsHandler(TopologyController tc, BuildingMessage buildingMessage,
			OptimizationResultMessage optResult, double[] optSolution, LpSolve problem,
			SolutionHandler milpSolutionHandler, int currentTimeStep, int nStepsMPC) {
		this.buildingMessage = buildingMessage;
		this.optResult = optResult;
		this.problem = problem;
		this.milpSolutionHandler = milpSolutionHandler;
		this.optSolution = optSolution;
		this.currentTimeStep = currentTimeStep;
		this.nStepsMPC = nStepsMPC;

		this.tc = tc;
	}

	@Override
	public void calculateOverviewMetrics(String filename) throws IOException {
		int nrIterations = topologyConfig.getNrOfIterations();

		/*
		 * Devices that can contribute energy: Storages are counted twice because there
		 * are two associated vectors (charge and discharge). Controllable and couplers
		 * are also counted twice because they are associated with boolean variables
		 * that indicate whether they are active
		 */
		int nrContributors = (buildingMessage.getNrOfControllableProducers() * 2)
				+ (buildingMessage.getNrOfVolatileProducers()) + (buildingMessage.getNrOfCouplers() * 2)
				+ (buildingMessage.getNrOfStorages() * 2);

		// initialize metrics
		if (currentTimeStep == 0) {
			initializeMetrics(nrIterations, nrContributors);
		}

		double[] currentOptVector = milpSolutionHandler.getSolutionForThisTimeStep(optSolution, nStepsMPC);
		String[] solutionNames = getSolutionNames(nrContributors);

		for (int i = 0; i < nrContributors; i++) {
			double [] efficiencies = getEfficiencyFor(solutionNames[i]);
			double heatEfficiency = efficiencies[0];
			double electricityEfficiency = efficiencies[1];
			double[] heatContribution = optResult.metricsMap.get("H_" + solutionNames[i]);
			double[] electricityContribution = optResult.metricsMap.get("E_" + solutionNames[i]);
			heatContribution[currentTimeStep] = currentOptVector[i] * heatEfficiency;
			electricityContribution[currentTimeStep] = currentOptVector[i] * electricityEfficiency;
			optResult.metricsMap.put("H_" + solutionNames[i], heatContribution);
			optResult.metricsMap.put("E_" + solutionNames[i], electricityContribution);
		}

		if (currentTimeStep == (nrIterations - 1)) {
			saveOverviewMetrics(filename);
		}
	}

	@Override
	public void initializeMetrics(int nrIterations, int nrContributors) {
		String[] solutionNames = getSolutionNames(nrContributors);
		for (int i = 0; i < nrContributors; i++) {
			optResult.metricsMap.put("H_" + solutionNames[i], new double[nrIterations]);
			optResult.metricsMap.put("E_" + solutionNames[i], new double[nrIterations]);
		}
	}

	/**
	 * @param componentName A component name
	 * @return the efficiency of the component
	 */
	private double[] getEfficiencyFor(String componentName) {

		double[] efficiency = {0, 0};
		for (StorageMessage message : buildingMessage.storageList) {
			if (componentName.equals(message.name + "Discharge")) {
				if(message.networkType.equals(NetworkType.HEAT)) {
					efficiency[0] = message.efficiencyDischarge;
				} else {
					efficiency[1] = message.efficiencyDischarge;
				}
 			}
			if (componentName.equals(message.name + "Charge")) {
				if(message.networkType.equals(NetworkType.HEAT)) {
					efficiency[0] = message.efficiencyCharge;
				} else {
					efficiency[1] = message.efficiencyCharge;
				}
 			}
		}
		for (CouplerMessage message : buildingMessage.couplerList) {
			if (componentName.equals(message.name)) {
				efficiency[0] = message.efficiencyHeat;
				efficiency[1] = message.efficiencyElec;
 			}
		}
		for (ProducerMessage message : buildingMessage.volatileProducerList) {
			if (componentName.equals(message.name)) {
				if(message.networkType.equals(NetworkType.HEAT)) {
					efficiency[0] = message.efficiency;
				} else {
					efficiency[1] = message.efficiency;
				}
 			}
		}
		for (ProducerMessage message : buildingMessage.controllableProducerList) {
			if (componentName.equals(message.name)) {
				if(message.networkType.equals(NetworkType.HEAT)) {
					efficiency[0] = message.efficiency;
				} else {
					efficiency[1] = message.efficiency;
				}
 			}
		}

		return efficiency;
	}

	private String[] getSolutionNames(int nrContributors) {
		int nCols = nStepsMPC * nrContributors;
		String[] columnNames = new String[nCols];

		try {
			for (int m = 0; m < nCols; m++) {
				columnNames[m] = problem.getColName(m + 1);
			}
		} catch (LpSolveException e) {
			e.printStackTrace();
		}

		String[] solutionNames = milpSolutionHandler.getVectorNamesForThisTimeStep(columnNames, nStepsMPC);
		return solutionNames;
	}

	@Override
	public void saveOverviewMetrics(String filename) throws IOException {
		String source = File.separator + DirectoryConfiguration.mainDir + File.separator
				+ DirectoryConfiguration.resultDir + File.separator + filename;
		String location = System.getProperty("user.dir");
		/*
		 * Note: location is the project directory from which the simulation was started
		 * or or the directory from which the .jar was executed.
		 */
		location = location + source;

		System.out.println("Try file location: " + location);
		FileWriter csvWriter = new FileWriter(location);

		for (Entry<String, double[]> entry : optResult.metricsMap.entrySet()) {

			if (Collections.frequency(Arrays.asList(entry.getValue()), 0) != entry.getValue().length) {
				String line = String.join(";", entry.getKey());

				for (double array : entry.getValue()) {
					line = String.join(";", line, String.format(Locale.GERMAN, "%.4f", array));
				}

				csvWriter.append(line + "\n");
			}
		}

		csvWriter.flush();
		csvWriter.close();
	}
}
