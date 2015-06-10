/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package helper;


import org.junit.Assert;
import org.junit.Test;

import resultSaving.FolderDeleter;


import helper.IoHelper;

import java.io.File;
import java.nio.file.NoSuchFileException;

/**
 * Created with IntelliJ IDEA.
 * User: amack
 * Date: 31.10.13
 * Time: 11:09
 * To change this template use File | Settings | File Templates.
 */
public class IoHelperTest extends FolderDeleter {




    @Test
    public void testCreateParentFoldersValid() {
        File file = IoHelper.createParentFolders(GlobalOptions.rootFolderPath +"UnitTests/someFolder/folder/blub.txt");
        Assert.assertFalse(file.exists());
        Assert.assertTrue(new File(GlobalOptions.rootFolderPath + "UnitTests").isDirectory());
        Assert.assertTrue(new File(GlobalOptions.rootFolderPath + "UnitTests/someFolder").isDirectory());
        Assert.assertTrue(new File(GlobalOptions.rootFolderPath +"UnitTests/someFolder/folder").isDirectory());
    }


    @Test
    public void testSaveFileRelativePathValid() throws Exception {
        IoHelper.saveFileRelativePath("UnitTests/someFolder/folder/someJson.json", "file content");
        Assert.assertTrue(new File(GlobalOptions.rootFolderPath +"UnitTests/someFolder/folder/someJson.json").isFile());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSaveFileRelativePathInvalid() throws Exception {
        IoHelper.saveFileRelativePath("UnitTests/someFolder/folder/some", "file content");
    }

    @Test
    public void testOpenFileAsStringFileExists() throws Exception {
        IoHelper.saveFileRelativePath("UnitTests/someFolder/folder/someJson.json", "file content");
        String actual = IoHelper.openFileAsString("UnitTests/someFolder/folder/someJson.json");
        Assert.assertEquals("file content", actual);
    }

    @Test(expected = NoSuchFileException.class)
    public void testOpenFileAsStringNoFile() throws Exception {
        IoHelper.openFileAsString("UnitTests/unknownFolder/someJson.json");
    }


    @Test
    public void testAppendFileNoFile() throws Exception{
        IoHelper.appendToFileRelativePath("UnitTests/new/newfile.txt", "new content");
        String actual = IoHelper.openFileAsString("UnitTests/new/newfile.txt");
        Assert.assertEquals("new content", actual);
    }

    @Test
    public void testAppendFileExists() throws Exception{
        IoHelper.saveFileRelativePath("UnitTests/new/newfile.txt", "new content");
        String actual = IoHelper.openFileAsString("UnitTests/new/newfile.txt");
        Assert.assertEquals("new content", actual);

        IoHelper.appendToFileRelativePath("UnitTests/new/newfile.txt", "stuff");
        String actual1 = IoHelper.openFileAsString("UnitTests/new/newfile.txt");
        Assert.assertEquals("new content" +
                "stuff", actual1);
    }
}
