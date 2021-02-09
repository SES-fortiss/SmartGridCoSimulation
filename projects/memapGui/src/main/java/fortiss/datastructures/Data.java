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
 * It assumes that the data corresponds to a name and an arraylist of doubles.
 */
public class Data {

	public static final String BYROW = "by row";
	public static final String BYCOLUMN = "by column";

	private Map<String, ArrayList<Double>> dataset = new LinkedHashMap<String, ArrayList<Double>>();

	/**
	 * Constructor for the class Data.
	 * 
	 * @param br        a BufferedReader
	 * @param hasHeader a boolean. <code>true</code> if the CSV file has a header
	 * @param readMode  either {@link Data#BYCOLUMN} or {@link Data#BYROW}
	 * @throws ParseException
	 * @throws IOException
	 */
	public Data(BufferedReader br, boolean hasHeader, String readMode) throws IOException, ParseException {
		if (readMode.equals(BYCOLUMN)) {
			readByColumn(br, hasHeader);
		} else if (readMode.equals(BYROW)) {
			readByRow(br, hasHeader);
		} else {
			throw new IllegalArgumentException("Unsupported read mode");
		}
	}

	/**
	 * Reads the column-wise stored series from a CSV file and stores it in the
	 * corresponding lists.
	 * 
	 * @throws ParseException
	 * @throws IOException
	 */
	private void readByColumn(BufferedReader br, boolean hasHeader) throws IOException, ParseException {

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
	 * Reads the row-wise stored series from a CSV file and stores it in the corresponding
	 * lists.
	 * 
	 * @throws ParseException
	 * @throws IOException
	 */
	private void readByRow(BufferedReader br, boolean hasHeader) throws IOException, ParseException {

		NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
		String line;
		while ((line = br.readLine()) != null) {
			
			List<String> series = Arrays.asList(line.split(";"));
			dataset.put(series.get(0), new ArrayList<Double>());

			for (int i = 1; i < series.size(); i++) {
				dataset.get(series.get(0)).add(nf.parse(series.get(i)).doubleValue());
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
