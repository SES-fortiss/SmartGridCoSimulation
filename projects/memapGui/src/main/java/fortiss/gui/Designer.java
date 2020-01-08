package fortiss.gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.datatransfer.DataFlavor;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;

import com.google.gson.Gson;

import fortiss.components.Building;
import fortiss.gui.listeners.helper.FileManager;
import fortiss.gui.listeners.helper.ModelInitHelper;
import fortiss.gui.listeners.window.ExitWindowListner;
import fortiss.gui.style.Colors;
import fortiss.gui.style.StyleGenerator;
import fortiss.media.Icon;
import fortiss.simulation.Parameters;

public class Designer extends JFrame {

	private static final long serialVersionUID = 1L;
	
	// Object arrays
	public static ArrayList<Building> buildings = new ArrayList<Building>();
	public static ArrayList<JLabel> buildingIcons = new ArrayList<JLabel>();
	public static ArrayList<ArrayList<JLabel>> demandIcons = new ArrayList<ArrayList<JLabel>>();
	public static ArrayList<ArrayList<JLabel>> storageIcons = new ArrayList<ArrayList<JLabel>>();
	public static ArrayList<ArrayList<JLabel>> volatileIcons = new ArrayList<ArrayList<JLabel>>();
	public static ArrayList<ArrayList<JLabel>> controllableIcons = new ArrayList<ArrayList<JLabel>>();
	public static ArrayList<ArrayList<JLabel>> couplerIcons = new ArrayList<ArrayList<JLabel>>();

	// Flags
	public static int buildingCount = buildings.size();
	public static int currentBuilding;
	public static int currentComponent;

	// Panels
	public static ParameterInputPanel parameterPanel;
	public static JPanel contentPane; // Principal panel
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
	public static Designer frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				StyleGenerator.setupStyle();
				frame = new Designer();
				frame.setVisible(true);
			}
		});
	}

	/** Necessary for dark mode on/off implementation */
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		contentPane.setBackground(Colors.background);
		lblFortissMemap.setForeground(Colors.accent1);
	}

	/**
	 * Create the frame.
	 */
	public Designer() {
		setSize(new Dimension(1200, 810));
		setLocationRelativeTo(null);
		setIconImage(Icon.smallMemapLogo.getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		// Add dataFlavor class
		dataFlavor = new DataFlavor(JLabel.class, JLabel.class.getSimpleName());

		// Add panel of actions: LoadListener, run, save, reset
		pl_action = new ActionPanel();
		contentPane.add(pl_action, BorderLayout.NORTH);

		// Add panel for EMS details
		pl_ems_detail = new BuildingInputPanel();

		// Add panel for components details
		pl_comp_detail = new JPanel();
		contentPane.add(pl_comp_detail, BorderLayout.EAST);
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
		
		cl.show(Designer.pl_comp_detail, "initial");
		
		// Add split panel for EMS/component icons
		split_main = new JSplitPane();
		split_main.setBorder(null);
		split_main.setOrientation(JSplitPane.VERTICAL_SPLIT);
		split_main.setDividerSize(0);
		split_main.setLastDividerLocation(400);
		split_main.setDividerLocation(400);
		contentPane.add(split_main, BorderLayout.CENTER);

		// Add main panel for EMS addition
		pl_ems = new BuildingPanel();// new JPanel();
		split_main.setLeftComponent(pl_ems);

		// Add main panel for component addition
		pl_comp = new AddedComponentPanel();
		split_main.setRightComponent(pl_comp);

		pl_object = new ObjectPanel();
		contentPane.add(pl_object, BorderLayout.WEST);

		lblFortissMemap = new JLabel(
				"© 2019 FORTISS GMBH - AN INSTITUTE AFFILIATED TO THE TECHNICAL UNIVERSITY OF MUNICH");
		lblFortissMemap.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblFortissMemap, BorderLayout.SOUTH);		
		
		initLastSession();
		addWindowListener( new ExitWindowListner() );
	}

	private void initLastSession() {
		Gson gson = new Gson();
		String workingFile =  gson.fromJson(FileManager.readConfig(), Parameters.class).getLastSavedFile();
		
		if (workingFile != null && !workingFile.equals("")) {
			ModelInitHelper.loadFromFile(new File(workingFile));
			setTitle("MEMAP - "+ workingFile +" - Interactive Designer");
		} else {
			System.out.println("lastWorkingFile: " + workingFile + " has not been loaded");
		}
	}	
}
