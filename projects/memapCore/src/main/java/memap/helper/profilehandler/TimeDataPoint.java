package memap.helper.profilehandler;

import java.time.LocalDateTime;

/**
 * 
 * This class represents one single data value (double) at some certain time (LocalDateTime)
 * 
 * @author bytschkow
 *
 */
public class TimeDataPoint {
	
	private LocalDateTime dateTime = null;
	private double value = 0;
	
	public TimeDataPoint(LocalDateTime ldt, double value) {
		this.dateTime = ldt;
		this.value = value;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}
	
	public double getValue() {
		return value;
	}
}
