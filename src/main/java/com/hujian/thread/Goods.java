package com.hujian.thread;

public class Goods implements Runnable{
	
	private static int MAX = 10;
	private Integer own = 0;
	
	public synchronized void put() {
		if(own >= MAX) {
			try {
				System.out.println("�޷��������ֿ�����");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
			own++;
			System.out.println("������һ�����ֿ⹲��"+own+"������");
			notify();

	}
	
	public synchronized void get() {
		if(own <= 0) {
			try {
				System.out.println("�޷����ѣ��ֿ����");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
			own--;
			System.out.println("������һ�����ֿ⻹ʣ"+own+"������");
			notify();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
