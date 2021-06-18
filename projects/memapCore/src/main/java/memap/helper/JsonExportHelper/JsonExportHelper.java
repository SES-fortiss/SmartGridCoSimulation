package memap.helper.JsonExportHelper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import memap.controller.TopologyController;
import memap.helper.EnergyPrices;
import memap.helperOPCua.OpcServerContextGenerator;
import memap.main.Simulation;
import memap.main.TopologyConfig;
import memap.messages.BuildingMessage;
import memap.messages.planning.CouplerMessage;
import memap.messages.planning.DemandMessage;
import memap.messages.planning.ProducerMessage;
import memap.messages.planning.StorageMessage;

public class JsonExportHelper {

	public static void exportMemapTopology(TopologyController topologyController, ArrayList<BasicAnswer> answerListReceived) {
		ArrayList<Object> list = new ArrayList<Object>();
		Set<BuildingJsonHelper> buildingSet = new HashSet<BuildingJsonHelper>();
		BuildingJsonHelper bjh = null;
		
		for (BasicAnswer basicAnswer : answerListReceived) {
			AnswerContent answerContent = basicAnswer.answerContent;
			if (answerContent instanceof BuildingMessage) {
				BuildingMessage bmsg = (BuildingMessage) answerContent;
									
				bjh = new BuildingJsonHelper(bmsg);
				
				for (DemandMessage dm : bmsg.demandList) {
					DemandJsonHelper djh = new DemandJsonHelper(dm);
					bjh.addDemand(djh);
				}
				for (CouplerMessage cm : bmsg.couplerList) {
					CouplerJsonHelper cjh = new CouplerJsonHelper(cm);
					bjh.addCoupler(cjh);
				}
				for (ProducerMessage pm : bmsg.controllableProducerList) {
					ProducerJsonHelper pjh = new ProducerJsonHelper(pm);
					bjh.addContProduction(pjh);
				}
				for (ProducerMessage vpm : bmsg.volatileProducerList) {
					VolatileJsonHelper vjh = new VolatileJsonHelper(vpm);
					bjh.addVolProduction(vjh);
				}
				for (StorageMessage sm : bmsg.storageList) {
					StorageJsonHelper sjh = new StorageJsonHelper(sm);
					bjh.addStorage(sjh);
				}
			}
		buildingSet.add(bjh);
		}
		list.add(buildingSet);
		
		Set<Object> connections = new HashSet<Object>();
		list.add(connections);
		
		Set<ParameterJsonHelper> parameterSet = new HashSet<ParameterJsonHelper>();
		ParameterJsonHelper paramjh = new ParameterJsonHelper(
				TopologyConfig.getInstance().getTimeStepsPerDay(),
				Simulation.N_STEPS_MPC,
				TopologyConfig.getInstance().getNrDays(),
				topologyController.getOptimizationCriteria().toString(),
				topologyController.getOptimizer().toString(),
				topologyController.getLogging().toString(),
				new PriceJsonHelper(true, EnergyPrices.getInstance().getElecBuyingPrice(0), "", Simulation.N_STEPS_MPC),   // elecBuyingPrice
				new PriceJsonHelper(true, EnergyPrices.getInstance().getElecSellingPrice(0), "", Simulation.N_STEPS_MPC),  // elecSellingPrice
				new PriceJsonHelper(true, EnergyPrices.getInstance().getHeatBuyingPrice(0), "", Simulation.N_STEPS_MPC),  // heatBuyingPrice
				new PriceJsonHelper(true, 0.404, "", Simulation.N_STEPS_MPC)  // co2Emissions
				);
		parameterSet.add(paramjh);
		list.add(parameterSet);

		OpcServerContextGenerator.generateJson("ExportForPlanningTool", list);
	}
	

}
