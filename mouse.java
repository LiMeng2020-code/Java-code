package cn.itcast.day10.Demo06;

public class mouse implements USB{
    @Override
    public void open() {
        System.out.println("open mouse");
    }
    @Override
    public void close() {
        System.out.println("close mouse");
    }
    void clike(){
        System.out.println("clike");
    }
}
