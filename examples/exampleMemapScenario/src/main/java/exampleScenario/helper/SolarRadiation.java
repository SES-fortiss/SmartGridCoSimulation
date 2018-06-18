package exampleScenario.helper;

import java.time.LocalDateTime;

public class SolarRadiation {
	
	/**
	 * Returns the current solar radiation at a given point in time.
	 * 
	 * @param time the point in time for which to get the radiation
	 * @return solar radiation in kW/m�
	 */
	public static double getRadiation(LocalDateTime time) {
		int hourOfDay = time.getHour();
		if(hourOfDay > 5 && hourOfDay < 21) {
			return 0.7*Math.pow(Math.exp(-(hourOfDay-13.5)),2)/10*Math.random();
		}
		else return 0.0;
	}
	
	/**
	 * Returns the current solar radiation at a given timestep. Assumes hourly timesteps and start at 12 am.
	 * 
	 * @param time the timestep for which to get the radiation
	 * @return solar radiation in kW/m�
	 */
	public static double getRadiation(int timestep) {
		int hourOfDay = timestep % 24;
		if(hourOfDay > 5 && hourOfDay < 21) {
			return 0.7*Math.pow(Math.exp(-(hourOfDay-13.5)),2)/10*Math.random();
		}
		else return 0.0;
	}

}
