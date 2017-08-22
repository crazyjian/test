package com.hujian.proxy;

public class AdminProxy implements Manager {

	private Admin admin;
	
	public AdminProxy(Admin admin) {
		this.admin = admin;
	}
	
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("logs:admin������ʼ");
		admin.doSomething();
		System.out.println("logs:admin��������");
	}

}
