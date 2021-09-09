public class ArrayMethodTest {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        arrayPrint(arr);
    }
    public static void arrayPrint(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                System.out.print(arr[i]+"]");
            }else if(i==0){
                System.out.print("["+arr[i]+",");
            }else{
                System.out.print(arr[i]+",");
            }
        }
    }
}