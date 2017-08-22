package socket;

import java.io.BufferedReader;  
import java.io.BufferedWriter;  
import java.io.InputStreamReader;  
import java.io.OutputStreamWriter;  
import java.io.PrintWriter;  
import java.net.ServerSocket;  
import java.net.Socket;  

public class JabberServer {

	public static int PORT = 10086;  
    public static void main(String[] agrs) {  
        ServerSocket s = null;  
        Socket socket = null;  
        BufferedReader br = null;  
        PrintWriter pw = null;  
        try {  
            //设定服务端的端口号  
            s = new ServerSocket(PORT);  
            System.out.println("服务端已启动，等待客户端连接..");
            //等待请求,此方法会一直阻塞,直到获得请求才往下走  
            socket = s.accept();  
            System.out.println("Connection accept socket:"+socket);  
            //用于接收客户端发来的请求  
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));  
           /* String str = null;
            while((str=br.readLine())!=null){  
                System.out.println("已接收到客户端连接");
                System.out.println("服务端接收到客户端信息："+str+",当前客户端ip为："+socket.getInetAddress().getHostAddress()); 
            }  
            //用于发送返回信息,可以不需要装饰这么多io流使用缓冲流时发送数据要注意调用.flush()方法  
            pw = new PrintWriter(socket.getOutputStream());  
            pw.println("你好，服务端已接收到您的信息");
            pw.flush();  
            socket.shutdownOutput();//关闭输出流*/
            pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);  
            System.out.println("当前客户端ip为："+socket.getInetAddress().getHostAddress());
            while(true){  
                String str = br.readLine();  
                if(str.equals("END")){  
                    break;  
                }  
                System.out.println("Client Socket Message:"+str);  
                Thread.sleep(1000);  
                pw.println("Message Received");  
                pw.flush();  
            }  
        } catch (Exception e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }finally{  
            System.out.println("服务端Close");  
            try {  
                br.close();  
                pw.close();  
                socket.close();  
                s.close();  
            } catch (Exception e2) {  
                  
            }  
        }  
    }  
}
