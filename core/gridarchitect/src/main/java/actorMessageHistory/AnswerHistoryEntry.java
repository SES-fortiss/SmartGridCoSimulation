/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package actorMessageHistory;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;

public class AnswerHistoryEntry {
	/**
	 * Mapping from AnswerType to instances of the AnswerType
	 */
	private HashMap<Class<? extends AnswerContent>, LinkedList<BasicAnswer>> answerTypeMapping;

	public AnswerHistoryEntry() {
		this.answerTypeMapping = new HashMap<Class<? extends AnswerContent>, LinkedList<BasicAnswer>>();
	}

	/**
	 * Add an Answer to the history
	 * 
	 * @param answer
	 *            the answers which should be stored
	 */
	public void addAnswer(BasicAnswer answer) {
		if (answer.answerContent == null)
			System.out.println("addAnswer Answer is " + answer);
		Class<? extends AnswerContent> clazz = answer.answerContent.getClass();

		LinkedList<BasicAnswer> answers = answerTypeMapping.get(clazz);

		if (answers == null)
			answers = new LinkedList<BasicAnswer>();

		answers.add(answer);

		answerTypeMapping.put(clazz, answers);

	}

	/**
	 * Get all the Answers, no restrictions
	 * 
	 * @return a List with all available BasicAnswers
	 */
	public LinkedList<BasicAnswer> getAllAnswers() {
		LinkedList<BasicAnswer> res = new LinkedList<BasicAnswer>();

		Collection<LinkedList<BasicAnswer>> answers = answerTypeMapping.values();

		for (LinkedList<BasicAnswer> tmp : answers)
		{
			res.addAll(tmp);
		}

		return res;
	}

	/**
	 * Get all the Answers, which have as AnswerContentType - clazz
	 * 
	 * @param clazz
	 *            the Type which all AnswerContents should fulfill
	 * @return a List with all available BasicAnswers
	 */
	public LinkedList<BasicAnswer> getAllAnswers(Class<? extends AnswerContent> clazz) {
		return answerTypeMapping.get(clazz);
	}
}
