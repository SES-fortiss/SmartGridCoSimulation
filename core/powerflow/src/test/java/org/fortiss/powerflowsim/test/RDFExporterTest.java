/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package org.fortiss.powerflowsim.test;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.fortiss.powerflowsim.exporters.RDFExporter;
import org.fortiss.powerflowsim.importers.RDFImporter;
import org.fortiss.powerflowsim.importers.TopologyGenerator;
import org.fortiss.powerflowsim.model.Model;
import org.junit.Before;
import org.junit.Test;

import CIM15.IEC61970.Core.ConductingEquipment;
import CIM15.IEC61970.Core.IdentifiedObject;
import CIM15.IEC61970.Core.Terminal;

public class RDFExporterTest {

	private static Logger log = Logger.getRootLogger();

	@Before
	public void createLogger() {
		SimpleLayout layout = new SimpleLayout();
		ConsoleAppender consoleAppender = new ConsoleAppender(layout);
		log.addAppender(consoleAppender);
		// ALL | DEBUG | INFO | WARN | ERROR | FATAL | OFF:
		log.setLevel(Level.ALL);
	}

	@Test
	public void testXMLExport() {
		TopologyGenerator generator = new TopologyGenerator();
		Model model = generator.generateLineDistributionSystem(2);
		File file = new File("file.xml");
		RDFExporter.export(file, model);

		RDFImporter importer = new RDFImporter();
		Model model2 = importer.importRDF(file);

		for (Object obj : model2.getAllObjects()) {
			if (obj instanceof IdentifiedObject) {
				String mrid = ((IdentifiedObject) obj).getMRID();
				Object oldObj = model.getObjectWithMRID(mrid);
				if (obj instanceof Terminal) {
					assertEquals(((Terminal) oldObj).getConductingEquipment().getMRID(), ((Terminal) obj).getConductingEquipment().getMRID());
				}
				if (obj instanceof ConductingEquipment) {
					assertEquals(((ConductingEquipment) obj).getTerminals().size(), ((ConductingEquipment) oldObj).getTerminals().size());

				}
			}
		}
		model2.toString();
	}
}
