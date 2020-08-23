package cn.itcast.day09.Demo11;

import java.util.ArrayList;
import java.util.Random;

public class member extends User{
    public member(){

    }

    public member(String name, int money) {
        super(name, money);
    }
    public void receive(ArrayList<Integer> list){
        int index=new Random().nextInt(list.size());
        int detla=list.remove(index);
        int money=getMoney();
        super.setMoney(detla+money);

    }
}
