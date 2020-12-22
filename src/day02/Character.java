package day02;

public class Character {
    String name;
    int hp;
    int lvl;
    char dps;

    public Character() {
    }

    public Character(String name, int hp, int lvl, char dps) {
        this.name = name;
        this.hp = hp;
        this.lvl = lvl;
        this.dps = dps;
    }

    public void prinfinfo() {
        System.out.println(name+"-生命："+hp+",等级"+lvl+",伤害："+dps);
    }
}
