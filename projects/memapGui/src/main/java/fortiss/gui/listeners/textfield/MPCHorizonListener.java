package fortiss.gui.listeners.textfield;

import fortiss.gui.DesignerPanel;
import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;

public class MPCHorizonListener extends NumberListener {

	public MPCHorizonListener() {
		super(false, false, 4);
	}

	@Override
	void update(String text) {
		Parameters pars = PlanningTool.getInstance().getParameters();
		pars.setMPCHorizon(Integer.parseUnsignedInt(text));
		DesignerPanel.parameterPanel.update();
	}

	@Override
	String getAttribute() {
		Parameters pars = PlanningTool.getInstance().getParameters();
		return Integer.toString(pars.getMPCHorizon());
	}	
	
}
