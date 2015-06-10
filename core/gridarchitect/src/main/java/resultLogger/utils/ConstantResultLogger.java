/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package resultLogger.utils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import faultStrategy.requests.EndMessageRequestContent;
import faultStrategy.requests.GetAverageHistoryRequestContent;
import faultStrategy.requests.GetLastHistoryRequestContent;
import faultStrategy.requests.HistoryRequestContent;

public class ConstantResultLogger {
	public Integer timeStep_MessageCounter;
	public LinkedList<ErrorAnswerContent> timeStep_ErrorAnswerContents;
	public LinkedList<AnswerContent> timeStep_FinalAnswerContents;
	public LinkedList<HistoryRequestContent> timeStep_HistoryRequests;
	public LinkedList<BasicAnswer> timeStep_HistoryLookupMessages;
	public HashMap<String, LinkedList<StrategyUsage>> timeStep_StrategyUsages; 
	
	private int nbActors;

	private AnswerContent_LoggerInterface answerLogger;

	private File RESULTS_FILE;
	

	private boolean firstStep;

	public boolean finishedWriting;
	private Document updateDoc;

	public ConstantResultLogger(AnswerContent_LoggerInterface answerLogger) {
		RESULTS_FILE = new File(answerLogger.getResultFileName());
		this.answerLogger = answerLogger;

		timeStep_ErrorAnswerContents = new LinkedList<ErrorAnswerContent>();
		timeStep_FinalAnswerContents = new LinkedList<AnswerContent>();
		timeStep_HistoryRequests = new LinkedList<HistoryRequestContent>();
		timeStep_HistoryLookupMessages= new LinkedList<BasicAnswer>();
		timeStep_StrategyUsages = new HashMap<String, LinkedList<StrategyUsage>>();
		timeStep_MessageCounter = 0;
		firstStep = true;
		updateDoc = null;
	}

	public void storeMessageSendCounter() {
		timeStep_MessageCounter++;
	}

	public void storeError(ErrorAnswerContent error) {
		timeStep_ErrorAnswerContents.add(error);
	}

	public void storeFinalAnswer(AnswerContent answer) {
		timeStep_FinalAnswerContents.add(answer);
	}
	
	public void storeNumberOfActors(int nbOfActors) {
		this.nbActors = nbOfActors;
	}

	public void storeHistoryRequest(HistoryRequestContent answer, BasicAnswer answertype) {
		timeStep_HistoryRequests.add(answer);
		timeStep_HistoryLookupMessages.add(answertype);
	}
	
	public void logStrategyUsages(String faultProducerPath, AnswerContent previousAnswer, Class<? extends RequestContent> nextRequest, 
			Class<? extends RequestContent> rootRequest) {
		if (nextRequest.equals(EndMessageRequestContent.class) || nextRequest.equals(HistoryRequestContent.class) ||
				nextRequest.equals(GetAverageHistoryRequestContent.class) ||nextRequest.equals(GetLastHistoryRequestContent.class))
		{
			// Do nothing
		}
		else
		{
			// check if there is already an entry for the actor
			LinkedList<StrategyUsage> usage = this.timeStep_StrategyUsages.get(faultProducerPath);
			if (usage==null)
				usage = new LinkedList<StrategyUsage>();
			
			boolean found =false;
			
			for (StrategyUsage sU: usage)
			{
				if (sU.isTheSame(faultProducerPath, rootRequest))
				{
					sU.increaseCounter();
					found = true;
				}
			}
			
			if (found == false && previousAnswer instanceof ErrorAnswerContent)
			{
				ErrorAnswerContent tmp = (ErrorAnswerContent) previousAnswer;
				
				StrategyUsage newSU = new StrategyUsage(tmp, rootRequest, faultProducerPath);
				newSU.increaseCounter();
				usage.add(newSU);
			}
			
			this.timeStep_StrategyUsages.put(faultProducerPath, usage);
		}
	}

