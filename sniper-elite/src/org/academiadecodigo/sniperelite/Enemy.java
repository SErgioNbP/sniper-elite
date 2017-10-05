package org.academiadecodigo.sniperelite;

/**
 * Created by codecadet on 04/10/2017.
 */
abstract public class Enemy extends GameObject implements Destroyable {


    private int health;
    private boolean isDead;


    public Enemy(int health) {

        this.health = health;
    }

    abstract public void hit(int bulletDamage);

    abstract public boolean isDestroyable ();


    public String getMessage() {

        return "DANGER, DANGER!!";
    }


    public int getHealth() {
        return health;
    }

    public void takeHealth(int damage) {

        this.health -= damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    public boolean isDead() {
        return isDead;
    }

    public void setDead() {
        isDead = true;
    }
}
