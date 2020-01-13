package fortiss.datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
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

	private ArrayList<ArrayList<Double>> seriesList;
	private ArrayList<String> labelList;

	/**
	 * Constructor for the class Data. Initializes the seriesList lists.
	 * @throws ParseException 
	 * @throws IOException 
	 */
	public Data(String location, boolean hasHeader) throws IOException, ParseException {
		setLabelList(new ArrayList<>());
		setSeriesList(new ArrayList<ArrayList<Double>>());
		readData(location, hasHeader);
	}

	public Data() {
		
		setLabelList(new ArrayList<>());
		setSeriesList(new ArrayList<ArrayList<Double>>());
		
		String pathToInternal = "resources/" + "consumptionExample1.csv";				
		ClassLoader classLoader = getClass().getClassLoader();
		URL resource = classLoader.getResource(pathToInternal);
		File file = new File(resource.getFile());
		BufferedReader br = null;
		
        try {
        	FileReader reader = new FileReader(file);
        	br = new BufferedReader(reader);        	
            createSeries(br, false);
        } catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Reads the seriesList from a CSV file and stores it in the corresponding lists.
	 * @throws ParseException 
	 * @throws IOException 
	 */
	public void readData(String location, boolean hasHeader) throws IOException, ParseException {
		System.out.println(">> Reading from: " + location.toString());
		BufferedReader br = FileManager.readDataFromSource(location);		
		createSeries(br, hasHeader);		
	}

	private void createSeries(BufferedReader br, boolean hasHeader)
			throws IOException, ParseException {
		
		NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
		String[] br_names = br.readLine().split(";");
		int nresult = br_names.length;

		if (!hasHeader) {
			for (int i = 0; i < nresult; i++) {
				getLabelList().add("Series" + (i + 1));
				getSeriesList().add(new ArrayList<Double>());
			}
		} else {
			for (int i = 0; i < nresult; i++) {
				getLabelList().add(br_names[i]);
				getSeriesList().add(new ArrayList<Double>());
			}
		}

		String line;
		while ((line = br.readLine()) != null) {
			List<String> br_values = Arrays.asList(line.split(";"));
			for (int i = 0; i < br_values.size(); i++) {
				getSeriesList().get(i).add(nf.parse(br_values.get(i)).doubleValue());
			}
		}
	}

	/**
	 * @param index the index of a series in data object
	 * @return a label in data object
	 */
	public String getLabel(int index) {
		return labelList.get(index);
	}

	/**
	 * @param index the index of a series in data object
	 * @return a series in data object
	 */
	public ArrayList<Double> getSeries(int index) {
		System.out.println("Data getSeries(int index): " + seriesList.get(index));
		
		return seriesList.get(index);
	}

	/**
	 * @param label the label of the series whose index is requested
	 * @return the index a series in data object
	 */
	public int getIndexOf(String label) {
		return labelList.indexOf(label);
	}

	/**
	 * @return number of series in data object
	 */
	public int getNumOfSeries() {
		return seriesList.size();
	}

	/**
	 * @return list of labels in data object
	 */
	public ArrayList<String> getLabelList() {
		return labelList;
	}

	/**
	 * set list of labels
	 */
	public void setLabelList(ArrayList<String> labels) {
		this.labelList = labels;
	}

	/**
	 * @return list of series in data object
	 */
	public ArrayList<ArrayList<Double>> getSeriesList() {
		return seriesList;
	}

	/**
	 * set list of series
	 */
	public void setSeriesList(ArrayList<ArrayList<Double>> values) {
		this.seriesList = values;
	}
}
