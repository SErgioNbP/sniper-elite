package org.academiadecodigo.sniperelite;

/**
 * Created by codecadet on 04/10/2017.
 */
public class ArmouredEnemy extends Enemy {


    private int armour;


    public ArmouredEnemy(int health) {

        super(health);
    }

    public void hit(int damage) {


        // se armour tiver pontos leva o dano antes da vida

        damage += (int) (Math.random() * 15 + 50);
    }

}
