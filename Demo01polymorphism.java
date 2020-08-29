package cn.itcast.day10.Demo04;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Demo01polymorphism{
    public static void main(String[] args) {
        Fu obj=new Zi();
        obj.method();
        obj.methodfu();
    }
}
