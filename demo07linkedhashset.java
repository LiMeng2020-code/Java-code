package cn.itcast.day13.demo04;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class demo07linkedhashset {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("abc");
        hashSet.add("lm");
        hashSet.add("abc");
        hashSet.add("www");
        System.out.println(hashSet);
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("abc");
        linkedHashSet.add("lm");
        linkedHashSet.add("abc");
        linkedHashSet.add("www");
        System.out.println(linkedHashSet);
    }
}
