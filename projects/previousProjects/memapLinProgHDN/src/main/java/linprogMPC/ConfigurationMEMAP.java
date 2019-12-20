package linprogMPC;

/**
 * This class is used to configure the general behavior of the tool.
 * It is not intended to configure the topology or its parameters, etc.
 * 
 * @author bytschkow
 */
public class ConfigurationMEMAP {
		
	public static Optimizer chosenOptimizer = Optimizer.LP;
	public static OptimizationGoal chosenGoal = OptimizationGoal.EUR;
	public static OptHierarchy chosenOptimizationHierarchy = OptHierarchy.BUILDING;
	public static ToolUsage chosenToolUsage = ToolUsage.PLANNING;
	public static MEMAPLogging chosenMEMAPLogging =  MEMAPLogging.FILES;
	
	public enum OptHierarchy {
        BUILDING, MEMAP;
    }
	
	public enum Optimizer {
		MILP, LP, MILPwithConnections, LPwithConnections;
	}
	
	public enum OptimizationGoal {
		CO2, EUR
	}
	
	public enum ToolUsage{
		PLANNING, SERVER;
	}
	
	public enum MEMAPLogging{
		ALL, FILES, RESULTS_ONLY
	}
}