package cn.itcast.day13.demo04;

import java.util.HashSet;

public class demo06hashsetsaveperson {
    public static void main(String[] args) {
        HashSet<Person> hashSet=new HashSet<>();
        Person p1=new Person("LM",12);
        Person p2=new Person("LM",12);
        Person p3=new Person("LB",12);
        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        System.out.println(hashSet);

    }
}
