/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package actorMessageHistory;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

import akka.advancedMessages.ForwardActorFailureAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;

public class MessageHistory {
	/**
	 * fullActorpath to (TimeStep - Answers )Mapping
	 */
	private HashMap<String, HashMap<Integer, AnswerHistoryEntry>> phistory;
	/**
	 * after how many time steps should the first clean up be performed
	 */
	private int lastCleanupTimeStep;
	/**
	 * should cleanups be performed
	 */
	private boolean shoudCleanUp;

	public MessageHistory() {
		this.phistory = new HashMap<String, HashMap<Integer, AnswerHistoryEntry>>();

		lastCleanupTimeStep = 300;
		shoudCleanUp = true;
	}

	/**
	 * Add an answer to the History
	 * 
	 * @param answer
	 *            the answer in context
	 * @param timeStep
	 *            the timeStep to which the current answer should be assigned to
	 */
	public void addHistoryEntry(int timeStep, BasicAnswer answer) {
		if (!(answer.answerContent instanceof ForwardActorFailureAnswerContent))
		{
			cleanUp(timeStep);

			HashMap<Integer, AnswerHistoryEntry> pathEntry = phistory.get(answer.senderPath);
			if (pathEntry == null)
				pathEntry = new HashMap<Integer, AnswerHistoryEntry>();

			AnswerHistoryEntry answerEntry = pathEntry.get(timeStep);

			if (answerEntry == null)
				answerEntry = new AnswerHistoryEntry();

			answerEntry.addAnswer(answer);

			pathEntry.put(timeStep, answerEntry);

			phistory.put(answer.senderPath, pathEntry);
		}
	}

	/**
	 * Get all the History entries for an specific Actor
	 * 
	 * @param errorActorPath
	 *            the fullpath of the actor whose history should be returned
	 * @return a List with all the available BasicAnswers
	 */
	public LinkedList<BasicAnswer> getHistoryEntries(String errorActorPath) {

		LinkedList<BasicAnswer> result = null;

		HashMap<Integer, AnswerHistoryEntry> timeStepMapping = phistory.get(errorActorPath);

		for (AnswerHistoryEntry ahe : timeStepMapping.values())
		{
			if (result == null)
				result = new LinkedList<>();

			result.addAll(ahe.getAllAnswers());
		}

		return result;
	}

	/**
	 * Get all the History entries of an specific Actor and where the answer has a certain type
	 * 
	 * @param errorActorPath
	 *            the fullpath of the actor whose history should be returned
	 * @param clazz
	 *            the type which the answers should fulfill
	 * @return a List with all the available BasicAnswers
	 */
	public LinkedList<BasicAnswer> getHistoryEntries(String errorActorPath, Class<? extends AnswerContent> clazz) {

		LinkedList<BasicAnswer> result = null;

		HashMap<Integer, AnswerHistoryEntry> timeStepMapping = phistory.get(errorActorPath);

		for (Entry<Integer, AnswerHistoryEntry> tmp : timeStepMapping.entrySet())
		{
			if (result == null)
				result = new LinkedList<>();

			result.addAll(tmp.getValue().getAllAnswers(clazz));
		}

		return result;
	}

	/**
	 * Get all the oldest History entry of an specific Actor and a specific answer type
	 * 
	 * @param errorActorPath
	 *            the fullpath of the actor whose history should be returned
	 * @param clazz
	 *            the type which the answers should fulfill
	 * @return the oldest Answer or null
	 */
	public BasicAnswer getOldestHistoryEntry(String errorActorPath, Class<? extends AnswerContent> clazz) {
		// System.out.println("Error Node was "+errorActorPath);

		HashMap<Integer, AnswerHistoryEntry> timeStepMapping = phistory.get(errorActorPath);

		BasicAnswer oldestAnswer = null;
		/*
		 * System.out.println("time step mapping "+timeStepMapping); System.out.println("error produzer "+errorActorPath);
		 * System.out.println("faulty answer "+clazz);
		 */
		for (Entry<Integer, AnswerHistoryEntry> tmp : timeStepMapping.entrySet())
		{
			LinkedList<BasicAnswer> answers = tmp.getValue().getAllAnswers(clazz);

			if (answers != null && !answers.isEmpty())
			{
				if (oldestAnswer == null)
					oldestAnswer = answers.getLast();
				else
				{
					if (oldestAnswer.timeStep < tmp.getKey())
						oldestAnswer = answers.getLast();
				}
			}
		}

		// System.out.println("Found History ("+oldestAnswer.senderPath+") answer "+oldestAnswer.answerContent);

		return oldestAnswer;
	}

	/**
	 * Get all the average History entries of an specific Actor and a specific answer type
	 * 
	 * @param errorActorPath
	 *            the fullpath of the actor whose history should be returned
	 * @param clazz
	 *            the type which the answers should fulfill
	 * @return the all the answers for the given type or null
	 */
	public LinkedList<BasicAnswer> getAverageHistoryEntry(String errorActorPath, Class<? extends AnswerContent> clazz) {
		// System.out.println("Error Node was "+errorActorPath);

		// maps timestep to answer
		HashMap<Integer, AnswerHistoryEntry> timeStepMapping = phistory.get(errorActorPath);

		LinkedList<BasicAnswer> resultAnswers = new LinkedList<BasicAnswer>();
		for (Entry<Integer, AnswerHistoryEntry> tmp : timeStepMapping.entrySet())
		{
			LinkedList<BasicAnswer> answers = tmp.getValue().getAllAnswers(clazz);

			if (answers != null && !answers.isEmpty())
			{
				resultAnswers.addAll(answers);

			}
		}

		if (resultAnswers.size() == 0)
			resultAnswers = null;

		return resultAnswers;
	}

	/**
	 * Checks if a cleanup should be performed and performs it
	 * 
	 * @param currentTimeStep
	 *            the current time step as reference.
	 */
	private void cleanUp(int currentTimeStep) {
		if (currentTimeStep > lastCleanupTimeStep && shoudCleanUp)
		{
			if (((currentTimeStep - lastCleanupTimeStep) % 100) == 0)
			{
				for (Entry<String, HashMap<Integer, AnswerHistoryEntry>> entry : phistory.entrySet())
				{
					HashMap<Integer, AnswerHistoryEntry> values = entry.getValue();
					LinkedList<Integer> delete = new LinkedList<Integer>();

					int lastValidTimeStep = currentTimeStep - lastCleanupTimeStep;

					if (lastValidTimeStep > 0)
					{
						for (Entry<Integer, AnswerHistoryEntry> value : values.entrySet())
						{
							if (value.getKey() < lastValidTimeStep)
								delete.add(value.getKey());
						}

						for (int tmp : delete)
						{
							values.remove(tmp);
						}
					}
				}
			}
		}
	}
}
