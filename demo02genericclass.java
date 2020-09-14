package cn.itcast.day13.demo02;

public class demo02genericclass {
    public static void main(String[] args) {
        //不使用泛型，默认为obj
        GenericClass genericClass=new GenericClass();
        genericClass.setName("zhinengshi zifuchuan");
        Object obj=genericClass.getName();
        //int型
        GenericClass<Integer> GC1=new GenericClass<Integer>();
        GC1.setName(2);
        System.out.println(GC1.getName());

    }
}
