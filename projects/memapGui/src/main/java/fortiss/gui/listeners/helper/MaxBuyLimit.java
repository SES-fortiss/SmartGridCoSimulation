package fortiss.gui.listeners.helper;

public class MaxBuyLimit extends Price {

	private static final String DEFAULT_FILE = "HLZFEXAMPLE";
	private static final double DEFAULT_PRICE = 999.0;
	static final String [] labels = { "Max Buy Limit [kW]" };
	private static final String units = "[kW]";

	public MaxBuyLimit(double price, int mpcHorizon) {
		super(true, price, DEFAULT_FILE, mpcHorizon);
	}

	public MaxBuyLimit(String priceFilePath, int mpcHorizon) {
		super(false, DEFAULT_PRICE, priceFilePath, mpcHorizon);
	}
	
	/** Intended for deserialization */
	public MaxBuyLimit(boolean fixed, double price, String priceFilePath, int mpcHorizon) {
		super(fixed, price, priceFilePath, mpcHorizon);
	}

	@Override
	public String getUnits() {
		return units;
	}

	@Override
	public String[] getLabels() {
		return labels;
	}

	@Override
	public String getDefaultFile() {
		return DEFAULT_FILE;
	}
	
}
