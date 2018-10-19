package linprog;

import com.google.gson.Gson;
import com.joptimizer.optimizers.LPOptimizationRequest;
import com.joptimizer.optimizers.LPPrimalDualMethod;;

public class LinProgTest {
	
	public static void main(String[] args){
		
//		Gson gson = new Gson();
		
		double[] c = {0.0, 1.0};
		double[] b = {1.0, -1.0};
		double[] lb = {0.0, 0.0};
		double[] ub = {1.0, 1.0};
		double[][] a = {{-1.0, 0.0},{0.0, 1.0}};

//		LPOptimizationRequest or = new LPOptimizationRequest();
//		or.setC(c);
//		or.setA(a);
//		or.setB(b);
//		or.setLb(lb);
//		or.setUb(ub);
//		
//		LPPrimalDualMethod opt = new LPPrimalDualMethod();
//		opt.setLPOptimizationRequest(or);
//		try {
//			opt.optimize();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println(gson.toJson(opt.getLPOptimizationResponse().getSolution()));
		
		
	}


}
