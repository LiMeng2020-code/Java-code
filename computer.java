package cn.itcast.day10.Demo06;

public class computer {
    public void opencomputer(){
        System.out.println("opencomputer");
    }
    public void closecomputer(){
        System.out.println("closecomputer");
    }
    public void usbDevice(USB usb){
        usb.open();
        usb.close();
        if (usb instanceof mouse){
            mouse mouse01=(mouse)usb;
            mouse01.clike();

        }
        else if (usb instanceof keybroad){
            keybroad keybroad01=(keybroad)usb;
            keybroad01.code();
        }
    }
}
