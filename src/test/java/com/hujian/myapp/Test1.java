package com.hujian.myapp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

import javax.script.Bindings;
import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Test1 {

	public static void main(String[] args) throws Exception {
	
		/*ScriptEngine engine = new ScriptEngineManager().getEngineByName("javascript");
		
		Bindings bind = engine.createBindings();
		bind.put("factor", 1);
		engine.setBindings(bind, ScriptContext.ENGINE_SCOPE);
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			int first = input.nextInt();
			int sec = input.nextInt();
			System.out.println("输入参数是："+first+","+sec);
			engine.eval(new FileReader("d:/model.js"));
			if(engine instanceof Invocable) {
				Invocable in = (Invocable) engine;
				Double result = (Double)in.invokeFunction("formula", first,sec);
				System.out.println("运算结果："+result.intValue());
			}
		}*/
		//NumberFormat f = new DecimalFormat("#.##");
		/*Integer i = new Integer(10);
		Integer j = new Integer(10);
		System.out.println(i.compareTo(j));
		System.out.println(i < j);
		System.out.println(i > j);*/
		Random r = new Random(1000);
		for(int i=1;i<4;i++)
			System.out.println("第"+i+"次："+r.nextInt());
		
		
	}
	
	public int testInsert(int a ,int b){
		return a+b;
	}

}
