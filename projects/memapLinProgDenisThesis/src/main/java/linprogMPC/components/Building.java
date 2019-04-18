package linprogMPC.components;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import com.google.gson.Gson;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import akka.systemActors.GlobalTime;
import behavior.BehaviorModel;
import linprogMPC.ThesisTopologySimple;
import linprogMPC.helper.EnergyPrices;
import linprogMPC.helper.HelperConcat;
import linprogMPC.helper.MatrixBuildup;
import linprogMPC.helper.OptimizationProblem;
import linprogMPC.helper.OptimizationStarter;
import linprogMPC.helper.SolutionHandler;
import linprogMPC.helperOPCua.OpcServerContextGenerator;
import linprogMPC.messages.BuildingMessage;
import linprogMPC.messages.OptimizationResultMessage;
import linprogMPC.messages.extension.ChildSpecification;
import linprogMPC.messages.extension.NetworkType;
import linprogMPC.messages.planning.CouplerMessage;
import linprogMPC.messages.planning.DemandMessage;
import linprogMPC.messages.planning.ProducerMessage;
import linprogMPC.messages.planning.StorageMessage;
import linprogMPC.messages.planning.VolatileProducerMessage;
import linprogMPC.messages.realTime.CurrentMeterValues;
import opcMEMAP.MemapOpcServerStarter;

public class Building extends BehaviorModel {

    protected Gson gson = new Gson();
    private MemapOpcServerStarter mServer;

    public int port;

    // some long term values
    double[] buildingsTotalCosts = new double[ThesisTopologySimple.NR_OF_ITERATIONS];
    double[][] buildingsSolutionPerTimeStep = new double[ThesisTopologySimple.NR_OF_ITERATIONS][];

    public int nStepsMPC = ThesisTopologySimple.N_STEPS_MPC;

    // NEW(7.8.18 by JMr): Long-distance heating supply
    public boolean LDHeating;
    public int heatTransportLength;
    EnergyPrices energyPrices = new EnergyPrices();
    SolutionHandler solHandler = new SolutionHandler();

    // ================================

    public BuildingMessage buildingMessage = new BuildingMessage();
    public OptimizationResultMessage optResult = new OptimizationResultMessage(); // optResult = selbst berechnet
    public OptimizationResultMessage requestContentToSend = new OptimizationResultMessage();

    public Building(int port, boolean LDHeating, int heatTransportLength) {
	this.port = port;
	this.LDHeating = LDHeating;
	this.heatTransportLength = heatTransportLength;
    }

    @Override
    public void makeDecision() {

//        //	======================  OPC UA Read  =====================	
//		
//		// Get BuildingNumber from String e.g. "Building2"
//		int BuildingNumber = Integer.parseInt(this.actorName.substring(8)); 
//		
//		
//		if (BuildingNumber > 3) {
//			BuildingNumber = 3;	
//		}
//		System.out.println("GebäudeNummer= " + BuildingNumber);
//		
//		NodeId BuildingNode = new NodeId(2, (4*BuildingNumber+2));
//		System.out.println("Node= " + (4*BuildingNumber+2));
//		// OPCUA Data only available for 3 Buildings - Node IDs are 4,8 and 12
//		// +1 Elektro, +2 Heizung, +3 Kälte
//		
//		
//		
//		try {
//			
//			ReadClient.startClient(new NodeId(2, (4*BuildingNumber+2)));
//			// Output:
//			int readValue = (int) ReadClient.getData();
//		//	System.out.println("[OPC UA] Read Status " + name + " Server: " + readValue );
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("[OPC UA] Client read failed");
//		}

	// ======================= RECEIVING =======================
	buildingMessage = new BuildingMessage();
	buildingMessage.id = this.fullActorPath;
	buildingMessage.name = this.actorName;
	buildingMessage.LDHeating = LDHeating;
	buildingMessage.heatTransportLength = heatTransportLength;

	this.actor.getContext().getChildren().forEach(child -> buildingMessage.childrenList
		.add(new ChildSpecification(this.fullActorPath + "/" + child.path().name())));

	for (BasicAnswer basicAnswer : answerListReceived) {
	    AnswerContent answerContent = basicAnswer.answerContent;
	    if (answerContent instanceof DemandMessage) {
		DemandMessage dm = (DemandMessage) answerContent;
		buildingMessage.demandList.add((DemandMessage) dm);
	    }

	    if (answerContent instanceof ProducerMessage) {
		if (answerContent instanceof VolatileProducerMessage) {
		    buildingMessage.volatileProducerList.add((VolatileProducerMessage) answerContent);
		} else {
		    buildingMessage.controllableProducerList.add((ProducerMessage) answerContent);
		}
	    }

	    if (answerContent instanceof StorageMessage) {
		buildingMessage.storageList.add((StorageMessage) answerContent);
	    }
	    if (answerContent instanceof CouplerMessage) {
		buildingMessage.couplerList.add((CouplerMessage) answerContent);
	    }
	}
	refactorDemandList();

	if (!ThesisTopologySimple.MEMAP_ON) {
	    solveOptProblem();

	    double costTotal = 0;
	    for (int i = 0; i < buildingsTotalCosts.length; i++) {
		costTotal += buildingsTotalCosts[i];
	    }
	    System.out.println(this.actorName + " cost = " + costTotal);
	}

	buildingMessage = addMetering(buildingMessage);
    }

