package fortiss.gui.listeners.helper;

import java.awt.geom.Point2D;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
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
import fortiss.components.Demand;
import fortiss.components.Volatile;
import fortiss.gui.DesignerPanel;
import fortiss.gui.commands.ResetCommand;
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
				//DesignerPanel.parameterPanel.pars.getDescriptorFiles().clear();

				// Reset simulation
				new ResetCommand().execute();

				InputStream is = new FileInputStream(configurationFile);
				Reader reader = new InputStreamReader(is);

				GsonBuilder gsonBuilder = new GsonBuilder();
				gsonBuilder.registerTypeAdapter(Point2D.class, new Point2DTypeAdapter());
				Gson gson = gsonBuilder.enableComplexMapKeySerialization().excludeFieldsWithoutExposeAnnotation()
						.create();

				JsonStreamParser p = new JsonStreamParser(reader);

				// Import topology
				JsonElement topology = p.next();
				
				DesignerPanel.buildings = new TreeMap<String, Building>();
				try {
					// Do not read the json file using an array. It will result in incorrect parsing
					HashSet<Building> buildingSet = gson.fromJson(topology, new TypeToken<HashSet<Building>>() {
					}.getType());
					Iterator<Building> iterator = buildingSet.iterator();
					while (iterator.hasNext()) {
						Building building = iterator.next();
						DesignerPanel.buildings.put(building.getName(), building);
					}
				} catch (JsonIOException | JsonSyntaxException e) {
					e.printStackTrace();
				}

				fixFilePaths();

				// Import positions
				JsonElement positions = p.next();
				Type pointListType = new TypeToken<TreeMap<String, Point2D>>() {
				}.getType();
				TreeMap<String, Point2D> positionsList = gson.fromJson(positions, pointListType);
				
				BuildingIcons bi = new BuildingIcons();
				bi.createBuildingIcons(positionsList);
				createComponentIcons();

				DesignerPanel.buildingCount = DesignerPanel.buildings.size();
				DesignerPanel.selectedBuilding = DesignerPanel.buildings.get(DesignerPanel.buildings.firstKey());
				DataUpdater up = new DataUpdater();
				Building building = DesignerPanel.selectedBuilding;
				up.updateEmsData(building.getName(), Integer.toString(building.getPort()));

				// Import Connections
				JsonElement connections = p.next();
				ArrayList<Connection> connectionList = gson.fromJson(connections,
						new TypeToken<ArrayList<Connection>>() {
						}.getType());

				ConnectionManager cm = ConnectionManager.getInstance();
				cm.setConnectionList(connectionList);

				PlanningTool.getPlanningToolWindow().setTitle("MEMAP - " + configurationFile + " - DesignerPanel");
				DesignerPanel.parameterPanel.pars.setLastSavedFile(configurationFile);
				System.out.println(">> Loaded file: " + configurationFile);

			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
		}

	}

	/**
	 * Set a path to an empty string if the file it points to does not exists.
	 * Necessary because gson.fromJson() bypasses the constructor of the class. Used
	 * for {@link Demand} and {@link Volatile}
	 */
	private static void fixFilePaths() {

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

			for (Volatile volatileProducer : building.getVolatile()) {
				String forecastFile = volatileProducer.getForecastFile();
				File f = new File(forecastFile);
				if (f.exists() || forecastFile.isEmpty()) {
					volatileProducer.setForecastFile(forecastFile);
				} else {
					volatileProducer.setForecastFile("");
					System.err.println("File " + forecastFile + " does not exist. Using zeros only.");
				}
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

}
