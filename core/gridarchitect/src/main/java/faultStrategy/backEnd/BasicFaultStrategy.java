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
import java.util.LinkedList;
import java.util.Map.Entry;

import resultLogger.ConstantLogger;
import faultStrategy.requests.EndMessageRequestContent;
import akka.advancedMessages.ErrorAnswerContent;
import akka.basicActors.BasicActor;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;

/**
 * BasicStrategy 15.07.2014
 * 
 * @author Luc
 *
 */
public class BasicFaultStrategy {

	/**
	 * tells which node (path) are already finished with processing -> true = finished
	 */
	private HashMap<String, Boolean> childrenProcessingStatus;

	protected StrategyTree currentStrategy;
	
	/**
	 * maximum number of request steps (number of actual requests, in general number of requests without the EndMessageRequest/GetHistoryRequest/NextStrategyRequest) 
	 */
	private int maxNumberOfSteps;
	/**
	 * tells which node(path) is currently processing which step
	 */
	private HashMap<String, StrategyTreeEntry> currentChildrenProcessing;

	/**
	 * if only one node is currently handling an error this boolean is true
	 */
	private boolean errorHandlingStarted;
	
	private String strategyName;

	public BasicFaultStrategy(String name) {
		childrenProcessingStatus = new HashMap<>();
		currentChildrenProcessing = new HashMap<>();
		currentStrategy = new StrategyTree();
		errorHandlingStarted = false;
		strategyName= name;
		maxNumberOfSteps=0;
	}

	/**
	 * Sets back the Strategy to the initial state, but does not remove the StrategyTree
	 */
	public void resetStrategy() {
		childrenProcessingStatus = new HashMap<>();
		currentChildrenProcessing = new HashMap<>();
		errorHandlingStarted = false;
	}

	/**
	 * add Node (Child) to the list of nodes which should be watched/processed they already get initialized with the root of the tree ( so the
	 * 
	 * @param path
	 *            the path of the node which is added
	 */
	public void addChild(String path) {

		this.childrenProcessingStatus.put(path, false);
		this.currentChildrenProcessing.put(path, currentStrategy.getRoot());
	}

	/**
	 * Add a list of Nodes (Children) to the list of nodes which should be watched/processed
	 * 
	 * @param father
	 *            the Actor which is the father of all the children
	 * @param childrenNames
	 */
	public void addChildren(BasicActor father, HashSet<String> childrenNames) {
		// get the path
		String simplePath = father.getSelf().path().toString();

		for (String name : childrenNames)
		{
			String path = simplePath + "/" + name;
			addChild(path);
		}
	}

	/**
	 * Sets a node to finished processing. E.g. the Node delivered some result to his parent
	 * 
	 * @param path
	 *            the path of the child
	 */
	public void setFinished(String path) {
		this.childrenProcessingStatus.put(path, true);
		this.currentChildrenProcessing.remove(path);
	}
	
	public void setAllFinished() {
		
		for (String currentPath :this.childrenProcessingStatus.keySet())
		{
			this.childrenProcessingStatus.put(currentPath, true);
		}
		this.currentChildrenProcessing.clear();
	}
	

	/**
	 * Check if all the nodes already finished
	 * 
	 * @return true if all nodes have finished their processing, false otherwhise
	 */
	public Boolean isFinished() {
		boolean res = true;
		for (Entry<String, Boolean> current : childrenProcessingStatus.entrySet())
		{
			res = res && current.getValue();
		}

		if (res)
			errorHandlingStarted = false;

		return res;
	}

	/**
	 * Check if there exits another Request which follows after the given Answer
	 * 
	 * @param path
	 *            the full path of the node in context
	 * @param answer
	 *            the last answer which the node received
	 * @return true if there is another Request, else false
	 */
	public boolean existsNextRequest(String path, AnswerContent answer) {
		boolean res = true;
	/*	System.out.println("------------------------");
		System.out.println("got path "+path);
		System.out.println(currentChildrenProcessing);*/
		
		StrategyTreeEntry lastRequest = this.currentChildrenProcessing.get(path);
		
	/*	System.out.println("lastRequest "+lastRequest);
		System.out.println("answer "+answer);
		System.out.println("------------------------");*/
		StrategyTreeEntry nextRequest = this.currentStrategy.getNextRequest(answer, lastRequest.getEntryId());

		if (nextRequest == null)
			res = false;
		else
		{
			if (nextRequest.getRequest().equals(EndMessageRequestContent.class))
				res = false;
		}

		return res;
	}

