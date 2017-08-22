package socket;

import java.io.BufferedReader;  
import java.io.BufferedWriter;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.io.OutputStreamWriter;  
import java.io.PrintWriter;  
import java.net.Socket;  

public class JabberClient {
	 public static void main(String[] args) {  
	        Socket socket = null;  
	        BufferedReader br = null;  
	        PrintWriter pw = null;  
	        try {  
	            //�ͻ���socketָ���������ĵ�ַ�Ͷ˿ں�  
	        socket = new Socket("localhost", JabberServer.PORT);  
	        System.out.println("Socket=" + socket);  
	        //ͬ������ԭ��һ��  
	        pw = new PrintWriter(socket.getOutputStream());  
	      /*  pw.println("�������ã�����Balla_����");
	        pw.flush();
	        socket.shutdownOutput();//�ر������
*/	        
	        br = new BufferedReader(new InputStreamReader(socket.getInputStream()));  
	       /* String str = null;
	        while((str=br.readLine())!=null) {
	        	System.out.println("�ͻ��˽��շ���˷�����Ϣ��"+str);
	        }*/
	        for (int i = 0; i < 10; i++) {  
                pw.println("howdy " + i);  
                pw.flush();  
                String str = br.readLine();  
                System.out.println(str);  
            }  
            pw.println("END");  
            pw.flush();
	    } catch (Exception e) {  
	        e.printStackTrace();  
	    } finally {  
	        try {  
	            System.out.println("�ͻ���close");  
	            br.close();  
	            pw.close();  
	            socket.close();  
	        } catch (IOException e) {  
	            // TODO Auto-generated catch block  
	            e.printStackTrace();  
	        }  
	    }  
	}  
}
