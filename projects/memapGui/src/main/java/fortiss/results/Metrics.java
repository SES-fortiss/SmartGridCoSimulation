package fortiss.results;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import fortiss.components.Building;
import fortiss.components.Controllable;
import fortiss.components.Coupler;
import fortiss.components.Storage;
import fortiss.components.Volatile;
import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;
import memap.media.Strings;

public abstract class Metrics {

	protected String context;
	protected ResultsLibrary detailedResult;
	protected ResultsLibrary overviewResult;
	protected int nTimeSteps;

	protected double cost;
	protected double co2emissions;
	protected double heatDemand;
	protected double heatProduction;
	protected double heatCharge;
	protected double heatDischarge;
	protected double heatBuy;
	protected double heatSell;
	protected double electricityDemand;
	protected double electricityProduction;
	protected double electricityCharge;
	protected double electricityDischarge;
	protected double electricityBuy;
	protected double electricitySell;

	protected HashMap<String, ArrayList<Double>> heatProducedBySourceInTime;
	protected HashMap<String, ArrayList<Double>> heatChargedByStorageInTime;
	protected HashMap<String, ArrayList<Double>> heatDischargedByStorageInTime;
	protected HashMap<String, ArrayList<Double>> electricityProducedBySourceInTime;
	protected HashMap<String, ArrayList<Double>> electricityChargedByStorageInTime;
	protected HashMap<String, ArrayList<Double>> electricityDischargedByStorageInTime;

	public Metrics(String context, ResultsLibrary detailedResult, ResultsLibrary overviewResult) {
		this.context = context;
		this.detailedResult = detailedResult;
		this.overviewResult = overviewResult;

		Parameters pars = PlanningTool.getInstance().getParameters();
		nTimeSteps = pars.getDays() * pars.getStepsPerDay();
		cost = 0;
		co2emissions = 0;
		heatDemand = 0;
		heatProduction = 0;
		heatCharge = 0;
		heatDischarge = 0;
		heatBuy = 0;
		heatSell = 0;
		electricityDemand = 0;
		electricityProduction = 0;
		electricityCharge = 0;
		electricityDischarge = 0;
		electricityBuy = 0;
		electricitySell = 0;
		heatProducedBySourceInTime = new HashMap<String, ArrayList<Double>>();
		heatChargedByStorageInTime = new HashMap<String, ArrayList<Double>>();
		heatDischargedByStorageInTime = new HashMap<String, ArrayList<Double>>();
		electricityProducedBySourceInTime = new HashMap<String, ArrayList<Double>>();
		electricityChargedByStorageInTime = new HashMap<String, ArrayList<Double>>();
		electricityDischargedByStorageInTime = new HashMap<String, ArrayList<Double>>();

		// These methods are called always first
		setHeatProducedBySourceInTime();
		setHeatChargedBySourceInTime();
		setHeatDischargedBySourceInTime();
		setElectricityProducedBySourceInTime();
		setElectricityChargedBySourceInTime();
		setElectricityDischargedBySourceInTime();

		// These methods are called always second
		setCost();
		setCo2emissions();
		setHeatDemand();
		setHeatProduction();
		setHeatCharge();
		setHeatDischarge();
		setHeatBuy();
		setHeatSell();
		setElectricityDemand();
		setElectricityProduction();
		setElectricityCharge();
		setElectricityDischarge();
		setElectricityBuy();
		setElectricitySell();
	}

	public ArrayList<Double> getTime() {
		return detailedResult.getDataSeries(context, Strings.timeStep);
	}

	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost() {
		ArrayList<Double> costInTime = detailedResult.getDataSeries(context, Strings.totalCostAndUnit);
		this.cost = costInTime.get(costInTime.size() - 1);
	}

	/**
	 * @return the co2emissions
	 */
	public double getCo2emissions() {
		return co2emissions;
	}

	/**
	 * @param co2emissions the co2emissions to set
	 */
	public void setCo2emissions() {
		ArrayList<Double> co2emissionsInTime = detailedResult.getDataSeries(context, Strings.co2EmissionsAndUnit);
		this.co2emissions = co2emissionsInTime.get(co2emissionsInTime.size() - 1);
	}

