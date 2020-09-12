package cn.itcast.day12.Demo04;

public class Demo04tostring {
    public static void main(String[] args) {
        String str1="LM";
        System.out.println(str1);
        StringBuilder str=new StringBuilder(str1);
        System.out.println(str);
        str.append("ki");
        System.out.println(str);
        String str2=str.toString();
        System.out.println(str2);

    }
}
