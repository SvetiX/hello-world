package herogame;

import helper.RandomHelp;

public class Hero {

    String name;
    int strength;
    int health;
    Sword sword;

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", sword=" + sword +
                '}';
    }

    public int damage() {

        int damage = sword.weight * strength / RandomHelp.stats(50,100);
        return damage;

    }

}
