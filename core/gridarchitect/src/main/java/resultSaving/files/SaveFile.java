/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package resultSaving.files;


import helper.GlobalOptions;
import helper.IoHelper;

import java.io.File;

import powerflowApi.ActorResults;
import resultSaving.SaveBase;
import resultSaving.SaveMode;


/**
 * Created with IntelliJ IDEA.
 * User: amack
 * Date: 29.10.13
 * Time: 13:31
 * To change this template use File | Settings | File Templates.
 */
public abstract class SaveFile extends SaveBase {
    
	protected String filePath;
    protected final String fileType;

    protected SaveFile(int savingInterval, String fileType, SaveMode saveMode) {
        super(savingInterval, saveMode);
        this.fileType = fileType;
    }

    protected String getFilePath(ActorResults actorResults) {
        if (this.filePath == null) this.determineFilePath(actorResults);
        return this.filePath;
    }

    protected void determineFilePath(ActorResults actorResults) {
        this.filePath = GlobalOptions.resultFolderPath("Test")+replaceSlashInActorPath(actorResults.actorPath)+
                "."+this.fileType;
    }

    protected String replaceSlashInActorPath(String actorPath) {
        return actorPath.substring(1).replace("/", "_");
    }

    protected void appendToFile(String content, ActorResults actorResults) {
        IoHelper.appendToFile(getFilePath(actorResults), content);
    }

    protected boolean resultFileExists(ActorResults actorResults) {
        return new File(getFilePath(actorResults)).exists();
    }
}
