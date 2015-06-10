/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package powerflowApi.helper;

/**
 * @author Denis Bytschkow
 *
 */
public class AutoMapException extends Exception {
	private static final long serialVersionUID = 1L;
	AutoMapException() {
		super("Error in PowerflowMapping.automap() due to inapplicable naming scheme");
	}
}
