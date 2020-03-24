package fortiss.results;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.knowm.xchart.CategorySeries;

import fortiss.components.Building;
import fortiss.components.Controllable;
import fortiss.components.Coupler;
import fortiss.components.Storage;
import fortiss.components.Volatile;
import fortiss.gui.DesignerPanel;

public class MILPMetricsGenerator implements MetricsGenerator {

	private ResultsLibrary detailedResult;
	private ResultsLibrary overviewResult;
	private final static String HEAT_PRODUCTION_BY_SOURCE_IN_TIME = "Heat production by source in time";
	private final static String ELECTRICITY_PRODUCTION_BY_SOURCE_IN_TIME = "Electricity production by source in time";
	private final static String HEAT_DISCHARGE_BY_SOURCE_IN_TIME = "Heat discharge by source in time";
	private final static String ELECTRICITY_DISCHARGE_BY_SOURCE_IN_TIME = "Electricity discharge by source in time";

	public MILPMetricsGenerator(ResultsLibrary detailedResult, ResultsLibrary overviewResult) {
		this.detailedResult = detailedResult;
		this.overviewResult = overviewResult;
	}

	@Override
	public void populateMetricsPanels(HashMap<String, MetricsPanel> metricsPanelMap) {

		double globalOptimizationCost = 0;
		double globalOptimizationCo2Emissions = 0;
		double perBuildingOptimizationCost = 0;
		double perBuildingOptimizationCo2Emissions = 0;

		// Savings calculation
		for (Entry<String, MetricsPanel> context : metricsPanelMap.entrySet()) {
			String contextName = context.getKey();

			ArrayList<Double> cost = detailedResult.getDataSeries(contextName, "Total costs [EUR]");
			ArrayList<Double> co2emissions = detailedResult.getDataSeries(contextName, "CO2 emissions [kg CO2/kWh]");

			// Add optimization-specific metrics
			if (contextName.equals("Global optimization")) {
				globalOptimizationCost = cost.get(cost.size() - 1);
				globalOptimizationCo2Emissions = co2emissions.get(cost.size() - 1);
			} else {
				perBuildingOptimizationCost += cost.get(cost.size() - 1);
				perBuildingOptimizationCo2Emissions += co2emissions.get(cost.size() - 1);
			}
		}

		// Comparative figures: added to global optimization panel
		double savedCost = perBuildingOptimizationCost - globalOptimizationCost;
		String costQualifier = (savedCost > 0) ? "reduction" : "enlargement";
		metricsPanelMap.get("Global optimization").addTextWidget("Cost " + costQualifier, Double.toString(savedCost),
				"EUR", null);

		double savedCo2 = perBuildingOptimizationCo2Emissions - globalOptimizationCo2Emissions;
		String co2Qualifier = (savedCo2 > 0) ? "reduction" : "enlargement";
		metricsPanelMap.get("Global optimization").addTextWidget("CO2 Emissions " + co2Qualifier,
				Double.toString(savedCo2), "kg CO2/kWh", null);

		// Add specific metrics
		for (Entry<String, MetricsPanel> context : metricsPanelMap.entrySet()) {
			String contextName = context.getKey();
			MetricsPanel contextPanel = metricsPanelMap.get(context.getKey());

			// Add optimization-specific metrics
			if (contextName.equals("Global optimization")) {
				populateGlobalOptimizationMetrics(contextName, contextPanel);
			} else {
				populatePerBuildingOptimizationMetrics(contextName, contextPanel);
			}
		}
	}

