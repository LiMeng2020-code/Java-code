package cn.itcast.day09.Demo08;

public class Zi extends Fu{
    int num=20;
    @Override
    public void method(){
       // int num=30;
        System.out.println("zilei01");
    }
    public void show(){
        int num=30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
