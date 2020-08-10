package cn.itcast.day05.demo01;

public class Demo04Arraylength {
    public static void main(String[] args) {
        int []array=new int[4];
        int []array2={1,3,4,2,6,9,7,4,3};
        System.out.println(array2.length);
        array=new int[6];
        System.out.println(array.length);
        int t=array2[0];
        for (int i = 0; i < array2.length/2; i++) {
            t=array2[i];
            array2[i]=array2[array2.length-i-1];
            array2[array2.length-i-1]=t;
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
        }


    }
}
