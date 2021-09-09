package cn.itcast.demo02;

public class Computer {
    public void open(){
        System.out.println("开机");
    }
    public void close(){
        System.out.println("关机");
    }
    public void useUsb(USB usb){
        usb.open();
        usb.close();
    }
}
