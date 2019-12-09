/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package piWebServer.collector;

import javax.servlet.http.HttpServletRequest;

public interface DataCollectorInterface {

	String generateMessage(HttpServletRequest request);
	String getAll();
	String getStatus();

	default String getFehlerMeldung(){
		return    "Sie haben einen QUERY der leider nicht interpretiert werden kann --> Startseite\n"
				+ "-------------------------------------------------------------------------------\n\n"
				+ getAll();
	}
}