package linprogMPC.examples;

import java.util.HashMap;

public class ExampleFiles {
	private HashMap<String, String> exampleFiles = new HashMap<String, String>();
	
	public ExampleFiles(){
		exampleFiles.put("EXAMPLE1", "consumptionExample1.csv");
		exampleFiles.put("EXAMPLE2", "consumptionExample2.csv");
		exampleFiles.put("EXAMPLE3", "consumptionExample3.csv");
		exampleFiles.put("EXAMPLE4", "consumptionExample4.csv");
		exampleFiles.put("EXAMPLE5", "consumptionExample5.csv");
	}
	
	public String getFile(String example){
		return exampleFiles.get(example);
	}
	public boolean isExample(String example) {
		return exampleFiles.containsKey(example);
	}
}