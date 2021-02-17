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
				
		for(BasicAnswer basicAnswer : answerListReceived) {
			
			AnswerContent answerContent = basicAnswer.answerContent;
			if(answerContent instanceof BuildingMessage) {
				BuildingMessage bm  = (BuildingMessage) answerContent;
				buildingMessageList.add(bm);
			}
		}
		
		if (ThesisTopologySimple.MEMAP_ON) {
			if (this.actor.getCurrentTimeStep() == 0) {
				
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
					ThesisTopologySimple.MEMAP_LDHeating, this.actor.getCurrentTimeStep());
			
			OptimizationStarter os = new OptimizationStarter();
			double[] sol = os.runLinProg(problem);
			
			// ================= Handling the result ==================
			
			double[] memapCostPerTimestep = solHandler.calculateTimeStepCosts(sol, problem.lambda);
			System.out.println();
			
			costForTimestepMEMAP[this.actor.getCurrentTimeStep()] = memapCostPerTimestep[0];
			
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
			memapSolutionPerTimeStep[this.actor.getCurrentTimeStep()] = vectorAll;
			
			
			if  (this.actor.getCurrentTimeStep() == (ThesisTopologySimple.NR_OF_ITERATIONS-1))  {
				String saveString = ThesisTopologySimple.simulationName + "MPC"+ThesisTopologySimple.N_STEPS_MPC+"/";
				saveString += this.actorName+"MPC"+nStepsMPC+".csv";
				solHandler.exportMatrixWithHeader(memapSolutionPerTimeStep, saveString, namesAll);
			}

			// ================= Handling the result ================== 	
		
			if (this.actor.getCurrentTimeStep() == (ThesisTopologySimple.NR_OF_ITERATIONS-1)) {
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

