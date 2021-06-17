package memap.helper.JsonExportHelper;

import com.google.gson.annotations.Expose;

public class PriceJsonHelper {
	@Expose
	private boolean fixed;
	@Expose
	private double price;
	@Expose
	private String priceFilePath;

	public PriceJsonHelper(boolean fixed, double price, String priceFilePath, int mpcHorizon) {
		setFixed(fixed);
		setPrice(price, mpcHorizon);
		setPriceFilePath(priceFilePath);
	}

	public boolean isFixed() {
		return fixed;
	}

	public void setFixed(boolean fixed) {
		this.fixed = fixed;
	}
	
	public void setPrice(double price, int mpcHorizon) {
		this.price = price;
	}

	public void setPriceFilePath(String priceFilePath) {
		this.priceFilePath = priceFilePath;
	}
}
