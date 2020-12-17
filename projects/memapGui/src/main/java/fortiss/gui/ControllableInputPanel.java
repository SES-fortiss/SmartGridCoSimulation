package fortiss.gui;

import java.awt.Graphics;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import fortiss.components.Controllable;
import fortiss.gui.listeners.selectionitem.CPNetworkTypeListener;
import fortiss.gui.listeners.textfield.CPCOEmissionListener;
import fortiss.gui.listeners.textfield.CPCostListener;
import fortiss.gui.listeners.textfield.CPEfficiencyListener;
import fortiss.gui.listeners.textfield.CPMaxPowerListener;
import fortiss.gui.listeners.textfield.CPMinPowerListener;
import fortiss.gui.listeners.textfield.CPNameListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import fortiss.gui.style.StyleGenerator;

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
		setLayout(new FormLayout(
				new ColumnSpec[] {
						ColumnSpec.decode("15dlu"), 
						ColumnSpec.decode("120dlu"), 
						ColumnSpec.decode("15dlu"),
						ColumnSpec.decode("75dlu:grow"), 
						ColumnSpec.decode("15dlu"), 
						FormSpecs.RELATED_GAP_COLSPEC, },
				new RowSpec[] { FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, }));

		lblControllableProduction = new JLabel("CONTROLLABLE PRODUCTION");
		lblControllableProduction.setFont(Fonts.getOswald());
		add(lblControllableProduction, "2, 4, 3, 1, center, center");

		lbCPName = new JLabel("Name");
		add(lbCPName, "2, 8");

		txtCPName = new JTextField();
		txtCPName.addKeyListener(new CPNameListener());
		txtCPName.addFocusListener(new CPNameListener());
		add(txtCPName, "4, 8, fill, default");
		txtCPName.setColumns(10);

		lbCPNetworkType = new JLabel("Network Type");
		add(lbCPNetworkType, "2, 10");

		sCPNetworkType = new JComboBox<>();
		sCPNetworkType.setFocusTraversalKeysEnabled(false);
		sCPNetworkType.setFocusable(false);
		sCPNetworkType.setModel(new DefaultComboBoxModel<String>(new String[] { "Heat", "Electricity" }));
		sCPNetworkType.addItemListener(new CPNetworkTypeListener());
		sCPNetworkType.addMouseListener(new CPNetworkTypeListener());
		add(sCPNetworkType, "4, 10, fill, default");

		lbCPMinimumPower = new JLabel("Minimum power [kW]");
		add(lbCPMinimumPower, "2, 12");

		txtCPMinimumPower = new JTextField();
		txtCPMinimumPower.addKeyListener(new CPMinPowerListener());
		txtCPMinimumPower.addFocusListener(new CPMinPowerListener());
		add(txtCPMinimumPower, "4, 12, fill, default");
		txtCPMinimumPower.setColumns(10);

		lbCPMaximumPower = new JLabel("Maximum power [kW]");
		add(lbCPMaximumPower, "2, 14");

		txtCPMaximumPower = new JTextField();
		txtCPMaximumPower.addKeyListener(new CPMaxPowerListener());
		txtCPMaximumPower.addFocusListener(new CPMaxPowerListener());
		add(txtCPMaximumPower, "4, 14, fill, default");
		txtCPMaximumPower.setColumns(10);

		lbCPEfficiency = new JLabel("Efficiency [0-1]");
		add(lbCPEfficiency, "2, 16");

		txtCPEfficiency = new JTextField();
		txtCPEfficiency.addKeyListener(new CPEfficiencyListener());
		txtCPEfficiency.addFocusListener(new CPEfficiencyListener());
		add(txtCPEfficiency, "4, 16, fill, default");
		txtCPEfficiency.setColumns(10);

		lbCPCost = new JLabel("Fuel cost [EUR/kWh]");
		add(lbCPCost, "2, 18");

		txtCPCost = new JTextField();
		txtCPCost.addKeyListener(new CPCostListener());
		txtCPCost.addFocusListener(new CPCostListener());
		add(txtCPCost, "4, 18, fill, default");
		txtCPCost.setColumns(10);

		lbCPCOEmission = new JLabel("CO2 Emissions [kg/kWh]");
		add(lbCPCOEmission, "2, 20");

		txtCPCOEmission = new JTextField();
		txtCPCOEmission.addKeyListener(new CPCOEmissionListener());
		txtCPCOEmission.addFocusListener(new CPCOEmissionListener());
		add(txtCPCOEmission, "4, 20, fill, default");
		txtCPCOEmission.setColumns(10);
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
