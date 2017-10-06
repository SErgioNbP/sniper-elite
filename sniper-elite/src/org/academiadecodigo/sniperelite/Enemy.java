package org.academiadecodigo.sniperelite;

/**
 * Created by codecadet on 04/10/2017.
 */
abstract public class Enemy extends GameObject implements Destroyable {


    private int health;
    private boolean dead;


    public Enemy(int health) {

        this.health = health;
    }

    abstract public void hit(int bulletDamage);


    public boolean isDead() {
        return dead;
    }

    public boolean isDestroyable (){
        return true;
    }


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


    public void setDead() {
        dead = true;
    }
}
