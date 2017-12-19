package linprog.components;

import java.util.ArrayList;
import java.util.LinkedList;

import com.google.gson.Gson;
import com.joptimizer.optimizers.LPOptimizationRequest;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import cern.colt.matrix.DoubleMatrix1D;
import linprog.messages.DeviceSpecification;
import linprog.messages.OptimizationResult;
import linprog.messages.SpecificationRequest;
import memap.external.M2MDisplay;

public class LinProgBehavior extends BehaviorModel {

	public OptimizationResult ans = new OptimizationResult();
	public M2MDisplay display;
	Gson gson = new Gson();
	
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
		
		ArrayList<DeviceSpecification> devices = new ArrayList<DeviceSpecification>();

		double[] lambda = null;
		
		
		LPOptimizationRequest or = new LPOptimizationRequest();
		or.setC(lambda);

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
