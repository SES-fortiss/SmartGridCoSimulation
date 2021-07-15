package fortiss.gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.datatransfer.DataFlavor;
import java.util.TreeMap;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;

import fortiss.components.Building;
import fortiss.components.Component;
import fortiss.components.Connection;
import fortiss.gui.style.Colors;

public class DesignerPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	// Object arrays
	public static TreeMap<String, Building> buildings = new TreeMap<String, Building>();

	// Flags
	public static int buildingCount = buildings.size();
	public static Building selectedBuilding = null;
	public static Component selectedComponent = null;
	public static Connection selectedConnection = null;

	// Panels
	private static TreeMap<String, InformationPanel> informationPanels = new TreeMap<String, InformationPanel>();
	public static ParameterInputPanel parameterPanel;
	public static PricesPanel pricesPanel;
	public static ActionPanel pl_action; // Action panel: LoadListener, run, save, reset
	public static BuildingInputPanel pl_ems_detail; // Split 1: panel for EMS details
	public static JPanel pl_comp_detail; // Split 2: panel for components details
	public static InitialPanel initialPanel;
	public static RemoteConnectionPanel remoteConnectionPanel;
	public static RemoteConnectionPanel2 remoteConnectionPanel2;
	public static DemandInputPanel demandPanel; // Panel demand components
	public static StorageInputPanel storagePanel; // Panel storage components
	public static VolatileInputPanel volatilePanel; // Panel volatilePanel components
	public static ControllableInputPanel controllablePanel; // Panel controllablePanel components
	public static CouplerInputPanel couplerPanel;// Panel coupler components
	public static JSplitPane split_main; // Split panel to show icons: EMS and components
	public static BuildingPanel pl_ems; // Split 1: panel for EMS icons
	public static AddedComponentPanel pl_comp; // Split 2: panel for components icons
	public static ObjectPanel pl_object; // Panel to hold "add building/component" buttons
	private static CardLayout cl; // Card layout to show component details

	// Labels
	private JLabel lblFortissMemap;

	public static DataFlavor dataFlavor;

	/** Necessary for dark mode on/off implementation */
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		setBackground(Colors.background);
		lblFortissMemap.setForeground(Colors.accent1);
	}

	/**
	 * Create the frame.
	 */
	public DesignerPanel() {
		// setSize(new Dimension(1920, 1080));
		setLayout(new BorderLayout(0, 0));

		// Add dataFlavor class
		dataFlavor = new DataFlavor(JLabel.class, JLabel.class.getSimpleName());

		// Add panel of actions: LoadListener, run, save, reset
		pl_action = new ActionPanel();
		add(pl_action, BorderLayout.NORTH);

		// Add panel for EMS details
		pl_ems_detail = new BuildingInputPanel();

		// Add panel for components details
		pl_comp_detail = new JPanel();
		pl_comp_detail.setPreferredSize(new Dimension(550, getHeight()));
		add(pl_comp_detail, BorderLayout.EAST);
		pl_comp_detail.setLayout(new CardLayout(0, 0));
		cl = (CardLayout) pl_comp_detail.getLayout();
		pl_comp_detail.setVisible(true);

		// Add parameter panel
		parameterPanel = new ParameterInputPanel();
		pl_comp_detail.add(parameterPanel, "parameter");
		informationPanels.put("parameter", parameterPanel);

		// Add prices panel
		pricesPanel = new PricesPanel();
		pl_comp_detail.add(pricesPanel, "prices");
		informationPanels.put("prices", pricesPanel);

		// Add initial panel
		initialPanel = new InitialPanel();
		pl_comp_detail.add(initialPanel, "initial");
		informationPanels.put("initial", initialPanel);

		// Add panel for remote connection (BIM server)
		remoteConnectionPanel = new RemoteConnectionPanel();
		pl_comp_detail.add(remoteConnectionPanel, "remoteConnection");
		informationPanels.put("remoteConnection", remoteConnectionPanel);

		// Add panel for remote connection information (BIM server)
		remoteConnectionPanel2 = new RemoteConnectionPanel2();
		pl_comp_detail.add(remoteConnectionPanel2, "remoteConnection2");
		informationPanels.put("remoteConnection2", remoteConnectionPanel2);

		// Add panel for buildings
		pl_comp_detail.add(pl_ems_detail, "building");
		informationPanels.put("building", pl_ems_detail);

		// Add panel for demand components
		demandPanel = new DemandInputPanel();
		pl_comp_detail.add(demandPanel, "demand");
		informationPanels.put("demand", demandPanel);

		// Add panel for Storage Objects
		storagePanel = new StorageInputPanel();
		pl_comp_detail.add(storagePanel, "storage");
		informationPanels.put("storage", storagePanel);

		// Add panel for Volatile
		volatilePanel = new VolatileInputPanel();
		pl_comp_detail.add(volatilePanel, "volProduction");
		informationPanels.put("volProduction", volatilePanel);

		// Add panel for Controllable
		controllablePanel = new ControllableInputPanel();
		pl_comp_detail.add(controllablePanel, "contProduction");
		informationPanels.put("contProduction", controllablePanel);

		// Add panel for Coupler
		couplerPanel = new CouplerInputPanel();
		pl_comp_detail.add(couplerPanel, "coupler");
		informationPanels.put("coupler", couplerPanel);

		cl.show(DesignerPanel.pl_comp_detail, "initial");

		// Add split panel for EMS/component icons
		split_main = new JSplitPane();
		split_main.setBorder(null);
		split_main.setOrientation(JSplitPane.VERTICAL_SPLIT);
		split_main.setDividerSize(0);
		split_main.setResizeWeight(0.5);
		add(split_main, BorderLayout.CENTER);

		// Add main panel for EMS addition
		pl_ems = new BuildingPanel();// new JPanel();
		split_main.setLeftComponent(pl_ems);

		// Add main panel for component addition
		pl_comp = new AddedComponentPanel();
		split_main.setRightComponent(pl_comp);

		pl_object = new ObjectPanel();
		add(pl_object, BorderLayout.WEST);

		lblFortissMemap = new JLabel(
				"© 2020 FORTISS GMBH - AN INSTITUTE AFFILIATED TO THE TECHNICAL UNIVERSITY OF MUNICH");
		lblFortissMemap.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblFortissMemap, BorderLayout.SOUTH);
	}

	/**
	 * Updates a shows the information in a panel. Must be called after the
	 * {@link #selectedBuilding} or {@link #selectedComponent} has been set.
	 */
	public static void showInformationPanel(String panelName) {
		informationPanels.get(panelName).update();
		cl.show(pl_comp_detail, panelName);
	}
}