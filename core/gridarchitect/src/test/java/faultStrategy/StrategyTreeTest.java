/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package faultStrategy;

import java.util.HashMap;
import java.util.LinkedList;

import junit.framework.Assert;

import org.junit.Test;

import faultStrategy.backEnd.StrategyTree;
import faultStrategy.backEnd.StrategyTreeEntry;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;

/**
 * strategyTest 15.07.2014
 * 
 * @author Luc
 *
 */
public class StrategyTreeTest {

	@Test
	public void testStrategyTreeEntry() {

		StrategyTreeEntry entry1 = new StrategyTreeEntry(TestRequest1.class, TestAnswer1.class);
		StrategyTreeEntry entry11 = new StrategyTreeEntry(TestRequest1.class, TestAnswer1.class);
		Assert.assertEquals(true, entry1.equals(entry11));
		
		StrategyTreeEntry entry2 = new StrategyTreeEntry(TestRequest1.class, TestAnswer1.class);
		StrategyTreeEntry entry22 = new StrategyTreeEntry(TestRequest1.class, TestAnswer2.class);
		Assert.assertEquals(false, entry2.equals(entry22));
		
		StrategyTreeEntry entry3 = new StrategyTreeEntry(TestRequest1.class, TestAnswer1.class);
		StrategyTreeEntry entry33 = new StrategyTreeEntry(TestRequest2.class, TestAnswer1.class);
		Assert.assertEquals(false, entry3.equals(entry33));
		
		StrategyTreeEntry entry4 = new StrategyTreeEntry(TestRequest1.class, TestAnswer1.class);
		StrategyTreeEntry entry44 = new StrategyTreeEntry(TestRequest2.class, TestAnswer2.class);
		Assert.assertEquals(false, entry4.equals(entry44));


	}

	
	
	
	
	@Test
	public void testTree() {
		StrategyTree tree = new StrategyTree();

		LinkedList<Class<? extends RequestContent>> requests = new LinkedList<>();
		TestRequest1 r1 = new TestRequest1();
		r1.value = "Bla";

		TestRequest2 r2 = new TestRequest2();
		r2.value = "Bla2";

		requests.add(r1.getClass());
		requests.add(r2.getClass());

		LinkedList<Class<? extends AnswerContent>> answers = new LinkedList<>();
		TestAnswer1 a1 = new TestAnswer1();
		a1.answer = "Huhu";

		TestAnswer2 a2 = new TestAnswer2();
		a2.answer = "Huhu2";

		answers.add(a1.getClass());

		tree.addPath(requests, answers,null);

		Assert.assertEquals(r1.getClass(), tree.getRoot().getRequest());

		StrategyTreeEntry previousEntry = tree.getRoot();

		Assert.assertEquals(r2.getClass(), tree.getNextRequest(a1, previousEntry.getEntryId()).getRequest());

		Assert.assertEquals(null, tree.getNextRequest(a2, previousEntry.getEntryId()));

		// -----------------
		requests = new LinkedList<>();

		requests.add(r1.getClass());
		requests.add(r1.getClass());
		requests.add(r1.getClass());
		requests.add(r2.getClass());

		answers = new LinkedList<>();
		answers.add(a2.getClass());
		answers.add(a2.getClass());
		answers.add(a1.getClass());

		tree.addPath(requests, answers,null);

		// Test old Path again
		Assert.assertEquals(r1.getClass(), tree.getRoot().getRequest());
		previousEntry = tree.getRoot();
		Assert.assertEquals(r2.getClass(), tree.getNextRequest(a1, previousEntry.getEntryId()).getRequest());

		// Test new Path
		Assert.assertEquals(r1.getClass(), tree.getNextRequest(a2, previousEntry.getEntryId()).getRequest());
		previousEntry = tree.getNextRequest(a2, previousEntry.getEntryId());
		Assert.assertEquals(r1.getClass(), tree.getNextRequest(a2, previousEntry.getEntryId()).getRequest());
		previousEntry = tree.getNextRequest(a2, previousEntry.getEntryId());

		Assert.assertEquals(r2.getClass(), tree.getNextRequest(a1, previousEntry.getEntryId()).getRequest());

		// -----------------
		requests = new LinkedList<>();

		requests.add(r1.getClass());
		requests.add(r1.getClass());
		requests.add(r2.getClass());
		requests.add(r2.getClass());

		answers = new LinkedList<>();
		answers.add(a2.getClass());
		answers.add(a1.getClass());
		answers.add(a1.getClass());

		tree.addPath(requests, answers,null);

		// Test old Path again
		Assert.assertEquals(r1.getClass(), tree.getRoot().getRequest());
		previousEntry = tree.getRoot();
		Assert.assertEquals(r2.getClass(), tree.getNextRequest(a1, previousEntry.getEntryId()).getRequest());

		// Test new Path
		Assert.assertEquals(r1.getClass(), tree.getNextRequest(a2, previousEntry.getEntryId()).getRequest());
		previousEntry = tree.getNextRequest(a2, previousEntry.getEntryId());
		Assert.assertEquals(r2.getClass(), tree.getNextRequest(a1, previousEntry.getEntryId()).getRequest());
		previousEntry = tree.getNextRequest(a1, previousEntry.getEntryId());

		Assert.assertEquals(r2.getClass(), tree.getNextRequest(a1, previousEntry.getEntryId()).getRequest());

		Assert.assertEquals(r1.getClass(), tree.getRoot().getRequest());

	}
	
