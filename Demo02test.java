package cn.itcast.day12.Demo03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo02test {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("qingshuru yyyy-MM-dd");
        String birthdaydateString=sc.next();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date Birthdate=simpleDateFormat.parse(birthdaydateString);
        long birthdaytime=Birthdate.getTime();//HUOQUshengri  haomiao
        Date date=new Date();
        long nowtime=date.getTime();
        long time=nowtime-birthdaytime;
        System.out.println(time/1000/60/60/24);

    }
    public static void datecomp(){

    }
}
