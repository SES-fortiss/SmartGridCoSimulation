package fortiss.gui.listeners.helper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;
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

				// ResetListener simulation
				ResetListener r = new ResetListener();
				r.mouseClicked(null);

				Gson gson = new Gson(); // Gson parser
				JsonReader reader = new JsonReader(new FileReader(file));
				Building[] myBuilding = gson.fromJson(reader, Building[].class);
				DesignerPanel.buildings = new ArrayList<Building>(Arrays.asList(myBuilding));

				// Set the path of consumption file to an empty string if the file it point to
				// does not exists. Necessary because gson.fromJson() bypasses the constructor
				// of Demand.
				for (Building building : DesignerPanel.buildings) {
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
				DesignerPanel.currentBuilding = 0;
				DataUpdater up = new DataUpdater();
				up.updateEmsData(DesignerPanel.buildings.get(DesignerPanel.currentBuilding).getName(),
						Integer.toString(DesignerPanel.buildings.get(DesignerPanel.currentBuilding).getPort()));

				PlanningTool.getPlanningToolWindow().setTitle("MEMAP - " + file.getAbsolutePath() + " - DesignerPanel");
				DesignerPanel.parameterPanel.pars.setLastSavedFile(file.getAbsolutePath());
				System.out.println(">> Loaded file: " + file.getAbsolutePath());

			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
		}

	}

	/**
	 * Create component icons. Calls the ComponentIcons createIcons function.
	 */
	private static void createComponentIcons() {
		for (int i = 0; i < DesignerPanel.buildings.size(); i++) {
			ComponentIcons components = new ComponentIcons();
			components.createIcons(i);
		}
	}

	/** Load the parameters */
	public static void initParameters(Parameters par) {
		DataUpdater up = new DataUpdater();
		up.updateParameterData(par);
	}

}
