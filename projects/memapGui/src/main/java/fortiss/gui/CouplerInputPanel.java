package fortiss.gui;

import java.awt.Graphics;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import fortiss.components.Coupler;
import fortiss.gui.listeners.selectionitem.CNewtworkTypePListener;
import fortiss.gui.listeners.textfield.CCOEmissionListener;
import fortiss.gui.listeners.textfield.CCostListener;
import fortiss.gui.listeners.textfield.CEfficiencyPrimaryListener;
import fortiss.gui.listeners.textfield.CEfficiencySecondaryListener;
import fortiss.gui.listeners.textfield.CMaxPowerListener;
import fortiss.gui.listeners.textfield.CMinPowerListener;
import fortiss.gui.listeners.textfield.CNameListener;
import fortiss.gui.listeners.textfield.ComponentFieldListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import fortiss.gui.style.StyleGenerator;
import net.miginfocom.swing.MigLayout;

/**
 * Input panel for coupler parameters.
 */
public class CouplerInputPanel extends InformationPanel{

	/** Coupler name */
	public JTextField txtCName;
	/** Coupler minimum power */
	public JTextField txtCMinimumPower;
	/** Coupler maximum power */
	public JTextField txtCMaximumPower;
	/** Coupler secondary network type */
	public JTextField txtCSecondaryNetworkType;
	/** Coupler primary network efficiency */
	public JTextField txtCEfficiencyPrimary;
	/** Coupler secondary network efficiency */
	public JTextField txtCEfficiencySecondary;
	/** Coupler cost */
	public JTextField txtCCost;
	/** Coupler CO2 Emissions */
	public JTextField txtCCOEmission;
	/** Coupler primary network type */
	public JComboBox<String> sCPrimaryNetworkType;
	/** Coupler area title label */
	private JLabel lblCoupler;
	/** Coupler name label */
	private JLabel lbCName;
	/** Coupler primary network type label */
	private JLabel lbCPrimaryNetworkType;
	/** Coupler secondary network type label */
	private JLabel lbCSecondaryNetworkType;
	/** Coupler minimum power label */
	private JLabel lbCMinimumPower;
	/** Coupler maximum power label */
	private JLabel lbCMaximumPower;
	/** Coupler primary network efficiency label */
	private JLabel lbCPrimaryNetworkEfficiency;
	/** Coupler secondary network efficiency label */
	private JLabel lbCSecondaryNetworkEfficiency;
	/** Coupler cost label */
	private JLabel lbCCost;
	/** Coupler CO2 Emission label */
	private JLabel lbCCOEmission;

	private static final long serialVersionUID = 1L;
	

