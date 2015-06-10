/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package org.fortiss.powerflowsim.importers;

import org.fortiss.powerflowsim.model.Model;
import org.fortiss.powerflowsim.model.ModelUtils;

import CIM15.IEC61970.Core.BaseVoltage;
import CIM15.IEC61970.Core.ConnectivityNode;
import CIM15.IEC61970.Core.CoreFactory;
import CIM15.IEC61970.Core.Terminal;
import CIM15.IEC61970.Topology.TopologicalNode;
import CIM15.IEC61970.Topology.TopologyFactory;
import CIM15.IEC61970.Wires.ACLineSegment;
import CIM15.IEC61970.Wires.EnergyConsumer;
import CIM15.IEC61970.Wires.EnergySource;
import CIM15.IEC61970.Wires.PowerTransformer;
import CIM15.IEC61970.Wires.PowerTransformerEnd;
import CIM15.IEC61970.Wires.WiresFactory;

public abstract class SampleCases {

	public static Model create9BusExample() {
		Model model = new Model();

		// base Voltage
		BaseVoltage baseVoltage = ModelUtils.createBaseVoltage(model, 240.0);
		model.add(baseVoltage);

		// busses
		TopologicalNode bus1 = ModelUtils.createSlackBus(model, baseVoltage);
		model.add(bus1);
		TopologicalNode bus2 = ModelUtils.createPVBus(model, baseVoltage, 163, 240, 0.0);
		model.add(bus2);
		TopologicalNode bus3 = ModelUtils.createPVBus(model, baseVoltage, 85, 240, 0.0);
		model.add(bus3);
		TopologicalNode bus4 = ModelUtils.createPQBus(model, baseVoltage, 0, 0);
		model.add(bus4);
		TopologicalNode bus5 = ModelUtils.createPQBus(model, baseVoltage, 90, 30);
		model.add(bus5);
		TopologicalNode bus6 = ModelUtils.createPQBus(model, baseVoltage, 0, 0);
		model.add(bus6);
		TopologicalNode bus7 = ModelUtils.createPQBus(model, baseVoltage, 100, 35);
		model.add(bus7);
		TopologicalNode bus8 = ModelUtils.createPQBus(model, baseVoltage, 0, 0);
		model.add(bus8);
		TopologicalNode bus9 = ModelUtils.createPQBus(model, baseVoltage, 125, 50);
		model.add(bus9);

		// branches
		ACLineSegment branch1 = ModelUtils.createLine(model, bus1, bus4, 0, 0.0576);
		model.add(branch1);
		ACLineSegment branch2 = ModelUtils.createLine(model, bus4, bus5, 0.017, 0.092);
		model.add(branch2);
		ACLineSegment branch3 = ModelUtils.createLine(model, bus5, bus6, 0.039, 0.17);
		model.add(branch3);
		ACLineSegment branch4 = ModelUtils.createLine(model, bus3, bus6, 0, 0.0586);
		model.add(branch4);
		ACLineSegment branch5 = ModelUtils.createLine(model, bus6, bus7, 0.0119, 0.1008);
		model.add(branch5);
		ACLineSegment branch6 = ModelUtils.createLine(model, bus7, bus8, 0.0085, 0.072);
		model.add(branch6);
		ACLineSegment branch7 = ModelUtils.createLine(model, bus8, bus2, 0, 0.0625);
		model.add(branch7);
		ACLineSegment branch8 = ModelUtils.createLine(model, bus8, bus9, 0.032, 0.161);
		model.add(branch8);
		ACLineSegment branch9 = ModelUtils.createLine(model, bus9, bus4, 0.01, 0.085);
		model.add(branch9);

		model.setSWINGNode(bus1);
		return model;
	}

