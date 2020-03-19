package fortiss.results;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import fortiss.components.Building;
import fortiss.datastructures.Data;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.FileManager;
import fortiss.simulation.Parameters;
import memap.helper.DirectoryConfiguration;

/**
 * Output represents a simulation complete set of results.
 */
public class Output {

	private Map<String, Data> resultsLibrary;

	/**
	 * Constructor for the class Output.
	 */
	public Output() {
		resultsLibrary = new HashMap<>();
	}

	/*
	 * Populates the map with objects of the class Data.
	 */
	public void loadResults() {
		FileManager fm = new FileManager();
		Parameters pars = DesignerPanel.parameterPanel.pars;
		String location = System.getProperty("user.dir");
		String fs = File.separator;
		String source = fs + DirectoryConfiguration.mainDir + fs + "results" + fs + pars.getSimulationName() + fs
				+ "MPC" + pars.getSteps();

		String optimizerQualifier = "_MPC" + pars.getSteps();
		if (pars.getOptimizer().equals("milp")) {
			source += "_MILP" + fs;
			optimizerQualifier += "_MILP_Solutions.csv";
		}

		if (pars.getOptimizer().equals("lp")) {
			source += "_LP" + fs;
			optimizerQualifier += "_LP_Solutions.csv";
		}

		// Read global optimization results
		String filename = pars.getSimulationName() + optimizerQualifier;
		filename = location + source + filename;

		try {
			resultsLibrary.put("Global optimization", new Data(fm.readFromSource(filename), true));
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}

		// Read building optimization results
		for (Building building : DesignerPanel.buildings) {
			filename = building.getName() + optimizerQualifier;
			filename = location + source + filename;
			try {
				resultsLibrary.put(building.getName(), new Data(fm.readFromSource(filename), true));
			} catch (IOException | ParseException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * @return the number of data sets in the results library
	 */
	public int getNumOfDatasets() {
		return resultsLibrary.size();
	}

	/**
	 * @param resultName a building name or "Global optimization" for global
	 *                   optimization results
	 * @param label      the label of a series in a data set
	 * @return a series in the data set of a building
	 */
	public ArrayList<Double> getDataSeries(String resultName, String label) {
		return resultsLibrary.get(resultName).getSeries(label);
	}

	/**
	 * @param resultName a building name or "Global optimization" for global
	 *                   optimization results
	 * @return number of series in a data set
	 */
	public int getDatasetSize(String resultName) {
		int numOfSeries = 0;
		if (resultsLibrary.containsKey(resultName)) {
			numOfSeries = resultsLibrary.get(resultName).getNumOfSeries();
		}
		return numOfSeries;
	}

	/**
	 * @return a set of result names including building names and "Global
	 *         optimization" for global optimization results
	 */
	public Set<String> getResultList() {
		return resultsLibrary.keySet();
	}

	/**
	 * @param resultName a building name or "Global optimization" for global
	 *                   optimization results
	 * @return a set of series names in the data set of a building
	 */
	public Set<String> getSeriesList(String resultName) {
		return resultsLibrary.get(resultName).getSeriesList();
	}

	/**
	 * @param resultName a building name or "Global optimization" for global
	 *                   optimization results
	 * @return <code>true</code> if there are results for a given building name
	 */
	public boolean containsResultsFor(String resultName) {
		return resultsLibrary.containsKey(resultName);
	}
}
