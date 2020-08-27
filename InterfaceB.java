package cn.itcast.day10.Demo02;

public interface InterfaceB {
    public void mehod02();
    public abstract void methodcommon();
    public default void methoddefault(){
        System.out.println("default02");
    }


}
