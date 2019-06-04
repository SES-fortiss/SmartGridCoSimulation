package linprogMPC.components;

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
import linprogMPC.ThesisTopologySimple;
import linprogMPC.helper.HelperConcat;
import linprogMPC.helper.MatrixBuildup;
import linprogMPC.helper.MyTimeUnit;
import linprogMPC.helper.OptimizationProblem;
import linprogMPC.helper.OptimizationStarter;
import linprogMPC.helper.SolutionHandler;
import linprogMPC.messages.BuildingMessage;
import linprogMPC.messages.OptimizationResultMessage;

public class LinProgBehavior extends BehaviorModel {
	
	private long sleepTime = 0L;
	
	double[][] fullXVector = new double[ThesisTopologySimple.NR_OF_ITERATIONS][ThesisTopologySimple.N_STEPS];
	
	double[] costForTimestepAllBuildings = new double[ThesisTopologySimple.NR_OF_ITERATIONS];
	double[] costForTimestepMEMAP = new double[ThesisTopologySimple.NR_OF_ITERATIONS];
	double[][] memapSolutionPerTimeStep = new double[ThesisTopologySimple.NR_OF_ITERATIONS][];		

	public OptimizationResultMessage optResult = new OptimizationResultMessage();
	//Gson gson = new Gson();
	
	public Calendar startTime;
	public int nStepsMPC = ThesisTopologySimple.N_STEPS_MPC;
	
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
				
		int nrOfBuildings = 0;
		
		for(BasicAnswer basicAnswer : answerListReceived) {
			
			AnswerContent answerContent = basicAnswer.answerContent;
			if(answerContent instanceof BuildingMessage) {
				BuildingMessage bm  = (BuildingMessage) answerContent;
				buildingMessageList.add(bm);
				nrOfBuildings++;
			}
		}
		
		if (ThesisTopologySimple.MEMAP_ON) {
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
				System.out.println("Simulation time: " + MyTimeUnit.stepLength(TimeUnit.HOURS)*ThesisTopologySimple.NR_OF_ITERATIONS + " hours (" + ThesisTopologySimple.NR_OF_ITERATIONS/ThesisTopologySimple.TIMESTEPS_PER_DAY + " days)");
				System.out.println("Timestep: " + MyTimeUnit.stepLength(TimeUnit.MINUTES) + " minutes (" + ThesisTopologySimple.NR_OF_ITERATIONS + " Steps)");
				System.out.println("MPC Horizon: " + ThesisTopologySimple.N_STEPS_MPC*MyTimeUnit.stepLength(TimeUnit.HOURS) + " hours (" + ThesisTopologySimple.N_STEPS_MPC + " Steps)");
				
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
					ThesisTopologySimple.MEMAP_LDHeating);
			
			OptimizationStarter os = new OptimizationStarter();
			double[] sol = os.runLinProg(problem);
			
			// ================= Handling the result ==================
			
			double[] memapCostPerTimestep = solHandler.calculateTimeStepCosts(sol, problem.lambda);
			System.out.println();
			
			if (GlobalTime.getCurrentTimeStep() == 0) {
				solHandler.exportMatrix(problem.a_eq, "A_eq.csv");
			}
			
			
			costForTimestepMEMAP[GlobalTime.getCurrentTimeStep()] = memapCostPerTimestep[0];
			
			// ******** Erstellung des Ergebnisvektors *********************
			double[] currentStep = {getActualTimeStep()};
			double[] currentOptVector = solHandler.getSolutionForThisTimeStep(sol, nStepsMPC);
			double[] currentDemand = solHandler.getDemandForThisTimestep(problem, nStepsMPC);
			double[] currentSOC = solHandler.getCurrentSOCs(buildingMessageList);
			double[] currentCost = {memapCostPerTimestep[0]};
			
			double[] currentPosDemand = solHandler.getPositiveDemandForThisTimestep(problem, nStepsMPC);
			double[] currentEffOptVector = solHandler.getEffSolutionForThisTimeStep(sol, problem, nStepsMPC);
			
			//double[] vectorAll = HelperConcat.concatAlldoubles(currentDemand, currentOptVector, currentSOC, currentCost);
			double[] vectorAll = HelperConcat.concatAlldoubles(currentStep, currentDemand, currentOptVector, currentSOC, currentCost, currentPosDemand, currentEffOptVector);
			
			String[] timeStep = {"timeStep"};
			String[] currentNamesPartly = solHandler.getNamesForThisTimeStep(problem, nStepsMPC);
			String[] currentEffNames= solHandler.getEffNamesForThisTimeStep(problem, nStepsMPC);
			String[] demandStrings = new String[nrOfBuildings+1];
			String[] posDemandStrings = new String[nrOfBuildings+2]; 
			for (int i = 0; i < nrOfBuildings; i++) {
				demandStrings[i] = "demandHeat"+(i+1);
				posDemandStrings[i] = "positiveDemandHeat"+(i+1);
			}
			demandStrings[nrOfBuildings] = "demandElectricity";
			posDemandStrings[nrOfBuildings] = "demandHeat";
			posDemandStrings[nrOfBuildings+1] = "positiveDemandElectricity";
			String[] storageNames = solHandler.getNamesForSOCs(buildingMessageList);
			String[] costName = {"Cost"}; 
			
			
			
			String[] namesAll = HelperConcat.concatAllObjects(timeStep, demandStrings, currentNamesPartly, storageNames, costName, posDemandStrings, currentEffNames);
						
			System.out.println(this.actorName + " " + Arrays.toString(namesAll));
			System.out.println(this.actorName + " " + Arrays.toString(vectorAll));									
			
			//********* Speichern
			memapSolutionPerTimeStep[this.getActualTimeStep()] = vectorAll;
			
			
			if  (GlobalTime.getCurrentTimeStep() == (ThesisTopologySimple.NR_OF_ITERATIONS-1))  {
				String saveString = ThesisTopologySimple.simulationName + "MPC"+ThesisTopologySimple.N_STEPS_MPC+"/";
				saveString += this.actorName+"MPC"+nStepsMPC+".csv";
				solHandler.exportMatrixWithHeader(memapSolutionPerTimeStep, saveString, namesAll);
			}

			// ================= Handling the result ================== 	
		
			if (GlobalTime.getCurrentTimeStep() == (ThesisTopologySimple.NR_OF_ITERATIONS-1)) {
				double totalCostsMEMAP = 0;
				for (int j=0; j < ThesisTopologySimple.NR_OF_ITERATIONS; j++) {
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

