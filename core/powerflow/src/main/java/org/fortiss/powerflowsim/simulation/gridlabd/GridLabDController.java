/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package org.fortiss.powerflowsim.simulation.gridlabd;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.fortiss.powerflowsim.model.CimModel;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import CIM15.IEC61970.Core.Terminal;
import CIM15.IEC61970.Meas.MeasFactory;
import CIM15.IEC61970.Meas.Measurement;
import CIM15.IEC61970.StateVariables.StateVariablesFactory;
import CIM15.IEC61970.StateVariables.SvInjection;
import CIM15.IEC61970.StateVariables.SvVoltage;
import CIM15.IEC61970.Wires.EnergyConsumer;
import CIM15.IEC61970.Wires.EnergySource;
import CIM15.IEC61970.Wires.PowerTransformer;
import CIM15.IEC61970.Wires.PowerTransformerEnd;

/**
 * 
 * @author Martin Zellner
 */
public class GridLabDController {
	
	private static Process gridlab_daemon;
	private CimModel model;
	private static Logger log = Logger.getRootLogger();
	
	public GridLabDController(CimModel model) {
		this.model = model;
	}
	
	public static void start_gridlab_daemon(File model_file) throws InterruptedException {
		try {
			ProcessBuilder gridlab_daemon_builder = new ProcessBuilder("/usr/local/bin/gridlabd", model_file.getAbsolutePath(), "--server", "-D", "run_realtime=1");
			// Map<String, String> env = gridlab_daemon_builder.environment();
			gridlab_daemon_builder.directory(new File("."));
			GridLabDController.gridlab_daemon = gridlab_daemon_builder.start();
			
			// InputStream is =
			// GridLabDController.gridlab_daemon.getInputStream();
			InputStream err = GridLabDController.gridlab_daemon.getErrorStream();
			// InputStreamReader isr = new InputStreamReader(is);
			InputStreamReader errr = new InputStreamReader(err);
			BufferedReader brerr = new BufferedReader(errr);
			
			// BufferedReader br = new BufferedReader(isr);
			String line;
			while ((line = brerr.readLine()) != null) {
				log.info(line);
			}
			
		} catch (IOException ex) {
			log.error(ex);
		}
	}
	
	public static void stop_gridlab_daemon() throws IOException {
		try {
			GridLabDController.gridlab_daemon.destroy();
		} catch (NullPointerException ex) {
			log.info("No gridlab daemon running. Not terminating.");
		}
	}
	
	/**
	 * runs a gridlabd simulation with the given GLM file
	 * 
	 * @param glmFile
	 *            a file object representing the GLM file
	 * @return a string containing the gridlabd commandline output
	 */
	public String runSimulation(File glmFile) {
		File outputFile = new File("output2.xml");
		outputFile.delete();
		
		ProcessBuilder gridlab = new ProcessBuilder("/usr/local/bin/gridlabd", glmFile.getAbsolutePath(), "-o", outputFile.getAbsolutePath());
		gridlab.directory(new File("."));
		
		String outputString = runProcess(gridlab);
		parseXML(outputFile);
		
		return outputString;
	}
	
