package ethereum.components;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

import ethereum.Simulation;
import ethereum.helper.ConsumptionProfiles;
import ethereum.helper.Market;
import ethereum.helper.UnitHelper;

public class Building1 extends Building {
	
	private BigInteger oilboilerPower = BigInteger.valueOf(15000); //W
	private BigInteger oilboilerPrice = UnitHelper.getEtherPerWsFromCents(Simulation.OIL_PRICE);
	private final int stages = 1;
	
	public Building1(
			String name,
			int rpcport,
			String privateKey,
			ConsumptionProfiles consumptionProfiles,
			int consumerIndex
	) {
		super(name, rpcport, privateKey, consumptionProfiles, consumerIndex);
		logger.print(",oilBoilerCost,oilboilerProduction,excessHeat,lackingHeat,electricityLack,gasUsed,failedPosts,nrOfTransactions");
		logger.println();
	}

	@Override
	public void makeDecision() {
		super.makeDecision();

		int oilboilerStage = 0;
		BigInteger oilboilerProductionPerStage = Simulation.TIMESTEP_DURATION_IN_SECONDS.multiply(oilboilerPower).divide(BigInteger.valueOf(stages));
		BigInteger oilboilerCost = BigInteger.ZERO;
		
		BigInteger heatToProduce = currentHeatConsumption.add(soldHeat).subtract(boughtHeat);
		BigInteger excessHeat = BigInteger.ZERO;
		while(oilboilerStage < stages) {
			if(isGreaterZero(heatToProduce)) {
				oilboilerStage++;
				excessHeat = oilboilerProductionPerStage.subtract(heatToProduce).max(BigInteger.ZERO);
				heatToProduce = heatToProduce.subtract(oilboilerProductionPerStage).max(BigInteger.ZERO);
				oilboilerCost = oilboilerCost.add(oilboilerProductionPerStage.multiply(oilboilerPrice));
			}	
			else {
				break;
			}
		}
		System.out.println("[" + name + "] Oilboiler: " + (oilboilerStage == 0 ? "off" : "Stage " + oilboilerStage) + 
				(oilboilerStage > 0 ? ", producing " + UnitHelper.printAmount(oilboilerProductionPerStage.multiply(BigInteger.valueOf(oilboilerStage))) : "." ));
		logger.print("," + oilboilerCost.toString());
		logger.print("," + oilboilerProductionPerStage.multiply(BigInteger.valueOf(oilboilerStage)).toString());
		
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
		
		BigInteger electricityLack = currentElectricityConsumption.subtract(boughtElectricity).max(BigInteger.ZERO);
		if(isGreaterZero(electricityLack)) {
			timestepInfo.electricityWithdrawal = electricityLack;
			System.out.println("[" + name + "] Lacking electricity : " + UnitHelper.printAmount(electricityLack));
		}
		logger.print("," + electricityLack);
		
		BigInteger nextHeatConsumption = consumptionProfiles.getHeatConsumption(
				consumerIndex,
				this.actor.getCurrentTimeStep()
		);
		
		BigInteger nextElectricityConsumption = consumptionProfiles.getElectricityConsumption(
				consumerIndex,
				this.actor.getCurrentTimeStep()
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
		ArrayList<BigInteger> heatOfferPrices = new ArrayList<>();
		ArrayList<BigInteger> heatOfferAmounts = new ArrayList<>();
		for(int i = 0; i < stages; i++) {
			logOffer(oilboilerProductionPerStage, UnitHelper.getCentsPerKwhFromWeiPerWs(heatDemandPrice), Market.HEAT);
			heatOfferPrices.add(heatDemandPrice);
			heatOfferAmounts.add(oilboilerProductionPerStage);
		}
		postOffer(heatOfferPrices, heatOfferAmounts, Market.HEAT);

		currentElectricityConsumption = nextElectricityConsumption;
		currentHeatConsumption = nextHeatConsumption;
		logger.print("," + gasUsed + "," + failedPosts + "," + nrOfTransactions);
		logger.println();
	}

}
