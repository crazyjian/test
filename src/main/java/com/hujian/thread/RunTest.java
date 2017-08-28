package com.hujian.thread;

public class RunTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods goods = new Goods();
		Productor productor = new Productor(goods);
		Customer customer = new Customer(goods);
		Thread p = new Thread(productor);
		Thread c = new Thread(customer);
		p.start();
		c.start();
	}

}
