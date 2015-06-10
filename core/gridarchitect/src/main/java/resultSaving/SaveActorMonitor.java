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
 * Date: 06.11.13
 * Time: 16:02
 * To change this template use File | Settings | File Templates.
 */
public class SaveActorMonitor extends SaveBase{


    public SaveActorMonitor(int savingInterval) {
        super(savingInterval, SaveMode.MONITOR);
    }

    @Override
    public void save(ActorResults actorResults) {

    }
}
