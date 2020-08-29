package cn.itcast.day10.Demo05;

public class Demo02mulit {
    public static void main(String[] args) {
        Fu fu01 = new Zi();
        fu01.method();
        //fu01.chifan();
        if (fu01 instanceof Zi) {
            Zi zi01 = (Zi) fu01;
            zi01.chifan();
        }
    }
}
