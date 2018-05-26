package ethereum.components;

import java.math.BigInteger;

import akka.systemActors.GlobalTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.web3j.protocol.core.methods.response.TransactionReceipt;

import ethereum.Simulation;
import ethereum.helper.ConsumptionProfiles;
import ethereum.helper.Market;
import ethereum.helper.SolarRadiation;
import ethereum.helper.UnitHelper;

public class Building4 extends Building {
	
	private final double QdotCHP = 80000.0;
		
	private BigInteger stateOfCharge = BigInteger.ZERO;
	private BigInteger maxInOut; //Ws
	private BigInteger capacity; //Ws
	private double storageEfficiency = 1.;
	private BigInteger chpHeatProduction;
	private BigInteger chpElectricityProduction;
	private BigInteger chpHeatCost;
	private BigInteger chpElectricityCost;
	
	public Building4(
			String name,
			int rpcport,
			String privateKey,
			ConsumptionProfiles consumptionProfiles,
			int consumerIndex
	) {
		super(name, rpcport, privateKey, consumptionProfiles, consumerIndex);
		maxInOut = BigInteger.valueOf((long) (5000 * storageEfficiency))
				.multiply(Simulation.TIMESTEP_DURATION_IN_SECONDS);
//		gasboilerPrice = UnitConverter.getCentsPerWsFromCents(5.2);
		capacity = UnitHelper.getWSfromKWH(100);
		chpHeatProduction = BigInteger.valueOf((long) (QdotCHP*.6)).multiply(Simulation.TIMESTEP_DURATION_IN_SECONDS);
		chpElectricityProduction = BigInteger.valueOf((long) (QdotCHP*.25)).multiply(Simulation.TIMESTEP_DURATION_IN_SECONDS);
		chpHeatCost = UnitHelper.getEtherPerWsFromCents(Simulation.GAS_PRICE*.70);
		chpElectricityCost = UnitHelper.getEtherPerWsFromCents(Simulation.GAS_PRICE*.30);
		logger.print(",chpCost,chpHeatProduction,chpElectricityProduction,"
				+ "fromThermalStorage,toThermalStorage,stateOfCharge,"
				+ "excessHeat,lackingHeat,excessElectricity,electricityLack,gasUsed,failedPosts");
		logger.println();
	}

