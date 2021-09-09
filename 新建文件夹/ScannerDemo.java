/*
Scanner 可以接收键盘的输入
需要指明Scanner类所在位置 Java.util
*/
import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        
        //nextInt() 接受键盘的输入 且确保数据是整数
        //只能输入整数
        int i=sc.nextInt();
        System.out.println(i);

        //next() 接受键盘输入的字符串数据
        String s=sc.next();
        System.out.println(s);
    }
}