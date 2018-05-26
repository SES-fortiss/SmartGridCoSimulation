package ethereum.components;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

import akka.systemActors.GlobalTime;
import ethereum.Simulation;
import ethereum.components.Building;
import ethereum.helper.ConsumptionProfiles;
import ethereum.helper.Market;
import ethereum.helper.UnitHelper;
import ethereum.messages.TimestepInfo;

public class Building1 extends Building {
	
	private BigInteger oilboilerPower = BigInteger.valueOf(40000); //W
	private BigInteger oilboilerPrice = UnitHelper.getEtherPerWsFromCents(Simulation.OIL_PRICE);
	
	public Building1(
			String name,
			int rpcport,
			String privateKey,
			ConsumptionProfiles consumptionProfiles,
			int consumerIndex
	) {
		super(name, rpcport, privateKey, consumptionProfiles, consumerIndex);
		logger.print(",oilBoilerCost,oilboilerProduction,excessHeat,lackingHeat,electricityLack,gasUsed,failedPosts");
		logger.println();
	}

	@Override
	public void makeDecision() {
		super.makeDecision();

		String oilboilerStatus = "off";
		BigInteger oilboilerProduction = Simulation.TIMESTEP_DURATION_IN_SECONDS.multiply(oilboilerPower);
		
		BigInteger amountToProduce = currentHeatConsumption.add(soldHeat).subtract(boughtHeat);
		BigInteger excessProduction = BigInteger.ZERO;
		if(isGreaterZero(amountToProduce)) {
			oilboilerStatus = "on";
			excessProduction = oilboilerProduction.subtract(amountToProduce).max(BigInteger.ZERO);
			amountToProduce = amountToProduce.subtract(oilboilerProduction).max(BigInteger.ZERO);
			timestepInfo.cost = timestepInfo.cost.add(oilboilerProduction.multiply(oilboilerPrice));
		}	
		System.out.println("[" + name + "] Oilboiler: " + oilboilerStatus + 
				(oilboilerStatus.equals("on") ? ", producing " + UnitHelper.printAmount(oilboilerProduction) + " Ws." : "." ));
		logger.print("," + timestepInfo.cost);
		logger.print("," + (oilboilerStatus == "off" ? 0 : oilboilerProduction));
		
		if(isGreaterZero(excessProduction)) {
			System.out.println("[" + name + "] Excess heat: " + UnitHelper.printAmount(excessProduction));
			timestepInfo.heatFeedIn = excessProduction;
		}
		logger.print("," + excessProduction);
		if(isGreaterZero(amountToProduce)) {
			System.out.println("[" + name + "] Lacking heat : " + UnitHelper.printAmount(amountToProduce));
			timestepInfo.heatWithdrawal = amountToProduce;
		}
		logger.print("," + amountToProduce);
		
		BigInteger electricityLack = currentElectricityConsumption.subtract(boughtElectricity).max(BigInteger.ZERO);
		if(isGreaterZero(electricityLack)) {
			timestepInfo.electricityWithdrawal = electricityLack;
			System.out.println("[" + name + "] Lacking electricity : " + UnitHelper.printAmount(electricityLack));
		}
		logger.print("," + electricityLack);
		
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
		

		logDemand(nextElectricityConsumption, Simulation.ELECTRICITY_MAX_PRICE, Market.ELECTRICITY);
		postDemand(
				Arrays.asList(UnitHelper.getEtherPerWsFromCents(Simulation.ELECTRICITY_MAX_PRICE)),
				Arrays.asList(nextElectricityConsumption),
				Market.ELECTRICITY
			);

		BigInteger heatDemandPrice = findUniqueDemandPrice(oilboilerPrice, Market.HEAT);
		logDemand(nextHeatConsumption, UnitHelper.getCentsPerKwhFromWeiPerWs(heatDemandPrice), Market.HEAT);
		postDemand(Arrays.asList(heatDemandPrice), Arrays.asList(nextHeatConsumption), Market.HEAT);
		logOffer(oilboilerProduction, UnitHelper.getCentsPerKwhFromWeiPerWs(heatDemandPrice), Market.HEAT);
		postOffer(Arrays.asList(heatDemandPrice), Arrays.asList(oilboilerProduction), Market.HEAT);

		currentElectricityConsumption = nextElectricityConsumption;
		currentHeatConsumption = nextHeatConsumption;
		logger.print("," + gasUsed + "," + failedPosts);
		logger.println();
	}

}
