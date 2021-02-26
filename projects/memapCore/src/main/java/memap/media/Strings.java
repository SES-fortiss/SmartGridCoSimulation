package memap.media;

public class Strings {
	
	// General strings
	public static final String  memapOnModeName = "MEMAP";
	public static final String  memapOffModeName = "Per building optimization";
	
	// Result names
	public static final String timeStep = "Time step";
	public static final String heatDemand = "System heat demand";
	public static final String electricityDemand = "System electricity demand";
	public static final String energyPrice = "Energy price";
	public static final String totalCost = "Total cost";
	public static final String co2Emissions = "CO2 emissions";
	public static final String elecBuy = "ElecBuy";
	public static final String elecSell = "ElecSell";
	
	// Result names + units
	public static final String elecBuyingPriceAndUnit = "Electricity buying price [EUR/kWh]";
	public static final String elecSellingPriceAndUnit = "Electricity selling price [EUR/kWh]";
	public static final String heatBuyingPriceAndUnit = "Heat buying price [EUR/kg CO2]";
	public static final String totalCostAndUnit = "Total cost [EUR]";
	public static final String co2EmissionsAndUnit = "CO2 emissions [kg CO2]";
	
	// Units
	public static final String costsUnit = "EUR";
	public static final String co2EmissionsUnit = "kg CO2";
	public static final String energyUnit = "kWh";
	public static final String powerUnit = "kW";
	
	// Other
	public static final String performancePanelName = "Performance";
	
	// File-related
	public static final String solutionFileSuffix = "_Solutions.csv";
	public static final String overviewFileSuffix = "_Overview.csv";
	public static final String lpSolutionFileSuffix = "_LP" + solutionFileSuffix;
	public static final String lpOverviewFileSuffix = "_LP" + overviewFileSuffix;
	public static final String milpSolutionFileSuffix = "_MILP" + solutionFileSuffix;
	public static final String milpOverviewFileSuffix = "_MILP" + overviewFileSuffix;
	
}
