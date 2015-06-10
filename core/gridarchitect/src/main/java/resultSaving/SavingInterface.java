/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package resultSaving;

import powerflowApi.ActorResults;

/**
 * Created with IntelliJ IDEA.
 * User: amack
 * Date: 29.10.13
 * Time: 18:41
 * To change this template use File | Settings | File Templates.
 */
public interface SavingInterface {
    public int getSavingInterval();
    public void save(ActorResults actorResults);
}
