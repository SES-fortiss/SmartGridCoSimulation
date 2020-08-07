package fortiss.results;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import fortiss.datastructures.Data;

/**
 * ResultsLibrary represents the set of results of a simulation
 */
public abstract class ResultsLibrary {

	/** Result library map */
	protected Map<String, Data> resultsLibrary;
	
	/** A qualifier for the file name according to the type of data */
	protected String typeQualifier;

	/**
	 * Constructor for the class ResultsLibrary
	 */
	public ResultsLibrary(String typeQualifier) {
		resultsLibrary = new HashMap<>();
		this.typeQualifier = typeQualifier;
	}

	/** Load results */
	public abstract void load();

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
