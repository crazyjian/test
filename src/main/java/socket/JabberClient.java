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
	            //客户端socket指定服务器的地址和端口号  
	        socket = new Socket("localhost", JabberServer.PORT);  
	        System.out.println("Socket=" + socket);  
	        //同服务器原理一样  
	        pw = new PrintWriter(socket.getOutputStream());  
	      /*  pw.println("服务端你好，我是Balla_兔子");
	        pw.flush();
	        socket.shutdownOutput();//关闭输出流
*/	        
	        br = new BufferedReader(new InputStreamReader(socket.getInputStream()));  
	       /* String str = null;
	        while((str=br.readLine())!=null) {
	        	System.out.println("客户端接收服务端发送信息："+str);
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
	            System.out.println("客户端close");  
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
