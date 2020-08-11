package cn.itcast.day06.demo01;

public class Demo04ArrayParam {
    public static void main(String[] args) {
        Phone one=new Phone();
        one.broud="sanxing";
        one.color="red";
        one.price=1300;
        Method(one);
    }
    public static void Method(Phone param){
        System.out.println(param.broud);
        System.out.println(param.color);
        System.out.println(param.price);
    }
}
