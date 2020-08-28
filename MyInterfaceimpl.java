package cn.itcast.day10.Demo02;

public class MyInterfaceimpl implements InterfaceA,InterfaceB{
    @Override
    public void mehod01() {
        System.out.println("chongxie 01");
    }

    @Override
    public void methodcommon() {
        System.out.println("common");
    }

    @Override
    public void methoddefault() {
        System.out.println("morenchongxie");
    }

    @Override
    public void mehod02() {
        System.out.println("chongxie 02");

    }
}
