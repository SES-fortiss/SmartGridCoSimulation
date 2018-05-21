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
	
//	private BigInteger gasboilerPower = BigInteger.valueOf(40000); //W
//	private BigInteger gasboilerPrice;
	
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
		chpHeatProduction = BigInteger.valueOf(80000).multiply(Simulation.TIMESTEP_DURATION_IN_SECONDS);
		chpElectricityProduction = BigInteger.valueOf(20000).multiply(Simulation.TIMESTEP_DURATION_IN_SECONDS);
		chpHeatCost = UnitHelper.getEtherPerWsFromCents(5.2/0.6);
		chpElectricityCost = UnitHelper.getEtherPerWsFromCents(5.2/0.25);
		logger.print(",chpCost,chpHeatProduction,chpElectricityProduction,fromThermalStorage,toThermalStorage,stateOfCharge,excessHeat,lackingHeat,excessElectricity,electricityLack");
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
			timestepInfo.cost = timestepInfo.cost.add(chpHeatCost.multiply(chpHeatProduction));
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
				GlobalTime.currentTimeStep + 1
		);
		
		BigInteger nextElectricityConsumption = consumptionProfiles.getElectricityConsumption(
				consumerIndex,
				GlobalTime.currentTimeStep + 1
		);

		System.out.println("[" + name + "] Expected heat consumption for next step: " + UnitHelper.printAmount(nextHeatConsumption));
		System.out.println("[" + name + "] Expected electricity consumption for next step: " + UnitHelper.printAmount(nextElectricityConsumption));


		BigInteger heatDemandPrice = findUniqueDemandPrice(chpHeatCost, Market.HEAT);
		logDemand(nextHeatConsumption, UnitHelper.getCentsPerKwhFromEtherPerWs(heatDemandPrice), Market.HEAT);
		postDemand(Arrays.asList(heatDemandPrice), Arrays.asList(nextHeatConsumption), Market.HEAT);
		logOffer(chpHeatProduction, UnitHelper.getCentsPerKwhFromEtherPerWs(heatDemandPrice), Market.HEAT);
		postOffer(Arrays.asList(heatDemandPrice), Arrays.asList(chpHeatProduction), Market.HEAT);

		ArrayList<BigInteger> electricityDemandPrices = new ArrayList<BigInteger>();
		ArrayList<BigInteger> electricityDemandAmounts = new ArrayList<BigInteger>();
		electricityToProduce = nextElectricityConsumption.min(chpElectricityProduction);
		BigInteger chpUniquePrice = findUniqueDemandPrice(chpElectricityCost, Market.ELECTRICITY);
		if(isGreaterZero(electricityToProduce)) {
			electricityDemandPrices.add(chpUniquePrice);
			electricityDemandAmounts.add(electricityToProduce);
			logDemand(electricityToProduce, UnitHelper.getCentsPerKwhFromEtherPerWs(chpUniquePrice), Market.ELECTRICITY);
			electricityToProduce = nextElectricityConsumption.subtract(chpElectricityProduction);
			if(isGreaterZero(electricityToProduce)) {
				electricityDemandPrices.add(UnitHelper.getEtherPerWsFromCents(Simulation.ELECTRICITY_MAX_PRICE));
				electricityDemandAmounts.add(electricityToProduce);
				logDemand(electricityToProduce, Simulation.ELECTRICITY_MAX_PRICE, Market.ELECTRICITY);
			}
			postDemand(electricityDemandPrices, electricityDemandAmounts, Market.ELECTRICITY);	
		}

		logOffer(chpElectricityProduction, UnitHelper.getCentsPerKwhFromEtherPerWs(chpUniquePrice), Market.ELECTRICITY);
		postOffer(Arrays.asList(chpUniquePrice), Arrays.asList(chpElectricityProduction), Market.ELECTRICITY);	

		currentElectricityConsumption = nextElectricityConsumption;
		currentHeatConsumption = nextHeatConsumption;
		logger.println();
	}

}
