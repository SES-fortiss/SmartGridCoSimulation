package linprog.components;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

import org.netlib.util.doubleW;

import com.google.gson.Gson;
import com.joptimizer.optimizers.LPOptimizationRequest;
import com.joptimizer.optimizers.LPPrimalDualMethod;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import linprog.Simulation;
import linprog.helper.OptimizationProblem;
import linprog.messages.BuildingSpec;
import linprog.messages.Consumption;
import linprog.messages.OptimizationResult;
import linprog.messages.ProducerSpec;
import linprog.messages.StorageSpec;
import memap.external.M2MDisplay;

public class LinProgBehavior extends BehaviorModel {

	public OptimizationResult ans = new OptimizationResult();
	public M2MDisplay display;
	Gson gson = new Gson();
	
	public Calendar startTime;
	public final int n = Simulation.TIMESTEPS_PER_ITERATION;
	
	public LinProgBehavior() {
		display = new M2MDisplay(8080); // add port in to display a json
		display.run();
	}

	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleRequest() {
		// TODO Auto-generated method stub

	}

	@Override
	public void makeDecision() {
		
		ArrayList<Consumption> consumptionProfiles = new ArrayList<Consumption>();
		ArrayList<ProducerSpec> producerSpecs = new ArrayList<ProducerSpec>();
		ArrayList<StorageSpec> storageSpecs = new ArrayList<StorageSpec>();
		ArrayList<BuildingSpec> buildingSpecs = new ArrayList<BuildingSpec>();
		
		for(BasicAnswer basicAnswer : answerListReceived) {
			AnswerContent answerContent = basicAnswer.answerContent;
			if(answerContent instanceof Consumption) {
				consumptionProfiles.add((Consumption) answerContent);
			}
			if(answerContent instanceof ProducerSpec) {
				producerSpecs.add((ProducerSpec) answerContent);
			}
			if(answerContent instanceof StorageSpec) {
				storageSpecs.add((StorageSpec) answerContent);
			}		
			if(answerContent instanceof BuildingSpec) {
				buildingSpecs.add((BuildingSpec) answerContent);
			}		
		}
		
		int nrOfStorages = storageSpecs.size();
		int nrOfProducers = producerSpecs.size();
		for(BuildingSpec buildingSpec : buildingSpecs) {
			nrOfStorages += buildingSpec.getNrOfStorages();
			nrOfProducers += buildingSpec.getNrOfProducers();
		}
		OptimizationProblem problem = new OptimizationProblem(n, nrOfProducers, nrOfStorages);
		
		Consumption h_kopp = new Consumption();
		
		for(BuildingSpec buildingSpec : buildingSpecs) {
			h_kopp.addConsumption(buildingSpec.consumption.getVector());
		}
		
		for(Consumption consumption : consumptionProfiles) {
			h_kopp.addConsumption(consumption.getVector());
		}
			
		double[] h_kopp_vector = h_kopp.getVector();
		for(int i = 0; i < n; i++) {
			problem.h[i] = h_kopp_vector[i];
		}

		int producersHandled = 0;
		int storagesHandled = 0;
		
		for(BuildingSpec buildingSpec : buildingSpecs) {
			
			for(ProducerSpec producerSpec : buildingSpec.producers) {
				addProducerToProblem(producerSpec, problem, producersHandled, storagesHandled);
				producersHandled++;
			}	
			
			for(StorageSpec storageSpec : buildingSpec.storages) {
				addStorageToProblem(storageSpec, problem, producersHandled, storagesHandled);
				storagesHandled++;
			}	
		}
		
		for(ProducerSpec producerSpec : producerSpecs) {
			addProducerToProblem(producerSpec, problem, producersHandled, storagesHandled);
			producersHandled++;
		}	
		
		for(StorageSpec storageSpec : storageSpecs) {
			addStorageToProblem(storageSpec, problem, producersHandled, storagesHandled);
			storagesHandled++;
		}		
		
		LPOptimizationRequest or = new LPOptimizationRequest();
		or.setC(problem.lambda);
		or.setG(problem.g);
		or.setH(problem.h);
		or.setLb(problem.x_lb);
		or.setUb(problem.x_ub);

//		System.out.println("c: " + or.getC().size());		
//		System.out.println("G: " + or.getG().rows() + " x " + or.getG().columns());		
//		System.out.println("h: " + or.getH().size());		
//		System.out.println("lb: " + or.getLb().size());		
//		System.out.println("ub: " + or.getUb().size());		
		
//		System.out.println(gson.toJson(problem.g));		

		display.update(gson.toJson(problem));

		LPPrimalDualMethod opt = new LPPrimalDualMethod();
//		JOptimizer opt = new JOptimizer();
		or.setMaxIteration(1000000);
//		or.setPresolvingDisabled(true);
		or.setDumpProblem(true);
//		double[] initialPoint = new double[problem.x_ub.length];
//		for (int i = 0; i < n; i++) {
//			initialPoint[i] = problem.x_ub[i] - 0.0001;
//		}
//		or.setInitialPoint(initialPoint);
		opt.setLPOptimizationRequest(or);
		try {
			opt.optimize();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		double[] sol = opt.getLPOptimizationResponse().getSolution();
//		display.update(gson.toJson(sol));
		int index = 0;
		
		for(BuildingSpec buildingSpec : buildingSpecs) {
			for(ProducerSpec producerSpec: buildingSpec.producers) {
				double[] producerResult = new double[n];
				for(int i = 0; i < n; i++) {
					producerResult[i] = sol[index++];
				}
				ans.resultMap.put(buildingSpec.name + ": " + producerSpec.name, producerResult);
			}
			for(StorageSpec storageSpec: buildingSpec.storages) {
				double[] storageResult_in = new double[n];
				double[] storageResult_out = new double[n];
				for(int i = 0; i < n; i++) {
					storageResult_in[i] = sol[index++];
				}
				ans.resultMap.put(buildingSpec.name + ": " + storageSpec.name + " Input", storageResult_in);
				for(int i = 0; i < n; i++) {
					storageResult_out[i] = sol[index++];
				}
				ans.resultMap.put(buildingSpec.name + ": " + storageSpec.name + " Output", storageResult_out);
			}			
		}
		
		for(ProducerSpec producerSpec: producerSpecs) {
			double[] producerResult = new double[n];
			for(int i = 0; i < n; i++) {
				producerResult[i] = sol[index++];
			}
			ans.resultMap.put(producerSpec.name, producerResult);
		}
		for(StorageSpec storageSpec: storageSpecs) {
			double[] storageResult = new double[2*n];
			for(int i = 0; i < n; i++) {
				storageResult[i] = sol[index++];
			}
			for(int i = n; i < 2*n; i++) {
				storageResult[i] = sol[index++];
			}
			ans.resultMap.put(storageSpec.name, storageResult);
		}
		
		display.update(gson.toJson(ans));
	}

	private void addProducerToProblem(ProducerSpec producerSpec, OptimizationProblem problem, int producersHandledSoFar,
			int storagesHandledSoFar) {
		int n_index = n*producersHandledSoFar+ 2*n*storagesHandledSoFar;
		for(int i = 0; i < n; i++) {
			problem.lambda[n_index+i] = producerSpec.cost[i]*Simulation.stepLength(TimeUnit.SECONDS);
			problem.x_lb[n_index+i] = producerSpec.lowerBound[i];
			problem.x_ub[n_index+i] = producerSpec.upperBound[i];
			
			for(int j = 0; j < n; j++) {
				problem.g[i][n_index +j] = producerSpec.couplingMatrix[i][j];
			}	
		}		
	}

	private void addStorageToProblem(StorageSpec storageSpec, OptimizationProblem problem, int producersHandledSoFar,
			int storagesHandledSoFar) {
		int n_index = n*(producersHandledSoFar+2*storagesHandledSoFar);
		for(int i = 0; i < 2*n; i++) {
			if(i < n) {
				for(int j = 0; j < 2*n; j++) {
					problem.g[i][n_index+j] = storageSpec.couplingMatrix[i][j];
					problem.g[n*(1+2*storagesHandledSoFar)+i][n_index+j] = storageSpec.capacityMatrix1[i][j];
					problem.g[n*(2+2*storagesHandledSoFar)+i][n_index+j] = storageSpec.capacityMatrix2[i][j];
				}
			}
			problem.lambda[n_index+i] = storageSpec.cost[i];
			problem.x_lb[n_index+i] = storageSpec.lowerBound[i];
			problem.x_ub[n_index+i] = storageSpec.upperBound[i];
			problem.h[n*(1+2*storagesHandledSoFar)+i] = storageSpec.vector[i];	
		}
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return ans;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		return null;
	}

}
