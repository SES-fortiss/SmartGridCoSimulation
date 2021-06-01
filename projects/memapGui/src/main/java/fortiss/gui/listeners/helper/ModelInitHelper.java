package fortiss.gui.listeners.helper;

import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
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
import fortiss.serialization.ConnectionTypeAdapter;
import fortiss.serialization.ParametersTypeAdapter;
import fortiss.serialization.Point2DTypeAdapter;
import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;
import fortiss.simulation.helper.ConnectionManager;
import fortiss.simulation.helper.Logger;

public class ModelInitHelper {

	private FileManager fm;
	
	public ModelInitHelper() {
		fm = new FileManager();
	}
	
	/**
	 * Load a topology
	 * 
	 * @param topologyFilePath the path where a topology is saved
	 */
	public void loadFromFile(String topologyFilePath) {

		try {
			PlanningTool planningTool = PlanningTool.getInstance();

			// Reset simulation
			new ResetCommand().execute();
			
			BufferedReader br = fm.readFromSource(topologyFilePath);

			GsonBuilder gsonBuilder = new GsonBuilder();
			gsonBuilder.registerTypeAdapter(Point2D.class, new Point2DTypeAdapter());
			gsonBuilder.registerTypeAdapter(Building.class, new BuildingTypeAdapter());
			gsonBuilder.registerTypeAdapter(Parameters.class, new ParametersTypeAdapter());
			gsonBuilder.registerTypeAdapter(Connection.class, new ConnectionTypeAdapter());
			Type buildingSetType = new TypeToken<HashSet<Building>>() {
			}.getType();

			Gson gson = gsonBuilder.setPrettyPrinting().enableComplexMapKeySerialization().excludeFieldsWithoutExposeAnnotation().create();

			JsonStreamParser p = new JsonStreamParser(br);
			JsonArray root = p.next().getAsJsonArray();

			// Import topology
			JsonElement topology = root.get(0);

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
				Logger.getInstance().writeWarning("Json Exception: Couldn't load the topology");
				e.printStackTrace();
			}

			DesignerPanel.buildingCount = DesignerPanel.buildings.size();

			// Json File might be empty
			if (DesignerPanel.buildingCount > 0) {
				DesignerPanel.selectedBuilding = DesignerPanel.buildings.get(DesignerPanel.buildings.firstKey());
				DesignerPanel.showInformationPanel("building");
			}

			// Import Connections
			JsonElement connections = root.get(1);
			ArrayList<Connection> connectionList = gson.fromJson(connections, new TypeToken<ArrayList<Connection>>() {
			}.getType());

			ConnectionManager cm = ConnectionManager.getInstance();
			cm.setConnectionList(connectionList);

			// Import parameters
			JsonElement parameters = root.get(2);
			planningTool.setParameters(gson.fromJson(parameters, Parameters.class));
			String fileName = Paths.get(topologyFilePath).getFileName().toString().replaceAll(".json", "");
			planningTool.getParameters().setSimulationName(fileName);
			
			DesignerPanel.parameterPanel.update();
			Logger.getInstance().writeInfo("Parameters: " + gson.toJson(planningTool.getParameters()));

			// Show and save current working file
			planningTool.getPlanningToolWindow().setTitle("MEMAP - " + topologyFilePath + " - DesignerPanel");
			planningTool.setWorkingFile(topologyFilePath);
			planningTool.setSaved(true);
			Logger.getInstance().writeInfo("Topology loaded from: " + topologyFilePath);
			
		} catch (FileNotFoundException e1) {
			Logger.getInstance().writeError("File not found: " + topologyFilePath);
			e1.printStackTrace();
		}
	}
	
	/**
	 * Save a topology
	 * 
	 * @param topologyFilePath a path where the topology should be saved
	 */
	public void writeMemapModel(String topologyFilePath) {

		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.registerTypeAdapter(Point2D.class, new Point2DTypeAdapter());
		gsonBuilder.registerTypeAdapter(Building.class, new BuildingTypeAdapter());
		gsonBuilder.registerTypeAdapter(Connection.class, new ConnectionTypeAdapter());
		Gson gson = gsonBuilder.enableComplexMapKeySerialization().excludeFieldsWithoutExposeAnnotation().create();

		// Export topology
		Set<Building> mySet = new HashSet<Building>();
		for (Entry<String, Building> entry : DesignerPanel.buildings.entrySet()) {
			Building building = entry.getValue();
			mySet.add(building);
		}
		
		Collection<Object> root = new ArrayList<Object>();
		root.add(mySet);

		// Export connections
		ConnectionManager cm = ConnectionManager.getInstance();
		root.add(cm.getConnectionList());
		
		// Export parameters
		Parameters pars = PlanningTool.getInstance().getParameters();
		String fileName = Paths.get(topologyFilePath).getFileName().toString().replaceAll(".json", "");
		pars.setSimulationName(fileName);
		DesignerPanel.parameterPanel.update();
		root.add(pars);
		
		String str = gson.toJson(root);
		
		fm.writeFile(str, new File(topologyFilePath));

		Logger.getInstance().writeInfo("Writing MEMAP model in: " + topologyFilePath);
	}
}
