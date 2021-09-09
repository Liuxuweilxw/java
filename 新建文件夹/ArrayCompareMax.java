import java.util.Random;
public class ArrayCompareMax {
    public static void main(String[] args){
        int[] arr=new int[10];
        Random ran=new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=ran.nextInt(100);
            System.out.println(arr[i]);
        }
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("==================="); 
        System.out.println(max);                                                 
    }
}