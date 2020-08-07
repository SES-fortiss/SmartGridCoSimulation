package fortiss.results.widgets;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

import fortiss.gui.DesignerPanel;
import fortiss.simulation.Parameters;

public class ParameterWidget extends JPanel {

	private static final long serialVersionUID = 1L;

	public ParameterWidget(){
		
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		Parameters pars = DesignerPanel.parameterPanel.pars;
		
		add(new TextBoxWidget(pars.getSimulationName(), "", "Simulation parameters"));
		add(new TextBoxWidget("", Double.toString(pars.getDays()), "DAYS"));
		add(new TextBoxWidget("", Double.toString(pars.getStepsPerDay()), "STEPS PER DAY"));
		add(new TextBoxWidget("", Double.toString(pars.getMPCHorizon()), "MPC HORIZON"));
		if(pars.isFixedPrice()) {
			add(new TextBoxWidget("", "FIXED", "MARKED PRICE"));
		} else {
			add(new TextBoxWidget("", "VARIABLE", "MARKED PRICE"));
		}
		add(new TextBoxWidget("", pars.getOptimizer(), "OPTIMIZER"));
		add(new TextBoxWidget("", pars.getOptCriteria(), "OPTIMIZATION CRITERIA"));
		
	}
}
