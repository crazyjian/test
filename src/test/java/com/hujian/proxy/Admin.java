package com.hujian.proxy;

public class Admin implements Manager,Moveable {

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("Admin do something...");
	}

	@Override
	public void move() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Admin do something...move");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Admin do something...run");
	}

}
