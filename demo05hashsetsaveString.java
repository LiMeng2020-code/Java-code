package cn.itcast.day13.demo04;

import java.util.HashSet;

public class demo05hashsetsaveString {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("abc");
        set.add("abc");
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);
    }
}
