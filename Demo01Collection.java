package cn.itcast.day13.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Demo01Collection {
    public static void main(String[] args) {
        Collection<String> collection01=new ArrayList<>();
        System.out.println(collection01);
        boolean b1=collection01.add("lm");
        System.out.println(b1);
        System.out.println(collection01);
        collection01.add("kn");
        collection01.add("kn");
        collection01.add("kn");
        System.out.println(collection01);
        collection01.remove("lm");
        System.out.println(collection01);
        boolean b2=collection01.contains("kn");
        System.out.println(b2);
        boolean b3=collection01.isEmpty();
        System.out.println(b3);
        System.out.println(collection01.size());
        Object[] arr= collection01.toArray();
        for (int i=0;i<collection01.size();i++){
            System.out.println(arr[i]);
        }
    }
}
