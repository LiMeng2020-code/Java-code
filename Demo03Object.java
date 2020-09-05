package cn.itcast.day12.Demo01;
import java.util.Objects;
public class Demo03Object {
    public static void main(String[] args) {
        String s1=null;
        String s2="lm";
        boolean b2=Objects.equals(s1,s2);
        System.out.println(b2);
    }
}
