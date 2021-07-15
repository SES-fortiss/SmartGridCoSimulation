package fortiss.gui.listeners.textfield;

import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.NumberVerifier;
import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;

public class MPCHorizonListener extends TextFieldListener {

	public MPCHorizonListener() {
		super("Invalid number!", new NumberVerifier().withMaxLength(4));
	}

	@Override
	public void update(String text) {
		Parameters pars = PlanningTool.getInstance().getParameters();
		pars.setMPCHorizon(Integer.parseUnsignedInt(text));
		DesignerPanel.parameterPanel.update();
	}

	@Override
	public String getAttribute() {
		Parameters pars = PlanningTool.getInstance().getParameters();
		return Integer.toString(pars.getMPCHorizon());
	}	
	
}
