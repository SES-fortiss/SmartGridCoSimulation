package fortiss.gui;

import java.awt.Graphics;

import javax.swing.DefaultComboBoxModel;
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

import fortiss.gui.listeners.selectionitem.CNewtworkTypePListener;
import fortiss.gui.listeners.textfield.CCOEmissionListener;
import fortiss.gui.listeners.textfield.CCostListener;
import fortiss.gui.listeners.textfield.CEfficiencyPrimaryListener;
import fortiss.gui.listeners.textfield.CEfficiencySecondaryListener;
import fortiss.gui.listeners.textfield.CNameListener;
import fortiss.gui.listeners.textfield.CPowerListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import fortiss.gui.style.StyleGenerator;

/**
 * Input panel for coupler parameters.
 */
public class CouplerInputPanel extends JPanel {

	/** Coupler name */
	public JTextField txtCName;
	/** Coupler power */
	public JTextField txtCPower;
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
	/** Controllable area title label */
	private JLabel lblCoupler;
	/** Controllable name label */
	private JLabel lbCName;
	/** Controllable primary network type label */
	private JLabel lbCPrimaryNetworkType;
	/** Controllable secondary network type label */
	private JLabel lbCSecondaryNetworkType;
	/** Controllable power label */
	private JLabel lbCInstalledPower;
	/** Controllable primary network efficiency label */
	private JLabel lbCPrimaryNetworkEfficiency;
	/** Controllable secondary network efficiency label */
	private JLabel lbCSecondaryNetworkEfficiency;
	/** Controllable cost label */
	private JLabel lbCCost;
	/** Controllable CO2 Emission label */
	private JLabel lbCCOEmission;

	private static final long serialVersionUID = 1L;

	/** Necessary for dark mode on/off implementation */
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		setForeground(Colors.normal);
		setBackground(Colors.background);
		lblCoupler.setForeground(Colors.title);
		lbCName.setForeground(Colors.normal);
		lbCPrimaryNetworkType.setForeground(Colors.normal);
		lbCSecondaryNetworkType.setForeground(Colors.normal);
		lbCInstalledPower.setForeground(Colors.normal);
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
		setLayout(new FormLayout(
				new ColumnSpec[] { ColumnSpec.decode("15dlu"), ColumnSpec.decode("85dlu"), ColumnSpec.decode("15dlu"),
						ColumnSpec.decode("100dlu:grow"), ColumnSpec.decode("15dlu"), FormSpecs.RELATED_GAP_COLSPEC, },
				new RowSpec[] { FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, }));

		lblCoupler = new JLabel("COUPLER");
		lblCoupler.setFont(Fonts.getOswald());
		add(lblCoupler, "2, 4, 3, 1, center, center");

		lbCName = new JLabel("Name");
		add(lbCName, "2, 8");

		txtCName = new JTextField();
		txtCName.addKeyListener(new CNameListener());
		txtCName.addFocusListener(new CNameListener());
		add(txtCName, "4, 8, fill, default");
		txtCName.setColumns(10);

		lbCPrimaryNetworkType = new JLabel("Primary network");
		add(lbCPrimaryNetworkType, "2, 10");

		sCPrimaryNetworkType = new JComboBox<>();
		sCPrimaryNetworkType.setFocusable(false);
		sCPrimaryNetworkType.setFocusTraversalKeysEnabled(false);
		sCPrimaryNetworkType.setModel(new DefaultComboBoxModel<String>(new String[] { "Heat", "Electricity" }));
		sCPrimaryNetworkType.addItemListener(new CNewtworkTypePListener());
		sCPrimaryNetworkType.addMouseListener(new CNewtworkTypePListener());
		add(sCPrimaryNetworkType, "4, 10, fill, default");

		lbCSecondaryNetworkType = new JLabel("Secondary network");
		add(lbCSecondaryNetworkType, "2, 12");

		txtCSecondaryNetworkType = new JTextField();
		txtCSecondaryNetworkType.setEditable(false);
		add(txtCSecondaryNetworkType, "4, 12, fill, default");
		txtCSecondaryNetworkType.setColumns(10);

		lbCInstalledPower = new JLabel("Installed power [kW]");
		add(lbCInstalledPower, "2, 14");

		txtCPower = new JTextField();
		txtCPower.addKeyListener(new CPowerListener());
		txtCPower.addFocusListener(new CPowerListener());
		add(txtCPower, "4, 14, fill, default");
		txtCPower.setColumns(10);

		lbCPrimaryNetworkEfficiency = new JLabel("Primary network efficiency [0-1]");
		add(lbCPrimaryNetworkEfficiency, "2, 16");

		txtCEfficiencyPrimary = new JTextField();
		txtCEfficiencyPrimary.addKeyListener(new CEfficiencyPrimaryListener());
		txtCEfficiencyPrimary.addFocusListener(new CEfficiencyPrimaryListener());
		add(txtCEfficiencyPrimary, "4, 16, fill, default");
		txtCEfficiencyPrimary.setColumns(10);

		lbCSecondaryNetworkEfficiency = new JLabel("Secondary network efficiency [0-1]");
		add(lbCSecondaryNetworkEfficiency, "2, 18");

		txtCEfficiencySecondary = new JTextField();
		txtCEfficiencySecondary.addKeyListener(new CEfficiencySecondaryListener());
		txtCEfficiencySecondary.addFocusListener(new CEfficiencySecondaryListener());
		add(txtCEfficiencySecondary, "4, 18, fill, default");
		txtCEfficiencySecondary.setColumns(10);

		lbCCost = new JLabel("Cost [cent/kWh]");
		add(lbCCost, "2, 20");

		txtCCost = new JTextField();
		txtCCost.addKeyListener(new CCostListener());
		txtCCost.addFocusListener(new CCostListener());
		add(txtCCost, "4, 20, fill, default");
		txtCCost.setColumns(10);

		lbCCOEmission = new JLabel("CO2 Emissions [g/kWh]");
		add(lbCCOEmission, "2, 22");

		txtCCOEmission = new JTextField();
		txtCCOEmission.addKeyListener(new CCOEmissionListener());
		txtCCOEmission.addFocusListener(new CCOEmissionListener());
		add(txtCCOEmission, "4, 22, fill, default");
		txtCCOEmission.setColumns(10);
	}
}
