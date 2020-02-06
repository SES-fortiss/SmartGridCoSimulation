/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package strategyClusterHeads;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ExternalClusterHeadTest {
	
	@Test
	public void JSONtests(){
		String message = "{\"PV\": 0, \"Wind\": 0, \"BHKW\": 0, \"RequestPower\": 0}";
		
		
    	System.out.println(message);    	
    	
		JsonObject json = (JsonObject) new JsonParser().parse(message);
		System.out.println(json);
		System.out.println(json.get("PV"));
		
		Gson gson = new Gson();
		System.out.println(gson.toString());
	}

}
