package cn.itcast.demo02;

public class JavaEE extends Developer{
    public void work(){
        System.out.println("JavaEE");
        System.out.println(super.getID()+"  "+super.getName());
    }
}
