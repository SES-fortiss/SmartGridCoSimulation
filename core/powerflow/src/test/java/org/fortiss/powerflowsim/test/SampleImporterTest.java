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

import org.fortiss.powerflowsim.importers.SampleCases;
import org.fortiss.powerflowsim.model.Model;
import org.junit.Test;

public class SampleImporterTest {

	@Test
	/**
	 * Tests if the importer returns a model
	 */
	public void testImportSample() {
		assertEquals(Model.class, SampleCases.basicSample().getClass());
	}

}
