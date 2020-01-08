package fortiss.gui.listeners.helper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import fortiss.components.Building;
import fortiss.gui.Designer;
import fortiss.gui.listeners.action.ResetListener;

public class ModelInitHelper {

	public static void loadFromFile(File file) {
		
		if (file != null) {
		
			try {
				// ResetListener simulation
				ResetListener r = new ResetListener();
				r.mouseClicked(null);
	
				Gson gson = new Gson(); // Gson parser
				JsonReader reader = new JsonReader(new FileReader(file));
				Building[] myBuilding = gson.fromJson(reader, Building[].class);
				Designer.buildings = new ArrayList<Building>(Arrays.asList(myBuilding));
				BuildingIcons bi = new BuildingIcons();
				bi.createBuildingIcons();
				createComponentIcons();
	
				Designer.buildingCount = Designer.buildings.size();
				Designer.currentBuilding = 0;
				DataUpdater up = new DataUpdater();
				up.updateEmsData(Designer.buildings.get(Designer.currentBuilding).getName(),
						Integer.toString(Designer.buildings.get(Designer.currentBuilding).getPort()));
	
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

}
