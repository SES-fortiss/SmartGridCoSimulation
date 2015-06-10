/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package resultSaving;

/**
 * Created with IntelliJ IDEA.
 * User: amack
 * Date: 29.10.13
 * Time: 18:54
 * To change this template use File | Settings | File Templates.
 */
public abstract class SaveBase implements SavingInterface{
    
	public final SaveMode saveMode;
    private int savingInterval = 10;

    protected SaveBase(int savingInterval, SaveMode saveMode) {
        this.savingInterval = savingInterval;
        this.saveMode = saveMode;
    }
    
    @Override
    public int getSavingInterval() {
        return this.savingInterval;
    }
}
