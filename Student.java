package Demo03;

public class Student {

    private int age;
    private String name;
    private int id;
    static String room;
    private static int idcount=0;

    public Student(){
        idcount++;
    }
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
        this.id=++idcount;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getid() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }
}
