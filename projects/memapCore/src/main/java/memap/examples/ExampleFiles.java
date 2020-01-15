package memap.examples;

import java.util.HashMap;

public class ExampleFiles {
	private HashMap<String, String> exampleFiles = new HashMap<String, String>();

	public ExampleFiles() {
		// EXAMPLE0: Zero consumption
		exampleFiles.put("EXAMPLE0", "consumptionExample0.csv");
		exampleFiles.put("EXAMPLE1", "consumptionExample1.csv");
		exampleFiles.put("EXAMPLE2", "consumptionExample2.csv");
		exampleFiles.put("EXAMPLE3", "consumptionExample3.csv");
		exampleFiles.put("EXAMPLE4", "consumptionExample4.csv");
		exampleFiles.put("EXAMPLE5", "consumptionExample5.csv");
		/*
		 * Production of a 15kWp solar installation
		 * (source:https://my.discovergy.com/export?)
		 */
		exampleFiles.put("SOLARPRODUCTIONEXAMPLE", "Discovergy_PVAnlage15kWp.csv");
		exampleFiles.put("ELECTRICITYPRICEEXAMPLE", "Strompreise_7Tage_simple.csv");
	}

	public String getFile(String example) {
		return exampleFiles.get(example);
	}

	public boolean isExample(String example) {
		return exampleFiles.containsKey(example);
	}
}