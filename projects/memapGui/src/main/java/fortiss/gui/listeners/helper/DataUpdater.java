package fortiss.gui.listeners.helper;

import fortiss.gui.DesignerPanel;
import fortiss.gui.ParameterInputPanel;
import fortiss.simulation.Parameters;

/**
 * Updates the displayed data according to user selection.
 */
public class DataUpdater {

	/**
	 * Updates the simulation parameters and calls {@link ParameterInputPanel#update()}
	 */
	public void updateParameterData(Parameters par) {
		DesignerPanel.parameterPanel.pars = par;
		DesignerPanel.parameterPanel.update();
	}

	/**
	 * Updates and shows the data of the selected building.
	 */
	public void updateEmsData(String name, String port) {
		DesignerPanel.pl_ems_detail.txtBName.setText(name);
		DesignerPanel.pl_ems_detail.txtBPort.setText(port);

		DesignerPanel.cl.show(DesignerPanel.pl_comp_detail, "building");
	}

	/**
	 * Updates and shows the data of the selected demand.
	 */
	public void updateDemandData(String name, String consumption) {
		DesignerPanel.demandPanel.txtDName.setText(name);
		DesignerPanel.demandPanel.txtDConsumption.setText(consumption);
		DesignerPanel.demandPanel.plotPanel.clearSeries();
		DesignerPanel.demandPanel.setData(consumption);
		DesignerPanel.cl.show(DesignerPanel.pl_comp_detail, "demand");
	}

	/**
	 * Updates and shows the data of the selected storage.
	 */
	public void updateStorageData(String name, String networkType, double capacity, double soc, double maxCharging,
			double maxDRate, double chargeE, double dischargeE) {
		DesignerPanel.storagePanel.txtSName.setText(name);
		DesignerPanel.storagePanel.sSNetworkType.setSelectedItem(networkType);
		DesignerPanel.storagePanel.txtSCapacity.setText(Double.toString(capacity));
		DesignerPanel.storagePanel.txtSStateOfCharge.setText(Double.toString(soc));
		DesignerPanel.storagePanel.txtSMaxCharge.setText(Double.toString(maxCharging));
		DesignerPanel.storagePanel.txtSMaxDischarge.setText(Double.toString(maxDRate));
		DesignerPanel.storagePanel.txtSEffIN.setText(Double.toString(chargeE));
		DesignerPanel.storagePanel.txtSEffOUT.setText(Double.toString(dischargeE));

		DesignerPanel.cl.show(DesignerPanel.pl_comp_detail, "storage");
	}

	/**
	 * Updates and shows the data of the selected volatile.
	 */
	public void updateVolProductionData(String producer, String networktype, double minimumPower, double maximumPower,
			String forcastFile, double cost, double coEmission) {
		DesignerPanel.volatilePanel.txtVName.setText(producer);
		DesignerPanel.volatilePanel.sVNetworkType.setSelectedItem(networktype);
		DesignerPanel.volatilePanel.txtVMinimumPower.setText(Double.toString(minimumPower));
		DesignerPanel.volatilePanel.txtVMaximumPower.setText(Double.toString(maximumPower));
		DesignerPanel.volatilePanel.txtVForecastFile.setText(forcastFile);
		DesignerPanel.volatilePanel.txtVCost.setText(Double.toString(cost));
		DesignerPanel.volatilePanel.txtVCOEmission.setText(Double.toString(coEmission));

		DesignerPanel.cl.show(DesignerPanel.pl_comp_detail, "volProduction");
	}

	/**
	 * Updates and shows the data of the selected controllable.
	 */
	public void updateContProductionData(String producer, String networkType, double minimumPower, double maximumPower,
			double efficiency, double cost, double coEmission) {
		DesignerPanel.controllablePanel.txtCPName.setText(producer);
		DesignerPanel.controllablePanel.sCPNetworkType.setSelectedItem(networkType);
		DesignerPanel.controllablePanel.txtCPMinimumPower.setText(Double.toString(minimumPower));
		DesignerPanel.controllablePanel.txtCPMaximumPower.setText(Double.toString(maximumPower));
		DesignerPanel.controllablePanel.txtCPEfficiency.setText(Double.toString(efficiency));
		DesignerPanel.controllablePanel.txtCPCost.setText(Double.toString(cost));
		DesignerPanel.controllablePanel.txtCPCOEmission.setText(Double.toString(coEmission));

		DesignerPanel.cl.show(DesignerPanel.pl_comp_detail, "contProduction");
	}

	/**
	 * Updates and shows the data of the selected coupler.
	 */
	public void updateCouplerData(String name, String primaryNetworkType, String secondaryNetworkType,
			double minimumPower, double maximumPower, double primaryNetworkEfficiency,
			double secondaryNetworkEfficiency, double cost, double coEmission) {
		DesignerPanel.couplerPanel.txtCName.setText(name);
		DesignerPanel.couplerPanel.sCPrimaryNetworkType.setSelectedItem(primaryNetworkType);
		DesignerPanel.couplerPanel.txtCSecondaryNetworkType.setText(secondaryNetworkType);
		DesignerPanel.couplerPanel.txtCMinimumPower.setText(Double.toString(minimumPower));
		DesignerPanel.couplerPanel.txtCMaximumPower.setText(Double.toString(maximumPower));
		DesignerPanel.couplerPanel.txtCEfficiencyPrimary.setText(Double.toString(primaryNetworkEfficiency));
		DesignerPanel.couplerPanel.txtCEfficiencySecondary.setText(Double.toString(secondaryNetworkEfficiency));
		DesignerPanel.couplerPanel.txtCCost.setText(Double.toString(cost));
		DesignerPanel.couplerPanel.txtCCOEmission.setText(Double.toString(coEmission));

		DesignerPanel.cl.show(DesignerPanel.pl_comp_detail, "coupler");
	}
}
