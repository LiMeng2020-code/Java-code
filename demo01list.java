package cn.itcast.day13.demo04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo01list {
    public static void main(String[] args) {
        //多态
        List<String> list=new ArrayList<>();
         list.add("l");
         list.add("d");
         list.add("s");
         list.add("w");
         list.add("l");
        System.out.println(list);
        list.add(3,"lm");
        System.out.println(list);
        String s=list.remove(2);
        System.out.println("beiyichu:"+s);
        String s1=list.set(1,"kn");
        System.out.println(list+s1);
        String s2=list.get(2);
        System.out.println(s2);
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            String s4 = iterator.next();
            System.out.println(s4);
        }
        for (String s5:list){
            System.out.println(s5);
        }
    }
}
