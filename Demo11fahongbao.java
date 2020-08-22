package cn.itcast.day09.Demo11;

import java.util.ArrayList;

public class Demo11fahongbao {
    public static void main(String[] args) {
        qunzhu quzhu01=new qunzhu("lim",100);
        member member01=new member("01",0);
        member member02=new member("02",0);
        member member03=new member("03",0);
        member01.show();
        member02.show();
        member03.show();
        quzhu01.show();
        ArrayList<Integer> redlist=quzhu01.send(20,3);
        member01.receive(redlist);
        member02.receive(redlist);
        member03.receive(redlist);
        member01.show();
        member02.show();
        member03.show();
        quzhu01.show();

    }
}
