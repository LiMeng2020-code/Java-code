package Demo04;

public class Demo04MathPractic {
    public static void main(String[] args) {
        int count=0;
        for (double i=-10.5;i<=5.9;i++){
            if(i<=0){
                Math.ceil(i);
                if(Math.abs(i)>6||Math.abs(i)<=2.1)
                {    count++;
                System.out.println(Math.ceil(i));}
            }
            else {
                i=Math.floor(i);
                if(Math.abs(i)>6||Math.abs(i)<=2.1)
                { count++;
                System.out.println(i);}
            }
        }
        System.out.println(count);
    }
}
