package Demo03;

public class Demo03VaribleDifferece {
    public static void main(String[] args) {
        int []array={1,2,3,4,6,7,};
        int max=getmax(array);
        System.out.println(max);
    }
    public static int getmax(int[]Array){
        int t=Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (Array[i]>t){
                t=Array[i];

            }
        }return t;
    }
}
