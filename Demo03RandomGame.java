package Demo03;
import java.util.Random;
import java.util.Scanner;

public class Demo03RandomGame {
    public static void main(String[] args) {
        Random num=new Random();
        int yes=num.nextInt(100);
        Scanner sc=new Scanner(System.in);

        while (true)
            { int a=sc.nextInt();
            if (a > yes) {
                System.out.println("cuo1");

            } else if (a < yes) {
                System.out.println("cuo2");
            }
            else if (a==yes){
                System.out.println("shuzhiwei"+a);
                break;
            }
        }


    }
}
