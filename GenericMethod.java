package cn.itcast.day13.demo02;

public class GenericMethod {
    public <M> void GenericMethod(M m){
        System.out.println(m);
    }
    //静态泛型
    public static <S> void method02(S s){
        System.out.println(s);
    }
}
