package herogame;

import helper.RandomHelp;

import java.awt.geom.Area;

public class HeroGame {

    public static void main(String[] args) throws InterruptedException {

        Sword sword1 = new Sword();
        Sword sword2 = new Sword();
        Sword sword3 = new Sword();

        sword1.name = "Экскалибур";
        sword2.name = "Фростмор";
        sword3.name = "Эшбрингер";

        sword1.length = RandomHelp.stats(50, 80);
        sword2.length = RandomHelp.stats(50, 80);
        sword3.length = RandomHelp.stats(50, 80);

        sword1.weight = RandomHelp.stats(5, 10);
        sword2.weight = RandomHelp.stats(5, 10);
        sword3.weight = RandomHelp.stats(5, 10);

        Hero hero1 = new Hero();
        Hero hero2 = new Hero();

        hero1.name = "Илья Муромец";
        hero2.name = "Кощей Бессмертный";

        hero1.health = RandomHelp.stats(20, 100);
        hero2.health = RandomHelp.stats(80, 200);

        hero1.strength = RandomHelp.stats(60, 80);
        hero2.strength = RandomHelp.stats(30, 40);

        hero1.sword = sword1;
        hero2.sword = sword2;


        AreaBattle areaBattle = new AreaBattle();

        areaBattle.length = RandomHelp.stats(100, 200);
        System.out.println("Расстояние между противниками = " + areaBattle.length);

        areaBattle.pointMin = 0;
        areaBattle.pointMax = areaBattle.length;


        int attackMiss;
        attackMiss = AreaBattle.rangeAttack(sword1.length, sword2.length);
        System.out.println("Расстояние от клинка до клинка = " + attackMiss);


        if (attackMiss > 0) {

            System.out.println("Противники делают шаг друг к другу...");

            while (true) {


                sword1.length = sword1.length + 1;
                int miss1;
                miss1 = AreaBattle.rangeAttack(sword1.length, sword2.length);

                System.out.println(hero2.name + " делает шаг вперед и наносит удар." + " Расстояние до противника = " + miss1);


                if (miss1 == 0) {
                    System.out.println("Начинается битва!");

                    while (true)

                    {

                        int damage;
                        damage = hero2.damage();
                        hero1.health = hero1.health - damage;
                        System.out.println(hero2.name + " наносит " + damage + " урона " + hero1.name + ". " +
                                hero1.name + " имеет " + hero1.health);
                        if (hero1.health <= 0) {
                            System.out.println(hero1.name + " погибает в неравной схватке.");

                            break;
                        }
                        Thread.sleep(500);

                        damage = hero1.damage();
                        hero2.health = hero2.health - damage;
                        System.out.println(hero1.name + " наносит " + damage + " урона " + hero2.name + ". " +
                                hero2.name + " зализывает раны с  " + hero2.health);
                        if (hero2.health <= 0) {
                            System.out.println(hero2.name + " повержен!");

                            break;
                        }
                        Thread.sleep(500);
                    }


                    break;
                }


                Thread.sleep(500);

                sword2.length = sword2.length + 1;

                int miss2;
                miss2 = AreaBattle.rangeAttack(sword1.length, sword2.length);

                System.out.println(hero1.name + " делает шаг вперед и наносит удар." + " Расстояние до противника = " + miss2);


                if (miss2 == 0) {
                    System.out.println("Начинается битва!");
                    while (true)

                    {

                        int damage;
                        damage = hero1.damage();
                        hero2.health = hero2.health - damage;
                        System.out.println(hero1.name + " наносит " + damage + " урона " + hero2.name + ". " +
                                hero2.name + " зализывает раны с  " + hero2.health);
                        if (hero2.health <= 0) {
                            System.out.println(hero2.name + " повержен!");

                            break;
                        }
                        Thread.sleep(500);

                        damage = hero2.damage();
                        hero1.health = hero1.health - damage;
                        System.out.println(hero2.name + " наносит " + damage + " урона " + hero1.name + ". " +
                                hero1.name + " имеет " + hero1.health);
                        if (hero1.health <= 0) {
                            System.out.println(hero1.name + " погибает в неравной схватке.");

                            break;
                        }
                        Thread.sleep(500);
                    }

                    break;
                }
            }

        } else {
            System.out.println("Начинается битва!");

            int randomNumber;
            randomNumber = RandomHelp.stats(1, 2);
            System.out.println(randomNumber);


            while (true)

            {
                if (randomNumber == 1) {

                    int damage;
                    damage = hero1.damage();
                    hero2.health = hero2.health - damage;
                    System.out.println(hero1.name + " наносит " + damage + " урона " + hero2.name + ". " +
                            hero2.name + " зализывает раны с  " + hero2.health);
                    if (hero2.health <= 0) {
                        System.out.println(hero2.name + " повержен!");

                        break;
                    }
                    Thread.sleep(500);

                    damage = hero2.damage();
                    hero1.health = hero1.health - damage;
                    System.out.println(hero2.name + " наносит " + damage + " урона " + hero1.name + ". " +
                            hero1.name + " имеет " + hero1.health);
                    if (hero1.health <= 0) {
                        System.out.println(hero1.name + " погибает в неравной схватке.");

                        break;
                    }
                    Thread.sleep(500);
                }
                if (randomNumber == 2) {
                    int damage;
                    damage = hero2.damage();
                    hero1.health = hero1.health - damage;
                    System.out.println(hero2.name + " наносит " + damage + " урона " + hero1.name + ". " +
                            hero1.name + " имеет " + hero1.health);
                    if (hero1.health <= 0) {
                        System.out.println(hero1.name + " погибает в неравной схватке.");

                        break;
                    }
                    Thread.sleep(500);

                        damage = hero1.damage();
                        hero2.health = hero2.health - damage;
                        System.out.println(hero1.name + " наносит " + damage + " урона " + hero2.name + ". " +
                                hero2.name + " зализывает раны с  " + hero2.health);
                        if (hero2.health <= 0) {
                            System.out.println(hero2.name + " повержен!");

                        break;
                    }
                    Thread.sleep(500);
                }
            }
        }


    }
}

