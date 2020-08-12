package Demo03;

public class Person {
    String name;
    private int age;
    public void show(){
        System.out.println(name+age);
    }
    public void setAge(int num){
        age=num;
    }
    public int getAge(){
        return age;
    }
}