	/** Necessary for dark mode on/off implementation */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setForeground(Colors.normal);
		setBackground(Colors.background);
		lblCoupler.setForeground(Colors.title);
		lbCName.setForeground(Colors.normal);
		lbCPrimaryNetworkType.setForeground(Colors.normal);
		lbCSecondaryNetworkType.setForeground(Colors.normal);
		lbCMinimumPower.setForeground(Colors.normal);
		lbCMaximumPower.setForeground(Colors.normal);
		lbCPrimaryNetworkEfficiency.setForeground(Colors.normal);
		lbCSecondaryNetworkEfficiency.setForeground(Colors.normal);
		lbCCost.setForeground(Colors.normal);
		lbCCOEmission.setForeground(Colors.normal);
	}

	public CouplerInputPanel() {
		StyleGenerator.setupStyle();
		initialize();
	}
	
	/**
	 * Initializes the contents of the panel.
	 */
	private void initialize() {
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Component information",
				TitledBorder.RIGHT, TitledBorder.TOP, null, Colors.accent2));
		
		setLayout(new MigLayout("insets 30 20 20 20, fillx, wrap 2, hidemode 2, width 99%", 
				"[left, growprio 50]30[right]", 
				""));

		lblCoupler = new JLabel("COUPLER");
		lblCoupler.setFont(Fonts.getOswald());
		add(lblCoupler, "spanx, center, gapbottom 30");

		lbCName = new JLabel("Name");
		add(lbCName);

		txtCName = new JTextField();
		ComponentFieldListener cNameListener = new CNameListener();
		txtCName.addKeyListener(cNameListener);
		txtCName.addFocusListener(cNameListener);
		add(txtCName, "growx");
		txtCName.setColumns(10);

		lbCPrimaryNetworkType = new JLabel("Primary network");
		add(lbCPrimaryNetworkType);

		sCPrimaryNetworkType = new JComboBox<>();
		sCPrimaryNetworkType.setFocusable(false);
		sCPrimaryNetworkType.setFocusTraversalKeysEnabled(false);
		sCPrimaryNetworkType.setModel(new DefaultComboBoxModel<String>(new String[] { "Heat", "Electricity" }));
		CNewtworkTypePListener networkTypePListener = new CNewtworkTypePListener();
		sCPrimaryNetworkType.addItemListener(networkTypePListener);
		sCPrimaryNetworkType.addMouseListener(networkTypePListener);
		add(sCPrimaryNetworkType, "growx");

		lbCSecondaryNetworkType = new JLabel("Secondary network");
		add(lbCSecondaryNetworkType);

		txtCSecondaryNetworkType = new JTextField();
		txtCSecondaryNetworkType.setEditable(false);
		txtCSecondaryNetworkType.setColumns(10);
		add(txtCSecondaryNetworkType, "growx");
		
		lbCMinimumPower = new JLabel("Minimum power [kW]");
		add(lbCMinimumPower);
		
		txtCMinimumPower = new JTextField();
		ComponentFieldListener minPowerListener = new CMinPowerListener();
		txtCMinimumPower.addKeyListener(minPowerListener);
		txtCMinimumPower.addFocusListener(minPowerListener);
		txtCMinimumPower.setColumns(10);
		add(txtCMinimumPower, "growx");

		lbCMaximumPower = new JLabel("Maximum power [kW]");
		add(lbCMaximumPower);

		txtCMaximumPower = new JTextField();
		ComponentFieldListener maxPowerListener = new CMaxPowerListener();
		txtCMaximumPower.addKeyListener(maxPowerListener);
		txtCMaximumPower.addFocusListener(maxPowerListener);
		txtCMaximumPower.setColumns(10);
		add(txtCMaximumPower, "growx");

		lbCPrimaryNetworkEfficiency = new JLabel("Primary network efficiency [-1-10]");
		add(lbCPrimaryNetworkEfficiency);

		txtCEfficiencyPrimary = new JTextField();
		ComponentFieldListener efficiencyListenerP = new CEfficiencyPrimaryListener();
		txtCEfficiencyPrimary.addKeyListener(efficiencyListenerP);
		txtCEfficiencyPrimary.addFocusListener(efficiencyListenerP);
		txtCEfficiencyPrimary.setColumns(10);
		add(txtCEfficiencyPrimary, "growx");

		lbCSecondaryNetworkEfficiency = new JLabel("Secondary network efficiency [-1-10]");
		add(lbCSecondaryNetworkEfficiency);

		txtCEfficiencySecondary = new JTextField();
		ComponentFieldListener efficiencyListenerS = new CEfficiencySecondaryListener();
		txtCEfficiencySecondary.addKeyListener(efficiencyListenerS);
		txtCEfficiencySecondary.addFocusListener(efficiencyListenerS);
		txtCEfficiencySecondary.setColumns(10);
		add(txtCEfficiencySecondary, "growx");

		lbCCost = new JLabel("Fuel cost [EUR/kWh]");
		add(lbCCost);

		txtCCost = new JTextField();
		ComponentFieldListener costListener = new CCostListener();
		txtCCost.addKeyListener(costListener);
		txtCCost.addFocusListener(costListener);
		txtCCost.setColumns(10);
		add(txtCCost, "growx");

		lbCCOEmission = new JLabel("CO2 Emissions [kg/kWh]");
		add(lbCCOEmission);

		txtCCOEmission = new JTextField();
		ComponentFieldListener emissionsListener = new CCOEmissionListener();
		txtCCOEmission.addKeyListener(emissionsListener);
		txtCCOEmission.addFocusListener(emissionsListener);
		txtCCOEmission.setColumns(10);
		add(txtCCOEmission, "growx");
	}

	@Override
	public void update() {
		Coupler coupler = (Coupler) DesignerPanel.selectedComponent;
		txtCName.setText(coupler.getName());
		sCPrimaryNetworkType.setSelectedItem(coupler.getNetworkTypeP());
		txtCSecondaryNetworkType.setText(coupler.getNetworkTypeS());
		txtCMinimumPower.setText(Double.toString(coupler.getMinimumPower()));
		txtCMaximumPower.setText(Double.toString(coupler.getMaximumPower()));
		txtCEfficiencyPrimary.setText(Double.toString(coupler.getEfficiencyPrimary()));
		txtCEfficiencySecondary.setText(Double.toString(coupler.getEfficiencySecondary()));
		txtCCost.setText(Double.toString(coupler.getCost()));
		txtCCOEmission.setText(Double.toString(coupler.getCOEmission()));
	}
}
