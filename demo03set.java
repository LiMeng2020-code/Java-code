package cn.itcast.day13.demo04;

import java.util.HashSet;
import java.util.Set;

public class demo03set {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(1);
        for (int i:set){
            System.out.println(i);
        }
    }
}
