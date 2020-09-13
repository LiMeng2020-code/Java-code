package cn.itcast.day12.Demo05;

public class Demo02tostring {
    public static void main(String[] args) {
        String str1=100+"";
        System.out.println(str1);
        String str2=Integer.toString(10);
        System.out.println(str2);
        String str3=String.valueOf(1);
        System.out.println(str3+20);
        int i=Integer.parseInt("122");
        System.out.println(i+12);
    }
}
