package com.hujian.myapp;

public class singleClass {
	
	private singleClass() {
		
	}

	public static singleClass getInstance() {
		return new singleClass();
	}
}
