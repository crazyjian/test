package com.hujian.thread;

public class VariableTest {
	
	public volatile static int i=0,j=0;
	
	public void add() {
		i++;
		j++;
	}
	
	public void print() {
		System.out.println("i="+i+"j="+j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				VariableTest c = new VariableTest();
				for(int i=0;i<10000;i++) {
					while(true) {	
						c.print();
					}
				}
			}
    		
    	}).start();
    	
    	new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				VariableTest c = new VariableTest();
				while(true) {	
					c.add();
				}
			}
    		
    	}).start();
	}

}
