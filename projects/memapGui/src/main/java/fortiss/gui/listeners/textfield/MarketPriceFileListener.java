package fortiss.gui.listeners.textfield;

import fortiss.gui.DesignerPanel;
import fortiss.simulation.PlanningTool;

public class MarketPriceFileListener extends PathListener {

	@Override
	void update(String text) {
		PlanningTool.getInstance().getParameters().setMarketPriceFile(text);
		DesignerPanel.parameterPanel.update();
	}

	@Override
	String getAttribute() {
		return PlanningTool.getInstance().getParameters().getMarketPriceFile();
	}
}
