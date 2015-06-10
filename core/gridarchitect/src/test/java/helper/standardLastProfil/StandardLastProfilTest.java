/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package helper.standardLastProfil;

import java.time.LocalDateTime;

import org.junit.Test;

public class StandardLastProfilTest {

	@Test
	public void test() {
		StandardLastProfil.getH0Demand(5000, LocalDateTime.now());
	}

}
