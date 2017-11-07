package steuerung;

import eclipseScadaClient.EclipseSCADAClient;
import gui.Grafik;

import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import arduinoControl.Arduino;
import serverConnection.PiHandler;
import serverConnection.PiServer;

public class Raspberry extends Thread implements ChangeListener {

	public Grafik pGrafik; // Pointer zur Grafik
	public Arduino pArduino; // Pointer auf Arduino-Klasse
	public PiServer piServer; // Pointer auf PiServer
	public EclipseSCADAClient eClient; // Pointer auf Eclipse SCADA

	// Maximalwerte der Erzeuger
	public int maxWindrad = 5000;
	public int maxSolar = 3000;
	public int maxBiogas = 7000;
	public int maxSolarFortiss = 5400;
	
	public int framesPerSecond = 20;
	public int frameDelay = 1000/framesPerSecond;
	public int refreshCounter = 0;

	// istWerte - können von außerhalb gesendet werden!!!
	public int istSoll = 8000; // Startwert

	private int istIst;
	private int istRequest;

	private int istWind; // Wert zwischen 0 und 100

	private int istSolarFortiss; // aktueller Wert
	private int istFutureSolarFortiss; // Bald erreichter Wert

	private int istWindrad; // aktueller Wert
	private int istFutureWindrad; // Bald erreichter Wert

	private int istSolar; // aktueller Wert
	private int istFutureSolar; // Bald erreichter Wert

	private int istBiogas; // aktueller Wert
	private int istFutureBiogas; // Bald erreichter Wert

	public boolean run = true;

	public int setistWind(int value) {
		if (value < 0) {
			istWind = 0;
		} else if (value > 100) {
			istWind = 100;
		} else {
			istWind = value;
		}
		return istWind;
	}

	public int setistFutureWindrad(int value) {
		if (value < 0) {
			istFutureWindrad = 0;
		} else if (value > maxWindrad) {
			istFutureWindrad = maxWindrad;
		} else {
			istFutureWindrad = value;
		}
		return istFutureWindrad;
	}

	public int setistFutureSolar(int value) {
		if (value < 0) {
			istFutureSolar = 0;
		} else if (value > maxSolar) {
			istFutureSolar = maxSolar;
		} else {
			istFutureSolar = value;
		}
		System.out.println("setistFutureSolar():"+istFutureSolar);
		return istFutureSolar;
	}

	public int setistFutureSolarFortiss(int value) {
		if (value < 0) {
			istFutureSolarFortiss = 0;
		} else if (value > maxSolarFortiss) {
			istFutureSolarFortiss = maxSolarFortiss;
		} else {
			istFutureSolarFortiss = value;
		}
		System.out.println("setistFutureSolarFortiss():"+istFutureSolarFortiss);
		return istFutureSolarFortiss;
	}

	public int setistFutureBiogas(int value) {
		if (value < 0) {
			istFutureBiogas = 0;
		} else if (value > maxBiogas) {
			istFutureBiogas = maxBiogas;
		} else {
			istFutureBiogas = value;
		}
		return istFutureBiogas;
	}

	public int setistBiogas(int value) {
		if (value < 0) {
			istBiogas = 0;
		} else if (value > maxBiogas) {
			istBiogas = maxBiogas;
		} else {
			istBiogas = value;
		}

		PiHandler.bhkw = istBiogas;

		double valueToFW5 = 10.0 * istBiogas / maxBiogas;
		int v = (int) Math.round(valueToFW5);
		eClient.setFW5(v);
		return istBiogas;
	}

	public int getistWind() {
		return this.istWind;
	}

	public int getistFutureWindrad() {
		return this.istFutureWindrad;
	}

	public int getistFutureSolar() {
		return this.istFutureSolar;
	}

	public int getistFutureSolarFortiss() {
		return this.istFutureSolarFortiss;
	}

	public int getistFutureBiogas() {
		return this.istFutureBiogas;
	}

	public int getistIst() {
		return this.istIst;
	}

	public int getistRequest() {
		return this.istRequest;
	}

	public int getistWindrad() {
		return this.istWindrad;
	}

	public int getistSolar() {
		return this.istSolar;
	}

	public int getistSolarFortiss() {
		return this.istSolarFortiss;
	}

	public int getistBiogas() {
		return this.istBiogas;
	}

	/**
	 * Instanziiert eine lauffähige Verwaltung
	 * 
	 * @param pGrafik
	 *            Pointer auf die Grafik
	 * @param maxWinrad
	 *            [W]
	 * @param maxSolar
	 *            [W]
	 * @param maxBiogas
	 *            [W]
	 * @param maxSolarFortiss
	 *            [W]
	 * @param istSoll
	 *            [W]
	 */
	public Raspberry(Grafik pGrafik) {
		super("Raspberry thread");
		this.pGrafik = pGrafik;

		this.istWind = 0;
		this.istWindrad = 0;
		this.istSolar = 0;
		this.istSolarFortiss = 0;
		this.istBiogas = 0;

		try {
			this.pArduino = new Arduino();
		} catch (Exception e) {
			JOptionPane
					.showMessageDialog(
							null,
							"Die Verbindung zum Arduino konnte NICHT hergestellt werden!",
							"Arduino", JOptionPane.ERROR_MESSAGE, null);
		}
		pArduino.initialize();

		this.piServer = new PiServer();
		piServer.start();

		eClient = new EclipseSCADAClient();
		eClient.setRaspberry(this);
		eClient.start();
	}

