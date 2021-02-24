/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.systemMessages;

/**
* Created with IntelliJ IDEA.
* User: amack
* Date: 6/13/13
* Time: 12:35 PM
* To change this template use File | Settings | File Templates.
*/

public class CompletionMessage {
    
	public final Boolean complete;
    public CompletionMessage(Boolean complete) {this.complete = complete;}

    @Override
    public String toString() {
        return String.format("complete:[%s]", complete);
    }
}
