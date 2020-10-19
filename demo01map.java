package cn.itcast.day13.demo06;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo01map {
    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {
        Map<String,Integer> map01=new HashMap<>();
        map01.put("lm",12);
        map01.put("kn",14);
        map01.put("op",90);
        Integer i1=map01.remove("kn");
        System.out.println(i1);
        Integer i2=map01.get("lm");
        System.out.println(i2);
        boolean b1=map01.containsKey("lm");
        System.out.println(b1);
    }

    public static void show01(){
        Map<String,String> map=new HashMap<>();
        String S1=map.put("lm","kn");
        System.out.println(S1);
        String S2=map.put("lm","KJ");
        System.out.println(S2);
        System.out.println(map);
    }
}
