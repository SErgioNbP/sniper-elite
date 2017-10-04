package org.academiadecodigo.sniperelite;

/**
 * Created by codecadet on 04/10/2017.
 */
abstract public class Enemy extends GameObject {


    private int health;

    private int armour;

    private boolean isDead;


    public Enemy(int health, int armour, String type) {
        super(type);

        this.health = health;
        this.armour = armour;
    }

    abstract public void hit();

    public boolean isDead() {

        return false;
    }

    public String getMessage() {

        return "";
    }

    public int getArmour() {
        return armour;
    }

    public int getHealth() {
        return health;
    }

    public void takeArmour(int damage) {
        if (damage > armour) {
            this.armour = 0;
        }
        this.armour -= damage;
    }

    public void takeHealth(int damage) {
        if (damage > health) {
            this.health = 0;
        }
        this.health -= damage;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }
}
