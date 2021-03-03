package fortiss.biminterface;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BimModelDataResponse {
	
	@SerializedName("objectId")
	@Expose
	public Integer objectId;
	@SerializedName("name")
	@Expose
	public String name;
	@SerializedName("properties")
	@Expose
	public Properties properties;	
	
	class Properties {
		@SerializedName("Energieanalyse")
		@Expose
		public Energieanalyse energieanalyse;
	}
	
	class Energieanalyse {		
		@SerializedName("Bezugsenergie")
		@Expose
		public String bezugsenergie;
		@SerializedName("Leistungsbereich/Energie")
		@Expose
		public String leistungsbereichEnergie;
		@SerializedName("Wirkungsgrad (Gesamt)")
		@Expose
		public String wirkungsgradGesamt;
		@SerializedName("Zielenergie")
		@Expose
		public String zielenergie;
		@SerializedName("Network Type_Strom")
		@Expose
		public String networkTypeStrom;
		@SerializedName("Network Type_W\u00e4rme")
		@Expose
		public String networkTypeWRme;
		@SerializedName("Installed capacity")
		@Expose
		public String installedCapacity;
		@SerializedName("State of charge")
		@Expose
		public String stateOfCharge;
		@SerializedName("Max. Charge rate")
		@Expose
		public String maxChargeRate;
		@SerializedName("Min. Discharge rate")
		@Expose
		public String minDischargeRate;
		@SerializedName("Charge efficiency")
		@Expose
		public String chargeEfficiency;
		@SerializedName("Discharge Efficiency")
		@Expose
		public String dischargeEfficiency;
		@SerializedName("Minimum power")
		@Expose
		public String minimumPower;
		@SerializedName("Maximum power")
		@Expose
		public String maximumPower;
		@SerializedName("Primary Network Efficiency")
		@Expose
		public String primaryNetworkEfficiency;
		@SerializedName("Secondary Network Efficiency")
		@Expose
		public String secondaryNetworkEfficiency;
		@SerializedName("Cost")
		@Expose
		public String cost;
		@SerializedName("CO2 Emissions")
		@Expose
		public String cO2Emissions;
		@SerializedName("Forecast file")
		@Expose
		public String forecastFile;
		@SerializedName("Consumption profile")
		@Expose
		public String consumptionProfile;
		@SerializedName("Leistung Heizung")
		@Expose
		public String leistungHeizung;
		@SerializedName("API-Komponententyp")
		@Expose
		public String aPIKomponententyp;

}
}

