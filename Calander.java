package cn.itcast.day12.Demo04;
import java.util.Calendar;
import java.util.Date;

public class Calander {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
       System.out.println(c);
        demo01();
        demo02();
        demo03();
        demo04();
    }
    public static void demo01(){
        Calendar C=Calendar.getInstance();
        int year=C.get(Calendar.YEAR);
       System.out.println(year);
        int month=C.get(Calendar.MONTH);
        System.out.println(month);
        int date=C.get(Calendar.DATE);
       System.out.println(date);
    }
    public static void demo02(){
        Calendar C=Calendar.getInstance();
        C.set(Calendar.YEAR,1997);
        C.set(Calendar.MONTH,1);
        C.set(Calendar.DATE,26);
        int year=C.get(Calendar.YEAR);
        System.out.println(year);
        int month=C.get(Calendar.MONTH);
        System.out.println(month);
        int date=C.get(Calendar.DATE);
      System.out.println(date);
    }
    public static void demo03(){
        Calendar C=Calendar.getInstance();
        C.add(Calendar.YEAR,2);
        int year=C.get(Calendar.YEAR);
      System.out.println(year);
        int month=C.get(Calendar.MONTH);
        System.out.println(month);
        int date=C.get(Calendar.DATE);
        System.out.println(date);
    }
    public static void demo04(){
        Calendar C=Calendar.getInstance();
        Date date=C.getTime();
        System.out.println(date);
    }
}
