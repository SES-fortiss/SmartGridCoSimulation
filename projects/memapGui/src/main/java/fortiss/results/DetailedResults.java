package fortiss.results;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Map.Entry;

import fortiss.components.Building;
import fortiss.datastructures.Data;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.FileManager;
import fortiss.simulation.Parameters;
import memap.helper.DirectoryConfiguration;

public class DetailedResults extends ResultsLibrary {

	private static final String typeQualifier = "_Solutions.csv";
	
	/**
	 * Constructor for the class DetailedResults.
	 */
	public DetailedResults() {
		super(typeQualifier);
	}

	@Override
	public void load() {
		FileManager fm = new FileManager();
		Parameters pars = DesignerPanel.parameterPanel.pars;
		String location = System.getProperty("user.dir");
		String fs = File.separator;
		String source = fs + DirectoryConfiguration.mainDir + fs + "results" + fs + pars.getSimulationName() + fs
				+ "MPC" + pars.getMPCHorizon() + "_" + pars.getOptimizer().toUpperCase() + fs;

		String qualifier = "_MPC" + pars.getMPCHorizon() + "_" + pars.getOptimizer().toUpperCase() + typeQualifier;

		// Read global optimization results
		String filename = pars.getSimulationName() + qualifier;
		filename = location + source + filename;

		try {
			resultsLibrary.put("Global optimization", new Data(fm.readFromSource(filename), true, Data.BYCOLUMN));
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}

		// Read building optimization results
		for (Entry<String, Building> entry : DesignerPanel.buildings.entrySet()) {
			Building building = (Building) entry.getValue();
			filename = building.getName() + qualifier;
			filename = location + source + filename;
			try {
				resultsLibrary.put(building.getName(), new Data(fm.readFromSource(filename), true, Data.BYCOLUMN));
			} catch (IOException | ParseException e) {
				e.printStackTrace();
			}
		}
	}
}
