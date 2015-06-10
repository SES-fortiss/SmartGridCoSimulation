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

import org.fortiss.powerflowsim.util.Utils;
import org.junit.Test;

public class UtilsTest {

	@Test
	public void testCapitalize() {
		assertEquals("Load1", Utils.capitalize("load1"));
	}

}
