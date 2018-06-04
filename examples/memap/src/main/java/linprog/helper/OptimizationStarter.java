package linprog.helper;

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

		
		/*
		 *  Check Sums to compare with Matlab-Model
		 */
//		double summeL = 0 ;
//		for (int j=0; j<or.getC().size(); j++) {
//			summeL += problem.lambda[j];
//		}
//		double summeB = 0 ;
//		for (int j=0; j<or.getB().size(); j++) {
//			summeB += problem.b_eq[j];
//		}
//		double summeH = 0 ;
//		for (int j=0; j<or.getH().size(); j++) {
//			summeH += problem.h[j];
//		}
//		double summeUb = 0 ;
//		for (int j=0; j<or.getUb().size(); j++) {
//			summeUb += problem.x_ub[j];
//		}
//		double summeLb = 0 ;
//		for (int j=0; j<or.getLb().size(); j++) {
//			summeLb += problem.x_lb[j];
//		}
//		
//		double summeA = 0 ;
//		for (int j=0; j<or.getA().columns(); j++) {
//			for (int i=0; i<or.getA().rows(); i++) {
//			summeA += problem.a_eq[i][j];
//				}
//			}
//		double summeG = 0 ;
//		for (int j=0; j<or.getG().columns(); j++) {
//			for (int i=0; i<or.getG().rows(); i++) {
//			summeG += problem.g[i][j];
//				}
//			}
//		
//		System.out.println("****************************************************************");
//		System.out.println("Summen:");
//		System.out.println("A: " + summeA); // + " - ok.");
//		System.out.println("G: " + summeG); // + " - ok....");
//		System.out.println("Lambda: " + summeL); // + " - ok.");
//		System.out.println("b: " + summeB); // + " - ok.");
//		System.out.println("h: " + summeH); // + " - ok.");
//		System.out.println("x_UB: " + summeUb); // + " - ok.");
//		System.out.println("x_LB: " + summeLb); // + " - ok.");
//		System.out.println(" ");
		
		
		
//		System.out.println("****************************************************************");	
		System.out.println("Optimization running ...");	
		
		LPPrimalDualMethod opt = new LPPrimalDualMethod();
		opt.setLPOptimizationRequest(or);
		try {
			opt.optimize();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		double[] sol = opt.getLPOptimizationResponse().getSolution();
		return sol;
		
	}
}
