package memap.main;

import akka.timeManagement.CurrentTimeStepSubscriber;

/**
 * Tracks the simulation progress, considering both global and
 * per building optimization
 */
public class SimulationProgress implements CurrentTimeStepSubscriber {
	private static final SimulationProgress sp = new SimulationProgress();

	private double progress = 0;
	private final int max = (TopologyConfig.getInstance().getNrDays()
			* TopologyConfig.getInstance().getTimeStepsPerDay());

	public void restart() {
		progress = 0;
	}
	
	public static SimulationProgress getInstance() {
		return sp;
	}

	public double getProgress() {
		return progress * 100 / max;
	}

	@Override
	public void update(int currentTimeStep) {
		if (currentTimeStep > progress) {
			progress = currentTimeStep;
		}
	}

}
