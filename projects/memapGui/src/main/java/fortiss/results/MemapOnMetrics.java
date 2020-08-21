package fortiss.results;

import java.util.HashMap;
import java.util.Map.Entry;

import fortiss.components.Building;
import fortiss.gui.DesignerPanel;

public class MemapOnMetrics extends Metrics {
	
	public MemapOnMetrics(String context, ResultsLibrary detailedResult, ResultsLibrary overviewResult) {
		super(context, detailedResult, overviewResult);
	}

	@Override
	public void setHeatProducedBySourceInTime() {
		for (Entry<String, Building> buildingEntry : DesignerPanel.buildings.entrySet()) {
			Building building = buildingEntry.getValue();
			heatProducedBySourceInTime.putAll(calculateHeatProductionBySourceInTime(context, building));
		}
	}
		
	@Override
	public void setHeatChargedBySourceInTime() {
		for (Entry<String, Building> buildingEntry : DesignerPanel.buildings.entrySet()) {
			Building building = buildingEntry.getValue();
			heatChargedByStorageInTime.putAll(calculateHeatChargeByStorageInTime(context, building));
		}
	}
	
	@Override
	public void setHeatDischargedBySourceInTime() {
		for (Entry<String, Building> buildingEntry : DesignerPanel.buildings.entrySet()) {
			Building building = buildingEntry.getValue();
			heatDischargedByStorageInTime.putAll(calculateHeatDischargeByStorageInTime(context, building));
		}
	}

	@Override
	public void setElectricityProducedBySourceInTime() {
		for (Entry<String, Building> buildingEntry : DesignerPanel.buildings.entrySet()) {
			Building building = buildingEntry.getValue();
			electricityProducedBySourceInTime.putAll(calculateElectricityProductionBySourceInTime(context, building));
		}
	}
	
	@Override
	public void setElectricityChargedBySourceInTime() {
		for (Entry<String, Building> buildingEntry : DesignerPanel.buildings.entrySet()) {
			Building building = buildingEntry.getValue();
			electricityChargedByStorageInTime.putAll(calculateElectricityChargeByStorageInTime(context, building));
		}
	}


	@Override
	public void setElectricityDischargedBySourceInTime() {
		for (Entry<String, Building> buildingEntry : DesignerPanel.buildings.entrySet()) {
			Building building = buildingEntry.getValue();
			electricityDischargedByStorageInTime.putAll(calculateElectricityDischargeByStorageInTime(context, building));
		}
	}
	
	public HashMap<String, Double> getHeatProductionByBuilding(){
		HashMap<String, Double> heatProductionByBuilding = new HashMap<String, Double>();
		for (Entry<String, Building> buildingEntry : DesignerPanel.buildings.entrySet()) {
			Building building = buildingEntry.getValue();
			heatProductionByBuilding.put(buildingEntry.getKey(), sum(getTotalsByTimeStep(calculateHeatProductionBySourceInTime(context, building), nTimeSteps)));
		}
		return heatProductionByBuilding;
	}
	
	public HashMap<String, Double> getElectricityProductionByBuilding(){
		HashMap<String, Double> electricityProductionByBuilding = new HashMap<String, Double>();
		for (Entry<String, Building> buildingEntry : DesignerPanel.buildings.entrySet()) {
			Building building = buildingEntry.getValue();
			electricityProductionByBuilding.put(buildingEntry.getKey(), sum(getTotalsByTimeStep(calculateHeatProductionBySourceInTime(context, building), nTimeSteps)));
		}
		return electricityProductionByBuilding;
	}
	
}
