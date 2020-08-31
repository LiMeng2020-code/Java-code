package cn.itcast.day11.Demo05;

public class Demo01main {
    public static void main(String[] args) {
        Myinterfaceimpl impl=new Myinterfaceimpl();
        impl.method1();
        Myinterface OBJ=new Myinterface() {
            @Override
            public void method1() {
                System.out.println("niming neibulei");
            }
            @Override
            public void method2() {
                System.out.println("niming neibulei");
            }
        };
        OBJ.method1();
        OBJ.method2();
        new Myinterface(){
            @Override
            public void method1() {
                System.out.println("niming neibulei");
            }
            @Override
            public void method2() {
                System.out.println("niming neibulei");
            }
        }.method1();
    }



}
