/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.advancedMessages;


/**
 * PingRequestContent
 * @author Luc
 *
 */
public class PingRequestContent extends SingleReceiverRequestContent{
	
	private static final boolean simpleToString = true;
	
	 @Override
	public String toString()
	 {
		 if (simpleToString )
		 {
			 if (recieverPath!= null)
				 return "PingRequestContent Reciever "+recieverPath.substring(recieverPath.lastIndexOf('/'));
			 else
				 return "PingRequestContent Reciever "+recieverPath;
		 }
		 else
			 return "PingRequestContent Reciever "+recieverPath;
	 }
	 
	 @Override
	public boolean equals (Object o)
	 {
		 boolean res = false;
		 
		 if (o instanceof PingRequestContent)
		 {
			 PingRequestContent ping = (PingRequestContent) o;
			 
			 if (recieverPath == null)
				 res = recieverPath ==ping.recieverPath;
			 else
				 res = (recieverPath.equals(ping.recieverPath));			 
		 }
		 
		 return res;
	 }
}
