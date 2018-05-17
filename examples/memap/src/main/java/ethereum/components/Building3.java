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

public class Building3 extends Building {
	
//	private BigInteger gasboilerPower = BigInteger.valueOf(40000); //W
//	private BigInteger gasboilerPrice;
	
	private BigInteger currentElectricityConsumption = BigInteger.ZERO;
	private BigInteger currentHeatConsumption = BigInteger.ZERO;
	private BigInteger currentPVProduction = BigInteger.ZERO;
	private double pvEfficiency = .2;
	private double pvArea = 8.;
	private BigInteger stateOfCharge = BigInteger.ZERO;
	private BigInteger maxInOut; //Ws
	private BigInteger capacity; //Ws
	private double storageEfficiency = 1.;
	private BigInteger gasboilerPower = BigInteger.valueOf(20000);
	private BigInteger gasboilerPrice = UnitHelper.getCentsPerWsFromCents(5.2);
	
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
		capacity = UnitHelper.getWSfromKWH(40);
	}

	@Override
	public void makeDecision() {
		super.makeDecision();

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
		
		BigInteger electricityToProduce = currentElectricityConsumption.add(soldElectricity).subtract(boughtElectricity);		
		
		BigInteger excessElectricity = BigInteger.ZERO.max(
				currentPVProduction.
				subtract(electricityToProduce)
			);
		electricityToProduce = electricityToProduce.subtract(currentPVProduction).max(BigInteger.ZERO);
		if(isGreaterZero(electricityToProduce)) {
			BigInteger fromStorage = stateOfCharge.min(maxInOut).min(electricityToProduce);
			stateOfCharge = stateOfCharge.subtract(fromStorage);
			electricityToProduce = electricityToProduce.subtract(fromStorage);	
			System.out.println("[" + name + "] Drawing " + UnitHelper.printAmount(fromStorage) +" from battery,"
					+ " leaving state of charge at" + UnitHelper.printAmount(stateOfCharge) + ".");			
		}
		if(isGreaterZero(excessElectricity)) {
			BigInteger toStorage = excessElectricity.min(maxInOut);
			stateOfCharge = stateOfCharge.add(toStorage);
			excessElectricity = excessElectricity.subtract(toStorage);
			System.out.println("[" + name + "] Charging " + UnitHelper.printAmount(toStorage) + " into battery,"
					+ " leaving state of charge at" + stateOfCharge + "Ws.");
		}
		System.out.println("[" + name + "] Gasboiler: " + gasboilerStatus + 
				(gasboilerStatus.equals("on") ? ", producing " + UnitHelper.printAmount(gasboilerProduction) : ""  + "." ));		

		if(isGreaterZero(excessHeat)) {
			System.out.println("[" + name + "] Excess heat: " + UnitHelper.printAmount(excessHeat));
			timestepInfo.heatFeedIn = excessHeat;
		}
		if(isGreaterZero(heatToProduce)) {
			System.out.println("[" + name + "] Lacking heat : " + UnitHelper.printAmount(heatToProduce));
			timestepInfo.heatWithdrawal = heatToProduce;
		}

		if(isGreaterZero(excessElectricity)) {
			System.out.println("[" + name + "] Excess electricity: " + UnitHelper.printAmount(excessElectricity));
			timestepInfo.electricityFeedIn = excessElectricity;
		}
		if(isGreaterZero(electricityToProduce)) {
			System.out.println("[" + name + "] Lacking electricity : " + UnitHelper.printAmount(electricityToProduce));
			timestepInfo.electricityWithdrawal = electricityToProduce;
		}
		
		BigInteger nextHeatConsumption = consumptionProfiles.getHeatConsumption(
				consumerIndex,
				GlobalTime.currentTimeStep + 1
		);
		
		BigInteger nextPVProduction = 
				BigInteger.valueOf(
						(long) (SolarRadiation.getRadiation(GlobalTime.currentTimeStep + 1)
								* pvArea
								* pvEfficiency)
					);
		
		BigInteger nextElectricityConsumption = consumptionProfiles.getElectricityConsumption(
				consumerIndex,
				GlobalTime.currentTimeStep + 1
		);
		
		System.out.println("[" + name + "] Expected heat consumption for next step: " + UnitHelper.printAmount(nextHeatConsumption));
		System.out.println("[" + name + "] Expected electricity consumption for next step: " + UnitHelper.printAmount(nextElectricityConsumption));
		System.out.println("[" + name + "] Expected PV production for next step: " + UnitHelper.printAmount(nextPVProduction));

		BigInteger heatDemandPrice = findUniqueDemandPrice(gasboilerPrice, Market.HEAT);
		logDemand(nextHeatConsumption, UnitHelper.getCentsFromCentUnits(heatDemandPrice), Market.HEAT);
		postDemand(Arrays.asList(heatDemandPrice), Arrays.asList(nextHeatConsumption), Market.HEAT);
		logOffer(gasboilerProduction, UnitHelper.getCentsFromCentUnits(heatDemandPrice), Market.HEAT);
		postOffer(Arrays.asList(heatDemandPrice), Arrays.asList(gasboilerProduction), Market.HEAT);

		ArrayList<BigInteger> electricityOfferPrices = new ArrayList<BigInteger>();
		ArrayList<BigInteger> electricityOfferAmounts = new ArrayList<BigInteger>();
		ArrayList<BigInteger> electricityDemandPrices = new ArrayList<BigInteger>();
		ArrayList<BigInteger> electricityDemandAmounts = new ArrayList<BigInteger>();
		BigInteger ownProduction = stateOfCharge.min(maxInOut).min(electricityToProduce).add(nextPVProduction);
		BigInteger maxCharge = capacity.subtract(stateOfCharge).min(maxInOut);
		electricityToProduce = nextElectricityConsumption.subtract(ownProduction).max(BigInteger.ZERO);
		excessElectricity = ownProduction.subtract(nextElectricityConsumption).max(BigInteger.ZERO);
		if(isGreaterZero(maxCharge)) {
			electricityDemandPrices.add(UnitHelper.getCentsPerWsFromCents(Simulation.ELECTRICITY_MIN_PRICE));
			electricityDemandAmounts.add(maxCharge);
			logDemand(maxCharge, Simulation.ELECTRICITY_MIN_PRICE, Market.ELECTRICITY);
		}
		if(isGreaterZero(electricityToProduce)) {
			electricityDemandPrices.add(UnitHelper.getCentsPerWsFromCents(Simulation.ELECTRICITY_MAX_PRICE));
			electricityDemandAmounts.add(electricityToProduce);
			logDemand(electricityToProduce, Simulation.ELECTRICITY_MAX_PRICE, Market.ELECTRICITY);
		}
		if(!electricityDemandPrices.isEmpty()) {	
			postDemand(electricityDemandPrices, electricityDemandAmounts, Market.ELECTRICITY);
		}
		if(isGreaterZero(excessElectricity)) {
			for(int i = 0; i < excessElectricity.intValue() / 1000000; i++) {
				electricityOfferPrices.add(UnitHelper.getCentsPerWsFromCents(Simulation.ELECTRICITY_MIN_PRICE));
				electricityOfferAmounts.add(BigInteger.valueOf(1000000));
			}
			electricityOfferPrices.add(UnitHelper.getCentsPerWsFromCents(Simulation.ELECTRICITY_MIN_PRICE));
			electricityOfferAmounts.add(excessElectricity.mod(BigInteger.valueOf(1000000)));
			logOffer(excessElectricity, Simulation.ELECTRICITY_MIN_PRICE, Market.ELECTRICITY);		
			postOffer(electricityOfferPrices, electricityOfferAmounts, Market.ELECTRICITY);
		}

		currentElectricityConsumption = nextElectricityConsumption;
		currentHeatConsumption = nextHeatConsumption;
		currentPVProduction = nextPVProduction;
	}

}
