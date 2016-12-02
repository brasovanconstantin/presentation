package com.endava.internship.singleton;

public class EagerInitializedSingleton {

	// create variable of the same class that is the only instance of the class
	private static EagerInitializedSingleton instance = new EagerInitializedSingleton();

	// create private constructor to avoid client applications to use
	// constructor
	private EagerInitializedSingleton() {
	}

	// create method that returns the instance of the class
	public static EagerInitializedSingleton getInstance() {
		return instance;
	}

}
