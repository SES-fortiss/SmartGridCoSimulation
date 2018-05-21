package ethereum.components;

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

import com.google.gson.Gson;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import ethereum.Simulation;
import ethereum.contracts.DoubleSidedAuctionMarket;
import ethereum.contracts.IntegratedEnergyMarket;
import ethereum.contracts.DoubleSidedAuctionMarket.LogOfferConfirmedEventResponse;
import ethereum.helper.UnitHelper;
import ethereum.messages.TimestepInfo;
import memap.external.M2MDisplay;
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

		System.out.println("[Timekeeper] " + numHeatDemands.toString() + " heat demands recorded.");
		System.out.println("[Timekeeper] " + numHeatOffers.toString() + " heat offers recorded.");
		System.out.println("[Timekeeper] " + numElectricityDemands.toString() + " electricity demands recorded.");
		System.out.println("[Timekeeper] " + numElectricityOffers.toString() + " electricity offers recorded.");
		System.out.println("[Timekeeper] Clearing markets...");
		
		//TODO log state of the system before starting next step

		List<LogOfferConfirmedEventResponse> confirmedHeatOffers = null;
		List<LogOfferConfirmedEventResponse> confirmedElectricityOffers = null;
		
		try {
			TransactionReceipt receipt = contract.nextTimestep().send();
			System.out.println("[Timekeeper] Transaction address: " + receipt.getTransactionHash());
			confirmedHeatOffers = heatMarket.getLogOfferConfirmedEvents(receipt);
			confirmedElectricityOffers = electricityMarket.getLogOfferConfirmedEvents(receipt);
			
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
