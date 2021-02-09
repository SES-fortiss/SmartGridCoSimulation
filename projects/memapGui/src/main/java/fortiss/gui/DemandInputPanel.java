package fortiss.gui;

import java.awt.Cursor;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import fortiss.components.Demand;
import fortiss.datastructures.DataI;
import fortiss.gui.listeners.button.DBrowseListener;
import fortiss.gui.listeners.button.DPlotListener;
import fortiss.gui.listeners.textfield.DConsumptionListener;
import fortiss.gui.listeners.textfield.DNameListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import fortiss.gui.style.StyleGenerator;
import fortiss.media.IconStore;
import net.miginfocom.swing.MigLayout;

/**
 * Input panel for demand parameters.
 */
public class DemandInputPanel extends InformationPanel {

	private static final long serialVersionUID = 1L;

	/** Demand name */
	public JTextField txtDName;
	/** Demand consumption file path */
	public JTextField txtDConsumption;
	/** Demand area title label */
	private JLabel lblDemand;
	/** Demand name label */
	private JLabel lbDName;
	/** Demand consumption file path label */
	private JLabel lbDConsumption;
	/** Example of consumption file format */
	private JLabel lblCsvformat;
	/** CSV format instructions */
	private JLabel lblCsvInstructions;
	/** consumption file (CSV) warning */
	private JLabel lblCsvWarning;
	/** Plot panel */
	private PlotPanel plotPanel = new PlotPanel();

	/** Necessary for dark mode on/off implementation */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setForeground(Colors.normal);
		setBackground(Colors.background);
		plotPanel.setForeground(Colors.normal);
		plotPanel.setBackground(Colors.background);
		lblDemand.setForeground(Colors.title);
		lbDName.setForeground(Colors.normal);
		lbDConsumption.setForeground(Colors.normal);
		lblCsvInstructions.setForeground(Colors.normal);
		lblCsvWarning.setForeground(Colors.normal);
	}

	public DemandInputPanel() {
		StyleGenerator.setupStyle();
		initialize();
	}

	/**
	 * Initializes the contents of the panel.
	 */
	private void initialize() {
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Component information",
				TitledBorder.RIGHT, TitledBorder.TOP, null, Colors.accent2));

		setLayout(new MigLayout("insets 30 20 20 20, fillx, wrap 4, hidemode 2, width 99%", 
				"[left, growprio 50]30[right]10[right, grow 0]5[right, grow 0]", 
				""));
		
		lblDemand = new JLabel("DEMAND");
		lblDemand.setFont(Fonts.getOswald());
		add(lblDemand, "spanx, center, gapbottom 30");

		lbDName = new JLabel("Name");
		add(lbDName);

		txtDName = new JTextField();
		txtDName.setName("txtDName");
		txtDName.addKeyListener(new DNameListener());
		txtDName.addFocusListener(new DNameListener());
		txtDName.setColumns(10);
		add(txtDName, "spanx 3, growx");

		lbDConsumption = new JLabel("Consumption profile");
		add(lbDConsumption);

		txtDConsumption = new JTextField();
		txtDConsumption.addKeyListener(new DConsumptionListener());
		txtDConsumption.addFocusListener(new DConsumptionListener());
		txtDConsumption.setColumns(10);
		add(txtDConsumption, "wmin 200, growx");

		JButton btDBrowse = new JButton("");
		btDBrowse.addMouseListener(new DBrowseListener());
		btDBrowse.setIcon(IconStore.open);
		btDBrowse.setBorder(new EmptyBorder(3, 3, 3, 3));
		btDBrowse.setContentAreaFilled(false);
		add(btDBrowse, "wmax 40");

		JButton btDPlot = new JButton("");
		btDPlot.setIcon(IconStore.visualize);
		btDPlot.setBorder(new EmptyBorder(3, 3, 3, 3));
		btDPlot.setContentAreaFilled(false);
		btDPlot.addMouseListener(new DPlotListener());
		add(btDPlot, "wmax 40");

		lblCsvInstructions = new JLabel(
				"<html> <b> Consumption file format </b> <br/> <br/> CSV file with no headers <br/> Column 1: Heat &emsp; Column 2: Electricity <br/> Decimal separator: , <br/> Column separator: ;</html>");
		add(lblCsvInstructions, "spanx, gaptop 30");

		lblCsvformat = new JLabel("");
		lblCsvformat.setIcon(IconStore.csvFormat);
		add(lblCsvformat, "spanx, center");

		lblCsvWarning = new JLabel(
				"<html><font face=\"verdana\" color=\"red\">&#9888;</font> Note: If no consumption file is selected the default is zero</html>");
		add(lblCsvWarning, "spanx");

		plotPanel = new PlotPanel();
		plotPanel.setFocusable(false);
		plotPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(plotPanel, "spanx, center, gaptop 30");
		plotPanel.setVisible(false);
	}

	public void resetConsumptionFileField() {
		txtDConsumption.setText("");
	}

	public void plot() {
		if (plotPanel.isPlotted()) {
			plotPanel.setVisible(false);
			plotPanel.setPlotted(false);
		} else {
			Demand demand = (Demand) DesignerPanel.selectedComponent;
			DataI data = demand.getData();
			if (data != null) {	
				for (String seriesName : data.getSeriesList()) {
					plotPanel.addSeries(seriesName, data.getSeries(seriesName));
				}
			}
			plotPanel.setPlotted(true);
			plotPanel.setVisible(true);
		}
	}

	@Override
	public void update() {
		// hide plot and erase data
		plotPanel.setVisible(false);
		plotPanel.setPlotted(false);
		plotPanel.clearSeries();
		
		// load data of the selected component
		Demand demand = (Demand) DesignerPanel.selectedComponent;
		txtDName.setText(demand.getName());
		txtDConsumption.setText(demand.getConsumptionProfile());
	}
}
