/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package georg.models.helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import org.junit.Test;

/**
 * Schedule 18.03.2014
 * 
 * @author bytschkow
 *
 */
public class GeorgSchedule {

	private static boolean fileRead = false;

	private static double[][] values = null;
	/*
	 * Die Componenten sind sehr hacky integriert, aber das war der erste Test,
	 * daher ist das ok
	 */

	private static String[] names = new String[12];

	public static double getSchedule(String name, int timeStep) {
		if (!fileRead)
			getResults();
		timeStep--;
		if (name.equals("solar"))
			return values[0][timeStep];
		if (name.equals("storage"))
			return values[1][timeStep];
		if (name.equals("fridge1"))
			return values[2][timeStep];
		if (name.equals("fridge2"))
			return values[3][timeStep];
		if (name.equals("fridge3"))
			return values[4][timeStep];
		if (name.equals("fridge4"))
			return values[5][timeStep];
		if (name.equals("fridge5"))
			return values[6][timeStep];
		if (name.equals("fridge6"))
			return values[7][timeStep];
		if (name.equals("fridge7"))
			return values[8][timeStep];
		if (name.equals("fridge8"))
			return values[9][timeStep];
		if (name.equals("fridge9"))
			return values[10][timeStep];
		if (name.equals("fridge10"))
			return values[11][timeStep];

		// else
		return 0.0;
	}

	/**
	 * @throws ParseException
	 * 
	 */
	private static void getResults() {

		try {
			String str =
					System.getProperty("user.dir")
							+ "/src/main/resources/xtream/Trace-Opt.csv";
			BufferedReader br = new BufferedReader(new FileReader(str));

			String zeile;
			String[] buffer;

			try {
				zeile = br.readLine();
				buffer = zeile.split(";");

				int timeStepsAvailable = buffer.length - 1;
				values = new double[names.length][timeStepsAvailable];

				NumberFormat format = NumberFormat.getInstance(Locale.GERMANY);
				Number number = null;

				zeile = br.readLine();

				int counterZeile = 0;
				while (zeile != null && counterZeile < names.length) {
					buffer = zeile.split(";");
					names[counterZeile] = buffer[0];
					for (int i = 1; i < timeStepsAvailable; i++) {
						try {
							number = format.parse(buffer[i]);
							values[counterZeile][i - 1] = number.doubleValue();
						} catch (ParseException e) {
							e.printStackTrace();
						}
					}
					zeile = br.readLine();
					counterZeile++;
				}

				br.close();
				fileRead = true;
			} catch (IOException e) {
				System.out.println("Fehler beim einlesen der Datei.");
				br.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void test() {
		System.out.println(this.getClass() + " - test");
		getResults();
		System.out.println("getResults() - executed\n");
	}

	@Test
	public void test2() {
		System.out.println(this.getClass() + " - test2");
		System.out.println(getSchedule("fridge10", 3));
	}

}
