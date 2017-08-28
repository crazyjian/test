package com.hujian.thread;

public class Goods implements Runnable{
	
	private static int MAX = 10;
	private Integer own = 0;
	
	public synchronized void put() {
		if(own >= MAX) {
			try {
				System.out.println("无法生产，仓库已满");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
			own++;
			System.out.println("已生产一个，仓库共有"+own+"个货物");
			notify();

	}
	
	public synchronized void get() {
		if(own <= 0) {
			try {
				System.out.println("无法消费，仓库空了");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
			own--;
			System.out.println("已消费一个，仓库还剩"+own+"个货物");
			notify();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
