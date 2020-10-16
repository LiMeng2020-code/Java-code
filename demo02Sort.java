package cn.itcast.day13.demo05;

import java.util.ArrayList;
import java.util.Collections;

public class demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01=new ArrayList<>();
        list01.add(2);
        list01.add(9);
        list01.add(7);
        System.out.println(list01);
        Collections.sort(list01);
        System.out.println(list01);
        ArrayList<Person> list03=new ArrayList<>();
        list03.add(new Person("lm",13));
        list03.add(new Person("ln",17));
        list03.add(new Person("lk",15));
        System.out.println(list03);
        Collections.sort(list03);
        System.out.println(list03);
    }
}
