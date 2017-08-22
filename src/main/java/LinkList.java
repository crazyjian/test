
public class LinkList<E> {
	
	private int size = 0;
	private Node<E> first;
	private Node<E> last;
	
	public void add(E item) {
		Node<E> node = new Node<E>(item, null);
		if(last==null) {
			first = node;
		} else {
			last.next = node;
			
		}
		last = node;
		size++;
	}
	
	public E get(int index) {
		if(index >= size) {
			System.out.println("¡¥±Ì‘ΩΩÁ");
			return null;
		} else {
			Node<E> node = first;
			for(int i=0; i<index; i++) {
				node = node.next;
			}
			return node.item;
		}
	}
	
	private static class Node<E> {
		
		private E item;
		private Node next;
		
		Node(E item, Node next) {
			this.item = item;
			this.next = next;
		} 
	}
	
	public static void main(String args[]) {
		LinkList<String> list = new LinkList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		
		for(int i=0;i<list.size;i++) {
			System.out.print(list.get(i)+";");
		}
		
		Node<String> f = list.first;
		Node<String> p = list.first.next;
		
		while(p!=null) {
			Node<String> s = p.next;
			if(p.next==null) {
				list.first = p;
			}
			p.next = f;
			if(f == list.first) {
				f.next = null;
				list.last = f;
			}
			f = p;
			p = s;
		}
		System.out.println();
		for(int i=0;i<list.size;i++) {
			System.out.print(list.get(i)+";");
		}
	}
}
