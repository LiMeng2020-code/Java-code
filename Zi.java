package cn.itcast.day09.Demo03;

public class Zi extends Fu{
    int num=20;
    public void method(){
        int num=200;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
