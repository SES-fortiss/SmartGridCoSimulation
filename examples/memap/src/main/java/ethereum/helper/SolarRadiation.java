package ethereum.helper;

import java.util.Calendar;

import ethereum.Simulation;

public class SolarRadiation {
	
	private static double[] irridiation 
//	= 		{
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0.0010079601,
//			0.0006324174,
//			0.0024015716,
//			0.0012991021,
//			0.0018680783,
//			0.0039369539,
//			0.0089275748,
//			0.0109357483,
//			0.0097112711,
//			0.0167312393,
//			0.0126217646,
//			0.0205528864,
//			0.0317523729,
//			0.0312439998,
//			0.0548517388,
//			0.0716283614,
//			0.0697321546,
//			0.1509242119,
//			0.1636524786,
//			0.0773524432,
//			0.2638392612,
//			0.0865590924,
//			0.4244949578,
//			0.229705368,
//			0.1434192004,
//			0.3740373142,
//			0.3356794776,
//			0.7828419428,
//			0.6118242111,
//			0.4701207229,
//			0.3753825192,
//			0.7822904906,
//			0.8971183251,
//			0.222373418,
//			0.9652167768,
//			0.2084800018,
//			0.908576518,
//			0.5890215193,
//			0.6034086444,
//			0.331373832,
//			0.4592159741,
//			0.3800951776,
//			0.5801476573,
//			0.289868009,
//			0.1211350868,
//			0.3373161571,
//			0.2801188078,
//			0.1023472964,
//			0.1507302548,
//			0.131545886,
//			0.0501379473,
//			0.1221290528,
//			0.0612957152,
//			0.0595058781,
//			0.031974099,
//			0.0224830388,
//			0.0100237032,
//			0.0212261289,
//			0.0151127955,
//			0.0077242926,
//			0.0034380879,
//			0.0027112917,
//			0.0014470872,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0}
;
	
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
					irridiation[i] = Math.exp(-Math.pow((hourOfDay-13.5),2)/10)*(Math.random()*0.8+0.2);
				}
			}
			loaded = true;
		}
		return irridiation[timestep];
	}

}
