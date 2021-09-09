import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
       // function();
        function1();

    }
    public static void function() throws UnknownHostException {
        InetAddress inet =InetAddress.getLocalHost();
        System.out.println(inet);
    }
    public static void function1() throws UnknownHostException {
        InetAddress inet=InetAddress.getByName("www.baidu.com");
        System.out.println(inet);
    }
}