	public static Model basicSample() {
		Importer.initPackages();

		Model model = new Model();

		CoreFactory coreFactory = CIM15.IEC61970.Core.CoreFactory.eINSTANCE;
		TopologyFactory topologyFactory = CIM15.IEC61970.Topology.TopologyFactory.eINSTANCE;
		WiresFactory wiresFactory = CIM15.IEC61970.Wires.WiresFactory.eINSTANCE;

		// Voltages
		BaseVoltage baseVoltage1 = coreFactory.createBaseVoltage();
		baseVoltage1.setNominalVoltage(35000);
		baseVoltage1.setIsDC(false);
		baseVoltage1.setMRID("baseVoltage1");

		BaseVoltage baseVoltage2 = coreFactory.createBaseVoltage();
		baseVoltage2.setNominalVoltage(10000);
		baseVoltage2.setIsDC(false);
		baseVoltage2.setMRID("baseVoltage1");

		// TopologicalNodes
		TopologicalNode topologicalNodeA = topologyFactory.createTopologicalNode();
		topologicalNodeA.setMRID("topA");
		topologicalNodeA.setBaseVoltage(baseVoltage1);

		TopologicalNode topologicalNodeB = topologyFactory.createTopologicalNode();
		topologicalNodeB.setMRID("topB");
		topologicalNodeB.setBaseVoltage(baseVoltage2);

		// Load
		EnergyConsumer energyConsumer = wiresFactory.createEnergyConsumer();
		energyConsumer.setMRID("load1");
		energyConsumer.setBaseVoltage(baseVoltage1);
		energyConsumer.setPfixed(1000);
		energyConsumer.setQfixed(1000);

		// Transformer
		PowerTransformer powerTransformer = wiresFactory.createPowerTransformer();
		powerTransformer.setMRID("transformer1");

		PowerTransformerEnd powerTransformerEnd1 = wiresFactory.createPowerTransformerEnd();
		powerTransformerEnd1.setMRID("transformer1EndA");
		powerTransformerEnd1.setPowerTransformer(powerTransformer);
		powerTransformerEnd1.setRatedS(2000);
		powerTransformerEnd1.setR(2);
		powerTransformerEnd1.setX(2);

		PowerTransformerEnd powerTransformerEnd2 = wiresFactory.createPowerTransformerEnd();
		powerTransformerEnd2.setMRID("transformer1EndB");
		powerTransformerEnd2.setPowerTransformer(powerTransformer);
		powerTransformerEnd2.setRatedS(2000);
		powerTransformerEnd2.setR(2);
		powerTransformerEnd2.setX(2);

		// Generator
		EnergySource energySource = wiresFactory.createEnergySource();
		energySource.setMRID("gen1");
		energySource.setActivePower(13000);
		energySource.setBaseVoltage(baseVoltage2);

		// ConnectivityNode
		ConnectivityNode node1 = coreFactory.createConnectivityNode();
		node1.setMRID("node1");
		node1.setTopologicalNode(topologicalNodeA);

		ConnectivityNode node2 = coreFactory.createConnectivityNode();
		node2.setMRID("node2");
		node2.setTopologicalNode(topologicalNodeB);

		// Load Terminal
		Terminal terminal2 = coreFactory.createTerminal();
		terminal2.setConductingEquipment(energyConsumer);
		terminal2.setTopologicalNode(topologicalNodeA);
		terminal2.setConnectivityNode(node1);
		terminal2.setMRID("terminal2");
		terminal2.setPhases(CIM15.IEC61970.Core.PhaseCode.ABCN);

		// Transformer Terminals

		Terminal terminal3 = coreFactory.createTerminal();
		terminal3.setTopologicalNode(topologicalNodeA);
		terminal3.setConnectivityNode(node1);
		terminal3.setPhases(CIM15.IEC61970.Core.PhaseCode.ABCN);
		terminal3.setMRID("terminal3");
		powerTransformerEnd1.setTerminal(terminal3);

		Terminal terminal4 = coreFactory.createTerminal();
		terminal4.setTopologicalNode(topologicalNodeB);
		terminal4.setConnectivityNode(node2);
		terminal4.setPhases(CIM15.IEC61970.Core.PhaseCode.ABCN);
		terminal4.setMRID("terminal4");
		powerTransformerEnd2.setTerminal(terminal4);

		// EnergySource Terminal
		Terminal terminal1 = coreFactory.createTerminal();
		terminal1.setConductingEquipment(energySource);
		terminal1.setTopologicalNode(topologicalNodeB);
		terminal1.setConnectivityNode(node2);
		terminal1.setPhases(CIM15.IEC61970.Core.PhaseCode.ABCN);
		terminal1.setMRID("terminal1");

		model.add(energyConsumer);
		model.add(powerTransformer);
		model.add(powerTransformerEnd1);
		model.add(powerTransformerEnd2);

		model.add(energySource);
		model.add(topologicalNodeA);
		model.add(topologicalNodeB);
		model.add(terminal1);
		model.add(terminal2);
		model.add(terminal3);
		model.add(terminal4);
		model.add(node1);
		model.add(node2);

		return model;
	}
}
