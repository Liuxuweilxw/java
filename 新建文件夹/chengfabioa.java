public class chengfabioa {
    public static void main(String[] args){
        int i=1;
        int j=1;
        int c=0;
        for(i=1;i<=9;i++){
            for(j=1;j<=i;j++){
                c=i*j;
                System.out.print(j+"*"+i+"="+j*i+"  ");
            }
            System.out.println();
        }
    }
}