package fortiss.gui;

import java.awt.Cursor;
import java.awt.Graphics;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import fortiss.components.Volatile;
import fortiss.datastructures.DataI;
import fortiss.gui.listeners.button.VBrowseListener;
import fortiss.gui.listeners.button.VPlotListener;
import fortiss.gui.listeners.selectionitem.VNetworkTypeListener;
import fortiss.gui.listeners.textfield.VCOEmissionListener;
import fortiss.gui.listeners.textfield.VCostListener;
import fortiss.gui.listeners.textfield.VForecastFileListener;
import fortiss.gui.listeners.textfield.VMaxPowerListener;
import fortiss.gui.listeners.textfield.VMinPowerListener;
import fortiss.gui.listeners.textfield.VNameListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import fortiss.gui.style.StyleGenerator;
import fortiss.media.IconStore;
import net.miginfocom.swing.MigLayout;

/**
 * Input panel for volatile parameters.
 */
public class VolatileInputPanel extends InformationPanel {

	private static final long serialVersionUID = 1L;
	
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
	/** Plot panel */
	private PlotPanel plotPanel = new PlotPanel();


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

		setLayout(new MigLayout("insets 30 20 20 20, fillx, wrap 4, hidemode 2, width 99%", 
				"[left, growprio 50]30[right]10[right, grow 0]5[right, grow 0]", 
				""));
		
		lblVolatileProduction = new JLabel("VOLATILE PRODUCTION");
		lblVolatileProduction.setFont(Fonts.getOswald());
		add(lblVolatileProduction, "spanx, center, gapbottom 30");

		lbVName = new JLabel("Name");
		add(lbVName);

		txtVName = new JTextField();
		txtVName.addKeyListener(new VNameListener());
		txtVName.addFocusListener(new VNameListener());
		txtVName.setColumns(10);
		add(txtVName, "spanx 3, growx");

		lbVNetworkType = new JLabel("Network type");
		add(lbVNetworkType);

		sVNetworkType = new JComboBox<>();
		sVNetworkType.setFocusable(false);
		sVNetworkType.setFocusTraversalKeysEnabled(false);
		sVNetworkType.setModel(new DefaultComboBoxModel<String>(
				new String[] { "Heat", "Electricity" }));
		sVNetworkType.addItemListener(new VNetworkTypeListener());
		sVNetworkType.addMouseListener(new VNetworkTypeListener());
		add(sVNetworkType, "spanx 3, growx");

		lbVMinimumPower = new JLabel("Minimum power [kW]");
		add(lbVMinimumPower);

		txtVMinimumPower = new JTextField();
		txtVMinimumPower.addKeyListener(new VMinPowerListener());
		txtVMinimumPower.addFocusListener(new VMinPowerListener());
		txtVMinimumPower.setColumns(10);
		add(txtVMinimumPower, "spanx 3, growx");

		lbVMaximumPower = new JLabel("Maximum power [kW]");
		add(lbVMaximumPower);

		txtVMaximumPower = new JTextField();
		txtVMaximumPower.addKeyListener(new VMaxPowerListener());
		txtVMaximumPower.addFocusListener(new VMaxPowerListener());
		txtVMaximumPower.setColumns(10);
		add(txtVMaximumPower, "spanx 3, growx");

		lbVCost = new JLabel("Fuel cost [EUR/kWh]");
		add(lbVCost);

		txtVCost = new JTextField();
		txtVCost.addKeyListener(new VCostListener());
		txtVCost.addFocusListener(new VCostListener());
		add(txtVCost, "spanx 3, growx");
		txtVCost.setColumns(10);

		lbVCOEmission = new JLabel("CO2 Emissions [kg/kWh]"); //$NON-NLS-1$
		add(lbVCOEmission);

		txtVCOEmission = new JTextField();
		txtVCOEmission.addKeyListener(new VCOEmissionListener());
		txtVCOEmission.addFocusListener(new VCOEmissionListener());
		txtVCOEmission.setColumns(10);
		add(txtVCOEmission, "spanx 3, growx");
		
		lbVForecastFile = new JLabel("Forecast file");
		add(lbVForecastFile);

		txtVForecastFile = new JTextField();
		txtVForecastFile.addKeyListener(new VForecastFileListener());
		txtVForecastFile.addFocusListener(new VForecastFileListener());
		txtVForecastFile.setColumns(10);
		add(txtVForecastFile, "wmin 200, growx");

		JButton btVBrowse = new JButton("");
		btVBrowse.addMouseListener(new VBrowseListener());
		btVBrowse.setIcon(IconStore.open);
		btVBrowse.setBorder(new EmptyBorder(3, 3, 3, 3));
		add(btVBrowse, "wmax 40");
		
		JButton btVPlot = new JButton("");
		btVPlot.setIcon(IconStore.visualize);
		btVPlot.setBorder(new EmptyBorder(3, 3, 3, 3));
		btVPlot.setContentAreaFilled(false);
		btVPlot.addMouseListener(new VPlotListener());
		add(btVPlot, "wmax 40");
		
		plotPanel = new PlotPanel();
		plotPanel.setFocusable(false);
		plotPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(plotPanel, "spanx, center, gaptop 30");
		plotPanel.setVisible(false);
	}

	public void plot() {
		if (plotPanel.isPlotted()) {
			plotPanel.setVisible(false);
			plotPanel.setPlotted(false);
		} else {
			Volatile volatileProducer = (Volatile) DesignerPanel.selectedComponent;
			DataI data = volatileProducer.getData();
			if (data != null) {	
				for (String seriesName : data.getSeriesList()) {
					plotPanel.addSeries(seriesName, data.getSeries(seriesName));
				}
			}
			plotPanel.setPlotted(true);
			plotPanel.setVisible(true);
		}
	}
	
	@Override
	public void update() {
		// hide plot and erase data
		plotPanel.setVisible(false);
		plotPanel.setPlotted(false);
		plotPanel.clearSeries();
				
		Volatile volatileProd = (Volatile) DesignerPanel.selectedComponent;
		txtVName.setText(volatileProd.getName());
		sVNetworkType.setSelectedItem(volatileProd.getNetworkType());
		txtVMinimumPower.setText(Double.toString(volatileProd.getMinimumPower()));
		txtVMaximumPower.setText(Double.toString(volatileProd.getMaximumPower()));
		txtVForecastFile.setText(volatileProd.getForecastFile());
		txtVCost.setText(Double.toString(volatileProd.getCost()));
		txtVCOEmission.setText(Double.toString(volatileProd.getCOEmission()));
	}
}
