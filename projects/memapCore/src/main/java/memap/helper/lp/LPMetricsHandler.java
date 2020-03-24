package memap.helper.lp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
	BuildingMessage buildingMessage;
	OptimizationResultMessage optResult;
	double[] optSolution;
	LPOptimizationProblem problem;
	int currentTimeStep;
	int nStepsMPC;

	public LPMetricsHandler(BuildingMessage buildingMessage, OptimizationResultMessage optResult,
			double[] optSolution, LPOptimizationProblem problem, int currentTimeStep, int nStepsMPC) {
		this.buildingMessage = buildingMessage;
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
		int nrContributors = buildingMessage.getNrOfControllableProducers() + buildingMessage.getNrOfVolatileProducers()
				+ buildingMessage.getNrOfCouplers() + 2 * buildingMessage.getNrOfStorages();

		// initialize metrics
		if (currentTimeStep == 0) {
			initializeMetrics(nrIterations, nrContributors);
		}

		// Heat production per contributor at the current time step
		double[] currentHeatProd = new double[nrContributors];
		// Electricity production per contributor at the current time step
		double[] currentElectricityProd = new double[nrContributors];

		// Heat storage balance at the current time step
		double currentHeatStorageBalance = 0;
		// Electricity storage balance at the current time step
		double currentElectricityStorageBalance = 0;

		for (int i = 0; i < nrContributors; i++) {
			double result = -optSolution[i * nStepsMPC];

			currentHeatProd[i] = problem.a_eq[0][i * nStepsMPC] * result;
			currentElectricityProd[i] = problem.a_eq[nStepsMPC][i * nStepsMPC] * result;

			// Storage balance calculations
			for (int k = 0; k < problem.g.length - nStepsMPC; k++) {
				if (problem.g[k][i * nStepsMPC] > 0 && problem.g[k + 1][i * nStepsMPC] < 0) {
					// Heat storages
					if (problem.a_eq[0][i * nStepsMPC] != 0) {
						currentHeatStorageBalance += -problem.a_eq[0][i * nStepsMPC] * optSolution[i * nStepsMPC]
								- problem.a_eq[0][(i + 1) * nStepsMPC] * optSolution[(i + 1) * nStepsMPC];
					}
					// Electricity storages
					if (problem.a_eq[nStepsMPC][i * nStepsMPC] != 0) {
						currentElectricityStorageBalance += -problem.a_eq[nStepsMPC][i * nStepsMPC]
								* optSolution[i * nStepsMPC]
								- problem.a_eq[nStepsMPC][(i + 1) * nStepsMPC] * optSolution[(i + 1) * nStepsMPC];
					}
				}
			}
		}

		// Update global metrics

		// Heat storage balance per time step
		double[] heatStorageBalance = optResult.metricsMap.get("Heat storage balance");
		heatStorageBalance[currentTimeStep] = currentHeatStorageBalance;
		optResult.metricsMap.put("Heat storage balance", heatStorageBalance);

		// Electricity storage balance per time step
		double[] electricityStorageBalance = optResult.metricsMap.get("Electricity storage balance");
		electricityStorageBalance[currentTimeStep] = currentElectricityStorageBalance;
		optResult.metricsMap.put("Electricity storage balance", electricityStorageBalance);

		for (int i = 0; i < nrContributors; i++) {

			// Heat production of contributor in index i per time step
			double[] heatProduction = optResult.metricsMap.get("H_" + problem.namesUB[i * nStepsMPC]);
			heatProduction[currentTimeStep] = currentHeatProd[i];
			optResult.metricsMap.put("H_" + problem.namesUB[i * nStepsMPC], heatProduction);

			// Electricity production of contributor in index i per time step
			double[] electricityProduction = optResult.metricsMap.get("E_" + problem.namesUB[i * nStepsMPC]);
			electricityProduction[currentTimeStep] = currentElectricityProd[i];
			optResult.metricsMap.put("E_" + problem.namesUB[i * nStepsMPC], electricityProduction);
		}
		
		if (currentTimeStep == (nrIterations - 1)) {
			saveOverviewMetrics(filename);
		}

	}

	@Deprecated
	/**
	 * TODO Remove live metrics Note this method uses the same maps as the overview
	 * metrics. This might create a conflict
	 */
	public void calculateLiveMetrics(String filename) throws IOException {

		int nrIterations = topologyConfig.getNrOfIterations();
		// Devices that can contribute energy: Storage is count twice because there are
		// two associated vectors (charge and discharge)
		int nrContributors = buildingMessage.getNrOfControllableProducers() + buildingMessage.getNrOfVolatileProducers()
				+ buildingMessage.getNrOfCouplers() + 2 * buildingMessage.getNrOfStorages();

		// Heat production per MPC time step per contributor
		double[][] heatProd = new double[nrContributors][nStepsMPC];
		// Electricity production per MPC time step per contributor
		double[][] electricityProd = new double[nrContributors][nStepsMPC];
		// Total heat production per MPC time step
		double[] totalHeatProd = new double[nStepsMPC];
		// Total electricity production per MPC time step
		double[] totalElectricityProd = new double[nStepsMPC];

		// We avoid the last 2 blocks in optSolution, which correspond to market metrics
		for (int i = 0; i < nrContributors; i++) {
			double[] result = new double[nStepsMPC];
			for (int j = 0; j < result.length; j++) {
				result[j] = -optSolution[i * nStepsMPC + j];
				System.out.println("result[" + j + "]: " + result[j]);

				heatProd[i][j] = problem.a_eq[j][i * nStepsMPC + j] * result[j];
				System.out.println("prodHeat[" + i + "][" + j + "]: " + heatProd[i][j]);

				electricityProd[i][j] = problem.a_eq[j + nStepsMPC][i * nStepsMPC + j] * result[j];
				System.out.println("prodElectricity[" + i + "][" + j + "]: " + electricityProd[i][j]);

				totalHeatProd[j] += heatProd[i][j];
				System.out.println("totalProdHeat[" + j + "]: " + totalHeatProd[j]);

				totalElectricityProd[j] += electricityProd[i][j];
				System.out.println("totalProdElectricity[" + j + "]: " + totalElectricityProd[j]);
			}
		}

		// Add to metricsMap
		optResult.metricsMap.put("Total heat production", totalHeatProd);
		optResult.metricsMap.put("Total electricity production", totalElectricityProd);

		for (int i = 0; i < optSolution.length / nStepsMPC - 2; i++) {
			optResult.metricsMap.put("H_" + problem.namesUB[i * nStepsMPC], heatProd[i]);
			optResult.metricsMap.put("E_" + problem.namesUB[i * nStepsMPC], electricityProd[i]);
		}

		System.out.println(" ");
		System.out.println(" ");

		if (currentTimeStep == (nrIterations - 1)) {
			saveOverviewMetrics(filename);
		}
	}

	@Override
	public void initializeMetrics(int nrIterations, int nrContributors) {
		optResult.metricsMap.put("Heat storage balance", new double[nrIterations]);
		optResult.metricsMap.put("Electricity storage balance", new double[nrIterations]);
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