	/**
	 * WICHTIG: Diese Methode wird aufgerufen, wenn der Benutzer eine Eingabe
	 * gemacht hat.
	 */
	public void stateChanged(ChangeEvent e) {
		istWind = pGrafik.sWind.getValue();
	}

	@Override
	public void run() {
		long anfang = 0; // Stopuhr
		long ende = 0; // Stopuhr
		int sleeptime = 0;

		/********************************************************************
		 * Dauerschleife der Logik
		 ********************************************************************/

		int arduinoCounter = 0;
		while (run) {
			anfang = System.currentTimeMillis();

			// 1. istFuture aktualisieren...
			setistFutureWindrad((int) (istWind / 100.0 * maxWindrad));
			setistFutureBiogas(istSoll - istFutureWindrad - istFutureSolar
					- istFutureSolarFortiss);
			// 2. istWerte anpassen (flüssig, dynamisch, nicht hektisch)
			helpupdateistRandomValues();
			// 3. istIst, istRequest, berechnen

			istIst = istWindrad + istSolar + istBiogas + istSolarFortiss;
			istRequest = istSoll - istIst;

			PiHandler.requestPower = istRequest;
			PiHandler.setPoint = istSoll;

			// Code einfügen...

			/*****************************************
			 * Grafik aktualisieren...falls Änderungen
			 ****************************************/
			pGrafik.updateGUI(false);
			
			/*****************************************
			 * Grafik aktualisieren...erzwingen
			 ****************************************/
			refreshCounter++;
			if (refreshCounter == 100){
				refreshCounter = 0;
				pGrafik.updateGUI(true);
			}

			// Daten an Arduino schicken...
			arduinoCounter++;

			if (arduinoCounter == 10) {
				pArduino.setWindradPower((int) (((double) istWindrad)
						/ ((double) maxWindrad) * 100));
				arduinoCounter = 0;
			}

			// Beende-Routine, Konstante Frame-Rate
			ende = System.currentTimeMillis();
			sleeptime = (int) (frameDelay - (ende - anfang));

			if (sleeptime < 1) {
				sleeptime = frameDelay;
				System.out.println("Performance!");
			}

			try {
				Thread.sleep(sleeptime);
			} catch (InterruptedException e) {
				// e.printStackTrace();
				pArduino.close();
				piServer.stopIt();
				eClient.dispose();
				// System.out.println("Shall be stopped due to error");
			}
		}

		pArduino.close();
		piServer.stopIt();
		eClient.dispose();
		// System.out.println("shall be stopped normally");
	}

	/**
	 * Hilfsmethode in run() Aktualisiert istWindrad, istSolar aber NICHT
	 * istBiogas
	 * 
	 * @return true fals Wert geändert wurde.
	 */
	private boolean helpupdateistRandomValues() {
		double istIncreaserWindrad = 0.005; // Prozentualer Anteil, den ein Wert
											// pro Ausführung steigt.
		double istIncreaserBiogas = 0.01; // Prozentualer Anteil, den ein Wert
											// pro Ausführung steigt.
		boolean wertChanged = false; // Wenn ja muss GUI und Netzwerk
										// aktualisiert werden...

		// istWindrad aktualisieren: (hat beschränkte Leistungsflanken)
		if (istWindrad != istFutureWindrad) {
			wertChanged = true;
			if (istFutureWindrad > istWindrad) {
				if ((istFutureWindrad - istWindrad) < istIncreaserWindrad
						* maxWindrad) {
					istWindrad = istFutureWindrad;
				} else {
					istWindrad =
							istWindrad
									+ (int) (istIncreaserWindrad * maxWindrad);
				}
			} else {// istFutureWindrad<istWindrad
				if ((istFutureWindrad - istWindrad) > (-istIncreaserWindrad * maxWindrad)) {
					istWindrad = istFutureWindrad;
				} else {
					istWindrad =
							istWindrad
									- (int) (istIncreaserWindrad * maxWindrad);
				}
			}

			PiHandler.wind = istWindrad;
		}
		// istSolar aktualisieren:
		this.istSolar = this.istFutureSolar;
		PiHandler.pv = this.istSolar;

		// istSolarFortiss aktualisieren
		this.istSolarFortiss = this.istFutureSolarFortiss;
		PiHandler.pvfortiss = this.istSolarFortiss;

		// Biogas aktualisieren (Hat beschränkte Leistungsflanken)
		if (istBiogas != istFutureBiogas) {
			wertChanged = true;
			int act = this.istBiogas;
			int neu =
					this.istSoll - this.istSolar - this.istSolarFortiss
							- this.istWindrad;
			if (neu - act > 0) {
				if ((neu - act) > istIncreaserBiogas * maxBiogas) {
					neu = act + (int) (istIncreaserBiogas * maxBiogas);
				}
			} else {
				if ((act - neu) > (istIncreaserBiogas * maxBiogas)) {
					neu = act - (int) (istIncreaserBiogas * maxBiogas);
				}
			}
			setistBiogas(neu);
			PiHandler.bhkw = istBiogas;
		}
		return wertChanged;
	}

	public void setPiServer(PiServer piServer) {
		this.piServer = piServer;
	}
}
