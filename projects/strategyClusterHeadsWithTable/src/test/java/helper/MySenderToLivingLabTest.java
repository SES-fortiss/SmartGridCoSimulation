/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package helper;

import java.io.IOException;

import org.junit.Test;

import vppClusterHeads.helper.SenderToLivingLabWebsite;

public class MySenderToLivingLabTest {
	
	@Test
	public void testSend() throws IOException{
		
		String string = "{\"name\":\"DEMS\",\"totalPower\":test}";		
		SenderToLivingLabWebsite.writeValues(string);
		
	}

}
