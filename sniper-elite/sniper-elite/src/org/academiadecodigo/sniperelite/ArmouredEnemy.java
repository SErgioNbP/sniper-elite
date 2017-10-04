package org.academiadecodigo.sniperelite;

/**
 * Created by codecadet on 04/10/2017.
 */
public class ArmouredEnemy extends Enemy {

    public ArmouredEnemy(int health, int armour) {

        super(100,50,"ArmouredEnemy");
    }

    @Override
    public void hit() {

        int damage = (int) (Math.random() * 15 + 50);

        if (super.getArmour() > 0){
            super.takeArmour(damage);
        } else {
            super.takeHealth(damage);
        }
        //tira ao armour e não continua para a vida o restante do dano

        if (super.getHealth() == 0){
            super.setDead(true);
        }
    }
    // se armour tiver pontos leva o dano antes da vida
}
