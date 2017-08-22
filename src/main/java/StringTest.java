

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeMap;

public class StringTest {

	public static void main(String args[]) {
		String s1 = "hello";
		String s2 = "world";
		System.out.println(s1+"---"+s2);
		change(s1,s2);
		System.out.println(s1+"---"+s2);
		
		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("world");
		System.out.println(sb1+"---"+sb2);
		change(sb1,sb2);
		System.out.println(sb1+"---"+sb2);
		int a = 5;
		System.out.println(a);
		/*List<Integer> set1 = new ArrayList<Integer>();
		List<Integer> set2 = new ArrayList<Integer>();
		set1.add(4);
		set1.add(1);
		set1.add(2);
		set1.add(4);
		set1.add(3);
		System.out.println(set1);
		ListIterator i = set1.listIterator();
		while(i.hasNext()){
			i.next();
		}
		while(i.hasPrevious()) {
			System.out.println(i.previous());
			set2.add((Integer) i.previous());
		}
		System.out.println(set2);
		TreeMap<String,String> map1 = new TreeMap<String,String>();
		map1.put("1", "2");
		map1.put("3", "1");
		map1.put("5", null);
		map1.put("2", "5");
		map1.put("4", "3");
		System.out.println(map1);*/
	}
	
	
	public static void change(String s1,String s2) {
		s1 = s2;
		s2 = s1 + s2;
	}
	
	public static void change(StringBuffer s1,StringBuffer s2) {
		s1 = s2;
		s2.append(s1);
	}
	
	public static void change(int a) {
		a = 10;
	}
}
