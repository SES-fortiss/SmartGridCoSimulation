package fortiss.gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.datatransfer.DataFlavor;
import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeMap;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;

import com.google.gson.Gson;

import fortiss.components.Building;
import fortiss.gui.listeners.helper.FileManager;
import fortiss.gui.listeners.helper.ModelInitHelper;
import fortiss.gui.style.Colors;
import fortiss.simulation.Parameters;

public class DesignerPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	// Object arrays
	public static TreeMap<String, Building> buildings = new TreeMap<String, Building>();
	public static TreeMap<String, JLabel> buildingIcons = new TreeMap<String, JLabel>();
	public static TreeMap<String, ArrayList<JLabel>> demandIcons = new TreeMap<String, ArrayList<JLabel>>();
	public static TreeMap<String, ArrayList<JLabel>> storageIcons = new TreeMap<String, ArrayList<JLabel>>();
	public static TreeMap<String, ArrayList<JLabel>> volatileIcons = new TreeMap<String, ArrayList<JLabel>>();
	public static TreeMap<String, ArrayList<JLabel>> controllableIcons = new TreeMap<String, ArrayList<JLabel>>();
	public static TreeMap<String, ArrayList<JLabel>> couplerIcons = new TreeMap<String, ArrayList<JLabel>>();
	
	// Flags
	public static int buildingCount = buildings.size();
	public static String selectedBuilding = "";
	public static int currentComponent;
	
	// Panels
	public static ParameterInputPanel parameterPanel;
	public static ActionPanel pl_action; // Action panel: LoadListener, run, save, reset
	public static BuildingInputPanel pl_ems_detail; // Split 1: panel for EMS details
	public static JPanel pl_comp_detail; // Split 2: panel for components details
	public static InitialPanel initialPanel;
	public static DemandInputPanel demandPanel; // Panel demand components
	public static StorageInputPanel storagePanel; // Panel storage components
	public static VolatileInputPanel volatilePanel; // Panel volatilePanel components
	public static ControllableInputPanel controllablePanel; // Panel controllablePanel components
	public static CouplerInputPanel couplerPanel;// Panel coupler components
	public static JSplitPane split_main; // Split panel to show icons: EMS and components
	public static BuildingPanel pl_ems; // Split 1: panel for EMS icons
	public static AddedComponentPanel pl_comp; // Split 2: panel for components icons
	public static ObjectPanel pl_object; // Panel to hold "add building/component" buttons
	public static CardLayout cl; // Card layout to show component details

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
		//setSize(new Dimension(1920, 1080));
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

		// Add initial panel
		initialPanel = new InitialPanel();
		pl_comp_detail.add(initialPanel, "initial");

		// Add panel for buildings
		pl_comp_detail.add(pl_ems_detail, "building");

		// Add panel for demand components
		demandPanel = new DemandInputPanel();
		pl_comp_detail.add(demandPanel, "demand");

		// Add panel for Storage Objects
		storagePanel = new StorageInputPanel();
		pl_comp_detail.add(storagePanel, "storage");

		// Add panel for Volatile
		volatilePanel = new VolatileInputPanel();
		pl_comp_detail.add(volatilePanel, "volProduction");

		// Add panel for Controllable
		controllablePanel = new ControllableInputPanel();
		pl_comp_detail.add(controllablePanel, "contProduction");

		// Add panel for Coupler
		couplerPanel = new CouplerInputPanel();
		pl_comp_detail.add(couplerPanel, "coupler");

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
				"© 2019 FORTISS GMBH - AN INSTITUTE AFFILIATED TO THE TECHNICAL UNIVERSITY OF MUNICH");
		lblFortissMemap.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblFortissMemap, BorderLayout.SOUTH);
	}

	public void initLastSession() {
		Gson gson = new Gson();
		FileManager fm = new FileManager();
		BufferedReader br = fm.readParameterConfigFile();

		String workingFile = "";
		Parameters par = null;

		if (br != null) {
			par = gson.fromJson(br, Parameters.class);
			par.clearDescriptorFile();
			workingFile = par.getLastSavedFile();

			System.out.println(gson.toJson(par));
		}

		if (!workingFile.equals("")) {
			ModelInitHelper.loadFromFile(new File(workingFile));
			ModelInitHelper.initParameters(par);
			// Connections must be read or updated after positions!
			ModelInitHelper.readPositions();
			ModelInitHelper.readConnections();
		} else {
			System.out.println("lastWorkingFile: " + workingFile);
		}
	}
}