	/**
	 * Populates the global optimization panel with metrics. These include building
	 * metrics within the global optimization context
	 * 
	 * @param contextName  the name of the metrics panel of the global optimization
	 * @param contextPanel the metrics panel of the global optimization
	 */
	private void populateGlobalOptimizationMetrics(String contextName, MetricsPanel contextPanel) {

		// Time steps
		ArrayList<Double> time = detailedResult.getDataSeries(contextName, "Time step");

		HashMap<String, ArrayList<Double>> heatProductionByBuildingInTime = new HashMap<String, ArrayList<Double>>();
		HashMap<String, ArrayList<Double>> electricityProductionByBuildingInTime = new HashMap<String, ArrayList<Double>>();
		HashMap<String, Number> heatProductionByBuilding = new HashMap<String, Number>();
		HashMap<String, Number> electricityProductionByBuilding = new HashMap<String, Number>();
		HashMap<String, Number> heatProductionBySource = new HashMap<String, Number>();
		HashMap<String, Number> electricityProductionBySource = new HashMap<String, Number>();
		HashMap<String, Number> energyProductionBySource = new HashMap<String, Number>();
		HashMap<String, Number> heatDischargeByStorage = new HashMap<String, Number>();
		HashMap<String, Number> electricityDischargeByStorage = new HashMap<String, Number>();

		for (Entry<String, Building> buildingEntry : DesignerPanel.buildings.entrySet()) {
			Building building = buildingEntry.getValue();
			HashMap<String, HashMap<String, ArrayList<Double>>> energyContributedBySource = calculateEnergyContributedBySource(
					contextName, building);

			HashMap<String, ArrayList<Double>> heatProductionBySourceInTime = energyContributedBySource
					.get(HEAT_PRODUCTION_BY_SOURCE_IN_TIME);
			HashMap<String, ArrayList<Double>> electricityProductionBySourceInTime = energyContributedBySource
					.get(ELECTRICITY_PRODUCTION_BY_SOURCE_IN_TIME);
			HashMap<String, ArrayList<Double>> heatDischargedBySourceInTime = energyContributedBySource
					.get(HEAT_DISCHARGE_BY_SOURCE_IN_TIME);
			HashMap<String, ArrayList<Double>> electricityDischargedBySourceInTime = energyContributedBySource
					.get(ELECTRICITY_DISCHARGE_BY_SOURCE_IN_TIME);

			// Energy discharge by storage
			for (Entry<String, ArrayList<Double>> componentEntry : heatDischargedBySourceInTime.entrySet()) {
				String componentName = componentEntry.getKey();
				double heat = sum(heatDischargedBySourceInTime.get(componentName));
				double electricity = sum(electricityDischargedBySourceInTime.get(componentName));
				heatDischargeByStorage.put(componentEntry.getKey(), heat);
				electricityDischargeByStorage.put(componentEntry.getKey(), electricity);
			}

			// Energy production by source
			for (Entry<String, ArrayList<Double>> componentEntry : heatProductionBySourceInTime.entrySet()) {
				String componentName = componentEntry.getKey();
				double heat = sum(heatProductionBySourceInTime.get(componentName));
				double electricity = sum(electricityProductionBySourceInTime.get(componentName));
				heatProductionBySource.put(componentEntry.getKey(), heat);
				electricityProductionBySource.put(componentEntry.getKey(), electricity);
				energyProductionBySource.put(componentEntry.getKey(), heat + electricity);
			}

			// Energy production by building
			ArrayList<Double> heatProductionInTime = new ArrayList<Double>(Collections.nCopies(time.size(), 0.0));
			ArrayList<Double> electricityProductionInTime = new ArrayList<Double>(
					Collections.nCopies(time.size(), 0.0));

			for (Entry<String, ArrayList<Double>> componentEntry : heatProductionBySourceInTime.entrySet()) {
				ArrayList<Double> heatProduced = componentEntry.getValue();
				for (int i = 0; i < heatProduced.size(); i++) {
					heatProductionInTime.set(i, heatProductionInTime.get(i) + heatProduced.get(i));
				}
			}

			for (Entry<String, ArrayList<Double>> componentEntry : electricityProductionBySourceInTime.entrySet()) {
				ArrayList<Double> electricityProduced = componentEntry.getValue();
				for (int i = 0; i < electricityProduced.size(); i++) {
					electricityProductionInTime.set(i, electricityProductionInTime.get(i) + electricityProduced.get(i));
				}
			}

			heatProductionByBuildingInTime.put(building.getName(), heatProductionInTime);
			electricityProductionByBuildingInTime.put(building.getName(), electricityProductionInTime);
			heatProductionByBuilding.put(building.getName(), sum(heatProductionInTime));
			electricityProductionByBuilding.put(building.getName(), sum(electricityProductionInTime));
		}

		// Total energy produced in time
		ArrayList<Double> totalHeatProductionInTime = new ArrayList<Double>(Collections.nCopies(time.size(), 0.0));
		ArrayList<Double> totalElectricityProductionInTime = new ArrayList<Double>(
				Collections.nCopies(time.size(), 0.0));

		for (Entry<String, ArrayList<Double>> entry : heatProductionByBuildingInTime.entrySet()) {
			ArrayList<Double> heatProduced = entry.getValue();
			for (int i = 0; i < entry.getValue().size(); i++) {
				totalHeatProductionInTime.set(i, totalHeatProductionInTime.get(i) + heatProduced.get(i));
			}
		}

		for (Entry<String, ArrayList<Double>> entry : electricityProductionByBuildingInTime.entrySet()) {
			ArrayList<Double> electricityProduced = entry.getValue();
			for (int i = 0; i < entry.getValue().size(); i++) {
				totalElectricityProductionInTime.set(i,
						totalElectricityProductionInTime.get(i) + electricityProduced.get(i));
			}
		}

		// Total energy demanded
		ArrayList<Double> electricityDemandInTime = detailedResult.getDataSeries(contextName, "Electricity demand");
		double totalElectricityDemand = electricityDemandInTime.stream().mapToDouble(Double::doubleValue).sum();

		ArrayList<Double> heatDemandInTime = detailedResult.getDataSeries(contextName, "Heat demand");
		double totalHeatDemand = heatDemandInTime.stream().mapToDouble(Double::doubleValue).sum();

		// Total energy produced
		double totalHeatProduced = sum(totalHeatProductionInTime);
		double totalElectricityProduced = sum(totalElectricityProductionInTime);

		// Total cost of entry
		ArrayList<Double> cost = detailedResult.getDataSeries(contextName, "Total costs [EUR]");
		double totalCost = cost.get(cost.size() - 1);

		// Total CO2 emissions of entry
		ArrayList<Double> co2emissions = detailedResult.getDataSeries(contextName, "CO2 emissions [kg CO2/kWh]");
		double totalCo2emissions = co2emissions.get(cost.size() - 1);

		// Text widget: Energy demanded
		contextPanel.addTextWidget("Heat demanded", new DecimalFormat("#.0##").format(totalHeatDemand), "kWH", null);
		contextPanel.addTextWidget("Electricity demanded", new DecimalFormat("#.0##").format(totalElectricityDemand),
				"kWH", null);

		// Text widget: Energy produced
		contextPanel.addTextWidget("Heat produced", new DecimalFormat("#.0##").format(totalHeatProduced), "kWH",
				"* Storages are not considered energy producers");
		contextPanel.addTextWidget("Electricity produced", new DecimalFormat("#.0##").format(totalElectricityProduced),
				"kWH", "* Storages are not considered energy producers");

		// Text widget: Energy contributed: includes storage discharged energy
		contextPanel.addTextWidget("Heat contributed",
				new DecimalFormat("#.0##").format(totalHeatProduced + sum(heatDischargeByStorage.values())), "kWH",
				"* Storage contributions are included");
		contextPanel.addTextWidget("Electricity contributed",
				new DecimalFormat("#.0##").format(totalElectricityProduced), "kWH",
				"* Storage contributions are included");

		// Text widget: Total cost (EUR and CO2)
		contextPanel.addTextWidget("Total cost", new DecimalFormat("#.0##").format(totalCost), "EUR", null);
		contextPanel.addTextWidget("Total CO2 Emissions", new DecimalFormat("#.0##").format(totalCo2emissions),
				"kg CO2/kWh", null);

		// Bar widget: Energy produced vs demanded per time step
		List<CategorySeries> energySeries = new ArrayList<CategorySeries>();
		energySeries.add(new CategorySeries("Electricity Demand ", time, electricityDemandInTime, null, null));
		energySeries
				.add(new CategorySeries("Electricity Production", time, totalElectricityProductionInTime, null, null));
		energySeries.add(new CategorySeries("Heat Demand ", time, heatDemandInTime, null, null));
		energySeries.add(new CategorySeries("Heat Production", time, totalHeatProductionInTime, null, null));
		contextPanel.addBarPlotWidget("Energy produced and demanded", "Forecasted time [time steps]",
				"Electricity [kWh]", 400, 400, energySeries, "* Storages are not considered energy producers");

		// Pie widget: Energy contributed by storage
		contextPanel.addPiePlotWidget("Heat contributed by storage", 400, 400, heatDischargeByStorage, null);
		contextPanel.addPiePlotWidget("Electricity contributed by storage", 400, 400, electricityDischargeByStorage,
				null);

		// Pie widget: Energy produced by type
		HashMap<String, Number> energyProductionByType = new HashMap<String, Number>();
		energyProductionByType.put("Electricity", totalElectricityProduced);
		energyProductionByType.put("Heat", totalHeatProduced);
		contextPanel.addPiePlotWidget("Energy produced by type", 400, 400, energyProductionByType,
				"* Storages are not considered energy producers");

		// Pie widget: Energy produced by source
		int sizeFactor = energyProductionBySource.size() - 2;
		contextPanel.addPiePlotWidget("Energy produced by source", 400, sizeFactor * 20 + 400, energyProductionBySource,
				"* Storages are not considered energy producers");

		sizeFactor = heatProductionBySource.size() - 2;
		contextPanel.addPiePlotWidget("Heat produced by source", 400, sizeFactor * 20 + 400, heatProductionBySource,
				"* Storages are not considered energy producers");

		sizeFactor = electricityProductionBySource.size() - 2;
		contextPanel.addPiePlotWidget("Electricity produced by source", 400, sizeFactor * 20 + 400,
				electricityProductionBySource, "* Storages are not considered energy producers");

		// Bar widget: Energy produced by type and building
		List<CategorySeries> energyByBuilding = new ArrayList<CategorySeries>();
		energyByBuilding.add(new CategorySeries("Electricity Production",
				new ArrayList<String>(electricityProductionByBuilding.keySet()),
				new ArrayList<Number>(electricityProductionByBuilding.values()), null, null));
		energyByBuilding
				.add(new CategorySeries("Heat Production", new ArrayList<String>(heatProductionByBuilding.keySet()),
						new ArrayList<Number>(heatProductionByBuilding.values()), null, null));
		contextPanel.addBarPlotWidget("Energy produced by type", "Buildings", "Energy [kWh]", 400, 400,
				energyByBuilding, "* Storages are not considered energy producers");
	}

