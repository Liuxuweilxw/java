public class MethodDemo {
    public static void main(String[] args){
        double x=1.5;
        double y=2.3;
        double s=aera(x,y);
        System.out.println("长方形面积为:"+s);
    }    
    public static double aera(double x,double y){
        double s=x*y;
        return s;
    }
}
