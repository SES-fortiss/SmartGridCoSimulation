package ethereum.components;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

import akka.systemActors.GlobalTime;
import ethereum.Simulation;
import ethereum.helper.ConsumptionProfiles;
import ethereum.helper.Market;
import ethereum.helper.UnitHelper;

public class Building4 extends Building {

	private final double QdotCHP = 80000.0;	
	private final double electricEfficiency = .25;
	private final double thermalEfficiency = .6;
	private final double storageEfficiency = 1.;
	private final int stages = 4;
		
	private BigInteger stateOfCharge = BigInteger.ZERO;
	private BigInteger maxInOut; //Ws
	private BigInteger capacity = UnitHelper.getWSfromKWH(100); //Ws
	private BigInteger chpHeatProductionPerStage;
	private BigInteger chpElectricityProductionPerStage;
	private BigInteger chpCostPerStage;
	
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
		chpHeatProductionPerStage = BigInteger.valueOf((long) (QdotCHP*thermalEfficiency)).multiply(Simulation.TIMESTEP_DURATION_IN_SECONDS).divide(BigInteger.valueOf(stages));
		chpElectricityProductionPerStage = BigInteger.valueOf((long) (QdotCHP*electricEfficiency)).multiply(Simulation.TIMESTEP_DURATION_IN_SECONDS).divide(BigInteger.valueOf(stages));
		chpCostPerStage = BigInteger.valueOf((long) QdotCHP).multiply(Simulation.TIMESTEP_DURATION_IN_SECONDS)
				.multiply(UnitHelper.getEtherPerWsFromCents(Simulation.GAS_PRICE)).divide(BigInteger.valueOf(stages));
		logger.print(",chpCost,chpHeatProduction,chpElectricityProduction,"
				+ "fromThermalStorage,toThermalStorage,stateOfCharge,"
				+ "excessHeat,lackingHeat,excessElectricity,electricityLack,gasUsed,failedPosts,nrOfTransactions");
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
		
		int chpStage = 0;
		BigInteger chpActualCost = BigInteger.ZERO;
		
		while(chpStage < stages) {		
			boolean isNextStageEconomic = isGreaterZero(heatToProduce);
			BigInteger chpSavings = electricityToProduce.multiply(UnitHelper.getEtherPerWsFromCents(Simulation.ELECTRICITY_MAX_PRICE));
			if(chpSavings.compareTo(chpCostPerStage) >= 0) {
				isNextStageEconomic = true;
			}			
			if(isNextStageEconomic) {
				chpStage++;
				excessHeat = chpHeatProductionPerStage.subtract(heatToProduce).max(BigInteger.ZERO);
				heatToProduce = heatToProduce.subtract(chpHeatProductionPerStage).max(BigInteger.ZERO);
				excessElectricity = chpElectricityProductionPerStage.subtract(electricityToProduce).max(BigInteger.ZERO);
				electricityToProduce = electricityToProduce.subtract(chpElectricityProductionPerStage).max(BigInteger.ZERO);
				chpActualCost = chpActualCost.add(chpCostPerStage);
			}
			else {
				break;
			}
		}
		System.out.println("[" + name + "] CHP: " + (chpStage == 0 ? "off" : "Stage " + chpStage) + 
				(chpStage > 0 ? ", producing " + UnitHelper.printAmount(chpHeatProductionPerStage.multiply(BigInteger.valueOf(chpStage))) + " of heat"
						+ " and " + UnitHelper.printAmount(chpElectricityProductionPerStage.multiply(BigInteger.valueOf(chpStage))) + " of electricity." : "." ));
		logger.print("," + chpActualCost.toString());
		logger.print("," + chpHeatProductionPerStage.multiply(BigInteger.valueOf(chpStage)).toString());
		logger.print("," + chpElectricityProductionPerStage.multiply(BigInteger.valueOf(chpStage)).toString());
		logger.print("," + fromStorage);
		BigInteger toStorage = capacity.subtract(stateOfCharge).min(maxInOut.add(fromStorage)).min(excessHeat);
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

