package memap.helper;

public class HeatPrice extends Price {

	private static final String DEFAULT_FILE = "HEATPRICEEXAMPLE";
	static final String [] labels = { "Price [EUR/kg CO2]" };
	private static final String units = "[EUR/kg CO2]";

	public HeatPrice(double price, int mpcHorizon) {
		super(price, mpcHorizon);
	}

	public HeatPrice(String priceFilePath, int mpcHorizon) {
		super(priceFilePath);
	}
	
	/** Intended for deserialization */
	public HeatPrice(boolean fixed, double price, String priceFilePath, int mpcHorizon) {
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
