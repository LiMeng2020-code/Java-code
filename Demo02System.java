package cn.itcast.day12.Demo04;
import java.lang.System;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo02System {

    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo02() {
        int[] src={1,2,3,4,5};
        int[] dest={5,6,7,8,9};
        System.out.println(Arrays.toString(src));
        System.out.println(Arrays.toString(dest));

        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));
    }

    public static void demo01() {
        long s= System.currentTimeMillis();
        //System.out.println(s);
        for (int i=0;i<=999;i++){
            System.out.println(i);
        }
        long e=System.currentTimeMillis();
        System.out.println(e-s);
    }
}
