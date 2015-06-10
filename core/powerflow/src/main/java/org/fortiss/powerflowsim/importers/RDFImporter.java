/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package org.fortiss.powerflowsim.importers;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.fortiss.powerflowsim.model.Model;
import org.fortiss.powerflowsim.util.Utils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import CIM15.IEC61970.Core.IdentifiedObject;

public class RDFImporter extends Importer {

	public Model importRDF(File rdfFile) {
		initPackages();

		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

			dbFactory.setIgnoringElementContentWhitespace(true);
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.parse(rdfFile);

			doc.getDocumentElement().normalize();

			return parseXML(doc);

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	private Model parseXML(Document doc) {
		// create a new model
		Model model = new Model();

		Element rootElement = doc.getDocumentElement();
		NodeList nodeList = rootElement.getChildNodes();

		// create all CIM objects and set properties
		createObjects(model, nodeList);

		// set resource links
		setResourceLinks(model, nodeList);

		return model;
	}

	/**
	 * create all CIM objects and set properties
	 * 
	 * @param model
	 * @param nodeList
	 */
	private void createObjects(Model model, NodeList nodeList) {
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);

			if (node.getNodeName().contains("cim")) {

				String className = node.getNodeName().split(":")[1];

				for (String packageName : getCIMPackageList()) {
					try {
						// Create object with fancy Java Reflection stuff
						Class<?> aClass = loadClass(className);
						Object myObject = getObjectWithReflection(className, packageName);

						// setMRID
						((IdentifiedObject) myObject).setMRID(((Element) node).getAttribute("rdf:ID"));

						// set properties
						for (int m = 0; m < node.getChildNodes().getLength(); m++) {
							try {
								Node child = node.getChildNodes().item(m);

								trySetStringProperty(aClass, myObject, child);
								trySetFloatProperty(aClass, myObject, child);

							} catch (Exception ex) {
							}

						}
						model.add(aClass.cast(myObject));
						log.info("Created " + ((IdentifiedObject) myObject).getMRID() + " (" + myObject.getClass().getSimpleName() + ")");
						break;
					} catch (Exception ex) {
					}
				}
			}
		}
	}

	/**
	 * set all interconnections between CIM objects correctly
	 * 
	 * @param model
	 * @param nodeList
	 */
	private void setResourceLinks(Model model, NodeList nodeList) {
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if (node.getNodeName().contains("cim")) {

				String nodeMRID = ((Element) node).getAttribute("rdf:ID");
				Object nodeObj = model.getObjectWithMRID(nodeMRID);

				for (int m = 0; m < node.getChildNodes().getLength(); m++) {

					// If child Node is a resource link:
					try {
						Node child = node.getChildNodes().item(m);
						String propertyName = child.getNodeName().split("[.]")[1];
						String mRID = ((Element) child).getAttribute("rdf:resource").substring(1);

						setRessourceLink(model, nodeObj, propertyName, mRID);
						log.debug("Resolved ressource link for property" + propertyName + "of " + nodeMRID);

					} catch (Exception ex) {
					}

				}

			}
		}
	}

	/**
	 * @param model
	 * @param sourceObject
	 * @param propertyName
	 * @param destinationMRID
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws NoSuchMethodException
	 */
	private void setRessourceLink(Model model, Object sourceObject, String propertyName, String destinationMRID) {
		Object obj = model.getObjectWithMRID(destinationMRID);
		if (obj == null) {
			log.error("Could not resolve RessourceLink for MRID " + ((IdentifiedObject) sourceObject).getMRID() + " and Class of destination Object " + propertyName);
		}
		try {
			sourceObject.getClass().getMethod("set" + Utils.capitalize(propertyName), loadClass(propertyName)).invoke(sourceObject, obj);
		} catch (IllegalArgumentException e) {
		} catch (SecurityException e) {
		} catch (IllegalAccessException e) {
		} catch (InvocationTargetException e) {
		} catch (NoSuchMethodException e) {
		}

	}

	private boolean trySetStringProperty(Class<?> objectClass, Object object, Node childrenNode) {
		String propertyName = childrenNode.getNodeName().split("[.]")[1];

		// try String
		try {
			objectClass.getMethod("set" + Utils.capitalize(propertyName), String.class).invoke(object, childrenNode.getTextContent());
			return true;

		} catch (Exception ex) {
		}
		return false;

	}

	private boolean trySetFloatProperty(Class<?> objectClass, Object object, Node childrenNode) {
		String propertyName = childrenNode.getNodeName().split("[.]")[1];

		// try String
		try {
			objectClass.getMethod("set" + Utils.capitalize(propertyName), float.class).invoke(object, Float.valueOf(childrenNode.getTextContent()).floatValue());
			return true;
		} catch (Exception ex) {
		}
		return false;
	}
}
