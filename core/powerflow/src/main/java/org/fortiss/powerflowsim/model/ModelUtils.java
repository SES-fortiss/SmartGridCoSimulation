/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package org.fortiss.powerflowsim.model;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;

import CIM15.IEC61970.Core.BaseVoltage;
import CIM15.IEC61970.Core.ConnectivityNode;
import CIM15.IEC61970.Core.CoreFactory;
import CIM15.IEC61970.Core.IdentifiedObject;
import CIM15.IEC61970.Core.PhaseCode;
import CIM15.IEC61970.Core.Terminal;
import CIM15.IEC61970.Topology.TopologicalNode;
import CIM15.IEC61970.Topology.TopologyFactory;
import CIM15.IEC61970.Wires.ACLineSegment;
import CIM15.IEC61970.Wires.EnergyConsumer;
import CIM15.IEC61970.Wires.EnergySource;
import CIM15.IEC61970.Wires.WiresFactory;

/**
 * 
 * This class helps to build the Powerflow model. The powerflowAPI actually
 * abstracts from this class, but there might be some functionality that is
 * still helpful!
 * 
 * @author murphy
 *
 */
public abstract class ModelUtils {

	/**
	 * Every PQ node will be created and assumed, that it is a source. 
	 * The solver will consider it by not multiplying it with -1.
	 * 
	 * @param model
	 * @param baseVoltage
	 * @param Pq
	 * @param voltage_magnitude
	 * @param voltage_angle
	 * @return
	 */
	public static TopologicalNode createPVBus(CimModel model,
			BaseVoltage baseVoltage, double Pq, double voltage_magnitude,
			double voltage_angle) {
		
		TopologicalNode topologicalNode = TopologyFactory.eINSTANCE.createTopologicalNode();
		topologicalNode.setMRID("ID-" + RandomStringUtils.random(8, true, true));
		topologicalNode.setBaseVoltage(baseVoltage);
		model.add(topologicalNode);

		ConnectivityNode connectivityNode = CoreFactory.eINSTANCE.createConnectivityNode();
		connectivityNode.setMRID("ID-"+ RandomStringUtils.random(8, true, true));
		connectivityNode.setTopologicalNode(topologicalNode);
		model.add(connectivityNode);

		EnergySource source = WiresFactory.eINSTANCE.createEnergySource();
		source.setMRID("ID-" + RandomStringUtils.random(8, true, true));		
		source.setActivePower((float) Pq);
		source.setVoltageAngle((float) voltage_angle);
		source.setVoltageMagnitude((float) voltage_magnitude);
		source.setBaseVoltage(baseVoltage);
		
		model.add(source);

		Terminal sourceTerminal = CoreFactory.eINSTANCE.createTerminal();
		sourceTerminal.setMRID("ID-" + RandomStringUtils.random(8, true, true));
		sourceTerminal.setConductingEquipment(source);
		sourceTerminal.setConnectivityNode(connectivityNode);
		sourceTerminal.setTopologicalNode(connectivityNode.getTopologicalNode());
		sourceTerminal.setPhases(PhaseCode.ABCN);
		model.add(sourceTerminal);

		return topologicalNode;
	}

	/**
	 * 
	 * Every PQ node will be created and assumed, that it is a consumer. 
	 * The solver will consider it by multiplying it with -1.
	 * 
	 * @param model
	 * @param baseVoltage
	 * @param Pd
	 * @param Qd
	 * @return
	 */
	public static TopologicalNode createPQBus(CimModel model,BaseVoltage baseVoltage, double Pd, double Qd) {
		TopologicalNode topologicalNode = TopologyFactory.eINSTANCE.createTopologicalNode();
		topologicalNode.setMRID("ID-" + RandomStringUtils.random(8, true, true));
		topologicalNode.setBaseVoltage(baseVoltage);
		model.add(topologicalNode);

		ConnectivityNode connectivityNode = CoreFactory.eINSTANCE.createConnectivityNode();
		connectivityNode.setMRID("ID-"+ RandomStringUtils.random(8, true, true));
		connectivityNode.setTopologicalNode(topologicalNode);
		model.add(connectivityNode);

		EnergyConsumer consumer = WiresFactory.eINSTANCE.createEnergyConsumer();
		consumer.setMRID("ID-" + RandomStringUtils.random(8, true, true));
		consumer.setPfixed((float) Pd);
		consumer.setQfixed((float) Qd);
		consumer.setBaseVoltage(baseVoltage);
		model.add(consumer);

		Terminal consumerTerminal = CoreFactory.eINSTANCE.createTerminal();
		consumerTerminal.setMRID("ID-"+ RandomStringUtils.random(8, true, true));
		consumerTerminal.setConductingEquipment(consumer);
		consumerTerminal.setConnectivityNode(connectivityNode);
		consumerTerminal.setTopologicalNode(connectivityNode.getTopologicalNode());
		consumerTerminal.setPhases(PhaseCode.ABCN);
		model.add(consumerTerminal);

		return topologicalNode;

	}

