package cn.itcast.demo02;

public class Test  {
    public static void main(String[] args){
        Computer com=new Computer();
        com.open();

        com.useUsb(new Mouse());
        com.useUsb(new KeyBorad());

        com.close();
    }
}
