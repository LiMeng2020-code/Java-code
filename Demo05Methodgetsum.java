package cn.itcast.day04.demo02;

public class Demo05Methodgetsum {
    public static void main(String[] args) {
        getsum();
        System.out.println(getsum());

    }
    public static int getsum(){
        int sum=0;
        for (int i = 0; i <= 100; i++) {
            sum+=i;
        }return sum;

    }
}
