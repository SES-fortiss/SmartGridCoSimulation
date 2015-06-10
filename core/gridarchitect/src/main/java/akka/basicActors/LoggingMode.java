/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.basicActors;

/**
 * Represents the loggingMode for console output
 * 
 * @value DEBUG - for debugging purpose
 * @value PRODUCTION - ...
 * @value UNIT_TEST - for testing
 * @value MINIMAL - no logging output
 * 
 */

public enum LoggingMode {
    DEBUG, PRODUCTION, UNIT_TEST, MINIMAL
}
