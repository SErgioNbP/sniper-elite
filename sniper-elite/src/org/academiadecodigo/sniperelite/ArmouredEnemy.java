package org.academiadecodigo.sniperelite;

/**
 * Created by codecadet on 04/10/2017.
 */
public class ArmouredEnemy extends Enemy {

    private int armour;

    public ArmouredEnemy(int health) {

        super(100);

        armour = 50;
    }


    @Override
    public String getMessage() {
        return "I'm a Armoured Soldier!!";
    }

    @Override
    public void hit(int bulletDamage) {

        System.out.println("\n damage: " + bulletDamage);

        if (this.getHealth() <= 0) {
            this.setHealth(0);
            this.setDead();
            System.out.println("\n You're DEAD!!");
            return;
        }

        if (armour > 0) {

            armour = (armour - bulletDamage);

            System.out.println("\n Armoured Enemy armour: " + armour);
        }

        if (armour <= 0 && this.getHealth() > 0) {

            super.takeHealth(- armour);

            armour = 0;

            if (this.getHealth() <= 0) {
                this.setHealth(0);
            }

            System.out.println("Armoured Enemy Armour: " + armour);

            System.out.println("Armoured Enemy health: " + getHealth());

            super.takeHealth(bulletDamage);
        }

    }
}
