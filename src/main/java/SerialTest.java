import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import com.hujian.entity.Student;


public class SerialTest {

	public static void main(String args[]) {
		Student s = new Student();
		s.setName("jim");
		s.setPassword("1233");
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		
		System.out.println("read before Serializable: ");
     /*   System.out.println("username: " + s.getName());
        System.out.println("password: " + s.getPassword());*/
		for(Integer i : list) {
			System.out.println(i);
		}
        
        File file = new File("D:\\student.txt");
        ObjectOutputStream o;
		try {
			o = new ObjectOutputStream(new FileOutputStream(file));
			o.writeObject(list);
		    o.flush();
		    o.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("D:\\student.txt"));
			List<Integer> s1 = (List<Integer>) is.readObject();
			is.close();
			System.out.println("\nread after Serializable: ");
			for(Integer i : s1) {
				System.out.println(i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
	}
}
