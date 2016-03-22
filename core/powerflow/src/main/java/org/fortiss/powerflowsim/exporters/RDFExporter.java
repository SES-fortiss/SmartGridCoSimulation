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
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.emf.common.util.EList;
import org.fortiss.powerflowsim.model.CimModel;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import CIM15.IEC61970.Core.IdentifiedObject;

/**
 * Exports a model to CIM RDF (version 15)
 * 
 * @author Martin Zellner
 * 
 */
public abstract class RDFExporter extends Exporter {

	/**
	 * Exports the Model to a CIM RDF file (CIM15 compliant)
	 * 
	 * @param outputFile
	 *            the file the Model should be exported to
	 * @param model
	 *            the Model that should be exported
	 */
	public static void export(File outputFile, CimModel model) {

		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		docFactory.setNamespaceAware(true);

		try {
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// root elements
			Document doc = docBuilder.newDocument();

			Element rootElement = doc.createElementNS("http://www.w3.org/1999/02/22-rdf-syntax-ns#", "rdf:RDF");
			doc.appendChild(rootElement);

			for (Object currentObject : model.getAllObjects()) {
				Element xmlElementForObject = doc.createElementNS("http://iec.ch/TC57/2010/CIM-schema-cim15#", "cim:" + currentObject.getClass().getSimpleName());
				xmlElementForObject.setAttributeNS("http://www.w3.org/1999/02/22-rdf-syntax-ns#", "rdf:ID", ((IdentifiedObject) currentObject).getMRID());
				rootElement.appendChild(xmlElementForObject);
				for (Method currentGetter : currentObject.getClass().getMethods()) {
					if (isGetter(currentGetter) && !currentGetter.getName().equals("getMRID") && !currentGetter.getName().equals("getClass")) {
						try {
							Object attributeValue = currentGetter.invoke(currentObject);

							if (attributeValue instanceof IdentifiedObject) {
								Element xmlAttributeElement = doc.createElementNS("http://iec.ch/TC57/2010/CIM-schema-cim15#", "cim:" + currentGetter.getDeclaringClass().getSimpleName() + "."
										+ currentGetter.getName().substring(3));
								xmlAttributeElement.setAttributeNS("http://www.w3.org/1999/02/22-rdf-syntax-ns#", "rdf:resource", "#" + ((IdentifiedObject) attributeValue).getMRID());
								xmlElementForObject.appendChild(xmlAttributeElement);

							} else if (attributeValue instanceof EList) {
								// lists are ignored
							} else {
								Element xml_attribute = doc.createElementNS("http://iec.ch/TC57/2010/CIM-schema-cim15#", "cim:" + currentGetter.getDeclaringClass().getSimpleName() + "."
										+ currentGetter.getName().substring(3));
								xml_attribute.setTextContent(attributeValue.toString());
								xmlElementForObject.appendChild(xml_attribute);
							}
						} catch (NullPointerException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
							// log.error("Could not execute getter " +
							// currentGetter.getName());
						}

					}
				}
			}

			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();

			try {
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);

				// Output to console for testing
				StreamResult result = new StreamResult(outputFile);
				transformer.transform(source, result);

			} catch (TransformerConfigurationException e) {
				log.error("Transformer is configured wrong! - Stopping RDF export.");
			} catch (TransformerException e) {
				log.error("Transformer error! - Stopping RDF export.");
			}
		} catch (ParserConfigurationException e) {
			log.error("document builder is configured wrong! - Stopping RDF export");
		}
	}

	private static boolean isGetter(Method method) {
		if (!method.getName().startsWith("get"))
			return false;
		if (method.getName().contains("getClass"))
			return false;
		if (method.getParameterTypes().length != 0)
			return false;
		if (void.class.equals(method.getReturnType()))
			return false;
		return true;
	}
}
