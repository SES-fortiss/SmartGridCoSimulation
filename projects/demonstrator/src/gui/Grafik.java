package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import steuerung.Raspberry;

/**
 * Zeigt ein Fenster an, in dem das Windrad gesteuert werden kann und andere
 * Parameter angezeigt werden
 * 
 * @author Markus
 *
 */
@SuppressWarnings("serial")
public class Grafik extends JFrame {
	public Raspberry pRaspberry;

	// Werte aus dem Raspberry

	private int istSolarFortiss, futureSolarFortiss, futureWindrad, istWindrad,
			futureSolar, istSolar, futureBiogas, istBiogas, sollWert, istWert,
			requestWert;

	// Grafische Objekte
	// Slider, processBar, Labels, Button
	public JPanel panel;
	public JSlider sWind;

	// IST-Werte anzeigen:
	public ProgressBarAWT pbWindrad, pbSolar, pbBiogas, pbSolarFortiss;
	public JLabel lWindrad, lSolar, lBiogas, lSolarFortiss;

	// Tabelle darstellen:
	public JLabel lSollText, lSollWert, lIstText, lIstWert, lRequestText,
			lRequestWert;

	// SOLL-Erhöhen/Senken
	public ImageIcon iUP, iDOWN;
	public JButton bSollHoch, bSollRunter, bWindHoch, bWindRunter;
	protected int increaser = 500; // KWH
	protected int increaserWind = 10;

	// Bilder
	public ImageIcon iWind, iSolar, iWindrad, iBiogas, iSolarFortiss;
	public JLabel ilWind, ilSolar, ilWindrad, ilBiogas, ilSolarFortiss;
	// Sonstiges:
	public JLabel lBezeichnung; // lHinweis;

	/**
	 * 
	 * @param maxWindrad
	 * @param maxSolar
	 * @param maxBiogas
	 * @param maxSolarFortiss
	 * @param sollWert
	 */
	public Grafik() {
		pRaspberry = new Raspberry(this);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		initializeUI();
	}

	/**
	 * Initialisiert die GUI. Erledigt folgendes: Initialisiert ALLE Graphischen
	 * Objekte (JLabel,JProgressBar,JSlider,ImageIcon) Aktiviert benötigte
	 * Listener (changeListener, ComponentListener,...) Verbindet die
	 * Grafikobjekte mit dem Fenster und zeigt gewünschten Inhalt an. ACHTUNG:
	 * Design siehe: initializeListener().ComponentListener
	 */
	private void initializeUI() {
		helpinitializeLabel();
		helpinitializeSlider();
		helpinitializeButton();
		helpinitializeIcon();
		helpinitializeProgressBar();
		helpinitializeListener();
		helpinitializeWindow();
		redrawLayout();
	}

	private void helpinitializeButton() {
		URL uUP = getClass().getResource("/src/gui/bilder/pfeilUP.png");
		if (uUP == null) {
			uUP = getClass().getResource("bilder/pfeilUP.png");
		}
		iUP = new ImageIcon(uUP);
		iUP.setImage(iUP.getImage().getScaledInstance(25, 25,
				Image.SCALE_DEFAULT));
		bSollHoch = new JButton(iUP);
		bSollHoch.setBackground(Color.WHITE);
		bWindHoch = new JButton(iUP);
		bWindHoch.setBackground(Color.WHITE);

		URL uDOWN = getClass().getResource("/src/gui/bilder/pfeilDOWN.png");
		if (uDOWN == null) {
			uDOWN = getClass().getResource("bilder/pfeilDOWN.png");
		}
		iDOWN = new ImageIcon(uDOWN);
		iDOWN.setImage(iDOWN.getImage().getScaledInstance(25, 25,
				Image.SCALE_DEFAULT));
		bSollRunter = new JButton(iDOWN);
		bSollRunter.setBackground(Color.WHITE);
		bWindRunter = new JButton(iDOWN);
		bWindRunter.setBackground(Color.WHITE);
	}

	public Raspberry getRaspberry() {
		return pRaspberry;
	}

