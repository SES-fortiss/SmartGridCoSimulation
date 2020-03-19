package fortiss.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/**
 * Data represents a set of data series of any kind read from a CSV. 
 */
public class Data {

	private Map<String, ArrayList<Double>> dataset = new LinkedHashMap<String, ArrayList<Double>>();

	/**
	 * Constructor for the class Data.
	 * 
	 * @param br        a BufferedReader
	 * @param hasHeader a boolean. <code>true</code> if the CSV file has a header
	 * @throws ParseException
	 * @throws IOException
	 */
	public Data(BufferedReader br, boolean hasHeader) throws IOException, ParseException {
		createSeries(br, hasHeader);
	}

	/**
	 * Reads the seriesList from a CSV file and stores it in the corresponding
	 * lists.
	 * 
	 * @throws ParseException
	 * @throws IOException
	 */
	private void createSeries(BufferedReader br, boolean hasHeader) throws IOException, ParseException {

		NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
		String[] br_names = br.readLine().split(";");
		int nresult = br_names.length;

		if (!hasHeader) {
			for (int i = 0; i < nresult; i++) {
				br_names[i] = "Series" + (i + 1);
				dataset.put(br_names[i], new ArrayList<Double>());
			}
		} else {
			for (int i = 0; i < nresult; i++) {
				dataset.put(br_names[i], new ArrayList<Double>());
			}

		}

		String line;
		while ((line = br.readLine()) != null) {
			List<String> br_values = Arrays.asList(line.split(";"));
			for (int i = 0; i < br_values.size(); i++) {
				dataset.get(br_names[i]).add(nf.parse(br_values.get(i)).doubleValue());
			}
		}
	}

	/**
	 * @param seriesName a series name
	 * @return a series in data object
	 */
	public ArrayList<Double> getSeries(String seriesName) {
		return dataset.get(seriesName);
	}

	/**
	 * @return number of series in data set
	 */
	public int getNumOfSeries() {
		return dataset.size();
	}

	/**
	 * @return a set series names in the data set
	 */
	public Set<String> getSeriesList() {
		return dataset.keySet();
	}

}
