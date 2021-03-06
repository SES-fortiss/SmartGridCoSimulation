package memap.helper.lp;

import com.joptimizer.optimizers.LPOptimizationRequest;
import com.joptimizer.optimizers.LPPrimalDualMethod;

import memap.controller.TopologyController;
import memap.helper.configurationOptions.OptimizationCriteria;
import memap.main.SimulationProgress;
import memap.main.Status;

public class LPOptimizationStarter {
	
	/** Reference to topologyController ancestor */
	TopologyController topologyController;
	
	public LPOptimizationStarter(TopologyController topologyController){
		this.topologyController = topologyController;
	}
	
	public double[] runLinProg(LPOptimizationProblem problem) {
	
		LPOptimizationRequest or = new LPOptimizationRequest();
		
		if (topologyController.getOptimizationCriteria() == OptimizationCriteria.EUR) {
			or.setC(problem.lambda);
		}
		
		if (topologyController.getOptimizationCriteria() == OptimizationCriteria.CO2) {
			or.setC(problem.lambdaCO2);
		}
		
		or.setG(problem.g);
		or.setH(problem.h);
		or.setA(problem.a_eq);
		or.setB(problem.b_eq);
		or.setLb(problem.x_lb);
		or.setUb(problem.x_ub);		
		
		LPPrimalDualMethod opt = new LPPrimalDualMethod();
		opt.setLPOptimizationRequest(or);
		
		try {
			opt.optimize();
		} catch (Exception e) {
			SimulationProgress.getInstance().setStatus(Status.ERROR, getClass().getName() +": infeasible problem");
			e.printStackTrace();
		}
		
		double[] sol = opt.getLPOptimizationResponse().getSolution();							
		return sol;
		
	}
}
