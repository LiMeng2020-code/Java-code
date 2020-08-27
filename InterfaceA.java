package cn.itcast.day10.Demo02;

public interface InterfaceA {
    public void mehod01();
    public abstract void methodcommon();
    public default void methoddefault(){
        System.out.println("default01");
    }
}
