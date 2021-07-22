package fortiss.gui;

import java.awt.Graphics;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import fortiss.components.Controllable;
import fortiss.gui.listeners.selectionitem.CPNetworkTypeListener;
import fortiss.gui.listeners.textfield.CPCOEmissionListener;
import fortiss.gui.listeners.textfield.CPCostListener;
import fortiss.gui.listeners.textfield.CPEfficiencyListener;
import fortiss.gui.listeners.textfield.CPMaxPowerListener;
import fortiss.gui.listeners.textfield.CPMinPowerListener;
import fortiss.gui.listeners.textfield.CPNameListener;
import fortiss.gui.listeners.textfield.ComponentFieldListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import fortiss.gui.style.StyleGenerator;
import net.miginfocom.swing.MigLayout;

/**
 * Input panel for volatile parameters.
 */
public class ControllableInputPanel extends InformationPanel{

	/** Controllable name */
	public JTextField txtCPName;
	/** Controllable minimum power */
	public JTextField txtCPMinimumPower;
	/** Controllable maximum power */
	public JTextField txtCPMaximumPower;
	/** Controllable efficiency */
	public JTextField txtCPEfficiency;
	/** Controllable cost */
	public JTextField txtCPCost;
	/** Controllable Co2 Emissions */
	public JTextField txtCPCOEmission;
	/** Controllable network type */
	public JComboBox<String> sCPNetworkType;
	/** Controllable area title label */
	private JLabel lblControllableProduction;
	/** Controllable name label */
	private JLabel lbCPName;
	/** Controllable network type label */
	private JLabel lbCPNetworkType;
	/** Controllable minimum power label */
	private JLabel lbCPMinimumPower;
	/** Controllable maximum power label */
	private JLabel lbCPMaximumPower;
	/** Controllable efficiency label */
	private JLabel lbCPEfficiency;
	/** Controllable cost label */
	private JLabel lbCPCost;
	/** Controllable CO2 Emissions label */
	private JLabel lbCPCOEmission;

	private static final long serialVersionUID = 1L;

	/** Necessary for dark mode on/off implementation */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setForeground(Colors.normal);
		setBackground(Colors.background);
		lblControllableProduction.setForeground(Colors.title);
		lbCPName.setForeground(Colors.normal);
		lbCPNetworkType.setForeground(Colors.normal);
		lbCPMinimumPower.setForeground(Colors.normal);
		lbCPMaximumPower.setForeground(Colors.normal);
		lbCPEfficiency.setForeground(Colors.normal);
		lbCPCost.setForeground(Colors.normal);
		lbCPCOEmission.setForeground(Colors.normal);
	}

	public ControllableInputPanel() {
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

		lblControllableProduction = new JLabel("CONTROLLABLE PRODUCTION");
		lblControllableProduction.setFont(Fonts.getOswald());
		add(lblControllableProduction, "spanx, center, gapbottom 30");

		lbCPName = new JLabel("Name");
		add(lbCPName);

		txtCPName = new JTextField();
		ComponentFieldListener nameListener = new CPNameListener();
		txtCPName.addKeyListener(nameListener);
		txtCPName.addFocusListener(nameListener);
		txtCPName.setColumns(10);
		add(txtCPName, "growx");

		lbCPNetworkType = new JLabel("Network Type");
		add(lbCPNetworkType);

		sCPNetworkType = new JComboBox<>();
		sCPNetworkType.setFocusTraversalKeysEnabled(false);
		sCPNetworkType.setFocusable(false);
		sCPNetworkType.setModel(new DefaultComboBoxModel<String>(new String[] { "Heat", "Electricity" }));
		CPNetworkTypeListener networkTypeListener = new CPNetworkTypeListener();
		sCPNetworkType.addItemListener(networkTypeListener);
		sCPNetworkType.addMouseListener(networkTypeListener);
		add(sCPNetworkType, "growx");

		lbCPMinimumPower = new JLabel("Minimum power [kW]");
		add(lbCPMinimumPower);

		txtCPMinimumPower = new JTextField();
		ComponentFieldListener minPowerListener = new CPMinPowerListener();
		txtCPMinimumPower.addKeyListener(minPowerListener);
		txtCPMinimumPower.addFocusListener(minPowerListener);
		txtCPMinimumPower.setColumns(10);
		add(txtCPMinimumPower, "growx");

		lbCPMaximumPower = new JLabel("Maximum power [kW]");
		add(lbCPMaximumPower);

		txtCPMaximumPower = new JTextField();
		ComponentFieldListener maxPowerListener = new CPMaxPowerListener();
		txtCPMaximumPower.addKeyListener(maxPowerListener);
		txtCPMaximumPower.addFocusListener(maxPowerListener);
		txtCPMaximumPower.setColumns(10);
		add(txtCPMaximumPower, "growx");

		lbCPEfficiency = new JLabel("Efficiency [0-1]");
		add(lbCPEfficiency);

		txtCPEfficiency = new JTextField();
		ComponentFieldListener efficiencyListener = new CPEfficiencyListener();
		txtCPEfficiency.addKeyListener(efficiencyListener);
		txtCPEfficiency.addFocusListener(efficiencyListener);
		txtCPEfficiency.setColumns(10);
		add(txtCPEfficiency, "growx");

		lbCPCost = new JLabel("Fuel cost [EUR/kWh]");
		add(lbCPCost);

		txtCPCost = new JTextField();
		ComponentFieldListener costListener = new CPCostListener();
		txtCPCost.addKeyListener(costListener);
		txtCPCost.addFocusListener(costListener);
		txtCPCost.setColumns(10);
		add(txtCPCost, "growx");

		lbCPCOEmission = new JLabel("CO2 Emissions [kg/kWh]");
		add(lbCPCOEmission);

		txtCPCOEmission = new JTextField();
		ComponentFieldListener emissionsListener = new CPCOEmissionListener();
		txtCPCOEmission.addKeyListener(emissionsListener);
		txtCPCOEmission.addFocusListener(emissionsListener);
		txtCPCOEmission.setColumns(10);
		add(txtCPCOEmission, "growx");
	}

	@Override
	public void update() {
		Controllable controllable = (Controllable) DesignerPanel.selectedComponent;
		txtCPName.setText(controllable.getName());
		sCPNetworkType.setSelectedItem(controllable.getNetworkType());
		txtCPMinimumPower.setText(Double.toString(controllable.getMinimumPower()));
		txtCPMaximumPower.setText(Double.toString(controllable.getMaximumPower()));
		txtCPEfficiency.setText(Double.toString(controllable.getEfficiency()));
		txtCPCost.setText(Double.toString(controllable.getCost()));
		txtCPCOEmission.setText(Double.toString(controllable.getCOEmission()));
	}
}
