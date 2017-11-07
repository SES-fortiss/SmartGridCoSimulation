/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package example.aggregator;

import akka.basicMessages.AnswerContent;
import akka.systemActors.GlobalTime;

public class AggregatorAnswer implements AnswerContent{
	
	public int verbrauch;
	public int erzeugung;
	public int last; // last = erzeugung - verbrauch
	
	public int privat;
	public int gewerbe;
	public int landwirtschaft;
	public int strasse;
	public int solar;
	
	public String toString(){
		return
				GlobalTime.currentTime + ", " + 
				-verbrauch + ", " + 
				-privat + ", " +
				-gewerbe + ", " + 
				-landwirtschaft + ", " + 
				-strasse + ", " + 
				erzeugung + ", " +
				solar + ", " +
				last;
	}
}
