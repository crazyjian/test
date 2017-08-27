package com.hujian.queue;

public class Queue<E> {
	
	private Node<E> first;
	private Node<E> last;

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
		if(first==null) {
			first = node;
		}else {
			last.next = node;
		}
		last = node;
	}
	
	public E pop() {
		if(first == null) {
			return null;
		}
		E value = first.value;
		first = first.next;
		return value;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new Queue<Integer>();
		queue.push(2);
		queue.push(1);
		queue.push(24);
		queue.push(25);
		queue.push(7);
		System.out.println(queue.pop());
		System.out.println(queue.pop());
	}

}
