package linprogMPC.helper;

import com.joptimizer.optimizers.LPOptimizationRequest;
import com.joptimizer.optimizers.LPPrimalDualMethod;

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
		
		//System.out.println(or.getUb());
		//System.out.println(or.getA());
		
		//==== Check Matrix and Vector Sizes: ====
		/*
		System.out.println("Size of Matrices:");
		System.out.println("c: " + or.getC().size());		
		System.out.println("G: " + or.getG().rows() + " x " + or.getG().columns());		
		System.out.println("h: " + or.getH().size());	
		System.out.println("A: " + or.getA().rows() + " x " + or.getA().columns());		
		System.out.println("b: " + or.getB().size());
		System.out.println("lb: " + or.getLb().size());		
		System.out.println("ub: " + or.getUb().size());
		*/	

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


//==== Check Matrix and Vector Sizes: ====
//System.out.println("Size of Matrices:");
//System.out.println("c: " + or.getC().size());		
//System.out.println("G: " + or.getG().rows() + " x " + or.getG().columns());		
//System.out.println("h: " + or.getH().size());	
//System.out.println("A: " + or.getA().rows() + " x " + or.getA().columns());		
//System.out.println("b: " + or.getB().size());
//System.out.println("lb: " + or.getLb().size());		
//System.out.println("ub: " + or.getUb().size());	
