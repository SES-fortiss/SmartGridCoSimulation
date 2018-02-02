package linprog.components;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;

import com.google.gson.Gson;
import com.joptimizer.optimizers.JOptimizer;
import com.joptimizer.optimizers.LPOptimizationRequest;
import com.joptimizer.optimizers.LPPrimalDualMethod;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import linprog.Simulation;
import linprog.helper.OptimizationProblem;
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
	public int n = Simulation.maxTimeStep;
	public int stepSize;
	
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
		
		for(BasicAnswer basicAnswer : answerListReceived) {
			if(basicAnswer.answerContent instanceof Consumption) {
				consumptionProfiles.add((Consumption) basicAnswer.answerContent);
			}
			if(basicAnswer.answerContent instanceof ProducerSpec) {
				producerSpecs.add((ProducerSpec) basicAnswer.answerContent);
			}
			if(basicAnswer.answerContent instanceof StorageSpec) {
				storageSpecs.add((StorageSpec) basicAnswer.answerContent);
			}			
		}
		
		int nrOfStorages = storageSpecs.size();
		int nrOfProducers = producerSpecs.size();
		OptimizationProblem problem = new OptimizationProblem(n, nrOfProducers, nrOfStorages);
		
		for(Consumption consumption : consumptionProfiles) {
			for(int i = 0; i < n; i++) {
				problem.h[i] -= consumption.vector[i];				
			}
		}

		int producersHandled = 0;
		int storagesHandled = 0;
		for(ProducerSpec producerSpec : producerSpecs) {
			for(int i = 0; i < n; i++) {
				problem.lambda[n*producersHandled+i] = producerSpec.cost[i];
				problem.x_lb[n*producersHandled+i] = producerSpec.lowerBound[i];
				problem.x_ub[n*producersHandled+i] = producerSpec.upperBound[i];
				
				for(int j = 0; j < n; j++) {
					problem.g[i][n*producersHandled +j] = producerSpec.couplingMatrix[i][j];
				}	
			}
			producersHandled++;
		}	
		
		for(StorageSpec storageSpec : storageSpecs) {
			for(int i = 0; i < 2*n; i++) {
				if(i < n) {
					for(int j = 0; j < 2*n; j++) {
						problem.g[i][n*(producersHandled+storagesHandled)+j] = storageSpec.couplingMatrix[i][j];
						problem.g[n*(1+2*storagesHandled)+i][n*(producersHandled+2*storagesHandled)+j] = storageSpec.capacityMatrix1[i][j];
						problem.g[n*(2+2*storagesHandled)+i][n*(producersHandled+2*storagesHandled)+j] = storageSpec.capacityMatrix2[i][j];
					}
				}
				problem.lambda[n*(producersHandled+2*storagesHandled)+i] = storageSpec.cost[i];
				problem.x_lb[n*(producersHandled+2*storagesHandled)+i] = storageSpec.lowerBound[i];
				problem.x_ub[n*(producersHandled+2*storagesHandled)+i] = storageSpec.upperBound[i];
				problem.h[n*(1+2*storagesHandled)+i] = storageSpec.vector[i];	
			}
			storagesHandled++;
		}		
		
		LPOptimizationRequest or = new LPOptimizationRequest();
		or.setC(problem.lambda);
		or.setG(problem.g);
		or.setH(problem.h);
		or.setLb(problem.x_lb);
		or.setUb(problem.x_ub);

		System.out.println("c: " + or.getC().size());		
		System.out.println("G: " + or.getG().rows() + " x " + or.getG().columns());		
		System.out.println("h: " + or.getH().size());		
		System.out.println("lb: " + or.getLb().size());		
		System.out.println("ub: " + or.getUb().size());		
		
//		System.out.println(gson.toJson(problem.g));		

		display.update(gson.toJson(problem));

		LPPrimalDualMethod opt = new LPPrimalDualMethod();
//		JOptimizer opt = new JOptimizer();
		or.setMaxIteration(100000);
//		or.setPresolvingDisabled(true);
		or.setDumpProblem(true);
		opt.setLPOptimizationRequest(or);
		try {
			opt.optimize();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		double[] sol = opt.getLPOptimizationResponse().getSolution();
//		display.update(gson.toJson(sol));
		int producerResultsHandled = 0;
		int storageResultsHandled = 0;
		for(ProducerSpec producerSpec: producerSpecs) {
			double[] producerResult = new double[n];
			for(int i = 0; i < n; i++) {
				producerResult[i] = sol[n*producerResultsHandled + i];
			}
			ans.resultMap.put(producerSpec.name, producerResult);
			producerResultsHandled++;
		}
		for(StorageSpec storageSpec: storageSpecs) {
			double[] storageResult = new double[2*n];
			for(int i = 0; i < 2*n; i++) {
				storageResult[i] = sol[n*(producerResultsHandled+2*storageResultsHandled) + i];
			}
			ans.resultMap.put(storageSpec.name, storageResult);
			storageResultsHandled++;
		}
		display.update(gson.toJson(problem) + gson.toJson(ans));
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
