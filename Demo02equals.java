package cn.itcast.day12.Demo01;

public class Demo02equals {
    public static void main(String[] args) {
        Person person01=new Person("LM",12);
        Person person02=new Person("LM",12);

        System.out.println(person01);
        System.out.println(person02);
        //person01=person02;
        System.out.println(person01);
        System.out.println(person02);
        Boolean b=person01.equals(person02);
        System.out.println(b);
    }
}
