/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package georg;

import powerflowApi.ActorResults;
import powerflowApi.PowerflowMapping;
import powerflowApi.PowerflowModel;
import powerflowApi.PowerflowType;
import topology.ActorTopology;

/**
 * 
 * Ein Beispiel für das Mapping der Ergebnisse von Georg Hackenbergs EXTREME
 * Framework
 * 
 * @since Mar 25, 2014
 * @author Denis Bytschkow
 *
 */
public class GeorgPowerflowTopology {

	public static void createModelandMapping(ActorTopology top) {
		for (String key : top.getActorTopology().keySet()) {
			PowerflowMapping.actorResultsMap.put(key, new ActorResults(key,
					null, null));
		}

		// Kommentar von Denis:
		// die genaue Anzahl ist noch nicht klar wg. Swing bus und Aggregator
		// Komponenten
		PowerflowModel pfModel = new PowerflowModel();
		pfModel.generatePowerFlowModel(top
				.getActorTopology().size() - 2, PowerflowType.LINE);
		
		pfModel.autoMap(top);
	}
}
