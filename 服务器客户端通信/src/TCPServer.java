import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
实现tcp服务器程序
serverSocket
ServerSocket(int port)

获得客户端的套接字对象Socket
Socket accept()

 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server =new ServerSocket(8888);
        //调用服务器套接字对象中的方法accept（）获取客户端套接字对象
        Socket socket=server.accept();


        System.out.println(socket);
        InputStream in=socket.getInputStream();
        byte[] data=new byte[1024];
        int len=in.read(data);
        System.out.println(new String(data,0,len));


        //服务器回复
        OutputStream out=socket.getOutputStream();
        out.write("收到谢谢".getBytes());
        socket.close();
        server.close();
    }
}
