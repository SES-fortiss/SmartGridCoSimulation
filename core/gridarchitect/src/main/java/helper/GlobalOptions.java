/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package helper;

/**
 * Created with IntelliJ IDEA.
 * User: amack
 * Date: 31.10.13
 * Time: 11:14
 * To change this template use File | Settings | File Templates.
 */
public abstract class GlobalOptions {	
    
	public static final String rootFolderPath = System.getProperty("user.home") + "/sessim/";
    
    public static String resultFolderPath(String simulationName){
        return rootFolderPath+simulationName+"/results/";
    }
    
    public static String inputFolderPath(String simulationName){
        return rootFolderPath+simulationName+"/input/";
    }
    
    public static String wwwFolder(String simulationName){
    	return System.getProperty("user.home") + "/www/";
    }
}
