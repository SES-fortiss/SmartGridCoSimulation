/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package faultStrategy;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

import faultStrategy.StandartFaultStrategy;
import faultStrategy.backEnd.BasicFaultStrategy;
import faultStrategy.backEnd.StrategyTree;
import faultStrategy.backEnd.StrategyTreeEntry;
import faultStrategy.requests.EndMessageRequestContent;
import faultStrategy.requests.GetLastHistoryRequestContent;
import faultStrategy.requests.NextStrategyRequestContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;

public class BasicStrategyTest {

	@Test
	public void testStrategyAsRoot()
	{
		// Test Setup
		StrategyTree tree = new StrategyTree();
		BasicFaultStrategy newStrategy = new BasicFaultStrategy("test");
		
		LinkedList<Class<? extends RequestContent>> requests = new LinkedList<>();
		LinkedList<Class<? extends AnswerContent>> answers = new LinkedList<>();
		
		requests.add(NextStrategyRequestContent.class);
		
		BasicFaultStrategy otherStrategy = new StandartFaultStrategy(TestRequest1.class, TestAnswer1.class);
		
		tree.addPath(requests, answers, otherStrategy);
		newStrategy.addPathToStrategy(requests, answers, otherStrategy);
		
		// Tests
		Assert.assertEquals(1, newStrategy.getMaxNumberOfSteps());
		
		StrategyTreeEntry root = tree.getRoot();
		
		Assert.assertEquals(TestRequest1.class, root.getRequest());
		
		Assert.assertEquals(EndMessageRequestContent.class, tree.getNextRequest(new TestAnswer1(), root.getEntryId()).getRequest());
		Assert.assertEquals(GetLastHistoryRequestContent.class, tree.getNextRequest(new TestErrorNoAnswerContent(null), root.getEntryId()).getRequest());
		
		System.out.println(tree);
		System.out.println("<---------->");
	}
	
	@Test
	public void testStrategySinglePath()
	{
		// Test Setup
		StrategyTree tree = new StrategyTree();
		BasicFaultStrategy newStrategy = new BasicFaultStrategy("test");
		
		LinkedList<Class<? extends RequestContent>> requests = new LinkedList<>();
		LinkedList<Class<? extends AnswerContent>> answers = new LinkedList<>();
		
		requests.add(TestRequest1.class);
		requests.add(NextStrategyRequestContent.class);
		
		answers.add(TestAnswer1.class);
		
		BasicFaultStrategy otherStrategy = new StandartFaultStrategy(TestRequest2.class, TestAnswer2.class);
		
		tree.addPath(requests, answers, otherStrategy);
		newStrategy.addPathToStrategy(requests, answers, otherStrategy);
		
		// Tests
		Assert.assertEquals(2, newStrategy.getMaxNumberOfSteps());
		
		StrategyTreeEntry root = tree.getRoot();
		
		Assert.assertEquals(TestRequest1.class, root.getRequest());
		
		StrategyTreeEntry tmpEntry = tree.getNextRequest(new TestAnswer1(), root.getEntryId());
		Assert.assertEquals(TestRequest2.class, tmpEntry.getRequest());
		
		StrategyTreeEntry end = tree.getNextRequest(new TestAnswer2(), tmpEntry.getEntryId());
		StrategyTreeEntry wrong = tree.getNextRequest(new TestErrorNoAnswerContent(null), tmpEntry.getEntryId());
		
		Assert.assertEquals(EndMessageRequestContent.class, end.getRequest());
		Assert.assertEquals(GetLastHistoryRequestContent.class, wrong.getRequest());
		
		System.out.println(tree);
		System.out.println("<---------->");
	}
	
	@Test
	public void testStrategyTwoPath()
	{
		// Test Setup
		StrategyTree tree = new StrategyTree();
		BasicFaultStrategy newStrategy = new BasicFaultStrategy("test");
		
		LinkedList<Class<? extends RequestContent>> requests = new LinkedList<>();
		LinkedList<Class<? extends AnswerContent>> answers = new LinkedList<>();
		
		requests.add(TestRequest1.class);
		requests.add(NextStrategyRequestContent.class);
		
		answers.add(TestAnswer1.class);
		
		BasicFaultStrategy otherStrategy = new StandartFaultStrategy(TestRequest1.class, TestAnswer1.class);
		
		tree.addPath(requests, answers, otherStrategy);
		newStrategy.addPathToStrategy(requests, answers, otherStrategy);
		
		requests = new LinkedList<>();
		answers = new LinkedList<>();
		
		requests.add(TestRequest1.class);
		requests.add(TestRequest2.class);
		requests.add(NextStrategyRequestContent.class);
		
		answers.add(TestAnswer2.class);
		answers.add(TestAnswer2.class);
		
		otherStrategy = new StandartFaultStrategy(TestRequest2.class, TestAnswer2.class);
		
		tree.addPath(requests, answers, otherStrategy);
		newStrategy.addPathToStrategy(requests, answers, otherStrategy);
		
		// Tests
		Assert.assertEquals(3, newStrategy.getMaxNumberOfSteps());
		
		StrategyTreeEntry root = tree.getRoot();
		
		Assert.assertEquals(TestRequest1.class, root.getRequest());
		
		// Tests first strategy
		StrategyTreeEntry tmpEntry1 = tree.getNextRequest(new TestAnswer1(), root.getEntryId());
		Assert.assertEquals(TestRequest1.class, tmpEntry1.getRequest());
		
		StrategyTreeEntry end = tree.getNextRequest(new TestAnswer1(), tmpEntry1.getEntryId());
		StrategyTreeEntry wrong = tree.getNextRequest(new TestErrorNoAnswerContent(null), tmpEntry1.getEntryId());
		
		Assert.assertEquals(EndMessageRequestContent.class, end.getRequest());
		Assert.assertEquals(GetLastHistoryRequestContent.class, wrong.getRequest());
		
		// Test second path
		StrategyTreeEntry tmpEntry2 = tree.getNextRequest(new TestAnswer2(), root.getEntryId());
		Assert.assertEquals(TestRequest2.class, tmpEntry2.getRequest());
		
		StrategyTreeEntry strategy = tree.getNextRequest(new TestAnswer2(), tmpEntry2.getEntryId());
		Assert.assertEquals(TestRequest2.class, strategy.getRequest());
		
		StrategyTreeEntry end2 = tree.getNextRequest(new TestAnswer2(), strategy.getEntryId());
		StrategyTreeEntry wrong2 = tree.getNextRequest(new TestErrorNoAnswerContent(null), strategy.getEntryId());
		
		Assert.assertEquals(EndMessageRequestContent.class, end2.getRequest());
		Assert.assertEquals(GetLastHistoryRequestContent.class, wrong2.getRequest());
		System.out.println(tree);
		System.out.println("<---------->");
	}
}
