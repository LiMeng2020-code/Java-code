package cn.itcast.day11.Demo06;

public class Demomain {
    public static void main(String[] args) {
        Hero hero01=new Hero();
        hero01.setName("lm");
        hero01.setAge(23);
        Weapon weapon=new Weapon("kk");
        hero01.setWeapon(weapon);
        hero01.attack();



    }
}
