/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package resultLogger.utils;

public class LoggerTags {

	public static final String ROOT_RESULTS = "results";
	public static final String TIMESTEP = "timestep";

	public static final String NUMBER_MESSAGES_SEND = "numberMessagesSend";

	public static final String FAULTS_COLLECTION = "faults";
	public static final String FAULT = "fault";
	public static final String FAULT_Type = "faultType";
	public static final String FAULT_PRODUCER = "faultProducer";
	public static final String FAULT_MESSAGE_TYPE = "faultMessageType";

	public static final String RESULT_MESSAGES = "resultMessages";

	public static final String USED_HISTORY = "history";
	public static final String USED_HISTORY_ENTRY = "historyRequest";
	public static final String USED_HISTORY_TYPE = "historyType";
	public static final String USED_HISTORY_MESSAGE_LOOKUP = "historyMessageLookup";
	public static final String USED_HISTORY_ACTORPATH = "historyMessageActorPath";
	
	public static final String STRATEGY = "strategy";
	public static final String STRATEGY_USAGE = "strategyUsage";
	public static final String STRATEGY_FAULT_TYPE = "strategyFaultType";
	public static final String STRATEGY_FAULT_MESSAGE = "strategyFaultyMessage";
	public static final String STRATEGY_FAULT_PRODUCER = "strategyFaultProducer";
	public static final String STRATEGY_FAULT_STEPS = "strategyFaultExtraSteps";
	
	public static String ROOT_STATISTICS = "statistics";
	public static String NUMBER_OF_ACTORS = "numberOfActors";
}
