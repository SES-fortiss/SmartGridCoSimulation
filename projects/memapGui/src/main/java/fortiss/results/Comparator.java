package fortiss.results;

public class Comparator {

	public Comparator() {}
	
	public double getGain(double memapOnValue, double memapOffValue) {
		return memapOnValue - memapOffValue;
	}
	
	public double getPercentualGain(double memapOnValue, double memapOffValue) {
		double gain = getGain(memapOnValue, memapOffValue);
		return gain / Math.abs(memapOffValue) * 100;
	}
	
}
