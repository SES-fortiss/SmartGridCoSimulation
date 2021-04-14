package fortiss.gui.listeners.helper;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;

import com.google.gson.annotations.Expose;

import memap.examples.ExampleFiles;
import memap.helper.DataInterface;
import memap.helper.TimedDataAdapter;
import memap.helper.UntimedData;
import memap.helper.profilehandler.TimedData;

public abstract class Price {
	@Expose
	private boolean fixed;
	@Expose
	private double price;
	@Expose
	private String priceFilePath;

	private DataInterface fixedPriceData;
	private DataInterface variablePriceData;

	/**
	 * @param price         given / default fixed price
	 * @param priceFilePath given / default price file path
	 * 
	 *                      Note a DEFAULT_FILE is used in case a given
	 *                      priceFilePath is null. If the object is created as a
	 *                      fixed price, the DEFAULT_FILE and priceFilePath will be
	 *                      equal until the user provides a different file.
	 */
	public Price(boolean fixed, double price, String priceFilePath, int mpcHorizon) {
		setFixed(fixed);
		setPrice(price, mpcHorizon);
		setPriceFilePath(priceFilePath);

		if (priceFilePath == null) {
			priceFilePath = getDefaultFile();
		}
	}

	public boolean isFixed() {
		return fixed;
	}

	public void setFixed(boolean fixed) {
		this.fixed = fixed;
	}

	/** Intended for GUI compatibility */
	public String getPriceString() {
		String priceString = null;
		if (isFixed()) {
			priceString = String.valueOf(price);
		} else {
			priceString = priceFilePath;
		}
		return priceString;
	}

	public DataInterface getPrices() {
		DataInterface priceData;
		if (fixed) {
			priceData = fixedPriceData;
		} else {
			priceData = variablePriceData;
		}
		return priceData;
	}

	public void setDataFromValue(int mpcStep) {
		fixedPriceData = new UntimedData();
		ArrayList<Double> values = new ArrayList<Double>(
				Collections.nCopies(mpcStep * 2, price));
		((UntimedData) fixedPriceData).addSeries("price", values);
	}

	public void setDataFromFile() {

		if (priceFilePath == null || priceFilePath.isEmpty()) {
			priceFilePath = getDefaultFile(); // Load empty data
		}

		try {
			FileManager fm = new FileManager();
			ExampleFiles ef = new ExampleFiles();
			if (ef.isExample(priceFilePath)) {
				variablePriceData = new TimedDataAdapter(
						new TimedData(fm.readFromResources(ef.getFile(priceFilePath)), getLabels()));
			} else {
				variablePriceData = new TimedDataAdapter(new TimedData(fm.readFromSource(priceFilePath), getLabels()));
			}
		} catch (IOException | ParseException e) {
			e.printStackTrace();
			priceFilePath = ""; // Fix path and load empty data
		}
	}

	public void updateMPCHorizon(int mpcHorizon) {
		setPrice(price, mpcHorizon);
	}
	
	public void setPrice(double price, int mpcHorizon) {
		this.price = price;
		setDataFromValue(mpcHorizon);
	}

	public void setPriceFilePath(String priceFilePath) {
		this.priceFilePath = priceFilePath;
		setDataFromFile();
	}

	abstract public String[] getLabels();

	abstract public String getUnits();

	abstract public String getDefaultFile();

	/**
	 * Initialize parameters that are bypassed when the model is loaded from a JSON
	 * file
	 */
	public void loadFromFile(int mpcHorizon) {
		setDataFromValue(mpcHorizon);
		setDataFromFile();
	}
}
