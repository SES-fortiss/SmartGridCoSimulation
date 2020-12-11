package fortiss.results;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.knowm.xchart.CategorySeries;

import fortiss.components.Building;
import fortiss.gui.DesignerPanel;
import fortiss.results.widgets.ListWidget;
import memap.media.Strings;

public class MetricsGenerator {

	Metrics memapOnMetrics;
	Metrics memapOffMetrics;
	HashMap<String, BuildingMetrics> buildingMetrics;

	public MetricsGenerator(ResultsLibrary detailedResult, ResultsLibrary overviewResult) {

		// Global metrics
		memapOnMetrics = new MemapOnMetrics(Strings.memapOnModeName, detailedResult, overviewResult);
		memapOffMetrics = new MemapOffMetrics(Strings.memapOffModeName, detailedResult, overviewResult);
		buildingMetrics = new HashMap<String, BuildingMetrics>();

		for (Entry<String, Building> buildingEntry : DesignerPanel.buildings.entrySet()) {
			buildingMetrics.put(buildingEntry.getKey(),
					new BuildingMetrics(buildingEntry.getKey(), detailedResult, overviewResult));
		}
	}

	public void populateMetricsPanels(SummaryPanel summaryPanel, HashMap<String, MetricsPanel> metricsPanelMap) {

		populateSummaryMetrics(summaryPanel);

		for (String context : metricsPanelMap.keySet()) {
			if (context.equals(Strings.memapOnModeName)) {
				populateOptimizationMetrics(context, metricsPanelMap.get(context), memapOnMetrics);
			} else {
				populateOptimizationMetrics(context, metricsPanelMap.get(context), buildingMetrics.get(context));
			}
		}

	}

