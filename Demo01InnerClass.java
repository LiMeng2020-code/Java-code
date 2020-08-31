package cn.itcast.day11.Demo03;

public class Demo01InnerClass {
    public static void main(String[] args) {
        Body body01=new Body();
        body01.bodymethod();
        Body.xinzang XINZANG02=new Body().new xinzang();
        XINZANG02.method();
        Outer outer=new Outer();
        Outer.Inner inner=new Outer().new Inner();
        inner.method();
    }

}
