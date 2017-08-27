package com.hujian.queue;

public class Stack<E> {
	
	private Node<E> top;
	
	private class Node<E> {
		private E value;
		private Node next;
		
		Node(E value) {
			this.value = value;
			this.next = null;
		}
	}
	
	public void push(E value) {
		Node node = new Node(value);
		node.next = top;
		top = node;
	}
	
	public E pop() {
		if(top == null) {
			return null;
		}
		E value = top.value;
		top = top.next;
		return value;
	}
	
	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(3);
		stack.push(2);
		stack.push(16);
		stack.push(10);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
