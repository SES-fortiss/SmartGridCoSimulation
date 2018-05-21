package ethereum.helper;

import java.math.BigInteger;

public class UnitHelper {
	
	private static final double CENT_IN_WEI = 10000000000000000.0;

	public static BigInteger getWSfromKWH(int kWh) {
		return BigInteger.valueOf(kWh*3600000);
	}

	public static BigInteger getWSfromKWH(double kWh) {
		return BigInteger.valueOf((long) (kWh*3600000));
	}

	public static double getkWhfromWs(BigInteger ws) {
		return ws.doubleValue() / 3600000.0;
	}
	
	public static BigInteger getEtherPerWsFromCents(double cents) {
		double wei = cents*CENT_IN_WEI;
		return BigInteger.valueOf((long) (wei/3600000.0));
	}
	
	public static double getCentsPerKwhFromEtherPerWs(BigInteger etherPerWs) {
		double perKwh = etherPerWs.doubleValue()*3600000.0;
		return perKwh/CENT_IN_WEI;
	}
	
	public static String printAmount(BigInteger amount) {
		return (amount.toString() + " Ws (" 
				+ Double.toString(UnitHelper.getkWhfromWs(amount)) + " kWh)");
	}
	
	public static String printCents(BigInteger centUnits) {
		return Double.toString(getCentsPerKwhFromEtherPerWs(centUnits)) + " ct";
	}

}
