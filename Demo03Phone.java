package cn.itcast.day06.demo01;

public class Demo03Phone {
    public static void main(String[] args) {
        Phone phone01=new Phone();
        phone01.broud="sanxing";
        phone01.color="red";
        phone01.price=1300;
        phone01.sendmassege("23233111");
        phone01.call("lm");
        System.out.println(phone01.broud);
        System.out.println(phone01.color);
        System.out.println(phone01.price);

        Phone phone02=new Phone();
        phone01.broud="sanxing";
        phone01.color="red";
        phone01.price=1300;
        phone01.sendmassege("23233111");
        phone01.call("lm");
        System.out.println(phone01.broud);
        System.out.println(phone01.color);
        System.out.println(phone01.price);
    }
}
