package com.hujian.proxy;

import java.util.Random;

public class Car implements Moveable {

	@Override
	public void move() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(new Random().nextInt(1000));
		System.out.println("������ʻ�С�����");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�ܲ��С�����");
	}
	

}
