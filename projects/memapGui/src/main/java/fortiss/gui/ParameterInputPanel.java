package fortiss.gui;

import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import fortiss.datastructures.DataInterface;
import fortiss.gui.commands.RunCommand;
import fortiss.gui.listeners.action.ButtonListener;
import fortiss.gui.listeners.action.HoverMouseListener;
import fortiss.gui.listeners.button.PBrowseListener;
import fortiss.gui.listeners.button.PPlotListener;
import fortiss.gui.listeners.button.PReloadListner;
import fortiss.gui.listeners.label.LoggingModeListener;
import fortiss.gui.listeners.label.MarketPriceListener;
import fortiss.gui.listeners.label.OptimizationCriteriaListener;
import fortiss.gui.listeners.label.OptimizerListener;
import fortiss.gui.listeners.textfield.DaysListener;
import fortiss.gui.listeners.textfield.FixedValueListener;
import fortiss.gui.listeners.textfield.LengthListener;
import fortiss.gui.listeners.textfield.MarketPriceFileListener;
import fortiss.gui.listeners.textfield.SimulationNameListener;
import fortiss.gui.listeners.textfield.StepsListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import fortiss.gui.style.StyleGenerator;
import fortiss.media.IconStore;
import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;
import net.miginfocom.swing.MigLayout;

/**
 * Parameter input panel
 */
public class ParameterInputPanel extends InformationPanel {

	private static final long serialVersionUID = 1L;

	/** Simulation name */
	private JTextField txtSimulationName;
	/** steps MPC horizon. An integer */
	private JTextField txtSteps;
	/** length MemapSimulation steps. An integer */
	private JTextField txtLength;
	/** Number of days chooser */
	public JTextField txtDays;
	/** path to a file that describe variability in market prices */
	public JTextField txtMarketPriceFile;
	/** Fixed value for market price */
	private JTextField txtFixedValue;
	/** Optimization criteria icon */
	public JLabel lbOptCriteria2;
	/** Optimizer icon */
	public JLabel lbOptimizer2;
	/** Market price icon */
	public JLabel lbMarketPrice;
	/** Logging Mode */
	public JLabel lbLoggingMode2;

	/** label for title */
	private JLabel lbTitle;
	/** label for simulation name length */
	private JLabel lbSimulationName;
	/** label for MemapSimulation length */
	private JLabel lbLength;
	/** label for steps MPC horizon */
	private JLabel lbSteps;
	/** label for number of days */
	private JLabel lbDays;
	/** label for optimization criteria */
	private JLabel lbOptCriteria;
	/** label for optimizer */
	private JLabel lbOptimizer;
	/** label for market price type */
	private JLabel lbPrice;
	/** label for fixed market price */
	private JLabel lbPriceFixed;
	/** label for market price instruction */
	private JLabel lbMarketPriceInstruction;
	/** label for logging Mode */
	private JLabel lbLoggingMode;
	/** button to open file selection window */
	private JLabel btBrowse;
	/** button to plot variable price */
	private JLabel btPlot;
	/** button to reload selected file */
	private JLabel btReload;
	
	/** Plot panel */
	private PlotPanel plotPanel = new PlotPanel();

