package Demo02;

public class Demo02StringGet {
    public static void main(String[] args) {
        int length="badbdadbakdbawuq".length();
        System.out.println(length);
        String str1="hello";
        String str2="java";
        String str3=str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        char ch=str1.charAt(1);
        int num=str1.indexOf("e");
        System.out.println(ch);
        System.out.println(num);

    }
}
