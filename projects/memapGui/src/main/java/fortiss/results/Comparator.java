package fortiss.results;

public class Comparator {

	public Comparator() {}
	
	public double getGain(double memapOnValue, double memapOffValue) {
		return memapOnValue - memapOffValue;
	}
	
	public double getPercentualGain(double memapOnValue, double memapOffValue) {
		double gain = 0;
		if(memapOnValue > memapOffValue) {
			// value increased with memap ON
			gain = memapOnValue * 100 / memapOffValue - 100;
		} else {
			gain = -(memapOnValue * 100 / memapOffValue);
		}
		return gain;
	}
	
}
