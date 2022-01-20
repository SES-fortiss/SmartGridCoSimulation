package memap.helper;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import memap.examples.ExampleFiles;
import memap.helper.profilehandler.Interpolation;
import memap.main.SimulationProgress;
import memap.main.Status;
import memap.main.TopologyConfig;

public abstract class Price {

	private ArrayList<Double> prices;

	/**
	 * Intended for deserialization
	 * 
	 * @param price         given / default fixed price
	 * @param priceFilePath given / default price file path
	 * 
	 *                      Note a DEFAULT_FILE is used in case a given
	 *                      priceFilePath is null. If the object is created as a
	 *                      fixed price, the DEFAULT_FILE and priceFilePath will be
	 *                      equal until the user provides a different file.
	 */
	public Price(boolean fixed, double price, String priceFilePath, int mpcHorizon) {
		if (fixed) {
			setDataFromValue(mpcHorizon, price);
		} else {
			setDataFromFile(priceFilePath);
		}
	}

	public Price(double price, int mpcHorizon) {
		setDataFromValue(mpcHorizon, price);
	}

	public Price(String priceFilePath) {
		setDataFromFile(priceFilePath);
	}

	protected void setDataFromValue(int mpcStep, double price) {
		prices = new ArrayList<Double>(Collections.nCopies(mpcStep * 2, price));
	}

	protected void setDataFromFile(String priceFilePath) {
		FileManager mgr = new FileManager();
		ExampleFiles examples = new ExampleFiles();
		try {
			if (examples.isExample(priceFilePath)) {
				prices = read(mgr.readFromResources(examples.getFile(priceFilePath)));
			} else {
				prices = read(mgr.readFromSource(priceFilePath));
			}
		} catch (IOException | ParseException e) {
			SimulationProgress.getInstance().setStatus(Status.ERROR, "Error parsing or reading price file");
		}

	}

	public double getPriceForTimeStep(int timeStep) {
		return prices.get(timeStep % prices.size());
	}

	abstract public String[] getLabels();

	abstract public String getUnits();

	abstract public String getDefaultFile();

	protected ArrayList<Double> read(BufferedReader bufferedReader) throws IOException, ParseException {
		ArrayList<Double> prices = new ArrayList<Double>();

		/*
		 * the current logic: - x should represent the step length in the data file
		 * (intrinsic knowledge) - y should represent the price related to x - xi should
		 * represent the selected time step in the simulation - yi should represent the
		 * price related to xi
		 */

		NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);

		double stepLenghtInHours = TopologyConfig.getInstance().getStepLengthInHours();
		ArrayList<Double> originalValues = new ArrayList<Double>();
		String row;

		while ((row = bufferedReader.readLine()) != null) {

			if (row.charAt(0) != '#') // skipping the header which starts with '#'
			{
				List<String> br_values = Arrays.asList(row.split(";"));
				originalValues.add(nf.parse(br_values.get(2)).doubleValue());
			}

			// TODO add the time information, i.e. LocalDateTime: We can use TimedData and
			// UntimedData structures.
		}

		double[] x = new double[originalValues.size()];
		double[] y = new double[originalValues.size()];
		for (int i = 0; i < originalValues.size(); i++) {
			x[i] = i / 4.0;
			y[i] = originalValues.get(i);
		}

		int mpcSteps = y.length - 1;

		double[] xi = new double[mpcSteps];
		for (int j = 0; j < mpcSteps; j++) {
			xi[j] = j * stepLenghtInHours;
		}

		double[] yi = Interpolation.interpLinear(x, y, xi);
		for (int k = 0; k < yi.length; k++) {
			prices.add(yi[k]);
		}
		bufferedReader.close();

		return prices;
	}

}
