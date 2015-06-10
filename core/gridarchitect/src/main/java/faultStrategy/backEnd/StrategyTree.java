/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package faultStrategy.backEnd;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import faultStrategy.requests.NextStrategyRequestContent;
import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;

/**
 * StrategyTree 15.07.2014
 * 
 * @author Luc
 *
 */
public class StrategyTree {
	/**
	 * a mapping of an TreeEntry to the next possible Steps ( as Id)
	 */
	private HashMap<StrategyTreeEntry, LinkedList<Integer>> stepMapping;
	/**
	 * Every StrategyTreeEntry is mapped to an unique Integer Id
	 */
	private HashMap<Integer, StrategyTreeEntry> idMapping;
	private StrategyTreeEntry root;

	public StrategyTree() {
		this.stepMapping = new HashMap<>();
		idMapping = new HashMap<>();
		root = null;
	}

	/**
	 * Add a possible path, to the tree
	 * 
	 * @param requestPath
	 *            the Requests in the preferred order
	 * @param expectedAnswers
	 *            the Answers in the preferred order
	 */
	public void addPath(LinkedList<Class<? extends RequestContent>> requestPath, LinkedList<Class<? extends AnswerContent>> expectedAnswers, BasicFaultStrategy otherStrategy) {
		// check if there is not yet a Tree
		if (root == null)
		{
			LinkedList<StrategyTreeEntry> tmpValueList = new LinkedList<>();
			int answerCounter = -1;
			for (int i = 0; i < requestPath.size(); i++)
			{
				Class<? extends RequestContent> rc = requestPath.get(i);
				StrategyTreeEntry newEntry;

				if (answerCounter == -1)
				{
					if (rc.equals(NextStrategyRequestContent.class))
					{
						newEntry =otherStrategy.currentStrategy.root;
						
						root = newEntry;
						
						addStrategy(otherStrategy);
					}
					else
					{
						// add the first Entry into the Tree-> it is the root
						newEntry = new StrategyTreeEntry(rc, null);
	
						tmpValueList.add(newEntry);
						root = newEntry;
	
						stepMapping.put(newEntry, new LinkedList<Integer>());
						idMapping.put(newEntry.getEntryId(), newEntry);
					}
				}
				else
				{
					if (rc.equals(NextStrategyRequestContent.class))
					{
						//Combine the last entry with the other strategy
						newEntry = otherStrategy.currentStrategy.root;
						newEntry.setAnswerPreviousRequest(expectedAnswers.get(answerCounter));
						
						LinkedList<Integer> ids = stepMapping.get(tmpValueList.getLast());
						ids.add(newEntry.getEntryId());
						stepMapping.put(tmpValueList.getLast(), ids);
						
						addStrategy(otherStrategy);
					}
					else
					{
						// there is now a root. We have to add the other branches
						newEntry = new StrategyTreeEntry(rc, expectedAnswers.get(answerCounter));
	
						LinkedList<Integer> ids = stepMapping.get(tmpValueList.getLast());
						ids.add(newEntry.getEntryId());
						stepMapping.put(tmpValueList.getLast(), ids);
	
						tmpValueList.add(newEntry);
						idMapping.put(newEntry.getEntryId(), newEntry);
						stepMapping.put(newEntry, new LinkedList<Integer>());
					}
				}

				answerCounter++;
			}
		}
		else
		{
			// There is already an existing Tree
			StrategyTreeEntry previousEntry = null;

			Iterator<Class<? extends RequestContent>> it = requestPath.iterator();
			if (it.hasNext())
			{
				// check the root
				Class<? extends RequestContent> rc = it.next();

				StrategyTreeEntry newEntry = new StrategyTreeEntry(rc, null);

				StrategyTreeEntry mapValue = null;
				if (root.equals(newEntry))
				{
					mapValue = root;
				}

				// is not contained in map
				if (mapValue == null)
					throw new IllegalArgumentException("2 roots are not possible");
				else
					previousEntry = mapValue;

				int answerCounter = 0;
				// check as long as we can find an existing entry
				while (mapValue != null)
				{
					// as long as there are entries in the path to test
					if (it.hasNext())
					{
						Class<? extends AnswerContent> currentAnswer = expectedAnswers.get(answerCounter);

						rc = it.next();

						newEntry = new StrategyTreeEntry(rc, currentAnswer);

						LinkedList<Integer> nextIds = stepMapping.get(previousEntry);

						mapValue = null;

						// check the children
						for (Integer i : nextIds)
						{
							StrategyTreeEntry nextToTest = idMapping.get(i);

							// System.out.println("this "+newEntry);
							// System.out.println("other "+nextToTest);
							// System.out.println("result "+nextToTest.equals(newEntry));

							// there is already an entry
							if (nextToTest.equals(newEntry))
							{
								mapValue = nextToTest;
								previousEntry = nextToTest;
								break;
							}
						}
						// increase only if we found an existing entry
						if (mapValue != null)
							answerCounter++;
					}
					else
					{
						mapValue = null;
					}
				}

				if (it.hasNext())
				{
					boolean notIntial = false;
					// add the new stuff
					while (it.hasNext())
					{
						if (notIntial)
						{
							rc = it.next();
							answerCounter++;
						}

						Class<? extends AnswerContent> currentAnswer = expectedAnswers.get(answerCounter);
						if (rc.equals(NextStrategyRequestContent.class))
						{
							//Combine the last entry with the other strategy
							newEntry = otherStrategy.currentStrategy.root;
							newEntry.setAnswerPreviousRequest(currentAnswer);
							
							LinkedList<Integer> ids = stepMapping.get(previousEntry);
							ids.add(newEntry.getEntryId());
							stepMapping.put(previousEntry, ids);
							
							addStrategy(otherStrategy);
						}
						else
						{
							newEntry = new StrategyTreeEntry(rc, currentAnswer);
	
							// get the old value and the new reference to the map
							LinkedList<Integer> oldValues = this.stepMapping.get(previousEntry);
							oldValues.add(newEntry.getEntryId());
							this.stepMapping.put(previousEntry, oldValues);
	
							// add the new one
							this.stepMapping.put(newEntry, new LinkedList<Integer>());
							this.idMapping.put(newEntry.getEntryId(), newEntry);
						}

						previousEntry = newEntry;
						mapValue = newEntry;

						notIntial = true;

					}
				}
				else
				{
					if (newEntry.getRequest().equals(NextStrategyRequestContent.class))
					{
						//Combine the last entry with the other strategy
						Class<? extends AnswerContent> currentAnswer = newEntry.getAnswerPreviousRequest();
						newEntry = otherStrategy.currentStrategy.root;
						newEntry.setAnswerPreviousRequest(currentAnswer);
						
						LinkedList<Integer> ids = stepMapping.get(previousEntry);
						ids.add(newEntry.getEntryId());
						stepMapping.put(previousEntry, ids);
						
						addStrategy(otherStrategy);
					}
					else
					{
						// System.out.println("missing");
						LinkedList<Integer> oldValues = this.stepMapping.get(previousEntry);
						oldValues.add(newEntry.getEntryId());
						this.stepMapping.put(previousEntry, oldValues);
	
						// add the new one
						this.stepMapping.put(newEntry, new LinkedList<Integer>());
						this.idMapping.put(newEntry.getEntryId(), newEntry);
					}
				}
			}
		}
	}

