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

import org.slf4j.LoggerFactory;

import powerflowApi.ActorResults;
import resultSaving.SaveMode;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.core.FileAppender;


/**
 * Created with IntelliJ IDEA.
 * User: amack
 * Date: 29.10.13
 * Time: 13:30
 * To change this template use File | Settings | File Templates.
 */

public class SaveLog extends SaveFile {

    private final Logger log = (Logger) LoggerFactory.getLogger(this.getClass());
    private boolean init = false;
	
    @SuppressWarnings("rawtypes")
	private final FileAppender fileAppender = new FileAppender();
    final LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();

    public SaveLog(int savingInterval) {
        super(savingInterval, "log", SaveMode.LOG);
        fileAppender.setContext(loggerContext);
        fileAppender.setName("Results");
    }

    @Override
    public void save(ActorResults actorResults) {
        if (!init) initLogger(actorResults);
    }

	@SuppressWarnings("unchecked")
	protected void initLogger(ActorResults actorResults) {
        fileAppender.setFile(GlobalOptions.resultFolderPath("Test")+"results.log");
        PatternLayoutEncoder encoder = new PatternLayoutEncoder();
        encoder.setContext(loggerContext);
        encoder.setPattern("%msg");
        encoder.start();

        fileAppender.setEncoder(encoder);
        fileAppender.start();

        log.addAppender(fileAppender);
        init = true;
    }
}
