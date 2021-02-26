package fortiss.gui;

import java.awt.Graphics;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;

import fortiss.components.Storage;
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
import net.miginfocom.swing.MigLayout;

/**
 * Input panel for storage parameters.
 */
public class StorageInputPanel extends InformationPanel {

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

		setLayout(new MigLayout("insets 30 20 20 20, fillx, wrap 2, hidemode 2, width 99%", 
				"[left, growprio 50]30[right]", 
				""));
		
		lblStorage = new JLabel("STORAGE");
		lblStorage.setFont(Fonts.getOswald());
		add(lblStorage, "spanx, center, gapbottom 30");

		lbSlName = new JLabel("Name");
		add(lbSlName);

		txtSName = new JTextField();
		txtSName.setName("txtSName"); // Required in Modify
		txtSName.addKeyListener(new SNameListener());
		txtSName.addFocusListener(new SNameListener());
		txtSName.setColumns(10);
		add(txtSName, "growx");

		lbSNetworkType = new JLabel("Network Type");
		add(lbSNetworkType);
		
		sSNetworkType = new JComboBox<>();
		sSNetworkType.setBorder(new CompoundBorder());
		sSNetworkType.setFocusTraversalKeysEnabled(false);
		sSNetworkType.setFocusable(false);
		sSNetworkType.setModel(new DefaultComboBoxModel<String>(new String[] { "Heat", "Electricity" }));
		sSNetworkType.addItemListener(new SNetworkTypeListener());
		sSNetworkType.addMouseListener(new SNetworkTypeListener());
		add(sSNetworkType, "growx");

		lbSCapacity = new JLabel("Installed capacity [kWh]");
		add(lbSCapacity);

		txtSCapacity = new JTextField();
		txtSCapacity.addKeyListener(new SCapacityListener());
		txtSCapacity.addFocusListener(new SCapacityListener());
		add(txtSCapacity, "growx");
		
		lbSStateOfCharge = new JLabel("State of charge [0-1]");
		add(lbSStateOfCharge, "2, 14");
		
		txtSStateOfCharge = new JTextField();
		txtSStateOfCharge.addKeyListener(new SStateOfChargeListener());
		txtSStateOfCharge.addFocusListener(new SStateOfChargeListener());
		txtSStateOfCharge.setColumns(10);
		add(txtSStateOfCharge, "growx");

		lbMaxCharge = new JLabel("Max. Charge rate [kW]");
		add(lbMaxCharge);

		txtSMaxCharge = new JTextField();
		txtSMaxCharge.addKeyListener(new SMaxChargeListener());
		txtSMaxCharge.addFocusListener(new SMaxChargeListener());
		txtSMaxCharge.setColumns(10);
		add(txtSMaxCharge, "growx");
	
		lbSMaxDRate = new JLabel("Max. Discharge rate [kW]");
		add(lbSMaxDRate);

		txtSMaxDischarge = new JTextField();
		txtSMaxDischarge.addKeyListener(new SMaxDischargeListener());
		txtSMaxDischarge.addFocusListener(new SMaxDischargeListener());
		txtSMaxDischarge.setColumns(10);
		add(txtSMaxDischarge, "growx");

		lbSChargeE = new JLabel("Charge efficiency [0-1]");
		add(lbSChargeE);

		txtSEffIN = new JTextField();
		txtSEffIN.addKeyListener(new SEffINListener());
		txtSEffIN.addFocusListener(new SEffINListener());
		txtSEffIN.setColumns(10);
		add(txtSEffIN, "growx");

		lbSDischargeE = new JLabel("Discharge Efficiency [0-1]");
		add(lbSDischargeE);

		txtSEffOUT = new JTextField();
		txtSEffOUT.addKeyListener(new SEffOUTListener());
		txtSEffOUT.addFocusListener(new SEffOUTListener());
		txtSEffOUT.setColumns(10);
		add(txtSEffOUT, "growx");
	}

	@Override
	public void update() {
		Storage storage = (Storage) DesignerPanel.selectedComponent;
		txtSName.setText(storage.getName());
		sSNetworkType.setSelectedItem(storage.getNetworkType());
		txtSCapacity.setText(Double.toString(storage.getCapacity()));
		txtSStateOfCharge.setText(Double.toString(storage.getSoc()));
		txtSMaxCharge.setText(Double.toString(storage.getMaxCharging()));
		txtSMaxDischarge.setText(Double.toString(storage.getMaxDischarging()));
		txtSEffIN.setText(Double.toString(storage.getEffIN()));
		txtSEffOUT.setText(Double.toString(storage.getEffOUT()));
	}

}
