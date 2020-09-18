package cn.itcast.day13.demo03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class demo01doudizhu {
    public static void main(String[] args) {
        ArrayList<String> poker=new ArrayList<>();
        String[] color={"♥","♠","♣","♦"};
        String[] number={"2","A","3","4","5","6","7","8","9","10","J","Q","K"};
        poker.add("dagui");
        poker.add("xiaogui");
        for (String s : number) {
            for (String s1 : color) {
                System.out.println(s+s1);
                poker.add(s+s1);
            }
        }
        Collections.shuffle(poker);
        //System.out.println(poker);
        ArrayList<String> player01=new ArrayList<>();
        ArrayList<String> player02=new ArrayList<>();
        ArrayList<String> player03=new ArrayList<>();
        ArrayList<String> DIPAI=new ArrayList<>();
        for (int i=0;i<poker.size();i++){
            String p=poker.get(i);
            if(i>=51){
                DIPAI.add(p);
            }
            else if (i%3==0){
                player01.add(p);
            }
            else if (i%3==1){
                player02.add(p);
            }
            else if (i%3==2){
                player03.add(p);
            }
        }
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        System.out.println("play01"+player01);
        System.out.println("play02"+player02);
        System.out.println("play03"+player03);
        System.out.println("DIPAI"+DIPAI);
    }
}
