package ethereum.components;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

import akka.systemActors.GlobalTime;
import ethereum.Simulation;
import ethereum.helper.ConsumptionProfiles;
import ethereum.helper.Market;
import ethereum.helper.SolarRadiation;
import ethereum.helper.UnitHelper;

public class Building5 extends Building {
	
	private final double QdotCHP = 80000.0;
	
	private BigInteger stateOfCharge = BigInteger.ZERO;
	private BigInteger currentSTProduction = BigInteger.ZERO;
	private double stEfficiency = .5;
	private double stArea = 6.;
	private BigInteger maxInOut; //Ws
	private BigInteger capacity; //Ws
	private double storageEfficiency = 1.;
	private BigInteger chpHeatProduction;
	private BigInteger chpElectricityProduction;
	private BigInteger chpCost;
	
	public Building5(
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
		chpCost = BigInteger.valueOf((long) QdotCHP).multiply(Simulation.TIMESTEP_DURATION_IN_SECONDS)
				.multiply(UnitHelper.getEtherPerWsFromCents(Simulation.GAS_PRICE));
		logger.print(",solarThermal,chpCost,chpHeatProduction,chpElectricityProduction,"
				+ "fromThermalStorage,toThermalStorage,stateOfCharge,"
				+ "excessHeat,lackingHeat,excessElectricity,electricityLack,gasUsed,failedPosts");
		logger.println();
	}

