/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package helper.lastProfil;

import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.Test;
import static helper.lastProfil.LastProfilTennet.*;

/**
 * 
 * Class to test the LastProfileTennet execution.
 * 
 * @author denis
 *
 */
public class LastProfilTennetTest {

	@Test
	public void test() {				
		Assert.assertTrue(readFile());
	}
	
	@Test
	public void updateTimeIndexTest(){
		Assert.assertTrue(updateTimeIndex(LocalDateTime.now()));
	}
	
	@Test
	public void testLoadCommercial(){		
		System.out.println(LocalDateTime.now());
		System.out.println(getLoadCommercial(50000, LocalDateTime.now()));
		System.out.println(getLoadDomestic(50000, LocalDateTime.now()));
	}

}