	public static TopologicalNode createSlackBus(CimModel model,BaseVoltage baseVoltage) {
		TopologicalNode topologicalNode = TopologyFactory.eINSTANCE.createTopologicalNode();
		topologicalNode.setMRID("ID-" + RandomStringUtils.random(8, true, true));
		topologicalNode.setBaseVoltage(baseVoltage);
		model.add(topologicalNode);

		ConnectivityNode connectivityNode = CoreFactory.eINSTANCE.createConnectivityNode();
		connectivityNode.setMRID("ID-"+ RandomStringUtils.random(8, true, true));
		connectivityNode.setTopologicalNode(topologicalNode);
		model.add(connectivityNode);

		return topologicalNode;

	}

	/**
	 * the method creates a default line with R=0.1 and X=0.01
	 * 
	 * @param powerflowModel
	 * @param sourceNode
	 * @param destNode
	 * @return an AClineSegment with R=0.1 and X=0.01
	 */
	public static ACLineSegment createDefaultLine(CimModel powerflowModel,
			TopologicalNode sourceNode, TopologicalNode destNode) {

		double R = 0.1;
		double X = 0.1;
		double B = 0.0;

		ACLineSegment line = createLine(powerflowModel, sourceNode, destNode, R, X, B);

		return line;
	}
	
	/**
	 * The method creates a line with a specified R and X. This function will create a one phase line currently.
	 * 
	 * @param powerflowModel
	 * @param sourceNode
	 * @param destNode
	 * @return an AClineSegment
	 */
	public static ACLineSegment createLine(CimModel model,
			TopologicalNode sourceNode, TopologicalNode destNode, 
			double R,	double X, double B) {

		ACLineSegment acLineSegment = WiresFactory.eINSTANCE.createACLineSegment();
		
		acLineSegment.setMRID("ID-" + RandomStringUtils.random(8, true, true));
		acLineSegment.setLength(2);
		acLineSegment.setR((float) R);
		acLineSegment.setX((float) X);
		acLineSegment.setBch((float) B);
		acLineSegment.setGch((float) 0.0);
		// Gch is currently always 0.0, adapt this code if necessary
		
		model.add(acLineSegment);

		Terminal sourceTerminal = CoreFactory.eINSTANCE.createTerminal();
		sourceTerminal.setMRID("ID-" + RandomStringUtils.random(8, true, true));
		sourceTerminal.setConductingEquipment(acLineSegment);		
		sourceTerminal.setConnectivityNode(sourceNode.getConnectivityNodes().get(0));
		sourceTerminal.setTopologicalNode(sourceNode);
		sourceTerminal.setPhases(PhaseCode.ABCN);
		model.add(sourceTerminal);

		Terminal destTerminal = CoreFactory.eINSTANCE.createTerminal();
		destTerminal.setMRID("ID-" + RandomStringUtils.random(8, true, true));
		destTerminal.setConductingEquipment(acLineSegment);
		destTerminal.setConnectivityNode(sourceNode.getConnectivityNodes().get(0));
		destTerminal.setTopologicalNode(destNode);
		destTerminal.setPhases(PhaseCode.ABCN);
		
		model.add(destTerminal);

		return acLineSegment;
	}

	public static BaseVoltage createBaseVoltage(CimModel model, double voltage) {
		BaseVoltage baseVoltage1 = CoreFactory.eINSTANCE.createBaseVoltage();
		baseVoltage1.setNominalVoltage((float) voltage);
		baseVoltage1.setIsDC(false);
		baseVoltage1.setMRID("baseVoltage");
		model.add(baseVoltage1);

		return baseVoltage1;
	}

	public static Map<String, String> getAttributes(IdentifiedObject object) {
		Map<String, String> resultMap = new HashMap<String, String>();

		for (Method currentGetter : object.getClass().getMethods()) {
			if (isGetter(currentGetter)) {
				try {
					Object attributeValue = currentGetter.invoke(object);

					if (!(attributeValue instanceof IdentifiedObject)) {
						resultMap.put(currentGetter.getName().substring(3),
								attributeValue.toString());
					}
				} catch (NullPointerException | IllegalAccessException
						| IllegalArgumentException | InvocationTargetException e) {
					e.printStackTrace();
				}

			}
		}
		return resultMap;
	}

	private static boolean isGetter(Method method) {
		if (!method.getName().startsWith("get"))
			return false;
		if (method.getParameterTypes().length != 0)
			return false;
		if (void.class.equals(method.getReturnType()))
			return false;
		return true;
	}
}
