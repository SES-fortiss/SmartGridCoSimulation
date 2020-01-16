package fortiss.gui;

import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import fortiss.gui.listeners.button.AcceptListener;
import fortiss.gui.listeners.button.BrowseListener;
import fortiss.gui.listeners.label.LoggingModeListener;
import fortiss.gui.listeners.label.MarketPriceListener;
import fortiss.gui.listeners.label.MemapListener;
import fortiss.gui.listeners.label.OptimizationCriteriaListener;
import fortiss.gui.listeners.label.OptimizerListener;
import fortiss.gui.listeners.selectionitem.DaysListener;
import fortiss.gui.listeners.textfield.FixedValueListener;
import fortiss.gui.listeners.textfield.LengthListener;
import fortiss.gui.listeners.textfield.MarketPriceFileListener;
import fortiss.gui.listeners.textfield.SimulationNameListener;
import fortiss.gui.listeners.textfield.StepsListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import fortiss.gui.style.StyleGenerator;
import fortiss.media.Icon;
import fortiss.simulation.Parameters;
import com.jgoodies.forms.layout.Sizes;

/**
 * Parameter input panel
 */
public class ParameterInputPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/** Parameters of the simulation */
	public Parameters pars;

	/** Simulation name */
	private JTextField txtSimulationName;
	/** steps MPC horizon. An integer */
	private JTextField txtSteps;
	/** length MemapSimulation steps. An integer */
	private JTextField txtLength;
	/** path to a file that describe variability in market prices */
	public JTextField txtMarketPriceFile;
	/** Fixed value for market price */
	private JTextField txtFixedValue;
	/** Optimization criteria icon */
	public JLabel lbOptCriteria2;
	/** Optimizer icon */
	public JLabel lbOptimizer2;
	/** Optimization mode icon */
	public JLabel lbMemap2;
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
	/** label for optimization mode */
	private JLabel lbMemap;
	/** label for market price */
	private JLabel lbPrice;
	/** label for market price instruction */
	private JLabel lbMarketPriceInstruction;
	/** label for logging Mode */
	private JLabel lbLoggingMode;
	/** button to open file selection window */
	private JButton btBrowse;
	/** Number of days chooser */
	public JComboBox<Integer> sDays;

	/** Necessary for dark mode on/off implementation */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Colors.background);
		setForeground(Colors.normal);
		lbTitle.setForeground(Colors.title);
		lbLength.setForeground(Colors.normal);
		lbSteps.setForeground(Colors.normal);
		lbDays.setForeground(Colors.normal);
		lbMemap.setForeground(Colors.normal);
		lbPrice.setForeground(Colors.normal);
		lbMarketPriceInstruction.setForeground(Colors.normal);
		lbOptCriteria2.setForeground(Colors.normal);
	}

	public ParameterInputPanel() {
		StyleGenerator.setupStyle();
		setBackground(Colors.background);
		setForeground(Colors.normal);
		// Add default parameters
		pars = new Parameters();
		initialize();
		updateMarketPriceOptions();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Parameter input", TitledBorder.RIGHT,
				TitledBorder.TOP, null, Colors.accent2));
		setLayout(new FormLayout(
				new ColumnSpec[] { ColumnSpec.decode("15dlu"), ColumnSpec.decode("max(75dlu;default)"),
						FormSpecs.DEFAULT_COLSPEC, ColumnSpec.decode("50dlu:grow"), FormSpecs.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("20dlu"), ColumnSpec.decode("10dlu"), ColumnSpec.decode("20dlu"),
						FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("20dlu"), },
				new RowSpec[] { FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.UNRELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.UNRELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.UNRELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC,
						new RowSpec(RowSpec.CENTER,
								Sizes.bounded(Sizes.DEFAULT, Sizes.constant("2dlu", false),
										Sizes.constant("15dlu", false)),
								0),
						FormSpecs.UNRELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						RowSpec.decode("20dlu"), FormSpecs.UNRELATED_GAP_ROWSPEC, RowSpec.decode("20dlu"),
						FormSpecs.UNRELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						RowSpec.decode("50dlu"), FormSpecs.UNRELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						RowSpec.decode("default:grow"), }));

		lbTitle = new JLabel("SIMULATION PARAMETERS");
		lbTitle.setFont(Fonts.getOswald());
		lbTitle.setForeground(Colors.title);
		add(lbTitle, "2, 4, 5, 1, center, center");

		lbSimulationName = new JLabel("Simulation name");
		add(lbSimulationName, "2, 8");

		txtSimulationName = new JTextField();
		add(txtSimulationName, "4, 8, 5, 1, fill, default");
		txtSimulationName.setText(pars.getSimulationName());
		txtSimulationName.addKeyListener(new SimulationNameListener());
		txtSimulationName.addFocusListener(new SimulationNameListener());
		txtSimulationName.setColumns(10);

		lbLength = new JLabel("Steps per day");
		add(lbLength, "2, 10");

		txtLength = new JTextField();
		txtLength.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		txtLength.setText(Integer.toString(pars.getLength()));
		txtLength.addKeyListener(new LengthListener());
		txtLength.addFocusListener(new LengthListener());
		add(txtLength, "7, 10, 2, 1, fill, center");
		txtLength.setColumns(5);

		lbSteps = new JLabel("MPC horizon");
		add(lbSteps, "2, 12");

		txtSteps = new JTextField();
		txtSteps.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		txtSteps.setText(Integer.toString(pars.getSteps()));
		txtSteps.addKeyListener(new StepsListener());
		txtSteps.addFocusListener(new StepsListener());
		add(txtSteps, "7, 12, 2, 1, fill, center");
		txtSteps.setColumns(5);

		lbDays = new JLabel("Number of days");
		add(lbDays, "2, 14");

		sDays = new JComboBox<>();
		sDays.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		sDays.setBorder(UIManager.getBorder("MenuItem.border"));
		sDays.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		sDays.setModel(new DefaultComboBoxModel<Integer>(new Integer[] { 1, 2, 3, 4, 5 }));
		sDays.addItemListener(new DaysListener());
		add(sDays, "7, 14, 2, 1, fill, default");

		lbPrice = new JLabel("Market price [EUR]");
		add(lbPrice, "2, 16");

		JButton btAccept = new JButton("Start simulation");
		btAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btAccept.addMouseListener(new AcceptListener());

		lbMarketPrice = new JLabel("");
		lbMarketPrice.addMouseListener(new MarketPriceListener());
		add(lbMarketPrice, "6, 16, 3, 1, right, default");

		txtFixedValue = new JTextField("");
		txtFixedValue.setText(Double.toString(pars.getFixedMarketPrice()));
		txtFixedValue.addKeyListener(new FixedValueListener());
		txtFixedValue.addFocusListener(new FixedValueListener());
		add(txtFixedValue, "3, 16, 3, 1, fill, default");
		txtFixedValue.setColumns(10);

		lbMarketPriceInstruction = new JLabel("Select a file");
		add(lbMarketPriceInstruction, "2, 17");

		txtMarketPriceFile = new JTextField("");
		txtMarketPriceFile.addKeyListener(new MarketPriceFileListener());
		txtMarketPriceFile.addFocusListener(new MarketPriceFileListener());
		add(txtMarketPriceFile, "3, 17, 4, 1, fill, default");
		txtMarketPriceFile.setColumns(10);

		btBrowse = new JButton("");
		btBrowse.addMouseListener(new BrowseListener());
		btBrowse.setIcon(Icon.open);
		btBrowse.setBorder(new EmptyBorder(3, 3, 3, 3));
		btBrowse.setContentAreaFilled(false);
		add(btBrowse, "8, 17");

		lbOptimizer = new JLabel("Optimizer");
		add(lbOptimizer, "2, 19");

		lbOptimizer2 = new JLabel("");
		lbOptimizer2.setIcon(Icon.lp);
		lbOptimizer2.addMouseListener(new OptimizerListener());
		add(lbOptimizer2, "6, 19, 3, 1, right, default");

		lbMemap = new JLabel("Global optimization");
		add(lbMemap, "2, 21");

		lbMemap2 = new JLabel();
		lbMemap2.setIcon(Icon.offMemap);
		lbMemap2.addMouseListener(new MemapListener());
		add(lbMemap2, "6, 21, 3, 1, right, default");

		lbOptCriteria = new JLabel("Optimization criteria");
		add(lbOptCriteria, "2, 23");

		lbOptCriteria2 = new JLabel("");
		lbOptCriteria2.setIcon(Icon.optCost);
		lbOptCriteria2.addMouseListener(new OptimizationCriteriaListener());
		add(lbOptCriteria2, "6, 23, 3, 1, right, default");

		lbLoggingMode = new JLabel("Logging mode");
		add(lbLoggingMode, "2, 25");

		lbLoggingMode2 = new JLabel("");
		lbLoggingMode2.setIcon(Icon.resultLogs);
		lbLoggingMode2.addMouseListener(new LoggingModeListener());
		add(lbLoggingMode2, "6, 25, 3, 1, right, default");

		add(btAccept, "1, 29, 7, 1, center, center");

	}

	/**
	 * Updates the market price options show to the user according to their
	 * selection
	 */
	public void updateMarketPriceOptions() {

		if (pars.isFixedPrice()) {
			lbMarketPrice.setIcon(Icon.fixedMarket);
			txtFixedValue.setText(Double.toString(pars.getFixedMarketPrice()));
			txtFixedValue.setVisible(true);
			btBrowse.setVisible(false);
			lbMarketPriceInstruction.setVisible(false);
			txtMarketPriceFile.setVisible(false);

		} else {
			lbMarketPrice.setIcon(Icon.variableMarket);
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
	public void update() {
		txtSteps.setText(Integer.toString(pars.getSteps()));
		txtLength.setText(Integer.toString(pars.getLength()));
		txtSimulationName.setText(pars.getSimulationName());

		updateMarketPriceOptions();

		if (pars.getOptCriteria().equals("co2"))
			lbOptCriteria2.setIcon(Icon.optCO2);
		if (pars.getOptCriteria().equals("cost"))
			lbOptCriteria2.setIcon(Icon.optCost);

		if (pars.getLoggingMode().equals("resultLogs"))
			lbLoggingMode2.setIcon(Icon.resultLogs);
		if (pars.getLoggingMode().equals("fileLogs"))
			lbLoggingMode2.setIcon(Icon.fileLogs);
		if (pars.getLoggingMode().equals("allLogs"))
			lbLoggingMode2.setIcon(Icon.allLogs);

		if (pars.getOptimizer().equals("lp"))
			lbOptimizer2.setIcon(Icon.lp);
		if (pars.getOptimizer().equals("milp"))
			lbOptimizer2.setIcon(Icon.milp);

		if (!pars.isMemapON())
			lbMemap2.setIcon(Icon.offMemap);
		if (pars.isMemapON())
			lbMemap2.setIcon(Icon.onMemap);
	}

}
