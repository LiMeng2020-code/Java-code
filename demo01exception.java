package cn.itcast.day14.demo01;

public class demo01exception {
    public static void main(String[] args) {
        int[] array={1,2,3};
        int i=getelement(array,3);
        System.out.println(i);

    }
    public static int getelement(int[] arr,int index){
        int element=arr[index];
        if(index<0||index>=arr.length){
            throw new ArrayIndexOutOfBoundsException("数组越界异常");
        }
        return element;
    }
}
