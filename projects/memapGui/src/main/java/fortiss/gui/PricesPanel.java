package fortiss.gui;

import fortiss.gui.style.Colors;
import fortiss.gui.style.StyleGenerator;
import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;
import net.miginfocom.swing.MigLayout;

public class PricesPanel extends InformationPanel {

	private static final long serialVersionUID = 1L;

	private PriceBoard elecBuyingPriceBoard;
	private PriceBoard elecSellingPriceBoard;
	//private PriceBoard heatBuyingPriceBoard;
		
	private PriceBoard co2EmissionsBoard;
	private MaxBuyLimitBoard maxBuyElecBoard;

	public PricesPanel() {
		StyleGenerator.setupStyle();
		setBackground(Colors.background);
		setForeground(Colors.normal);
		initialize();
	}

	private void initialize() {

		setLayout(new MigLayout("insets 0 0 0 0, fillx, wrap 1, hidemode 2, width 99%", "[center]", ""));

		elecBuyingPriceBoard = new PriceBoard("Electricity (buying price)");
		add(elecBuyingPriceBoard, "growx");

		elecSellingPriceBoard = new PriceBoard("Electricity (selling price)");
		add(elecSellingPriceBoard, "growx");
		
		co2EmissionsBoard = new PriceBoard("CO2 Emissions");
		add(co2EmissionsBoard, "growx");
		
		maxBuyElecBoard = new MaxBuyLimitBoard("Electricity Buy Limit");
		add(maxBuyElecBoard, "growx");

		/* TODO This Feature was desired but is not implemented in the backend yet.
		heatBuyingPriceBoard = new PriceBoard("Heat (buying price)");
		add(heatBuyingPriceBoard, "growx");
		*/
	}

	@Override
	public void update() {
		Parameters pars = PlanningTool.getInstance().getParameters();
		elecBuyingPriceBoard.setPrice(pars.getElecBuyingPrice());
		elecSellingPriceBoard.setPrice(pars.getElecSellingPrice());
		/* TODO see comment above
		 * heatBuyingPriceBoard.setPrice(pars.getHeatBuyingPrice());
		 */
		maxBuyElecBoard.setMaxLimit(pars.getMaxBuyLimit());
		co2EmissionsBoard.setPrice(pars.getCO2Emissions());
	}
}
