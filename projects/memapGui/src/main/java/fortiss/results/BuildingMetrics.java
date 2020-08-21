package fortiss.results;

import fortiss.gui.DesignerPanel;

public class BuildingMetrics extends Metrics {
	
	public BuildingMetrics(String context, ResultsLibrary detailedResult, ResultsLibrary overviewResult) {
		super(context, detailedResult, overviewResult);
	}

	@Override
	public void setHeatProducedBySourceInTime() {
		heatProducedBySourceInTime = calculateHeatProductionBySourceInTime(context, DesignerPanel.buildings.get(context));
	}

	@Override
	public void setHeatDischargedBySourceInTime() {
		heatDischargedByStorageInTime = calculateHeatProductionBySourceInTime(context, DesignerPanel.buildings.get(context));
	}

	@Override
	public void setHeatChargedBySourceInTime() {
		heatChargedByStorageInTime = calculateHeatChargeByStorageInTime(context, DesignerPanel.buildings.get(context));
	}

	@Override
	public void setElectricityProducedBySourceInTime() {
		electricityProducedBySourceInTime = calculateElectricityProductionBySourceInTime(context, DesignerPanel.buildings.get(context));
	}

	@Override
	public void setElectricityDischargedBySourceInTime() {
		electricityDischargedByStorageInTime = calculateElectricityDischargeByStorageInTime(context, DesignerPanel.buildings.get(context));
	}

	@Override
	public void setElectricityChargedBySourceInTime() {
		electricityChargedByStorageInTime = calculateElectricityChargeByStorageInTime(context, DesignerPanel.buildings.get(context));
	}
	
}
