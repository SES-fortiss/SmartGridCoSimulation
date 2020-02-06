package gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Implementiert eine Progressbar mit 2 Werten. Wichtige Methoden:
 * ProgressBarAWT(), setMaximum(int), add(JPanel) setActualValue(int),
 * setFutureValue(int), setBounds(int,int,int,int)
 * 
 * @author Markus
 *
 */
public class ProgressBarAWT {
	private JPanel panel = null;
	Graphics g = null;

	private int maxValue;
	private int minValue;
	private int actualValue;
	private int futureValue = 7000;

	// Grafikobjekte
	private int x, y, w, h;

	public ProgressBarAWT() {
		maxValue = 100;
		minValue = 0;
		actualValue = 0;
		futureValue = 0;
	}

	public void setMaximum(int max) {
		maxValue = max;
	}

	public void setMinimum(int min) {
		minValue = min;
	}

	public void add(JPanel panel) {
		// Es wird nur mittels Graphics gezeichnet
		this.panel = panel;
		g = panel.getGraphics();
	}

	public void setBounds(int x, int y, int width, int height) {
		// removeProgressBar();
		this.x = x;
		this.y = y;
		this.w = width;
		this.h = height;
		redrawProgressBar();

	}

	private void removeProgressBar() {
		g.setColor(Color.WHITE);
		g.fillRect((int) (this.x - w * 0.1), this.y, (int) (this.w * 1.2),
				this.h + 10);
	}

	private void redrawProgressBar() {
		if (panel != null) {
			g = panel.getGraphics();

			removeProgressBar();
			// Parameter berechnen:
			int yA =
					h
							- (int) (h * (((double) (actualValue - minValue)) / ((double) (maxValue - minValue))));
			int hA = h - yA;
			int yF =
					h
							- (int) (h * (((double) (futureValue - minValue)) / ((double) (maxValue - minValue))));
			// int hF = yA-yF;
			// System.out.println("yA"+yA+"hA"+hA+"yF"+yF+"hF"+hF);
			// 2Arten die betrachtet werden müssen:
			// 1. hF>0 --> futrureValue > ActualValue
			// 2. hF<0 --> futrureValue < ActualValue

			// IstWerte
			g.setColor(Color.blue);
			g.fillRect(x, y + yA, w, hA);

			// Sollwerte
			g.setColor(Color.BLACK);
			g.fillRect((int) (x - w * 0.1), y + yF, (int) (w * 1.2), 4 + h / 50);

			// Rahmen
			g.setColor(Color.BLACK);
			g.draw3DRect(x, y, w, h, false);
		}
	}
	
	public void setValues(int ist, int future, boolean force) {
		if (future != this.futureValue || ist != this.actualValue || force) {
			futureValue = future;
			actualValue = ist;
			redrawProgressBar();
		}		
	}
}
