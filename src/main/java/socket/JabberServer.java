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
            //�趨����˵Ķ˿ں�  
            s = new ServerSocket(PORT);  
            System.out.println("��������������ȴ��ͻ�������..");
            //�ȴ�����,�˷�����һֱ����,ֱ����������������  
            socket = s.accept();  
            System.out.println("Connection accept socket:"+socket);  
            //���ڽ��տͻ��˷���������  
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));  
           /* String str = null;
            while((str=br.readLine())!=null){  
                System.out.println("�ѽ��յ��ͻ�������");
                System.out.println("����˽��յ��ͻ�����Ϣ��"+str+",��ǰ�ͻ���ipΪ��"+socket.getInetAddress().getHostAddress()); 
            }  
            //���ڷ��ͷ�����Ϣ,���Բ���Ҫװ����ô��io��ʹ�û�����ʱ��������Ҫע�����.flush()����  
            pw = new PrintWriter(socket.getOutputStream());  
            pw.println("��ã�������ѽ��յ�������Ϣ");
            pw.flush();  
            socket.shutdownOutput();//�ر������*/
            pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);  
            System.out.println("��ǰ�ͻ���ipΪ��"+socket.getInetAddress().getHostAddress());
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
            System.out.println("�����Close");  
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
