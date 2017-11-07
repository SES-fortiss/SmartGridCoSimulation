/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package memap.messages;

import java.util.ArrayList;

import akka.basicMessages.AnswerContent;

/**
 * Smart Meter AnswerContent
 * 
 * @author bytschkow
 * 
 */
public class EMSanswer implements AnswerContent  {
	public ArrayList<Erzeuger> erzeugerList = new ArrayList<>(); // Statische Werte
	public ArrayList<Leistung> leistungenList = new ArrayList<>();
	public ArrayList<Reduktion> reduktionList = new ArrayList<>();
	public ArrayList<Aufnahme> autfnahmeList = new ArrayList<>();
	public StatusStrom strom = new StatusStrom();
	public StatusWaerme waerme = new StatusWaerme();
}
