package com.hujian.thread;

public class ThreadTest extends Thread{

	  private int threadNo;
	    private String lock;

	    public ThreadTest(int threadNo, String lock) {
	        this.threadNo = threadNo;
	        this.lock = lock;
	    }

	    public static void main(String[] args) throws Exception {
	        String lock = new String("lock");
	        for (int i = 0; i < 10; i++) {
	            new ThreadTest(i, lock).start();
	            //Thread.sleep(1);
	        }
	    }

	    public  void run() {
	        synchronized (lock) {
	            for (int i = 0; i < 10; i++) {
	                System.out.println(Thread.currentThread().getName()+":No." + threadNo + ":" + i);
	            }
	        }
	    }
}
