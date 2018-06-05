package ethereum.helper;

import java.math.BigInteger;

public class UnitHelper {
	
	public static final double WS_PER_KWH = 3600000.0;
	public static final BigInteger QUARTER_KWH = getWSfromKWH(0.25);
	private static final double CENT_IN_WEI = 10000000000000000.0;

	public static BigInteger getWSfromKWH(int kWh) {
		return BigInteger.valueOf((long) (kWh*WS_PER_KWH));
	}

	public static BigInteger getWSfromKWH(double kWh) {
		return BigInteger.valueOf((long) (kWh*WS_PER_KWH));
	}

	public static double getkWhfromWs(BigInteger ws) {
		return ws.doubleValue() / WS_PER_KWH;
	}
	
	public static BigInteger getEtherPerWsFromCents(double cents) {
		double wei = cents*CENT_IN_WEI;
		return BigInteger.valueOf((long) (wei/WS_PER_KWH));
	}
	
	public static double getCentsPerKwhFromWeiPerWs(BigInteger etherPerWs) {
		double perKwh = etherPerWs.doubleValue()*WS_PER_KWH;
		return perKwh/CENT_IN_WEI;
	}
	
	public static String printAmount(BigInteger amount) {
		return (amount.toString() + " Ws (" 
				+ Double.toString(UnitHelper.getkWhfromWs(amount)) + " kWh)");
	}
	
	public static String printCents(BigInteger centUnits) {
		return Double.toString(getCentsPerKwhFromWeiPerWs(centUnits)) + " ct";
	}

}
