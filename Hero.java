package cn.itcast.day11.Demo07;

public class Hero {
    private String name;
    private Skill skill;
    public void attack(){
        System.out.println(name);
        skill.use();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public Hero() {
    }
}