	/**
	 * @return the heatDemand
	 */
	public double getHeatDemand() {
		return heatDemand;
	}

	/**
	 * @return the heat demand in time
	 */
	public ArrayList<Double> getHeatDemandInTime() {
		return detailedResult.getDataSeries(context, Strings.heatDemand);
	}

	/**
	 * @param heatDemand the heatDemand to set
	 */
	public void setHeatDemand() {
		heatDemand = convertPowerIntoEnergy(getHeatDemandInTime());
	}

	/**
	 * @return the heatProduction. Heat production is a metric that includes the
	 *         heat produced by couplers, controllable producers and volatile
	 *         produces. This metric does not account for the heat contributed by
	 *         storages (See {@link #getHeatContributionInTime()}).
	 */
	public double getHeatProduction() {
		return heatProduction;
	}

	/**
	 * Set heatProduction
	 */
	public void setHeatProduction() {
		heatProduction = convertPowerIntoEnergy(getTotalsByTimeStep(heatProducedBySourceInTime, nTimeSteps));
	}

	/**
	 * @return heatDischarge in time (Power). Heat discharge is a metric that sums
	 *         up the heat contributed by storages.
	 */
	public ArrayList<Double> getHeatDischargeInTime() {
		return getTotalsByTimeStep(heatDischargedByStorageInTime, nTimeSteps);
	}

	/**
	 * @return the heatCharge
	 */
	public double getHeatCharge() {
		return heatCharge;
	}

	/**
	 * @param heatCharge the heatCharge to set
	 */
	public void setHeatCharge() {
		heatCharge = convertPowerIntoEnergy(getTotalsByTimeStep(heatChargedByStorageInTime, nTimeSteps));
	}

	/**
	 * @return the heatDischarge
	 */
	public double getHeatDischarge() {
		return heatDischarge;
	}

	/**
	 * @param heatDischarge the heatDischarge to set
	 */
	public void setHeatDischarge() {
		heatDischarge = convertPowerIntoEnergy(getHeatDischargeInTime());
	}

	/**
	 * @return the heatBuy
	 */
	public double getHeatBuy() {
		return heatBuy;
	}

	/**
	 * @param heatBuy the heatBuy to set
	 */
	public void setHeatBuy() {
		heatBuy = 0;
	}

	/**
	 * @return the heatSell
	 */
	public double getHeatSell() {
		return heatSell;
	}

	/**
	 * @param heatSell the heatSell to set
	 */
	public void setHeatSell() {
		heatSell = 0;
	}

	/**
	 * @return the electricity demand in time
	 */
	public ArrayList<Double> getElectricityDemandInTime() {
		return detailedResult.getDataSeries(context, Strings.electricityDemand);
	}

	/**
	 * @return the electricityDemand
	 */
	public double getElectricityDemand() {
		return electricityDemand;
	}

	/**
	 * @param electricityDemand the electricityDemand to set
	 */
	public void setElectricityDemand() {
		electricityDemand = convertPowerIntoEnergy(getElectricityDemandInTime());
	}

	/**
	 * @return the electricityProduction. Electricity production is a metric that
	 *         includes the electricity produced by couplers, controllable producers
	 *         and volatile produces. This metric does not account for the
	 *         electricity contributed by storages (See
	 *         {@link #getElectricityContributionInTime()}).
	 */
	public double getElectricityProduction() {
		return electricityProduction;
	}

	/**
	 * @param electricityProduction the electricityProduction to set
	 */
	public void setElectricityProduction() {
		electricityProduction = convertPowerIntoEnergy(
				getTotalsByTimeStep(electricityProducedBySourceInTime, nTimeSteps));
	}

	/**
	 * @return electricityDischarge in time (Power). Electricity discharge is a
	 *         metric that sums up the electricity contributed by storages.
	 */
	public ArrayList<Double> getElectricityDischargeInTime() {
		return getTotalsByTimeStep(electricityDischargedByStorageInTime, nTimeSteps);
	}

	/**
	 * @return the electricityCharge
	 */
	public double getElectricityCharge() {
		return electricityCharge;
	}

