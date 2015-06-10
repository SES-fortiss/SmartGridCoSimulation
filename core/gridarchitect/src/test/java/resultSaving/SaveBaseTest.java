/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package resultSaving;

import org.junit.Assert;
import org.junit.Test;

import resultSaving.files.SaveCsv;

/**
 * Created with IntelliJ IDEA.
 * User: amack
 * Date: 30.10.13
 * Time: 17:36
 * To change this template use File | Settings | File Templates.
 */
public class SaveBaseTest {
    @Test
    public void testGetSavingInterval() throws Exception {
        SaveCsv csv = new SaveCsv(100);
        Assert.assertEquals(100, csv.getSavingInterval());
    }
}
