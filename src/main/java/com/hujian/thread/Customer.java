package com.hujian.thread;

public class Customer implements Runnable{
	
	private Goods goods;
	
	public Customer(Goods goods) {
		this.goods = goods;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i < 10;i++){  
			goods.get();
			  try{  
	                Thread.sleep(1000);  
	            }catch(InterruptedException e){  
	                e.printStackTrace();  
	            }  
		}
	}

}