	/**
	 * Populates a building panel with metrics. This is in the context of per
	 * building optimization
	 * 
	 * @param entryName    the context: "Global optimization" or the name of the
	 *                     building
	 * @param buildingName the name of the metrics panel of a building
	 * @param entryPanel   the metrics panel of a building
	 */
	private void populatePerBuildingOptimizationMetrics(String contextName, MetricsPanel contextPanel) {

		// Time steps
		ArrayList<Double> time = detailedResult.getDataSeries(contextName, "Time step");

		HashMap<String, Number> heatProductionBySource = new HashMap<String, Number>();
		HashMap<String, Number> electricityProductionBySource = new HashMap<String, Number>();
		HashMap<String, Number> energyProductionBySource = new HashMap<String, Number>();
		HashMap<String, Number> heatDischargeByStorage = new HashMap<String, Number>();
		HashMap<String, Number> electricityDischargeByStorage = new HashMap<String, Number>();

		Building building = DesignerPanel.buildings.get(contextName);

		if (building != null) {

			HashMap<String, HashMap<String, ArrayList<Double>>> energyContributedBySource = calculateEnergyContributedBySource(
					contextName, building);

			HashMap<String, ArrayList<Double>> heatProductionBySourceInTime = energyContributedBySource
					.get(HEAT_PRODUCTION_BY_SOURCE_IN_TIME);
			HashMap<String, ArrayList<Double>> electricityProductionBySourceInTime = energyContributedBySource
					.get(ELECTRICITY_PRODUCTION_BY_SOURCE_IN_TIME);
			HashMap<String, ArrayList<Double>> heatDischargedBySourceInTime = energyContributedBySource
					.get(HEAT_DISCHARGE_BY_SOURCE_IN_TIME);
			HashMap<String, ArrayList<Double>> electricityDischargedBySourceInTime = energyContributedBySource
					.get(ELECTRICITY_DISCHARGE_BY_SOURCE_IN_TIME);

			// Energy discharge by storage
			for (Entry<String, ArrayList<Double>> componentEntry : heatDischargedBySourceInTime.entrySet()) {
				String componentName = componentEntry.getKey();
				double heat = sum(heatDischargedBySourceInTime.get(componentName));
				double electricity = sum(electricityDischargedBySourceInTime.get(componentName));
				heatDischargeByStorage.put(componentEntry.getKey(), heat);
				electricityDischargeByStorage.put(componentEntry.getKey(), electricity);
			}

			// Energy production by source
			for (Entry<String, ArrayList<Double>> componentEntry : heatProductionBySourceInTime.entrySet()) {
				String componentName = componentEntry.getKey();
				double heat = sum(heatProductionBySourceInTime.get(componentName));
				double electricity = sum(electricityProductionBySourceInTime.get(componentName));
				heatProductionBySource.put(componentEntry.getKey(), heat);
				electricityProductionBySource.put(componentEntry.getKey(), electricity);
				energyProductionBySource.put(componentEntry.getKey(), heat + electricity);
			}

			// Total energy produced in time
			ArrayList<Double> totalHeatProductionInTime = new ArrayList<Double>(Collections.nCopies(time.size(), 0.0));
			ArrayList<Double> totalElectricityProductionInTime = new ArrayList<Double>(
					Collections.nCopies(time.size(), 0.0));

			for (Entry<String, ArrayList<Double>> componentEntry : heatProductionBySourceInTime.entrySet()) {
				ArrayList<Double> heatProduced = componentEntry.getValue();
				for (int i = 0; i < heatProduced.size(); i++) {
					totalHeatProductionInTime.set(i, totalHeatProductionInTime.get(i) + heatProduced.get(i));
				}
			}

			for (Entry<String, ArrayList<Double>> componentEntry : electricityProductionBySourceInTime.entrySet()) {
				ArrayList<Double> electricityProduced = componentEntry.getValue();
				for (int i = 0; i < electricityProduced.size(); i++) {
					totalElectricityProductionInTime.set(i,
							totalElectricityProductionInTime.get(i) + electricityProduced.get(i));
				}
			}

			// Total energy demanded
			ArrayList<Double> electricityDemandInTime = detailedResult.getDataSeries(contextName, "Electricity demand");
			double totalElectricityDemand = electricityDemandInTime.stream().mapToDouble(Double::doubleValue).sum();

			ArrayList<Double> heatDemandInTime = detailedResult.getDataSeries(contextName, "Heat demand");
			double totalHeatDemand = heatDemandInTime.stream().mapToDouble(Double::doubleValue).sum();

			// Total energy produced
			double totalHeatProduced = sum(totalHeatProductionInTime);
			double totalElectricityProduced = sum(totalElectricityProductionInTime);

			// Total cost of entry
			ArrayList<Double> cost = detailedResult.getDataSeries(contextName, "Total costs [EUR]");
			double totalCost = cost.get(cost.size() - 1);

			// Total CO2 emissions of entry
			ArrayList<Double> co2emissions = detailedResult.getDataSeries(contextName, "CO2 emissions [kg CO2/kWh]");
			double totalCo2emissions = co2emissions.get(cost.size() - 1);

			// Text widget: Energy demanded
			contextPanel.addTextWidget("Heat demanded", new DecimalFormat("#.0##").format(totalHeatDemand), "kWH",
					null);
			contextPanel.addTextWidget("Electricity demanded",
					new DecimalFormat("#.0##").format(totalElectricityDemand), "kWH", null);

			// Text widget: Energy produced
			contextPanel.addTextWidget("Heat produced", new DecimalFormat("#.0##").format(totalHeatProduced), "kWH",
					"* Storages are not considered energy producers");
			contextPanel.addTextWidget("Electricity produced",
					new DecimalFormat("#.0##").format(totalElectricityProduced), "kWH",
					"* Storages are not considered energy producers");

			// Text widget: Energy contributed: includes storage discharged energy
			contextPanel.addTextWidget("Heat contributed",
					new DecimalFormat("#.0##").format(totalHeatProduced + sum(heatDischargeByStorage.values())), "kWH",
					"* Storage contributions are included");
			contextPanel.addTextWidget("Electricity contributed",
					new DecimalFormat("#.0##")
							.format(totalElectricityProduced + sum(electricityDischargeByStorage.values())),
					"kWH", "* Storage contributions are included");

			// Text widget: Total cost (EUR and CO2)
			contextPanel.addTextWidget("Total cost", new DecimalFormat("#.0##").format(totalCost), "EUR", null);
			contextPanel.addTextWidget("Total CO2 Emissions", new DecimalFormat("#.0##").format(totalCo2emissions),
					"kg CO2/kWh", null);

			// Bar widget: Energy produced vs demanded per time step
			List<CategorySeries> energySeries = new ArrayList<CategorySeries>();
			energySeries.add(new CategorySeries("Electricity Demand ", time, electricityDemandInTime, null, null));
			energySeries.add(
					new CategorySeries("Electricity Production", time, totalElectricityProductionInTime, null, null));
			energySeries.add(new CategorySeries("Heat Demand ", time, heatDemandInTime, null, null));
			energySeries.add(new CategorySeries("Heat Production", time, totalHeatProductionInTime, null, null));
			contextPanel.addBarPlotWidget("Energy produced and demanded", "Forecasted time [time steps]",
					"Electricity [kWh]", 400, 400, energySeries, "* Storages are not considered energy producers");

			// Pie widget: Energy contributed by storage
			contextPanel.addPiePlotWidget("Heat contributed by storage", 400, 400, heatDischargeByStorage, null);
			contextPanel.addPiePlotWidget("Electricity contributed by storage", 400, 400, electricityDischargeByStorage,
					null);

			// Pie widget: Energy produced by type
			HashMap<String, Number> energyProductionByType = new HashMap<String, Number>();
			energyProductionByType.put("Electricity", totalElectricityProduced);
			energyProductionByType.put("Heat", totalHeatProduced);
			contextPanel.addPiePlotWidget("Energy produced by type", 400, 400, energyProductionByType,
					"* Storages are not considered energy producers");

			// Pie widget: Energy produced by source: Volatile producers, controllable
			// producers and couplers are considered producers
			int sizeFactor = energyProductionBySource.size() - 2;
			contextPanel.addPiePlotWidget("Energy produced by source", 400, sizeFactor * 20 + 400,
					energyProductionBySource, "* Storages are not considered energy producers");

			sizeFactor = heatProductionBySource.size() - 2;
			contextPanel.addPiePlotWidget("Heat produced by source", 400, sizeFactor * 20 + 400, heatProductionBySource,
					"* Storages are not considered energy producers");

			sizeFactor = electricityProductionBySource.size() - 2;
			contextPanel.addPiePlotWidget("Electricity produced by source", 400, sizeFactor * 20 + 400,
					electricityProductionBySource, "* Storages are not considered energy producers");
		}

	}

