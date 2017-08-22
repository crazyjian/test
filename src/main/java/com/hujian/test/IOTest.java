package com.hujian.test;

import java.awt.Shape;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.http.client.BufferingClientHttpRequestFactory;

public class IOTest {
	
	public static void printOut(int i) {
		if(i>=10) {
			printOut(i/10);
		}
		print(i%10);
	}
	
	public static void print(int i) {
		System.out.print(i);
	}
	
	public static void main(String[] args) throws IOException {
		
		Object[] array = new String[5];
		array[0] = 1;
		System.out.println(array[0]);
	}
}

