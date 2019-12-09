package linprogMPC.helper;

import java.util.Arrays;

import com.joptimizer.optimizers.LPOptimizationRequest;
import com.joptimizer.optimizers.LPPrimalDualMethod;

import linprogMPC.TopologyConfig;

public class OptimizationStarter {

	public double[] runLinProg(OptimizationProblem problem) {

		LPOptimizationRequest or = new LPOptimizationRequest();

		or.setG(problem.g);
		or.setH(problem.h);
		or.setA(problem.a_eq);
		or.setB(problem.b_eq);
		or.setLb(problem.x_lb);
		or.setUb(problem.x_ub);
		
		if (TopologyConfig.OPTIMIZATION_CRITERIA.equals("cost")) {
			or.setC(problem.lambda);
		} else {
			or.setC(problem.lambdaCO2);
		}

		// System.out.println(or.getUb());
		// System.out.println(or.getB());
		// System.out.println(or.getH());

		/*
		 * System.out.println("C:"); System.out.println(or.getC());
		 * 
		 * System.out.println("A:"); System.out.println(or.getA());
		 * 
		 * System.out.println("b:"); System.out.println(or.getB());
		 * 
		 * System.out.println("ub:"); System.out.println(or.getUb());
		 * 
		 * System.out.println("lb:"); System.out.println(or.getLb());
		 * 
		 * System.out.println("h:"); System.out.println(or.getH());
		 * 
		 * System.out.println("G:"); System.out.println(or.getG());
		 */

		// ==== Check Matrix and Vector Sizes: ====
		/*
		 * System.out.println("Size of Matrices:"); System.out.println("A: " +
		 * or.getA().rows() + " x " + or.getA().columns()); System.out.println("b: " +
		 * or.getB().size()); System.out.println("lb: " + or.getLb().size());
		 * System.out.println("ub: " + or.getUb().size()); System.out.println("cost c: "
		 * + or.getC().size()); System.out.println("h: " + or.getH().size());
		 * System.out.println("G: " + or.getG().rows() + " x " + or.getG().columns());
		 */

		LPPrimalDualMethod opt = new LPPrimalDualMethod();
		opt.setLPOptimizationRequest(or);

		try {
			opt.optimize();
		} catch (Exception e) {
			e.printStackTrace();
		}

		double[] sol = opt.getLPOptimizationResponse().getSolution();

		System.out.println("SOL:");
		System.out.println(Arrays.toString(sol));
//	System.out.println("size");
//	System.out.println(sol.length);
		return sol;

	}
}