	/**
	 * Calculate the energy contributed by the components of a building according to
	 * the context (simulation mode). The components are:
	 * <ul>
	 * <li>producers: capable of producing energy, ie. volatile producers,
	 * controllable producers and couplers</li>
	 * <li>storages: capable of contributed previously stored energy.</li>
	 * </ul>
	 * 
	 * @param context  "Global optimization" or the name of a building (which
	 *                 corresponds to per building optimization)
	 * @param building the name of the building under examination
	 */
	private HashMap<String, HashMap<String, ArrayList<Double>>> calculateEnergyContributedBySource(String context,
			Building building) {

		// Energy produced by source
		HashMap<String, ArrayList<Double>> heatProductionBySourceInTime = new HashMap<String, ArrayList<Double>>();
		HashMap<String, ArrayList<Double>> electricityProductionBySourceInTime = new HashMap<String, ArrayList<Double>>();

		// Energy contributed by storages
		HashMap<String, ArrayList<Double>> heatContributedByStorageInTime = new HashMap<String, ArrayList<Double>>();
		HashMap<String, ArrayList<Double>> electricityContributedByStorageInTime = new HashMap<String, ArrayList<Double>>();

		if (building != null) {
			for (Coupler coupler : building.getCoupler()) {
				ArrayList<Double> heatContributedPerTimeStep = getHeatContributedBy(context, coupler.getName());
				heatProductionBySourceInTime.put(coupler.getName(), heatContributedPerTimeStep);
				ArrayList<Double> electricityContributedPerTimeStep = getElectricityContributedBy(context,
						coupler.getName());
				electricityProductionBySourceInTime.put(coupler.getName(), electricityContributedPerTimeStep);
			}
			for (Volatile volatileProducer : building.getVolatile()) {
				if (volatileProducer.getNetworkType().equals("Heat")) {
					ArrayList<Double> heatContributedPerTimeStep = getHeatContributedBy(context,
							volatileProducer.getName());
					heatProductionBySourceInTime.put(volatileProducer.getName(), heatContributedPerTimeStep);
				} else {
					ArrayList<Double> electricityContributedPerTimeStep = getElectricityContributedBy(context,
							volatileProducer.getName());
					electricityProductionBySourceInTime.put(volatileProducer.getName(),
							electricityContributedPerTimeStep);
				}
			}
			for (Controllable controllableProducer : building.getControllable()) {
				if (controllableProducer.getNetworkType().equals("Heat")) {
					ArrayList<Double> heatContributedPerTimeStep = getHeatContributedBy(context,
							controllableProducer.getName());
					heatProductionBySourceInTime.put(controllableProducer.getName(), heatContributedPerTimeStep);
				} else {
					ArrayList<Double> electricityContributedPerTimeStep = getElectricityContributedBy(context,
							controllableProducer.getName());
					electricityProductionBySourceInTime.put(controllableProducer.getName(),
							electricityContributedPerTimeStep);
				}
			}
			for (Storage storage : building.getStorage()) {
				if (storage.getNetworkType().equals("Heat")) {
					heatContributedByStorageInTime.put(storage.getName(),
							getHeatContributedBy(context, storage.getName() + "Discharge"));
				} else {
					electricityContributedByStorageInTime.put(storage.getName(),
							getElectricityContributedBy(context, storage.getName() + "Discharge"));
				}
			}
		}

		HashMap<String, HashMap<String, ArrayList<Double>>> energyContributedBySource = new HashMap<String, HashMap<String, ArrayList<Double>>>();
		energyContributedBySource.put(HEAT_PRODUCTION_BY_SOURCE_IN_TIME, heatProductionBySourceInTime);
		energyContributedBySource.put(ELECTRICITY_PRODUCTION_BY_SOURCE_IN_TIME, electricityProductionBySourceInTime);
		energyContributedBySource.put(HEAT_DISCHARGE_BY_SOURCE_IN_TIME, heatContributedByStorageInTime);
		energyContributedBySource.put(ELECTRICITY_DISCHARGE_BY_SOURCE_IN_TIME, electricityContributedByStorageInTime);

		return energyContributedBySource;
	}

	/**
	 * @returns the sum of the elements data
	 * @param data an ArrayList of Double elements
	 */
	private double sum(ArrayList<Double> data) {
		if (data == null) {
			return 0;
		}
		return data.stream().mapToDouble(Double::doubleValue).sum();
	}

	/**
	 * @returns the sum of the elements data
	 * @param data a collection of Number elements
	 */
	private double sum(Collection<Number> data) {
		return data.stream().mapToDouble(Number::doubleValue).sum();
	}

	/**
	 * @returns the total electricity contributed (produced or given) per time step
	 *          by a component
	 * @param entryName     the name of a building if the context is per building
	 *                      optimization or "Global optimization"
	 * @param componentName the name of a component
	 */
	private ArrayList<Double> getElectricityContributedBy(String entryName, String componentName) {
		return overviewResult.getDataSeries(entryName, "E_" + componentName);
	}

	/**
	 * @returns the total heat produced by a component
	 * @param entryName     the name of a building if the context is per building
	 *                      optimization or "Global optimization"
	 * @param componentName the name of a component
	 */
	private ArrayList<Double> getHeatContributedBy(String entryName, String componentName) {
		return overviewResult.getDataSeries(entryName, "H_" + componentName);
	}

}