	public void clearLogger() {
		if (timeStep_ErrorAnswerContents != null)
			timeStep_ErrorAnswerContents.clear();
		if (timeStep_MessageCounter != null)
			timeStep_MessageCounter = 0;
		if (timeStep_FinalAnswerContents != null)
			timeStep_FinalAnswerContents.clear();
		if (timeStep_HistoryRequests != null)
			timeStep_HistoryRequests.clear();
		if (timeStep_HistoryLookupMessages != null)
			timeStep_HistoryLookupMessages.clear();
		if (timeStep_StrategyUsages != null)
			timeStep_StrategyUsages.clear();
	}

	public void endLogger() {
		// write the content into xml file

		try
		{
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();

			DOMSource source = new DOMSource(updateDoc);
			StreamResult result = new StreamResult(RESULTS_FILE);
			transformer.transform(source, result);

			// System.out.println("Done");
			// System.out.println("File saved!");
		}
		catch (TransformerConfigurationException e)
		{
			e.printStackTrace();
		}
		catch (TransformerException e)
		{
			e.printStackTrace();
		}

		clearLogger();
		firstStep = true;
		updateDoc = null;
	}

	public void writeResult(Integer timeStep_MessageCounter, LinkedList<ErrorAnswerContent> timeStep_ErrorAnswerContents,
			LinkedList<AnswerContent> timeStep_FinalAnswerContenst, LinkedList<HistoryRequestContent> timeStep_HistoryRequests, 
			LinkedList<BasicAnswer> timeStep_HistoryLookupMessages, int currentTimestep, HashMap<String, LinkedList<StrategyUsage>> timeStep_StrategyUsages) {
		finishedWriting = false;
		if (firstStep)
		{
			firstStep = false;
			writeNewResult(timeStep_MessageCounter, timeStep_ErrorAnswerContents, timeStep_FinalAnswerContenst, timeStep_HistoryRequests, 
					timeStep_HistoryLookupMessages,currentTimestep, timeStep_StrategyUsages);
		}
		else
		{
			if (updateDoc == null)
			{
				try
				{
					DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
					DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
					updateDoc = docBuilder.parse(RESULTS_FILE);

					updateDoc.getDocumentElement().normalize();
				}
				catch (ParserConfigurationException e)
				{
					e.printStackTrace();
				}
				catch (SAXException e)
				{
					e.printStackTrace();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}

			}
			updateResult(timeStep_MessageCounter, timeStep_ErrorAnswerContents, timeStep_FinalAnswerContenst, timeStep_HistoryRequests,
					timeStep_HistoryLookupMessages, currentTimestep, timeStep_StrategyUsages);
		}

	}

