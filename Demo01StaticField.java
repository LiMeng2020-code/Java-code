package Demo03;

public class Demo01StaticField {
    public static void main(String[] args) {
        Student s1=new Student(13, "lm");

        s1.room="ks";
        System.out.println(s1.getAge()+s1.getName()+s1.getid()+s1.room);
        Student s2=new Student(11, "lmw");
        System.out.println(s2.getAge()+s2.getName()+s2.getid()+s2.room);


    }
}
