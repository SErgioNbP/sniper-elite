package org.academiadecodigo.sniperelite;

/**
 * Created by codecadet on 04/10/2017.
 */
public class SniperRiffle {


    private int bulletDamage;


    public SniperRiffle(int bulletDamage){

        this.bulletDamage = bulletDamage;
    }

    public void shoot(Enemy enemy){

       enemy.hit();
    }
}
