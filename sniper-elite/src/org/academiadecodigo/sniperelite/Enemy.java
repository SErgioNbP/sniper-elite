package org.academiadecodigo.sniperelite;

/**
 * Created by codecadet on 04/10/2017.
 */
abstract public class Enemy extends GameObject {


    private int health;

    private boolean isDead;


    public Enemy(int health) {

        this.health = health;
    }

    public boolean isDead() {

        return false;
    }

    abstract public void hit(int damage);


    public String getMessage() {

        return "";
    }

}
