package fortiss.gui.listeners.helper;

public class CO2Emission extends Price {

	private static final String DEFAULT_FILE = "HEATPRICEEXAMPLE";
	private static final double DEFAULT_PRICE = 0.139;
	static final String [] labels = { "Emissions [kg CO2]" };
	private static final String units = "[kg CO2]";

	public CO2Emission(double price, int mpcHorizon) {
		super(true, price, DEFAULT_FILE,mpcHorizon);
	}

	public CO2Emission(String priceFilePath, int mpcHorizon) {
		super(false, DEFAULT_PRICE, priceFilePath, mpcHorizon);
	}
	
	/** Intended for deserialization */
	public CO2Emission(boolean fixed, double price, String priceFilePath, int mpcHorizon) {
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
