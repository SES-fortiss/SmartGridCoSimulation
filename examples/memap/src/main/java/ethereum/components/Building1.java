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
	private BigInteger oilboilerPrice = UnitHelper.getCentsPerWsFromCents(8.44);
	
	private BigInteger currentElectricityConsumption = BigInteger.ZERO;
	private BigInteger currentHeatConsumption = BigInteger.ZERO;
	
	public Building1(
			String name,
			int rpcport,
			String privateKey,
			ConsumptionProfiles consumptionProfiles,
			int consumerIndex
	) {
		super(name, rpcport, privateKey, consumptionProfiles, consumerIndex);
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

		if(isGreaterZero(excessProduction)) {
			System.out.println("[" + name + "] Excess heat: " + UnitHelper.printAmount(excessProduction));
			timestepInfo.heatFeedIn = excessProduction;
		}
		if(isGreaterZero(amountToProduce)) {
			System.out.println("[" + name + "] Lacking heat : " + UnitHelper.printAmount(amountToProduce));
			timestepInfo.heatWithdrawal = amountToProduce;
		}
		
		BigInteger electricityLack = currentElectricityConsumption.subtract(boughtElectricity).max(BigInteger.ZERO);
		if(isGreaterZero(electricityLack)) {
			timestepInfo.electricityWithdrawal = electricityLack;
			System.out.println("[" + name + "] Lacking electricity : " + UnitHelper.printAmount(electricityLack));
		}
		
		BigInteger nextHeatConsumption = consumptionProfiles.getHeatConsumption(
				consumerIndex,
				GlobalTime.currentTimeStep + 1
		);
		
		BigInteger nextElectricityConsumption = consumptionProfiles.getElectricityConsumption(
				consumerIndex,
				GlobalTime.currentTimeStep + 1
		);
		
		System.out.println("[" + name + "] Expected heat consumption for next step: " + UnitHelper.printAmount(nextHeatConsumption));
		System.out.println("[" + name + "] Expected electricity consumption for next step: " + UnitHelper.printAmount(nextHeatConsumption));
		

		logDemand(nextElectricityConsumption, Simulation.ELECTRICITY_MAX_PRICE, Market.ELECTRICITY);
		postDemand(
				Arrays.asList(UnitHelper.getCentsPerWsFromCents(Simulation.ELECTRICITY_MAX_PRICE)),
				Arrays.asList(nextElectricityConsumption),
				Market.ELECTRICITY
			);

		BigInteger heatDemandPrice = findUniqueDemandPrice(oilboilerPrice, Market.HEAT);
		logDemand(nextHeatConsumption, UnitHelper.getCentsFromCentUnits(heatDemandPrice), Market.HEAT);
		postDemand(Arrays.asList(heatDemandPrice), Arrays.asList(nextHeatConsumption), Market.HEAT);
		logOffer(oilboilerProduction, UnitHelper.getCentsFromCentUnits(heatDemandPrice), Market.HEAT);
		postOffer(Arrays.asList(heatDemandPrice), Arrays.asList(oilboilerProduction), Market.HEAT);

		currentElectricityConsumption = nextElectricityConsumption;
		currentHeatConsumption = nextHeatConsumption;
	}

}
