package memap.helper;

import java.util.concurrent.TimeUnit;

@Deprecated
public class MyTimeUnit {
	
	private int timeStepsPerDay;
	
	public MyTimeUnit(int timeStepsPerDay){
		this.timeStepsPerDay = timeStepsPerDay;
	}

	public double stepLength(TimeUnit timeUnit) {
		// This value is automatically cast to integer by the compiler
		double stepLengthInSeconds = 24 * 3600 / timeStepsPerDay;
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
