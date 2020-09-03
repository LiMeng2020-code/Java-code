package cn.itcast.day11.Demo07;

public class Maingame {
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.setName("lm");
        hero.setSkill(new Skillimpl());
        hero.attack();
    }
}
