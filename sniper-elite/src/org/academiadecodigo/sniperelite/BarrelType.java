package org.academiadecodigo.sniperelite;

/**
 * Created by codecadet on 05/10/2017.
 */
public enum BarrelType {

    PLASTIC(30),
    WOOD(50),
    METAL(100);


    private int maxDamage;

    BarrelType(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }
}
