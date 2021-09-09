package cn.itcast.demo02;

public class Test {
    public static void main(String[] args){
        JavaEE j=new JavaEE();
        Network n=new Network();

        j.setID("1000");
        j.setName("jjj");

        n.setID("222");
        n.setName("sdfs");

        j.work();
        n.work();


    }
}
