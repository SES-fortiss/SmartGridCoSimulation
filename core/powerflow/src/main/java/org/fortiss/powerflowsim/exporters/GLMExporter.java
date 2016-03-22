/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */
package org.fortiss.powerflowsim.exporters;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;

import org.fortiss.powerflowsim.model.CimModel;
import org.fortiss.powerflowsim.simulation.gridlabd.Timestep;

import CIM15.IEC61970.Topology.TopologicalNode;
import CIM15.IEC61970.Wires.ACLineSegment;
import CIM15.IEC61970.Wires.EnergyConsumer;
import CIM15.IEC61970.Wires.EnergySource;
import CIM15.IEC61970.Wires.PowerTransformer;

/**
 * 
 * @author Martin Zellner
 */
public class GLMExporter extends Exporter {

	/**
	 * 
	 * @param file
	 * @param model
	 * @param timestep
	 */
	public void export(File file, CimModel model, Timestep timestep) {

		String content = "";
		if (model.getSWINGNode() != null) {
			this.swingNodeName = model.getSWINGNode().getMRID();
		} else {
			try {
				this.swingNodeName = ((TopologicalNode) model.getAllObjectsWithClass(TopologicalNode.class).toArray()[0]).getMRID();
			} catch (ClassCastException ex) {
				log.error("Could not set the SWING node automatically");
			}
		}
		log.info("SWING Node is " + this.swingNodeName);
		// some prefix GridLAB options
		String prefix = createClock(timestep);
		prefix += createOptions();
		prefix += createModules("");
		// alternative solver: solver_method NR;

		content += prefix;

		Set<Object> nodes = model.getAllObjectsWithClass(TopologicalNode.class);
		for (Object node : nodes) {
			content += createBus((TopologicalNode) node);
		}

		Set<Object> sources = model.getAllObjectsWithClass(EnergySource.class);
		for (Object source : sources) {
			content += createGenerator((EnergySource) source);
		}

		Set<Object> loads = model.getAllObjectsWithClass(EnergyConsumer.class);
		for (Object load : loads) {
			content += createLoad((EnergyConsumer) load);
		}

		Set<Object> transformers = model.getAllObjectsWithClass(PowerTransformer.class);
		for (Object branch : transformers) {
			content += createBranch(branch);
		}

		Set<Object> lines = model.getAllObjectsWithClass(ACLineSegment.class);
		for (Object branch : lines) {
			content += createBranch(branch);
		}
		writeFile(file, content);
	}

	/**
	 * Creates a Line in the GLM with the parameters the {@link ACLineSegment}
	 * in CIM
	 * 
	 * @param line
	 * @return
	 */
	public String createBranch(Object branch) {

		if (branch.getClass().equals(ACLineSegment.class)) {
			return createLine((ACLineSegment) branch);
		} else if (branch.getClass().equals(PowerTransformer.class)) {
			return createTransformer((PowerTransformer) branch);
		}
		return null;
	}

	/**
	 * Creates a Node in the GLM with the parameters of the topological node in
	 * CIM
	 * 
	 * a node in GLM must have at least the following properties:
	 * <ul>
	 * <li>name</li>
	 * <li>phases</li>
	 * <li>nominal_voltage</li>
	 * </ul>
	 * 
	 * <p>
	 * for a complete list of all properties see the <a href=
	 * "http://sourceforge.net/apps/mediawiki/gridlab-d/index.php?title=Power_Flow_User_Guide#Node"
	 * target="_blank">GridLabD Powerflow Module Documentation</a>
	 * 
	 * <p>
	 * at least one node must be specified as a SWING Node
	 * 
	 * @param node
	 *            a {@link TopologicalNode } in CIM
	 * @return
	 */
	public String createBus(Object bus) {
		TopologicalNode node = (TopologicalNode) bus;
		Map<String, String> properties = new HashMap<String, String>();
		properties.put("name", node.getMRID().replace(" ", "_"));

		try {
			properties.put("nominal_voltage", String.valueOf(node.getBaseVoltage().getNominalVoltage()) + " V");
		} catch (NullPointerException ex) {
			log.error("nominal_voltage for Node " + node.getMRID() + " needs to be set.");
		}

		try {
			properties.put("phases", node.getTerminal().get(0).getPhases().toString());
		} catch (NullPointerException ex) {
			log.error("phases for Node " + node.getMRID() + " needs to be set.");
		} catch (IndexOutOfBoundsException ex) {
			log.error(node.getMRID() + " has no Terminal.");
		}

		if (node.getMRID().equals(getSwingNodeName()) && swingSet == false) {
			properties.put("bustype", "SWING");
			this.swingSet = true;
		}

		log.debug(createObject("node", properties));
		return createObject("node", properties);
	}

