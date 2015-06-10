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
import resultSaving.SaveMode;

/**
 * Created with IntelliJ IDEA.
 * User: amack
 * Date: 29.10.13
 * Time: 13:29
 * To change this template use File | Settings | File Templates.
 */

public class SaveCsv extends SaveFile{
	
	static int defaultSavingInterval = 1;
    
	public SaveCsv(int savingInterval) {
        super(savingInterval, "csv", SaveMode.CSV);
    }
	
	public SaveCsv() {
        super(defaultSavingInterval, "csv", SaveMode.CSV);
    }

    @Override
    public void save(ActorResults actorResults) {
        String csv = actorResults.toString();
        if (!this.resultFileExists(actorResults)) csv = addCsvHeader(csv);
        this.appendToFile(csv, actorResults);
    }

	protected String addCsvHeader(String csv) {
        return "timeStep,current,voltage,power,resistance\n"+csv;
    }
}
