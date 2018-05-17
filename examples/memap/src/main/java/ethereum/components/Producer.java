package ethereum.components;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Producer {
	
	private String name;
	private List<ProductionStage> stages;
	private int currentStage;
	
	public Producer(String name) {
		this.name = name;
		stages = new ArrayList<ProductionStage>();
		stages.add(new ProductionStage("off", BigInteger.ZERO, BigInteger.ZERO));
	}
	
	public void addProductionStage(String stageName, BigInteger price, BigInteger amount, boolean allOrNothing) {
		stages.add(new ProductionStage(stageName, price, amount, allOrNothing));
	}
	
	public int getNumberOfStages() {
		return stages.size();
	}

	public String getName() {
		return name;
	}

	public String getCurrentStageName() {
		return stages.get(currentStage).getStageName();
	}

	public void setCurrentStage(int currentStage) {
		this.currentStage = currentStage;
	}
	
	public BigInteger getCurrentPrice() {
		return stages.get(currentStage).getPrice();
	}
	
	public BigInteger getCurrentAmount() {
		return stages.get(currentStage).getAmount();
	}
	
	public BigInteger getNextPrice() {
		return stages.get(currentStage + 1).getPrice();
	}
	
	public BigInteger getNextAmount() {
		return stages.get(currentStage + 1).getAmount();
	}

}
