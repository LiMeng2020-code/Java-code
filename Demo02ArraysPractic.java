package Demo04;
import java.util.Arrays;
import java.util.Random;
public class Demo02ArraysPractic {
    public static void main(String[] args) {
        String str="fesbceuofafbewlf";
        char[] chars=str.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);
        int j=chars.length;
        for (int i =0; i < j; i++) {
            System.out.print(chars[j-i-1]);
        }
    }
}
