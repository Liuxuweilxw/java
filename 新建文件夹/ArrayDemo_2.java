public class ArrayDemo_2 {
    public static void main(String[] args){
        int arr[][]={{11,12},{21,22,23},{31,32,33,34}};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int groupSum=0;
            for(int j=0;j<arr[i].length;j++){
                groupSum+=arr[i][j];
            }
            System.out.println("第"+(i+1)+"个小组的销售额为："+groupSum);
            sum+=groupSum;
        }
        System.out.println("总销售额为:"+sum);
    }
}