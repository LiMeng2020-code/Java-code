package cn.itcast.day13.demo04;

public class demo04hashcode {
    public static void main(String[] args) {
        Person p1=new Person();
        System.out.println(p1.hashCode());
        String S1=new String("LN");
        String S2=new String("LM");
        System.out.println(S1.hashCode());
        System.out.println(S2.hashCode());
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
    }
}
