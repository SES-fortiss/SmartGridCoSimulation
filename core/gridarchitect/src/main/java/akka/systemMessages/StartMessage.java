/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.systemMessages;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * This is the adapted version of the StartMessage.
 * It allows to handle TimeSteps and RealTime modus.
 * User: Denis
 * 
 */
public class StartMessage {
    
	// If the simulation uses TimeSteps
	public final boolean timeStepMode;
	public final int startTimeStep;
    public final int lastTimeStep;
    
    // If the simulation uses REAL time values
    public final LocalDateTime startTime;
    public final LocalDateTime endTime;
    public final Duration timeInterval;    
    
    // If the simulation uses REALTIME
    public final LocalDate referenceDay;
    
    // Flag for the mode
    public final boolean timeMode;
    public final boolean realTimeMode;
    
    // The TimeSteps mode    
    public StartMessage (int startTimeStep, int maxTimeStep) {
        this.timeStepMode = true;
    	this.startTimeStep = startTimeStep;
        this.lastTimeStep = maxTimeStep;
        
        this.timeMode = false;
        this.startTime = null;
        this.endTime = null;
        this.timeInterval = null;
        
        this.referenceDay = null;
        this.realTimeMode = false;
    }
    
    // The mode with time
    public StartMessage (LocalDateTime startTime, LocalDateTime endTime, Duration timeInterval ){
        this.timeStepMode = false;
    	this.startTimeStep = -1;
    	this.lastTimeStep = -1;
    	
    	this.timeMode = true;
    	this.startTime = startTime;
    	this.endTime = endTime;
    	this.timeInterval = timeInterval;
    	
    	this.referenceDay = null;
    	this.realTimeMode = false;
    }
    
    // The mode with realtime
    public StartMessage (LocalDate referenceDay, Duration timeInterval ){
    	this.timeStepMode = false;
    	this.startTimeStep = -1;
    	this.lastTimeStep = -1;
    	
    	this.timeMode = false;
    	this.startTime = null;
    	this.endTime = null;    	
    	
    	this.referenceDay = referenceDay;
    	this.realTimeMode = true;
    	this.timeInterval = timeInterval;
    }

    @Override
    public String toString() {
        return String.format("isRealTime:[%s], startTimeStep:[%s], maxTimeStep:[%s], "
        		+ "startTime:[%s], endTime:[%s], timeInterval:[%s]",
        		timeMode, startTimeStep, lastTimeStep, startTime, endTime, timeInterval);
    }
}