    private BuildingMessage addMetering(BuildingMessage bmIn) {

	BuildingMessage result = bmIn;

	for (DemandMessage demand : bmIn.demandList) {
	    CurrentMeterValues cm = new CurrentMeterValues();
	    if (demand.networkType == NetworkType.HEAT) {
		cm.name = "HEATDemand";
		cm.id = this.fullActorPath + "/HEATDemand";
	    }
	    if (demand.networkType == NetworkType.ELECTRICITY) {
		cm.name = "ELECTRICITYDemand";
		cm.id = this.fullActorPath + "/ELECTRICITYDemand";
	    }
	    cm.networkType = demand.networkType;
	    cm.powerInjection = demand.getDemandVector()[0];
	    result.currentMeterValueList.add(cm);
	}
	return result;
    }

    private void solveOptProblem() {
	OptimizationProblem problem = null;
	try {

	    // ******* Optimierung ********************************
	    MatrixBuildup mb = new MatrixBuildup();
	    problem = mb.singleBuilding(buildingMessage);
	    OptimizationStarter os = new OptimizationStarter();
	    double[] optSolution = os.runLinProg(problem);

	    // ******** Ermittlung der Kosten *********************
	    double[] buildingCostPerTimestep = new double[nStepsMPC];
	    buildingCostPerTimestep = solHandler.calculateTimeStepCosts(optSolution, problem.lambda);
	    buildingsTotalCosts[GlobalTime.getCurrentTimeStep()] += buildingCostPerTimestep[0];

	    // ******** Erstellung des Ergebnisvektors *********************
	    double[] currentStep = { getActualTimeStep() };
	    double[] currentOptVector = solHandler.getSolutionForThisTimeStep(optSolution, nStepsMPC);
	    double[] currentDemand = solHandler.getDemandForThisTimestep(problem, nStepsMPC);
	    double[] currentSOC = solHandler.getCurrentSOC(buildingMessage.storageList);
	    double[] currentCost = { buildingCostPerTimestep[0] };
	    double[] electricalPrice = { energyPrices.getElectricityPriceInEuro(this.getActualTimeStep()) };
	    double[] vectorAll = HelperConcat.concatAlldoubles(currentStep, currentDemand, currentOptVector, currentSOC,
		    currentCost, electricalPrice);

	    String[] timeStep = { "timeStep" };
	    String[] currentNamesPartly = solHandler.getNamesForThisTimeStep(problem, nStepsMPC);
	    String[] demandStrings = { "demandHeat", "demandElectricity" };
	    String[] storageNames = solHandler.getNamesForSOC(buildingMessage.storageList);
	    String[] costName = { "Cost" };
	    String[] priceName = { "Price" };

	    String[] namesAll = HelperConcat.concatAllObjects(timeStep, demandStrings, currentNamesPartly, storageNames,
		    costName, priceName);

	    // System.out.println(this.actorName + " " + Arrays.toString(namesAll));
	    // System.out.println(this.actorName + " " + Arrays.toString(vectorAll));

	    // ********* Speichern

	    buildingsSolutionPerTimeStep[this.getActualTimeStep()] = vectorAll;

	    if (!ThesisTopologySimple.MEMAP_ON) {
		String saveString = ThesisTopologySimple.simulationName + "MPC" + ThesisTopologySimple.N_STEPS_MPC
			+ "/";
		saveString += this.actorName + "MPC" + nStepsMPC + "Solutions.csv";
		if (GlobalTime.getCurrentTimeStep() == (ThesisTopologySimple.NR_OF_ITERATIONS - 1)) {
		    solHandler.exportMatrixWithHeader(buildingsSolutionPerTimeStep, saveString, namesAll);
		}
	    }

	    // ================= RequestContentToSend ==================
	    for (int i = 0; i < optSolution.length / nStepsMPC; i++) {
		double[] result = new double[nStepsMPC];

		for (int j = 0; j < result.length; j++) {
		    result[j] = optSolution[i * nStepsMPC + j];
		}

		String str = problem.namesUB[i * nStepsMPC];
		optResult.resultMap.put(str, result);
		// System.out.println("result: " + str + Arrays.toString(result));
	    }

	} catch (Exception e) {
	    e.printStackTrace();
	    System.err.println(this.actorName + " cannot solve the optimization");
	    System.out.println("names: " + Arrays.toString(problem.namesUB));
	    System.out.println("b: " + Arrays.toString(problem.b_eq));
	    System.out.println("ub: " + Arrays.toString(problem.x_ub));
	    System.out.println("h: " + Arrays.toString(problem.h));
	}

    }

