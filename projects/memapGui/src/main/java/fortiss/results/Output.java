package fortiss.results;

import java.util.ArrayList;

import fortiss.components.Building;
import fortiss.gui.Designer;
import linprogMPC.TopologyConfig;
import linprogMPC.helper.DirectoryConfiguration;

/**
 * Output represents a simulation complete set of results.
 */
public class Output {
	private ArrayList<Data> output = new ArrayList<>();
	public ArrayList<String> buildingNames = new ArrayList<>();
	/**
	 * Constructor for the class Output. Populates the list array with objects of
	 * the class Data.
	 */
	public Output() {
		String location = System.getProperty("user.dir");
		String source = "/" + DirectoryConfiguration.mainDir + "/results/" + TopologyConfig.simulationName + "MPC"
				+ TopologyConfig.N_STEPS_MPC + "/";
		if (TopologyConfig.MEMAP_ON == true) {
			for (Building building: Designer.buildings) {			
				String filename = TopologyConfig.simulationName + "MPC" + TopologyConfig.N_STEPS_MPC + ".csv";
				buildingNames.add(building.getName());
				filename = location + source + filename;
				output.add(new Data(filename));
			}
		} else {
			for (Building building: Designer.buildings) {
				String filename = building.getName() + "MPC" + TopologyConfig.N_STEPS_MPC + "Solutions.csv";
				buildingNames.add(building.getName());
				filename = location + source + filename;
				output.add(new Data(filename));
			}
		}
	}

	/**
	 * Returns the number of building results data sets.
	 */
	public int size() {
		return output.size();
	}

	/**
	 * @param building the index of a building
	 * @return the data set of building.
	 */
	public Data getData(int building) {
		return output.get(building);
	}
}
