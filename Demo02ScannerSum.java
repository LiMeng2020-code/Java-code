package cn.itcast.day07.demo01;
import java.util.Scanner;
public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        int num=sc1.nextInt();
        int num1=sc2.nextInt();
        System.out.println(num+num1);
    }
}
