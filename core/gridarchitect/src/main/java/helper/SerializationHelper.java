/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package helper;

import java.io.StringWriter;
import java.io.Writer;

import topology.ActorTopology;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * Created with IntelliJ IDEA.
 * User: amack
 * Date: 22.10.13
 * Time: 14:31
 * To change this template use File | Settings | File Templates.
 */
public class SerializationHelper {

    public static String serializeGridTopology(ActorTopology topology) {
        ObjectMapper mapper = new ObjectMapper();
        Writer strWriter = new StringWriter();
        try {
            mapper.writeValue(strWriter, topology);
        } catch (Exception e) {
            System.out.println(e);
        }
        return strWriter.toString();
    }

    public static String serializeObject(Object object) {
        ObjectMapper mapper = new ObjectMapper();
        Writer strWriter = new StringWriter();
        try {
            mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
            mapper.writeValue(strWriter, object);
        } catch (Exception e) {
            System.out.println(e);
        }
        return strWriter.toString();
    }
}