	@Test
	public void testChangeRequestsAndAnswer() {
		StrategyTree tree = new StrategyTree();

		LinkedList<Class<? extends RequestContent>> requests = new LinkedList<>();
		TestRequest1 r1 = new TestRequest1();
		r1.value = "Bla1";

		TestRequest1 r11 = new TestRequest1();
		r11.value = "Bla11";

		requests.add(TestRequest1.class);
		requests.add(TestRequest1.class);

		LinkedList<Class<? extends AnswerContent>> answers = new LinkedList<>();
		TestAnswer1 a1 = new TestAnswer1();
		a1.answer = "Huhu1";

		TestAnswer2 a2 = new TestAnswer2();
		a2.answer = "Huhu11";

		answers.add(TestAnswer1.class);

		tree.addPath(requests, answers,null);

		Assert.assertEquals(TestRequest1.class, tree.getRoot().getRequest());

		StrategyTreeEntry previousEntry = tree.getRoot();

		Assert.assertEquals(TestRequest1.class, tree.getNextRequest(a1, previousEntry.getEntryId()).getRequest());

		Assert.assertEquals(null, tree.getNextRequest(a2, previousEntry.getEntryId()));
		
		//---------------------------------
		
		requests = new LinkedList<>();
		
		requests.add(TestRequest1.class);
		requests.add(TestRequest1.class);
		
		TestRequest2 r2 = new TestRequest2();
		r2.value = "Bla2";
		
		requests.add(TestRequest2.class);
		
		answers = new LinkedList<>();
		
		answers.add(TestAnswer1.class);
		answers.add(TestAnswer2.class);
		
		tree.addPath(requests, answers,null);
		
		System.out.println(tree);
		Assert.assertEquals(TestRequest1.class, tree.getRoot().getRequest());

		previousEntry = tree.getRoot();

		Assert.assertEquals(TestRequest1.class, tree.getNextRequest(a1, previousEntry.getEntryId()).getRequest());
		
		previousEntry = tree.getNextRequest(a1, previousEntry.getEntryId());
		
		Assert.assertEquals(TestRequest2.class , tree.getNextRequest(a2, previousEntry.getEntryId()).getRequest());
		
		// change the answers and request
		
		HashMap<Class<? extends RequestContent>, Class<? extends RequestContent>> rMapping = new HashMap<Class<? extends RequestContent>, Class<? extends RequestContent>>();
		
		rMapping.put(TestRequest1.class, TestRequest2.class);
		rMapping.put(TestRequest2.class, TestRequest1.class);
		
		HashMap<Class<? extends AnswerContent>, Class<? extends AnswerContent>> aMapping = new HashMap<Class<? extends AnswerContent>, Class<? extends AnswerContent>>();
		
		aMapping.put(TestAnswer1.class, TestAnswer2.class);
		aMapping.put(TestAnswer2.class, TestAnswer1.class);
		
		tree.changeContent(rMapping, aMapping);
		
		System.out.println(tree);
		
		Assert.assertTrue(r2.getClass().equals(tree.getRoot().getRequest()));

		previousEntry = tree.getRoot();
		
		Class<? extends RequestContent> toTest = tree.getNextRequest(a2, previousEntry.getEntryId()).getRequest();
		System.out.println(toTest);
		Assert.assertTrue(r2.getClass().equals(toTest));
		
		previousEntry = tree.getNextRequest(a2, previousEntry.getEntryId());
		
		toTest = tree.getNextRequest(a1, previousEntry.getEntryId()).getRequest();
		System.out.println(toTest);
		Assert.assertTrue(r1.getClass().equals(toTest));
		
		
	}
}
