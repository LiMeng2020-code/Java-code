package cn.itcast.day13.demo04;

import java.util.LinkedList;

public class demo02linkedlist {
    public static void main(String[] args) {
        show01();
    }
    private static void show01(){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.addFirst("LM");
        linkedList.addLast("kn");
        linkedList.push("jn");
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        linkedList.removeFirst();//=pop()
        linkedList.removeLast();
        System.out.println(linkedList);
    }
}
