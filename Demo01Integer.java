package cn.itcast.day12.Demo05;

public class Demo01Integer {
    public static void main(String[] args) {
        Integer integer01=new Integer(1);
        System.out.println(integer01);
        Integer integer02=new Integer("100");
        System.out.println(integer02);
        Integer integer03=Integer.valueOf(1);
        System.out.println(integer03);
        Integer integer04=Integer.valueOf("100");
        System.out.println(integer04);
        int i=integer01.intValue();
        System.out.println(i);
    }
}
