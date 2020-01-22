package fortiss.gui.listeners.helper;

import fortiss.gui.Designer;
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
		Designer.parameterPanel.pars = par;
		Designer.parameterPanel.update();
	}

	/**
	 * Updates and shows the data of the selected building.
	 */
	public void updateEmsData(String name, String port) {
		Designer.pl_ems_detail.txtBName.setText(name);
		Designer.pl_ems_detail.txtBPort.setText(port);

		Designer.cl.show(Designer.pl_comp_detail, "building");
	}

	/**
	 * Updates and shows the data of the selected demand.
	 */
	public void updateDemandData(String name, String consumption) {
		Designer.demandPanel.txtDName.setText(name);
		Designer.demandPanel.txtDConsumption.setText(consumption);
		Designer.demandPanel.plotPanel.clearSeries();
		Designer.demandPanel.setData(consumption);
		Designer.cl.show(Designer.pl_comp_detail, "demand");
	}

	/**
	 * Updates and shows the data of the selected storage.
	 */
	public void updateStorageData(String name, String networkType, double capacity, double soc, double maxCharging,
			double maxDRate, double chargeE, double dischargeE) {
		Designer.storagePanel.txtSName.setText(name);
		Designer.storagePanel.sSNetworkType.setSelectedItem(networkType);
		Designer.storagePanel.txtSCapacity.setText(Double.toString(capacity));
		Designer.storagePanel.txtSStateOfCharge.setText(Double.toString(soc));
		Designer.storagePanel.txtSMaxCharge.setText(Double.toString(maxCharging));
		Designer.storagePanel.txtSMaxDischarge.setText(Double.toString(maxDRate));
		Designer.storagePanel.txtSEffIN.setText(Double.toString(chargeE));
		Designer.storagePanel.txtSEffOUT.setText(Double.toString(dischargeE));

		Designer.cl.show(Designer.pl_comp_detail, "storage");
	}

	/**
	 * Updates and shows the data of the selected volatile.
	 */
	public void updateVolProductionData(String producer, String networktype, double minimumPower, double maximumPower,
			String forcastFile, double cost, double coEmission) {
		Designer.volatilePanel.txtVName.setText(producer);
		Designer.volatilePanel.sVNetworkType.setSelectedItem(networktype);
		Designer.volatilePanel.txtVMinimumPower.setText(Double.toString(minimumPower));
		Designer.volatilePanel.txtVMaximumPower.setText(Double.toString(maximumPower));
		Designer.volatilePanel.txtVForecastFile.setText(forcastFile);
		Designer.volatilePanel.txtVCost.setText(Double.toString(cost));
		Designer.volatilePanel.txtVCOEmission.setText(Double.toString(coEmission));

		Designer.cl.show(Designer.pl_comp_detail, "volProduction");
	}

	/**
	 * Updates and shows the data of the selected controllable.
	 */
	public void updateContProductionData(String producer, String networkType, double minimumPower, double maximumPower,
			double efficiency, double cost, double coEmission) {
		Designer.controllablePanel.txtCPName.setText(producer);
		Designer.controllablePanel.sCPNetworkType.setSelectedItem(networkType);
		Designer.controllablePanel.txtCPMinimumPower.setText(Double.toString(minimumPower));
		Designer.controllablePanel.txtCPMaximumPower.setText(Double.toString(maximumPower));
		Designer.controllablePanel.txtCPEfficiency.setText(Double.toString(efficiency));
		Designer.controllablePanel.txtCPCost.setText(Double.toString(cost));
		Designer.controllablePanel.txtCPCOEmission.setText(Double.toString(coEmission));

		Designer.cl.show(Designer.pl_comp_detail, "contProduction");
	}

	/**
	 * Updates and shows the data of the selected coupler.
	 */
	public void updateCouplerData(String name, String primaryNetworkType, String secondaryNetworkType,
			double minimumPower, double maximumPower, double primaryNetworkEfficiency,
			double secondaryNetworkEfficiency, double cost, double coEmission) {
		Designer.couplerPanel.txtCName.setText(name);
		Designer.couplerPanel.sCPrimaryNetworkType.setSelectedItem(primaryNetworkType);
		Designer.couplerPanel.txtCSecondaryNetworkType.setText(secondaryNetworkType);
		Designer.couplerPanel.txtCMinimumPower.setText(Double.toString(minimumPower));
		Designer.couplerPanel.txtCMaximumPower.setText(Double.toString(maximumPower));
		Designer.couplerPanel.txtCEfficiencyPrimary.setText(Double.toString(primaryNetworkEfficiency));
		Designer.couplerPanel.txtCEfficiencySecondary.setText(Double.toString(secondaryNetworkEfficiency));
		Designer.couplerPanel.txtCCost.setText(Double.toString(cost));
		Designer.couplerPanel.txtCCOEmission.setText(Double.toString(coEmission));

		Designer.cl.show(Designer.pl_comp_detail, "coupler");
	}
}
