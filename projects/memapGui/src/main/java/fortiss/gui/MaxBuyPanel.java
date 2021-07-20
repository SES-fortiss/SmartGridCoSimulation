package fortiss.gui;

import fortiss.gui.style.Colors;
import fortiss.gui.style.StyleGenerator;
import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;
import net.miginfocom.swing.MigLayout;

public class MaxBuyPanel extends InformationPanel {

	private static final long serialVersionUID = 1L;

	private PriceBoard maxBuyElecBoard;

	public MaxBuyPanel() {
		StyleGenerator.setupStyle();
		setBackground(Colors.background);
		setForeground(Colors.normal);
		initialize();
	}

	private void initialize() {

		setLayout(new MigLayout("insets 0 0 0 0, fillx, wrap 1, hidemode 2, width 99%", "[center]", ""));

		maxBuyElecBoard = new PriceBoard("Power Threshold");
		add(maxBuyElecBoard, "growx");
	}

	@Override
	public void update() {
		Parameters pars = PlanningTool.getInstance().getParameters();
		maxBuyElecBoard.setPrice(pars.getMaxBuyLimit());;
	}

	public void plotLimitingWindow() {
		maxBuyElecBoard.plot();
	}

}
