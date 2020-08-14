package Demo02;

public class Demo05StringSplits {
    public static void main(String[] args) {
        String STR1="aaa,bbb,ccc";
        String[] st=STR1.split(",");
        System.out.println(st[1]);
    }
}
