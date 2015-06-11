/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package dems.helper;

import java.util.List;

import dems.messageContents.IndividualRequest;

/**
 * CheckRequest
 * 12.06.2014
 * @author bytschkow
 */
public class CheckRequest {
	
	public static int checkIndividualContent(List<IndividualRequest> indvidualRequestList, String id){
		for (int i=0; i<indvidualRequestList.size(); i++){
			if (indvidualRequestList.get(i).id.equals(id)) return i;
		}
		return -1;
	}

}
