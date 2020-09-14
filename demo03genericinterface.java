package cn.itcast.day13.demo02;

public class demo03genericinterface {
    public static void main(String[] args) {
        //创建接口实现类的对象
        GenericInterfaceImpl1 interfaceImpl1=new GenericInterfaceImpl1();
        interfaceImpl1.method("LM");
        GenericInterfaceImpl2 interfaceImpl2=new GenericInterfaceImpl2();
        interfaceImpl2.method("km");
        interfaceImpl2.method(1);

    }
}
