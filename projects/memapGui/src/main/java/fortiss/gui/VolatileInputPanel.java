package fortiss.gui;

import java.awt.Graphics;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import fortiss.gui.listeners.button.VBrowseListener;
import fortiss.gui.listeners.selectionitem.VNetworkTypeListener;
import fortiss.gui.listeners.textfield.VCOEmissionListener;
import fortiss.gui.listeners.textfield.VCostListener;
import fortiss.gui.listeners.textfield.VForecastFileListener;
import fortiss.gui.listeners.textfield.VIndexListener;
import fortiss.gui.listeners.textfield.VNameListener;
import fortiss.gui.listeners.textfield.VPowerListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import fortiss.gui.style.StyleGenerator;

/**
 * Input panel for volatile parameters.
 */
public class VolatileInputPanel extends JPanel {

	/** Volatile name */
	public JTextField txtVName;
	/** Volatile index */
	public JTextField txtVIndex;
	/** Volatile power */
	public JTextField txtVPower;
	/** Volatile forecast file path */
	public JTextField txtVForecastFile;
	/** Volatile cost */
	public JTextField txtVCost;
	/** Volatile CO2 Emissions */
	public JTextField txtVCOEmission;
	/** Volatile network type */
	public JComboBox<String> sVNetworkType;
	/** Volatile area title label */
	private JLabel lblVolatileProduction;
	/** Volatile name label */
	private JLabel lbVName;
	/** Volatile network type label */
	private JLabel lbVNetworkType;
	/** Volatile power label */
	private JLabel lblVPower;
	/** Volatile forecast file path label */
	private JLabel lbVForecastFile;
	/** Volatile index label */
	private JLabel lbVIndex;
	/** Volatile cost label */
	private JLabel lbVCost;
	/** Volatile CO2 Emission label */
	private JLabel lbVCOEmission;

	private static final long serialVersionUID = 1L;

	/** Necessary for dark mode on/off implementation */
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		setForeground(Colors.normal);
		setBackground(Colors.background);
		lblVolatileProduction.setForeground(Colors.title);
		lbVName.setForeground(Colors.normal);
		lbVNetworkType.setForeground(Colors.normal);
		lblVPower.setForeground(Colors.normal);
		lbVForecastFile.setForeground(Colors.normal);
		lbVIndex.setForeground(Colors.normal);
		lbVCost.setForeground(Colors.normal);
		lbVCOEmission.setForeground(Colors.normal);
	}

	public VolatileInputPanel() {
		StyleGenerator.setupStyle();
		initialize();
	}
	
	/**
	 * Initializes the contents of the panel.
	 */
	private void initialize() {
		setBorder(new TitledBorder(null, "Component information", TitledBorder.RIGHT, TitledBorder.TOP, null,
				Colors.accent2));
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

		lblVolatileProduction = new JLabel("VOLATILE PRODUCTION");
		lblVolatileProduction.setFont(Fonts.getOswald());
		add(lblVolatileProduction, "2, 4, 3, 1, center, center");

		lbVName = new JLabel("Name");
		add(lbVName, "2, 8");

		txtVName = new JTextField();
		txtVName.addKeyListener(new VNameListener());
		txtVName.addFocusListener(new VNameListener());
		add(txtVName, "4, 8, fill, default");
		txtVName.setColumns(10);

		lbVNetworkType = new JLabel("Network type");
		add(lbVNetworkType, "2, 10");

		sVNetworkType = new JComboBox<>();
		sVNetworkType.setFocusable(false);
		sVNetworkType.setFocusTraversalKeysEnabled(false);
		sVNetworkType.setModel(new DefaultComboBoxModel<String>(new String[] { "Heat", "Electricity" }));
		sVNetworkType.addItemListener(new VNetworkTypeListener());
		sVNetworkType.addMouseListener(new VNetworkTypeListener());
		add(sVNetworkType, "4, 10, fill, default");

		lblVPower = new JLabel("Installer power [kW]");
		add(lblVPower, "2, 12");

		txtVPower = new JTextField();
		txtVPower.addKeyListener(new VPowerListener());
		txtVPower.addFocusListener(new VPowerListener());
		add(txtVPower, "4, 12, fill, default");
		txtVPower.setColumns(10);

		lbVForecastFile = new JLabel("Forecast file");
		add(lbVForecastFile, "2, 14");

		txtVForecastFile = new JTextField();
		txtVForecastFile.addKeyListener(new VForecastFileListener());
		txtVForecastFile.addFocusListener(new VForecastFileListener());
		add(txtVForecastFile, "4, 14, fill, default");
		txtVForecastFile.setColumns(10);

		JButton btVBrowse = new JButton("Browse");
		btVBrowse.addMouseListener(new VBrowseListener());
		add(btVBrowse, "4, 16, right, center");

		lbVIndex = new JLabel("Index");
		add(lbVIndex, "2, 18");

		txtVIndex = new JTextField();
		txtVIndex.addKeyListener(new VIndexListener());
		txtVIndex.addFocusListener(new VIndexListener());
		add(txtVIndex, "4, 18, fill, default");
		txtVIndex.setColumns(10);

		lbVCost = new JLabel("Cost [cent/kWh] [EUR]");
		add(lbVCost, "2, 20");

		txtVCost = new JTextField();
		txtVCost.addKeyListener(new VCostListener());
		txtVCost.addFocusListener(new VCostListener());
		add(txtVCost, "4, 20, fill, default");
		txtVCost.setColumns(10);

		lbVCOEmission = new JLabel("CO2 Emissions [g/kWh]");
		add(lbVCOEmission, "2, 22");

		txtVCOEmission = new JTextField();
		txtVCOEmission.addKeyListener(new VCOEmissionListener());
		txtVCOEmission.addFocusListener(new VCOEmissionListener());
		add(txtVCOEmission, "4, 22, fill, default");
		txtVCOEmission.setColumns(10);
	}
}
