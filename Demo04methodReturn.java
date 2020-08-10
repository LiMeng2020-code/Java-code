package cn.itcast.day04.demo02;

public class Demo04methodReturn {
    public static void main(String[] args) {
        issame(10,10);
    }

    public static boolean issame(int a, int b) {
        boolean same;
        if (a == b) {
            same= true;
        } else {
            same= false;
        }return same;
    }
}
