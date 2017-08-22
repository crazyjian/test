package com.hujian.myapp;

public class CreateClass {

	private static int i=2;
	
	public void echo_i() {
		System.out.println(i);
	}
	
	public void run() {
		for(;i<10;i++) {
			System.out.println(this.hashCode()+": "+i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateClass t = new CreateClass();
		t.echo_i();
		t.run();
		CreateClass g = new CreateClass();
		g.echo_i();
		CreateClass j = new CreateClass();
		j.echo_i();
	}
}
