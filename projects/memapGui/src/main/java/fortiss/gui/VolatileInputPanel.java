package fortiss.gui;

import java.awt.Graphics;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
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
import fortiss.gui.listeners.textfield.VNameListener;
import fortiss.gui.listeners.textfield.VMaxPowerListener;
import fortiss.gui.listeners.textfield.VMinPowerListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import fortiss.gui.style.StyleGenerator;
import fortiss.media.Icon;
import fortiss.media.DesignerMessages;

/**
 * Input panel for volatile parameters.
 */
public class VolatileInputPanel extends JPanel {

	/** Volatile name */
	public JTextField txtVName;
	/** Volatile minimum power */
	public JTextField txtVMinimumPower;
	/** Volatile maximum power */
	public JTextField txtVMaximumPower;
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
	/** Volatile minimum power label */
	private JLabel lbVMinimumPower;
	/** Volatile maximum power label */
	private JLabel lbVMaximumPower;
	/** Volatile forecast file path label */
	private JLabel lbVForecastFile;
	/** Volatile cost label */
	private JLabel lbVCost;
	/** Volatile CO2 Emission label */
	private JLabel lbVCOEmission;

	private static final long serialVersionUID = 1L;

	/** Necessary for dark mode on/off implementation */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setForeground(Colors.normal);
		setBackground(Colors.background);
		lblVolatileProduction.setForeground(Colors.title);
		lbVName.setForeground(Colors.normal);
		lbVNetworkType.setForeground(Colors.normal);
		lbVMinimumPower.setForeground(Colors.normal);
		lbVMaximumPower.setForeground(Colors.normal);
		lbVForecastFile.setForeground(Colors.normal);
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
				new ColumnSpec[] { ColumnSpec.decode("15dlu"), ColumnSpec.decode("left:120dlu"),
						ColumnSpec.decode("15dlu"), ColumnSpec.decode("75dlu:grow"), FormSpecs.RELATED_GAP_COLSPEC,
						FormSpecs.DEFAULT_COLSPEC, FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("15dlu"),
						FormSpecs.RELATED_GAP_COLSPEC, },
				new RowSpec[] { FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						RowSpec.decode("default:grow"), }));

		lblVolatileProduction = new JLabel("VOLATILE PRODUCTION");
		lblVolatileProduction.setFont(Fonts.getOswald());
		add(lblVolatileProduction, "2, 4, 3, 1, center, center");

		lbVName = new JLabel(DesignerMessages.getString("nameLabel")); //$NON-NLS-1$
		add(lbVName, "2, 8");

		txtVName = new JTextField();
		txtVName.addKeyListener(new VNameListener());
		txtVName.addFocusListener(new VNameListener());
		add(txtVName, "4, 8, 3, 1, fill, default");
		txtVName.setColumns(10);

		lbVNetworkType = new JLabel(DesignerMessages.getString("networkTypeLabel")); //$NON-NLS-1$
		add(lbVNetworkType, "2, 10");

		sVNetworkType = new JComboBox<>();
		sVNetworkType.setFocusable(false);
		sVNetworkType.setFocusTraversalKeysEnabled(false);
		sVNetworkType.setModel(new DefaultComboBoxModel<String>(
				new String[] { DesignerMessages.getString("heatNetworkType"), DesignerMessages.getString("electricityNetworkType") }));
		sVNetworkType.addItemListener(new VNetworkTypeListener());
		sVNetworkType.addMouseListener(new VNetworkTypeListener());
		add(sVNetworkType, "4, 10, 3, 1, fill, default");

		lbVMinimumPower = new JLabel(DesignerMessages.getString("networkTypeLabel")); //$NON-NLS-1$
		add(lbVMinimumPower, "2, 12");

		txtVMinimumPower = new JTextField();
		txtVMinimumPower.addKeyListener(new VMinPowerListener());
		txtVMinimumPower.addFocusListener(new VMinPowerListener());
		add(txtVMinimumPower, "4, 12, 3, 1, fill, default");
		txtVMinimumPower.setColumns(10);

		lbVMaximumPower = new JLabel(DesignerMessages.getString("maximumPowerLabel")); //$NON-NLS-1$
		add(lbVMaximumPower, "2, 14");

		txtVMaximumPower = new JTextField();
		txtVMaximumPower.addKeyListener(new VMaxPowerListener());
		txtVMaximumPower.addFocusListener(new VMaxPowerListener());
		add(txtVMaximumPower, "4, 14, 3, 1, fill, default");
		txtVMaximumPower.setColumns(10);

		lbVForecastFile = new JLabel(DesignerMessages.getString("forecastFile")); //$NON-NLS-1$
		add(lbVForecastFile, "2, 16");

		txtVForecastFile = new JTextField();
		txtVForecastFile.addKeyListener(new VForecastFileListener());
		txtVForecastFile.addFocusListener(new VForecastFileListener());
		add(txtVForecastFile, "4, 16, fill, default");
		txtVForecastFile.setColumns(10);

		JButton btVBrowse = new JButton("");
		btVBrowse.addMouseListener(new VBrowseListener());
		btVBrowse.setIcon(Icon.open);
		btVBrowse.setBorder(new EmptyBorder(3, 3, 3, 3));
		add(btVBrowse, "6, 16, right, center");

		lbVCost = new JLabel(DesignerMessages.getString("fuelCost")); //$NON-NLS-1$
		add(lbVCost, "2, 18");

		txtVCost = new JTextField();
		txtVCost.addKeyListener(new VCostListener());
		txtVCost.addFocusListener(new VCostListener());
		add(txtVCost, "4, 18, 3, 1, fill, default");
		txtVCost.setColumns(10);

		lbVCOEmission = new JLabel(DesignerMessages.getString("co2Emissions")); //$NON-NLS-1$
		add(lbVCOEmission, "2, 20");

		txtVCOEmission = new JTextField();
		txtVCOEmission.addKeyListener(new VCOEmissionListener());
		txtVCOEmission.addFocusListener(new VCOEmissionListener());
		add(txtVCOEmission, "4, 20, 3, 1, fill, default");
		txtVCOEmission.setColumns(10);
	}
}
