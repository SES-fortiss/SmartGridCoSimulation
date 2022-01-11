package memap.helper.milp;

import memap.controller.TopologyController;
import memap.helper.EnergyPrices;
import memap.main.TopologyConfig;
import memap.messages.BuildingMessage;
import memap.messages.planning.CouplerMessage;
import memap.messages.planning.ProducerMessage;
import memap.messages.planning.StorageMessage;

public class MILPProblem {

	/** Reference to topologyController ancestor */
	protected TopologyController topologyController;
	/** Reference to topology configuration */
	protected TopologyConfig topologyConfig = TopologyConfig.getInstance();
	/** Reference to energy prices */
	protected EnergyPrices energyPrices = EnergyPrices.getInstance();
	/** Time step for which the solver is created */
	protected int currentTimeStep;

	int nStepsMPC;
	int nCols;
	double[] lambdaCO2;
	double[] lambdaEUR;

	public MILPProblem(TopologyController topologyController, int currentTimeStep, int nStepsMPC, int nCols) {
		this.topologyController = topologyController;
		this.currentTimeStep = currentTimeStep;
		this.nStepsMPC = nStepsMPC;
		this.nCols = nCols;
		this.lambdaCO2 = new double[nCols];
		this.lambdaEUR = new double[nCols];
	}

	protected void updateLambdaCO2building(BuildingMessage bm, int indexBuilding) {

		int controllableHandled = 0;
		int volatileHandled = 0;
		int couplerHandled = 0;
		int storageHandled = 0;

		for (ProducerMessage producerMessage : bm.controllableProducerList) {
			for (int i = 0; i < nStepsMPC; i++) {
				int index = indexBuilding + i + nStepsMPC * (controllableHandled * 2);
				lambdaCO2[index] = producerMessage.operationalCostCO2;
				lambdaCO2[index + nStepsMPC] = 0;
			}
			controllableHandled++;
		}

		for (ProducerMessage producerMessage : bm.volatileProducerList) {
			for (int i = 0; i < nStepsMPC; i++) {
				int index = indexBuilding + i + nStepsMPC * ((controllableHandled * 2) + volatileHandled);
				lambdaCO2[index] = producerMessage.operationalCostCO2;
			}
			volatileHandled++;
		}

		for (CouplerMessage couplerMessage : bm.couplerList) {
			for (int i = 0; i < nStepsMPC; i++) {
				int index = indexBuilding + i
						+ nStepsMPC * ((controllableHandled * 2) + volatileHandled + (couplerHandled * 2));
				lambdaCO2[index] = couplerMessage.operationalCostCO2;
				lambdaCO2[index + nStepsMPC] = 0;
			}
			couplerHandled++;
		}

		for (StorageMessage storageMessage : bm.storageList) {
			for (int i = 0; i < nStepsMPC; i++) {
				int index = indexBuilding + i + nStepsMPC
						* ((controllableHandled * 2) + volatileHandled + (couplerHandled * 2) + (storageHandled * 2));
				lambdaCO2[index] = storageMessage.operationalCostCO2;
				lambdaCO2[index + nStepsMPC] = storageMessage.operationalCostCO2;
			}
			storageHandled++;
		}
	}

	protected void updateLambdaCO2Market() {
		/* Markets */
		int cts = currentTimeStep;
		for (int i = 0; i < nStepsMPC; i++) {
			int index = nCols - 2 * nStepsMPC + i;
			lambdaCO2[index] = energyPrices.getCO2EmissionFactor(cts + i);					
			lambdaCO2[index + nStepsMPC] = -energyPrices.getCO2EmissionFactor(cts + i); // selling and avoiding emissions
		}
	}

	public double[] getLambdaCO2() {
		return lambdaCO2;
	}

	protected void updateLambdaEURbuilding(BuildingMessage bm, int indexBuilding) {

		int controllableHandled = 0;
		int volatileHandled = 0;
		int couplerHandled = 0;
		int storageHandled = 0;

		for (ProducerMessage producerMessage : bm.controllableProducerList) {
			for (int i = 0; i < nStepsMPC; i++) {
				int index = indexBuilding + i + nStepsMPC * (controllableHandled * 2);
				lambdaEUR[index] = producerMessage.operationalCostEUR;
				lambdaEUR[index + nStepsMPC] = 0;
			}
			controllableHandled++;
		}

		for (ProducerMessage producerMessage : bm.volatileProducerList) {
			for (int i = 0; i < nStepsMPC; i++) {
				int index = indexBuilding + i + nStepsMPC * ((controllableHandled * 2) + volatileHandled);
				lambdaEUR[index] = producerMessage.operationalCostEUR;
			}
			volatileHandled++;
		}

		for (CouplerMessage couplerMessage : bm.couplerList) {
			for (int i = 0; i < nStepsMPC; i++) {
				int index = indexBuilding + i
						+ nStepsMPC * ((controllableHandled * 2) + volatileHandled + (couplerHandled * 2));
				lambdaEUR[index] = couplerMessage.operationalCostEUR;
				lambdaEUR[index + nStepsMPC] = 0;
			}
			couplerHandled++;
		}

		for (StorageMessage storageMessage : bm.storageList) {
			for (int i = 0; i < nStepsMPC; i++) {
				int index = indexBuilding + i + nStepsMPC
						* ((controllableHandled * 2) + volatileHandled + (couplerHandled * 2) + (storageHandled * 2));
				lambdaEUR[index] = storageMessage.operationalCostEUR;
				lambdaEUR[index + nStepsMPC] = storageMessage.operationalCostEUR;
			}
			storageHandled++;
		}
	}

	protected void updateLambdaEURMarket() {
		/* Markets */
		int cts = currentTimeStep;
		for (int i = 0; i < nStepsMPC; i++) {
			int index = nCols - 2 * nStepsMPC + i;
			lambdaEUR[index] = energyPrices.getElecBuyingPrice(cts + i);
			lambdaEUR[index + nStepsMPC] = -energyPrices.getElecSellingPrice(cts + i);
		}
	}

	public double[] getLambdaEUR() {
		return lambdaEUR;
	}

}
