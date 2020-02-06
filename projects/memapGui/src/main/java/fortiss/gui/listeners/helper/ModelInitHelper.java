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
import fortiss.gui.Designer;
import fortiss.gui.listeners.action.ResetListener;
import fortiss.simulation.Parameters;

public class ModelInitHelper {

	public static void loadFromFile(File file) {

		if (file != null) {
			try {

				Designer.parameterPanel.pars.getDescriptorFiles().clear();

				// ResetListener simulation
				ResetListener r = new ResetListener();
				r.mouseClicked(null);

				Gson gson = new Gson(); // Gson parser
				JsonReader reader = new JsonReader(new FileReader(file));
				Building[] myBuilding = gson.fromJson(reader, Building[].class);
				Designer.buildings = new ArrayList<Building>(Arrays.asList(myBuilding));

				// Set the path of consumption file to an empty string if the file it point to
				// does not exists. Necessary because gson.fromJson() bypasses the constructor
				// of Demand.
				for (Building building : Designer.buildings) {
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

				Designer.buildingCount = Designer.buildings.size();
				Designer.currentBuilding = 0;
				DataUpdater up = new DataUpdater();
				up.updateEmsData(Designer.buildings.get(Designer.currentBuilding).getName(),
						Integer.toString(Designer.buildings.get(Designer.currentBuilding).getPort()));

				Designer.frame.setTitle("MEMAP - " + file.getAbsolutePath() + " - PlanningTool");
				Designer.parameterPanel.pars.setLastSavedFile(file.getAbsolutePath());
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
		for (int i = 0; i < Designer.buildings.size(); i++) {
			ComponentIcons components = new ComponentIcons();
			components.createIcons(i);
		}
	}

	public static void initParameters(Parameters par) {
		DataUpdater up = new DataUpdater();
		up.updateParameterData(par);
	}

}
