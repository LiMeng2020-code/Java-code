package Demo02;

public class Demo06StringArray {
    public static void main(String[] args) {
        int array[]={1,2,3};
        String result=StringArray(array);
        System.out.println(result);
    }
    public static String StringArray(int[] array){
         String str="[";
        for (int i = 0; i < array.length; i++) {
            if(i<array.length-1){
                str+="word"+array[i]+"#";
            }
            else {
                str+="word"+array[i]+"]";

            }
        }return str;
    }
}
