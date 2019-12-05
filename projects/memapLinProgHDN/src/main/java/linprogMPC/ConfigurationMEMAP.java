package linprogMPC;

/**
 * This class is used to configure the general behavior of the tool.
 * It is not intended to configure the topology or its parameters, etc.
 * 
 * @author bytschkow
 */
public class ConfigurationMEMAP {
		
	public static Optimizer chosenOptimizer = Optimizer.MILPwithConnections;
	public static OptHierarchy chosenOptimizationHierarchy = OptHierarchy.MEMAP;
	public static ToolUsage chosenToolUsage = ToolUsage.PLANNING;
	public static MilpLogging chosenMilpLogging =  MilpLogging.RESULTS_ONLY;		
	
	public enum OptHierarchy {
        BUILDING, MEMAP;
    }
	
	public enum Optimizer {
		MILP, LP, MILPwithConnections, LPwithConnections;
	}
	
	public enum ToolUsage{
		PLANNING, SERVER;
	}
	
	public enum MilpLogging{
		ALL, FILES, RESULTS_ONLY
	}
}