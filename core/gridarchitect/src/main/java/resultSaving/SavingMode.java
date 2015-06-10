/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package resultSaving;

/**
 * Created with IntelliJ IDEA.
 * User: amack
 * Date: 23.10.13
 * Time: 16:33
 * To change this template use File | Settings | File Templates.
 */
public enum SavingMode {
    MONITOR, CASSANDRA, LOG, JSON, CSV, NONE;
    public int interval;
}
