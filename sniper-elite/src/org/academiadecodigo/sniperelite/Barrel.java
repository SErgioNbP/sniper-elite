package org.academiadecodigo.sniperelite;

/**
 * Created by codecadet on 05/10/2017.
 */
public class Barrel extends GameObject implements Destroyable {

    private BarrelType barrelType;

    private int currentDamage;

    private boolean destroyed;


    public Barrel() {

        barrelType = BarrelType.values()[(int) Math.floor(Math.random() * BarrelType.values().length)];

    }


    @Override
    public void hit(int bulletDamage) {

        System.out.println("damage: " + bulletDamage);

        while (barrelType.getMaxDamage() > 0) {

            currentDamage = bulletDamage;
        }

        if (barrelType.getMaxDamage() <= 0) {
            destroyed = true;

            System.out.println("You destroyed the barrel!");
        }
    }


    @Override
    public String getMessage() {

        return "I'm a " + barrelType.toString() + " barrel!";

    }

    @Override
    public boolean isDestroyable() {
        return true;
    }
}
