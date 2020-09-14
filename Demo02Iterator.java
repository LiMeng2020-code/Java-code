package cn.itcast.day13.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02Iterator {
    public static void main(String[] args) {
        Collection<String> collection01=new ArrayList<>();
        collection01.add("lm");
        collection01.add("bm");
        collection01.add("dm");
        collection01.add("xm");
        Iterator<String> iterator=collection01.iterator();

        while (iterator.hasNext()) {
            String S1 = iterator.next();
            System.out.println(S1);
        }
    }
}
