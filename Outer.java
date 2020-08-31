package cn.itcast.day11.Demo04;

public class Outer {
    public void method(){
        System.out.println("outermethod");
        class Inner{
            public void innermethod(){
                System.out.println("innermethod");
            }
        }
        Inner inner=new Inner();
        inner.innermethod();
    }
}
