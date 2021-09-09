public class ShuiXianHua {
    public static void main(String[] args){
        int a=0;
        int b=0;
        int c=0;
        for(int i=100;i<=999;i++){
            a=i%10;
            b=i/10%10;
            c=i/100;
            if(c*c*c+b*b*b+a*a*a==i){
                System.out.println(i);
            }
        }
    }
}