import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/*
    1,创建DatagramPacket 对象 封装数据 接收的的地址和端口
    2,创建DatagramSocket 对象
    3,调用DatagramSocket 类方法send 发送数据包
    4，关闭资源Socket
     */
public class UDPDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        DatagramSocket ds=new DatagramSocket();
        InetAddress inet=InetAddress.getByName("127.0.0.1");
        while(true){
            String message=sc.nextLine();
            byte[] data=message.getBytes();
            DatagramPacket dp=new DatagramPacket(data,data.length,inet,6000);
            ds.send(dp);
        }
       //ds.close();
    }
}
