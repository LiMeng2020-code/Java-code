package cn.itcast.day13.demo05;

import java.util.ArrayList;
import java.util.Collections;

public class demo01collections {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"lm","ln","km");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
