package fortiss.results;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map.Entry;

import fortiss.components.Building;
import fortiss.gui.DesignerPanel;
import memap.media.Strings;

public class MemapOffMetrics extends Metrics {

	public MemapOffMetrics(String context, ResultsLibrary detailedResult, ResultsLibrary overviewResult) {
		super(context, detailedResult, overviewResult);
	}

	@Override
	public void setCost() {
		cost = 0;
		for (String buildingName : DesignerPanel.buildings.keySet()) {
			ArrayList<Double> costInTime = detailedResult.getDataSeries(buildingName, Strings.totalCostAndUnit);
			cost += costInTime.get(costInTime.size() - 1);
		}
	}

	@Override
	public void setCo2emissions() {
		co2emissions = 0;
		for (String buildingName : DesignerPanel.buildings.keySet()) {
			ArrayList<Double> co2emissionsInTime = detailedResult.getDataSeries(buildingName,
					Strings.co2EmissionsAndUnit);
			co2emissions += co2emissionsInTime.get(co2emissionsInTime.size() - 1);
		}
	}

	@Override
	public ArrayList<Double> getHeatDemandInTime() {
		ArrayList<Double> heatDemandInTime = new ArrayList<Double>(Collections.nCopies(nTimeSteps, 0.0));
			for (String buildingName : DesignerPanel.buildings.keySet()) {
				ArrayList<Double> heatDemandOfBuilding = convertPowerIntoEnergy(detailedResult.getDataSeries(buildingName,
						Strings.heatDemand));
				heatDemandInTime = sumListValues(heatDemandInTime, heatDemandOfBuilding);
			}
		return heatDemandInTime;
	}

	@Override
	public void setHeatDemand() {
		heatDemand = sum(getHeatDemandInTime());
	}

	@Override
	public void setHeatProducedBySourceInTime() {
		for (Entry<String, Building> buildingEntry : DesignerPanel.buildings.entrySet()) {
			Building building = buildingEntry.getValue();
			heatProducedBySourceInTime.putAll(calculateHeatProductionBySourceInTime(building.getName(), building));
		}
	}

	@Override
	public void setHeatDischargedBySourceInTime() {
		for (Entry<String, Building> buildingEntry : DesignerPanel.buildings.entrySet()) {
			Building building = buildingEntry.getValue();
			heatDischargedByStorageInTime.putAll(calculateHeatDischargeByStorageInTime(building.getName(), building));
		}
	}

	@Override
	public void setHeatChargedBySourceInTime() {
		for (Entry<String, Building> buildingEntry : DesignerPanel.buildings.entrySet()) {
			Building building = buildingEntry.getValue();
			heatChargedByStorageInTime.putAll(calculateHeatChargeByStorageInTime(building.getName(), building));
		}
	}

	@Override
	public ArrayList<Double> getElectricityDemandInTime() {
		ArrayList<Double> electricityDemandInTime = new ArrayList<Double>(Collections.nCopies(nTimeSteps, 0.0));
			for (String buildingName : DesignerPanel.buildings.keySet()) {
				ArrayList<Double> electricityDemandOfBuilding = convertPowerIntoEnergy(detailedResult.getDataSeries(buildingName,
						Strings.electricityDemand));
				electricityDemandInTime = sumListValues(electricityDemandInTime, electricityDemandOfBuilding);
			}
		return electricityDemandInTime;
	}
	
	@Override
	public void setElectricityDemand() {
		electricityDemand = sum(getElectricityDemandInTime());
	}

	@Override
	public void setElectricityBuy() {
		electricityBuy = 0;
		for (String buildingName : DesignerPanel.buildings.keySet()) {
			electricityBuy += sum(convertPowerIntoEnergy(detailedResult.getDataSeries(buildingName, Strings.elecBuy)));
		}
	}

	@Override
	public void setElectricitySell() {
		electricitySell = 0;
		for (String buildingName : DesignerPanel.buildings.keySet()) {
			electricitySell += sum(convertPowerIntoEnergy(detailedResult.getDataSeries(buildingName, Strings.elecSell)));
		}
	}

	@Override
	public void setElectricityProducedBySourceInTime() {
		for (Entry<String, Building> buildingEntry : DesignerPanel.buildings.entrySet()) {
			Building building = buildingEntry.getValue();
			electricityProducedBySourceInTime
					.putAll(calculateElectricityProductionBySourceInTime(building.getName(), building));
		}
	}

	@Override
	public void setElectricityDischargedBySourceInTime() {
		for (Entry<String, Building> buildingEntry : DesignerPanel.buildings.entrySet()) {
			Building building = buildingEntry.getValue();
			electricityDischargedByStorageInTime
					.putAll(calculateElectricityDischargeByStorageInTime(building.getName(), building));
		}
	}

	@Override
	public void setElectricityChargedBySourceInTime() {
		for (Entry<String, Building> buildingEntry : DesignerPanel.buildings.entrySet()) {
			Building building = buildingEntry.getValue();
			electricityChargedByStorageInTime
					.putAll(calculateElectricityChargeByStorageInTime(building.getName(), building));
		}
	}

}
