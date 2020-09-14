package cn.itcast.day13.demo01;

import java.util.ArrayList;

public class Demo03Foreach {
    public static void main(String[] args) {
        demo01();
        demo02();
    }
    public static void demo01(){
        int[] arr={1,2,3,4,5};
        for (int i:arr){
            System.out.println(i);
        }
    }
    public static void demo02(){
        ArrayList<String> list=new ArrayList<>();
        list.add("lm");
        list.add("dm");
        list.add("fm");
        list.add("gm");
        for (String j:list){
            System.out.println(list);
        }
    }
}
