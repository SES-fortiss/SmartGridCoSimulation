/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package helper;

import java.io.FileWriter;
import java.io.IOException;

import akka.basicMessages.AnswerContent;
import behavior.BehaviorModel;

public abstract class FileRecorderGridarchitect {

	protected String header = "Time, value1, value2";
	private boolean notCreated = true;
	protected BehaviorModel model;
	private FileWriter writer;

	public FileRecorderGridarchitect() {
		super();
	}

	public void saveAnswer(AnswerContent answer) {		
		try {
			
			if (notCreated) {
				createFile();
				notCreated = false;
			}
			
			writer.write("\n" + answer.toString());			
		} catch (IOException e) {e.getStackTrace();}		
	}
	
	private void createFile() throws IOException {		
		writer = new FileWriter(model.actorName + ".csv");
		writer.write(header);			
	}
	
	public void close() {
		try {
			writer.close();
			System.out.println("File created: " + model.actorName + ".csv");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}