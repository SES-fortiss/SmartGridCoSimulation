package ethereum.helper;

import java.math.BigInteger;

public class UnitHelper {

	public static BigInteger getWSfromKWH(int kWh) {
		return BigInteger.valueOf(kWh*3600000);
	}

	public static BigInteger getWSfromKWH(double kWh) {
		return BigInteger.valueOf((int) (kWh*3600000));
	}

	public static double getkWhfromWs(BigInteger ws) {
		return ws.doubleValue() / 3600000.0;
	}
	
	public static BigInteger getCentsPerWsFromCents(double cents) {
		return BigInteger.valueOf((int) (cents*3600000));
	}
	
	public static double getCentsFromCentUnits(BigInteger centUnits) {
		return centUnits.doubleValue() / 3600000.0;
	}
	
	public static String printAmount(BigInteger amount) {
		return (amount.toString() + " Ws (" 
				+ Double.toString(UnitHelper.getkWhfromWs(amount)) + " kWh)");
	}
	
	public static String printCents(BigInteger centUnits) {
		return Double.toString(getCentsFromCentUnits(centUnits)) + " ct";
	}

}
