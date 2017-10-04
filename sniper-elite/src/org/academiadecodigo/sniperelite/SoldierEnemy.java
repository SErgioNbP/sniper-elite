package org.academiadecodigo.sniperelite;

/**
 * Created by codecadet on 04/10/2017.
 */
public class SoldierEnemy extends Enemy {


    public SoldierEnemy(int health) {
         super(health);

    }

    public void hit(int damage) {

        damage += (int) (Math.random() * 15 + 50);

    }
}
