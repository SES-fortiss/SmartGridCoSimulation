package linprogMPC.components;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import com.google.gson.Gson;
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
import linprogMPC.helperOPCua.OpcServerContextGenerator;
import linprogMPC.messages.BuildingMessage;
import linprogMPC.messages.OptimizationResultMessage;
import opcMEMAP.MemapOpcServerStarter;

public class LinProgBehavior extends BehaviorModel {
	
	private long sleepTime = 0L;
	
	double[][] fullXVector = new double[ThesisTopologySimple.NR_OF_ITERATIONS][ThesisTopologySimple.N_STEPS];
	
	double[] costForTimestepAllBuildings = new double[ThesisTopologySimple.NR_OF_ITERATIONS];
	double[] costForTimestepMEMAP = new double[ThesisTopologySimple.NR_OF_ITERATIONS];
	double[][] memapSolutionPerTimeStep = new double[ThesisTopologySimple.NR_OF_ITERATIONS][];		

	public OptimizationResultMessage optResult = new OptimizationResultMessage();
    public MemapOpcServerStarter mServer;
    protected Gson gson = new Gson();
    public int port;
    public BuildingMessage buildingMessage = new BuildingMessage();
	
	public Calendar startTime;
	public int nStepsMPC = ThesisTopologySimple.N_STEPS_MPC;
	
	public SolutionHandler solHandler = new SolutionHandler();
	
	public LinProgBehavior(int thePort) {
		this.port=thePort;
	}

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
			double[] sol =  os.runLinProg(problem);
			
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
//			System.out.println("Das muss der jetzt auch immer ausgeben.");
			
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
			//Here the structure of the server results is specified
			
			
			//nameCategories contains a list of all building names
			List<String> nameCategories = new ArrayList<String>();
			String currentName="";
			for (int i=0;i<sol.length-4*nStepsMPC;i++) {
				if (problem.namesUB[i].split("\\.")[0].equals(currentName)){} else {
					currentName=problem.namesUB[i].split("\\.")[0];
					nameCategories.add(currentName);
				}
			}
			
			//A folder labeled "GeneralResults" is added to the resultsMap. Moreover, we add a new folder for every building.
			optResult.resultsMap.put("GeneralResults", new TreeMap<String, double[]>());
			for (int i=0;i<nameCategories.size();i++)
			{
			optResult.resultsMap.put(nameCategories.get(i), new TreeMap<String, double[]>());	
			}

			// We assign all the devices and generalResult datapoints to the respective folders. The first loop runs over the these datapoints and devices. The second loop runs over the respective nMpc Hoirzon points.
			for (int i = 0; i < sol.length/nStepsMPC; i++) {
				double[] result = new double[nStepsMPC];
				
				for (int j = 0; j < result.length; j++) {
					result[j] = sol[i*nStepsMPC + j];
				}
			
				String str =problem.namesUB[i*nStepsMPC];
				TreeMap<String, double[]> keyMap;
				if (nameCategories.contains(str.split("\\.")[0])){
					keyMap= (TreeMap<String, double[]>) optResult.resultsMap.get(str.split("\\.")[0]);
				} else {
					keyMap= (TreeMap<String, double[]>) optResult.resultsMap.get("GeneralResults");
				}
				//Enabling enumeration of devices.
				int DevicesNumber=0;
				while (keyMap.containsKey(str)) {
					DevicesNumber=DevicesNumber+1;
				}
				keyMap.put(str+DevicesNumber, result);
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
		if (this.getActualTimeStep() == 0) {
		    if (port != 0) {
		    this.mServer = new MemapOpcServerStarter(false, gson.toJson(optResult), port);
		    	try {
			    this.mServer.start();
			} catch (Exception e) {
			    e.printStackTrace();
			}
		    }
		    OpcServerContextGenerator.generateJson2(this.actorName, optResult);
		}

		if (port != 0) {
		    try {
			mServer.update(gson.toJson(optResult));
			Thread.sleep(1000);
		    } catch (Exception e) {
			e.printStackTrace();
		    }
		}
		buildingMessage.currentOptimizationResults=optResult;
		return buildingMessage;
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

