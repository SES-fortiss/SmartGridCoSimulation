package fortiss.results;

import java.util.ArrayList;

import fortiss.gui.Designer;

/**
 * Output represents a simulation complete set of results.
 */
public class Output {
	private ArrayList<Data> output = new ArrayList<>();

	/**
	 * Constructor for the class Output. Populates the list array with objects of
	 * the class Data.
	 */
	public Output() {
		for (int i = 0; i < Designer.buildingCount; i++) {
			output.add(new Data(Designer.buildings.get(i).getName()));
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
