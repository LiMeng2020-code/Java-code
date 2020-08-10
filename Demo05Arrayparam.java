package cn.itcast.day05.demo01;

public class Demo05Arrayparam {
    public static void main(String[] args) {
        int []array=printarray(1,2,3);
        System.out.println(array[0]);
        System.out.println(array[1]);

    }
    public static int[] printarray(int a,int b,int c){
       int[]array=new int[3];
        array[0]=a+b+c;
       array[1]=array[0]/3;
       return array;
    }
}
