package memap.helper.profilehandler;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

import memap.main.TopologyConfig;

public class TimedDataHandler {

	private ArrayList<Double> heatProfile;
	private ArrayList<Double> electricityProfile;
	
	public TimedDataHandler(TimedData timedData, TopologyConfig topologyConfig) {		
		
		ArrayList<TimeDataPoint> electricalProfile_tmp = timedData.getDataset().get("Electricity");
		ArrayList<TimeDataPoint> heatProfile_tmp = timedData.getDataset().get("Heat");
		
		double intervalInSeconds = topologyConfig.getStepLengthInSeconds();
		
		this.heatProfile = handleProfiles(heatProfile_tmp,  intervalInSeconds);
		this.electricityProfile = handleProfiles(electricalProfile_tmp, intervalInSeconds);
		
	}
	
	private ArrayList<Double> handleProfiles(ArrayList<TimeDataPoint> profile, double intervalInSeconds) {
		
		ArrayList<Double> result = new ArrayList<Double>();
				
		LocalDateTime start = profile.get(0).getDateTime();
		LocalDateTime end  = profile.get(profile.size()-1).getDateTime();
		
		long intervalInSeconds_long = Math.round(intervalInSeconds);		
		end = end.plusSeconds(intervalInSeconds_long);
		
		long duration = Duration.between(start, end).toMillis()/1000;
		long NSteps = duration / intervalInSeconds_long;				
		
		//System.out.println("StartTime: " + start.toString() + "  EndTime: " + end.toString() + "  nTimeSteps: " + NSteps);
		
		int counterOfIndexProfile = 0;
		for (int i = 0; i < NSteps; i++) {
			
			double average = 0.0;
			int counterOfElements = 0;
			
			LocalDateTime end_loop = start.plusSeconds(intervalInSeconds_long * (i+1));
			
			while ( counterOfIndexProfile < profile.size() &&
					end_loop.isAfter(profile.get(counterOfIndexProfile).getDateTime())) {
				average += profile.get(counterOfIndexProfile).getValue();
				counterOfIndexProfile++;
				counterOfElements++;
			}
			
			if (counterOfElements != 0) {
				average = average / counterOfElements;
			} else {
				// in case we have to little data available
				System.err.println(new Throwable().getStackTrace()[0] + " WARNING: some data intervals is missing data! The inteval value is set to 0.0");
			}
			
			//The result profile has an average consumption value
			result.add(average);
		}
		
		return result;
	}

	public ArrayList<Double> getHeatProfile() {
		return heatProfile;
	}
	
	public ArrayList<Double> getElectricityProfile() {
		return electricityProfile;
	}
	
	

}