	private void writeNewResult(Integer messageCounter, LinkedList<ErrorAnswerContent> errorAnswerContents,
			LinkedList<AnswerContent> finalAnswerContenst, LinkedList<HistoryRequestContent> historyRequests, 
			LinkedList<BasicAnswer> historyLookupMessages,Integer currentTimeStep, HashMap<String, LinkedList<StrategyUsage>> strategyUsages) {
		try
		{
			if (RESULTS_FILE.exists())
			{
				RESULTS_FILE.delete();
				RESULTS_FILE.createNewFile();
			}
			else
			{
				RESULTS_FILE.createNewFile();
			}

			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.newDocument();

			// root element
			Element rootElement = doc.createElement(LoggerTags.ROOT_RESULTS);
			doc.appendChild(rootElement);

			// TimeStep element
			Element timeStep = doc.createElement(LoggerTags.TIMESTEP);
			Attr attr = doc.createAttribute("id");
			attr.setValue(String.valueOf(currentTimeStep));
			timeStep.setAttributeNode(attr);

			// Error Element
			Element fault_Collection = analyseErrors(errorAnswerContents, doc);
			timeStep.appendChild(fault_Collection);

			// Messages send
			Element messages_Send = doc.createElement(LoggerTags.NUMBER_MESSAGES_SEND);
			messages_Send.appendChild(doc.createTextNode(String.valueOf(messageCounter)));
			timeStep.appendChild(messages_Send);

			// Results
			Element finalAnswer = analyseResults(finalAnswerContenst, doc);
			timeStep.appendChild(finalAnswer);

			// History
			Element history = analyseHistory(historyRequests, historyLookupMessages, doc);
			timeStep.appendChild(history);
					
			// StrategyUsage
			Element strategyUSage = analyseStrategyUsage(strategyUsages, doc);
			timeStep.appendChild(strategyUSage);
			
			
			rootElement.appendChild(timeStep);
			
			//Number of actors
			Element rootStatisticsElement = doc.createElement(LoggerTags.ROOT_STATISTICS);
			

			
			Element Nbactors = doc.createElement(LoggerTags.NUMBER_OF_ACTORS);
			Nbactors.appendChild(doc.createTextNode(String.valueOf(nbActors)));
			rootStatisticsElement.appendChild(Nbactors);
			
			rootElement.appendChild(rootStatisticsElement);
			
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(RESULTS_FILE);

			transformer.transform(source, result);

			// System.out.println("File saved!");
			finishedWriting = true;

		}
		catch (TransformerException tfe)
		{
			tfe.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (ParserConfigurationException e)
		{
			e.printStackTrace();
		}
	}

	private void updateResult(Integer messageCounter, LinkedList<ErrorAnswerContent> errorAnswerContents,
			LinkedList<AnswerContent> finalAnswerContenst, LinkedList<HistoryRequestContent> historyRequests, 
			LinkedList<BasicAnswer> historyLookupMessages, Integer currentTimeStep, HashMap<String, LinkedList<StrategyUsage>> strategyUsages) {

		Node rootNode = updateDoc.getElementsByTagName(LoggerTags.ROOT_RESULTS).item(0);
		Element rootElement = (Element) rootNode;

		// TimeStep element
		Element timeStep = updateDoc.createElement(LoggerTags.TIMESTEP);
		Attr attr = updateDoc.createAttribute("id");
		attr.setValue(String.valueOf(currentTimeStep));
		timeStep.setAttributeNode(attr);

		// Error Element
		Element fault_Collection = analyseErrors(errorAnswerContents, updateDoc);
		timeStep.appendChild(fault_Collection);

		// Messages send
		Element messages_Send = updateDoc.createElement(LoggerTags.NUMBER_MESSAGES_SEND);
		messages_Send.appendChild(updateDoc.createTextNode(String.valueOf(messageCounter)));
		timeStep.appendChild(messages_Send);

		// Results
		Element finalAnswer = analyseResults(finalAnswerContenst, updateDoc);
		timeStep.appendChild(finalAnswer);

		// History
		Element history = analyseHistory(historyRequests, historyLookupMessages, updateDoc);
		timeStep.appendChild(history);
		
		// StrategyUsage
		Element strategyUSage = analyseStrategyUsage(strategyUsages, updateDoc);
		timeStep.appendChild(strategyUSage);
		
		rootElement.appendChild(timeStep);

		finishedWriting = true;
	}

	private Element analyseErrors(LinkedList<ErrorAnswerContent> errors, Document doc) {
		Element res = doc.createElement(LoggerTags.FAULTS_COLLECTION);
		if (errors == null)
			return res;
		else
		{
			// System.out.println(errors);
			for (int i = 0; i < errors.size(); i++)
			{
				ErrorAnswerContent error = errors.get(i);
				if (error != null)
				{
					Element current = doc.createElement(LoggerTags.FAULT);

					Element faultType = doc.createElement(LoggerTags.FAULT_Type);
					faultType.appendChild(doc.createTextNode(error.getErrorType().toString()));
					current.appendChild(faultType);

					Element faultProducer = doc.createElement(LoggerTags.FAULT_PRODUCER);
					faultProducer.appendChild(doc.createTextNode(error.getSender().toString()));
					current.appendChild(faultProducer);

					Element faultMessageType = doc.createElement(LoggerTags.FAULT_MESSAGE_TYPE);
					faultMessageType.appendChild(doc.createTextNode(error.getAnswerContent().getClass().getName()));
					current.appendChild(faultMessageType);

					res.appendChild(current);
				}
			}
			return res;
		}
	}

	private Element analyseResults(LinkedList<AnswerContent> results, Document doc) {
		Element res = doc.createElement(LoggerTags.RESULT_MESSAGES);
		if (results == null)
			return res;
		else
		{
			for (AnswerContent current : results)
			{
				Element currentResult = answerLogger.convertAnswerToXML(current, doc);

				res.appendChild(currentResult);
			}

			return res;
		}
	}

	private Element analyseHistory(LinkedList<HistoryRequestContent> history, LinkedList<BasicAnswer> lookupMessages,Document doc) {
		Element res = doc.createElement(LoggerTags.USED_HISTORY);
		if (history == null)
			return res;
		else
		{
		/*	HashMap<Class<? extends HistoryRequestContent>, Integer> tmp = new HashMap<Class<? extends HistoryRequestContent>, Integer>();
			// System.out.println(history);
			for (int i = 0; i < history.size(); i++)
			{
				HistoryRequestContent current = history.get(i);
				if (current != null)
				{
					if (current instanceof GetAverageHistoryRequestContent)
					{
						Integer n = tmp.get(GetAverageHistoryRequestContent.class);
						if (n == null)
							n = 0;
						n++;
						tmp.put(GetAverageHistoryRequestContent.class, n);
					}
					if (current instanceof GetLastHistoryRequestContent)
					{
						Integer n = tmp.get(GetLastHistoryRequestContent.class);
						if (n == null)
							n = 0;
						n++;
						tmp.put(GetLastHistoryRequestContent.class, n);
					}
				}
			}*/

			//for (Entry<Class<? extends HistoryRequestContent>, Integer> entry : tmp.entrySet())
			for (int i = 0; i < history.size(); i++)
			{
				HistoryRequestContent hrequest = history.get(i);
				BasicAnswer lookupMessage = lookupMessages.get(i);
				
				Element current = doc.createElement(LoggerTags.USED_HISTORY_ENTRY);
				String name =null;
				if (hrequest instanceof GetAverageHistoryRequestContent)
				{
					GetAverageHistoryRequestContent tmp = (GetAverageHistoryRequestContent) hrequest;
					name = tmp.getClass().getName();
				}
				if (hrequest instanceof GetLastHistoryRequestContent)
				{
					GetLastHistoryRequestContent tmp = (GetLastHistoryRequestContent) hrequest;
					name = tmp.getClass().getName();
				}
				
				Element type = doc.createElement(LoggerTags.USED_HISTORY_TYPE);
				type.appendChild(doc.createTextNode(name));
				current.appendChild(type);

				Element number = doc.createElement(LoggerTags.USED_HISTORY_MESSAGE_LOOKUP);
				number.appendChild(doc.createTextNode(lookupMessage.answerContent.getClass().getName()));
				current.appendChild(number);

				res.appendChild(current);

			}

			return res;
		}
	}
	
	private Element analyseStrategyUsage(HashMap<String, LinkedList<StrategyUsage>> strategyUsage, Document doc) {
		Element res = doc.createElement(LoggerTags.STRATEGY);
		if (strategyUsage == null)
			return res;
		else
		{
			// System.out.println(errors);
			for (Entry<String, LinkedList<StrategyUsage>> currentEntry :strategyUsage.entrySet())
			{
				//String currentFaultyActor = currentEntry.getKey();
				for (StrategyUsage usage : currentEntry.getValue())
				{
					Element current = doc.createElement(LoggerTags.STRATEGY_USAGE);
					
					Element faultMessage = doc.createElement(LoggerTags.STRATEGY_FAULT_MESSAGE);
					faultMessage.appendChild(doc.createTextNode(usage.getStrategyFaultMessage().getName()));
					current.appendChild(faultMessage);
					
					Element faultProducer = doc.createElement(LoggerTags.STRATEGY_FAULT_PRODUCER);
					faultProducer.appendChild(doc.createTextNode(usage.getStrategyFaultProducerPath()));
					current.appendChild(faultProducer);
					
					Element faultType = doc.createElement(LoggerTags.STRATEGY_FAULT_TYPE);
					faultType.appendChild(doc.createTextNode(usage.getStrategyFaultProducerCase().getErrorType().toString()));
					current.appendChild(faultType);
					
					Element extraSteps = doc.createElement(LoggerTags.STRATEGY_FAULT_STEPS);
					extraSteps.appendChild(doc.createTextNode(usage.getStrategyPlusMessages().toString()));
					current.appendChild(extraSteps);
					
					res.appendChild(current);
				}
			}
			return res;
		}
	}
}
