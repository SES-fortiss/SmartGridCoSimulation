/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package behavior.advancedBehaviorModels;

import java.util.List;

import akka.basicMessages.RequestContent;

public abstract class SimpleInitiatorBehaviorModel extends SimpleBehaviorModel{
	
	
	/**
	 * Allows to change the Requests (root Node only), which should be send in the next TimeStep 
	 * @return a List with all the Requests
	 */
	public abstract List<RequestContent> changeRequestsForNextTimeStep();
	
	public boolean equals(Object o)
	{
		boolean res =false;
		
		if (o instanceof SimpleInitiatorBehaviorModel)
		{
			if (this.parent.fullActorPath.equals(((SimpleInitiatorBehaviorModel) o).parent.fullActorPath))
				res = true;
		}
		
		return res;
	}
}
