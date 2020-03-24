package fortiss.gui.listeners.helper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import fortiss.components.Building;
import fortiss.components.Demand;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.action.ResetListener;
import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;

public class ModelInitHelper {

	/**
	 * Load a topology
	 * 
	 * @param file a configuration file
	 */
	public static void loadFromFile(File file) {

		if (file != null) {
			try {

				DesignerPanel.parameterPanel.pars.getDescriptorFiles().clear();

				// Reset simulation
				ResetListener r = new ResetListener();
				r.mouseClicked(null);

				Gson gson = new Gson(); // Gson parser
				JsonReader reader = new JsonReader(new FileReader(file));

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
				DesignerPanel.selectedBuilding = DesignerPanel.buildings.firstKey();
				DataUpdater up = new DataUpdater();
				Building building = DesignerPanel.buildings.get(DesignerPanel.selectedBuilding);
				up.updateEmsData(building.getName(), Integer.toString(building.getPort()));

				PlanningTool.getPlanningToolWindow().setTitle("MEMAP - " + file.getAbsolutePath() + " - DesignerPanel");
				DesignerPanel.parameterPanel.pars.setLastSavedFile(file.getAbsolutePath());
				System.out.println(">> Loaded file: " + file.getAbsolutePath());

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
			ComponentIcons components = new ComponentIcons();
			components.createIcons(buildingName);
		}
	}

	/** Load the parameters */
	public static void initParameters(Parameters par) {
		DataUpdater up = new DataUpdater();
		up.updateParameterData(par);
	}

}
