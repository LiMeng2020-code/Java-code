package cn.itcast.day12.Demo04;

public class Demo03StringBuilder {
    public static void main(String[] args) {
        StringBuilder srt1=new StringBuilder();
        System.out.println(srt1);
        StringBuilder str2=new StringBuilder("LM");
        System.out.println(str2);
        demo01();
    }

    private static void demo01() {
        StringBuilder str3=new StringBuilder();
        StringBuilder str4=str3.append("lm");
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str3==str4);
    }
}
