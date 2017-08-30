package com.hujian.thread;

public class Counter {
	public  Integer count = 0;
	public String lock = "ss";
	 
    public void inc() {
    	synchronized(count) {
        //这里延迟1毫秒，使得结果明显
        try {
        	System.out.println("inc方法开始");
            Thread.sleep(5000);
            System.out.println("inc方法结束");
        } catch (InterruptedException e) {
        }
        	//count++;
    	}
    }
    
    public void add() {
    	synchronized(lock) {
            System.out.println("add方法执行");
    	}
    }
    
    public static void main(String[] args) {
 
        //同时启动1000个线程，去进行i++计算，看看实际结果
 
   /*    for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Counter.inc();
                    System.out.println("运行结果:Counter.count=" + Counter.count);
                }
            }).start();
        }*/
 
    	new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Counter c = new Counter();
				c.inc();
			}
    		
    	}).start();
    	
    	new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Counter c = new Counter();
				c.add();
			}
    		
    	}).start();
    }
}
