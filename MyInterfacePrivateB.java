package cn.itcast.day10.Demo01;

public interface MyInterfacePrivateB {
    public static void methodDefault01(){
        System.out.println("JINGTAI01");
        common();
    }
    public static void methodDefault02(){
        System.out.println("JIGNTAI02");
        common();
    }
    private static void common(){
        System.out.println("ooo");
        System.out.println("aaa");
    }
}
