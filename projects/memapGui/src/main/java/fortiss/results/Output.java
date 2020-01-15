package fortiss.results;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
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
		String fs = File.separator;
		String source = fs + DirectoryConfiguration.mainDir + fs + "results" + fs + pars.getSimulationName() + fs +"MPC" + pars.getSteps();
		
		String optimizerQualifier = "_MPC" + pars.getSteps();
		if(pars.getOptimizer().equals("milp")) {
			source += "_MILP" + fs;
			optimizerQualifier += "_MILP_Solutions.csv";
		}
			
		if(pars.getOptimizer().equals("lp")) {
			source += "_LP" + fs;
			optimizerQualifier += "_LP_Solutions.csv";
		}			
		
		if (pars.isMemapON()) {
			for (Building building : Designer.buildings) {
				String filename = pars.getSimulationName() + optimizerQualifier;
				buildingNames.add(building.getName());
				filename = location + source + filename;
				try {
					output.add(new Data(filename, true));
				} catch (IOException | ParseException e) {
					e.printStackTrace();
				}
			}
		} else {
			for (Building building : Designer.buildings) {
				String filename = building.getName() + optimizerQualifier;
				buildingNames.add(building.getName());
				filename = location + source + filename;
				try {
					output.add(new Data(filename, true));
				} catch (IOException | ParseException e) {
					e.printStackTrace();
				}
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
