package com.hujian.myapp;

import headfirst.designpatterns.singleton.chocolate.ChocolateBoiler;

public class ThreadTest {
	public static int count = 0;
	 
    public static void inc() {
 
        //�����ӳ�1���룬ʹ�ý������
     try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }
    	synchronized(Thread.class) {
    		 count++;
    	}
    }
 
    public static void main(String[] args) {
 
        //ͬʱ����1000���̣߳�ȥ����i++���㣬����ʵ�ʽ��
 
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                	ThreadTest.inc();
                	System.out.println("���н��:Counter.count=" + ThreadTest.count);
                }
            }).start();
        }
 
      
        
    }

}
