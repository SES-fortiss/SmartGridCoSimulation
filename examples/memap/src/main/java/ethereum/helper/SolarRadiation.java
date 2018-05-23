package ethereum.helper;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import ethereum.Simulation;

public class SolarRadiation {
	
	private static double[] irridiation;
	private static boolean loaded = false;
	
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
		if(!loaded) {
			irridiation = new double[Simulation.NR_OF_ITERATIONS];
			for(int i = 0; i < irridiation.length; i++) {
				double hourOfDay = (i * Simulation.TIMESTEP_DURATION_IN_SECONDS.doubleValue()/3600) % 24;
				if(hourOfDay > 5 && hourOfDay < 21) {
					irridiation[i] = 0.1*Math.exp(-Math.pow((hourOfDay-13.5),2)/10)*Math.random();
				}
			}
			loaded = true;
		}
		return irridiation[timestep];
	}

}
