package ethereum.helper;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import ethereum.Simulation;

public class SolarRadiation {
	
	/**
	 * Returns the current solar radiation at a given point in time.
	 * 
	 * @param time the point in time for which to get the radiation
	 * @return solar radiation in kW/m�
	 */
	public static double getRadiation(Calendar time) {
		return 0.0;
	}
	
	/**
	 * Returns the current solar radiation at a given timestep. Assumes timestep 0 at 12 am.
	 * 
	 * @param time the timestep for which to get the radiation
	 * @return solar radiation in kW/m�
	 */
	public static double getRadiation(int timestep) {
		double hourOfDay = (timestep * Simulation.TIMESTEP_DURATION_IN_SECONDS.doubleValue()/3600) % 24;
		if(hourOfDay > 5 && hourOfDay < 21) {
			return 0.1*Math.pow(Math.exp(-(hourOfDay-13.5)),2)/10*Math.random();
		}
		else return 0.0;
	}

}
