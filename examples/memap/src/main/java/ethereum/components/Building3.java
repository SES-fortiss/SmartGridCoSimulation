package ethereum.components;

import java.math.BigInteger;
import java.util.ArrayList;

import akka.systemActors.GlobalTime;
import ethereum.Simulation;
import ethereum.helper.ConsumptionProfiles;
import ethereum.helper.Market;
import ethereum.helper.SolarRadiation;
import ethereum.helper.UnitHelper;

public class Building3 extends Building {
	
	private BigInteger currentPVProduction = BigInteger.ZERO;
	private double pvArea = 8.;
	private BigInteger stateOfCharge = BigInteger.ZERO;
	private BigInteger maxInOut; //Ws
	private BigInteger capacity; //Ws
	private double storageEfficiency = 1.;
	private BigInteger heatPumpPower = BigInteger.valueOf(20000);
	
	public Building3(
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
		logger.print(",pv,heatPumpConsumption,heatPumpProduction,"
				+ "fromThermalStorage,toThermalStorage,stateOfCharge,"
				+ "lackingHeat,excessElectricity,electricityLack,gasUsed,failedPosts");
		logger.println();
	}

	@Override
	public void makeDecision() {
		super.makeDecision();
		logger.print("," + currentPVProduction);

		BigInteger heatPumpMaxProduction = Simulation.TIMESTEP_DURATION_IN_SECONDS.multiply(heatPumpPower);
		
		BigInteger heatToProduce = currentHeatConsumption.add(soldHeat);
		heatToProduce = heatToProduce.subtract(boughtHeat); //never demand more heat than consumption+soldHeat --> always positive or zero
		BigInteger fromStorage = heatToProduce.min(stateOfCharge).min(maxInOut);
		heatToProduce = heatToProduce.subtract(fromStorage);
		stateOfCharge = stateOfCharge.subtract(fromStorage);
		
		BigInteger electricityToProduce = currentElectricityConsumption.add(soldElectricity).subtract(boughtElectricity);

		BigInteger heatProduction = heatPumpMaxProduction.min(heatToProduce);
		BigInteger electricityForHeatPump = BigInteger.ZERO;
		
		if(isGreaterZero(heatToProduce)) {
			electricityForHeatPump = electricityForHeatPump.add(heatToElectricity(heatProduction));
			electricityToProduce = electricityToProduce.add(electricityForHeatPump); // add electricity needed to produce necessary heating power
			heatToProduce = heatToProduce.subtract(heatProduction);
		}
		
		BigInteger excessElectricity = BigInteger.ZERO.max(currentPVProduction.subtract(electricityToProduce));
		electricityToProduce = electricityToProduce.subtract(currentPVProduction).max(BigInteger.ZERO);
		BigInteger maxHeatPumpProduction = electricityToHeat(excessElectricity).min(heatPumpMaxProduction.subtract(heatProduction));
		BigInteger maxCharge = capacity.subtract(stateOfCharge).min(maxInOut.add(fromStorage));
		BigInteger toStorage = maxCharge.min(maxHeatPumpProduction);
		heatProduction = heatProduction.add(toStorage);
		if(isGreaterZero(toStorage)) {
			stateOfCharge = stateOfCharge.add(toStorage);
			electricityForHeatPump = electricityForHeatPump.add(heatToElectricity(toStorage));
			excessElectricity = excessElectricity.subtract(
					electricityForHeatPump);
		}	
		logger.print("," + electricityForHeatPump);
		logger.print("," + heatProduction);
		logger.print("," + fromStorage);
		logger.print("," + toStorage);
		logger.print("," + stateOfCharge);
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
		
		BigInteger nextPVProduction = 
				BigInteger.valueOf(
						(long) (SolarRadiation.getRadiation(GlobalTime.currentTimeStep)
								* pvArea*1000000000) //kW * 1000000000
					).multiply(BigInteger.valueOf(1000)) //W * 1000000000
				.multiply(Simulation.TIMESTEP_DURATION_IN_SECONDS).divide(BigInteger.valueOf(1000000000)); //Ws
		
		BigInteger nextElectricityConsumption = consumptionProfiles.getElectricityConsumption(
				consumerIndex,
				GlobalTime.currentTimeStep
		);
		
		System.out.println("[" + name + "] Expected heat consumption for next step: " + UnitHelper.printAmount(nextHeatConsumption));
		System.out.println("[" + name + "] Expected electricity consumption for next step: " + UnitHelper.printAmount(nextElectricityConsumption));
		System.out.println("[" + name + "] Expected PV production for next step: " + UnitHelper.printAmount(nextPVProduction));

		ArrayList<BigInteger> heatDemandPrices = new ArrayList<BigInteger>();
		ArrayList<BigInteger> heatDemandAmounts = new ArrayList<BigInteger>();
		BigInteger heatNeeded = nextHeatConsumption.subtract((stateOfCharge).min(maxInOut));
		heatDemandAmounts.add(maxCharge);
		heatDemandAmounts.add(heatNeeded.subtract(maxCharge));
		BigInteger heatPrice1 = findUniqueDemandPrice(electricityToHeat(UnitHelper.getEtherPerWsFromCents(Simulation.ELECTRICITY_MIN_PRICE)), Market.HEAT);
		BigInteger heatPrice2 = findUniqueDemandPrice(electricityToHeat(UnitHelper.getEtherPerWsFromCents(Simulation.ELECTRICITY_MAX_PRICE)), Market.HEAT);
		heatDemandPrices.add(heatPrice1);
		heatDemandPrices.add(heatPrice2);
		logDemand(maxCharge, UnitHelper.getCentsPerKwhFromWeiPerWs(heatPrice1), Market.HEAT);
		logDemand(heatNeeded.subtract(maxCharge), UnitHelper.getCentsPerKwhFromWeiPerWs(heatPrice2), Market.HEAT);
		postDemand(heatDemandPrices, heatDemandAmounts, Market.HEAT);

		BigInteger heatToOffer = stateOfCharge.min(maxInOut).add(heatPumpMaxProduction);
		
		if(isGreaterZero(heatToOffer)) {
			logOffer(heatToOffer, UnitHelper.getCentsPerKwhFromWeiPerWs(heatPrice2), Market.HEAT);
			postOfferSplit(heatPrice2, heatToOffer, Market.HEAT);
		}

		ArrayList<BigInteger> electricityDemandPrices = new ArrayList<BigInteger>();
		ArrayList<BigInteger> electricityDemandAmounts = new ArrayList<BigInteger>();
		electricityToProduce = nextElectricityConsumption.subtract(nextPVProduction).max(BigInteger.ZERO);
		excessElectricity = nextPVProduction.subtract(nextElectricityConsumption).max(BigInteger.ZERO);
		if(isGreaterZero(electricityToProduce)) {
			electricityDemandPrices.add(UnitHelper.getEtherPerWsFromCents(Simulation.ELECTRICITY_MAX_PRICE));
			electricityDemandAmounts.add(electricityToProduce);
			logDemand(electricityToProduce, Simulation.ELECTRICITY_MAX_PRICE, Market.ELECTRICITY);
			postDemand(electricityDemandPrices, electricityDemandAmounts, Market.ELECTRICITY);
		}
		
		if(isGreaterZero(excessElectricity)) {
			logOffer(excessElectricity, Simulation.ELECTRICITY_MIN_PRICE, Market.ELECTRICITY);	
			postOfferSplit(UnitHelper.getEtherPerWsFromCents(Simulation.ELECTRICITY_MIN_PRICE), excessElectricity, Market.ELECTRICITY);
		}

		currentElectricityConsumption = nextElectricityConsumption;
		currentHeatConsumption = nextHeatConsumption;
		currentPVProduction = nextPVProduction;
		logger.print("," + gasUsed + "," + failedPosts);
		logger.println();
	}

	private BigInteger electricityToHeat(BigInteger centsPerWs) {
		return centsPerWs.multiply(BigInteger.TEN).divide(BigInteger.valueOf(38));
	}

	private BigInteger heatToElectricity(BigInteger centsPerWs) {
		return centsPerWs.multiply(BigInteger.valueOf(38)).divide(BigInteger.TEN);
	}

}
