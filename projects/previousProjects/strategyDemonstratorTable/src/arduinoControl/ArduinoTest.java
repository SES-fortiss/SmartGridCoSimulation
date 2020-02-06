package arduinoControl;

import org.junit.Test;

public class ArduinoTest {

	/**
	 * Kurztest Arduino
	 *
	 **/
	
	@Test
	public static void shortTest() throws Exception {
		Arduino ard = new Arduino();
		int number = 45;
		System.out.println(number+":");
		System.out.print((char)ard.getCharOfNumber((int)((number%1000)/100)));
		System.out.print((char)ard.getCharOfNumber(((int)((number%1000)/10))%10));
		System.out.print((char)ard.getCharOfNumber((int)((number%1000)%10)));
		ard.initialize();
		ard.setWindradPower(number);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i = 0 ; i < 10 ; i++){
				byte[] array1 = {'g','G'};
				ard.output.write(array1);
				ard.output.write(55);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
				byte[] array = {'a'};
				ard.output.write(array);
				ard.output.write(55);
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}		
	}

}
