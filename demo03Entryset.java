package cn.itcast.day13.demo06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demo03Entryset {
    public static void main(String[] args) {
        Map<String,Integer> map01=new HashMap<>();
        map01.put("lm",12);
        map01.put("kn",14);
        map01.put("op",90);
        Set<Map.Entry<String,Integer>> set=map01.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator=set.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry=iterator.next();
            String S1=entry.getKey();
            Integer i1=entry.getValue();
            System.out.println(S1+i1);
        }
        for (Map.Entry<String,Integer> entry:set){
            String S1=entry.getKey();
            Integer I=entry.getValue();
            System.out.println(S1+I);
        }
    }
}
