package fortiss.gui;

import java.awt.ComponentOrientation;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import fortiss.gui.commands.RunCommand;
import fortiss.gui.listeners.action.ButtonListener;
import fortiss.gui.listeners.label.LoggingModeListener;
import fortiss.gui.listeners.label.OptimizationCriteriaListener;
import fortiss.gui.listeners.label.OptimizerListener;
import fortiss.gui.listeners.textfield.DaysListener;
import fortiss.gui.listeners.textfield.MPCHorizonListener;
import fortiss.gui.listeners.textfield.StepsPerDayListener;
import fortiss.gui.listeners.textfield.TextFieldListener;
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

	private JScrollPane scrollPane;
	/** steps MPC horizon. An integer */
	private JTextField txtSteps;
	/** length MemapSimulation steps. An integer */
	private JTextField txtLength;
	/** Number of days chooser */
	public JTextField txtDays;
	/** Optimization criteria icon */
	public JLabel lbOptCriteria2;
	/** Optimizer icon */
	public JLabel lbOptimizer2;
	/** Buying price icon */
	public JLabel lbFixedBuyingPrice;
	/** Selling price icon */
	public JLabel lbFixedSellingPrice;
	/** Logging Mode */
	public JLabel lbLoggingMode2;

	/** label for title */
	private JLabel lbTitle;
	/** label for simulation name length */
	private JLabel lbSimulationName;
	/** Simulation name */
	private JLabel lbSimulationName2;
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
	/** label for logging Mode */
	private JLabel lbLoggingMode;

	private MaxBuyPanel maxBuyPanel;
	private PricesPanel pricesPanel;
	private EmissionsPanel emissionsPanel;	
	

	/** Necessary for dark mode on/off implementation */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Colors.background);
		setForeground(Colors.normal);
		lbTitle.setForeground(Colors.title);
		lbSimulationName.setForeground(Colors.normal);
		lbSimulationName2.setForeground(Colors.normal);
		lbLength.setForeground(Colors.normal);
		lbSteps.setForeground(Colors.normal);
		lbDays.setForeground(Colors.normal);
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
		
		setLayout(new MigLayout("insets 0 0 0 0, fill, wrap 1, width 99%",
				"", ""));
		
		JPanel innerPanel = new JPanel();
		innerPanel.setBackground(Colors.background);
		
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Parameter input", TitledBorder.RIGHT,
				TitledBorder.TOP, null, Colors.accent2));

		innerPanel.setLayout(new MigLayout("insets 30 20 20 20, fill, wrap 2, hidemode 2, width 99%",
				"[left, growprio 50]5[right, grow 0]", ""));

		lbTitle = new JLabel("SIMULATION PARAMETERS");
		lbTitle.setFont(Fonts.getOswald());
		lbTitle.setForeground(Colors.title);
		innerPanel.add(lbTitle, "left, gapbottom 30");
		
		JButton btAccept = new JButton("Start simulation");
		btAccept.addMouseListener(new ButtonListener(new RunCommand()));
		innerPanel.add(btAccept, "right, gaptop 10");

		lbSimulationName = new JLabel("Simulation name");
		innerPanel.add(lbSimulationName);

		lbSimulationName2 = new JLabel();
		lbSimulationName2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		lbSimulationName2.setText("");
		innerPanel.add(lbSimulationName2, "growx");

		lbLength = new JLabel("Steps per day");
		innerPanel.add(lbLength);

		txtLength = new JTextField();
		txtLength.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		txtLength.setText("");
		TextFieldListener stepsPerDayListener = new StepsPerDayListener();
		txtLength.addKeyListener(stepsPerDayListener);
		txtLength.addFocusListener(stepsPerDayListener);
		txtLength.setColumns(7);
		innerPanel.add(txtLength, "growx");

		lbSteps = new JLabel("MPC horizon");
		innerPanel.add(lbSteps);

		txtSteps = new JTextField();
		txtSteps.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		txtSteps.setText("");
		TextFieldListener mpcHorizonListener = new MPCHorizonListener();
		txtSteps.addKeyListener(mpcHorizonListener);
		txtSteps.addFocusListener(mpcHorizonListener);
		txtSteps.setColumns(7);
		innerPanel.add(txtSteps, "growx");

		lbDays = new JLabel("Number of days");
		innerPanel.add(lbDays);

		txtDays = new JTextField();
		txtDays.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		txtDays.setText("");
		TextFieldListener daysListener = new DaysListener();
		txtDays.addKeyListener(daysListener);
		txtDays.addFocusListener(daysListener);
		txtDays.setColumns(7);
		innerPanel.add(txtDays, " growx");

		// Optimizer section
		lbOptimizer = new JLabel("Optimizer");
		innerPanel.add(lbOptimizer);

		lbOptimizer2 = new JLabel("");
		lbOptimizer2.setIcon(IconStore.lp);
		lbOptimizer2.addMouseListener(new OptimizerListener());
		innerPanel.add(lbOptimizer2);

		lbOptCriteria = new JLabel("Optimization criteria");
		innerPanel.add(lbOptCriteria);

		lbOptCriteria2 = new JLabel("");
		lbOptCriteria2.setIcon(IconStore.optCost);
		lbOptCriteria2.addMouseListener(new OptimizationCriteriaListener());
		innerPanel.add(lbOptCriteria2);

		lbLoggingMode = new JLabel("Logging mode");
		innerPanel.add(lbLoggingMode);

		lbLoggingMode2 = new JLabel("");
		lbLoggingMode2.setIcon(IconStore.resultLogs);
		lbLoggingMode2.addMouseListener(new LoggingModeListener());
		innerPanel.add(lbLoggingMode2);

		maxBuyPanel = new MaxBuyPanel();
		innerPanel.add(maxBuyPanel, "spanx, growx, growy");
		
		pricesPanel = new PricesPanel();
		innerPanel.add(pricesPanel, "spanx, growx, growy");
		
		emissionsPanel = new EmissionsPanel();
		innerPanel.add(emissionsPanel, "spanx, growx, growy");
		
		
		scrollPane = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setViewportView(innerPanel);
		scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		add(scrollPane, "grow");
	}

	/**
	 * Updates all the fields of the panel according to the parameters
	 */
	@Override
	public void update() {

		// load data of the selected component
		Parameters pars = PlanningTool.getInstance().getParameters();
		lbSimulationName2.setText(pars.getSimulationName());
		txtSteps.setText(Integer.toString(pars.getMPCHorizon()));
		txtLength.setText(Integer.toString(pars.getStepsPerDay()));
		txtDays.setText(Integer.toString(pars.getDays()));

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
		
		maxBuyPanel.update();
		pricesPanel.update();
		emissionsPanel.update();
	}

}
