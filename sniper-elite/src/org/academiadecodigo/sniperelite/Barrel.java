package org.academiadecodigo.sniperelite;

/**
 * Created by codecadet on 05/10/2017.
 */
public class Barrel extends GameObject implements Destroyable {

    private BarrelType barrelType;

    private int currentDamage;

    private boolean destroyed;


    @Override
    public void hit(int damage) {

    }

    @Override
    public String getMessage() {
        return null;
    }

    @Override
    public boolean isDestroyable() {
        return false;
    }
}
