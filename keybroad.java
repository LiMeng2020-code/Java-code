package cn.itcast.day10.Demo06;

public class keybroad implements USB{
    @Override
    public void open() {
        System.out.println("open keybroad");
    }
    @Override
    public void close() {
        System.out.println("close keybroad");
    }
     void code(){
        System.out.println("code");
    }
}