	@Override
	public void makeDecision() {
		super.makeDecision();
		
		BigInteger heatToProduce = currentHeatConsumption.add(soldHeat).subtract(boughtHeat);
		BigInteger fromStorage = heatToProduce.min(stateOfCharge).min(maxInOut);
		if(isGreaterZero(fromStorage)) {
			heatToProduce = heatToProduce.subtract(fromStorage);
			stateOfCharge = stateOfCharge.subtract(fromStorage);
			System.out.println("[" + name + "] Drawing " + fromStorage
					+ " from thermal storage, leaving state of charge at " + stateOfCharge + ".");
		}
		BigInteger excessHeat = BigInteger.ZERO;

		BigInteger electricityToProduce = currentElectricityConsumption.add(soldElectricity).subtract(boughtElectricity);	
		BigInteger excessElectricity = BigInteger.ZERO;

		boolean isChpOn = false;
		if(isGreaterZero(heatToProduce) || isGreaterZero(electricityToProduce)) {
			isChpOn = true;
			System.out.println("[" + name + "] CHP: On. Producing " + UnitHelper.printAmount(chpHeatProduction) + " of heat"
					+ " and " + UnitHelper.printAmount(chpElectricityProduction) + " of electricity.");
			heatToProduce = heatToProduce.subtract(chpHeatProduction).max(BigInteger.ZERO);
			excessHeat = chpHeatProduction.subtract(heatToProduce).max(BigInteger.ZERO);
			electricityToProduce = electricityToProduce.subtract(chpElectricityProduction).max(BigInteger.ZERO);
			excessElectricity = chpElectricityProduction.subtract(electricityToProduce).max(BigInteger.ZERO);
			timestepInfo.cost = timestepInfo.cost.add(BigInteger.valueOf((long) (Simulation.GAS_PRICE*QdotCHP)));
		} else {
			System.out.println("[" + name + "] CHP: Off.");
		}
		logger.print("," + timestepInfo.cost);
		logger.print("," + (isChpOn ? chpHeatProduction : 0));
		logger.print("," + (isChpOn ? chpElectricityProduction : 0));
		logger.print("," + fromStorage);
		BigInteger toStorage = capacity.subtract(stateOfCharge).min(maxInOut).min(excessHeat);
		if(isGreaterZero(toStorage)) {
			stateOfCharge = stateOfCharge.add(toStorage);
			excessHeat = excessHeat.subtract(toStorage);
			System.out.println("[" + name + "] Feeding " + UnitHelper.printAmount(toStorage)
					+ "  into thermal storage, leaving state of charge at " + UnitHelper.printAmount(stateOfCharge) + ".");
		}
		logger.print("," + toStorage);
		logger.print("," + stateOfCharge);

		if(isGreaterZero(excessHeat)) {
			System.out.println("[" + name + "] Excess heat: " + UnitHelper.printAmount(excessHeat));
			timestepInfo.heatFeedIn = excessHeat;
		}
		logger.print("," + excessHeat);
		
		if(isGreaterZero(heatToProduce)) {
			System.out.println("[" + name + "] Lacking heat : " + UnitHelper.printAmount(heatToProduce));
			timestepInfo.heatWithdrawal = heatToProduce;
		}
		logger.print("," + heatToProduce);

		if(isGreaterZero(excessElectricity)) {
			System.out.println("[" + name + "] Excess electricity: " + UnitHelper.printAmount(excessElectricity));
			timestepInfo.electricityFeedIn = excessElectricity;
		}
		logger.print("," + excessElectricity);
		if(isGreaterZero(electricityToProduce)) {
			System.out.println("[" + name + "] Lacking electricity : " + UnitHelper.printAmount(electricityToProduce));
			timestepInfo.electricityWithdrawal = electricityToProduce;
		}
		logger.print("," + electricityToProduce);
		
		BigInteger nextHeatConsumption = consumptionProfiles.getHeatConsumption(
				consumerIndex,
				GlobalTime.currentTimeStep
		);
		
		BigInteger nextElectricityConsumption = consumptionProfiles.getElectricityConsumption(
				consumerIndex,
				GlobalTime.currentTimeStep
		);

		System.out.println("[" + name + "] Expected heat consumption for next step: " + UnitHelper.printAmount(nextHeatConsumption));
		System.out.println("[" + name + "] Expected electricity consumption for next step: " + UnitHelper.printAmount(nextElectricityConsumption));


		BigInteger heatDemandPrice = findUniqueDemandPrice(chpHeatCost, Market.HEAT);
		logDemand(nextHeatConsumption, UnitHelper.getCentsPerKwhFromWeiPerWs(heatDemandPrice), Market.HEAT);
		postDemand(Arrays.asList(heatDemandPrice), Arrays.asList(nextHeatConsumption), Market.HEAT);

		ArrayList<BigInteger> heatOfferPrices = new ArrayList<>();
		ArrayList<BigInteger> heatOfferAmounts = new ArrayList<>();
		int i = 0;
		logOffer(chpHeatProduction, UnitHelper.getCentsPerKwhFromWeiPerWs(heatDemandPrice), Market.HEAT);	
		while(i <= chpHeatProduction.divide(UnitHelper.QUARTER_KWH).intValue()) {
			int j = 0;
			while(j < Simulation.MAX_POINTS_PER_POST && i < chpHeatProduction.divide(UnitHelper.QUARTER_KWH).intValue()) {
				heatOfferPrices.add(heatDemandPrice);
				heatOfferAmounts.add(UnitHelper.QUARTER_KWH);
				j++;
				i++;
			}
			if(j < Simulation.MAX_POINTS_PER_POST) {
				heatOfferPrices.add(heatDemandPrice);
				heatOfferAmounts.add(chpHeatProduction.mod(UnitHelper.QUARTER_KWH));	
				i++;
			}	
			postOffer(heatOfferPrices, heatOfferAmounts, Market.HEAT);
			heatOfferPrices = new ArrayList<>();
			heatOfferAmounts = new ArrayList<>();
		}

		ArrayList<BigInteger> electricityDemandPrices = new ArrayList<BigInteger>();
		ArrayList<BigInteger> electricityDemandAmounts = new ArrayList<BigInteger>();
		electricityToProduce = nextElectricityConsumption.min(chpElectricityProduction);
		BigInteger chpUniquePrice = findUniqueDemandPrice(chpElectricityCost, Market.ELECTRICITY);
		if(isGreaterZero(electricityToProduce)) {
			electricityDemandPrices.add(chpUniquePrice);
			electricityDemandAmounts.add(electricityToProduce);
			logDemand(electricityToProduce, UnitHelper.getCentsPerKwhFromWeiPerWs(chpUniquePrice), Market.ELECTRICITY);
			electricityToProduce = nextElectricityConsumption.subtract(chpElectricityProduction);
			if(isGreaterZero(electricityToProduce)) {
				electricityDemandPrices.add(UnitHelper.getEtherPerWsFromCents(Simulation.ELECTRICITY_MAX_PRICE));
				electricityDemandAmounts.add(electricityToProduce);
				logDemand(electricityToProduce, Simulation.ELECTRICITY_MAX_PRICE, Market.ELECTRICITY);
			}
			postDemand(electricityDemandPrices, electricityDemandAmounts, Market.ELECTRICITY);	
		}


		ArrayList<BigInteger> electricityOfferPrices = new ArrayList<BigInteger>();
		ArrayList<BigInteger> electricityOfferAmounts = new ArrayList<BigInteger>();		
		i = 0;
		logOffer(chpElectricityProduction, UnitHelper.getCentsPerKwhFromWeiPerWs(chpUniquePrice), Market.ELECTRICITY);	
		while(i <= chpElectricityProduction.divide(UnitHelper.QUARTER_KWH).intValue()) {
			int j = 0;
			while(j < Simulation.MAX_POINTS_PER_POST && i < chpElectricityProduction.divide(UnitHelper.QUARTER_KWH).intValue()) {
				electricityOfferPrices.add(chpUniquePrice);
				electricityOfferAmounts.add(UnitHelper.QUARTER_KWH);
				j++;
				i++;
			}
			if(j < Simulation.MAX_POINTS_PER_POST) {
				electricityOfferPrices.add(chpUniquePrice);
				electricityOfferAmounts.add(chpElectricityProduction.mod(UnitHelper.QUARTER_KWH));	
				i++;
			}	
			postOffer(electricityOfferPrices, electricityOfferAmounts, Market.ELECTRICITY);
			electricityOfferPrices = new ArrayList<>();
			electricityOfferAmounts = new ArrayList<>();
		}

		currentElectricityConsumption = nextElectricityConsumption;
		currentHeatConsumption = nextHeatConsumption;
		logger.print("," + gasUsed + "," + failedPosts);
		logger.println();
	}

}
