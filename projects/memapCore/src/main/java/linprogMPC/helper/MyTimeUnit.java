package linprogMPC.helper;

import java.util.concurrent.TimeUnit;

import linprogMPC.TopologyConfig;

public class MyTimeUnit {

	public static double stepLength(TimeUnit timeUnit) {
		double stepLengthInSeconds = 24 * 3600 / TopologyConfig.TIMESTEPS_PER_DAY;
		switch (timeUnit) {
		case SECONDS:
			return stepLengthInSeconds;
		case MINUTES:
			return stepLengthInSeconds / 60;
		case HOURS:
			return stepLengthInSeconds / 3600;
		default:
			throw new RuntimeException("Timeunit " + timeUnit + " not implemented.");
		}
	}

}
