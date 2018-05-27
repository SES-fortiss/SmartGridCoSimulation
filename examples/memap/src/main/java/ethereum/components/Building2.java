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

public class Building2 extends Building {
	
//	private BigInteger gasboilerPower = BigInteger.valueOf(40000); //W
//	private BigInteger gasboilerPrice;
	
	private BigInteger currentPVProduction = BigInteger.ZERO;
	private double pvEfficiency = .2;
	private double pvArea = 8.;
	private BigInteger stateOfCharge = BigInteger.ZERO;
	private BigInteger maxInOut; //Ws
	private BigInteger capacity; //Ws
	private double storageEfficiency = 1.;
	private BigInteger gasboilerPower = BigInteger.valueOf(20000);
	private BigInteger gasboilerPrice = UnitHelper.getEtherPerWsFromCents(Simulation.GAS_PRICE);
	
	public Building2(
			String name,
			int rpcport,
			String privateKey,
			ConsumptionProfiles consumptionProfiles,
			int consumerIndex
	) {
		super(name, rpcport, privateKey, consumptionProfiles, consumerIndex);
		maxInOut = BigInteger.valueOf((long) (5000 * storageEfficiency))
				.multiply(Simulation.TIMESTEP_DURATION_IN_SECONDS);
		capacity = UnitHelper.getWSfromKWH(40);
		logger.print(",pv,gasboilerCost,gasboilerProduction,fromBattery,toBattery,stateOfCharge,"
				+ "excessHeat,lackingHeat,excessElectricity,electricityLack,gasUsed,failedPosts");
		logger.println();
	}

