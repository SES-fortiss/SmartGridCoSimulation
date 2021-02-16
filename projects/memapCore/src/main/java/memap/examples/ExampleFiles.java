package memap.examples;

import java.util.HashMap;

public class ExampleFiles {
	private HashMap<String, String> exampleFiles = new HashMap<String, String>();

	public ExampleFiles() {
		// CONSUMPTIONEXAMPLE0: Zero consumption
		exampleFiles.put("CONSUMPTIONEXAMPLE0", "consumptionExample0.csv");
		exampleFiles.put("CONSUMPTIONEXAMPLE1", "consumptionExample1.csv");
		exampleFiles.put("CONSUMPTIONEXAMPLE2", "consumptionExample2.csv");
		exampleFiles.put("CONSUMPTIONEXAMPLE3", "consumptionExample3.csv");
		exampleFiles.put("CONSUMPTIONEXAMPLE4", "consumptionExample4.csv");
		exampleFiles.put("CONSUMPTIONEXAMPLE5", "consumptionExample5.csv");
		exampleFiles.put("CONSUMPTIONEXAMPLE6", "consumptionExample6.csv");
		exampleFiles.put("FORECASTEXAMPLE", "forecastExample.csv");
		exampleFiles.put("ELECTRICITYPRICEEXAMPLE", "electricityPriceExample.csv");
	}

	public String getFile(String example) {
		return exampleFiles.get(example);
	}

	public boolean isExample(String example) {
		return exampleFiles.containsKey(example);
	}
}