	/**
	 * @param electricityCharge the electricityCharge to set
	 */
	public void setElectricityCharge() {
		electricityCharge = convertPowerIntoEnergy(getTotalsByTimeStep(electricityChargedByStorageInTime, nTimeSteps));
	}

	/**
	 * @return the electricityDischarge
	 */
	public double getElectricityDischarge() {
		return electricityDischarge;
	}

	/**
	 * @param electricityDischarge the electricityDischarge to set
	 */
	public void setElectricityDischarge() {
		electricityDischarge = convertPowerIntoEnergy(getElectricityDischargeInTime());
	}

	/**
	 * @return the electricityBuy
	 */
	public double getElectricityBuy() {
		return electricityBuy;
	}

	/**
	 * @param electricityBuy the electricityBuy to set
	 */
	public void setElectricityBuy() {
		this.electricityBuy = convertPowerIntoEnergy(detailedResult.getDataSeries(context, Strings.elecBuy));
	}

	/**
	 * @return the electricitySell
	 */
	public double getElectricitySell() {
		return electricitySell;
	}

	/**
	 * @param electricitySell the electricitySell to set
	 */
	public void setElectricitySell() {
		this.electricitySell = convertPowerIntoEnergy(detailedResult.getDataSeries(context, Strings.elecSell));
	}

	/**
	 * @return the heatProducedBySourceInTime
	 */
	public HashMap<String, ArrayList<Double>> getHeatProducedBySourceInTime() {
		return heatProducedBySourceInTime;
	}

	/**
	 * @param heatProducedBySourceInTime the heatProducedBySourceInTime to set
	 */
	public abstract void setHeatProducedBySourceInTime();

	/**
	 * @return the heatProducedInTime
	 */
	public ArrayList<Double> getHeatProducedInTime() {
		return getTotalsByTimeStep(heatProducedBySourceInTime, nTimeSteps);
	}

	/**
	 * @return the heatProducedBySource
	 */
	public HashMap<String, Number> getHeatProducedBySource() {
		return getTotalsByElement(heatProducedBySourceInTime);
	}

	/**
	 * @return the heatDischargedByStorageInTime
	 */
	public HashMap<String, ArrayList<Double>> getHeatDischargedBySourceInTime() {
		return heatDischargedByStorageInTime;
	}

	/**
	 * @param heatDischargedByStorageInTime the heatDischargedByStorageInTime to set
	 */
	public abstract void setHeatDischargedBySourceInTime();

	/**
	 * @return the heatChargedByStorageInTime
	 */
	public HashMap<String, ArrayList<Double>> getHeatChargedBySourceInTime() {
		return heatChargedByStorageInTime;
	}

	/**
	 * @param heatChargedByStorageInTime the heatChargedByStorageInTime to set
	 */
	public abstract void setHeatChargedBySourceInTime();

	/**
	 * @return the electricityProducedBySourceInTime
	 */
	public HashMap<String, ArrayList<Double>> getElectricityProducedBySourceInTime() {
		return electricityProducedBySourceInTime;
	}

	/**
	 * @param electricityProducedBySourceInTime the
	 *                                          electricityProducedBySourceInTime to
	 *                                          set
	 */
	public abstract void setElectricityProducedBySourceInTime();

	/**
	 * @return the electricityProducedInTime
	 */
	public ArrayList<Double> getElectricityProducedInTime() {
		return getTotalsByTimeStep(electricityProducedBySourceInTime, nTimeSteps);
	}

	/**
	 * @return the electricityProducedBySource
	 */
	public HashMap<String, Number> getElectricityProducedBySource() {
		return getTotalsByElement(electricityProducedBySourceInTime);
	}

	/**
	 * @return the electricityDischargedByStorageInTime
	 */
	public HashMap<String, ArrayList<Double>> getElectricityDischargedBySourceInTime() {
		return electricityDischargedByStorageInTime;
	}

	/**
	 * @param electricityDischargedByStorageInTime the
	 *                                             electricityDischargedByStorageInTime
	 *                                             to set
	 */
	public abstract void setElectricityDischargedBySourceInTime();

