package cn.itcast.day13.demo02;

import java.util.ArrayList;
import java.util.Iterator;

public class demo04Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        ArrayList<String> list2=new ArrayList<>();
        list2.add("lm");
        list2.add("nn");
        Arrayprint(list1);
        Arrayprint(list2);

    }
    public static void Arrayprint(ArrayList<?> list){
        Iterator<?> iterator01 = list.iterator();
        while (iterator01.hasNext()){
            Object o = iterator01.next();
            System.out.println(o);
        }

    }
}
