/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package eCarStreet.eCar.helper.decisions;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import java.time.LocalTime;

import org.junit.Before;
import org.junit.Test;

import eCarStreet.eCar.ECar;
import eCarStreet.eCar.helper.configurations.CarConfiguration1;

public class OptimizerTest {
	public ECar ecar = new CarConfiguration1();
	public Duration period = Duration.ofMinutes(15);
	
	@Before
	public void setECarValues(){
		ecar.decision = new SimpleDecision();
		ecar.arrivalTime = LocalTime.of(23, 00);
		ecar.leavingTime = LocalTime.of(1, 0);
		ecar.capacity = 10;
		ecar.startSOC = 0.4;
		ecar.endSOC = 0.6;
	}
	
	@Test
	public void testCorrectOptimizerInitialization() {		
		Optimizer optimizer = new Optimizer(ecar, period);		
		assertEquals("Anzahl Zeitintervalle zwischen 23:00 und 1:00 ist 8, plus 1 = 9", 9, optimizer.timeN);
		assertEquals("Anzahl LadeIntervalle zwischen 4kWh bis 6kWh in 100W Schritten und 15 min Zeitintervallen plus 1", (1000/100)*(60/15)*(6-4)+1, optimizer.socN);
	}

	@Test
	public void testGetDemand() {
		// FIXME
		// fail("Not yet implemented");
	}
	
	@Test
	public void testOptimize(){
		Optimizer optimizer = new Optimizer(ecar, period);	

		double[] preis = new double[optimizer.timeN];
		
		for (int i = 0; i < preis.length; i++) {
			
			preis[i] = 10;
			if (i < 6) preis[i] = 2;
			if (i < 3) preis[i] = 5;
		}
		
		long stopwatch = System.currentTimeMillis();
		
		OptimizationPoint[] optValues = optimizer.optimize(preis);
		
		stopwatch = System.currentTimeMillis()-stopwatch;		
		
		/*
		 
		DecimalFormat df = new DecimalFormat("#0.00");
		df.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
		
		System.out.print("         ");
		for (int i = 0; i < optimizer.timeN; i++) {
			System.out.print(optimizer.opt[i][0].time + "   ");
		}
		System.out.println();
		
		for (int i = optimizer.socN-1; i >= 0; i--){
			System.out.print(df.format(optimizer.opt[0][i].SOCinKWh)+"-SOC  ");
			for (int j = 0; j < optimizer.timeN; j++){
				System.out.print(df.format(optimizer.opt[j][i].cost) + "   ");
			}
			System.out.println();
		}
		
		System.out.println();
		*/

		System.out.println("Result of the optimization method:");
		
		OptimizationPoint op = optValues[0];
		while(op != null){
			System.out.println(op);
			op = op.next;
		}
		
		System.out.println("Dauer der Methode:" + stopwatch + "ms");
	}

}