	/**
	 * @return the electricityChargedByStorageInTime
	 */
	public HashMap<String, ArrayList<Double>> getElectricityChargedBySourceInTime() {
		return electricityChargedByStorageInTime;
	}

	/**
	 * @param electricityChargedByStorageInTime the
	 *                                          electricityChargedByStorageInTime to
	 *                                          set
	 */
	public abstract void setElectricityChargedBySourceInTime();

	public HashMap<String, Number> getHeatChargedByStorage() {
		return getTotalsByElement(heatChargedByStorageInTime);
	}

	public HashMap<String, Number> getHeatDischargedByStorage() {
		return getTotalsByElement(heatDischargedByStorageInTime);
	}

	public HashMap<String, Number> getElectricityChargedByStorage() {
		return getTotalsByElement(electricityChargedByStorageInTime);
	}

	public HashMap<String, Number> getElectricityDischargedByStorage() {
		return getTotalsByElement(electricityDischargedByStorageInTime);
	}

	public HashMap<String, Number> getEnergyProducedBySource() {
		HashMap<String, Number> energyProducedBySource = new HashMap<String, Number>();
		HashMap<String, Number> electricityProducedBySource = getElectricityProducedBySource();
		HashMap<String, Number> heatProducedBySource = getHeatProducedBySource();

		for (Entry<String, Number> source : electricityProducedBySource.entrySet()) {
			energyProducedBySource.put(source.getKey() + " (Elec.)", source.getValue());
		}

		for (Entry<String, Number> source : heatProducedBySource.entrySet()) {
			energyProducedBySource.put(source.getKey() + " (Heat)", source.getValue());
		}
		return energyProducedBySource;
	}

	protected ArrayList<Double> getTotalsByTimeStep(HashMap<String, ArrayList<Double>> map, int numberOfTimeSteps) {
		ArrayList<Double> totals = new ArrayList<Double>(Collections.nCopies(numberOfTimeSteps, 0.0));
		
		for (Entry<String, ArrayList<Double>> componentEntry : map.entrySet()) { 
			ArrayList<Double> total = componentEntry.getValue();
			
			// Question can the map size change during runtime? make it immutable?			
			//for (int i = 0; i < total.size(); i++) {
			for (int i = 0; i < numberOfTimeSteps; i++) {
				totals.set(i, totals.get(i) + total.get(i));
			}
		}
		return totals;
	}

	protected HashMap<String, Number> getTotalsByElement(HashMap<String, ArrayList<Double>> map) {
		HashMap<String, Number> totals = new HashMap<String, Number>();
		for (Entry<String, ArrayList<Double>> componentEntry : map.entrySet()) {
			String componentName = componentEntry.getKey();
			double total = convertPowerIntoEnergy(map.get(componentName));
			totals.put(componentName, total);
		}
		return totals;
	}

	protected ArrayList<Double> sumListValues(ArrayList<Double> list1, ArrayList<Double> list2) {
		ArrayList<Double> result = (ArrayList<Double>) IntStream.range(0, list1.size())
				.mapToObj(i -> list1.get(i) + list2.get(i)).collect(Collectors.toList());
		return result;
	}

	/**
	 * @returns the sum of the elements data
	 * @param data an ArrayList of Double elements
	 */
	protected double sum(ArrayList<Double> data) {
		return data.stream().mapToDouble(Double::doubleValue).sum();
	}

	protected ArrayList<Double> abs(ArrayList<Double> data) {
		ArrayList<Double> positiveData = new ArrayList<Double>();
		// TODO the returned data is null, because the heat source "H_name" is not available in the detailed resource data structure...
		for (Double value : data) {
			positiveData.add(Math.abs(value));
		}
		return positiveData;
	}

	/**
	 * @returns the sum of the elements data
	 * @param data an ArrayList of Double elements
	 */
	protected double average(ArrayList<Double> data) {
		return data.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
	}

	/**
	 * @returns the sum of the elements data
	 * @param data a collection of Number elements
	 */
	protected double sum(Collection<Number> data) {
		return data.stream().mapToDouble(Number::doubleValue).sum();
	}