	/**
	 * Creates a Node in the GLM with the parameters of the {@link EnergySource}
	 * in CIM
	 * 
	 * a node in GLM must have at least the following properties:
	 * <ul>
	 * <li>name</li>
	 * <li>phases</li>
	 * <li>nominal_voltage</li>
	 * </ul>
	 * 
	 * <p>
	 * for a complete list of all properties see the <a href=
	 * "http://sourceforge.net/apps/mediawiki/gridlab-d/index.php?title=Power_Flow_User_Guide#Node"
	 * target="_blank">GridLabD Powerflow Module Documentation</a>
	 * 
	 * <p>
	 * The Energy Source is mapped to GLM as a child of the
	 * {@link TopologicalNode} it belongs to
	 * 
	 * 
	 * @param energySource
	 * @return
	 */
	public String createGenerator(Object generator) {
		EnergySource energySource = (EnergySource) generator;
		Map<String, String> generator_properties = new HashMap<String, String>();
		generator_properties.put("name", energySource.getMRID().replace(" ", "_"));
		generator_properties.put("nominal_voltage", String.valueOf(energySource.getBaseVoltage().getNominalVoltage()));
		generator_properties.put("phases", energySource.getTerminals().get(0).getPhases().toString());
		generator_properties.put("parent", energySource.getTerminals().get(0).getTopologicalNode().getMRID().replace(" ", "_"));

		log.debug(createObject("node", generator_properties));
		return createObject("node", generator_properties);
	}

	/**
	 * Creates a Load in the GLM with the parameters of the
	 * {@link EnergyConsumer} in CIM
	 * 
	 * a node in GLM must have at least the following properties:
	 * <ul>
	 * <li>name</li>
	 * <li>phases</li>
	 * <li>nominal_voltage</li>
	 * <li>constant_current_A</li>
	 * <li>constant_current_B</li>
	 * <li>constant_current_C</li>
	 * <li>constant_impedance_A</li>
	 * <li>constant_impedance_B</li>
	 * <li>constant_impedance_C</li>
	 * <li>constant_power_A</li>
	 * <li>constant_power_B</li>
	 * <li>constant_power_C</li>
	 * 
	 * <li>nominal_voltage</li>
	 * </ul>
	 * 
	 * <p>
	 * for a complete list of all properties see the <a href=
	 * "http://sourceforge.net/apps/mediawiki/gridlab-d/index.php?title=Power_Flow_User_Guide#Load"
	 * target="_blank">GridLabD Powerflow Module Documentation</a>
	 * 
	 * <p>
	 * The EnergyConsumer is mapped to GLM as a child of the
	 * {@link TopologicalNode} it belongs to
	 * 
	 * <p>
	 * since CIM {@link EnergyConsumer} supports only power values only
	 * constant_power is mapped to GLM. CIM also specifies only one symmetrical
	 * loads.
	 * 
	 * 
	 * @param energyConsumer
	 *            the CIM EnergyConsumer object
	 * @return the GLM specification of the load as a string
	 */
	public String createLoad(Object load) {
		EnergyConsumer energyConsumer = (EnergyConsumer) load;
		Map<String, String> load_properties = new HashMap<String, String>();

		load_properties.put("name", energyConsumer.getMRID().replace(" ", "_"));
		load_properties.put("nominal_voltage", String.valueOf(energyConsumer.getBaseVoltage().getNominalVoltage()));
		load_properties.put("parent", energyConsumer.getTerminals().get(0).getTopologicalNode().getMRID().replace(" ", "_"));
		load_properties.put("phases", energyConsumer.getTerminals().get(0).getPhases().toString());

		// Constant Power Load
		load_properties.put("constant_power_A", String.valueOf(energyConsumer.getPfixed() / 3) + "+" + String.valueOf(energyConsumer.getQfixed() / 3) + "j");
		load_properties.put("constant_power_A", String.valueOf(energyConsumer.getPfixed() / 3) + "+" + String.valueOf(energyConsumer.getQfixed() / 3) + "j");
		load_properties.put("constant_power_A", String.valueOf(energyConsumer.getPfixed() / 3) + "+" + String.valueOf(energyConsumer.getQfixed() / 3) + "j");

		// Impedance Load
		log.debug(createObject("load", load_properties));
		return createObject("load", load_properties);
	}

