package cn.itcast.demo02;

public class Mouse implements USB {
    public void open(){
        System.out.println("打开鼠标");
    }
    public void close(){
        System.out.println("关闭鼠标");
    }
}
