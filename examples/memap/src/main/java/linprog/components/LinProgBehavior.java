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
		double[] lambda = new double[n*(nrOfProducers+2*nrOfStorages)];
		double[] b = new double[n*(1+2*nrOfStorages)];
		double[][] a = new double[n*(1+2*nrOfStorages)][n*(nrOfProducers+2*nrOfStorages)];
		double[] x_lb = new double[n*(nrOfProducers+2*nrOfStorages)];
		double[] x_ub = new double[n*(nrOfProducers+2*nrOfStorages)];
		
		for(Consumption consumption : consumptionProfiles) {
			for(int i = 0; i < n; i++) {
				b[i] -= consumption.vector[i];				
			}
		}

		int producersHandled = 0;
		int storagesHandled = 0;
		for(ProducerSpec producerSpec : producerSpecs) {
			for(int i = 0; i < n; i++) {
				lambda[n*producersHandled+i] = producerSpec.cost[i];
				x_lb[n*producersHandled+i] = producerSpec.lowerBound[i];
				x_ub[n*producersHandled+i] = producerSpec.upperBound[i];
				
				for(int j = 0; j < n; j++) {
					a[i][n*producersHandled +j] = producerSpec.couplingMatrix[i][j];
				}	
			}
			producersHandled++;
		}	
		
		for(StorageSpec storageSpec : storageSpecs) {
			for(int i = 0; i < 2*n; i++) {
				if(i < n) {
					for(int j = 0; j < 2*n; j++) {
						a[i][n*(producersHandled+storagesHandled)+j] = storageSpec.couplingMatrix[i][j];
						a[n*(1+2*storagesHandled)+i][n*(producersHandled+2*storagesHandled)+j] = storageSpec.capacityMatrix1[i][j];
						a[n*(2+2*storagesHandled)+i][n*(producersHandled+2*storagesHandled)+j] = storageSpec.capacityMatrix2[i][j];
					}
				}
				lambda[n*(producersHandled+2*storagesHandled)+i] = storageSpec.cost[i];
				x_lb[n*(producersHandled+2*storagesHandled)+i] = storageSpec.lowerBound[i];
				x_ub[n*(producersHandled+2*storagesHandled)+i] = storageSpec.upperBound[i];
				b[n*(1+2*storagesHandled)+i] = storageSpec.vector[i];	
			}
			storagesHandled++;
		}		
		
		LPOptimizationRequest or = new LPOptimizationRequest();
		or.setC(lambda);
		or.setA(a);
		or.setB(b);
		or.setLb(x_lb);
		or.setUb(x_ub);

		System.out.println("c: " + or.getC().size());		
		System.out.println("A: " + or.getA().rows() + " x " + or.getA().columns());		
		System.out.println("b: " + or.getB().size());		
		System.out.println("lb: " + or.getLb().size());		
		System.out.println("ub: " + or.getUb().size());		
		
		System.out.println(gson.toJson(a));

		LPPrimalDualMethod opt = new LPPrimalDualMethod();
//		JOptimizer opt = new JOptimizer();
		or.setMaxIteration(5000);
		or.setPresolvingDisabled(true);
		opt.setOptimizationRequest(or);
		try {
			opt.optimize();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		double[] sol = opt.getOptimizationResponse().getSolution();
		int producerResultsHandled = 0;
		int storageResultsHandled = 0;
		for(ProducerSpec producerSpec: producerSpecs) {
			double[] producerResult = new double[n];
			for(int i = 0; i < n; i++) {
				producerResult[i] = sol[n*producerResultsHandled + i];
			}
			ans.resultMap.put(producerSpec.name, producerResult);
		}
		for(StorageSpec storageSpec: storageSpecs) {
			double[] storageResult = new double[n];
			for(int i = 0; i < 2*n; i++) {
				storageResult[i] = sol[n*(producerResultsHandled+2*storageResultsHandled) + i];
			}
			ans.resultMap.put(storageSpec.name, storageResult);
		}
		display.update(gson.toJson(ans));
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