	/**
	 * creates a GridLAB transformer object
	 * 
	 * @param transformer
	 *            the CIM PowerTransformer
	 * @return the GLM specification of the transformer as a string
	 */
	private static String createTransformer(PowerTransformer transformer) {
		Map<String, String> properties = new HashMap<String, String>();
		properties.put("name", transformer.getMRID().replace(" ", "_"));
		properties.put("phases", transformer.getPowerTransformerEnd().get(0).getTerminal().getPhases().toString());
		properties.put("from", transformer.getPowerTransformerEnd().get(0).getTerminal().getTopologicalNode().getMRID().replace(" ", "_"));
		properties.put("to", transformer.getPowerTransformerEnd().get(1).getTerminal().getTopologicalNode().getMRID().replace(" ", "_"));
		properties.put("configuration", transformer.getMRID() + "_config");

		Map<String, String> config = new HashMap<String, String>();
		config.put("name", transformer.getMRID() + "_config");
		config.put("connect_type", "DELTA_DELTA");
		config.put("install_type", "PADMOUNT");
		config.put("power_rating", String.valueOf(transformer.getPowerTransformerEnd().get(0).getRatedS()));
		config.put("primary_voltage", String.valueOf(transformer.getPowerTransformerEnd().get(0).getTerminal().getTopologicalNode().getBaseVoltage().getNominalVoltage()) + " V");
		config.put("secondary_voltage", String.valueOf(transformer.getPowerTransformerEnd().get(1).getTerminal().getTopologicalNode().getBaseVoltage().getNominalVoltage()) + " V");
		config.put("resistance", String.valueOf(transformer.getPowerTransformerEnd().get(0).getR()));
		config.put("reactance", String.valueOf(transformer.getPowerTransformerEnd().get(0).getX()));

		log.debug(createObject("transformer", properties) + createObject("transformer_configuration", config));

		return createObject("transformer", properties) + createObject("transformer_configuration", config);

	}

	/**
	 * 
	 * @param type
	 * @param properties
	 * @return
	 */
	private static String createObject(String type, Map<String, String> properties) {
		String object_string = "";

		object_string += "object " + type + " {\n";

		for (String key : properties.keySet()) {
			object_string += createProperty(key, properties.get(key));
		}
		object_string += "}\n\n";

		return object_string;
	}

	/**
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	private static String createProperty(String key, String value) {
		return "\t" + key + " " + value + ";\n";
	}

	/**
	 * 
	 * @param timestep
	 * @return
	 */
	private static String createClock(Timestep timestep) {
		String output = "clock { \n";
		output += "timezone PST +8PDT; \n";
		output += "starttime '" + timestep.getStartDate() + "'; \n";
		output += "stoptime '" + timestep.getStopDate() + "';\n";
		output += "}\n \n";
		return output;
	}

	/**
	 * 
	 * @return
	 */
	private static String createOptions() {
		String output = "#set minimum_timestep=60;\n";
		output += "#set profiler=1;\n";
		output += "#set relax_naming_rules=1;\n";
		output += "#set pauseatexit=1;\n";
		output += "#set minimum_timestep=60;\n";
		output += "#set profiler=1;\n";
		output += "#set relax_naming_rules=1;\n";
		output += "#set pauseatexit=1;\n";
		return output;
	}

	/**
	 * 
	 * @param solver
	 * @return
	 */
	private static String createModules(String solver) {
		String output = "module generators; \n";
		output += " module tape; \n";
		output += "module assert; \n";
		output += "module climate; \n";
		output += "module residential; \n";
		output += "module powerflow { " + solver + " }\n";
		return output;
	}

	/**
	 * 
	 * @param outputFile
	 * @param string
	 */
	private static void writeFile(File outputFile, String string) {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(outputFile);
			fileWriter.write(string);
			fileWriter.close();
		} catch (IOException ex) {
			java.util.logging.Logger.getLogger(GLMExporter.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			try {
				fileWriter.close();
			} catch (IOException ex) {
				java.util.logging.Logger.getLogger(GLMExporter.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}

	/**
	 * @param branch
	 * @return
	 */
	private static String createLine(ACLineSegment line) {
		Map<String, String> properties = new HashMap<String, String>();
		properties.put("name", line.getMRID().replace(" ", "_"));
		properties.put("phases", line.getTerminals().get(0).getPhases().toString());
		properties.put("from", line.getTerminals().get(0).getTopologicalNode().getMRID().replace(" ", "_"));
		properties.put("to", line.getTerminals().get(1).getTopologicalNode().getMRID().replace(" ", "_"));
		properties.put("length", String.valueOf(line.getLength()) + " m");
		properties.put("configuration", line.getMRID() + "_config");

		Map<String, String> config = new HashMap<String, String>();
		config.put("name", line.getMRID() + "_config");

		// TODO proper line configuration
		config.put("z11", String.valueOf(line.getR()) + "+" + String.valueOf(line.getX()) + "j");
		config.put("z12", "0+0j");
		config.put("z13", "0+0j");
		config.put("z21", "0+0j");
		config.put("z22", String.valueOf(line.getR()) + "+" + String.valueOf(line.getX()) + "j");
		config.put("z23", "0+0j");
		config.put("z31", "0+0j");
		config.put("z32", "0+0j");
		config.put("z33", String.valueOf(line.getR()) + "+" + String.valueOf(line.getX()) + "j");

		log.debug(createObject("overhead_line", properties) + createObject("line_configuration", config));

		return createObject("overhead_line", properties) + createObject("line_configuration", config);
	}

}