	private void populateSummaryMetrics(SummaryPanel summaryPanel) {

		// COMPARATIVE FIGURES
		double perBuildingOptimizationCost = 0;
		for (String buildingName : DesignerPanel.buildings.keySet()) {
			perBuildingOptimizationCost += buildingMetrics.get(buildingName).getCost();
		}
		summaryPanel.addComparisonWidget(Strings.performancePanelName, "Cost with " + Strings.memapOnModeName, memapOnMetrics.getCost(),
				perBuildingOptimizationCost, Strings.costsUnit, null);

		double perBuildingOptimizationCo2Emissions = 0;
		for (String buildingName : DesignerPanel.buildings.keySet()) {
			perBuildingOptimizationCo2Emissions += buildingMetrics.get(buildingName).getCo2emissions();
		}
		summaryPanel.addComparisonWidget(Strings.performancePanelName, "CO2 Emissions with " + Strings.memapOnModeName,
				memapOnMetrics.getCo2emissions(), perBuildingOptimizationCo2Emissions, Strings.co2EmissionsUnit, null);

		// List widget: Operational costs
		ListWidget lwMemapOn = summaryPanel.addListWidget(Strings.memapOnModeName, "Operational costs: " + Strings.memapOnModeName, null);
		lwMemapOn.addRow("Cost", memapOnMetrics.getCost(), Strings.costsUnit);
		lwMemapOn.addRow("CO2", memapOnMetrics.getCo2emissions(), Strings.co2EmissionsUnit);

		ListWidget lwMemapOff = summaryPanel.addListWidget(Strings.memapOffModeName,
				"Operational costs: " + Strings.memapOffModeName, null);
		lwMemapOff.addRow("Cost", perBuildingOptimizationCost, Strings.costsUnit);
		lwMemapOff.addRow("CO2", perBuildingOptimizationCo2Emissions, Strings.co2EmissionsUnit);

		// List widget: System energy demand
		ListWidget lwDemand = summaryPanel.addListWidget(Strings.performancePanelName, "System Energy Demand", null);
		lwDemand.addRow("Electricity", memapOnMetrics.getElectricityDemand(), Strings.energyUnit);
		lwDemand.addRow("Heat", memapOnMetrics.getHeatDemand(), Strings.energyUnit);
		lwDemand.setPreferredSize(new Dimension(290, 100));

		// MEMAP ON - FIGURES
		// List widget: Electricity balance
		ListWidget lwElectricity = summaryPanel.addListWidget(Strings.memapOnModeName, "Electricity balance: " + Strings.memapOnModeName,
				null);
		lwElectricity.addRow("Total demand", memapOnMetrics.getElectricityDemand(), Strings.energyUnit);
		lwElectricity.addRow("Total production", memapOnMetrics.getElectricityProduction(), Strings.energyUnit);
		lwElectricity.addRow("Energy charged", memapOnMetrics.getElectricityCharge(), Strings.energyUnit);
		lwElectricity.addRow("Energy discharged", memapOnMetrics.getElectricityDischarge(), Strings.energyUnit);
		lwElectricity.addRow("Market buying", memapOnMetrics.getElectricityBuy(), Strings.energyUnit);
		lwElectricity.addRow("Market selling", memapOnMetrics.getElectricitySell(), Strings.energyUnit);

		// List widget: Heat balance
		ListWidget lwHeat = summaryPanel.addListWidget(Strings.memapOnModeName, "Heat balance: " + Strings.memapOnModeName, null);
		lwHeat.addRow("Total demand", memapOnMetrics.getHeatDemand(), Strings.energyUnit);
		lwHeat.addRow("Total production", memapOnMetrics.getHeatProduction(), Strings.energyUnit);
		lwHeat.addRow("Energy charged", memapOnMetrics.getHeatCharge(), Strings.energyUnit);
		lwHeat.addRow("Energy discharged", memapOnMetrics.getHeatDischarge(), Strings.energyUnit);
		lwHeat.addRow("Market buying", memapOnMetrics.getHeatBuy(), Strings.energyUnit);
		lwHeat.addRow("Market selling", memapOnMetrics.getHeatSell(), Strings.energyUnit);

		// MEMAP OFF - FIGURES
		// List widget: Electricity balance
		ListWidget lwElectricity2 = summaryPanel.addListWidget(Strings.memapOffModeName,
				"Electricity balance: " + Strings.memapOffModeName, null);
		lwElectricity2.addRow("Total demand", memapOffMetrics.getElectricityDemand(), Strings.energyUnit);
		lwElectricity2.addRow("Total production", memapOffMetrics.getElectricityProduction(), Strings.energyUnit);
		lwElectricity2.addRow("Energy charged", memapOffMetrics.getElectricityCharge(), Strings.energyUnit);
		lwElectricity2.addRow("Energy discharged", memapOffMetrics.getElectricityDischarge(), Strings.energyUnit);
		lwElectricity2.addRow("Market buying", memapOffMetrics.getElectricityBuy(), Strings.energyUnit);
		lwElectricity2.addRow("Market selling", memapOffMetrics.getElectricitySell(), Strings.energyUnit);

		// List widget: Heat balance
		ListWidget lwHeat2 = summaryPanel.addListWidget(Strings.memapOffModeName, "Heat balance: " + Strings.memapOffModeName,
				null);
		lwHeat2.addRow("Total demand", memapOffMetrics.getHeatDemand(), Strings.energyUnit);
		lwHeat2.addRow("Total production", memapOffMetrics.getHeatProduction(), Strings.energyUnit);
		lwHeat2.addRow("Energy charged", memapOffMetrics.getHeatCharge(), Strings.energyUnit);
		lwHeat2.addRow("Energy discharged", memapOffMetrics.getHeatDischarge(), Strings.energyUnit);
		lwHeat2.addRow("Market buying", memapOffMetrics.getHeatBuy(), Strings.energyUnit);
		lwHeat2.addRow("Market selling", memapOffMetrics.getHeatSell(), Strings.energyUnit);

		HashMap<String, Number> componentUsage = new HashMap<String, Number>();
		componentUsage.putAll(memapOnMetrics.getEnergyProducedBySource());
		componentUsage.put("Market (Elec. buy)", memapOnMetrics.getElectricityBuy());
		componentUsage.put("Market (Heat buy)", memapOnMetrics.getHeatBuy());
		summaryPanel.addComponentUsageWidget(Strings.memapOnModeName, "Component usage - " + Strings.memapOnModeName, componentUsage, 3);

		HashMap<String, Number> componentUsage2 = new HashMap<String, Number>();
		componentUsage2.putAll(memapOffMetrics.getEnergyProducedBySource());
		componentUsage2.put("Market (Elec. buy)", memapOffMetrics.getElectricityBuy());
		componentUsage2.put("Market (Heat buy)", memapOffMetrics.getHeatBuy());
		summaryPanel.addComponentUsageWidget(Strings.memapOffModeName, "Component usage - " + Strings.memapOffModeName,
				componentUsage2, 3);
	}

