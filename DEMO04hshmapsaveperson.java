package cn.itcast.day13.demo06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DEMO04hshmapsaveperson {
    public static void main(String[] args) {
        show01();
        show02();

    }

    private static void show02() {
        HashMap<Person,String> map=new HashMap<>();
        map.put(new Person("LM",32),"BEIJING");
        map.put(new Person("LM",32),"SHANGHAI");
        map.put(new Person("JK",32),"BEIJING");
        System.out.println(map);
        Set<Map.Entry<Person,String>> set=map.entrySet();
        for (Map.Entry<Person,String> entry:set){
            Person S1=entry.getKey();
            String I=entry.getValue();
            System.out.println(S1+I);
        }
    }

    public static void show01(){
        HashMap<String,Person> map=new HashMap<>();
        map.put("beijing",new Person("LM",12));
        map.put("beijing",new Person("FS",15));
        map.put("SHANGHAI",new Person("SD",13));
        System.out.println(map);
    }
}
