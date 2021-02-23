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
* Time: 2:13 PM
* To change this template use File | Settings | File Templates.
*/
public class DebugMessage {
    public final int i;
    public final String debug;
    public final int power;
    
    public DebugMessage (int i, String debug, int power){
        this.i = i; this.debug = debug; this.power = power;
    }

    @Override
    public String toString() {
        return "DebugMessage{" +
                "i=" + i +
                ", debug='" + debug + '\'' +
                ", power=" + this.power +
                '}';
    }
}
