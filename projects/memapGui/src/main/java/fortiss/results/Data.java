package fortiss.results;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fortiss.simulation.Topology;
import memap.MemapConfig;
import memap.MemapTopology;
import memap.helper.DirectoryConfiguration;

/**
 * Data represents a building set of results.
 */
public class Data {

	public String buildingName;
	public ArrayList<ArrayList<Double>> values;
	public ArrayList<String> labels;

	/**
	 * Constructor for the class Data. Initializes the values lists.
	 */
	public Data(String buildingName) {
		this.buildingName = buildingName;
		labels = new ArrayList<>();
		values = new ArrayList<ArrayList<Double>>();
		readData(buildingName);
	}

	/**
	 * Reads the values from a CSV file and stores it in the corresponding lists.
	 */
	public void readData(String buildingName) {
		String source;
		source = "/" + DirectoryConfiguration.mainDir + "/results/" + MemapTopology.simulationName + "MPC"
				+ MemapConfig.N_STEPS_MPC + "/";
		if (MemapConfig.MEMAP_ON == true) {
			source += Topology.simulationName + "MPC" + MemapConfig.N_STEPS_MPC + ".csv";
		} else {
			source += buildingName + "MPC" + MemapConfig.N_STEPS_MPC + "Solutions.csv";
		}

		String location = System.getProperty("user.dir");
		location = location + source;
		System.out.println(">> Reading from: " + location.toString());

		try (BufferedReader br = new BufferedReader(new FileReader(location))) {
			String[] br_names = br.readLine().split(";");
			int nresult = br_names.length;

			for (int i = 0; i < nresult; i++) {
				labels.add(br_names[i]);
				values.add(new ArrayList<Double>());
			}

			String line;
			while ((line = br.readLine()) != null) {
				List<String> br_values = Arrays.asList(line.split(";"));
				for (int i = 0; i < br_values.size(); i++) {
					values.get(i).add(Double.parseDouble((br_values.get(i))));
				}
			}

			if (MemapConfig.MEMAP_ON == true) {
				labels.add(0, "timeStep");
				values.add(0, new ArrayList<Double>());
				for (int i = 0; i < values.get(1).size(); i++) {
					values.get(0).add((double) i);
				}
			}
		} catch (FileNotFoundException e) {
			System.err.println(">> Error: File not found");
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
