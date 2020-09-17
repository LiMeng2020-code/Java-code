package cn.itcast.day13.demo02;

public class GenericInterfaceImpl1 implements GenericInterface<String>{

    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
