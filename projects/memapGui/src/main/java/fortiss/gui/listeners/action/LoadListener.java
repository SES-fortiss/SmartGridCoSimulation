package fortiss.gui.listeners.action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFileChooser;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import fortiss.components.Building;
import fortiss.gui.Designer;
import fortiss.gui.listeners.helper.BuildingIcons;
import fortiss.gui.listeners.helper.ComponentIcons;
import fortiss.gui.listeners.helper.DataUpdater;

public class LoadListener extends MouseAdapter {
	/**
	 * Loads a topology from a JSON file.
	 */
	public void mouseClicked(MouseEvent e) {

		// Open dialog
		JFileChooser chooser = new JFileChooser();
		int rVal = chooser.showOpenDialog(chooser);
		if (rVal == JFileChooser.APPROVE_OPTION) {
			File file = chooser.getSelectedFile();
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
	private void createComponentIcons() {
		for (int i = 0; i < Designer.buildings.size(); i++) {
			ComponentIcons components = new ComponentIcons();
			components.createIcons(i);
		}
	}
}