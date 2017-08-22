package com.hujian.test;

public class Singleton {

	private static final Singleton singleton = new Singleton();
	
	public static Singleton getInstance() {
		return singleton;
	}
	
}
