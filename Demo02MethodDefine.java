package cn.itcast.day04.demo02;

public class Demo02MethodDefine {
    public static void main(String[] args) {
        sum(10,20);
        System.out.println(sum(10,20));
        int num=sum(10,20);
        System.out.println(num);

    }
    public static int sum(int a,int b)
    {
        int result= a + b;
        return result;
    }

}
