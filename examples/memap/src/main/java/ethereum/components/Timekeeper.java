package ethereum.components;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.JsonRpc2_0Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.utils.Async;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import akka.systemActors.GlobalTime;
import behavior.BehaviorModel;
import ethereum.Simulation;
import ethereum.contracts.DoubleSidedAuctionMarket;
import ethereum.contracts.DoubleSidedAuctionMarket.LogOfferConfirmedEventResponse;
import ethereum.contracts.IntegratedEnergyMarket;
import ethereum.helper.SolarRadiation;
import ethereum.helper.UnitHelper;
import ethereum.messages.TimestepInfo;
import meritorder.helper.ReadMemapFiles;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public class Timekeeper extends BehaviorModel {
	
	private Web3j web3j;
	public int rpcport;
	private Credentials credentials;
	private IntegratedEnergyMarket contract;
	private DoubleSidedAuctionMarket heatMarket;
	private DoubleSidedAuctionMarket electricityMarket;
	private HashMap<String, TimestepInfo> aggregatedBuildingInfos = new HashMap<>();
	private PrintWriter logger;
	
	public Timekeeper(int rpcport) {
		this.rpcport = rpcport;
		OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
		HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
		logging.setLevel(HttpLoggingInterceptor.Level.NONE);
		builder.addInterceptor(logging);
		HttpService httpService = new HttpService("http://localhost:" + rpcport, builder.build(), false);
		ScheduledExecutorService executorService = Async.defaultExecutorService();
		web3j = Web3j.build(httpService, JsonRpc2_0Web3j.DEFAULT_BLOCK_TIME, executorService);
		credentials = Credentials.create("0xc87509a1c067bbde78beb793e6fa76530b6382a4c0241e5e4a9ec0a0f44dc0d3");
		contract = IntegratedEnergyMarket.load(Simulation.contractAddress, web3j, credentials, BigInteger.ONE, BigInteger.valueOf(8000000));
		heatMarket = DoubleSidedAuctionMarket.load(Simulation.heatMarketAddress, web3j, credentials, BigInteger.ONE, BigInteger.valueOf(8000000));
		electricityMarket = DoubleSidedAuctionMarket.load(Simulation.electricityMarketAddress, web3j, credentials, BigInteger.ONE, BigInteger.valueOf(8000000));
	
		try {
			String dest = "target/logs/" + Simulation.timestamp + "-Timekeeper.csv";			
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
		try {
			logger.print("startBlock," + web3j.ethBlockNumber().send().getBlockNumber());
			logger.println();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.print("timestep,startTime,irridiation,numHeatDemands,numHeatOffers,numElectricityDemands,numElectricityOffers,"
				+ "clearingStartTime,clearingEndTime,clearingSuccessful,gasUsed,numOffersConfirmed,endTime,blockNumber");
		logger.println();
		logger.print("0," + System.currentTimeMillis() + ",");
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
	public void makeDecision() {
		logger.print(SolarRadiation.getRadiation(GlobalTime.currentTimeStep) + ",");
		for(BasicAnswer answer : answerListReceived) {
			TimestepInfo newInfo = (TimestepInfo) answer.answerContent;
			String name = newInfo.name;
			TimestepInfo aggregatedInfo = aggregatedBuildingInfos.get(name);
			if(aggregatedInfo == null) {
				aggregatedInfo = new TimestepInfo(name);
			}
			aggregatedInfo.add(newInfo);
			aggregatedBuildingInfos.put(aggregatedInfo.name, aggregatedInfo);
		}
		
		BigInteger numHeatDemands = BigInteger.ZERO;
		BigInteger numHeatOffers = BigInteger.ZERO;
		BigInteger numElectricityDemands = BigInteger.ZERO;
		BigInteger numElectricityOffers = BigInteger.ZERO;
		try {
			numHeatDemands = contract.numHeatDemands().send();
			numHeatOffers = contract.numHeatOffers().send();
			numElectricityDemands = contract.numElectricityDemands().send();
			numElectricityOffers = contract.numElectricityOffers().send();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		logger.print(numHeatDemands + "," + numHeatOffers + "," + numElectricityDemands + "," + numElectricityOffers + ",");

		System.out.println("[Timekeeper] " + numHeatDemands.toString() + " heat demands recorded.");
		System.out.println("[Timekeeper] " + numHeatOffers.toString() + " heat offers recorded.");
		System.out.println("[Timekeeper] " + numElectricityDemands.toString() + " electricity demands recorded.");
		System.out.println("[Timekeeper] " + numElectricityOffers.toString() + " electricity offers recorded.");
		System.out.println("[Timekeeper] Clearing markets...");

		List<LogOfferConfirmedEventResponse> confirmedHeatOffers = null;
		List<LogOfferConfirmedEventResponse> confirmedElectricityOffers = null;
		
		try {
			logger.print(System.currentTimeMillis() + ",");
			TransactionReceipt receipt = contract.nextTimestep().send();
			logger.print(System.currentTimeMillis() + ",");
			System.out.println("[Timekeeper] Transaction address: " + receipt.getTransactionHash());
			confirmedHeatOffers = heatMarket.getLogOfferConfirmedEvents(receipt);
			confirmedElectricityOffers = electricityMarket.getLogOfferConfirmedEvents(receipt);
			if(receipt.getStatus().equals("0x1")) {
				System.out.println("Market clearing successful.");
				logger.print("yes,");
			} else {
				System.out.println("Market clearing NOT successful.");	
				logger.print("no,");			
			}
			logger.print(receipt.getGasUsed() + ",");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(LogOfferConfirmedEventResponse confirmedHeatOffer : confirmedHeatOffers) {
			System.out.println("[Timekeeper] Offer confirmed: " + confirmedHeatOffer.producer + " sold " + 
					UnitHelper.printAmount(confirmedHeatOffer.amount) + " of heat for " + 
					UnitHelper.printCents(confirmedHeatOffer.price) + "/kWh."
					);
		}
		for(LogOfferConfirmedEventResponse confirmedElectricityOffer : confirmedElectricityOffers) {
			System.out.println("[Timekeeper] Offer confirmed: " + confirmedElectricityOffer.producer + " sold " + 
					UnitHelper.printAmount(confirmedElectricityOffer.amount) + " of electricity for " + 
					UnitHelper.printCents(confirmedElectricityOffer.price) + "/kWh."
					);
		}
		logger.print(confirmedHeatOffers.size() + "," + System.currentTimeMillis() + ",");
		try {
			logger.print(web3j.ethBlockNumber().send().getBlockNumber() + "");
		} catch (IOException e) {
			logger.print("ERROR");
		}
		logger.println();
		logger.print((GlobalTime.currentTimeStep + 1) + "," + System.currentTimeMillis() + ",");
	}
	
	@Override
	public AnswerContent returnAnswerContentToSend() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		// TODO Auto-generated method stub
		return null;
	}

}