	/**
	 * Get the Root of the Tree
	 * 
	 * @return A StrategyTreeEntry Object
	 */
	public StrategyTreeEntry getRoot() {
		return root;
	}

	/**
	 * Returns the next Step, chosen by the provided parameters
	 * 
	 * @param answer
	 *            the answer from the previous Request
	 * @param previousRequestId
	 *            the Id of the previous Request
	 * @return the logical next Step, according to the Tree
	 */
	public StrategyTreeEntry getNextRequest(AnswerContent answer, int previousRequestId) {
		StrategyTreeEntry result = null;

		StrategyTreeEntry tmp = this.idMapping.get(previousRequestId);

		if (tmp == null)
			throw new IllegalArgumentException("previousRequestId not found");
		else
		{
			LinkedList<Integer> nextSteps = this.stepMapping.get(tmp);

			// System.out.println(this);

			for (Integer currentId : nextSteps)
			{
				StrategyTreeEntry nextStep = this.idMapping.get(currentId);

				// System.out.println(this);
				if (nextStep.getAnswerPreviousRequest().equals(answer.getClass()))
				{
					// System.out.println("found the correct point");
					result = nextStep;
					break;
				}
				else
				{
					// System.out.println("not correct");
				}
			}
			
			// it might be the case that the current Strategy is the standart strategy so, every error is interpret as the same
			if (answer instanceof ErrorAnswerContent)
			{
				for (Integer currentId : nextSteps)
				{
					StrategyTreeEntry nextStep = this.idMapping.get(currentId);

					// System.out.println(this);
					//System.out.println("superclass "+ nextStep.getAnswerPreviousRequest().getEnclosingClass() );
					if (nextStep.getAnswerPreviousRequest().equals(ErrorAnswerContent.class))
					{
						// System.out.println("found the correct point");
						result = nextStep;
						break;
					}
					else
					{
						// System.out.println("not correct");
					}
				}
			}
			
		}
		/*
		 * System.out.println("-------------------------"); System.out.println("Previous request was "+tmp);
		 * System.out.println("Next step is "+result); System.out.println("Got answer is "+answer); System.out.println("-------------------------");
		 */

		return result;
	}

