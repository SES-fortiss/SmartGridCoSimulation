package fortiss.gui;

import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Graphics;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import fortiss.gui.listeners.button.AcceptListener;
import fortiss.gui.listeners.button.PriceListener;
import fortiss.gui.listeners.button.WeatherListener;
import fortiss.gui.listeners.label.MemapListener;
import fortiss.gui.listeners.label.OptimizationCriteriaListener;
import fortiss.gui.listeners.selectionitem.DaysListener;
import fortiss.gui.listeners.textfield.LengthListener;
import fortiss.gui.listeners.textfield.StepsListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import fortiss.gui.style.StyleGenerator;
import fortiss.media.Icon;
import fortiss.simulation.Parameters;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Parameter input panel
 */
public class ParameterInputPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/** Parameters of the simulation */
	public Parameters pars;

	/** steps MPC horizon. An integer */
	public JTextField txtSteps;
	/** length MemapSimulation steps. An integer */
	public JTextField txtLength;
	/** Good weather button */
	public JRadioButton btGood;
	/** Bad weather button */
	public JRadioButton btBad;
	/** Fixed price button */
	public JRadioButton btFixed;
	/** Volatile price button */
	public JRadioButton btVolatile;
	/** Optimization criteria icon */
	public JLabel lbOptCriteria2;
	/** Optimization mode icon */
	public JLabel lbMemap2;
	/** Number of days chooser */
	public JComboBox<Integer> sDays;

	/** label for title */
	private JLabel lbTitle;
	/** label for MemapSimulation length */
	private JLabel lbLength;
	/** label for steps MPC horizon */
	private JLabel lbSteps;
	/** label for number of days */
	private JLabel lbDays;
	/** label for weather */
	private JLabel lbWeather;
	/** label for optimization criteria */
	private JLabel lbOptCriteria;
	/** label for optimization mode */
	private JLabel lbMemap;
	/** label for price */
	private JLabel lbPrice;

	/** Necessary for dark mode on/off implementation */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Colors.background);
		setForeground(Colors.normal);
		btGood.setBackground(Colors.background);
		btGood.setForeground(Colors.normal);
		btBad.setBackground(Colors.background);
		btBad.setForeground(Colors.normal);
		btFixed.setBackground(Colors.background);
		btFixed.setForeground(Colors.normal);
		btVolatile.setBackground(Colors.background);
		btVolatile.setForeground(Colors.normal);
		lbTitle.setForeground(Colors.title);
		lbLength.setForeground(Colors.normal);
		lbSteps.setForeground(Colors.normal);
		lbDays.setForeground(Colors.normal);
		lbWeather.setForeground(Colors.normal);
		lbMemap.setForeground(Colors.normal);
		lbPrice.setForeground(Colors.normal);
		lbOptCriteria2.setForeground(Colors.normal);
	}

	public ParameterInputPanel() {
		StyleGenerator.setupStyle();
		setBackground(Colors.background);
		setForeground(Colors.normal);
		// Add default parameters
		pars = new Parameters();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Parameter input", TitledBorder.RIGHT,
				TitledBorder.TOP, null, Colors.accent2));
		setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("15dlu"),
				ColumnSpec.decode("max(75dlu;default)"),
				ColumnSpec.decode("47dlu:grow"),
				ColumnSpec.decode("50dlu"),
				ColumnSpec.decode("54dlu"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.UNRELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.UNRELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.UNRELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.UNRELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.UNRELATED_GAP_ROWSPEC,
				RowSpec.decode("14dlu"),
				FormSpecs.UNRELATED_GAP_ROWSPEC,
				RowSpec.decode("14dlu"),
				FormSpecs.UNRELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("default:grow"),}));

		lbTitle = new JLabel("SIMULATION PARAMETERS");
		lbTitle.setFont(Fonts.getOswald());
		lbTitle.setForeground(Colors.title);
		add(lbTitle, "2, 4, 3, 1, center, center");

		lbLength = new JLabel("Simulation steps");
		add(lbLength, "2, 8");

		txtLength = new JTextField();
		txtLength.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		txtLength.setText(Integer.toString(pars.getLength()));
		txtLength.addKeyListener(new LengthListener());
		txtLength.addFocusListener(new LengthListener());
		add(txtLength, "4, 8, fill, center");
		txtLength.setColumns(5);

		lbSteps = new JLabel("MPC horizon");
		add(lbSteps, "2, 10");

		txtSteps = new JTextField();
		txtSteps.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		txtSteps.setText(Integer.toString(pars.getSteps()));
		txtSteps.addKeyListener(new StepsListener());
		txtSteps.addFocusListener(new StepsListener());
		add(txtSteps, "4, 10, fill, center");
		txtSteps.setColumns(5);

		lbDays = new JLabel("Number of days");
		add(lbDays, "2, 12");

		sDays = new JComboBox<>();
		sDays.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		sDays.setBorder(UIManager.getBorder("MenuItem.border"));
		sDays.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		sDays.setModel(new DefaultComboBoxModel<Integer>(new Integer[] { 1, 2, 3, 4, 5 }));
		sDays.addItemListener(new DaysListener());
		add(sDays, "4, 12, fill, default");

		lbWeather = new JLabel("Weather");
		add(lbWeather, "2, 14");

		btGood = new JRadioButton("Good");
		btGood.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btGood.setName("good");
		btGood.setSelected(true);
		btGood.addMouseListener(new WeatherListener());
		add(btGood, "4, 14, left, center");

		btBad = new JRadioButton("Bad");
		btBad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btBad.setName("bad");
		btBad.addMouseListener(new WeatherListener());
		add(btBad, "4, 16, left, center");

		lbPrice = new JLabel("Market price");
		add(lbPrice, "2, 18");

		btFixed = new JRadioButton("Fixed");
		btFixed.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btFixed.setName("fixed");
		btFixed.setSelected(true);
		btFixed.addMouseListener(new PriceListener());
		add(btFixed, "4, 18, left, center");

		JButton btAccept = new JButton("Start simulation");
		btAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btAccept.addMouseListener(new AcceptListener());

		btVolatile = new JRadioButton("Volatile");
		btVolatile.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btVolatile.setName("volatile");
		btVolatile.addMouseListener(new PriceListener());
		add(btVolatile, "4, 20, left, center");

		lbMemap = new JLabel("Global optimization");
		add(lbMemap, "2, 22");

		lbMemap2 = new JLabel();
		lbMemap2.setIcon(Icon.offMemap);
		lbMemap2.addMouseListener(new MemapListener());
		add(lbMemap2, "4, 22");

		lbOptCriteria = new JLabel("Optimization criteria");
		add(lbOptCriteria, "2, 24");

		lbOptCriteria2 = new JLabel("");
		lbOptCriteria2.setIcon(Icon.optCost);
		lbOptCriteria2.addMouseListener(new OptimizationCriteriaListener());
		add(lbOptCriteria2, "4, 24");

		add(btAccept, "1, 28, 5, 1, center, center");

	}

}
