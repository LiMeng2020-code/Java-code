package cn.itcast.day06.demo01;

public class Demo05Phonereturn {
    public static void main(String[] args) {
        Phone two=getphone();
        System.out.println(two.broud);
        System.out.println(two.color);
        System.out.println(two.price);

    }
    public static Phone getphone(){
        Phone one=new Phone();
        one.price=3212;
        one.color="red";
        one.broud="sanx";
        return one;
    }
}
