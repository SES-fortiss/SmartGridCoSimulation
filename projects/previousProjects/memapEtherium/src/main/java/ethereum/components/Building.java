package ethereum.components;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ScheduledExecutorService;

import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.JsonRpc2_0Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.FastRawTransactionManager;
import org.web3j.utils.Async;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import ethereum.Simulation;
import ethereum.contracts.DoubleSidedAuctionMarket;
import ethereum.contracts.DoubleSidedAuctionMarket.LogWithdrawalSuccessfulEventResponse;
import ethereum.contracts.IntegratedEnergyMarket;
import ethereum.helper.ConsumptionProfiles;
import ethereum.helper.Market;
import ethereum.helper.ReadMemapFiles;
import ethereum.helper.UnitHelper;
import ethereum.messages.TimestepInfo;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public abstract class Building extends BehaviorModel {
	
	protected final String name;
	
	Web3j web3j;
	public int rpcport;
	Credentials credentials;
	protected IntegratedEnergyMarket contract;
	
	protected BigInteger soldHeat = BigInteger.ZERO;
	protected BigInteger boughtHeat = BigInteger.ZERO;
	protected BigInteger soldElectricity = BigInteger.ZERO;
	protected BigInteger boughtElectricity = BigInteger.ZERO;	
	
	protected DoubleSidedAuctionMarket heatMarket;
	protected DoubleSidedAuctionMarket electricityMarket;

	protected ConsumptionProfiles consumptionProfiles;
	protected int consumerIndex;
	protected TimestepInfo timestepInfo;
	
	protected BigInteger paidDownPayments = BigInteger.ZERO;	
	protected PrintWriter logger;

	protected BigInteger currentHeatConsumption = BigInteger.ZERO;
	protected BigInteger currentElectricityConsumption = BigInteger.ZERO;
	
	protected int nrOfTransactions = 0;
	protected BigInteger gasUsed = BigInteger.ZERO;
	protected int failedPosts = 0;

	public Building(
			String name,
			int rpcport,
			String privateKey,
			ConsumptionProfiles consumptionProfiles,
			int consumerIndex
	) {
		if(name == null) {
			//TODO throw exception
		}
		this.name = name;
		this.consumptionProfiles = consumptionProfiles;
		this.consumerIndex = consumerIndex;
		timestepInfo = new TimestepInfo(name);
		
		OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
		HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
		logging.setLevel(HttpLoggingInterceptor.Level.NONE);
		builder.addInterceptor(logging);
		HttpService httpService = new HttpService("http://localhost:" + rpcport, builder.build(), false);
		ScheduledExecutorService executorService = Async.defaultExecutorService();
		web3j = Web3j.build(httpService, JsonRpc2_0Web3j.DEFAULT_BLOCK_TIME, executorService);
		credentials = Credentials.create(privateKey);
		FastRawTransactionManager fastRawTxMgr = new FastRawTransactionManager(web3j, credentials);
		contract = IntegratedEnergyMarket.load(
				Simulation.contractAddress, 
				web3j, 
				fastRawTxMgr, 
				BigInteger.ONE, 
				BigInteger.valueOf(Simulation.GAS_LIMIT)
			);
		contract.setGasPrice(BigInteger.ZERO);
		heatMarket = DoubleSidedAuctionMarket.load(
				Simulation.heatMarketAddress, 
				web3j, 
				credentials, 
				BigInteger.ONE, 
				BigInteger.valueOf(Simulation.GAS_LIMIT)
			);
		electricityMarket = DoubleSidedAuctionMarket.load(
				Simulation.electricityMarketAddress, 
				web3j, 
				credentials, 
				BigInteger.ONE, 
				BigInteger.valueOf(Simulation.GAS_LIMIT)
			);
	
		try {
			String dest = "target/logs/" + Simulation.timestamp + "-" + name + ".csv";			
			String location = ReadMemapFiles.class.getProtectionDomain().getCodeSource().getLocation().getPath();
			location = location.replace("%20", " ");
			location = location.substring(0, location.length()-15);
			location = location + dest;
			new File(location);
			FileWriter fr = new FileWriter(location, true);
			logger = new PrintWriter(fr, true);
		} catch (IOException e1) {
				e1.printStackTrace();
		}
		
		logger.print("timestep,heatDemand,electricityDemand,soldHeat,boughtHeat,soldElectricity,boughtElectricity,paidDownPayments,withdrawalAmount");
		
		System.out.println("[" + name + "] Started.");
	}


	@Override
	public void makeDecision() {
		//TODO consider waiting random time up to one minute to achieve different orderings (unnecessary with current logic to check posted demands first)
		timestepInfo = new TimestepInfo(name);
		gasUsed = BigInteger.ZERO;
		failedPosts = 0;
		nrOfTransactions = 0;
		
		try {
			soldHeat = contract.getHeatToProduce().send();
			nrOfTransactions++;
			boughtHeat = contract.getHeatToConsume().send();
			nrOfTransactions++;
			soldElectricity = contract.getElectricityToProduce().send();
			nrOfTransactions++;
			boughtElectricity = contract.getElectricityToConsume().send();
			nrOfTransactions++;
			logger.print(this.actor.getCurrentTimeStep() + "," + currentHeatConsumption + "," + currentElectricityConsumption  + "," + 
					soldHeat+ "," + boughtHeat+ "," + soldElectricity+ "," + boughtElectricity+ "," + paidDownPayments);
			System.out.println("["+ name + "] Withdrawing released payments...");
			TransactionReceipt receipt = contract.withdrawReleasedPayments().send();
			nrOfTransactions++;
			gasUsed = gasUsed.add(receipt.getGasUsed());
			List<LogWithdrawalSuccessfulEventResponse> withdrawalEvents = heatMarket.getLogWithdrawalSuccessfulEvents(receipt);
			for(LogWithdrawalSuccessfulEventResponse withdrawalEvent : withdrawalEvents) {
				timestepInfo.marketBalance = timestepInfo.marketBalance.add(withdrawalEvent.amount);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.print("," + timestepInfo.marketBalance);
		timestepInfo.marketBalance = timestepInfo.marketBalance.subtract(paidDownPayments);
		paidDownPayments = BigInteger.ZERO;
		System.out.println("["+ name + "] Market balance of previous timestep:  "
				+ timestepInfo.marketBalance.doubleValue()/10000000000000000.0 + "ct.");
		System.out.println("["+ name + "] Bought " + UnitHelper.printAmount(boughtElectricity) + " of electricity. ");
		System.out.println("["+ name + "] Bought " + UnitHelper.printAmount(boughtHeat) + " of heat. ");
		System.out.println("["+ name + "] Sold " + UnitHelper.printAmount(soldElectricity) + " of electricity.");	
		System.out.println("["+ name + "] Sold " + UnitHelper.printAmount(soldHeat)+ " of heat.");			
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return timestepInfo;
	}


	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void handleRequest() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public RequestContent returnRequestContentToSend() {
		// TODO Auto-generated method stub
		return null;
	}


	protected BigInteger findUniqueDemandPrice(BigInteger minPrice, Market market) {
		int demandIndex = 0;
		int numDemands = 0;
		try {
			switch (market) {
			case HEAT:
				numDemands = contract.numHeatDemands().send().intValue();
				nrOfTransactions++;
				break;
			case ELECTRICITY:
				numDemands = contract.numElectricityDemands().send().intValue();
				nrOfTransactions++;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BigInteger currentPrice = BigInteger.ZERO;
		BigInteger offerPrice = minPrice;
		while(demandIndex < numDemands && 
				currentPrice.compareTo(offerPrice) <= 0
		) {
			try {
				switch (market) {
				case HEAT:
					currentPrice = heatMarket.demands(BigInteger.valueOf(demandIndex), BigInteger.ZERO).send();
					break;
				case ELECTRICITY:
					currentPrice = electricityMarket.demands(BigInteger.valueOf(demandIndex), BigInteger.ZERO).send();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			demandIndex++;
			if(currentPrice.compareTo(offerPrice) == 0) {
				offerPrice = offerPrice.add(BigInteger.ONE);
			}
		}
		return offerPrice;
//		return BigInteger.ZERO;
	}


	protected BigInteger calculateDownpayment(List<BigInteger> prices, List<BigInteger> amounts) {
		BigInteger toReturn = BigInteger.ZERO;
		for(int i = 0; i < prices.size(); i++) {
			toReturn = toReturn.add(prices.get(i).multiply(amounts.get(i)));
		}
		return toReturn;
	}


	protected boolean isGreaterZero(BigInteger bigInt) {
		return bigInt.compareTo(BigInteger.ZERO) > 0;
	}

	protected void postDemand(List<BigInteger> prices, List<BigInteger> amounts, Market market) {
		TransactionReceipt receipt = null;
		BigInteger downpayment = calculateDownpayment(prices, amounts);
		try {
			System.out.println("[" + name + "] Posting " + (market == Market.HEAT ? "heat" : "electricity") + " demand...");
			switch (market) {
			case HEAT:
				receipt = contract.postHeatDemand(
						prices,
						amounts,
						downpayment
				).send();	
				break;
			case ELECTRICITY:
				receipt = contract.postElectricityDemand(
						prices,
						amounts,
						downpayment
				).send();	
			}
			if(receipt != null) {
				gasUsed = gasUsed.add(receipt.getGasUsed());
				nrOfTransactions++;
				if(receipt.getStatus().equals("0x1")){
					System.out.println("[" + name + "] " + (market == Market.HEAT ? "Heat" : "Electricity") + " demand posted: " + receipt.getTransactionHash());
				} else {
					System.out.println("[" + name + "]  Posting " + (market == Market.HEAT ? "heat" : "electricity") + " demand (" + receipt.getTransactionHash() + " was not successful.");
					failedPosts++;
				}
			}
			paidDownPayments = paidDownPayments.add(downpayment);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}

	protected void postOffer(List<BigInteger> prices, List<BigInteger> amounts, Market market) {
		TransactionReceipt receipt = null;
		try {
			System.out.println("[" + name + "] Posting " + (market == Market.HEAT ? "heat" : "electricity") + " offer...");
			switch (market) {
			case HEAT:
				receipt = contract.postHeatOffer(
						prices,
						amounts
				).send();
				break;
			case ELECTRICITY:
				receipt = contract.postElectricityOffer(
						prices,
						amounts
				).send();	
			}
			if(receipt != null) {
				gasUsed = gasUsed.add(receipt.getGasUsed());
				nrOfTransactions++;
				if(receipt.getStatus().equals("0x1")){
					System.out.println("[" + name + "] " + (market == Market.HEAT ? "Heat" : "Electricity") + " offer posted: " + receipt.getTransactionHash());
				} else {
					System.out.println("[" + name + "] Posting " + (market == Market.HEAT ? "heat" : "electricity") + " offer (" +receipt.getTransactionHash() + " was not successful.");
					failedPosts++;
				}
			}
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}


	protected void logOffer(BigInteger wattSeconds, double centsPerKwh, Market market) {
		System.out.println("[" + name + "] Offering " + UnitHelper.printAmount(wattSeconds) + " of " + (market == Market.ELECTRICITY ? "electricity" : "heat") + " for " + 
				Double.toString(centsPerKwh) + " ct/kWh.");
	}


	protected void logDemand(BigInteger wattSeconds, double centsPerKwh, Market market) {
		System.out.println("[" + name + "] Demanding " + UnitHelper.printAmount(wattSeconds) + " of " + (market == Market.ELECTRICITY ? "electricity" : "heat") + " for max. " + 
				Double.toString(centsPerKwh) + " ct/kWh.");
	}


	protected void postAndLogOfferSplit(BigInteger price, BigInteger amount, Market market) {
		int i = 0;
		logOffer(amount, UnitHelper.getCentsPerKwhFromWeiPerWs(price), market);	
		ArrayList<CompletableFuture<TransactionReceipt>> receiptFutures = new ArrayList<>();
		int nrOfChunks = amount.divide(UnitHelper.FIFTH_KWH).intValue();
		while(i <= nrOfChunks) {
			ArrayList<BigInteger> prices = new ArrayList<>();
			ArrayList<BigInteger> amounts = new ArrayList<>();
			int j = 0;
			while(j < Simulation.MAX_POINTS_PER_POST && i < nrOfChunks) {
				prices.add(price);
				amounts.add(UnitHelper.FIFTH_KWH);
				j++;
				i++;
			}
			if(j < Simulation.MAX_POINTS_PER_POST) {
				prices.add(price);
				amounts.add(amount.mod(UnitHelper.FIFTH_KWH));	
				i++;
			}
					
			System.out.println("[" + name + "] Posting " + (market == Market.HEAT ? "heat" : "electricity") + " offer (" + i + "/" + (nrOfChunks+1) + ")");
			switch (market) {
			case HEAT:
				receiptFutures.add(contract.postHeatOffer(
						prices,
						amounts
				).sendAsync());
				break;
			case ELECTRICITY:
				receiptFutures.add(contract.postElectricityOffer(
						prices,
						amounts
				).sendAsync());	
			}
		}
		
		for(CompletableFuture<TransactionReceipt> receiptFuture : receiptFutures) {
			TransactionReceipt receipt = receiptFuture.join();
			gasUsed = gasUsed.add(receipt.getGasUsed());
			nrOfTransactions++;
			if(receipt.getStatus().equals("0x1")){
				System.out.println("[" + name + "] " + (market == Market.HEAT ? "Heat" : "Electricity") + " offer posted: " + receipt.getTransactionHash());
			} else {
				System.out.println("[" + name + "] Posting " + (market == Market.HEAT ? "heat" : "electricity") + " offer ("+ receipt.getTransactionHash() + ") was not successful.");
				failedPosts++;
			}
		}
	}
}
