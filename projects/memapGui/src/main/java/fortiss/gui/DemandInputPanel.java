package fortiss.gui;

import java.awt.Graphics;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import fortiss.gui.listeners.button.DBrowseListener;
import fortiss.gui.listeners.selectionitem.DNetworkTypeListener;
import fortiss.gui.listeners.textfield.DConsumptionListener;
import fortiss.gui.listeners.textfield.DIndexListener;
import fortiss.gui.listeners.textfield.DNameListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;

/**
 * Input panel for demand parameters.
 */
public class DemandInputPanel extends JPanel {

	/** Demand name */
	public JTextField txtDName;
	/** Demand consumption file path */
	public JTextField txtDConsumption;
	/** In consumption file column index */
	public JTextField txtDIndex;
	/** Demand network type */
	public JComboBox<String> sDNetworkType;
	/** Demand area title label */
	private JLabel lblDemand;
	/** Demand name label */
	private JLabel lbDName;
	/** Demand network type label */
	private JLabel lbDNetworkType;
	/** Demand consumption file path label */
	private JLabel lbDConsumption;
	/** Demand index label */
	private JLabel lbDIndex;

	private static final long serialVersionUID = 1L;

	/** Necessary for dark mode on/off implementation */
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		setForeground(Colors.normal);
		setBackground(Colors.background);
		lblDemand.setForeground(Colors.title);
		lbDName.setForeground(Colors.normal);
		lbDIndex.setForeground(Colors.normal);
		lbDNetworkType.setForeground(Colors.normal);
		lbDConsumption.setForeground(Colors.normal);
	}

	public DemandInputPanel() {
		plotter = new Plotter();
		StyleGenerator.setupStyle();
		initialize();
	}
	
	/**
	 * Initializes the contents of the panel.
	 */
	private void initialize() {
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Component information",
				TitledBorder.RIGHT, TitledBorder.TOP, null, Colors.accent2));
		setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("15dlu"),
				ColumnSpec.decode("85dlu:grow"),
				ColumnSpec.decode("15dlu"),
				ColumnSpec.decode("93dlu:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("15dlu:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,},
			new RowSpec[] {
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
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("fill:200dlu"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));

		lblDemand = new JLabel("DEMAND");
		lblDemand.setFont(Fonts.getOswald());
		add(lblDemand, "2, 4, 3, 1, center, center");

		lbDName = new JLabel("Name");
		add(lbDName, "2, 8");

		txtDName = new JTextField();
		txtDName.setName("txtDName");
		txtDName.addKeyListener(new DNameListener());
		txtDName.addFocusListener(new DNameListener());
		add(txtDName, "4, 8, fill, default");
		txtDName.setColumns(10);

		lbDNetworkType = new JLabel("Network type");
		add(lbDNetworkType, "2, 10");

		sDNetworkType = new JComboBox<>();
		sDNetworkType.setFocusTraversalKeysEnabled(false);
		sDNetworkType.setFocusable(false);
		sDNetworkType.setModel(new DefaultComboBoxModel<String>(new String[] { "Heat", "Electricity" }));
		sDNetworkType.addItemListener(new DNetworkTypeListener());
		sDNetworkType.addMouseListener(new DNetworkTypeListener());
		add(sDNetworkType, "4, 10, fill, default");

		lbDConsumption = new JLabel("Consumption profile");
		add(lbDConsumption, "2, 12");

		txtDConsumption = new JTextField();
		txtDConsumption.addKeyListener(new DConsumptionListener());
		txtDConsumption.addFocusListener(new DConsumptionListener());
		add(txtDConsumption, "4, 12, fill, default");
		txtDConsumption.setColumns(10);

		JButton btDBrowse = new JButton("Browse");
		btDBrowse.addMouseListener(new DBrowseListener());
		add(btDBrowse, "4, 14, right, center");

		lbDIndex = new JLabel("Index");
		add(lbDIndex, "2, 16");

		txtDIndex = new JTextField();
		txtDIndex.addKeyListener(new DIndexListener());
		txtDIndex.addFocusListener(new DIndexListener());
		add(txtDIndex, "4, 16, fill, default");
		txtDIndex.setColumns(10);
	}

}
