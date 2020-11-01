package fortiss.gui;

import java.awt.ComponentOrientation;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import fortiss.gui.commands.RunCommand;
import fortiss.gui.listeners.action.ButtonListener;
import fortiss.gui.listeners.button.BrowseListener;
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
	/** label for market price */
	private JLabel lbPrice;
	/** label for market price instruction */
	private JLabel lbMarketPriceInstruction;
	/** label for logging Mode */
	private JLabel lbLoggingMode;
	/** button to open file selection window */
	private JButton btBrowse;

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
		
		setLayout(new MigLayout("insets 30 30 30 30, center, hidemode 2, wrap 3, fillx, width 60%", 
				"[left]10[right]5[right]", 
				"[center]30[]10[]10[]10[]10[]10[]10[]10[]10[]30[]"));

		Parameters pars = PlanningTool.getInstance().getParameters();
		
		lbTitle = new JLabel("SIMULATION PARAMETERS");
		lbTitle.setFont(Fonts.getOswald());
		lbTitle.setForeground(Colors.title);
		add(lbTitle, "span 3, center");

		lbSimulationName = new JLabel("Simulation name");
		add(lbSimulationName);

		txtSimulationName = new JTextField();
		add(txtSimulationName, "span 2");
		txtSimulationName.setText(pars.getSimulationName());
		txtSimulationName.addKeyListener(new SimulationNameListener());
		txtSimulationName.addFocusListener(new SimulationNameListener());
		txtSimulationName.setColumns(20);

		lbLength = new JLabel("Steps per day");
		add(lbLength);

		txtLength = new JTextField();
		txtLength.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		txtLength.setText(Integer.toString(pars.getStepsPerDay()));
		txtLength.addKeyListener(new LengthListener());
		txtLength.addFocusListener(new LengthListener());
		add(txtLength, "span 2");
		txtLength.setColumns(7);

		lbSteps = new JLabel("MPC horizon");
		add(lbSteps);

		txtSteps = new JTextField();
		txtSteps.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		txtSteps.setText(Integer.toString(pars.getMPCHorizon()));
		txtSteps.addKeyListener(new StepsListener());
		txtSteps.addFocusListener(new StepsListener());
		add(txtSteps, "span 2");
		txtSteps.setColumns(7);

		lbDays = new JLabel("Number of days");
		add(lbDays);

		txtDays = new JTextField();
		txtDays.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		txtDays.setText(Integer.toString(pars.getDays()));
		txtDays.addKeyListener(new DaysListener());
		txtDays.addFocusListener(new DaysListener());
		add(txtDays, "span 2");
		txtDays.setColumns(7);

		lbPrice = new JLabel("Market electricityprice [EUR/kWh]");
		add(lbPrice);

		txtFixedValue = new JTextField("");
		txtFixedValue.setText(Double.toString(pars.getFixedMarketPrice()));
		txtFixedValue.addKeyListener(new FixedValueListener());
		txtFixedValue.addFocusListener(new FixedValueListener());
		add(txtFixedValue, "right");
		txtFixedValue.setColumns(7);

		lbMarketPrice = new JLabel("");
		lbMarketPrice.addMouseListener(new MarketPriceListener());
		add(lbMarketPrice, "wrap");
		
		lbMarketPriceInstruction = new JLabel("Select a file");
		add(lbMarketPriceInstruction, "hidemode 3");
		
		txtMarketPriceFile = new JTextField("");
		txtMarketPriceFile.addKeyListener(new MarketPriceFileListener());
		txtMarketPriceFile.addFocusListener(new MarketPriceFileListener());
		add(txtMarketPriceFile, "hidemode 3");
		txtMarketPriceFile.setColumns(10);
		
		btBrowse = new JButton("");
		btBrowse.addMouseListener(new BrowseListener());
		btBrowse.setIcon(IconStore.open);
		btBrowse.setBorder(new EmptyBorder(3, 3, 3, 3));
		btBrowse.setContentAreaFilled(false);
		add(btBrowse, "hidemode 3");

		lbOptimizer = new JLabel("Optimizer");
		add(lbOptimizer);

		lbOptimizer2 = new JLabel("");
		lbOptimizer2.setIcon(IconStore.lp);
		lbOptimizer2.addMouseListener(new OptimizerListener());
		add(lbOptimizer2, "span2");

		lbOptCriteria = new JLabel("Optimization criteria");
		add(lbOptCriteria);

		lbOptCriteria2 = new JLabel("");
		lbOptCriteria2.setIcon(IconStore.optCost);
		lbOptCriteria2.addMouseListener(new OptimizationCriteriaListener());
		add(lbOptCriteria2, "span2");

		lbLoggingMode = new JLabel("Logging mode");
		add(lbLoggingMode);

		lbLoggingMode2 = new JLabel("");
		lbLoggingMode2.setIcon(IconStore.resultLogs);
		lbLoggingMode2.addMouseListener(new LoggingModeListener());
		add(lbLoggingMode2, "span2");

		JButton btAccept = new JButton("Start simulation");
		btAccept.addMouseListener(new ButtonListener(new RunCommand()));
		add(btAccept, "span 3, center");
		
		// Must be called at the end, when all other graphical components exist.
		updateMarketPriceOptions(pars);
	}

	/**
	 * Updates the market price options show to the user according to their
	 * selection
	 */
	public void updateMarketPriceOptions(Parameters pars) {
		
		if (pars.isFixedPrice()) {
			lbMarketPrice.setIcon(IconStore.fixedMarket);
			txtFixedValue.setText(Double.toString(pars.getFixedMarketPrice()));
			txtFixedValue.setVisible(true);
			btBrowse.setVisible(false);
			lbMarketPriceInstruction.setVisible(false);
			txtMarketPriceFile.setVisible(false);

		} else {
			lbMarketPrice.setIcon(IconStore.variableMarket);
			txtMarketPriceFile.setText(pars.getMarketPriceFile());
			txtFixedValue.setVisible(false);
			btBrowse.setVisible(true);
			lbMarketPriceInstruction.setVisible(true);
			txtMarketPriceFile.setVisible(true);
		}

	}

	/**
	 * Updates all the fields of the panel according to the parameters
	 */
	@Override
	public void update() {
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
