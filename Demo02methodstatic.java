package Demo03;

public class Demo02methodstatic {
    public static void main(String[] args) {
        Myclass obj=new Myclass();
        obj.method();
        Myclass.methodstatic();
        method();
    }
    public static void method(){
        System.out.println("ziji fangfa");
    }
}
