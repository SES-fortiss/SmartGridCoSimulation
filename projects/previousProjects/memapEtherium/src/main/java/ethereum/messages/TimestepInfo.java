package ethereum.messages;

import java.math.BigInteger;

import akka.basicMessages.AnswerContent;

public class TimestepInfo implements AnswerContent {

	public String name;
	public BigInteger heatWithdrawal;
	public BigInteger heatFeedIn;
	public BigInteger electricityWithdrawal;
	public BigInteger electricityFeedIn;
	public BigInteger cost;
	public BigInteger marketBalance;
	
	public TimestepInfo(String name) {
		this.name = name;
		heatWithdrawal = BigInteger.ZERO;
		heatFeedIn = BigInteger.ZERO;
		electricityWithdrawal = BigInteger.ZERO;
		electricityFeedIn = BigInteger.ZERO;
		cost = BigInteger.ZERO;
		marketBalance = BigInteger.ZERO;
	}
	
	public void add(TimestepInfo other) {
		heatWithdrawal = heatWithdrawal.add(other.heatWithdrawal);
		heatFeedIn = heatFeedIn.add(other.heatFeedIn);
		electricityWithdrawal = electricityWithdrawal.add(other.electricityWithdrawal);
		electricityFeedIn = electricityFeedIn.add(other.electricityFeedIn);
		cost = cost.add(other.cost);
		marketBalance = marketBalance.add(other.marketBalance);
	}

}
