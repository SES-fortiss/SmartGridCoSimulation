package arduinoControl;

/**
 * HOW-TO:
 * Windows: 
 * 1. .jar erstellen (Eclipse: File->Export->RunnableJarFile)
 * 2. rxtxParallel.dll und rxtxSerial.dll in gleichen Ordner kopieren wie .jar Datei
 * 3. Arduino-Sketch auf Arduino laden. (mit entsprechendem Programm)
 * 4. fertig
 * 
 * Raspberry:
 * 1. Raspbian installieren
 * 2. Arduino installieren (sudo apt-get install arduino)
 * 3. evtl. Java nachinstallieren
 * 4. .jar Datei ausf�hren -> fertig (*freu*)
 * 
 * Die Verbindung steht und der Motor wird entsprechend angesteuert!
 * TODO Motorkalibrierung
 */

import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Enumeration;

import javax.swing.JOptionPane;

public class Arduino implements SerialPortEventListener {
	SerialPort serialPort;

	private static final String PORT_NAMES[] = { 
			"/dev/tty.usbserial-A9007UX1", // Mac OS X
                        "/dev/ttyACM0", // Raspberry Pi
						"/dev/ttyUSB0", // Linux
						"/dev/ttyUSB1", // Linux
						"COM3", // Windows
	};
	/**
	* A BufferedReader which will be fed by a InputStreamReader 
	* converting the bytes into characters 
	* making the displayed results codepage independent
	*/
	private BufferedReader input;
	/** The output stream to the port */
	public OutputStream output;
	/** Milliseconds to block while waiting for port open */
	private static final int TIME_OUT = 2000;
	/** Default bits per second for COM port. */
	private static final int DATA_RATE = 9600;

	public void initialize() {
        // the next line is for Raspberry Pi and 
        // gets us into the while loop and was suggested here was suggested http://www.raspberrypi.org/phpBB3/viewtopic.php?f=81&t=32186
        // System.setProperty("gnu.io.rxtx.SerialPorts", "/dev/ttyACM0");
		
		CommPortIdentifier portId = null;
		
		@SuppressWarnings("rawtypes")
		Enumeration portEnum = CommPortIdentifier.getPortIdentifiers();
		
		//System.out.println("portEnum.hasMoreElements()" + portEnum.hasMoreElements());
		
		//First, Find an instance of serial port as set in PORT_NAMES.
		
		while (portEnum.hasMoreElements()) {
			
			CommPortIdentifier currPortId = (CommPortIdentifier) portEnum.nextElement();
			for (String portName : PORT_NAMES) {
				
				if (currPortId.getName().equals(portName)) {
					System.out.println("Found port: " + portName);
					portId = currPortId;
					break;
				}
			}
		}
		
		if (portId == null) {
			JOptionPane.showMessageDialog(null, "Raspberry konnte keine Verbindung zum Arduino herstellen!", "Arduino!", JOptionPane.ERROR_MESSAGE, null); 
			System.out.println("Could not find COM port.");
			return;
		}
		try {
			// open serial port, and use class name for the appName.
			serialPort = (SerialPort) portId.open(this.getClass().getName(),
					TIME_OUT);
			// set port parameters
			serialPort.setSerialPortParams(DATA_RATE,
					SerialPort.DATABITS_8,
					SerialPort.STOPBITS_1, //TODO maybe change it!
					SerialPort.PARITY_NONE);
			// open the streams
			input = new BufferedReader(new InputStreamReader(serialPort.getInputStream()));
			output = serialPort.getOutputStream();
			// add event listeners
			serialPort.addEventListener(this);
			serialPort.notifyOnDataAvailable(true);
			JOptionPane.showMessageDialog(null, "Das Programm konnte eine Verbindung mit dem Arduino herstellen!", "Arduino", JOptionPane.INFORMATION_MESSAGE, null);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Das Programm konnte keine Verbindung mit dem Arduino herstellen!", "Arduino", JOptionPane.ERROR_MESSAGE, null);
			System.err.println(e.toString());
		}
	}

	
	public int actualWindPower = 0;
	/**
	 * Mit dieser Methode kann das Windrad gesteuert werden.
	 * Es werden Char zeichen 0-9 gewertet, alle andernen Zeichen dienen als Terminierendes Zeichen.(Siehe Sketch)
	 * Alle anderen gesendeten Werte werden vom Arduino ignoriert!!!!
	 * @param power Wert zwischen 0 und 100!
	 * @return Erfolg
	 */
	public boolean setWindradPower(int power){
		if(power==actualWindPower){return true;
		}else{
			actualWindPower = power;
			if(power!=0){
				power = (int)(power*2.5 + 5); //Offset TODO
			}
			byte[] send = {'A','0','0','0','A'};
			send[1] = getCharOfNumber((int)((power%1000)/100));
			send[2] = getCharOfNumber(((int)((power%1000)/10))%10);
			send[3] = getCharOfNumber((int)((power%1000)%10));
		
			System.out.println("Senden to Arduino:" + power);
			
			try {
				output.write(send);
			} catch (Exception e) {
				//JOptionPane.showMessageDialog(null, "Daten konnten nicht an Arduino gesendet werden!", "Fehler!", JOptionPane.ERROR_MESSAGE, null); 
				return false;
			}
			return true;
		}
	}
	/**
	 * 
	 * @param nummer 0 bis 9
	 * @return
	 */
	public byte getCharOfNumber(int nummer){
		switch(nummer){
		case 0: return '0';
		case 1: return '1';
		case 2: return '2';
		case 3: return '3';
		case 4: return '4';
		case 5: return '5';
		case 6: return '6';
		case 7: return '7';
		case 8: return '8';
		case 9: return '9';
		default: return 0;
		}
	}
	
	/**
	 * This should be called when you stop using the port.
	 * This will prevent port locking on platforms like Linux. TODO
	 */
	public synchronized void close() {
		if (serialPort != null) {
			serialPort.removeEventListener();
			serialPort.close();
		}
	}

	/**
	 * Handle an event on the serial port. Read the data and print it.
	 */
	public synchronized void serialEvent(SerialPortEvent oEvent) {
		if (oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
			//System.out.println("Daten verfügbar!");
			try {
				//System.out.println("Anfang auslesen:");
				//TODO (unwichtig)Fallbehandlung wenn Arduino ein Signal sendet...
				//Wird vorerst nicht benötigt
				
				String inputLine ="Test";
				while(inputLine!=null){
					//System.out.print("-->");
					inputLine=input.readLine();
					
					if(inputLine!=null){
					System.out.println("-->"+inputLine+"<--");
					}else{
					//System.out.print("<--");
					}
				}
				System.out.println("Ende auslesen:");
				byte[] text = {52,56,63,24};
				output.write(text);
			} catch (Exception e) {
				//System.err.println(e.toString());
			}
		}
		// Ignore all the other eventTypes, but you should consider the other ones.
	}
}