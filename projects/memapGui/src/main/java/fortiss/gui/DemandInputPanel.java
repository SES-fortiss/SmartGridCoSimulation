package fortiss.gui;

import java.awt.Cursor;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import fortiss.components.Demand;
import fortiss.datastructures.DataInterface;
import fortiss.gui.listeners.action.HoverMouseListener;
import fortiss.gui.listeners.button.DBrowseListener;
import fortiss.gui.listeners.button.DPlotListener;
import fortiss.gui.listeners.button.DReloadListener;
import fortiss.gui.listeners.textfield.ComponentFieldListener;
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

		setLayout(new MigLayout("insets 30 20 20 20, fillx, wrap 5, hidemode 2, width 99%", 
				"[left, growprio 50]30[right]10[right, grow 0]5[right, grow 0]", 
				""));
		
		lblDemand = new JLabel("DEMAND");
		lblDemand.setFont(Fonts.getOswald());
		add(lblDemand, "spanx, center, gapbottom 30");

		lbDName = new JLabel("Name");
		add(lbDName);

		txtDName = new JTextField();
		txtDName.setName("txtDName");
		ComponentFieldListener nameListener = new DNameListener();
		txtDName.addKeyListener(nameListener);
		txtDName.addFocusListener(nameListener);
		txtDName.setColumns(10);
		add(txtDName, "spanx 4, growx");

		lbDConsumption = new JLabel("Consumption profile");
		add(lbDConsumption);

		txtDConsumption = new JTextField();
		ComponentFieldListener consumptionFileListener = new DConsumptionListener();
		txtDConsumption.addKeyListener(consumptionFileListener);
		txtDConsumption.addFocusListener(consumptionFileListener);
		txtDConsumption.setColumns(10);
		add(txtDConsumption, "wmin 200, growx");

		JLabel btDBrowse = new JLabel("");
		btDBrowse.addMouseListener(new DBrowseListener());
		btDBrowse.setIcon(IconStore.open);
		btDBrowse.setBorder(new EmptyBorder(3, 3, 3, 3));
		btDBrowse.setToolTipText("Load csv file");
		btDBrowse.addMouseListener(new HoverMouseListener());
		add(btDBrowse, "wmax 40");
		
		JLabel btDReload = new JLabel("");
		btDReload.addMouseListener(new DReloadListener());
		btDReload.setIcon(IconStore.reset);
		btDReload.setToolTipText("Reload file");
		btDReload.setBorder(new EmptyBorder(3, 3, 3, 3));
		btDReload.addMouseListener(new HoverMouseListener());
		add(btDReload, "wmax 40");

		JLabel btDPlot = new JLabel("");
		btDPlot.setIcon(IconStore.visualize);
		btDPlot.setToolTipText("Show data");
		btDPlot.setBorder(new EmptyBorder(3, 3, 3, 3));
		btDPlot.addMouseListener(new DPlotListener());
		btDPlot.addMouseListener(new HoverMouseListener());
		add(btDPlot, "wmax 40");
		
		lblCsvInstructions = new JLabel(
				"<html> <b> Consumption file format: CSV </b> <br/> <br/> ");
		add(lblCsvInstructions, "spanx, gaptop 30");

		lblCsvformat = new JLabel("");
		lblCsvformat.setIcon(IconStore.csvFormatDEMAND);
		add(lblCsvformat, "spanx");
		
		lblCsvInstructions = new JLabel(
				"<html> Headers starting with # <br/> "
				+ "Column 1: DATE with format: 'yyyy-mm-dd' &emsp; <br/>"
				+ "Column 2: TIME with format: 'hh:mm:ss' &emsp; <br/>"
				+ "Column 3: ELECTRICITY with format: double with decimal ',' &emsp; <br/>"
				+ "Column 4: HEAT with format: double with decimal ',' &emsp; ");
		add(lblCsvInstructions, "spanx, gaptop 10");


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
			plotPanel.clearSeries();
			
			Demand demand = (Demand) DesignerPanel.selectedComponent;
			DataInterface data = demand.getData();
			if (data != null) {	
				for (String seriesName : data.getSeriesList()) {
					
					if (data.getXValues(seriesName).size() < 200) {
						ArrayList<String> onlyTimes = new ArrayList<>();
						data.getXValues(seriesName).forEach( s -> onlyTimes.add(s.split("T")[1]));	
						plotPanel.addSeries(seriesName, onlyTimes, data.getYValues(seriesName));
					} else {
						plotPanel.addSeries(seriesName, data.getXValues(seriesName), data.getYValues(seriesName));
					}
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
