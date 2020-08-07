package fortiss.gui.listeners.helper;

import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.swing.JLabel;

import java.util.TreeMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import fortiss.components.Building;
import fortiss.components.Connection;
import fortiss.components.Demand;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.action.ResetListener;
import fortiss.serialization.Point2DTypeAdapter;
import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;
import fortiss.simulation.helper.ConnectionManager;
import fortiss.simulation.helper.PositionManager;

public class ModelInitHelper {

	/**
	 * Load a topology
	 * 
	 * @param configurationFile a configuration file
	 */
	public static void loadFromFile(File configurationFile) {

		if (configurationFile != null) {
			try {

				DesignerPanel.parameterPanel.pars.getDescriptorFiles().clear();

				// Reset simulation
				ResetListener r = new ResetListener();
				r.mouseClicked(null);

				Gson gson = new Gson(); // Gson parser
				JsonReader reader = new JsonReader(new FileReader(configurationFile));

				DesignerPanel.buildings = new TreeMap<String, Building>();
				try {
					// Do not read the json file using an array. It will result in incorrect parsing
					HashSet<Building> buildingSet = gson.fromJson(reader, new TypeToken<HashSet<Building>>() {
					}.getType());
					Iterator<Building> iterator = buildingSet.iterator();
					while (iterator.hasNext()) {
						Building building = iterator.next();
						DesignerPanel.buildings.put(building.getName(), building);
					}
				} catch (JsonIOException | JsonSyntaxException e) {
					e.printStackTrace();
				}

				// Set the path of consumption file to an empty string if the file it point to
				// does not exists. Necessary because gson.fromJson() bypasses the constructor
				// of Demand.
				for (Entry<String, Building> entry : DesignerPanel.buildings.entrySet()) {
					Building building = entry.getValue();
					for (Demand demand : building.getDemand()) {
						String consumptionFilePath = demand.getConsumptionProfile();
						File f = new File(consumptionFilePath);
						if (f.exists() || consumptionFilePath.isEmpty()) {
							demand.setConsumptionProfile(consumptionFilePath);
						} else {
							demand.setConsumptionProfile("");
							System.err.println("File " + consumptionFilePath + " does not exist. Using zeros only.");
						}
					}
				}

				BuildingIcons bi = new BuildingIcons();
				bi.createBuildingIcons();
				createComponentIcons();

				DesignerPanel.buildingCount = DesignerPanel.buildings.size();
				DesignerPanel.selectedBuilding = DesignerPanel.buildings.get(DesignerPanel.buildings.firstKey());
				DataUpdater up = new DataUpdater();
				Building building = DesignerPanel.selectedBuilding;
				up.updateEmsData(building.getName(), Integer.toString(building.getPort()));

				PlanningTool.getPlanningToolWindow()
						.setTitle("MEMAP - " + configurationFile.getAbsolutePath() + " - DesignerPanel");
				DesignerPanel.parameterPanel.pars.setLastSavedFile(configurationFile.getAbsolutePath());
				System.out.println(">> Loaded file: " + configurationFile.getAbsolutePath());

			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
		}

	}

	/**
	 * Create component icons for all existing buildings
	 */
	private static void createComponentIcons() {
		for (String buildingName : DesignerPanel.buildings.keySet()) {			
			Building building = DesignerPanel.buildings.get(buildingName);			
			ComponentIcons components = new ComponentIcons();
			components.createIcons(building);
		}
	}

	/** Load the parameters */
	public static void initParameters(Parameters par) {
		DataUpdater up = new DataUpdater();
		up.updateParameterData(par);
	}

	/**
	 * Read the connections between buildings from the connections file and update
	 * the list in {@link ConnectionManager}. Connections must be read after
	 * positions to paint lines properly. Otherwise, connections must be updated
	 * using {@link ConnectionManager#updateLines()}.
	 */
	public static void readConnections() {
		FileManager fm = new FileManager();
		BufferedReader br = fm.readConnectionFile();
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		ArrayList<Connection> connectionList = gson.fromJson(br, new TypeToken<ArrayList<Connection>>() {
		}.getType());

		ConnectionManager cm = ConnectionManager.getInstance();
		cm.setConnectionList(connectionList);
	}

	/**
	 * Read the building positions from the connections file, and update the list in
	 * {@link PositionManager}.
	 */
	public static void readPositions() {
		FileManager fm = new FileManager();
		BufferedReader br = fm.readPositionsFile();		
		Type pointListType = new TypeToken<TreeMap<String, Point2D>>() {}.getType();		
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.registerTypeAdapter(Point2D.class, new Point2DTypeAdapter());		
		Gson gson = gsonBuilder.enableComplexMapKeySerialization().excludeFieldsWithoutExposeAnnotation().create();
		TreeMap<String, Point2D> positionsList = gson.fromJson(br, pointListType);

		// the following is a validation, to ignore potentially false positions in th  positions.json file
		TreeMap<String, Point2D> validatedList = new TreeMap<>();
		
		for (Entry<String, Point2D> ie : positionsList.entrySet()) {
			String key = ie.getKey();			
			if ( DesignerPanel.buildings.get(key) != null) {
				validatedList.put(ie.getKey(), ie.getValue());
			}
		}
		
		PositionManager pm = PositionManager.getInstance();
		
		try {
			pm.setPositions(validatedList);
		} catch (Exception e) {
			e.printStackTrace();
			pm.clearPositions();			
			for (Entry<Building, JLabel> entry : DesignerPanel.buildingIcons.entrySet()) {				
				Building building = entry.getKey();		
				JLabel icon = entry.getValue();				
				pm.addPosition(building.getName(), icon);
			}
		}
		
	}
}