	/**
	 * WICHTIG: Aktualisiert die GUI, aufrufen sobald Werte in Raspberry sich
	 * ändern!!
	 * 
	 * @param futureWindrad
	 * @param istWindrad
	 * @param futureSolar
	 * @param istSolar
	 * @param futureBiogas
	 * @param istBiogas
	 * @param sollWert
	 * @param istWert
	 * @param requestWert
	 * @param istSolarFortiss
	 * @param istFutureSolarFortiss
	 */
	public void updateGUI(final boolean force) {

		updateValues();

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {

				// Labels aktualisieren...
				lSollWert.setText(helpgetLeistungInString(sollWert));
				lIstWert.setText(helpgetLeistungInString(istWert));
				lRequestWert.setText(helpgetLeistungInString(requestWert));

				lWindrad.setText(helpgetLeistungInString(istWindrad));
				lSolar.setText(helpgetLeistungInString(istSolar));
				lBiogas.setText(helpgetLeistungInString(istBiogas));
				lSolarFortiss.setText(helpgetLeistungInString(istSolarFortiss));

				// progressBars aktualisieren...
				pbWindrad.setValues(istWindrad, futureWindrad, force);
				pbSolar.setValues(istSolar, futureSolar, force);
				pbBiogas.setValues(istBiogas, futureBiogas, force);
				pbSolarFortiss.setValues(istSolarFortiss, futureSolarFortiss,
						force);

				if (requestWert == 0) {
					lRequestWert.setForeground(Color.black);
				} else {
					lRequestWert.setForeground(Color.red);
				}
			}
		});
	}

	private void updateValues() {
		futureSolarFortiss = pRaspberry.getistFutureSolarFortiss();
		istSolarFortiss = pRaspberry.getistSolarFortiss();
		futureWindrad = pRaspberry.getistFutureWindrad();
		istWindrad = pRaspberry.getistWindrad();
		futureSolar = pRaspberry.getistFutureSolar();
		istSolar = pRaspberry.getistSolar();
		futureBiogas = pRaspberry.getistFutureBiogas();
		istBiogas = pRaspberry.getistBiogas();
		sollWert = pRaspberry.istSoll;
		istWert = pRaspberry.getistIst();
		requestWert = pRaspberry.getistRequest();
	}

	private String helpgetLeistungInString(int istSoll) {
		String re = istSoll + "W";
		re = ((int) ((double) istSoll / 100)) / 10.0 + "MW";
		return re;
	}

	/**
	 * WICHTIG: Ordnet alle Grafikobjekte richtig an. Nur die Anordnung. SEHR
	 * WICHTIGE METHODE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	 */
	protected void redrawLayout() {

		Dimension dim = this.getSize();
		int x = dim.width;
		int y = dim.height;
		double scaleX = x / 825.0;
		double scaleY = y / 650.0;

		// Bilder anpassen:
		ilWind.setIcon(new ImageIcon(iWind.getImage()
				.getScaledInstance((int) (100 * scaleX), (int) (100 * scaleY),
						Image.SCALE_DEFAULT)));
		ilWind.setBounds((int) (25 * scaleX), (int) (25 * scaleY),
				(int) (100 * scaleX), (int) (100 * scaleY));

		ilSolar.setIcon(new ImageIcon(iSolar.getImage().getScaledInstance(
				(int) (75 * scaleX), (int) (75 * scaleY), Image.SCALE_DEFAULT)));
		ilSolar.setBounds((int) (238 * scaleX), (int) (185 * scaleY),
				(int) (100 * scaleX), (int) (100 * scaleY));

		ilSolarFortiss.setIcon(new ImageIcon(iSolarFortiss.getImage()
				.getScaledInstance((int) (75 * scaleX), (int) (75 * scaleY),
						Image.SCALE_DEFAULT)));
		ilSolarFortiss.setBounds((int) (388 * scaleX), (int) (185 * scaleY),
				(int) (100 * scaleX), (int) (100 * scaleY));

		ilWindrad
				.setIcon(new ImageIcon(iWindrad.getImage().getScaledInstance(
						(int) (75 * scaleX), (int) (75 * scaleY),
						Image.SCALE_DEFAULT)));
		ilWindrad.setBounds((int) (538 * scaleX), (int) (185 * scaleY),
				(int) (100 * scaleX), (int) (100 * scaleY));

		ilBiogas.setIcon(new ImageIcon(iBiogas.getImage().getScaledInstance(
				(int) (75 * scaleX), (int) (75 * scaleY), Image.SCALE_DEFAULT)));
		ilBiogas.setBounds((int) (688 * scaleX), (int) (185 * scaleY),
				(int) (100 * scaleX), (int) (100 * scaleY));

		// JLabel anpassen:
		lBezeichnung.setBounds((int) (225 * scaleX), (int) (25 * scaleY),
				(int) (400 * scaleX), (int) (60 * scaleY));
		lBezeichnung.setFont(new Font("Buxton Sketch", Font.ITALIC,
				5 + (int) (40 * scaleX)));
		// lHinweis.setBounds((int)(225*scaleX), (int)(165*scaleY),
		// (int)(375*scaleX), (int)(50*scaleY));
		// lHinweis.setFont(new Font("Ariel", Font.ITALIC, 5+(int)(10*scaleX)));

		lSolar.setBounds((int) (225 * scaleX), (int) (275 * scaleY),
				(int) (100 * scaleX), (int) (50 * scaleY));
		lSolar.setFont(new Font("Ariel", Font.ITALIC, 5 + (int) (20 * scaleX)));
		lSolarFortiss.setBounds((int) (375 * scaleX), (int) (275 * scaleY),
				(int) (100 * scaleX), (int) (50 * scaleY));
		lSolarFortiss.setFont(new Font("Ariel", Font.ITALIC,
				5 + (int) (20 * scaleX)));
		lWindrad.setBounds((int) (525 * scaleX), (int) (275 * scaleY),
				(int) (100 * scaleX), (int) (50 * scaleY));
		lWindrad.setFont(new Font("Ariel", Font.ITALIC, 5 + (int) (20 * scaleX)));
		lBiogas.setBounds((int) (675 * scaleX), (int) (275 * scaleY),
				(int) (100 * scaleX), (int) (50 * scaleY));
		lBiogas.setFont(new Font("Ariel", Font.ITALIC, 5 + (int) (20 * scaleX)));

		// Tabelle erstellen:
		lSollText.setBounds((int) (225 * scaleX), (int) (60 * scaleY),
				(int) (100 * scaleX), (int) (100 * scaleY));
		lSollText.setFont(new Font("Ariel", Font.ITALIC,
				5 + (int) (20 * scaleX)));
		lSollWert.setBounds((int) (225 * scaleX), (int) (100 * scaleY),
				(int) (100 * scaleX), (int) (100 * scaleY));
		lSollWert.setFont(new Font("Ariel", Font.ITALIC,
				5 + (int) (20 * scaleX)));

		lIstText.setBounds((int) (375 * scaleX), (int) (60 * scaleY),
				(int) (100 * scaleX), (int) (100 * scaleY));
		lIstText.setFont(new Font("Ariel", Font.ITALIC, 5 + (int) (20 * scaleX)));
		lIstWert.setBounds((int) (375 * scaleX), (int) (100 * scaleY),
				(int) (100 * scaleX), (int) (100 * scaleY));
		lIstWert.setFont(new Font("Ariel", Font.ITALIC, 5 + (int) (20 * scaleX)));

		lRequestText.setBounds((int) (530 * scaleX), (int) (60 * scaleY),
				(int) (200 * scaleX), (int) (100 * scaleY));
		lRequestText.setFont(new Font("Ariel", Font.ITALIC,
				5 + (int) (20 * scaleX)));
		lRequestWert.setBounds((int) (530 * scaleX), (int) (100 * scaleY),
				(int) (100 * scaleX), (int) (100 * scaleY));
		lRequestWert.setFont(new Font("Ariel", Font.ITALIC,
				5 + (int) (20 * scaleX)));

		// Buttons anordnen:
		bSollHoch.setBounds((int) (155 * scaleX), (int) (25 * scaleY),
				(int) (50 * scaleX), (int) (75 * scaleY));
		bSollRunter.setBounds((int) (155 * scaleX), (int) (100 * scaleY),
				(int) (50 * scaleX), (int) (75 * scaleY));
		bWindHoch.setBounds((int) (25 * scaleX), (int) (150 * scaleY),
				(int) (100 * scaleX), (int) (50 * scaleY));
		bWindRunter.setBounds((int) (25 * scaleX), (int) (525 * scaleY),
				(int) (100 * scaleX), (int) (50 * scaleY));

		// Slider anpassen:
		sWind.setBounds((int) (25 * scaleX), (int) (215 * scaleY),
				(int) (100 * scaleX), (int) (295 * scaleY));

		// ProcessBar anpassen:
		pbSolar.setBounds((int) (225 * scaleX), (int) (325 * scaleY),
				(int) (100 * scaleX), (int) (250 * scaleY));
		pbSolarFortiss.setBounds((int) (375 * scaleX), (int) (325 * scaleY),
				(int) (100 * scaleX), (int) (250 * scaleY));
		pbWindrad.setBounds((int) (525 * scaleX), (int) (325 * scaleY),
				(int) (100 * scaleX), (int) (250 * scaleY));
		pbBiogas.setBounds((int) (675 * scaleX), (int) (325 * scaleY),
				(int) (100 * scaleX), (int) (250 * scaleY));

		updateGUI(true);

	}

	/**
	 * Konfiguriet das Fenster, fügt alle Komponenten hinzu,...
	 */
	private void helpinitializeWindow() {
		// Fenster anpassen:
		this.setSize(825, 600);
		this.setVisible(true);

		// Container initialisieren:
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setName("Cluster VKW");
		this.add(panel);

		// Komonenten zum Container hinzufügen...
		// JLabel hinzufügen:
		panel.add(lBezeichnung);
		// panel.add(lHinweis);
		panel.add(lWindrad);
		panel.add(lSolar);
		panel.add(lBiogas);
		panel.add(lSolarFortiss);

		panel.add(lSollText);
		panel.add(lSollWert);
		panel.add(lIstText);
		panel.add(lIstWert);
		panel.add(lRequestText);
		panel.add(lRequestWert);

		// Icons hinzufügen:
		panel.add(ilWind);
		panel.add(ilWindrad);
		panel.add(ilSolar);
		panel.add(ilBiogas);
		panel.add(ilSolarFortiss);

		// Slider hinzufügen:
		panel.add(sWind);

		// ProgressBar hinzufügen:
		pbWindrad.add(panel);
		pbSolar.add(panel);
		pbBiogas.add(panel);
		pbSolarFortiss.add(panel);

		// Button hinzufügen
		panel.add(bSollHoch);
		panel.add(bSollRunter);
		panel.add(bWindHoch);
		panel.add(bWindRunter);

	}

	/** Initialisiert alle ProgressBars in der GUI */
	private void helpinitializeProgressBar() {
		// Komponenten erstellen...
		pbWindrad = new ProgressBarAWT();
		pbBiogas = new ProgressBarAWT();
		pbSolar = new ProgressBarAWT();
		pbSolarFortiss = new ProgressBarAWT();

		// Komponenten anpassen...

		pbBiogas.setMaximum(pRaspberry.maxBiogas);
		pbBiogas.setMinimum(0);
		pbBiogas.setValues(0, 0, true);

		pbSolar.setMaximum(pRaspberry.maxSolar);
		pbSolar.setMinimum(0);
		pbSolar.setValues(0, 0, true);

		pbWindrad.setMaximum(pRaspberry.maxWindrad);
		pbWindrad.setMinimum(0);
		pbWindrad.setValues(0, 0, true);

		pbSolarFortiss.setMaximum(pRaspberry.maxSolarFortiss);
		pbSolarFortiss.setMinimum(0);
		pbSolarFortiss.setValues(0, 0, true);
	}

	/**
	 * Aktiviert folgende Listener: - ActionListener: Sollwert verändern -
	 * changeListener: Benutzer benutzt sWind - windowClosing: Benutzer schließt
	 * das Fenster - ComponentListener: Benutzer ändert die Fenstergröße
	 */
	private void helpinitializeListener() {
		// ActionListener für Sollwerteinstellung
		bSollHoch.addActionListener(new java.awt.event.ActionListener() {
			// Beim Drücken des Menüpunktes wird actionPerformed aufgerufen
			public void actionPerformed(java.awt.event.ActionEvent e) {
				// debug("Soll wird um "+increaser+" erhöht!");
				pRaspberry.istSoll += increaser;
			}
		});

		bSollRunter.addActionListener(new java.awt.event.ActionListener() {
			// Beim Drücken des Menüpunktes wird actionPerformed aufgerufen
			public void actionPerformed(java.awt.event.ActionEvent e) {
				// debug("Soll wird um "+increaser+" gesenkt!");
				pRaspberry.istSoll -= increaser;
			}
		});

		bWindHoch.addActionListener(new java.awt.event.ActionListener() {
			// Beim Drücken des Menüpunktes wird actionPerformed aufgerufen
			public void actionPerformed(java.awt.event.ActionEvent e) {
				// debug("Soll wird um "+increaser+" gesenkt!");
				sWind.setValue(sWind.getValue() + increaserWind);
				// pRaspberry.setistWind(pRaspberry.getistWind()+
				// increaserWind);
			}
		});
		bWindRunter.addActionListener(new java.awt.event.ActionListener() {
			// Beim Drücken des Menüpunktes wird actionPerformed aufgerufen
			public void actionPerformed(java.awt.event.ActionEvent e) {
				// debug("Soll wird um "+increaser+" gesenkt!");
				sWind.setValue(sWind.getValue() - increaserWind);

			}
		});

		// changeListener:
		sWind.addChangeListener(pRaspberry);

		// windowClosing:
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				pRaspberry.run = false;
				try {
					pRaspberry.join(10000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println("disposing swt");
				((Grafik) e.getSource()).dispose();
				System.out.println("after disposing swt");
			}
		});

		// ComponentListener (resize):
		this.addComponentListener(new ComponentListener() {
			public void componentResized(ComponentEvent e) {
				redrawLayout();
			}

			public void componentMoved(ComponentEvent e) {
				redrawLayout();
			}

			public void componentShown(ComponentEvent e) {
				redrawLayout();
			}

			public void componentHidden(ComponentEvent e) {
			}
		});
	}

	/** Initialisiert alle für Bilder benötigte Variablen in der GUI */
	private void helpinitializeIcon() {
		// Icons anzeigen...
		// Wind:
		URL uWind = getClass().getResource("/src/gui/bilder/Wetter.png");
		if (uWind == null) {
			uWind = getClass().getResource("bilder/Wetter.png");
		}
		iWind = new ImageIcon(uWind);
		iWind.setImage(iWind.getImage().getScaledInstance(100, 100,
				Image.SCALE_DEFAULT));
		ilWind = new JLabel();

		// Windrad:
		URL uWindrad = getClass().getResource("/src/gui/bilder/Wind.png");
		if (uWindrad == null) {
			uWindrad = getClass().getResource("bilder/Wind.png");
		}
		iWindrad = new ImageIcon(uWindrad);
		iWindrad.setImage(iWindrad.getImage().getScaledInstance(100, 100,
				Image.SCALE_DEFAULT));
		ilWindrad = new JLabel();

		// Solar:
		URL uSolar = getClass().getResource("/src/gui/bilder/Solar.png");
		if (uSolar == null) {
			uSolar = getClass().getResource("bilder/Solar.png");
		}
		iSolar = new ImageIcon(uSolar);
		iSolar.setImage(iSolar.getImage().getScaledInstance(100, 100,
				Image.SCALE_DEFAULT));
		ilSolar = new JLabel();

		// Biogas:
		URL uBiogas = getClass().getResource("/src/gui/bilder/Biomass.png");
		if (uBiogas == null) {
			uBiogas = getClass().getResource("bilder/Biomass.png");
		}
		iBiogas = new ImageIcon(uBiogas);
		iBiogas.setImage(iBiogas.getImage().getScaledInstance(100, 100,
				Image.SCALE_DEFAULT));
		ilBiogas = new JLabel();

		// SolarFortiss:
		URL uSolarFortiss =
				getClass().getResource("/src/gui/bilder/fortissPV.png");
		if (uSolarFortiss == null) {
			uSolarFortiss = getClass().getResource("bilder/fortissPV.png");
		}
		iSolarFortiss = new ImageIcon(uSolarFortiss);
		iSolarFortiss.setImage(iSolarFortiss.getImage().getScaledInstance(100,
				100, Image.SCALE_DEFAULT));
		ilSolarFortiss = new JLabel();
	}

	/** Initialisiert alle JSlider in der GUI */
	private void helpinitializeSlider() {
		sWind = new JSlider(javax.swing.SwingConstants.VERTICAL);
		// Komponenten anpassen...
		sWind.setMinimum(0);
		sWind.setMaximum(100);
		sWind.setMajorTickSpacing(20);
		sWind.setMinorTickSpacing(5);
		sWind.createStandardLabels(1);
		sWind.setPaintTicks(true);
		sWind.setPaintLabels(true);
		sWind.setBackground(Color.WHITE);
		// sWind.setMinorTickSpacing(10);
		sWind.setSnapToTicks(true);
	}

	/** Initialisiert alle JLabel in der GUI */
	private void helpinitializeLabel() {
		lBezeichnung = new JLabel("VKW Cluster");
		// lHinweis = new JLabel("Hinweis:");

		lWindrad = new JLabel("0.0 MW");
		lSolar = new JLabel("0.0 MW");
		lBiogas = new JLabel("0.0 MW");
		lSolarFortiss = new JLabel("0.0 MW");

		lSollText = new JLabel("Sollwert");
		lSollWert = new JLabel("0.0 MW");
		lIstText = new JLabel("Istwert");
		lIstWert = new JLabel("0.0 MW");
		lRequestText = new JLabel("Abweichung");
		lRequestWert = new JLabel("0.0 MW");
	}
}
