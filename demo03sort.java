package cn.itcast.day13.demo05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class demo03sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01=new ArrayList<>();
        list01.add(2);
        list01.add(9);
        list01.add(7);
        System.out.println(list01);
        Collections.sort(list01, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;//升序
            }
        });
        System.out.println(list01);
        ArrayList<Student> list02=new ArrayList<>();
        list02.add(new Student("LM",13));
        list02.add(new Student("DH",13));
        list02.add(new Student("LE",14));
        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result= o1.getAge()-o2.getAge();
                if(result==0){
                    result=o1.getName().charAt(1)-o2.getName().charAt(1);
                }
                return result;
            }
        });
        System.out.println(list02);
    }
}
