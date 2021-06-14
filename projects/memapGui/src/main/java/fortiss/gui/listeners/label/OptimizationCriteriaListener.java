package fortiss.gui.listeners.label;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;

public class OptimizationCriteriaListener extends MouseAdapter {

	/**
	 * Set the optimization criteria to the user selection. Cyclic approach: every
	 * click is equivalent to a shift in the value and icon assigned.
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		Parameters pars = PlanningTool.getInstance().getParameters();
		pars.nextOptCriteria();
	}
}
