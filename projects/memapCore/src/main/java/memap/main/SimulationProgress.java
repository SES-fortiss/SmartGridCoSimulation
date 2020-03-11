package memap.main;

import akka.timeManagement.CurrentTimeStepSubscriber;

/**
 * Tracks the progress of the simulation progress, considering both global and
 * per building optimization
 */
public class SimulationProgress implements CurrentTimeStepSubscriber {
	private static final SimulationProgress sp = new SimulationProgress();

	private double progress = 0;
	private final int max = (TopologyConfig.getInstance().getNrDays()
			* TopologyConfig.getInstance().getTimeStepsPerDay()) - 1;

	public static SimulationProgress getInstance() {
		return sp;
	}

	public double getProgress() {
		return progress;
	}

	@Override
	public void update(int currentTimeStep) {
		if (currentTimeStep > progress) {
			progress = currentTimeStep * 100 / max;
		}
	}

}
