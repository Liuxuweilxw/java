import java.util.Random;
public class RandomDemo {
    //伪随机数 
    public static void main(String[] args){
        Random ran=new Random();
        //产生一个随机数 nextInt() 随机数为int类型
        //可以规定随机数的范围 nextInt(写一个整数) 产生的随机数在0-指定数之间
        //例如 nextInt(50) 产生的随机数为0-49
        int i=ran.nextInt(10);
        System.out.println(i); 
        //nextDouble() 0.0-1.0 数值随机 位数也是随机的
        double d=ran.nextDouble();
        System.out.println(d);
    }
}