	/** Necessary for dark mode on/off implementation */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Colors.background);
		setForeground(Colors.normal);
		lbTitle.setForeground(Colors.title);
		lbSimulationName.setForeground(Colors.normal);
		lbLength.setForeground(Colors.normal);
		lbSteps.setForeground(Colors.normal);
		lbDays.setForeground(Colors.normal);
		lbPrice.setForeground(Colors.normal);
		lbPriceFixed.setForeground(Colors.normal);
		lbMarketPriceInstruction.setForeground(Colors.normal);
		lbOptimizer.setForeground(Colors.normal);
		lbLoggingMode.setForeground(Colors.normal);
		lbOptCriteria.setForeground(Colors.normal);
	}

	public ParameterInputPanel() {
		StyleGenerator.setupStyle();
		setBackground(Colors.background);
		setForeground(Colors.normal);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Parameter input", TitledBorder.RIGHT,
				TitledBorder.TOP, null, Colors.accent2));

		setLayout(new MigLayout("insets 30 20 20 20, fillx, wrap 5, hidemode 2, width 99%",
				"[left, growprio 50]30[right]10[right, grow 0]5[right, grow 0]", ""));

		Parameters pars = PlanningTool.getInstance().getParameters();

		lbTitle = new JLabel("SIMULATION PARAMETERS");
		lbTitle.setFont(Fonts.getOswald());
		lbTitle.setForeground(Colors.title);
		add(lbTitle, "spanx, center, gapbottom 30");

		lbSimulationName = new JLabel("Simulation name");
		add(lbSimulationName);

		txtSimulationName = new JTextField();
		txtSimulationName.setText(pars.getSimulationName());
		txtSimulationName.addKeyListener(new SimulationNameListener());
		txtSimulationName.addFocusListener(new SimulationNameListener());
		txtSimulationName.setColumns(20);
		add(txtSimulationName, "spanx 4, growx");

		lbLength = new JLabel("Steps per day");
		add(lbLength);

		txtLength = new JTextField();
		txtLength.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		txtLength.setText(Integer.toString(pars.getStepsPerDay()));
		txtLength.addKeyListener(new LengthListener());
		txtLength.addFocusListener(new LengthListener());
		txtLength.setColumns(7);
		add(txtLength, "spanx 4, growx");

		lbSteps = new JLabel("MPC horizon");
		add(lbSteps);

		txtSteps = new JTextField();
		txtSteps.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		txtSteps.setText(Integer.toString(pars.getMPCHorizon()));
		txtSteps.addKeyListener(new StepsListener());
		txtSteps.addFocusListener(new StepsListener());
		txtSteps.setColumns(7);
		add(txtSteps, "spanx 4, growx");

		lbDays = new JLabel("Number of days");
		add(lbDays);

		txtDays = new JTextField();
		txtDays.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		txtDays.setText(Integer.toString(pars.getDays()));
		txtDays.addKeyListener(new DaysListener());
		txtDays.addFocusListener(new DaysListener());
		txtDays.setColumns(7);
		add(txtDays, "spanx 4, growx");

		lbPrice = new JLabel("Market electricity price type");
		add(lbPrice);

		lbMarketPrice = new JLabel("");
		lbMarketPrice.addMouseListener(new MarketPriceListener());
		add(lbMarketPrice, "spanx 4");

		lbPriceFixed = new JLabel("Market electricityprice [EUR/kWh]");
		add(lbPriceFixed, "hidemode 3");

		txtFixedValue = new JTextField("");
		txtFixedValue.setText(Double.toString(pars.getFixedMarketPrice()));
		txtFixedValue.addKeyListener(new FixedValueListener());
		txtFixedValue.addFocusListener(new FixedValueListener());
		txtFixedValue.setColumns(7);
		add(txtFixedValue, "spanx 4, growx, hidemode 3");

		lbMarketPriceInstruction = new JLabel("Select a file");
		add(lbMarketPriceInstruction, "hidemode 3");

		txtMarketPriceFile = new JTextField("");
		txtMarketPriceFile.addKeyListener(new MarketPriceFileListener());
		txtMarketPriceFile.addFocusListener(new MarketPriceFileListener());
		txtMarketPriceFile.setColumns(10);
		add(txtMarketPriceFile, "wmin 150, growx, hidemode 3");
		
		btBrowse = new JLabel("");
		btBrowse.addMouseListener(new PBrowseListener());
		btBrowse.setIcon(IconStore.open);
		btBrowse.setToolTipText("Load csv file");
		btBrowse.addMouseListener(new HoverMouseListener());
		btBrowse.setBorder(new EmptyBorder(3, 3, 3, 3));
		add(btBrowse, "hidemode 3, wmax 40");
		
		btReload = new JLabel("");
		btReload.setIcon(IconStore.reset);
		btReload.setToolTipText("Reload file");
		btReload.setBorder(new EmptyBorder(3, 3, 3, 3));
		btReload.addMouseListener(new HoverMouseListener());
		btReload.addMouseListener(new PReloadListner());
		add(btReload, "hidemode 3, wmax 40");

		btPlot = new JLabel("");
		btPlot.setIcon(IconStore.visualize);
		btPlot.setBorder(new EmptyBorder(3, 3, 3, 3));
		btPlot.setToolTipText("Show data");
		btPlot.addMouseListener(new PPlotListener());
		btPlot.addMouseListener(new HoverMouseListener());
		add(btPlot, "hidemode 3, wmax 40");

		plotPanel = new PlotPanel();
		plotPanel.setFocusable(false);
		plotPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(plotPanel, "spanx, center, gaptop 20, gapbottom 20, hidemode 3");
		plotPanel.setVisible(false);

		lbOptimizer = new JLabel("Optimizer");
		add(lbOptimizer);

		lbOptimizer2 = new JLabel("");
		lbOptimizer2.setIcon(IconStore.lp);
		lbOptimizer2.addMouseListener(new OptimizerListener());
		add(lbOptimizer2, "spanx 4");

		lbOptCriteria = new JLabel("Optimization criteria");
		add(lbOptCriteria);

		lbOptCriteria2 = new JLabel("");
		lbOptCriteria2.setIcon(IconStore.optCost);
		lbOptCriteria2.addMouseListener(new OptimizationCriteriaListener());
		add(lbOptCriteria2, "spanx 4");

		lbLoggingMode = new JLabel("Logging mode");
		add(lbLoggingMode);

		lbLoggingMode2 = new JLabel("");
		lbLoggingMode2.setIcon(IconStore.resultLogs);
		lbLoggingMode2.addMouseListener(new LoggingModeListener());
		add(lbLoggingMode2, "spanx 4");

		JButton btAccept = new JButton("Start simulation");
		btAccept.addMouseListener(new ButtonListener(new RunCommand()));
		add(btAccept, "spanx, center, gaptop 30");

		// Must be called at the end, when all other graphical components exist.
		updateMarketPriceOptions(pars);
	}

	public void plot() {

		if (plotPanel.isPlotted()) {
			plotPanel.setVisible(false);
			plotPanel.setPlotted(false);
		} else {
			
			plotPanel.clearSeries();
			Parameters parameters = PlanningTool.getInstance().getParameters();
			DataInterface data = parameters.getData();
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

	/**
	 * Updates the market price options show to the user according to their
	 * selection
	 */
	public void updateMarketPriceOptions(Parameters pars) {

		if (pars.isFixedPrice()) {
			lbMarketPrice.setIcon(IconStore.fixedMarket);
			txtFixedValue.setText(Double.toString(pars.getFixedMarketPrice()));
			lbPriceFixed.setVisible(true);
			txtFixedValue.setVisible(true);
			btBrowse.setVisible(false);
			btPlot.setVisible(false);
			btReload.setVisible(false);
			lbMarketPriceInstruction.setVisible(false);
			txtMarketPriceFile.setVisible(false);
			plotPanel.setVisible(false);
			plotPanel.setPlotted(false);

		} else {
			lbMarketPrice.setIcon(IconStore.variableMarket);
			txtMarketPriceFile.setText(pars.getMarketPriceFile());
			lbPriceFixed.setVisible(false);
			txtFixedValue.setVisible(false);
			btBrowse.setVisible(true);
			btPlot.setVisible(true);
			btReload.setVisible(true);
			lbMarketPriceInstruction.setVisible(true);
			txtMarketPriceFile.setVisible(true);
		}

	}

	/**
	 * Updates all the fields of the panel according to the parameters
	 */
	@Override
	public void update() {

		// hide plot and erase data
		plotPanel.setVisible(false);
		plotPanel.setPlotted(false);
		plotPanel.clearSeries();

		// load data of the selected component
		Parameters pars = PlanningTool.getInstance().getParameters();
		txtSimulationName.setText(pars.getSimulationName());
		txtSteps.setText(Integer.toString(pars.getMPCHorizon()));
		txtLength.setText(Integer.toString(pars.getStepsPerDay()));
		txtDays.setText(Integer.toString(pars.getDays()));

		updateMarketPriceOptions(pars);

		if (pars.getOptCriteria().equals("co2"))
			lbOptCriteria2.setIcon(IconStore.optCO2);
		if (pars.getOptCriteria().equals("cost"))
			lbOptCriteria2.setIcon(IconStore.optCost);

		if (pars.getLoggingMode().equals("resultLogs"))
			lbLoggingMode2.setIcon(IconStore.resultLogs);
		if (pars.getLoggingMode().equals("fileLogs"))
			lbLoggingMode2.setIcon(IconStore.fileLogs);
		if (pars.getLoggingMode().equals("allLogs"))
			lbLoggingMode2.setIcon(IconStore.allLogs);

		if (pars.getOptimizer().equals("lp"))
			lbOptimizer2.setIcon(IconStore.lp);
		if (pars.getOptimizer().equals("milp"))
			lbOptimizer2.setIcon(IconStore.milp);

	}

}
