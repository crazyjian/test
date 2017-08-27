

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

import com.hujian.entity.Student;
import com.hujian.util.Stack;

public class ListTest {

	public static void main(String args[]) {
	/*	Random random = new Random();
		int a = random.nextInt();
		for(int i=0;i<10;i++) {
			System.out.println(random.nextInt(100));
		}*/
		//Stack<String> stack = new Stack<String>();
		/*for(String s : "my dog has fleas".split(" ")) {
			stack.push(s);
		}*/
	/*	String string = "+U+u+c---+e+r+t---+a-+i-+t+y--+r+u+l+e+s---";
		int i=0;
		while(i<string.length()) {
			if(string.charAt(i) == '+') {
				stack.push(String.valueOf(string.charAt(i+1)));
				i = i+2;
			}else if(string.charAt(i) == '-') {
				stack.pop();
				i++;
			}
		}
		System.out.println(stack);*/
		/*String  sql = "this is a test program";
		List<String> temp = Arrays.asList(sql.split(""));
		HashSet<String> set = new HashSet<String>();
		set.addAll(temp);
		PriorityQueue<String> list = new PriorityQueue<String>(temp);
		list = new PriorityQueue<String>(temp.size(),Collections.reverseOrder());
		list.addAll(set);
		while(list.peek() != null)
			System.out.print(list.remove()+" ");*/
		
	/*	System.out.format("%-15s  %5s %10s\n", "Item","Qty","Price");
		System.out.format("%-15s  %5s %10s\n", "----","---","-----");*/
		
	/*	System.out.println("31234");*/
	/*	String sql = "then ,.. tiewt , webnr wwe sdfn ";
		System.out.println(Arrays.toString(sql.split("n\\W+")));*/
/*		List<Student> list = new ArrayList<Student>(Collections.nCopies(4, 
				new Student("jim")));
		System.out.println(list);
		Collections.fill(list, new Student("jack"));
		System.out.println(list);
		HashMap*/
		int[] array = new int[10];
		int size = 3;
		array[size++] = 1;
		System.out.print(size);
		
 	}
}
