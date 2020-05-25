package fortiss.gui;

import java.awt.Graphics;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import fortiss.gui.listeners.selectionitem.SNetworkTypeListener;
import fortiss.gui.listeners.textfield.SCapacityListener;
import fortiss.gui.listeners.textfield.SEffINListener;
import fortiss.gui.listeners.textfield.SEffOUTListener;
import fortiss.gui.listeners.textfield.SMaxChargeListener;
import fortiss.gui.listeners.textfield.SMaxDischargeListener;
import fortiss.gui.listeners.textfield.SNameListener;
import fortiss.gui.listeners.textfield.SStateOfChargeListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import fortiss.gui.style.StyleGenerator;
import javax.swing.border.CompoundBorder;

/**
 * Input panel for storage parameters.
 */
public class StorageInputPanel extends JPanel {

	/** Storage name */
	public JTextField txtSName;
	/** Storage capacity */
	public JTextField txtSCapacity;
	/** Storage state of charge (SOC)*/
	public JTextField txtSStateOfCharge;
	/** Storage maximum charge rate */
	public JTextField txtSMaxCharge;
	/** Storage maximum discharge rate */
	public JTextField txtSMaxDischarge;
	/** Storage in efficiency */
	public JTextField txtSEffIN;
	/** Storage out efficiency */
	public JTextField txtSEffOUT;
	/** Storage network type */
	public JComboBox<String> sSNetworkType;
	/** Storage area title label */
	private JLabel lblStorage;
	/** Storage name label */
	private JLabel lbSlName;
	/** Storage network type label */
	private JLabel lbSNetworkType;
	/** Storage capacity label */
	private JLabel lbSCapacity;
	/** Storage state of charge (SOC) label */
	private JLabel lbSStateOfCharge;
	/** Storage maximum charge rate label */
	private JLabel lbMaxCharge;
	/** Storage maximum discharge rate label */
	private JLabel lbSMaxDRate;
	/** Storage charge efficiency label */
	private JLabel lbSChargeE;
	/** Storage discharge efficiency label */
	private JLabel lbSDischargeE;
	
	private static final long serialVersionUID = 1L;

	/** Necessary for dark mode on/off implementation */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setForeground(Colors.normal);
		setBackground(Colors.background);
		lblStorage.setForeground(Colors.title);
		lbSlName.setForeground(Colors.normal);
		lbSNetworkType.setForeground(Colors.normal);
		lbSCapacity.setForeground(Colors.normal);
		lbSStateOfCharge.setForeground(Colors.normal);
		lbMaxCharge.setForeground(Colors.normal);
		lbSMaxDRate.setForeground(Colors.normal);
		lbSChargeE.setForeground(Colors.normal);
		lbSDischargeE.setForeground(Colors.normal);
	}

	public StorageInputPanel() {
		StyleGenerator.setupStyle();
		initialize();
	}
	
	/**
	 * Initializes the contents of the panel.
	 */
	private void initialize() {
		setBorder(new TitledBorder(null, "Component information", TitledBorder.RIGHT, TitledBorder.TOP, null,
				Colors.accent2));
		setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("15dlu"),
				ColumnSpec.decode("120dlu"),
				ColumnSpec.decode("15dlu"),
				ColumnSpec.decode("75dlu:grow"),
				ColumnSpec.decode("15dlu"),
				FormSpecs.RELATED_GAP_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.PREF_ROWSPEC,
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
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));

		lblStorage = new JLabel("STORAGE");
		lblStorage.setFont(Fonts.getOswald());
		add(lblStorage, "2, 4, 3, 1, center, center");

		lbSlName = new JLabel("Name");
		add(lbSlName, "2, 8, left, center");

		txtSName = new JTextField();
		txtSName.setName("txtSName"); // Required in Modify
		txtSName.addKeyListener(new SNameListener());
		txtSName.addFocusListener(new SNameListener());
		add(txtSName, "4, 8, fill, top");
		txtSName.setColumns(10);

		lbSNetworkType = new JLabel("Network Type");
		add(lbSNetworkType, "2, 10, left, center");
		sSNetworkType = new JComboBox<>();
		sSNetworkType.setBorder(new CompoundBorder());
		sSNetworkType.setFocusTraversalKeysEnabled(false);
		sSNetworkType.setFocusable(false);
		sSNetworkType.setModel(new DefaultComboBoxModel<String>(new String[] { "Heat", "Electricity" }));
		sSNetworkType.addItemListener(new SNetworkTypeListener());
		sSNetworkType.addMouseListener(new SNetworkTypeListener());
		add(sSNetworkType, "4, 10, fill, default");

		lbSCapacity = new JLabel("Installed capacity [kWh]");
		add(lbSCapacity, "2, 12, left, default");

		txtSCapacity = new JTextField();
		txtSCapacity.addKeyListener(new SCapacityListener());
		txtSCapacity.addFocusListener(new SCapacityListener());
		add(txtSCapacity, "4, 12");
		
		lbSStateOfCharge = new JLabel("State of charge [0-1]");
		add(lbSStateOfCharge, "2, 14");
		
		txtSStateOfCharge = new JTextField();
		txtSStateOfCharge.addKeyListener(new SStateOfChargeListener());
		txtSStateOfCharge.addFocusListener(new SStateOfChargeListener());
		add(txtSStateOfCharge, "4, 14, fill, default");
		txtSStateOfCharge.setColumns(10);

		lbMaxCharge = new JLabel("Max. Charge rate [kW]");
		add(lbMaxCharge, "2, 16, left, default");

		txtSMaxCharge = new JTextField();
		txtSMaxCharge.addKeyListener(new SMaxChargeListener());
		txtSMaxCharge.addFocusListener(new SMaxChargeListener());
		add(txtSMaxCharge, "4, 16, fill, default");
		txtSMaxCharge.setColumns(10);

		lbSMaxDRate = new JLabel("Max. Discharge rate [kW]");
		add(lbSMaxDRate, "2, 18, left, default");

		txtSMaxDischarge = new JTextField();
		txtSMaxDischarge.addKeyListener(new SMaxDischargeListener());
		txtSMaxDischarge.addFocusListener(new SMaxDischargeListener());
		add(txtSMaxDischarge, "4, 18, fill, default");
		txtSMaxDischarge.setColumns(10);

		lbSChargeE = new JLabel("Charge efficiency [0-1]");
		add(lbSChargeE, "2, 20, left, default");

		txtSEffIN = new JTextField();
		txtSEffIN.addKeyListener(new SEffINListener());
		txtSEffIN.addFocusListener(new SEffINListener());
		add(txtSEffIN, "4, 20, fill, default");
		txtSEffIN.setColumns(10);

		lbSDischargeE = new JLabel("Discharge Efficiency [0-1]");
		add(lbSDischargeE, "2, 22, left, default");

		txtSEffOUT = new JTextField();
		txtSEffOUT.addKeyListener(new SEffOUTListener());
		txtSEffOUT.addFocusListener(new SEffOUTListener());
		add(txtSEffOUT, "4, 22, fill, default");
		txtSEffOUT.setColumns(10);
	}

}