	/**
	 * @returns the total electricity contributed (produced or given) per time step
	 *          by a component
	 * @param entryName     the name of a building if the context is per building
	 *                      optimization or {@link Strings#memapOnModeName}
	 * @param componentName the name of a component
	 */
	protected ArrayList<Double> getElectricityContributedBy(String entryName, String componentName) {
		return abs(overviewResult.getDataSeries(entryName, "E_" + componentName));
	}

	/**
	 * @returns the total heat produced by a component
	 * @param entryName     the name of a building if the context is per building
	 *                      optimization or {@link Strings#memapOnModeName}
	 * @param componentName the name of a component
	 */
	protected ArrayList<Double> getHeatContributedBy(String entryName, String componentName) {
		return abs(overviewResult.getDataSeries(entryName, "H_" + componentName));
	}

	/**
	 * Calculate the heat produced by the components of a building according to the
	 * context (simulation mode). The components are:
	 * <ul>
	 * <li>producers: capable of producing energy, ie. volatile producers,
	 * controllable producers and couplers</li>
	 * </ul>
	 * 
	 * @param context  {@link Strings#memapOnModeName} or the name of a building
	 *                 (which corresponds to per building optimization)
	 * @param building the name of the building under examination
	 */
	protected HashMap<String, ArrayList<Double>> calculateHeatProductionBySourceInTime(String context,
			Building building) {

		HashMap<String, ArrayList<Double>> heatProductionBySourceInTime = new HashMap<String, ArrayList<Double>>();

		if (building != null) {
			for (Coupler coupler : building.getCoupler()) {
				ArrayList<Double> heatContributedPerTimeStep = getHeatContributedBy(context, coupler.getFormattedName());
				heatProductionBySourceInTime.put(building.getName() + " - " + coupler.getName(),
						heatContributedPerTimeStep);
			}
			for (Volatile volatileProducer : building.getVolatile()) {
				ArrayList<Double> heatContributedPerTimeStep = getHeatContributedBy(context,
						volatileProducer.getFormattedName());
				heatProductionBySourceInTime.put(building.getName() + " - " + volatileProducer.getName(),
						heatContributedPerTimeStep);
			}
			for (Controllable controllableProducer : building.getControllable()) {
				ArrayList<Double> heatContributedPerTimeStep = getHeatContributedBy(context,
						controllableProducer.getFormattedName());
				heatProductionBySourceInTime.put(building.getName() + " - " + controllableProducer.getName(),
						heatContributedPerTimeStep);
			}
		}
		return heatProductionBySourceInTime;
	}

	/**
	 * Calculate the electricity produced by the components of a building according
	 * to the context (simulation mode). The components are:
	 * <ul>
	 * <li>producers: capable of producing energy, ie. volatile producers,
	 * controllable producers and couplers</li>
	 * </ul>
	 * 
	 * @param context  {@link Strings#memapOnModeName} or the name of a building
	 *                 (which corresponds to per building optimization)
	 * @param building the name of the building under examination
	 */
	protected HashMap<String, ArrayList<Double>> calculateElectricityProductionBySourceInTime(String context,
			Building building) {

		HashMap<String, ArrayList<Double>> electricityProductionBySourceInTime = new HashMap<String, ArrayList<Double>>();

		if (building != null) {
			for (Coupler coupler : building.getCoupler()) {
				ArrayList<Double> electricityContributedPerTimeStep = getElectricityContributedBy(context,
						coupler.getFormattedName());
				electricityProductionBySourceInTime.put(building.getName() + " - " + coupler.getName(),
						electricityContributedPerTimeStep);
			}
			for (Volatile volatileProducer : building.getVolatile()) {
				ArrayList<Double> electricityContributedPerTimeStep = getElectricityContributedBy(context,
						volatileProducer.getFormattedName());
				electricityProductionBySourceInTime.put(building.getName() + " - " + volatileProducer.getName(),
						electricityContributedPerTimeStep);
			}
			for (Controllable controllableProducer : building.getControllable()) {
				ArrayList<Double> electricityContributedPerTimeStep = getElectricityContributedBy(context,
						controllableProducer.getFormattedName());
				electricityProductionBySourceInTime.put(building.getName() + " - " + controllableProducer.getName(),
						electricityContributedPerTimeStep);
			}
		}
		return electricityProductionBySourceInTime;
	}

