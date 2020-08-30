package cn.itcast.day10.Demo06;

public class DemoMain {

    public static void main(String[] args) {
        computer computer01=new computer();
        //mouse mouse01=new mouse();
        USB usbmouse=new mouse();
        computer01.usbDevice(usbmouse);
        keybroad keybroad01=new keybroad();
        computer01.usbDevice(keybroad01);
        
    }
}
