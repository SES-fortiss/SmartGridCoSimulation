package linprogMPC.helper;

import java.util.ArrayList;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import linprogMPC.messages.BuildingMessage;
import linprogMPC.messages.OptimizationResultMessage;

@SuppressWarnings("unchecked")
public class DirectoryManager {

	/** A optimization result message */
	private OptimizationResultMessage optimizationResultMessage;
	/** A list of building messages */
	private ArrayList<BuildingMessage> buildingMessageList;

	public DirectoryManager(OptimizationResultMessage optimizationResultMessage,
			ArrayList<BuildingMessage> buildingMessageList) {
		this.optimizationResultMessage = optimizationResultMessage;
		this.buildingMessageList = buildingMessageList;
	}

	/**
	 * adds a general result to {@link OptimizationResultMessage#buildingResultsMap}
	 * 
	 * @param buildingName building name
	 * @param name         result name
	 * @param result       a double array results
	 */
	public void addBuildingResult(String buildingName, String name, double[] result) {
		Map<String, Object> root = optimizationResultMessage.buildingResultsMap;
		if (root.get(buildingName) instanceof TreeMap<?, ?>) {
			TreeMap<String, Object> parent = (TreeMap<String, Object>) root.get(buildingName);
			parent.put(name, result);
		}
	}

	/**
	 * adds a general result to {@link OptimizationResultMessage#generalResultsMap}
	 * 
	 * @param name   result name
	 * @param result a double array results
	 */
	public void addGeneralResult(String name, double[] result) {
		SortedMap<String, double[]> root = optimizationResultMessage.generalResultsMap;
		root.put(name, result);
	}

	/**
	 * Creates a directory hierarchy for simulation results
	 */
	public void createDirectoryHierarchy() {
		Map<String, Object> root = optimizationResultMessage.buildingResultsMap;
		for (BuildingMessage buildingMessage : buildingMessageList) {
			root.put(buildingMessage.name, new TreeMap<String, Object>());
		}
	}

}
