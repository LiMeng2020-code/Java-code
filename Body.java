package cn.itcast.day11.Demo03;

public class Body {
    public class xinzang{
        public void method(){
            System.out.println("xinzang tiaodong");
        }
    }
    public void bodymethod(){
        System.out.println("bodymethod");
        xinzang xinzang01=new xinzang();
        xinzang01.method();
    }

}
