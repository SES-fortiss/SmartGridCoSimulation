/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package helper;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;



/**
 * Helper class to streamline the used I/O operations.
 */
public class IoHelper {

    public static void saveFileRelativePath(String filePath, String content) {
        saveFile(GlobalOptions.rootFolderPath + filePath, content);
    }


    public static void saveFile(String absoluteFilePath, String content) {
        if (!absoluteFilePath.contains(".")) throw new IllegalArgumentException("file is invalid: "+absoluteFilePath);
        createParentFolders(absoluteFilePath);
        try {
            PrintWriter out = new PrintWriter(absoluteFilePath);
            out.print(content);
            out.close();
        } catch (Exception e ) {
            System.out.println(e);
        }
    }


    public static void appendToFileRelativePath(String filePath, String content) {
        appendToFile(GlobalOptions.rootFolderPath +filePath, content);
    }


    public static void appendToFile(String absoluteFilePath, String content) {
        try {
            FileWriter out = new FileWriter(absoluteFilePath, true);
            BufferedWriter bufferWritter = new BufferedWriter(out);
            bufferWritter.write(content);
            bufferWritter.close();
        } catch (IOException e) {
            saveFile(absoluteFilePath, content);
        }
    }


    protected static File createParentFolders(String folderPath) {
        try {
            File destination = new File(folderPath);
            destination.getParentFile().mkdirs();
            destination.setWritable(true);
            destination.setReadable(true);
            return destination;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }


    public static String openFileAsString(String filePath) throws Exception{
        Charset encoding =  Charset.defaultCharset();
        byte[] encoded = Files.readAllBytes(Paths.get(GlobalOptions.rootFolderPath +filePath));
        return encoding.decode(ByteBuffer.wrap(encoded)).toString();
    }

    public static String openFileAsStringAbsolutePath(String absoluteFilePath) throws Exception {
        Charset encoding =  Charset.defaultCharset();
        byte[] encoded = Files.readAllBytes(Paths.get(absoluteFilePath));
        return encoding.decode(ByteBuffer.wrap(encoded)).toString();
    }
}
