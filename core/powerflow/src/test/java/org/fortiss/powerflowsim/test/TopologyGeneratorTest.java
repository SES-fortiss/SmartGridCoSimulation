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

import org.fortiss.powerflowsim.importers.TopologyGenerator;
import org.fortiss.powerflowsim.model.CimModel;
import org.junit.Test;

public class TopologyGeneratorTest {

	@Test
	public void testLineDistribution() {
		TopologyGenerator topologyGenerator = new TopologyGenerator();
		CimModel model = topologyGenerator.generateLineDistributionSystem(100);

		assertEquals(101, model.getTopologicalNodes().size());
	}

}