	/**
	 * Calculate the heat discharged by the storage components of a building
	 * according to the context (simulation mode). The components are:
	 * <ul>
	 * <li>storages: capable of contributed previously stored energy.</li>
	 * </ul>
	 * 
	 * @param context  {@link Strings#memapOnModeName} or the name of a building
	 *                 (which corresponds to per building optimization)
	 * @param building the name of the building under examination
	 */
	protected HashMap<String, ArrayList<Double>> calculateHeatDischargeByStorageInTime(String context,
			Building building) {
		HashMap<String, ArrayList<Double>> heatDischargedByStorageInTime = new HashMap<String, ArrayList<Double>>();
		for (Storage storage : building.getStorage()) {
			heatDischargedByStorageInTime.put(building.getName() + " - " + storage.getName(),
					getHeatContributedBy(context, storage.getFormattedName() + "_Discharge"));
		}
		return heatDischargedByStorageInTime;
	}

	/**
	 * Calculate the electricity discharged by the storage components of a building
	 * according to the context (simulation mode). The components are:
	 * <ul>
	 * <li>storages: capable of contributed previously stored energy.</li>
	 * </ul>
	 * 
	 * @param context  {@link Strings#memapOnModeName} or the name of a building
	 *                 (which corresponds to per building optimization)
	 * @param building the name of the building under examination
	 */
	protected HashMap<String, ArrayList<Double>> calculateElectricityDischargeByStorageInTime(String context,
			Building building) {
		HashMap<String, ArrayList<Double>> electricityDischargedByStorageInTime = new HashMap<String, ArrayList<Double>>();
		for (Storage storage : building.getStorage()) {
			electricityDischargedByStorageInTime.put(building.getName() + " - " + storage.getName(),
					getElectricityContributedBy(context, storage.getFormattedName() + "_Discharge"));
		}
		return electricityDischargedByStorageInTime;
	}

	/**
	 * Calculate the heat charged by the storage components of a building according
	 * to the context (simulation mode). The components are:
	 * <ul>
	 * <li>storages: capable of contributed previously stored energy.</li>
	 * </ul>
	 * 
	 * @param context  {@link Strings#memapOnModeName} or the name of a building
	 *                 (which corresponds to per building optimization)
	 * @param building the name of the building under examination
	 */
	protected HashMap<String, ArrayList<Double>> calculateHeatChargeByStorageInTime(String context, Building building) {
		HashMap<String, ArrayList<Double>> heatChargedByStorageInTime = new HashMap<String, ArrayList<Double>>();
		for (Storage storage : building.getStorage()) {
			heatChargedByStorageInTime.put(building.getName() + " - " + storage.getName(),
					getHeatContributedBy(context, storage.getFormattedName() + "_Charge"));
		}
		return heatChargedByStorageInTime;
	}

	/**
	 * Calculate the electricity charged by the storage components of a building
	 * according to the context (simulation mode). The components are:
	 * <ul>
	 * <li>storages: capable of contributed previously stored energy.</li>
	 * </ul>
	 * 
	 * @param context  {@link Strings#memapOnModeName} or the name of a building
	 *                 (which corresponds to per building optimization)
	 * @param building the name of the building under examination
	 */
	protected HashMap<String, ArrayList<Double>> calculateElectricityChargeByStorageInTime(String context,
			Building building) {
		HashMap<String, ArrayList<Double>> electricityChargedByStorageInTime = new HashMap<String, ArrayList<Double>>();
		for (Storage storage : building.getStorage()) {
			electricityChargedByStorageInTime.put(building.getName() + " - " + storage.getName(),
					getElectricityContributedBy(context, storage.getFormattedName() + "_Charge"));
		}
		return electricityChargedByStorageInTime;
	}

	/**
	 * Converts power into energy (kW --> kWh)
	 */
	protected double convertPowerIntoEnergy(ArrayList<Double> powerSeries) {
		double averagePower = average(powerSeries);
		int days = PlanningTool.getInstance().getParameters().getDays();
		return averagePower * days * 24.0;
	}
}
