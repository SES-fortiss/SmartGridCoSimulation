package ethereum.components;

import java.math.BigInteger;

import ethereum.Simulation;

public class Storage {
	
	private BigInteger capacity;
	private BigInteger soc;
	private BigInteger qDotMaxIn;
	private BigInteger qDotMaxOut;
	
	public Storage(BigInteger capacity, BigInteger soc, BigInteger qDotMaxIn, BigInteger qDotMaxOut) {
		super();
		this.capacity = capacity;
		this.soc = soc;
		this.qDotMaxIn = qDotMaxIn;
		this.qDotMaxOut = qDotMaxOut;
	}

	public BigInteger readMaximumProduction() {
		return soc.min(qDotMaxOut.multiply(Simulation.TIMESTEP_DURATION_IN_SECONDS));
	}
	
	public BigInteger readMaximumConsumption() {
		return (capacity.subtract(soc))
				.min(qDotMaxIn.multiply(Simulation.TIMESTEP_DURATION_IN_SECONDS));
	}
	
	public void updateSoc(boolean charge, BigInteger amount) {
		if(charge) {
			soc = soc.add(amount);
		} else {
			soc = soc.subtract(amount);
		}
	}
	
}
