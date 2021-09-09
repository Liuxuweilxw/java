import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
    实现tcp客户端，连接到服务器
    和服务器实现数据交换
    实现tcp客户端的类 java.net.Socket

    构造方法：
        Socket(Stirng host,int port) 传递服务器IP和端口号

        OutputStream getOutputStream() 返回套接字的输出流
            作用：将数据输出，输出到服务器
        Inputstream getInputStream() 返回套接字的输入流
            作用：从服务器读取数据流
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //创建socket对象 ,连接服务器
        Socket socket =new Socket("127.0.0.1",8888);


        //通过客服端的socket对象获取字节输出流
        OutputStream out=socket.getOutputStream();
        out.write("服务器OK".getBytes());



        InputStream in=socket.getInputStream();
        byte[] data=new byte[1024];
        int len=in.read(data);
        System.out.println(new String(data,0,len));
        socket.close();

    }
}