	@Override
	public String toString() {
		String res = "";

		return recString(res, root);
	}

	/**
	 * Recursively travel through the Tree
	 * 
	 * @param before
	 *            the String until the current point
	 * @param current
	 *            the current Entry which should be processed
	 * @return a String which describes the Tree
	 */
	private String recString(String before, StrategyTreeEntry current) {
		String res = "";
		LinkedList<Integer> nextids = stepMapping.get(current);

		if (before.isEmpty())
			before += current;
		else
			before += " --> " + current;

		if (nextids.isEmpty())
		{
			before += System.getProperty("line.separator");
			before += "----------------";
			before += System.getProperty("line.separator");

			res += before;
		}
		else
		{
			for (Integer i : nextids)
			{
				StrategyTreeEntry next = idMapping.get(i);
				res += recString(before, next);
			}
		}

		return res;

	}

	/**
	 * If the StrategyTree does not contain the correct Requests, the Requests can be changed inside the tree with this function. The structure of the
	 * Tree rests untouched
	 * 
	 * @param requestMapping
	 *            a Mapping from old RequestContent to the new RequestContent
	 * @param answerMapping
	 *            a Mapping from old AnswerContent to the new AnswerContent
	 */
	public void changeContent(HashMap<Class<? extends RequestContent>, Class<? extends RequestContent>> requestMapping,
			HashMap<Class<? extends AnswerContent>, Class<? extends AnswerContent>> answerMapping) {
		Set<StrategyTreeEntry> treeEntries = stepMapping.keySet();

		for (StrategyTreeEntry tEntry : treeEntries)
		{
			// change Requests
			Class<? extends RequestContent> newRequestValue = requestMapping.get(tEntry.getRequest());

			// System.out.println("oldRequest was "+tEntry.getRequest()+" new is "+newRequestValue);
			if (newRequestValue != null)
				tEntry.changeRequestContent(newRequestValue);

			// change Answers
			if (tEntry.getAnswerPreviousRequest() != null)
			{
				Class<? extends AnswerContent> newAnswerValue = answerMapping.get(tEntry.getAnswerPreviousRequest());

				// System.out.println(answerMapping);
				// System.out.println("oldAnswer was "+tEntry.getAnswerPreviousRequest()+" new is "+newAnswerValue);
				if (newAnswerValue != null)
					tEntry.changeAnswerContent(newAnswerValue);
			}
		}

		// System.out.println(this);
		// finish the changes
		for (StrategyTreeEntry tEntry : treeEntries)
		{
			tEntry.resetAfterChanges();
		}
	}

	/**
	 * Returns an object for all the different Types of Request which are contained in the Tree
	 * 
	 * @return a List with Type unique RequestContents
	 */
	public LinkedList<Class<? extends RequestContent>> getAllRequestTypes() {
		HashSet<Class<? extends RequestContent>> tmp = new HashSet<Class<? extends RequestContent>>();

		LinkedList<Class<? extends RequestContent>> res = new LinkedList<Class<? extends RequestContent>>();

		for (StrategyTreeEntry entry : idMapping.values())
		{
			tmp.add(entry.getRequest());
		}

		res.addAll(tmp);

		return res;
	}
	
	private void addStrategy(BasicFaultStrategy otherStrategy)
	{
		HashMap<Integer, StrategyTreeEntry> otherIdMapping = otherStrategy.currentStrategy.idMapping;
		HashMap<StrategyTreeEntry, LinkedList<Integer>> otherStepMapping = otherStrategy.currentStrategy.stepMapping;
		
		stepMapping.putAll(otherStepMapping);
		idMapping.putAll(otherIdMapping);
	}
}
