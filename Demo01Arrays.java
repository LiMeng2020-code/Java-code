package Demo04;
import java.util.Arrays;
import java.util.Arrays;

public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArrays={10,2,3,4,5,6,7,8};
        String intstr=Arrays.toString(intArrays);
        System.out.println(intstr);
        Arrays.sort(intArrays);
        System.out.println(Arrays.toString(intArrays));
    }
}
