package com.hujian.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {

	private Object target;

	public TimeHandler(Object target) {
		super();
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		System.out.println("������ʼ��ʻ��");
		method.invoke(target, args);
		long stopTime = System.currentTimeMillis();
		System.out.println("����������ʻ��������ʻʱ�䣺" + (stopTime - startTime) + "���룡");
		return null;
	}

}
