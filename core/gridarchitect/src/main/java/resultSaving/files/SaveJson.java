/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package resultSaving.files;

import powerflowApi.ActorResults;
import helper.SerializationHelper;
import resultSaving.SaveMode;

/**
 * Created with IntelliJ IDEA.
 * User: amack
 * Date: 29.10.13
 * Time: 13:29
 * To change this template use File | Settings | File Templates.
 */
public class SaveJson extends SaveFile{
    public SaveJson(int savingInterval) {
        super(savingInterval, "json", SaveMode.JSON);
    }

    @Override
    public void save(ActorResults actorResults) {
        String json = convertResultsToJson(actorResults);
        this.appendToFile(json, actorResults);
    }

    protected String convertResultsToJson(ActorResults actorResults) {
        return SerializationHelper.serializeObject(actorResults);
    }
}
