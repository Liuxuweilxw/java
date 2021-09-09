import java.util.Scanner;
import java.util.Random;
public class GuestNumber {
    public static void main(String[] args){
        System.out.println("猜数字游戏");
        System.out.println("请输入1-100的数字");
        Random ran =new Random();
        int ranNymber=ran.nextInt(100)+1;

        Scanner sc=new Scanner(System.in);

        while(true){
            int num=sc.nextInt();
            if(num==ranNymber){
                System.out.println("你猜中了");
                break;
            }
            else if(num>ranNymber){
                System.out.println("大了");
            }
            else{
                System.out.println("小了");
            }
        }
    }
}