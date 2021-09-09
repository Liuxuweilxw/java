package cn.itcast.demo02;

public class KeyBorad implements USB{
    public void open(){
        System.out.println("键盘开启");
    }
    public void close(){
        System.out.println("键盘关闭");
    }
}
