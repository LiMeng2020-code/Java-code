package cn.itcast.day12.Demo03;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01DateFormat {
    public static void main(String[] args) throws ParseException {
        demo04();
        demo05();
    }

    private static void demo05() throws ParseException {
        SimpleDateFormat simpleDateFormat01=new SimpleDateFormat("2020-07-09 15:40:43");

        Date date02=simpleDateFormat01.parse("2020-07-09 15:40:43");
         System.out.println(date02);
    }

    private static void demo04() {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
        Date date=new Date();
        String text=simpleDateFormat.format(date);
        System.out.println(text);
        System.out.println(date);

    }
}
