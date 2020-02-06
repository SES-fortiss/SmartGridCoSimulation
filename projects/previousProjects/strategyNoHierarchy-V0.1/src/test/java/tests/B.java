/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package tests;

import java.lang.reflect.Field;

public class B extends A {

    private void readPrivateSuperClassField() throws Exception {
        Class<?> clazz = this.getClass().getSuperclass();
        Field field = clazz.getDeclaredField("ii");
        field.setAccessible(true);
        field.setInt(this, 10);
        System.out.println(field.getInt(this));
    }

    public static void main(String[] args) throws Exception {
        new B().readPrivateSuperClassField();
    }

}

