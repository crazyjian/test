package com.hujian.thread;

public class Productor implements Runnable{
	
	private Goods goods;
	
	public Productor(Goods goods) {
		this.goods = goods;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i < 20;i++){  
			goods.put();
			try {
				Thread.sleep((int)(Math.random()*500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
