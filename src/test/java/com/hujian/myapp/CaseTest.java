package com.hujian.myapp;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CaseTest {
	private int param1;
	private int param2;
	private int result;
	
	@Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][]{
				{1,1,2},
				{3,5,4},
				{5,4,9}
		});
	}
	
	public CaseTest(int param1,int param2,int result) {
		this.param1 = param1;
		this.param2 = param2;
		this.result = result;
	}
	
	@Test
	public void testTestInsert() {
		double v = Math.sqrt(4);
		System.out.println(v);
		int c = new Test1().testInsert(param1,param2);
		assertEquals("ÕýÈ·",result, c);
	}
	
}
