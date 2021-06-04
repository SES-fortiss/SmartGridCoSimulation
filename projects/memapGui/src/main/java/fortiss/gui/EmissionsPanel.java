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

public class EmissionsPanel extends InformationPanel {

	private static final long serialVersionUID = 1L;

	private PriceBoard co2EmissionsBoard;

	public EmissionsPanel() {
		StyleGenerator.setupStyle();
		setBackground(Colors.background);
		setForeground(Colors.normal);
		initialize();
	}

	private void initialize() {

		setLayout(new MigLayout("insets 0 0 0 0, fillx, wrap 1, hidemode 2, width 99%", "[center]", ""));

		/*
		JLabel lblSectionTitle = new JLabel("CO2 Emissions".toUpperCase(), SwingConstants.LEFT);
		lblSectionTitle.setFont(Fonts.getOswald(FontSize.SMALL));
		lblSectionTitle.setForeground(Colors.title);
		add(lblSectionTitle, "gapbottom 10, growx");
		*/

		co2EmissionsBoard = new PriceBoard("CO2 Emissions");
		add(co2EmissionsBoard, "growx");
	}

	@Override
	public void update() {
		Parameters pars = PlanningTool.getInstance().getParameters();
		co2EmissionsBoard.setPrice(pars.getCO2Emissions());;
	}

	public void plotCo2Emissions() {
		co2EmissionsBoard.plot();
	}

}
