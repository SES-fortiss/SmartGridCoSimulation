package fortiss.results;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import fortiss.gui.listeners.helper.FileManager;

/**
 * Data represents a set of data
 */
public class Data {

	public ArrayList<ArrayList<Double>> values;
	public ArrayList<String> labels;

	/**
	 * Constructor for the class Data. Initializes the values lists.
	 */
	public Data(String location) {
		labels = new ArrayList<>();
		values = new ArrayList<ArrayList<Double>>();
		readData(location);
	}

	/**
	 * Reads the values from a CSV file and stores it in the corresponding lists.
	 */
	public void readData(String location) {

		NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
		 
		System.out.println(">> Reading from: " + location.toString());
		
		try (BufferedReader br = FileManager.readFromSource(location)) {
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
					values.get(i).add(nf.parse(br_values.get(i)).doubleValue());
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
