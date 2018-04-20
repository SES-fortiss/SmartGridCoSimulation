/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package dems.topologies;

import topology.ActorTopology;
import dems.helper.DEMSActorFactory;

/**
 * 
 * This is the topology for the vpp simulation
 * 
 * @author bytschkow
 *
 */

public class TopologyPrioControl {
	
	/**
	 * ACHTUNG Name der Simulation muss ohne Leerzeichen sein! (wg. AKKA)
	 */
	private static String simulationName = "VPP-Grid-Simulation";
	
	public static ActorTopology createTopology(){
		ActorTopology top = new ActorTopology(simulationName);
		
		/*
		 *  Actor Topology
		 */
		top.addActor("DEMS", DEMSActorFactory.createDEMSPriority());
		
		// Solar
		top.addActorAsChild("DEMS/"+"DachMTZ", DEMSActorFactory.createSolarActor(66.85));
		top.addActorAsChild("DEMS/"+"DachIsar2", DEMSActorFactory.createSolarActor(17.4));
		top.addActorAsChild("DEMS/"+"DachMoosburgBetriebshof", DEMSActorFactory.createSolarActor(25.5));
		top.addActorAsChild("DEMS/"+"DachSchulungszentrum", DEMSActorFactory.createSolarActor(20.58));
		top.addActorAsChild("DEMS/"+"DachGEWOFAG", DEMSActorFactory.createSolarActor(37.00));
		top.addActorAsChild("DEMS/"+"FassadeHeizwerkFreiham", DEMSActorFactory.createSolarActor(32.50));
		top.addActorAsChild("DEMS/"+"DachGewerbehofGiesing", DEMSActorFactory.createSolarActor(48.60));
		top.addActorAsChild("DEMS/"+"DachMesseRiemParkhaus", DEMSActorFactory.createSolarActor(57.75));
		top.addActorAsChild("DEMS/"+"DachRiemersee", DEMSActorFactory.createSolarActor(10.92));
		top.addActorAsChild("DEMS/"+"DachMesseMuenchen", DEMSActorFactory.createSolarActor(1016.00));
		top.addActorAsChild("DEMS/"+"DachHansJensenWeg10", DEMSActorFactory.createSolarActor(45.50));
		top.addActorAsChild("DEMS/"+"DachPasingerFabrik", DEMSActorFactory.createSolarActor(6.34));
		top.addActorAsChild("DEMS/"+"DachTramWerkstaette", DEMSActorFactory.createSolarActor(89.86));
		top.addActorAsChild("DEMS/"+"DachMGS", DEMSActorFactory.createSolarActor(29.0));
		top.addActorAsChild("DEMS/"+"DachU-BahnhofNeuperlachSued", DEMSActorFactory.createSolarActor(3.18));
		top.addActorAsChild("DEMS/"+"DachHeizwerkRiem", DEMSActorFactory.createSolarActor(12.92));
		top.addActorAsChild("DEMS/"+"DachSchuleDroste-Huelshoff-Str", DEMSActorFactory.createSolarActor(12.92));
		top.addActorAsChild("DEMS/"+"DachSWMZentrale", DEMSActorFactory.createSolarActor(120.55));								

		// Wasser (alles was kleiner als 5 MW ist)
		top.addActorAsChild("DEMS/"+"Isarwerk1.1", DEMSActorFactory.createWaterActor(800.));
		top.addActorAsChild("DEMS/"+"Isarwerk1.2", DEMSActorFactory.createWaterActor(800.));
		top.addActorAsChild("DEMS/"+"Isarwerk1.3", DEMSActorFactory.createWaterActor(800.));
		top.addActorAsChild("DEMS/"+"Isarwerk2.1", DEMSActorFactory.createWaterActor(630.));
		top.addActorAsChild("DEMS/"+"Isarwerk2.2", DEMSActorFactory.createWaterActor(630.));
		top.addActorAsChild("DEMS/"+"Isarwerk2.3", DEMSActorFactory.createWaterActor(630.));
		top.addActorAsChild("DEMS/"+"Isarwerk2.4", DEMSActorFactory.createWaterActor(630.));
		top.addActorAsChild("DEMS/"+"Isarwerk3.1", DEMSActorFactory.createWaterActor(1600.));
		top.addActorAsChild("DEMS/"+"Isarwerk3.2", DEMSActorFactory.createWaterActor(1600.));
		top.addActorAsChild("DEMS/"+"Leitzachwerk3", DEMSActorFactory.createWaterActor(380.));
		top.addActorAsChild("DEMS/"+"Maxwerk", DEMSActorFactory.createWaterActor(500.));
		top.addActorAsChild("DEMS/"+"Praterkraftwerk", DEMSActorFactory.createWaterActor(2500.));
		top.addActorAsChild("DEMS/"+"Stadtbachstufe", DEMSActorFactory.createWaterActor(50.));
		top.addActorAsChild("DEMS/"+"KleinwasserKWSempt", DEMSActorFactory.createWaterActor(50.));
		top.addActorAsChild("DEMS/"+"KleinwasserKWHammer", DEMSActorFactory.createWaterActor(38.));		

		// Wind
		top.addActorAsChild("DEMS/"+"WindFroettmaning", DEMSActorFactory.createWindActor(2300.0));
		
		// BioMass
		
		top.addActorAsChild("DEMS/BioMass1", DEMSActorFactory.createBioMassActor(900.0));
		top.addActorAsChild("DEMS/BioMass2", DEMSActorFactory.createBioMassActor(1000.0));
		
		/*
		String path;
		for (int i = 1; i <= 2; i++) {
			path = "/BioMass"+i;
			top.addActorAsChild("DEMS"+path, DEMSActorFactory.createBioMassActor(1000.0));
		}
		*/
		
		

		// BioGas
		top.addActorAsChild("DEMS/"+"BioGasTierparkHellabrunn", DEMSActorFactory.createBioGasActor(300.0));
		top.addActorAsChild("DEMS/"+"BioGasMichaelibad", DEMSActorFactory.createBioGasActor(350.0));				
		return top;
	}
}
