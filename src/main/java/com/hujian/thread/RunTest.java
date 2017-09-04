package com.hujian.thread;

import java.util.concurrent.CountDownLatch;

public class RunTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"主线程运行开始!");
		Goods goods = new Goods();
		Productor productor = new Productor(goods);
		Customer customer = new Customer(goods);
		Customer customer2 = new Customer(goods);
		Thread p = new Thread(productor,"生产者");
		Thread c = new Thread(customer,"消费者一");
		Thread c2 = new Thread(customer2,"消费者二");
		p.setPriority(Thread.MAX_PRIORITY);
		p.start();
		c.start();
		c2.start();
		try {
			p.join();
			c.join();
			c2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"主线程运行结束!");
	}

}
