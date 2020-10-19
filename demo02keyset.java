package cn.itcast.day13.demo06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo02keyset {
    public static void main(String[] args) {
        Map<String,Integer> map01=new HashMap<>();
        map01.put("lm",12);
        map01.put("kn",14);
        map01.put("op",90);
        Set<String> set=map01.keySet();
        System.out.println(set);
        for (String s1:set){
            System.out.println(map01.get(s1));
        }
    }
}