    private void refactorDemandList() {
	BuildingMessage bm = this.buildingMessage;

	ArrayList<DemandMessage> newDemandList = new ArrayList<DemandMessage>();

	for (DemandMessage demandMessage : bm.demandList) {

	    if (demandMessage.networkType == NetworkType.DEMANDWITHBOTH) {
		// Zwei draus machen

		DemandMessage a = new DemandMessage();
		DemandMessage b = new DemandMessage();

		a.forecastType = demandMessage.forecastType;
		b.forecastType = demandMessage.forecastType;

		a.id = demandMessage.id + "HEAT";
		b.id = demandMessage.id + "ELECTRICITY";

		a.name = "HEAT_" + demandMessage.name;
		b.name = "ELECTRICITY_" + demandMessage.name;

		a.networkType = NetworkType.HEAT;
		b.networkType = NetworkType.ELECTRICITY;

		a.optimizationCriteria = demandMessage.optimizationCriteria;
		b.optimizationCriteria = demandMessage.optimizationCriteria;

		int length = demandMessage.getDemandVector().length / 2;
		double[] aInput = new double[length];
		double[] bInput = new double[length];

		for (int i = 0; i < length; i++) {
		    aInput[i] = demandMessage.getDemandVector()[i];
		    bInput[i] = demandMessage.getDemandVector()[length + i];
		}

		a.setDemandVector(aInput);
		b.setDemandVector(bInput);

		newDemandList.add(a);
		newDemandList.add(b);
	    }

	    if (demandMessage.networkType == NetworkType.ELECTRICITY) {
		newDemandList.add(demandMessage);
	    }

	    if (demandMessage.networkType == NetworkType.HEAT) {
		newDemandList.add(demandMessage);
	    }
	}

	buildingMessage.demandList = newDemandList;

    }

    @Override
    public AnswerContent returnAnswerContentToSend() {

	if (this.getActualTimeStep() == 0) {
	    // String filePath = "src/main/java/Building1.json";

	    if (port != 0) {
		this.mServer = new MemapOpcServerStarter(false, gson.toJson(buildingMessage), port);
		try {
		    this.mServer.start();
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	    OpcServerContextGenerator.generateJson(this.actorName, buildingMessage);
	}

	if (port != 0) {
	    try {
		mServer.update(gson.toJson(buildingMessage));
		Thread.sleep(1000);
	    } catch (Exception e) {
		e.printStackTrace();
	    }
	}

	return buildingMessage;
    }

    @Override
    public void handleRequest() {
	requestContentToSend = optResult;
	if (ThesisTopologySimple.MEMAP_ON) {
	    requestContentToSend = (OptimizationResultMessage) requestContentReceived;
	}
    }

    @Override
    public RequestContent returnRequestContentToSend() {
	return requestContentToSend;
    }

    @Override
    public void stop() {
	if (port != 0) {
	    mServer.stop();
	}
	super.stop();
    }

    @Override
    public void handleError(LinkedList<ErrorAnswerContent> errors) {
    }

}
