package cn.itcast.day10.Demo01;

public interface MyInterfacePrivate {
    public default void methodDefault01(){
        System.out.println("moren fangfa01");
        common();
    }
    public default void methodDefault02(){
        System.out.println("moren fangfa02");
        common();
    }
    private void common(){
        System.out.println("ooo");
        System.out.println("aaa");
    }
}
