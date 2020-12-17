package memap.helper.lp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Map.Entry;

import memap.helper.DirectoryConfiguration;
import memap.helper.MetricsHandler;
import memap.main.TopologyConfig;
import memap.messages.BuildingMessage;
import memap.messages.OptimizationResultMessage;

public class LPMetricsHandler implements MetricsHandler {

	TopologyConfig topologyConfig = TopologyConfig.getInstance();
	ArrayList<BuildingMessage> buildingMessageList;
	OptimizationResultMessage optResult;
	double[] optSolution;
	LPOptimizationProblem problem;
	int currentTimeStep;
	int nStepsMPC;

	public LPMetricsHandler(BuildingMessage buildingMessage, OptimizationResultMessage optResult, double[] optSolution,
			LPOptimizationProblem problem, int currentTimeStep, int nStepsMPC) {
		buildingMessageList = new ArrayList<BuildingMessage>();
		this.buildingMessageList.add(buildingMessage);
		this.optResult = optResult;
		this.optSolution = optSolution;
		this.problem = problem;
		this.currentTimeStep = currentTimeStep;
		this.nStepsMPC = nStepsMPC;
	}

	public LPMetricsHandler(ArrayList<BuildingMessage> buildingMessageList, OptimizationResultMessage optResult,
			double[] optSolution, LPOptimizationProblem problem, int currentTimeStep, int nStepsMPC) {
		this.buildingMessageList = buildingMessageList;
		this.optResult = optResult;
		this.optSolution = optSolution;
		this.problem = problem;
		this.currentTimeStep = currentTimeStep;
		this.nStepsMPC = nStepsMPC;
	}

	@Override
	public void calculateOverviewMetrics(String filename) throws IOException {

		int nrIterations = topologyConfig.getNrOfIterations();

		/*
		 * Devices that can contribute energy: Storages are counted twice because there
		 * are two associated vectors (charge and discharge). Same as:
		 * optSolution.length / nStepsMPC - 2, which avoids the last 2 blocks of data
		 * (correspond to market metrics)
		 */

		int nrContributors = 0;
		for (BuildingMessage buildingMessage : buildingMessageList) {
			nrContributors += buildingMessage.getNrOfControllableProducers() + 2 * buildingMessage.getNrOfConnections()
					+ buildingMessage.getNrOfVolatileProducers() + buildingMessage.getNrOfCouplers()
					+ 2 * buildingMessage.getNrOfStorages();
		}

		// initialize metrics
		if (currentTimeStep == 0) {
			initializeMetrics(nrIterations, nrContributors);
		}

		// Heat production per contributor at the current time step
		double[] currentHeatProd = new double[nrContributors];
		// Electricity production per contributor at the current time step
		double[] currentElectricityProd = new double[nrContributors];

		// Initialize heat vector with zeros
		for (int i = 0; i < currentHeatProd.length; i++) {
			currentHeatProd[i] = 0;
		}

		if (buildingMessageList.size() > 1) {

			for (int i = 0; i < nrContributors; i++) {
				double result = -optSolution[i * nStepsMPC];

				// Adding up heat vectors
				for (int j = 0; j < buildingMessageList.size(); j = j + nStepsMPC) {
					currentHeatProd[i] += problem.a_eq[j][i * nStepsMPC] * result;
				}

				// Electricity vector
				int secondLastPosition = problem.a_eq.length - 2;
				currentElectricityProd[i] = problem.a_eq[secondLastPosition][i * nStepsMPC] * result;

				// Update global metrics
				// Heat production of contributor in index i per time step
				double[] heatProduction = optResult.metricsMap.get("H_" + problem.namesUB[i * nStepsMPC]);
				heatProduction[currentTimeStep] = currentHeatProd[i];
				optResult.metricsMap.put("H_" + problem.namesUB[i * nStepsMPC], heatProduction);

				// Electricity production of contributor in index i per time step
				double[] electricityProduction = optResult.metricsMap.get("E_" + problem.namesUB[i * nStepsMPC]);
				electricityProduction[currentTimeStep] = currentElectricityProd[i];
				optResult.metricsMap.put("E_" + problem.namesUB[i * nStepsMPC], electricityProduction);
			}

		} else {
			for (int i = 0; i < nrContributors; i++) {
				double result = -optSolution[i * nStepsMPC];

				currentHeatProd[i] = problem.a_eq[0][i * nStepsMPC] * result;
				currentElectricityProd[i] = problem.a_eq[nStepsMPC][i * nStepsMPC] * result;

				// Update global metrics
				// Heat production of contributor in index i per time step
				double[] heatProduction = optResult.metricsMap.get("H_" + problem.namesUB[i * nStepsMPC]);
				heatProduction[currentTimeStep] = currentHeatProd[i];
				optResult.metricsMap.put("H_" + problem.namesUB[i * nStepsMPC], heatProduction);

				// Electricity production of contributor in index i per time step
				double[] electricityProduction = optResult.metricsMap.get("E_" + problem.namesUB[i * nStepsMPC]);
				electricityProduction[currentTimeStep] = currentElectricityProd[i];
				optResult.metricsMap.put("E_" + problem.namesUB[i * nStepsMPC], electricityProduction);
			}
		}

		if (currentTimeStep == (nrIterations - 1)) {
			saveOverviewMetrics(filename);
		}

	}

	@Override
	public void initializeMetrics(int nrIterations, int nrContributors) {
		for (int i = 0; i < nrContributors; i++) {
			optResult.metricsMap.put("H_" + problem.namesUB[i * nStepsMPC], new double[nrIterations]);
			optResult.metricsMap.put("E_" + problem.namesUB[i * nStepsMPC], new double[nrIterations]);
		}
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
