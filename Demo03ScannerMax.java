package cn.itcast.day07.demo01;
import java.util.Scanner;
public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=a;
        if(b>d){
            d=b;
        }
        if (c>d){
            d=c;
        }
        System.out.println(d);
    }
}
