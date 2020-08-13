package Demo02;

import java.util.Scanner;

public class Demo02Anonymoous {
    public static void main(String[] args) {
       // int num=new Scanner(System.in).nextInt();
       // method(new Scanner(System.in));
        Scanner sc = methodeturn();
        //sc.nextInt();
        System.out.println(sc.nextInt());
    }
    public static void method(Scanner sc){
        int num=sc.nextInt();
        System.out.println(num);

    }
    public static Scanner methodeturn(){
        return new Scanner(System.in);
    }
}
