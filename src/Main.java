
import Boss.Boss;
import Hero.Hero;

import java.nio.channels.Pipe;
import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
        Boss firstBoss = new Boss(700, 50, "phys");
        System.out.println("здоровье " + firstBoss.getHealth() + " урон " + firstBoss.getDamage() + " тип защиты " + firstBoss.getTypeOfDefence());
        System.out.println();
    }


    }










