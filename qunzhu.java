package cn.itcast.day09.Demo11;

import java.util.ArrayList;

public class qunzhu extends User{
    public qunzhu(){

    }
    public qunzhu(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer> send(int totalmoney,int count){
        ArrayList<Integer> redlist=new ArrayList<>();
        int leftmoney=super.getMoney();
        if(leftmoney<totalmoney){
            System.out.println("yuebuzu");
            return redlist;
        }
        super.setMoney(leftmoney-totalmoney);
        int arvg=totalmoney/count;
        int mod=totalmoney%count;
        for (int i=0;i<count-1;i++){
            redlist.add(arvg);
        }
        int last=arvg+mod;
        redlist.add(last);
        return redlist;
    }
}
