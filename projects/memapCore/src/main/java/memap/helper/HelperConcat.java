package memap.helper;

import java.util.Arrays;

public class HelperConcat {
	
	@SuppressWarnings("unchecked")
	public static <T> T[] concatAllObjects(T[] first, T[]... rest) {
		  int totalLength = first.length;
		  for (T[] array : rest) {
		    totalLength += array.length;
		  }
		  
		  T[] result = Arrays.copyOf(first, totalLength);
		  int offset = first.length;
		  for (T[] array : rest) {
		    System.arraycopy(array, 0, result, offset, array.length);
		    offset += array.length;
		  }
		  return result;
	}
	
	public static double[] concatAlldoubles(double[] first, double[]... rest) {
		  int totalLength = first.length;
		  for (double[] array : rest) {
		    totalLength += array.length;
		  }
		  
		  double[] result = Arrays.copyOf(first, totalLength);
		  int offset = first.length;
		  for (double[] array : rest) {
		    System.arraycopy(array, 0, result, offset, array.length);
		    offset += array.length;
		  }
		  return result;
	}

}
