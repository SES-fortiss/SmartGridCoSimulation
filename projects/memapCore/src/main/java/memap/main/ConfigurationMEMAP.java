package memap.main;

import memap.helper.MEMAPLogging;
import memap.helper.configurationOptions.OptHierarchy;
import memap.helper.configurationOptions.OptimizationCriteria;
import memap.helper.configurationOptions.Optimizer;
import memap.helper.configurationOptions.ToolUsage;

/**
 * This class is used to configure the general behavior of the tool. It is not
 * intended to configure the topology or its parameters, etc.
 * 
 * @author bytschkow
 */
public class ConfigurationMEMAP {

	private Optimizer optimizer;
	private OptimizationCriteria optimizationCriteria;
	private OptHierarchy optimizationHierarchy;
	private ToolUsage toolUsage;
	private MEMAPLogging logging;

	public ConfigurationMEMAP(Optimizer optimizer, OptimizationCriteria optimizationCriteria,
			OptHierarchy optimizationHierarchy, ToolUsage toolUsage, MEMAPLogging logging) {
		setOptimizer(optimizer);
		setOptimizationCriteria(optimizationCriteria);
		setOptimizationHierarchy(optimizationHierarchy);
		setToolUsage(toolUsage);
		setLogging(logging);
	}

	public Optimizer getOptimizer() {
		return optimizer;
	}

	private void setOptimizer(Optimizer optimizer) {
		this.optimizer = optimizer;
	}

	public OptHierarchy getOptimizationHierarchy() {
		return optimizationHierarchy;
	}

	public void setOptimizationHierarchy(OptHierarchy optimizationHierarchy) {
		this.optimizationHierarchy = optimizationHierarchy;
	}

	public OptimizationCriteria getOptimizationCriteria() {
		return optimizationCriteria;
	}

	private void setOptimizationCriteria(OptimizationCriteria optimizationCriteria) {
		this.optimizationCriteria = optimizationCriteria;
	}

	public ToolUsage getToolUsage() {
		return toolUsage;
	}

	private void setToolUsage(ToolUsage toolUsage) {
		this.toolUsage = toolUsage;
	}

	public MEMAPLogging getLogging() {
		return logging;
	}

	private void setLogging(MEMAPLogging logging) {
		this.logging = logging;
	}
	
}
