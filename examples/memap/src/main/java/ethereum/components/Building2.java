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
	
	private BigInteger currentPVProduction = BigInteger.ZERO;
	private double pvArea = 40.;
	private double pvEfficiency = 0.2;
	private BigInteger stateOfCharge = BigInteger.ZERO;
	private BigInteger maxInOut; //Ws
	private BigInteger capacity; //Ws
	private double storageEfficiency = 1.;
	private BigInteger gasboilerPower = BigInteger.valueOf(80000);
	private BigInteger gasboilerPrice = UnitHelper.getEtherPerWsFromCents(Simulation.GAS_PRICE);
	private final int stages = 2;
	
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
				+ "excessHeat,lackingHeat,excessElectricity,electricityLack,gasUsed,failedPosts,nrOfTransactions");
		logger.println();
	}

	@Override
	public void makeDecision() {
		super.makeDecision();
		logger.print("," + currentPVProduction);

		int gasboilerStage = 0;
		BigInteger gasboilerProductionPerStage = Simulation.TIMESTEP_DURATION_IN_SECONDS.multiply(gasboilerPower).divide(BigInteger.valueOf(stages));
		BigInteger gasBoilerCost = BigInteger.ZERO;
		
		BigInteger heatToProduce = currentHeatConsumption.add(soldHeat);
		heatToProduce = heatToProduce.subtract(boughtHeat); //never demand more heat than consumption+soldHeat --> always positive or zero
		BigInteger excessHeat = BigInteger.ZERO;
		
		while(gasboilerStage < stages) {
			if(isGreaterZero(heatToProduce)) {
				gasboilerStage++;
				excessHeat = gasboilerProductionPerStage.subtract(heatToProduce).max(BigInteger.ZERO);
				heatToProduce = heatToProduce.subtract(gasboilerProductionPerStage).max(BigInteger.ZERO);
				gasBoilerCost = gasBoilerCost.add(gasboilerProductionPerStage.multiply(gasboilerPrice));
			}	
			else {
				break;
			}
		}
		System.out.println("[" + name + "] Gasboiler: " + (gasboilerStage == 0 ? "off" : "Stage " + gasboilerStage) + 
				(gasboilerStage > 0 ? ", producing " + UnitHelper.printAmount(gasboilerProductionPerStage.multiply(BigInteger.valueOf(gasboilerStage))) : "." ));
		logger.print("," + gasBoilerCost.toString());
		logger.print("," + gasboilerProductionPerStage.multiply(BigInteger.valueOf(gasboilerStage)).toString());
		
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
					+ " leaving state of charge at " + UnitHelper.printAmount(stateOfCharge) + ".");			
		}
		logger.print("," + fromStorage);
		
		BigInteger toStorage = BigInteger.ZERO;
		if(isGreaterZero(excessElectricity)) {
			toStorage = excessElectricity.min(maxInOut.add(fromStorage)).min(capacity.subtract(stateOfCharge));
			stateOfCharge = stateOfCharge.add(toStorage);
			excessElectricity = excessElectricity.subtract(toStorage);
			System.out.println("[" + name + "] Charging " + UnitHelper.printAmount(toStorage) + " into battery,"
					+ " leaving state of charge at " + UnitHelper.printAmount(stateOfCharge) + "Ws.");
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
								* pvArea * pvEfficiency * 1000000000) //kW * 1000000000
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
		ArrayList<BigInteger> heatOfferPrices = new ArrayList<>();
		ArrayList<BigInteger> heatOfferAmounts = new ArrayList<>();
		for(int i = 0; i < stages; i++) {
			logOffer(gasboilerProductionPerStage, UnitHelper.getCentsPerKwhFromWeiPerWs(heatDemandPrice), Market.HEAT);
			heatOfferPrices.add(heatDemandPrice);
			heatOfferAmounts.add(gasboilerProductionPerStage);
		}
		postOffer(heatOfferPrices, heatOfferAmounts, Market.HEAT);

		ArrayList<BigInteger> electricityDemandPrices = new ArrayList<BigInteger>();
		ArrayList<BigInteger> electricityDemandAmounts = new ArrayList<BigInteger>();
		BigInteger ownProduction = stateOfCharge.min(maxInOut).min(electricityToProduce).add(nextPVProduction);
		BigInteger maxCharge = capacity.subtract(stateOfCharge).divide(BigInteger.valueOf(2)).min(maxInOut);
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
			logOffer(excessElectricity, Simulation.ELECTRICITY_MIN_PRICE, Market.ELECTRICITY);	
			postAndLogOfferSplit(uniqueMinPrice, excessElectricity, Market.ELECTRICITY);
		}

		currentElectricityConsumption = nextElectricityConsumption;
		currentHeatConsumption = nextHeatConsumption;
		currentPVProduction = nextPVProduction;
		logger.print("," + gasUsed + "," + failedPosts + "," + nrOfTransactions);
		logger.println();
	}

}
