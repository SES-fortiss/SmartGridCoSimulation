package memap.components;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import akka.systemActors.GlobalTime;
import behavior.BehaviorModel;
import memap.MemapConfig;
import memap.MemapTopology;
import memap.helper.HelperConcat;
import memap.helper.MatrixBuildup;
import memap.helper.MyTimeUnit;
import memap.helper.OptimizationProblem;
import memap.helper.OptimizationStarter;
import memap.helper.SolutionHandler;
import memap.messages.BuildingMessage;
import memap.messages.OptimizationResultMessage;

public class LinProgBehavior extends BehaviorModel {
	
	
	
	private long sleepTime = 0L;
	
	double[][] fullXVector = new double[MemapConfig.NR_OF_ITERATIONS][MemapConfig.N_STEPS];
	
	double[] costForTimestepAllBuildings = new double[MemapConfig.NR_OF_ITERATIONS];
	double[] costForTimestepMEMAP = new double[MemapConfig.NR_OF_ITERATIONS];
	double[][] memapSolutionPerTimeStep = new double[MemapConfig.NR_OF_ITERATIONS][];		

	public OptimizationResultMessage optResult = new OptimizationResultMessage();
	//Gson gson = new Gson();
	
	public Calendar startTime;
	public int nStepsMPC = MemapConfig.N_STEPS_MPC;
	
	public SolutionHandler solHandler = new SolutionHandler();
	
	public LinProgBehavior() {}

	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {}

	@Override
	public void handleRequest() {}
	

	@Override
	public void makeDecision() {
		
		System.out.println("MPC Linprog: " + nStepsMPC);
		
		// Sort the received answers in 'Buildings' and/or 'free consumer/Storage/Producers'
		ArrayList<BuildingMessage> buildingMessageList = new ArrayList<BuildingMessage>();
				
		for(BasicAnswer basicAnswer : answerListReceived) {
			
			AnswerContent answerContent = basicAnswer.answerContent;
			if(answerContent instanceof BuildingMessage) {
				BuildingMessage bm  = (BuildingMessage) answerContent;
				buildingMessageList.add(bm);
			}
		}
		
		if (MemapConfig.MEMAP_ON) {
			if (GlobalTime.getCurrentTimeStep() == 0) {
				
				int nrOfStorages = 0;
				int nrOfProducers = 0;
				int nrOfCouplers = 0;
				
				for (BuildingMessage buildingMessage : buildingMessageList) {
					nrOfStorages += buildingMessage.getNrOfStorages();
					nrOfProducers += buildingMessage.getNrOfProducers();
					nrOfCouplers += buildingMessage.getNrOfCouplers();
				}
				
				// Output simulation details
				System.out.println(" << makeDesicion LinProg --- Optimization >> ");
				System.out.println("MemapSimulation time: " + MyTimeUnit.stepLength(TimeUnit.HOURS)*MemapConfig.NR_OF_ITERATIONS + " hours (" + MemapConfig.NR_OF_ITERATIONS/MemapConfig.TIMESTEPS_PER_DAY + " days)");
				System.out.println("Timestep: " + MyTimeUnit.stepLength(TimeUnit.MINUTES) + " minutes (" + MemapConfig.NR_OF_ITERATIONS + " Steps)");
				System.out.println("MPC Horizon: " + MemapConfig.N_STEPS_MPC*MyTimeUnit.stepLength(TimeUnit.HOURS) + " hours (" + MemapConfig.N_STEPS_MPC + " Steps)");
				
				System.out.println(" ");
				
				System.out.println("Total Number of Storages: " + nrOfStorages);
				System.out.println("Total Number of Producers: " + nrOfProducers);
				System.out.println("Total Number of Couplers: " + nrOfCouplers);
				System.out.println("----------------------------------------------------------------");
			}	    
		
			// ------------ MEMAP - OPTIMIZATION ------------ 

			MatrixBuildup mb = new MatrixBuildup();			
			OptimizationProblem problem = mb.multipleBuildings(
					buildingMessageList,
					MemapConfig.MEMAP_LDHeating);
			
			OptimizationStarter os = new OptimizationStarter();
			double[] sol = os.runLinProg(problem);
			
			// ================= Handling the result ==================
			
			double[] memapCostPerTimestep = solHandler.calculateTimeStepCosts(sol, problem.lambda);
			System.out.println();
			
			costForTimestepMEMAP[GlobalTime.getCurrentTimeStep()] = memapCostPerTimestep[0];
			
			// ******** Erstellung des Ergebnisvektors *********************
			double[] currentOptVector = solHandler.getSolutionForThisTimeStep(sol, nStepsMPC);
			double[] currentDemand = solHandler.getDemandForThisTimestep(problem, nStepsMPC);
			double[] currentSOC = solHandler.getCurrentSOCs(buildingMessageList);
			double[] currentCost = {memapCostPerTimestep[0]};
			
			double[] vectorAll = HelperConcat.concatAlldoubles(currentDemand, currentOptVector, currentSOC, currentCost);
			
			String[] currentNamesPartly = solHandler.getNamesForThisTimeStep(problem, nStepsMPC);
			String[] demandStrings = {"demandHeat", "demandElectricity"};
			String[] storageNames = solHandler.getNamesForSOCs(buildingMessageList);
			String[] costName = {"Cost"}; 
			
			String[] namesAll = HelperConcat.concatAllObjects(demandStrings, currentNamesPartly, storageNames, costName);
						
			System.out.println(this.actorName + " " + Arrays.toString(namesAll));
			System.out.println(this.actorName + " " + Arrays.toString(vectorAll));									
			
			//********* Speichern
			memapSolutionPerTimeStep[this.getActualTimeStep()] = vectorAll;
			
			
			if  (GlobalTime.getCurrentTimeStep() == (MemapConfig.NR_OF_ITERATIONS-1))  {
				String saveString = MemapTopology.simulationName + "MPC"+MemapConfig.N_STEPS_MPC+"/";
				saveString += this.actorName+"MPC"+nStepsMPC+".csv";
			
				solHandler.exportMatrixWithHeader(memapSolutionPerTimeStep, saveString, namesAll);
			}

			// ================= Handling the result ================== 	
		
			if (GlobalTime.getCurrentTimeStep() == (MemapConfig.NR_OF_ITERATIONS-1)) {
				double totalCostsMEMAP = 0;
				for (int j=0; j < MemapConfig.NR_OF_ITERATIONS; j++) {
					totalCostsMEMAP += costForTimestepMEMAP[j];
				}
				
				System.out.println(" << Optimization Result (MPC) >> ");
				System.out.println("COSTS with MEMAP: " + String.format("%.02f", totalCostsMEMAP));
				System.out.println("----------------------------------------------------------------");
			}
	 		
			// ================= AnswerContentToSend ==================		
			
			for (int i = 0; i < sol.length/nStepsMPC; i++) {
				double[] result = new double[nStepsMPC];
				
				for (int j = 0; j < result.length; j++) {
					result[j] = sol[i*nStepsMPC + j];
				}
				
				String str = problem.namesUB[i*nStepsMPC];
				optResult.resultMap.put(str, result);
				//System.out.println("result: " + str + Arrays.toString(result));
			}
			
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
		
	
	@Override
	public AnswerContent returnAnswerContentToSend() {
		return null;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		return optResult;
	}
	
	@Override
	public void stop() {
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
		super.stop();
	}

}

