/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package org.fortiss.powerflowsim.importers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.eclipse.emf.ecore.EPackage;
import org.fortiss.powerflowsim.util.Utils;

public class Importer {

	public static Logger log = LogManager.getRootLogger();

	public static void initPackages() {
		ClassLoader classLoader = org.fortiss.powerflowsim.GUI.class.getClassLoader();
		List<String> packageList = getCIMPackageList();
		for (String packageName : packageList) {
			try {
				Class<?> classFactoryClass = classLoader.loadClass("CIM15.IEC61970." + Utils.capitalize(packageName) + "." + Utils.capitalize(packageName) + "Package");
				classFactoryClass.getMethod("init").invoke(null);
			} catch (ClassNotFoundException e) {

			} catch (IllegalArgumentException e) {
				log.error(e.toString());
			} catch (SecurityException e) {
				log.error(e.toString());
			} catch (IllegalAccessException e) {
				log.error(e.toString());
			} catch (InvocationTargetException e) {
				log.error(e.toString());
			} catch (NoSuchMethodException e) {
				log.error(e.toString());
			}

		}

	}

	protected static List<String> getCIMPackageList() {
		List<String> packageNames = new ArrayList<String>();
		for (EPackage subPackage : CIM15.IEC61970.IEC61970Package.eINSTANCE.getESubpackages()) {
			packageNames.add(subPackage.getName());
		}
		return packageNames;
	}

	protected Object getObjectWithReflection(String className, String packageName) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {

		ClassLoader classLoader = org.fortiss.powerflowsim.GUI.class.getClassLoader();

		Class<?> classFactoryClass = classLoader.loadClass("CIM15.IEC61970." + Utils.capitalize(packageName) + "." + Utils.capitalize(packageName) + "Factory");
		Method initMethod = classFactoryClass.getMethod("init");
		Object classFactory = initMethod.invoke(classFactoryClass);
		return classFactoryClass.getMethod("create" + className).invoke(classFactory);
	}

	protected Class<?> loadClass(String className) {
		List<String> packageNames = getCIMPackageList();
		for (String packageName : packageNames) {
			ClassLoader classLoader = org.fortiss.powerflowsim.GUI.class.getClassLoader();

			try {
				Class<?> aClass = classLoader.loadClass("CIM15.IEC61970." + packageName + "." + className);
				return aClass;
			} catch (ClassNotFoundException e) {
			}

		}
		return null;
	}
}
