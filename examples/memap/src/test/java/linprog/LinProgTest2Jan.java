package linprog;

import com.google.gson.Gson;
import com.joptimizer.optimizers.LPOptimizationRequest;
import com.joptimizer.optimizers.LPPrimalDualMethod;;

public class LinProgTest2Jan {
	
	public static void main(String[] args){
		
		Gson gson = new Gson();
		
		double[] c = {-1.0, -.33333};
		double[][] g = {{1.0, 1.0},{1.0, .25},{1.0, -1.0},{-.25, -1.0},{-1.0, -1.0},{-1.0, 1.0}};
		double[] h = {2.0, 1.0, 2.0, 1.0, -1.0, 2.0};
		double[] lb = {-5.0, -5.0};
		double[] ub = {5.0, 5.0};
		double[][] a = {{1.0, .25},{3.0, 0.0}};
		double[] b = {0.5, 0.0};
		// Beispiel aus https://www.mathworks.com/help/optim/ug/linprog.html
		// Lösung müsste sein: x = [0.0,2.0] - passt!

		LPOptimizationRequest or = new LPOptimizationRequest();
		or.setC(c);
		or.setG(g);
		or.setH(h);
		or.setA(a);
		or.setB(b);
		or.setLb(lb);
		or.setUb(ub);
		
		LPPrimalDualMethod opt = new LPPrimalDualMethod();
		opt.setLPOptimizationRequest(or);
		try {
			opt.optimize();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(gson.toJson(opt.getLPOptimizationResponse().getSolution()));
		
		
	}


}