		ArrayList<BigInteger> electricityDemandPrices = new ArrayList<BigInteger>();
		ArrayList<BigInteger> electricityDemandAmounts = new ArrayList<BigInteger>();
		ArrayList<BigInteger> electricityOfferPrices = new ArrayList<BigInteger>();
		ArrayList<BigInteger> electricityOfferAmounts = new ArrayList<BigInteger>();
		electricityToProduce = nextElectricityConsumption.min(chpElectricityProductionPerStage.multiply(BigInteger.valueOf(stages)));
		BigInteger uniqueElectricityMinPrice = findUniqueDemandPrice(
				UnitHelper.getEtherPerWsFromCents(Simulation.ELECTRICITY_MIN_PRICE),
				Market.ELECTRICITY)				;
		if(isGreaterZero(electricityToProduce)) {
			electricityDemandPrices.add(uniqueElectricityMinPrice);
			electricityDemandAmounts.add(electricityToProduce);
			logDemand(electricityToProduce, UnitHelper.getCentsPerKwhFromWeiPerWs(uniqueElectricityMinPrice), Market.ELECTRICITY);
			electricityToProduce = nextElectricityConsumption.subtract(chpElectricityProductionPerStage.multiply(BigInteger.valueOf(stages)));
			if(isGreaterZero(electricityToProduce)) {
				electricityDemandPrices.add(UnitHelper.getEtherPerWsFromCents(Simulation.ELECTRICITY_MAX_PRICE));
				electricityDemandAmounts.add(electricityToProduce);
				logDemand(electricityToProduce, Simulation.ELECTRICITY_MAX_PRICE, Market.ELECTRICITY);
			}
			postDemand(electricityDemandPrices, electricityDemandAmounts, Market.ELECTRICITY);	
		}
		
		for(int i = 0; i < stages-1; i++) {
			logOffer(chpElectricityProductionPerStage, UnitHelper.getCentsPerKwhFromWeiPerWs(uniqueElectricityMinPrice), Market.ELECTRICITY);
			electricityOfferPrices.add(uniqueElectricityMinPrice);
			electricityOfferAmounts.add(chpElectricityProductionPerStage);			
		}
		postOffer(electricityOfferPrices, electricityOfferAmounts, Market.ELECTRICITY);
		
		postAndLogOfferSplit(uniqueElectricityMinPrice, chpElectricityProductionPerStage, Market.ELECTRICITY);
		
		BigInteger chpHeatPrice = chpCostPerStage.subtract(
				chpElectricityProductionPerStage.multiply(UnitHelper.getEtherPerWsFromCents(Simulation.ELECTRICITY_MIN_PRICE)))
				.divide(chpHeatProductionPerStage);
		BigInteger uniqueHeatPrice = findUniqueDemandPrice(chpHeatPrice, Market.HEAT);
		fromStorage = stateOfCharge.min(maxInOut);
		BigInteger lackingHeat = nextHeatConsumption.subtract(fromStorage).max(BigInteger.ZERO);
		
		if(isGreaterZero(lackingHeat)) {
			logDemand(lackingHeat, UnitHelper.getCentsPerKwhFromWeiPerWs(uniqueHeatPrice), Market.HEAT);
			postDemand(
					Arrays.asList(uniqueHeatPrice),
					Arrays.asList(lackingHeat),
					Market.HEAT
				);
		}
		ArrayList<BigInteger> heatOfferPrices = new ArrayList<BigInteger>();
		ArrayList<BigInteger> heatOfferAmounts = new ArrayList<BigInteger>();
		
		for(int i = 0; i < stages-1; i++) {
			logOffer(chpHeatProductionPerStage, UnitHelper.getCentsPerKwhFromWeiPerWs(uniqueHeatPrice), Market.HEAT);
			heatOfferPrices.add(uniqueHeatPrice);
			heatOfferAmounts.add(chpHeatProductionPerStage);			
		}
		postOffer(heatOfferPrices, heatOfferAmounts, Market.HEAT);

		BigInteger heatOfferAmount = chpHeatProductionPerStage;
		postAndLogOfferSplit(uniqueHeatPrice, heatOfferAmount, Market.HEAT);
		
		currentElectricityConsumption = nextElectricityConsumption;
		currentHeatConsumption = nextHeatConsumption;
		logger.print("," + gasUsed + "," + failedPosts + "," + nrOfTransactions);
		logger.println();
	}

}
