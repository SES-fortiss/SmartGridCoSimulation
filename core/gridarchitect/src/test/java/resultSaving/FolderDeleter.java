/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package resultSaving;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;



import helper.GlobalOptions;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: amack
 * Date: 31.10.13
 * Time: 12:00
 * To change this template use File | Settings | File Templates.
 */
public class FolderDeleter {

    public File rootFolder;

    @Before
    public void setUp() {
        List<String> folderList = Arrays.asList(GlobalOptions.rootFolderPath +"UnitTests",
                GlobalOptions.rootFolderPath +"UnitTests",
                GlobalOptions.rootFolderPath +"SimulationName",
                GlobalOptions.rootFolderPath +"SaveLogTest",
                GlobalOptions.rootFolderPath +"SaveJsonTest",
                GlobalOptions.rootFolderPath +"Test",
                GlobalOptions.rootFolderPath +"LoadTestSave",
                GlobalOptions.rootFolderPath +"SessimTest",
                GlobalOptions.rootFolderPath +"SimulationName",
                "./ElectricalStateResultsTest"
        );
        for (String folderPath: folderList) deleteFolder(folderPath);
    }

    @After
    public void tearDown() {
        this.setUp();
    }

    public static void deleteFolder(String folderPath) {
         File folder = new File(folderPath);
            try {
                FileUtils.deleteDirectory(folder);
            } catch(Exception e) {
                System.out.println(e);
            }
            Assert.assertFalse(folder.isDirectory());
        }
}
