package com.hujian.thread;

public class Goods implements Runnable{
	
	private static int MAX = 10;
	private Integer own = 0;
	
	public synchronized void put() {
		if(own >= MAX) {
			try {
				System.out.println("仓库已满");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
			own++;
			System.out.println("生成一件商品，仓库总有"+own+"件");
			notify();

	}
	
	public synchronized void get() {
		if(own <= 0) {
			try {
				System.out.println("仓库空了");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
			own--;
			System.out.println("消费一件商品，仓库还剩"+own+"件");
			notify();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
