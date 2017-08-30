package com.hujian.thread;

public class Goods {
	
	private static int MAX = 5;
	private Integer own = 0;
	
	public synchronized void put() {
		if(own >= MAX) {
			try {
				System.out.println(Thread.currentThread().getName()+"：仓库已满");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
			own++;
			System.out.println(Thread.currentThread().getName()+"：生成一件商品，仓库总有"+own+"件");
			notifyAll();

	}
	
	public synchronized void get() {
		if(own <= 0) {
			try {
				System.out.println(Thread.currentThread().getName()+"：仓库空了");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
			own--;
			System.out.println(Thread.currentThread().getName()+"：消费一件商品，仓库还剩"+own+"件");
			notifyAll();
		
	}

}
