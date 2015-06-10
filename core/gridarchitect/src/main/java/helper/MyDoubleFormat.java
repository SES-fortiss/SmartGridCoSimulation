/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package helper;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * MyDoubleFormat
 * 12.06.2014
 * @author bytschkow
 *
 */
public class MyDoubleFormat {
	
	public final static DecimalFormatSymbols format = new DecimalFormatSymbols(Locale.ENGLISH);
	public final static DecimalFormat f = new DecimalFormat("#0.00", format);

}