	/**
	 * Gets the next Request from the strategy which follows after the given Answer
	 * 
	 * @param path
	 *            the full path of the node in context
	 * @param answer
	 *            the last answer which the node received
	 * @return the next RequestContent
	 */
	public RequestContent getNextRequest(String path, AnswerContent answer) {
		if (answer instanceof ErrorAnswerContent)
		{
			errorHandlingStarted = true;
		}
		
		StrategyTreeEntry lastRequest = this.currentChildrenProcessing.get(path);

		StrategyTreeEntry nextTreeEntry = this.currentStrategy.getNextRequest(answer, lastRequest.getEntryId());
		this.currentChildrenProcessing.put(path, nextTreeEntry);

		Class<? extends RequestContent> nextRequest = nextTreeEntry.getRequest();
		
		ConstantLogger.logStrategyUsages(path, answer, nextRequest, currentStrategy.getRoot().getRequest());
		try
		{
			return nextRequest.newInstance();
		}
		catch (InstantiationException | IllegalAccessException e)
		{
			e.printStackTrace();
		}
		
		return null;
			
	}

	/**
	 * Get the longest sequence of steps.
	 * 
	 * @return a number between 0 and X
	 */
	public int getMaxNumberOfSteps() {
		return maxNumberOfSteps;
	}

	/**
	 * Checks if Error Handling is currently active
	 * 
	 * @return true if yes, false otherwise
	 */
	public boolean isErrorHandlingActive() {
		isFinished();
		return errorHandlingStarted;
	}

	/**
	 * Change the Strategy to another Request
	 * 
	 * @param requestMapping
	 *            a mapping from the old Request to the new Request
	 * @param answerMapping
	 *            a mapping from the old Answer to the new Answer
	 */
	public void changeContent(HashMap<Class<? extends RequestContent>, Class<? extends RequestContent>> requestMapping,
			HashMap<Class<? extends AnswerContent>, Class<? extends AnswerContent>> answerMapping) {
		this.currentStrategy.changeContent(requestMapping, answerMapping);
	}

	public String toString() {
		String res= strategyName+System.getProperty("line.separator");
		res+= currentStrategy.toString();
		
		return res;
	}

	/**
	 * Returns a List with instances of Requests for every Request Type in the strategy
	 * 
	 * @return a List with type unique RequestContents
	 */
	public LinkedList<Class<? extends RequestContent>> getAllRequestsTypes() {
		return this.currentStrategy.getAllRequestTypes();
	}

	public String getStrategyName() {
		return strategyName;
	}
	
	public Class<? extends RequestContent> getRootRequest()
	{
		return this.currentStrategy.getRoot().getRequest();
	}
	
	public void addPathToStrategy(LinkedList<Class<? extends RequestContent>> requestPath, LinkedList<Class<? extends AnswerContent>> answerPath)
	{
		currentStrategy.addPath(requestPath, answerPath, null);
		
		if ((requestPath.size()-1)>getMaxNumberOfSteps())
			maxNumberOfSteps= (requestPath.size()-1);
	}
	
	public void addPathToStrategy(LinkedList<Class<? extends RequestContent>> requestPath, LinkedList<Class<? extends AnswerContent>> answerPath, BasicFaultStrategy otherStrategy)
	{
		currentStrategy.addPath(requestPath, answerPath, otherStrategy);
		
		if (otherStrategy != null )
		{
			int tmp = (requestPath.size()-1)+otherStrategy.getMaxNumberOfSteps();
			
			if (tmp>getMaxNumberOfSteps())
				maxNumberOfSteps=tmp;
		}
		else
		{
			if ((requestPath.size()-1)>getMaxNumberOfSteps())
				maxNumberOfSteps= (requestPath.size()-1);
		}
	}

}
