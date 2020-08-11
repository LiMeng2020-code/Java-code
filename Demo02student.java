package cn.itcast.day06.demo01;

public class Demo02student {
    public static void main(String[] args) {
        Student stu=new Student();
        System.out.println(stu.age);
        System.out.println(stu.name);
        stu.age=18;
        stu.name="lm";
        System.out.println(stu.age);
        System.out.println(stu.name);
    }
}