	/**
	 * Populates the individual result panels with metrics.
	 * 
	 * @param contextName  {@link Strings#memapOnModeName} or the name of a building
	 * @param contextPanel the metrics panel that corresponds to the context
	 * @param metrics      the set of metrics of the context
	 */
	private void populateOptimizationMetrics(String contextName, MetricsPanel contextPanel, Metrics metrics) {

		contextPanel.addTitleWidget(contextName);
		// Text widget: Total cost (EUR and CO2)
		contextPanel.addTextWidget("Total cost", metrics.getCost(), Strings.costsUnit, null);
		contextPanel.addTextWidget("Total CO2 Emissions", metrics.getCo2emissions(), Strings.co2EmissionsUnit, null);

		// Text widget: Energy demanded
		contextPanel.addTextWidget(Strings.heatDemand, metrics.getHeatDemand(), Strings.energyUnit, null);
		contextPanel.addTextWidget(Strings.electricityDemand, metrics.getElectricityDemand(), Strings.energyUnit, null);

		// List widget: Heat balance
		ListWidget lwHeat = contextPanel.addListWidget(Strings.memapOnModeName, "Heat balance: " + contextName, null);
		lwHeat.addRow("Total demand", metrics.getHeatDemand(), Strings.energyUnit);
		lwHeat.addRow("Total production", metrics.getHeatProduction(), Strings.energyUnit);
		lwHeat.addRow("Energy charged", metrics.getHeatCharge(), Strings.energyUnit);
		lwHeat.addRow("Energy discharged", metrics.getHeatDischarge(), Strings.energyUnit);
		lwHeat.addRow("Market buying", metrics.getHeatBuy(), Strings.energyUnit);
		lwHeat.addRow("Market selling", metrics.getHeatSell(), Strings.energyUnit);
		
		// List widget: Electricity balance
		ListWidget lwElectricity = contextPanel.addListWidget(contextName, "Electricity balance: " + contextName,
				null);
		lwElectricity.addRow("Total demand", metrics.getElectricityDemand(), Strings.energyUnit);
		lwElectricity.addRow("Total production", metrics.getElectricityProduction(), Strings.energyUnit);
		lwElectricity.addRow("Energy charged", metrics.getElectricityCharge(), Strings.energyUnit);
		lwElectricity.addRow("Energy discharged", metrics.getElectricityDischarge(), Strings.energyUnit);
		lwElectricity.addRow("Market buying", metrics.getElectricityBuy(), Strings.energyUnit);
		lwElectricity.addRow("Market selling", metrics.getElectricitySell(), Strings.energyUnit);

		// Bar widget: Energy contributed vs demanded per time step
		List<CategorySeries> energySeries = new ArrayList<CategorySeries>();
		energySeries.add(new CategorySeries("Electricity demanded", metrics.getTime(),
				metrics.getElectricityDemandInTime(), null, null));
		energySeries.add(new CategorySeries("Electricity produced", metrics.getTime(),
				metrics.getElectricityProducedInTime(), null, null));
		energySeries.add(new CategorySeries("Electricity discharged", metrics.getTime(),
				metrics.getElectricityDischargeInTime(), null, null));
		energySeries
				.add(new CategorySeries("Heat demanded ", metrics.getTime(), metrics.getHeatDemandInTime(), null, null));
		energySeries.add(
				new CategorySeries("Heat produced", metrics.getTime(), metrics.getHeatProducedInTime(), null, null));
		energySeries.add(
				new CategorySeries("Heat discharged", metrics.getTime(), metrics.getHeatDischargeInTime(), null, null));
		
		contextPanel.addBarPlotWidget("Energy produced, discharged and demanded", "Time steps", "Power [kWh]", 1600, 400,
				energySeries, null);

		// Pie widget: Energy produced by type
		HashMap<String, Number> energyProductionByType = new HashMap<String, Number>();
		energyProductionByType.put("Electricity", metrics.getElectricityProduction());
		energyProductionByType.put("Heat", metrics.getHeatProduction());
		energyProductionByType.put("Market (Elec. buy)", metrics.getElectricityBuy());
		energyProductionByType.put("Market (Heat buy)", metrics.getHeatBuy());
		contextPanel.addPiePlotWidget("Energy produced by type", 400, 400, energyProductionByType,
				"* Storages are not considered energy producers");

		// Bar widget: Energy produced by type and building
		if (metrics.context.equals(Strings.memapOnModeName)) {
			List<CategorySeries> energyByBuilding = new ArrayList<CategorySeries>();
			HashMap<String, Double> electricityProductionByBuilding = ((MemapOnMetrics) metrics)
					.getElectricityProductionByBuilding();
			energyByBuilding.add(new CategorySeries("Electricity Production",
					new ArrayList<String>(electricityProductionByBuilding.keySet()),
					new ArrayList<Number>(electricityProductionByBuilding.values()), null, null));
			HashMap<String, Double> heatProductionByBuilding = ((MemapOnMetrics) metrics).getHeatProductionByBuilding();
			energyByBuilding
					.add(new CategorySeries("Heat Production", new ArrayList<String>(heatProductionByBuilding.keySet()),
							new ArrayList<Number>(heatProductionByBuilding.values()), null, null));
			contextPanel.addBarPlotWidget("Energy produced by type", "Buildings", "Energy [kWh]", 400, 400,
					energyByBuilding, "* Storages are not considered energy producers");
		}

		HashMap<String, Number> componentUsage = new HashMap<String, Number>();
		componentUsage.putAll(metrics.getEnergyProducedBySource());
		componentUsage.put("Market (Elec. buy)", metrics.getElectricityBuy());
		componentUsage.put("Market (Heat buy)", metrics.getHeatBuy());
		contextPanel.addComponentUsageWidget(contextName, "Component usage - " + contextName, componentUsage, 3);
	}

}
