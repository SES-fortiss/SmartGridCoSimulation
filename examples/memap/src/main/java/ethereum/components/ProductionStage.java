package ethereum.components;

import java.math.BigInteger;
import java.util.ArrayList;

import org.web3j.tuples.generated.Tuple2;

public class ProductionStage {

	private String stageName;
	private BigInteger price;
	private BigInteger amount;
	private boolean allOrNothing;
	
	public ProductionStage(String stageName, BigInteger price, BigInteger amount, boolean allOrNothing) {
		this.stageName = stageName;
		this.price = price;
		this.amount = amount;
		this.allOrNothing = allOrNothing;
	}
	
	public ProductionStage(String stageName, BigInteger price, BigInteger amount) {
		this.stageName = stageName;
		this.price = price;
		this.amount = amount;
		this.allOrNothing = true;
	}

	public String getStageName() {
		return stageName;
	}

	public BigInteger getPrice() {
		return price;
	}

	public BigInteger getAmount() {
		return amount;
	}

	public boolean isAllOrNothing() {
		return allOrNothing;
	}
	
	public BigInteger getMinCost() {
		if(isAllOrNothing()) {
			return price.multiply(amount);
		}
		return price;
	}
	
}
