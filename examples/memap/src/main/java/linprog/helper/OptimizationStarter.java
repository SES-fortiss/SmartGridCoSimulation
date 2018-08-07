package linprog.helper;

import com.joptimizer.optimizers.LPOptimizationRequest;
import com.joptimizer.optimizers.LPPrimalDualMethod;

import linprog.Simulation;


public abstract class OptimizationStarter {

	
	public static double[] runLinProg(OptimizationProblem problem) {
	
		LPOptimizationRequest or = new LPOptimizationRequest();
		
		or.setC(problem.lambda);
		or.setG(problem.g);
		or.setH(problem.h);
		or.setA(problem.a_eq);
		or.setB(problem.b_eq);
		or.setLb(problem.x_lb);
		or.setUb(problem.x_ub);		

//		==== Check Matrix and Vector Sizes: ====
//		System.out.println("Size of Matrices:");
//		System.out.println("c: " + or.getC().size());		
//		System.out.println("G: " + or.getG().rows() + " x " + or.getG().columns());		
//		System.out.println("h: " + or.getH().size());	
//		System.out.println("A: " + or.getA().rows() + " x " + or.getA().columns());		
//		System.out.println("b: " + or.getB().size());
//		System.out.println("lb: " + or.getLb().size());		
//		System.out.println("ub: " + or.getUb().size());	

		double summeB_H = 0 ;
		double summeB_el = 0 ;
		for (int j=0; j<or.getB().size()/2; j++) {
			summeB_H += problem.b_eq[j];
			summeB_el += problem.b_eq[Simulation.N_STEPS+j];
		}

//		System.out.println("----------");
		System.out.println("Predicted Heat Consumption: " + -(int)summeB_H + " kWh in " + Simulation.N_DAYS + " days"); // + " - ok.");
		System.out.println("Predicted Elec Consumption: " + -(int)summeB_el + " kWh in " + Simulation.N_DAYS + " days"); // + " - ok.");
//		System.out.println("----------");	
		
		
		System.out.println(" --- Optimization running ---");	
		
		LPPrimalDualMethod opt = new LPPrimalDualMethod();
		opt.setLPOptimizationRequest(or);
		try {
			opt.optimize();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(" --- done. ---");	
		
		double[] sol = opt.getLPOptimizationResponse().getSolution();
		return sol;
		
	}
}
