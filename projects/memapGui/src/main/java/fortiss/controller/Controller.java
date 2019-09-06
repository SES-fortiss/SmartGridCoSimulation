package fortiss.controller;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import fortiss.controller.listener.selectionitem.DaysListener;
import fortiss.controller.listeners.button.AcceptListener;
import fortiss.controller.listeners.button.PriceListener;
import fortiss.controller.listeners.button.WeatherListener;
import fortiss.controller.listeners.label.MemapListener;
import fortiss.controller.listeners.label.OptimizationCriteriaListener;
import fortiss.controller.listeners.textfield.LengthListener;
import fortiss.controller.listeners.textfield.StepsListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import fortiss.gui.style.StyleGenerator;
import fortiss.media.Icon;

/**
 * Control panel for parameter input
 */
@SuppressWarnings("serial")
public class Controller extends JFrame {

	// Parameters
	public Parameters pars;

	public JTextField txtSteps;
	public JTextField txtLength;
	public JRadioButton btGood;
	public JRadioButton btBad;
	public JRadioButton btFixed;
	public JRadioButton btVolatile;
	public JLabel lbOptCriteria2; // Optimization criteria icon
	public JLabel lbMemap2;
	public JComboBox<Integer> sDays;
	private JLabel lbTitle;
	private JLabel lbLength;
	private JLabel lbSteps;
	private JLabel lbDays;
	private JLabel lbWeather;
	private JLabel lbOptCriteria; // Optimization criteria label
	
	private JLabel lbMemap;
	
	private JLabel lbPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Controller control = new Controller();
					control.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		getContentPane().setBackground(Colors.background);
		getContentPane().setForeground(Colors.normal);
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

	/**
	 * Create the application.
	 */
	public Controller() {
		StyleGenerator.setupStyle();
		getContentPane().setBackground(Colors.background);
		getContentPane().setForeground(Colors.normal);
		// Add default parameters
		pars = new Parameters();

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// Sets frame properties
		setSize(new Dimension(377, 370));
		setLocationRelativeTo(null);
		setType(Type.POPUP);
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setTitle("MEMAP - Parameter input");
		setName("fController");
		setIconImage(Icon.smallMemapLogo.getImage());
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane()
				.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("20dlu:grow"),
				FormSpecs.DEFAULT_COLSPEC,
				ColumnSpec.decode("15dlu"),
				ColumnSpec.decode("50dlu:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(33dlu;default)"),
				ColumnSpec.decode("20dlu:grow"),},
			new RowSpec[] {
				RowSpec.decode("5dlu:grow"),
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("14dlu"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("14dlu"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("default:grow"),}));

		lbTitle = new JLabel("Memap Simulation parameters");
		lbTitle.setFont(Fonts.getOswald());
		lbTitle.setForeground(Colors.title);
		getContentPane().add(lbTitle, "2, 2, 5, 1, center, center");

		lbLength = new JLabel("Simulation steps");
		getContentPane().add(lbLength, "2, 6");

		txtLength = new JTextField();
		txtLength.setText(Integer.toString(pars.getLength()));
		txtLength.addKeyListener(new LengthListener());
		txtLength.addFocusListener(new LengthListener());
		getContentPane().add(txtLength, "4, 6, fill, center");
		txtLength.setColumns(10);

		lbSteps = new JLabel("MPC horizon");
		getContentPane().add(lbSteps, "2, 8");

		txtSteps = new JTextField();
		txtSteps.setText(Integer.toString(pars.getSteps()));
		txtSteps.addKeyListener(new StepsListener());
		txtSteps.addFocusListener(new StepsListener());
		getContentPane().add(txtSteps, "4, 8, fill, center");
		txtSteps.setColumns(10);

		lbDays = new JLabel("Number of days");
		getContentPane().add(lbDays, "2, 10");

		sDays = new JComboBox<>();
		sDays.setModel(new DefaultComboBoxModel<Integer>(new Integer[] { 1, 2, 3, 4, 5 }));
		sDays.addItemListener(new DaysListener());
		getContentPane().add(sDays, "4, 10, fill, default");

		lbWeather = new JLabel("Weather");
		getContentPane().add(lbWeather, "2, 12");

		btGood = new JRadioButton("Good");
		btGood.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btGood.setName("good");
		btGood.setSelected(true);
		btGood.addMouseListener(new WeatherListener());
		getContentPane().add(btGood, "4, 12, left, center");

		btBad = new JRadioButton("Bad");
		btBad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btBad.setName("bad");
		btBad.addMouseListener(new WeatherListener());
		getContentPane().add(btBad, "6, 12, left, center");

		lbPrice = new JLabel("Price");
		getContentPane().add(lbPrice, "2, 14");

		btFixed = new JRadioButton("Fixed");
		btFixed.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btFixed.setName("fixed");
		btFixed.setSelected(true);
		btFixed.addMouseListener(new PriceListener());
		getContentPane().add(btFixed, "4, 14, left, center");

		JButton btAccept = new JButton("Accept");
		btAccept.addMouseListener(new AcceptListener());

		btVolatile = new JRadioButton("Volatile");
		btVolatile.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btVolatile.setName("volatile");
		btVolatile.addMouseListener(new PriceListener());
		getContentPane().add(btVolatile, "6, 14, left, center");

		lbMemap = new JLabel("Global optimization");
		getContentPane().add(lbMemap, "2, 16");

		lbMemap2 = new JLabel();
		lbMemap2.setIcon(Icon.offMemap);
		lbMemap2.addMouseListener(new MemapListener());
		getContentPane().add(lbMemap2, "4, 16");

		lbOptCriteria = new JLabel("Optimization criteria");
		getContentPane().add(lbOptCriteria, "2, 18");

		lbOptCriteria2 = new JLabel("");
		lbOptCriteria2.setIcon(Icon.optCost);
		lbOptCriteria2.addMouseListener(new OptimizationCriteriaListener());
		getContentPane().add(lbOptCriteria2, "4, 18");

		getContentPane().add(btAccept, "2, 20, 5, 1, center, center");

	}

}
