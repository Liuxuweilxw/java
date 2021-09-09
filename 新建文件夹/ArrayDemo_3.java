import java.util.Random;

public class ArrayDemo_3 {
    public static void main(String[] args){
        String[] arr={"小米","apple","华为","张三","李四","爱丽丝"};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("===============");
        Random ran=new Random();
        int index=ran.nextInt(arr.length);
        System.out.println(arr[index]);
        
    }
}