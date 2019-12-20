package fortiss.results;

import java.util.ArrayList;

import fortiss.components.Building;
import fortiss.datastructures.Data;
import fortiss.gui.Designer;
import fortiss.simulation.Parameters;
import memap.helper.DirectoryConfiguration;

/**
 * Output represents a simulation complete set of results.
 */
public class Output {
	private Parameters pars = Designer.parameterPanel.pars;
	private ArrayList<Data> output = new ArrayList<>();
	public ArrayList<String> buildingNames = new ArrayList<>();

	/**
	 * Constructor for the class Output. Populates the list array with objects of
	 * the class Data.
	 */
	public Output() {
		String location = System.getProperty("user.dir");
		String source = "/" + DirectoryConfiguration.mainDir + "/results/" + pars.getSimulationName() + "MPC"
				+ pars.getSteps() + "/";
		
		String optimizerQualifier = "MPC";
		if(pars.getOptimizer().equals("milp")) 
			optimizerQualifier += "_MILP";
		
		if (pars.isMemapON()) {
			for (Building building : Designer.buildings) {
				String filename = pars.getSimulationName() + optimizerQualifier + pars.getSteps() + "Solutions.csv";
				buildingNames.add(building.getName());
				filename = location + source + filename;
				output.add(new Data(filename, true));
			}
		} else {
			for (Building building : Designer.buildings) {
				String filename = building.getName() + optimizerQualifier + pars.getSteps() + "Solutions.csv";
				buildingNames.add(building.getName());
				filename = location + source + filename;
				output.add(new Data(filename, true));
			}
		}
	}

	/**
	 * @return the number of data sets.
	 */
	public int size() {
		return output.size();
	}

	/**
	 * @param building    index of the building data set
	 * @param seriesIndex the index of a series in data object
	 * @return a label in data object
	 */
	public String getDataLabel(int building, int seriesIndex) {
		return output.get(building).getLabel(seriesIndex);
	}

	/**
	 * @param building    index of the building data set
	 * @param seriesIndex the index of a series in a data set
	 * @return a series in data object
	 */
	public ArrayList<Double> getDataSeries(int building, int seriesIndex) {
		return output.get(building).getSeries(seriesIndex);
	}

	/**
	 * @param building index of the building data set
	 * @param label    the label of a series in a data set
	 * @return a series in data object
	 */
	public ArrayList<Double> getDataSeries(int building, String label) {
		int indexOfLabel = output.get(building).getIndexOf(label);
		return output.get(building).getSeries(indexOfLabel);
	}

	/**
	 * @return number of series in a data set
	 */
	public int getDataSetSize(int building) {
		return output.get(building).getNumOfSeries();
	}

}