	@Override
	public void makeDecision() {
		super.makeDecision();
		logger.print("," + currentPVProduction);

		String gasboilerStatus = "off";
		BigInteger gasboilerProduction = Simulation.TIMESTEP_DURATION_IN_SECONDS.multiply(gasboilerPower);
		
		BigInteger heatToProduce = currentHeatConsumption.add(soldHeat);
		heatToProduce = heatToProduce.subtract(boughtHeat); //never demand more heat than consumption+soldHeat --> always positive or zero
		BigInteger excessHeat = BigInteger.ZERO;
		
		if(isGreaterZero(heatToProduce)) {
			gasboilerStatus = "on";
			excessHeat = gasboilerProduction.subtract(heatToProduce).max(BigInteger.ZERO);
			heatToProduce = heatToProduce.subtract(gasboilerProduction).max(BigInteger.ZERO);
			timestepInfo.cost = timestepInfo.cost.add(gasboilerProduction.multiply(gasboilerPrice));
		}
		System.out.println("[" + name + "] Gasboiler: " + gasboilerStatus + 
				(gasboilerStatus.equals("on") ? ", producing " + UnitHelper.printAmount(gasboilerProduction) : ""  + "." ));
		logger.print("," + timestepInfo.cost);
		logger.print("," + (gasboilerStatus == "off" ? 0 : gasboilerProduction));
		
		BigInteger electricityToProduce = currentElectricityConsumption.add(soldElectricity).subtract(boughtElectricity);		
		
		BigInteger excessElectricity = BigInteger.ZERO.max(
				currentPVProduction.
				subtract(electricityToProduce)
			);
		electricityToProduce = electricityToProduce.subtract(currentPVProduction).max(BigInteger.ZERO);
		BigInteger fromStorage = BigInteger.ZERO;
		if(isGreaterZero(electricityToProduce)) {
			fromStorage = stateOfCharge.min(maxInOut).min(electricityToProduce);
			stateOfCharge = stateOfCharge.subtract(fromStorage);
			electricityToProduce = electricityToProduce.subtract(fromStorage);	
			System.out.println("[" + name + "] Drawing " + UnitHelper.printAmount(fromStorage) +" from battery,"
					+ " leaving state of charge at" + UnitHelper.printAmount(stateOfCharge) + ".");			
		}
		logger.print("," + fromStorage);
		
		BigInteger toStorage = BigInteger.ZERO;
		if(isGreaterZero(excessElectricity)) {
			toStorage = excessElectricity.min(maxInOut.add(fromStorage));
			stateOfCharge = stateOfCharge.add(toStorage);
			excessElectricity = excessElectricity.subtract(toStorage);
			System.out.println("[" + name + "] Charging " + UnitHelper.printAmount(toStorage) + " into battery,"
					+ " leaving state of charge at" + stateOfCharge + "Ws.");
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

		BigInteger heatDemandPrice = findUniqueDemandPrice(gasboilerPrice, Market.HEAT);
		logDemand(nextHeatConsumption, UnitHelper.getCentsPerKwhFromWeiPerWs(heatDemandPrice), Market.HEAT);
		postDemand(Arrays.asList(heatDemandPrice), Arrays.asList(nextHeatConsumption), Market.HEAT);
		logOffer(gasboilerProduction, UnitHelper.getCentsPerKwhFromWeiPerWs(heatDemandPrice), Market.HEAT);
		postOffer(Arrays.asList(heatDemandPrice), Arrays.asList(gasboilerProduction), Market.HEAT);

		ArrayList<BigInteger> electricityOfferPrices = new ArrayList<BigInteger>();
		ArrayList<BigInteger> electricityOfferAmounts = new ArrayList<BigInteger>();
		ArrayList<BigInteger> electricityDemandPrices = new ArrayList<BigInteger>();
		ArrayList<BigInteger> electricityDemandAmounts = new ArrayList<BigInteger>();
		BigInteger ownProduction = stateOfCharge.min(maxInOut).min(electricityToProduce).add(nextPVProduction);
		BigInteger maxCharge = capacity.subtract(stateOfCharge).min(maxInOut);
		electricityToProduce = nextElectricityConsumption.subtract(ownProduction).max(BigInteger.ZERO);
		excessElectricity = ownProduction.subtract(nextElectricityConsumption).max(BigInteger.ZERO);
		BigInteger uniqueMinPrice = findUniqueDemandPrice(UnitHelper.getEtherPerWsFromCents(Simulation.ELECTRICITY_MIN_PRICE), Market.HEAT);
		if(isGreaterZero(maxCharge)) {
			electricityDemandPrices.add(uniqueMinPrice);
			electricityDemandAmounts.add(maxCharge);
			logDemand(maxCharge, Simulation.ELECTRICITY_MIN_PRICE, Market.ELECTRICITY);
		}
		if(isGreaterZero(electricityToProduce)) {
			electricityDemandPrices.add(UnitHelper.getEtherPerWsFromCents(Simulation.ELECTRICITY_MAX_PRICE));
			electricityDemandAmounts.add(electricityToProduce);
			logDemand(electricityToProduce, Simulation.ELECTRICITY_MAX_PRICE, Market.ELECTRICITY);
		}
		if(!electricityDemandPrices.isEmpty()) {	
			postDemand(electricityDemandPrices, electricityDemandAmounts, Market.ELECTRICITY);
		}
		
		if(isGreaterZero(excessElectricity)) {
			int i = 0;
			logOffer(excessElectricity, Simulation.ELECTRICITY_MIN_PRICE, Market.ELECTRICITY);	
			while(i <= excessElectricity.divide(UnitHelper.QUARTER_KWH).intValue()) {
				int j = 0;
				while(j < 5 && i < excessElectricity.divide(UnitHelper.QUARTER_KWH).intValue()) {
					electricityOfferPrices.add(uniqueMinPrice);
					electricityOfferAmounts.add(UnitHelper.QUARTER_KWH);
					j++;
					i++;
				}
				if(j < 5) {
					electricityOfferPrices.add(uniqueMinPrice);
					electricityOfferAmounts.add(excessElectricity.mod(UnitHelper.QUARTER_KWH));	
					i++;
				}	
				postOffer(electricityOfferPrices, electricityOfferAmounts, Market.ELECTRICITY);
				electricityOfferPrices = new ArrayList<>();
				electricityOfferAmounts = new ArrayList<>();				
			}
		}

		currentElectricityConsumption = nextElectricityConsumption;
		currentHeatConsumption = nextHeatConsumption;
		currentPVProduction = nextPVProduction;
		logger.print("," + gasUsed + "," + failedPosts);
		logger.println();
	}

}
