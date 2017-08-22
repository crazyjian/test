package com.hujian.util;

import java.util.LinkedList;

public class Stack<T> {
	
	private LinkedList<T> list = new LinkedList<T>();
	
	public void push(T v) {
		list.addFirst(v);
	}
	
	public T pop() {
		return list.removeFirst();
	}
	
	public T peek() {
		return list.getFirst();
	}
	
	public boolean empty() {
		return list.isEmpty();
	}
	
	public String toString() {
		return list.toString();
	}
}
