package memap.helper.milp;

import akka.systemActors.GlobalTime;
import memap.main.TopologyConfig;
import memap.messages.BuildingMessage;
import memap.messages.planning.CouplerMessage;
import memap.messages.planning.ProducerMessage;
import memap.messages.planning.StorageMessage;

public class MILPProblem {
	
	int nStepsMPC;
	int nCols;
	double[] lambdaCO2;
	double[] lambdaEUR;
	
	public MILPProblem(int nStepsMPC, int nCols) {
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
      
		for(ProducerMessage producerMessage : bm.controllableProducerList) {					
			for (int i = 0; i < nStepsMPC; i++) {		
				int index = indexBuilding + i + nStepsMPC * (controllableHandled * 2);
				lambdaCO2[index] = producerMessage.operationalCostCO2;
				lambdaCO2[index + nStepsMPC] = 0;
			}
			controllableHandled++;
		}
		
		for(ProducerMessage producerMessage : bm.volatileProducerList) {
			for (int i = 0; i < nStepsMPC; i++) {			
				int index = indexBuilding+i + nStepsMPC * ( (controllableHandled * 2) + volatileHandled);
				lambdaCO2[index] = producerMessage.operationalCostCO2;
			}
			volatileHandled++;
		}
		
		for(CouplerMessage couplerMessage : bm.couplerList) {
			for (int i = 0; i < nStepsMPC; i++) {			
				int index = indexBuilding+i + nStepsMPC * ( (controllableHandled * 2) + volatileHandled + (couplerHandled *2));
				lambdaCO2[index] = couplerMessage.operationalCostCO2;
				lambdaCO2[index + nStepsMPC] = 0;
			}
			couplerHandled++;
		}
		
		for(StorageMessage storageMessage : bm.storageList) {
			for (int i = 0; i < nStepsMPC; i++) {			
				int index = indexBuilding+i + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled * 2)  );
				lambdaCO2[index] = storageMessage.operationalCostCO2;
				lambdaCO2[index+ nStepsMPC] = storageMessage.operationalCostEUR;
			}
			storageHandled++;
		}
	}
	
	protected void updateLambdaCO2Market() {
		/* Markets */	
		for (int i = 0; i < nStepsMPC; i++) {			
			int index = nCols - 2*nStepsMPC + i;
			lambdaCO2[index] = 0.474; // buying --> TODO improve maybe later
			lambdaCO2[index+ nStepsMPC] = 0; // selling (same as for LP)
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
    
		for(ProducerMessage producerMessage : bm.controllableProducerList) {					
			for (int i = 0; i < nStepsMPC; i++) {		
				int index = indexBuilding + i + nStepsMPC * (controllableHandled * 2);
				lambdaEUR[index] = producerMessage.operationalCostEUR;
				lambdaEUR[index + nStepsMPC] = 0;
			}
			controllableHandled++;
		}
		
		for(ProducerMessage producerMessage : bm.volatileProducerList) {
			for (int i = 0; i < nStepsMPC; i++) {			
				int index = indexBuilding+i + nStepsMPC * ( (controllableHandled * 2) + volatileHandled);
				lambdaEUR[index] = producerMessage.operationalCostEUR;
			}
			volatileHandled++;
		}
		
		for(CouplerMessage couplerMessage : bm.couplerList) {
			for (int i = 0; i < nStepsMPC; i++) {			
				int index = indexBuilding+i + nStepsMPC * ( (controllableHandled * 2) + volatileHandled + (couplerHandled *2));
				lambdaEUR[index] = couplerMessage.operationalCostEUR;
				lambdaEUR[index + nStepsMPC] = 0;
			}
			couplerHandled++;
		}
		
		for(StorageMessage storageMessage : bm.storageList) {
			for (int i = 0; i < nStepsMPC; i++) {			
				int index = indexBuilding+i + nStepsMPC * ((controllableHandled * 2)  + volatileHandled + (couplerHandled*2)+ (storageHandled * 2)  );
				lambdaEUR[index] = storageMessage.operationalCostEUR;
				lambdaEUR[index+ nStepsMPC] = storageMessage.operationalCostEUR;
			}
			storageHandled++;
		}
	}
	
	protected void updateLambdaEURMarket() {
		/* Markets */	
		int cts = GlobalTime.getCurrentTimeStep();		
		for (int i = 0; i < nStepsMPC; i++) {
			int index = nCols - 2*nStepsMPC + i;
			lambdaEUR[index] = TopologyConfig.energyPrices.getElectricityPriceInEuro(cts+i);
			lambdaEUR[index + nStepsMPC] = -TopologyConfig.energyPrices.getElectricityPriceInEuro(cts+i)*0.5;
		}	
	}
	
	public double[] getLambdaEUR() {		
		return lambdaEUR;
	}
	

}
