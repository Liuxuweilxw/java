import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
        1,创建DatagramSocket 对象 ，绑定端口号 要和发送端一致
        2，创建字符数组接收数据
        3，创建DatagramPacket 对象接收数据 空参即可
        4，调用DatagramSpcket 类的receive方法
        5，拆包
            发送的IP地址
                DatagramPacket getAddress()获取发送端的地址
                返回InetAddres对象 getHostAddress()可查询发送端地址
            接收到的字节个数
              数据包对象DatagramPacket类的对象getLength()
            发送方的端口号
                DatagramPacket getPort()获取发送端的端口号 int
        6，关闭资源
     */
public class UDPRDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket(6000);
        byte[] data =new byte[1024*64];
        while (true){
            DatagramPacket dp=new DatagramPacket(data,data.length);
            ds.receive(dp);
            String ip=dp.getAddress().getHostAddress();
            int port=dp.getPort();
            //拆包
            System.out.println(new String(data,0,dp.getLength())+"...."+ip+"...."+port);
        }
    }
}
