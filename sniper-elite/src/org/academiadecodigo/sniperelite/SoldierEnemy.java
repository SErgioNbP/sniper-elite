package org.academiadecodigo.sniperelite;

/**
 * Created by codecadet on 04/10/2017.
 */
public class SoldierEnemy extends Enemy {

    public SoldierEnemy(int health) {

         super(100);

    }

    @Override
    public String getMessage() {
        return "I'm a Soldier!!";
    }

    @Override
    public void hit(int bulletDamage) {

        System.out.println("damage: " + bulletDamage);

        super.takeHealth(bulletDamage);

        if (this.getHealth() <= 0){
            this.setDead();
            this.setHealth(0);
            System.out.println("\n You're DEAD!!");
            return;
        }

        System.out.println("\n Soldier health: " + this.getHealth());
    }
}
