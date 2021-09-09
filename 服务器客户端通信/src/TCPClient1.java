import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
socket套接字连接服务器
通过socket获取字节输出流
使用自己的流对象读取本机文件 FileInputStream
使用socket字节输出流 将读取到的字节流发送的服务器
使用socket字节输入流获取服务器返回信息
关闭资源
 */
public class TCPClient1 {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",8888);
        OutputStream out=socket.getOutputStream();

        FileInputStream fis=new FileInputStream("//Users//liuxuwei//Desktop//IMG_0121.PNG");
        int len=0;
        byte[] data=new byte[1024];
        while((len=fis.read(data))!=-1){
            out.write(data,0,len);
        }
        //终止序列 避免服务器读取输入流空等 而造成阻塞
        socket.shutdownOutput();

        InputStream in=socket.getInputStream();
        len=in.read(data);
        System.out.println(new String(data,0,len));

        fis.close();
        socket.close();

    }
}
