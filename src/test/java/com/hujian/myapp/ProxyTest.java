package com.hujian.myapp;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;

import org.springframework.jndi.JndiTemplate;

import com.hujian.proxy.Admin;
import com.hujian.proxy.AdminProxy;
import com.hujian.proxy.BookFacade;
import com.hujian.proxy.CGLibProxy;
import com.hujian.proxy.Car;
import com.hujian.proxy.Manager;
import com.hujian.proxy.Moveable;
import com.hujian.proxy.TimeHandler;

public class ProxyTest {

	public static void main(String[] args) throws Exception {

		//��̬����
	/*	Admin admin = new Admin();
		Manager m = new AdminProxy(admin);
		m.doSomething();*/

		//��̬����
	/*	Admin car = new Admin();
		InvocationHandler h = new TimeHandler(car);
		Class<?> cls = car.getClass();
		Class<?>[] cl = cls.getInterfaces();
		*//**
		 * loader ������� interfaces ʵ�ֽӿ� h InvocationHandler
		 *//*
		Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(),
				cls.getInterfaces(), h);
		//m.doSomething();
		m.move();
		m.run();*/
		
		/*Class c = Class.forName("java.lang.Integer");
		// ��ȡ���е�����?
		Field[] fs = c.getDeclaredFields();

		// ����ɱ䳤���ַ����������洢����
		StringBuffer sb = new StringBuffer();
		// ͨ��׷�ӵķ�������ÿ������ƴ�ӵ����ַ�����
		// ����ߵ�public����
		sb.append(Modifier.toString(c.getModifiers()) + " class "
				+ c.getSimpleName() + "{\n");
		// ��ߵ�ÿһ������
		for (Field field : fs) {
			sb.append("\t");// �ո�
			sb.append(Modifier.toString(field.getModifiers()) + " ");// ������Ե����η�������public��static�ȵ�
			sb.append(field.getType().getSimpleName() + " ");// ���Ե����͵�����
			sb.append(field.getName() + ";\n");// ���Ե�����+�س�
		}

		sb.append("}");

		System.out.println(sb);*/
		
		CGLibProxy proxy = new CGLibProxy();  
		BookFacade t = (BookFacade) proxy.getProxy(BookFacade.class);  
		t.addBook();  
		
	}
}