	private String runProcess(ProcessBuilder process) {
		String outputString = "";
		
		try {
			
			Process gridlab_process = process.start();
			InputStream is = gridlab_process.getInputStream();
			InputStream err = gridlab_process.getErrorStream();
			InputStreamReader isr = new InputStreamReader(is);
			InputStreamReader errr = new InputStreamReader(err);
			BufferedReader brerr = new BufferedReader(errr);
			BufferedReader br = new BufferedReader(isr);
			
			outputString += "[ERROR] \n \n";
			String line;
			while ((line = brerr.readLine()) != null) {
				outputString += line + "\n";
			}
			outputString += "\n[INFO] \n \n";
			
			while ((line = br.readLine()) != null) {
				outputString += line + "\n";
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return outputString;
	}
	
	private void parseXML(File xmlOutputFile) {
		
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			
			dbFactory.setIgnoringElementContentWhitespace(true);
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			
			Document doc = dBuilder.parse(xmlOutputFile);
			
			doc.getDocumentElement().normalize();
			
			// Parse Transformers
			parseTransformers(doc);
			// Parse Loads
			parseLoads(doc);
			// Parse Nodes
			parseNodes(doc);
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException ex) {
			log.error("The result XML File is not corrent.");
		}
	}
	
	private void parseNodes(Document doc) {
		NodeList nodeList = getNodeList(doc, "node");
		
		for (int i = 0; i < nodeList.getLength(); i++) {
			Element nodeElement = (Element) nodeList.item(i);
			
			Map<String, String> measurementResult = convertMeasurementToMap(nodeElement);
			
			// get corresponding element in the CIM model
			String nodeMRID = getMRIDformGridlab(nodeElement);
			Object object = model.getObjectWithMRID(nodeMRID);
			
			// create state variable
			float voltage_magnitude = Float.valueOf(measurementResult.get("voltage_A").split("[+-]")[1]);
			float voltage_angle = Float.valueOf(measurementResult.get("voltage_A").split("[+-]{0,2}")[2].split("d")[0]);
			
			SvVoltage svVoltage = StateVariablesFactory.eINSTANCE.createSvVoltage();
			svVoltage.setAngle(voltage_angle);
			svVoltage.setV(voltage_magnitude);
			
			// power
			
			float active_power = Float.valueOf(measurementResult.get("power_A").split("[+-]")[1]);
			float reactive_power = Float.valueOf(measurementResult.get("power_A").split("[+-]{0,2}")[2].split("i")[0]);
			
			SvInjection svInjection = StateVariablesFactory.eINSTANCE.createSvInjection();
			svInjection.setPNetInjection(active_power);
			svInjection.setQNetInjection(reactive_power);
			
			// Create a measurement
			Measurement measurement = MeasFactory.eINSTANCE.createMeasurement();
			measurement.setMeasurementType(measurementResult);
			
			if (object instanceof EnergySource) {
				EnergySource energySource = (EnergySource) object;
				energySource.getTerminals().get(0).getTopologicalNode().setSvVoltage(svVoltage);
				energySource.getTerminals().get(0).getTopologicalNode().setSvInjection(svInjection);
				
				// measurement.setTerminal(energySource.getTerminals().get(0));
				log.info("Added stateVariable to " + energySource.getMRID());
			}
			
		}
	}
	
	/**
	 * @param element
	 * @return
	 */
	private String getMRIDformGridlab(Element element) {
		String nodeMRID = element.getElementsByTagName("name").item(0).getTextContent();
		return nodeMRID;
	}
	
	/**
	 * parse loads
	 * 
	 * @param doc
	 */
	private void parseLoads(Document doc) {
		
		NodeList loadList = getNodeList(doc, "load");
		
		for (int i = 0; i < loadList.getLength(); i++) {
			Element loadElement = (Element) loadList.item(i);
			
			Map<String, String> measurementResult = convertMeasurementToMap(loadElement);
			
			// create state variable
			float voltage_magnitude = Float.valueOf(measurementResult.get("voltage_A").split("[+-]")[1]);
			float voltage_angle = Float.valueOf(measurementResult.get("voltage_A").split("[+-]{0,2}")[2].split("d")[0]);
			
			SvVoltage svVoltage = StateVariablesFactory.eINSTANCE.createSvVoltage();
			svVoltage.setAngle(voltage_angle);
			svVoltage.setV(voltage_magnitude);
			
			// power
			
			float active_power = Float.valueOf(measurementResult.get("power_A").split("[+-]")[1]);
			float reactive_power = Float.valueOf(measurementResult.get("power_A").split("[+-]{0,2}")[2].split("i")[0]);
			
			SvInjection svInjection = StateVariablesFactory.eINSTANCE.createSvInjection();
			svInjection.setPNetInjection(active_power);
			svInjection.setQNetInjection(reactive_power);
			
			String loadId = getMRIDformGridlab(loadElement);
			EnergyConsumer energyConsumer = (EnergyConsumer) model.getObjectWithMRID(loadId);
			
			for (Terminal terminal : energyConsumer.getTerminals()) {
				// Create a measurement and add it to the models
				terminal.getTopologicalNode().setSvInjection(svInjection);
				terminal.getTopologicalNode().setSvVoltage(svVoltage);
				// Measurement measurement =
				// MeasFactory.eINSTANCE.createMeasurement();
				// measurement.setMeasurementType(measurementResult);
				// measurement.setTerminal(terminal);
				log.info("Added sv to " + energyConsumer.getMRID());
			}
		}
	}
	
	/**
	 * parse transformers
	 * 
	 * @param doc
	 */
	private void parseTransformers(Document doc) {
		NodeList transformerList = getNodeList(doc, "transformer");
		
		for (int i = 0; i < transformerList.getLength(); i++) {
			Element transformerElement = (Element) transformerList.item(i);
			
			// Merge measurement data to a string
			Map<String, String> measurementResult = convertMeasurementToMap(transformerElement);
			
			String transformerId = getMRIDformGridlab(transformerElement);
			PowerTransformer powerTransformer = (PowerTransformer) model.getObjectWithMRID(transformerId);
			
			for (PowerTransformerEnd powerTransformerEnd : powerTransformer.getPowerTransformerEnd()) {
				// Create a measurement and add it to the models
				Measurement measurement = MeasFactory.eINSTANCE.createMeasurement();
				measurement.setMeasurementType(measurementResult);
				measurement.setTerminal(powerTransformerEnd.getTerminal());
				log.info("Added measurement to " + powerTransformerEnd.getMRID());
			}
		}
	}
	
	/**
	 * @param doc
	 * @param type
	 * @return
	 */
	private NodeList getNodeList(Document doc, String type) {
		NodeList transformerList = ((Element) doc.getElementsByTagName(type + "_list").item(0)).getElementsByTagName(type);
		return transformerList;
	}
	
	private Map<String, String> convertMeasurementToMap(Element rootElement) {
		Map<String, String> measurementResult = new HashMap<String, String>();
		for (int m = 0; m < rootElement.getChildNodes().getLength(); m++) {
			try {
				Element valueElement = (Element) rootElement.getChildNodes().item(m);
				measurementResult.put(valueElement.getNodeName(), valueElement.getTextContent());
			} catch (ClassCastException ex) {
			}
		}
		return measurementResult;
	}
	
	/**
	 * getter for the model
	 * 
	 * @return the model
	 */
	public CimModel getModel() {
		return this.model;
	}
}
