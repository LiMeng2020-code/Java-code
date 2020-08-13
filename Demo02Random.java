package Demo03;
import java.util.Random;
public class Demo02Random {
    public static void main(String[] args) {
        Random ra=new Random();
        for(int i=0;i<10;i++){
            int num =ra.nextInt(10) ;
            System.out.println(num);

        }
    }
}
