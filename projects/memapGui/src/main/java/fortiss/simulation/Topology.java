package fortiss.simulation;

import java.util.ArrayList;
import java.util.Iterator;

import fortiss.components.Building;
import fortiss.components.Controllable;
import fortiss.components.Coupler;
import fortiss.components.Demand;
import fortiss.components.Storage;
import fortiss.components.Volatile;
import fortiss.gui.Designer;
import memap.ActorFactory;
import memap.MemapConfig;
import topology.ActorTopology;

/**
 * Creates a topology from user design
 */
public class Topology {

	/**
	 * Model Predictive Control (MPC) Parameters not set by user
	 * 
	 * @par PREDICTION_UNCERTAINTY
	 * @par NR_OF_CONSUMERS
	 * @par MEMAP_LDHeating
	 * @par HEAT_LOSSES
	 * @par PORT_UNDEFINED
	 */

	public static String simulationName = "InteractiveSimulation";
	public static int PREDICTION_UNCERTAINTY = 0;
	public static int NR_OF_CONSUMERS = 5;
	public static boolean MEMAP_LDHeating = false;
	public static double HEAT_LOSSES = 1.0;
	private static int PORT_UNDEFINED = 0;

	/**
	 * Creates a topology according to user design (GUI input). The following
	 * parameters are user inputs:
	 * 
	 * @par mpcInput N_STEPS_MPC
	 * @par memapActive MemapON
	 * @par buildings Array of building objects.
	 */
	public static ActorTopology createTopology(int mpcInput, boolean memapActive, ArrayList<Building> buildings) {

		MemapConfig.N_STEPS_MPC = mpcInput;
		MemapConfig.TIMESTEPS_PER_DAY = Designer.control.pars.getLength();
		MemapConfig.DAYS = Designer.control.pars.getDays();
		MemapConfig.NR_OF_ITERATIONS = MemapConfig.DAYS * MemapConfig.TIMESTEPS_PER_DAY;
		MemapConfig.N_STEPS = MemapConfig.NR_OF_ITERATIONS + MemapConfig.N_STEPS_MPC;
		MemapConfig.MEMAP_ON = memapActive;
		MemapConfig.NR_OF_CONSUMERS = NR_OF_CONSUMERS;
		MemapConfig.MEMAP_LDHeating = MEMAP_LDHeating;
		MemapConfig.HEAT_LOSSES = HEAT_LOSSES;

		ActorTopology top = new ActorTopology(simulationName);
		top.addActor(simulationName, ActorFactory.createLinProgBehavior());

		for (Iterator<Building> iterator = buildings.iterator(); iterator.hasNext();) {

			Building building = (Building) iterator.next();

			String buildingName = building.getName();

			ActorTopology buildingTopology = new ActorTopology(buildingName);
			buildingTopology.addActor(buildingName, ActorFactory.createBuilding(building.getPort(),
					building.isLdHeating(), building.getHeatTransportLength()));

			for (Demand demand : building.getDemand()) {
				buildingTopology.addActorAsChild(buildingName + "/" + demand.getName(), ActorFactory.createConsumer(
						demand.getConsumptionProfile(), demand.getNetworkType(), demand.getIndex(), PORT_UNDEFINED));
			}

			for (Storage storage : building.getStorage()) {
				if (storage.getNetworkType().contentEquals("Electricity")) {
					buildingTopology.addActorAsChild(buildingName + "/" + storage.getName(),
							ActorFactory.createBattery(storage.getCapacity(), storage.getMaxCharging(),
									storage.getMaxDischarging(), storage.getEffIN(), storage.getEffOUT(),
									PORT_UNDEFINED));
				} else if (storage.getNetworkType().contentEquals("Heat")) {
					buildingTopology.addActorAsChild(buildingName + "/" + storage.getName(),
							ActorFactory.createThermalStorage(storage.getCapacity(), storage.getMaxCharging(),
									storage.getMaxDischarging(), storage.getEffIN(), storage.getEffOUT(),
									PORT_UNDEFINED));
				} else {
					System.err.print(">> Unknown type. Storage can not be created.");
				}
			}

			for (Volatile volProduction : building.getVolatile()) {
				if (volProduction.getNetworkType().contentEquals("Electricity")) {
					buildingTopology.addActorAsChild(buildingName + "/" + volProduction.getName(),
							ActorFactory.createPV(volProduction.getPower(), volProduction.getCost(), PORT_UNDEFINED));
				} else if (volProduction.getNetworkType().contentEquals("Heat")) {
					buildingTopology.addActorAsChild(buildingName + "/" + volProduction.getName(), ActorFactory
							.createSolarThermic(volProduction.getPower(), volProduction.getCost(), PORT_UNDEFINED));
				} else {
					System.err.print(">> Unknown type. Volatile device can not be created.");
				}
			}

			for (Controllable controllable : building.getControllable()) {
				if (controllable.getNetworkType().contentEquals("Heat")) {
					buildingTopology.addActorAsChild(buildingName + "/" + controllable.getName(),
							ActorFactory.createGasBoiler(controllable.getPower(), controllable.getEfficiency(),
									controllable.getCost(), PORT_UNDEFINED));
				} else {
					System.err.print(">> Controllable production network of type electricity is not yet supported.");
				}
			}

			for (Coupler coupler : building.getCoupler()) {
				if (coupler.getNetworkTypeP().contentEquals("Heat")) {
					buildingTopology.addActorAsChild(buildingName + "/" + coupler.getName(),
							ActorFactory.createHeatPump(coupler.getPower(), coupler.getEfficiencyPrimary(),
									coupler.getEfficiencySecondary(), PORT_UNDEFINED));
				} else if (coupler.getNetworkTypeP().contentEquals("Electricity")) {
					buildingTopology.addActorAsChild(buildingName + "/" + coupler.getName(),
							ActorFactory.createCHP(coupler.getPower(), coupler.getEfficiencySecondary(),
									coupler.getEfficiencyPrimary(), PORT_UNDEFINED));
				} else {
					System.err.print(">> Unknown type. Coupler can not be created.");
				}
			}

			top.addSubTopology(simulationName, buildingTopology);
		}
		return top;
	}
}