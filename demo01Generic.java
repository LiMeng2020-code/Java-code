package cn.itcast.day13.demo02;

import java.util.ArrayList;
import java.util.Iterator;

public class demo01Generic {
    public static void main(String[] args) {
        show01();
        show02();
    }
    public static void show01(){
        ArrayList list=new ArrayList();
        list.add("lm");
        list.add(1);
        Iterator iterator =list.iterator();
        while (iterator.hasNext()){
            Object OBJ=iterator.next();
            System.out.println(OBJ);
          //  String s1=(String)OBJ;
           // System.out.println(s1);
        }
    }
    public static void show02(){
        ArrayList<String> list=new ArrayList<String>();
        list.add("lm");
        Iterator<String> iterator =list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s+s.length());
        }
    }
}
