package fortiss.gui.listeners.helper;

import java.awt.geom.Point2D;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonStreamParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import fortiss.components.Building;
import fortiss.components.Connection;
import fortiss.gui.DesignerPanel;
import fortiss.gui.commands.ResetCommand;
import fortiss.serialization.BuildingTypeAdapter;
import fortiss.serialization.Point2DTypeAdapter;
import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;
import fortiss.simulation.helper.ConnectionManager;

public class ModelInitHelper {

	/**
	 * Load a topology
	 * 
	 * @param configurationFile a configuration file
	 */

	public static void loadFromFile(String configurationFile) {

		if (configurationFile != null) {
			try {
				// TODO: Reset has a descriptor file clearance, why do we need this line?
				// DesignerPanel.parameterPanel.pars.getDescriptorFiles().clear();

				// Reset simulation
				new ResetCommand().execute();

				InputStream is = new FileInputStream(configurationFile);
				Reader reader = new InputStreamReader(is);

				GsonBuilder gsonBuilder = new GsonBuilder();
				gsonBuilder.registerTypeAdapter(Point2D.class, new Point2DTypeAdapter());
				gsonBuilder.registerTypeAdapter(Building.class, new BuildingTypeAdapter());
				Type buildingSetType = new TypeToken<HashSet<Building>>() {
				}.getType();

				Gson gson = gsonBuilder.enableComplexMapKeySerialization().excludeFieldsWithoutExposeAnnotation()
						.create();

				JsonStreamParser p = new JsonStreamParser(reader);

				// Import topology
				JsonElement topology = p.next();

				DesignerPanel.buildings = new TreeMap<String, Building>();

				try {
					// Do not read the json file using an array. It will result in incorrect parsing
					HashSet<Building> buildingSet = gson.fromJson(topology, buildingSetType);

					Iterator<Building> iterator = buildingSet.iterator();
					while (iterator.hasNext()) {
						Building building = iterator.next();
						DesignerPanel.buildings.put(building.getName(), building);
					}
				} catch (JsonIOException | JsonSyntaxException e) {
					e.printStackTrace();
				}

				DesignerPanel.buildingCount = DesignerPanel.buildings.size();
				DesignerPanel.selectedBuilding = DesignerPanel.buildings.get(DesignerPanel.buildings.firstKey());
				DesignerPanel.showInformationPanel("building");

				// Import Connections
				JsonElement connections = p.next();
				ArrayList<Connection> connectionList = gson.fromJson(connections,
						new TypeToken<ArrayList<Connection>>() {
						}.getType());

				ConnectionManager cm = ConnectionManager.getInstance();
				cm.setConnectionList(connectionList);

				PlanningTool planningTool = PlanningTool.getInstance();
				planningTool.getPlanningToolWindow().setTitle("MEMAP - " + configurationFile + " - DesignerPanel");
				planningTool.getParameters().setLastSavedFile(configurationFile);
				System.out.println(">> Loaded file: " + configurationFile);

			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
		}

	}

	/** Load the parameters */
	public static void initParameters(Parameters par) {
		PlanningTool planningTool = PlanningTool.getInstance();
		planningTool.setParameters(par);
		DesignerPanel.parameterPanel.update();
	}

}
