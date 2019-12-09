package linprogMPC.helper.lp;

import com.joptimizer.optimizers.LPOptimizationRequest;
import com.joptimizer.optimizers.LPPrimalDualMethod;

import linprogMPC.ConfigurationMEMAP;

public class LPOptimizationStarter {
	
	public double[] runLinProg(LPOptimizationProblem problem) {
	
		LPOptimizationRequest or = new LPOptimizationRequest();
		
		if (ConfigurationMEMAP.chosenCriteria == ConfigurationMEMAP.OptimizationCriteria.EUR) {
			or.setC(problem.lambda);
		}
		
		if (ConfigurationMEMAP.chosenCriteria == ConfigurationMEMAP.OptimizationCriteria.CO2) {
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
			e.printStackTrace();
		}
		
		double[] sol = opt.getLPOptimizationResponse().getSolution();							
		return sol;
		
	}
}
