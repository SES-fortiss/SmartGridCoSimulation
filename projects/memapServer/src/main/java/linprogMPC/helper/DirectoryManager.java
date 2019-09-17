package linprogMPC.helper;

import java.util.ArrayList;
import java.util.TreeMap;
import linprogMPC.messages.OptimizationResultMessage;

public abstract class DirectoryManager {

  /**
   * Add a sub-directory to the directory tree map
   * 
   * @param folderName Name of new sub-directory
   * @param parent Directory where sub-directory should be created
   */
  private static TreeMap<String, Object> addSubDirectory(String folderName,
      TreeMap<String, Object> parent) {

    TreeMap<String, Object> newFolder = new TreeMap<String, Object>();
    parent.put(folderName, newFolder);

    return parent;
  }

  /**
   * Creates a directory hierarchy for simulation results
   * 
   * @param folderName Name of new sub-directory
   * @param parent Directory where sub-directory should be created
   */
  public static void createDirectoryHierarchy(ArrayList<String> nameCategories,
      OptimizationResultMessage optResult) {

    for (int i = 0; i < nameCategories.size(); i++) {

      TreeMap<String, Object> buildingFolder = new TreeMap<String, Object>();
      addSubDirectory("ClientProducer", buildingFolder);
      addSubDirectory("ClientStorageCharge", buildingFolder);
      addSubDirectory("ClientStorageDischarge", buildingFolder);
      addSubDirectory("ClientCoupler", buildingFolder);
      addSubDirectory("ClientVolatileProducer", buildingFolder);
      addSubDirectory("CSVProducer", buildingFolder);
      addSubDirectory("CSVStorageCharge", buildingFolder);
      addSubDirectory("CSVStorageDischarge", buildingFolder);
      addSubDirectory("CSVCoupler", buildingFolder);
      addSubDirectory("CSVVolatileProducer", buildingFolder);

      optResult.buildingResultsMap.put(nameCategories.get(i), buildingFolder);
    }
  }

}