	@Override
	public void makeDecision() {
		super.makeDecision();
		logger.print("," + currentSTProduction);
		
		BigInteger heatToProduce = currentHeatConsumption.add(soldHeat).subtract(boughtHeat);
		BigInteger excessHeat = currentSTProduction.subtract(heatToProduce).max(BigInteger.ZERO);
		if(isGreaterZero(excessHeat)) {
			BigInteger toStorage = excessHeat.min(capacity.subtract(stateOfCharge)).min(maxInOut);
			stateOfCharge = stateOfCharge.add(toStorage); //multiply with efficiency if not 1
			excessHeat = excessHeat.subtract(toStorage);
			System.out.println("[" + name + "] Feeding " + UnitHelper.printAmount(toStorage)
			+ "  into thermal storage, leaving state of charge at " + UnitHelper.printAmount(stateOfCharge) + ".");
		}
		heatToProduce = heatToProduce.subtract(currentSTProduction).max(BigInteger.ZERO);
		BigInteger fromStorage = heatToProduce.min(stateOfCharge).min(maxInOut);
		if(isGreaterZero(fromStorage)) {
			heatToProduce = heatToProduce.subtract(fromStorage);
			stateOfCharge = stateOfCharge.subtract(fromStorage); //multiply with efficiency if not 1
			System.out.println("[" + name + "] Drawing " + fromStorage
					+ "  from thermal storage, leaving state of charge at " + stateOfCharge + ".");
		}

		BigInteger electricityToProduce = currentElectricityConsumption.add(soldElectricity).subtract(boughtElectricity);	
		BigInteger excessElectricity = BigInteger.ZERO;
		boolean isChpOn = false;
		if(isGreaterZero(heatToProduce) || isGreaterZero(electricityToProduce)) {
			isChpOn = true;
			System.out.println("[" + name + "] CHP: On. Producing " + UnitHelper.printAmount(chpHeatProduction) + " of heat"
					+ " and " + UnitHelper.printAmount(chpElectricityProduction) + " of electricity.");
			excessHeat = chpHeatProduction.subtract(heatToProduce).max(BigInteger.ZERO);
			heatToProduce = heatToProduce.subtract(chpHeatProduction).max(BigInteger.ZERO);
			excessElectricity = chpElectricityProduction.subtract(electricityToProduce).max(BigInteger.ZERO);
			electricityToProduce = electricityToProduce.subtract(chpElectricityProduction).max(BigInteger.ZERO);
			timestepInfo.cost = timestepInfo.cost.add(BigInteger.valueOf((long) (Simulation.GAS_PRICE*QdotCHP)));			
		} else {
			System.out.println("[" + name + "] CHP: Off.");
		}
		logger.print("," + (isChpOn ? chpCost : 0));
		logger.print("," + (isChpOn ? chpHeatProduction : 0));
		logger.print("," + (isChpOn ? chpElectricityProduction : 0));
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
		
		BigInteger nextSTProduction = 
				BigInteger.valueOf(
						(long) (SolarRadiation.getRadiation(GlobalTime.currentTimeStep)
								* stArea*1000000000) //kW * 1000000000
					).multiply(BigInteger.valueOf(1000)) //W * 1000000000
				.multiply(Simulation.TIMESTEP_DURATION_IN_SECONDS).divide(BigInteger.valueOf(1000000000)); //Ws
		System.out.println("[" + name + "] Expected heat consumption for next step: " + UnitHelper.printAmount(nextHeatConsumption));
		System.out.println("[" + name + "] Expected electricity consumption for next step: " + UnitHelper.printAmount(nextElectricityConsumption));
		System.out.println("[" + name + "] Expected solar thermal production for next step: " + UnitHelper.printAmount(nextSTProduction));

		ArrayList<BigInteger> electricityDemandPrices = new ArrayList<BigInteger>();
		ArrayList<BigInteger> electricityDemandAmounts = new ArrayList<BigInteger>();
		electricityToProduce = nextElectricityConsumption.min(chpElectricityProduction);
		BigInteger uniqueELectricityMinPrice = findUniqueDemandPrice(
				UnitHelper.getEtherPerWsFromCents(Simulation.ELECTRICITY_MIN_PRICE),
				Market.ELECTRICITY)				;
		if(isGreaterZero(electricityToProduce)) {
			electricityDemandPrices.add(uniqueELectricityMinPrice);
			electricityDemandAmounts.add(electricityToProduce);
			logDemand(electricityToProduce, UnitHelper.getCentsPerKwhFromWeiPerWs(uniqueELectricityMinPrice), Market.ELECTRICITY);
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
		int i = 0;
		logOffer(chpElectricityProduction, UnitHelper.getCentsPerKwhFromWeiPerWs(uniqueELectricityMinPrice), Market.ELECTRICITY);	
		while(i <= chpElectricityProduction.divide(UnitHelper.QUARTER_KWH).intValue()) {
			int j = 0;
			while(j < Simulation.MAX_POINTS_PER_POST && i < chpElectricityProduction.divide(UnitHelper.QUARTER_KWH).intValue()) {
				electricityOfferPrices.add(uniqueELectricityMinPrice);
				electricityOfferAmounts.add(UnitHelper.QUARTER_KWH);
				j++;
				i++;
			}
			if(j < Simulation.MAX_POINTS_PER_POST) {
				electricityOfferPrices.add(uniqueELectricityMinPrice);
				electricityOfferAmounts.add(chpElectricityProduction.mod(UnitHelper.QUARTER_KWH));	
				i++;
			}	
			postOffer(electricityOfferPrices, electricityOfferAmounts, Market.ELECTRICITY);
			electricityOfferPrices = new ArrayList<>();
			electricityOfferAmounts = new ArrayList<>();
		}
		
		BigInteger chpHeatPrice = chpCost.subtract(
				chpElectricityProduction.multiply(UnitHelper.getEtherPerWsFromCents(Simulation.ELECTRICITY_MIN_PRICE)))
				.divide(chpHeatProduction);
		BigInteger heatDemandPrice = findUniqueDemandPrice(chpHeatPrice, Market.HEAT);
		fromStorage = stateOfCharge.min(maxInOut);
		BigInteger lackingHeat = nextHeatConsumption.subtract(nextSTProduction).subtract(fromStorage).max(BigInteger.ZERO);
		
		if(isGreaterZero(lackingHeat)) {
			logDemand(lackingHeat, UnitHelper.getCentsPerKwhFromWeiPerWs(heatDemandPrice), Market.HEAT);
			postDemand(
					Arrays.asList(heatDemandPrice),
					Arrays.asList(lackingHeat),
					Market.HEAT
				);
		}
		BigInteger heatOfferAmount = chpHeatProduction.add(fromStorage);

		ArrayList<BigInteger> heatOfferPrices = new ArrayList<>();
		ArrayList<BigInteger> heatOfferAmounts = new ArrayList<>();
		i = 0;
		logOffer(heatOfferAmount, UnitHelper.getCentsPerKwhFromWeiPerWs(heatDemandPrice), Market.HEAT);	
		while(i <= heatOfferAmount.divide(UnitHelper.QUARTER_KWH).intValue()) {
			int j = 0;
			while(j < Simulation.MAX_POINTS_PER_POST && i < heatOfferAmount.divide(UnitHelper.QUARTER_KWH).intValue()) {
				heatOfferPrices.add(heatDemandPrice);
				heatOfferAmounts.add(UnitHelper.QUARTER_KWH);
				j++;
				i++;
			}
			if(j < Simulation.MAX_POINTS_PER_POST) {
				heatOfferPrices.add(heatDemandPrice);
				heatOfferAmounts.add(heatOfferAmount.mod(UnitHelper.QUARTER_KWH));	
				i++;
			}	
			postOffer(heatOfferPrices, heatOfferAmounts, Market.HEAT);
			heatOfferPrices = new ArrayList<>();
			heatOfferAmounts = new ArrayList<>();
		}


		currentElectricityConsumption = nextElectricityConsumption;
		currentHeatConsumption = nextHeatConsumption;
		currentSTProduction = nextSTProduction;
		logger.print("," + gasUsed + "," + failedPosts);
		logger.println();
	}

}
