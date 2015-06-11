package haus.komponente._schedule;

/**
 * StandardSchedule
 * 01.06.2014
 * @author Markus
 *
 */
public class StandardSchedule extends __BasicSchedule{
	private double [] Plan;
	
	public StandardSchedule(double [] plan){
		this.Plan = plan;
	}
	/**
	 * changes the schedule
	 * @param schedule new schedule
	 * @return old schedule
	 */
	public double[] init(double[] schedule){
		double [] temp = Plan;
		this.Plan = schedule;
		return temp;
	}
	
	/* (non-Javadoc)
	 * @see haus.komponente._schedule.__BasicSchedule#getFutureConsumption(int)
	 */
	@Override
	public double[] getFutureConsumption(int index) {
		double [] t = new double[8];
		for(int i = 0 ; i < 8 ; i++){
			t[i] = 0;
			if(Plan.length>(index+i)){
				t[i] = Plan[index+i];
			}
		}
		return t;
	}

	/* (non-Javadoc)
	 * @see haus.komponente._schedule.__BasicSchedule#getConsumption(int)
	 */
	@Override
	public double getConsumption(int timestep) {
		if(timestep<=0){return 0;}
		if(Plan.length>=timestep){
			return Plan[timestep-1];
		}
		return 0;
	}
	/* (non-Javadoc)
	 * @see haus.komponente._schedule.__BasicSchedule#getSolarConsumption(int)
	 */
	@Override
	public double getSolarConsumption(int index) {
		
		return 0;
	}
	/* (non-Javadoc)
	 * @see haus.komponente._schedule.__BasicSchedule#getSolarConsumtion()
	 */
	@Override
	public double[] getSolarConsumtion() {
		
		return null;
	}
	/* (non-Javadoc)
	 * @see haus.komponente._schedule.__BasicSchedule#getSolarConsumptionDelta(int)
	 */
	@Override
	public double getSolarConsumptionDelta(int index) {
		
		return 0;
	}
	/* (non-Javadoc)
	 * @see haus.komponente._schedule.__BasicSchedule#getSolarConsumptionDelta()
	 */
	@Override
	public double[] getSolarConsumptionDelta() { 
		return null;
	}
	/* (non-Javadoc)
	 * @see haus.komponente._schedule.__BasicSchedule#getWaermebedarf(int)
	 */
	@Override
	public double getWaermebedarf(int actTimestep) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getFixenVerbrauch(int actTimestep) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String getFixenVerbrauchINFO(int actTimestep) {
		// TODO Auto-generated method stub
		return null;
	}

}
