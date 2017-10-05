package org.academiadecodigo.sniperelite;

/**
 * Created by codecadet on 04/10/2017.
 */
public class ArmouredEnemy extends Enemy {

    private int armour;

    public ArmouredEnemy(int health) {

        super(100);

        armour = 100;
    }

    @Override
    public void hit(int bulletDamage) {

        System.out.println("\n damage: " + bulletDamage);

        while (armour > 0) {

            armour = (armour - bulletDamage);

            if (armour <= 0) {
                armour = 0;
            }

            System.out.println("\n Armoured Enemy armour: " + armour);
        }

        if (this.getHealth() > 0) {

            super.takeHealth(bulletDamage);

            if (this.getHealth() <= 0) {
                this.setHealth(0);
            }

            System.out.println("Armoured Enemy health: " + getHealth());
        }

        if (this.getHealth() <= 0) {
            this.setHealth(0);
            this.setDead();
            System.out.println("\n You're DEAD!!");
            return;
        }

    }


    /*
    public int remainingDamage(int damage) {

        if (damage > armour) {
            armour -= damage;
        }
        return Math.abs(armour);
    }
    */
    
}
