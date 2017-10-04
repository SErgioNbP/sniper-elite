package org.academiadecodigo.sniperelite;

/**
 * Created by codecadet on 04/10/2017.
 */
public class SoldierEnemy extends Enemy {

    public SoldierEnemy(int health, int armour) {

         super(100,0,"SoldierEnemy");

    }

    @Override
    public void hit() {

        int damage = (int) (Math.random() * 15 + 50);

        super.takeHealth(damage);

        if (super.getHealth() == 0){
            super.setDead(true);
        }
    }
}
