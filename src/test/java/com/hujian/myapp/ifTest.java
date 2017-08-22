package com.hujian.myapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import java.util.prefs.PreferenceChangeListener;

import javax.swing.AbstractButton;

public class ifTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Boolean isSales = false;
		Boolean isSaleManager = false;
		Boolean isSeatIn = true;
		Boolean isSeatOut = true;
		String pageName = null;
		
		if((pageName==null && !isSales && !isSaleManager) || "customer".equals(pageName)) {
			System.out.println("cusomter");
		}else if((pageName==null && !isSeatIn && !isSeatIn) || "follow".equals(pageName)) {
			System.out.println("follow");
		}else if("visit".equals(pageName)) {
			System.out.println("visit");
		}*/
		ifTest test = new ifTest();
	/*	List<Integer> list = new ArrayList<Integer>();
		test.add(list);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}*/
		String i="4";
		test.add(i);
		System.out.println(i.hashCode());
		System.out.println(i);
	}
	
	public void add(List<Integer> list) {
		list.add(2);
	}
	
	public void add(int i){
		i=3;
	}
	
	public void add(String i){
		i="∂‘œÛ";
		System.out.println(i.hashCode());
		
	}

}
