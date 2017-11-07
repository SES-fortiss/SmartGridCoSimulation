/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package memap.messages;

public class StatusWaerme {
	
	double prognose; // sollte irgendwann zu einem profil, d.h. einer liste von werten werden
	double leistung; // positiv = einspeisung, negativ = entnahme
	double temperaturVorlauf;
	double temperaturRücklauf;

}
