package cn.itcast.day13.demo04;

public class demo08Vargers {
    public static void main(String[] args) {
        int i=add(10,2,3);
        System.out.println(i);


    }
    public static int add(int...arr){
        //System.out.println(arr);
        //System.out.println(arr.length);
        int sum=0;
        for (int i:arr){
            sum+=i;
        }
        return sum;
    }
}
