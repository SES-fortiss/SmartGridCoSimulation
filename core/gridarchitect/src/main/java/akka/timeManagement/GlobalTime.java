/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.timeManagement;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.AbstractSet;
import java.util.HashSet;

/**
 * Holds all time-related parameters for a simulation. It is an instantiable
 * class and should remain so in order to execute multiple simulations
 * concurrently.
 * 
 * It implements Subject to make available specific values to other classes.
 */
public class GlobalTime implements TimePublisher {

	/** Set of subscribers to {@link #currentTimeStep}*/
	private AbstractSet<CurrentTimeStepSubscriber> currentTimeStepSubscribers = new HashSet<CurrentTimeStepSubscriber>();
	/** Set of subscribers to {@link #currentTime}}*/
	private AbstractSet<CurrentTimeSubscriber> currentTimeSubscribers = new HashSet<CurrentTimeSubscriber>();
	/** Current date-time*/
	private LocalDateTime currentTime;
	/** Next date-time*/
	private LocalDateTime nextTime;
	/** Time interval */
	private Duration period;
	/** Current time step*/
	private int currentTimeStep;
	/** Last time step*/
	private int lastTimeStep;

	public GlobalTime() {
		setCurrentTime(null);
		setPeriod(null);
		setCurrentTimeStep(0);
		setLastTimeStep(1);
		setNextTime(null);
	}

	public LocalDateTime getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(LocalDateTime currentTime) {
		this.currentTime = currentTime;
		notifyCurrentTimeSubscribers();
	}

	public LocalDateTime getNextTime() {
		return nextTime;
	}

	public void setNextTime(LocalDateTime nextTime) {
		this.nextTime = nextTime;
	}

	public Duration getPeriod() {
		return period;
	}

	public void setPeriod(Duration period) {
		this.period = period;
	}

	public int getCurrentTimeStep() {
		return currentTimeStep;
	}

	public void setCurrentTimeStep(int currentTimeStep) {
		this.currentTimeStep = currentTimeStep;
		notifyCurrentTimeStepSubscribers();
	}

	public void increaseCurrentTimeStep() {
		currentTimeStep++;
		notifyCurrentTimeStepSubscribers();
	}

	public int getLastTimeStep() {
		return lastTimeStep;
	}

	public void setLastTimeStep(int lastTimeStep) {
		this.lastTimeStep = lastTimeStep;
	}

	@Override
	public void subscribeToCurrentTimeStep(CurrentTimeStepSubscriber subscriber) {
		currentTimeStepSubscribers.add(subscriber);
	}

	@Override
	public void subscribeToCurrentTime(CurrentTimeSubscriber subscriber) {
		currentTimeSubscribers.add(subscriber);
	}

	@Override
	public void notifyCurrentTimeStepSubscribers() {
		for (CurrentTimeStepSubscriber subscriber : currentTimeStepSubscribers) {
			subscriber.update(currentTimeStep);
		}
	}

	@Override
	public void notifyCurrentTimeSubscribers() {
		for (CurrentTimeSubscriber subscriber : currentTimeSubscribers) {
			subscriber.update(currentTime);
		}
	}

}
