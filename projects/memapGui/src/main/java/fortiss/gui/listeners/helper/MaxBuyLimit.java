package fortiss.gui.listeners.helper;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;

import com.google.gson.annotations.Expose;

import fortiss.simulation.PlanningTool;
import memap.examples.ExampleFiles;
import memap.helper.DataInterface;
import memap.helper.TimedDataAdapter;
import memap.helper.UntimedData;
import memap.helper.profilehandler.TimedData;

public class MaxBuyLimit {

	private static final String DEFAULT_FILE = "HLZFEXAMPLE";
	private static final double DEFAULT_PRICE = 1.0;
	static final String [] labels = { "Maximum Buy Limit for MEMAP" };
	private static final String units = "";	
	
	@Expose
	private boolean fixed;
	@Expose
	private double limit;
	@Expose
	private String limitFilePath;
	private int mpcHorizon;
	
	private DataInterface fixedLimitData;
	private DataInterface variableLimitData;

	public MaxBuyLimit(double price, int mpcHorizon) {
		this.setFixed(true);
		this.limit = price;
		this.limitFilePath = DEFAULT_FILE;
		this.mpcHorizon = mpcHorizon;		
	}

	public MaxBuyLimit(String priceFilePath, int mpcHorizon) {
		this.setFixed(true);
		this.limit = DEFAULT_PRICE;
		this.limitFilePath = priceFilePath;
		this.mpcHorizon = mpcHorizon;	
	}
	
	/** Intended for deserialization */
	public MaxBuyLimit(boolean fixed, double limit, String limitFilePath, int mpcHorizon) {
		this.setFixed(fixed);
		this.limit = limit;
		this.limitFilePath = limitFilePath;
		this.mpcHorizon = mpcHorizon;
	}

	public String getUnits() {
		return units;
	}

	public String[] getLabels() {
		return labels;
	}

	public String getDefaultFile() {
		return DEFAULT_FILE;
	}

	public void updateMPCHorizon(int mpcHorizon2) {
		this.mpcHorizon = mpcHorizon2;		
	}

	public int getMpcHorizon() {
		return mpcHorizon;
	}
	
	public void loadFromFile(int mpcHorizon) {
		setDataFromValue(mpcHorizon);
		setDataFromFile();
	}
	
	public void setDataFilePath(String priceFilePath) {
		this.limitFilePath = priceFilePath;
		setDataFromFile();
		setSaved(false);
	}
	
	public void setDataFromValue(int mpcStep) {
		fixedLimitData = new UntimedData();
		
		ArrayList<Double> values = new ArrayList<Double>(
				Collections.nCopies(mpcStep * 2, limit));
		
		((UntimedData) fixedLimitData).addSeries("limit", values);
	}
	
	public void setDataFromFile() {

		if (limitFilePath == null || limitFilePath.isEmpty()) {
			limitFilePath = getDefaultFile(); // Load empty data
		}

		try {
			FileManager fm = new FileManager();
			ExampleFiles ef = new ExampleFiles();
			if (ef.isExample(limitFilePath)) {
				variableLimitData = new TimedDataAdapter(
						new TimedData(fm.readFromResources(ef.getFile(limitFilePath)), getLabels()));
			} else {
				variableLimitData = new TimedDataAdapter(new TimedData(fm.readFromSource(limitFilePath), getLabels()));
			}
		} catch (IOException | ParseException e) {
			e.printStackTrace();
			limitFilePath = ""; // Fix path and load empty data
		}
	}

	public DataInterface getVariableLimitData() {
		return variableLimitData;
	}
	
	public boolean isFixed() {
		return fixed;
	}
	
	public String getLimitString() {
		String priceString = null;
		if (isFixed()) {
			priceString = String.valueOf(limit);
		} else {
			priceString = limitFilePath;
		}
		return priceString;
	}
	
	public DataInterface getLimit() {
		DataInterface data;
		if (fixed) {
			data = fixedLimitData;
		} else {
			data = variableLimitData;
		}
		return data;
	}

	public void setFixed(boolean fixed) {
		this.fixed = fixed;
	}
	
	public void setSaved(boolean saved) {
		PlanningTool.getInstance().setSaved(saved);
	}
	
	public void setLimit(double price, int mpcHorizon) {
		this.limit = price;
		setDataFromValue(mpcHorizon);
		setSaved(false);
	}
	
}
