package cn.itcast.day10.Demo01;

public interface MyInterfaceDefault {
    public abstract void methodAbs();
    public default void methodAbs2(){
        System.out.println("moren fangfa");
    }

}
