/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package helper.standardLastProfil;

import java.time.LocalDate;

public enum Periode {
	WINTER,
	SOMMER,
	UEBERGANG;	

	public static Periode of(LocalDate localDate) {
		// winter: 1.11 - 20.03
		// übergang: 21.03. - 14.05
		// sommer: 15.05. - 14.09
		// übergang: 15.09 - 31.10	
				
		int year = localDate.getYear();
		
		LocalDate winterAnfang = LocalDate.of(year, 11, 1);
		LocalDate uebergangMaerzAnfang = LocalDate.of(year, 03, 21);
		LocalDate sommerAnfang = LocalDate.of(year, 5, 15);
		LocalDate uebergangSeptemberAnfang = LocalDate.of(year, 9, 15);
		
		if (localDate.compareTo(winterAnfang) >= 0 || localDate.compareTo(uebergangMaerzAnfang) < 0){
			return Periode.WINTER;
		}
		
		if (localDate.compareTo(uebergangMaerzAnfang) >= 0 && localDate.compareTo(sommerAnfang) < 0){
			return Periode.UEBERGANG;
		}
		
		if (localDate.compareTo(sommerAnfang) >= 0 && localDate.compareTo(uebergangSeptemberAnfang) < 0){
			return Periode.SOMMER;
		}
		
		if (localDate.compareTo(uebergangSeptemberAnfang) >= 0 && localDate.compareTo(winterAnfang) < 0){
			return Periode.UEBERGANG;
		}
		
		return null;
	}
}
