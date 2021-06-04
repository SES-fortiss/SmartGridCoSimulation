package fortiss.gui;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import fortiss.gui.style.Colors;
import fortiss.gui.style.FontSize;
import fortiss.gui.style.Fonts;
import fortiss.gui.style.StyleGenerator;
import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;
import net.miginfocom.swing.MigLayout;

public class PricesPanel extends InformationPanel {

	private static final long serialVersionUID = 1L;

	private PriceBoard elecBuyingPriceBoard;
	private PriceBoard elecSellingPriceBoard;
	private PriceBoard heatBuyingPriceBoard;

	public PricesPanel() {
		StyleGenerator.setupStyle();
		setBackground(Colors.background);
		setForeground(Colors.normal);
		initialize();
	}

	private void initialize() {

		setLayout(new MigLayout("insets 0 0 0 0, fillx, wrap 1, hidemode 2, width 99%", "[center]", ""));

		/*
		JLabel lblSectionTitle = new JLabel("Energy prices".toUpperCase(), SwingConstants.LEFT);
		lblSectionTitle.setFont(Fonts.getOswald(FontSize.SMALL));
		lblSectionTitle.setForeground(Colors.title);
		add(lblSectionTitle, "gapbottom 0, growx");
		*/

		elecBuyingPriceBoard = new PriceBoard("Electricity (buying price)");
		add(elecBuyingPriceBoard, "growx");

		elecSellingPriceBoard = new PriceBoard("Electricity (selling price)");
		add(elecSellingPriceBoard, "growx");

		heatBuyingPriceBoard = new PriceBoard("Heat (buying price)");
		add(heatBuyingPriceBoard, "growx");
	}

	@Override
	public void update() {
		Parameters pars = PlanningTool.getInstance().getParameters();
		elecBuyingPriceBoard.setPrice(pars.getElecBuyingPrice());;
		elecSellingPriceBoard.setPrice(pars.getElecSellingPrice());
		heatBuyingPriceBoard.setPrice(pars.getHeatBuyingPrice());
	}

	public void plotElecBuyingPrice() {
		elecBuyingPriceBoard.plot();
	}

	public void plotElecSellingPrice() {
		elecSellingPriceBoard.plot();
	}

	public void plotHeatBuyingPrice() {
		heatBuyingPriceBoard.plot();
	}

}
