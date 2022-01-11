package memap.helper;

public class MaxBuyLimit extends Price {

	private static final String DEFAULT_FILE = "HLZFEXAMPLE";
	private static final String [] labels = { "Max Buy Limit" };
	private static final String units = "";

	public MaxBuyLimit(double price, int mpcHorizon) {
		super(price, mpcHorizon);
	}

	public MaxBuyLimit(String priceFilePath) {
		super(priceFilePath);
	}

	/** Intended for deserialization */
	public MaxBuyLimit(boolean fixed, double price, String priceFilePath, int mpcHorizon) {
		super(fixed, price, priceFilePath, mpcHorizon);
	}

	@Override
	public String[] getLabels() {
		return labels;
	}

	@Override
	public String getUnits() {
		return units;
	}

	@Override
	public String getDefaultFile() {
		return DEFAULT_FILE;
	}

}
