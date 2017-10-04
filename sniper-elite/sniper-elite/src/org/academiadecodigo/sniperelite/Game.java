package org.academiadecodigo.sniperelite;

/**
 * Created by codecadet on 04/10/2017.
 */
public class Game {


    private GameObject[] gameObjects;
    private SniperRiffle sniperRiffle;
    private int shotsFired;


    public Game(int size) {

        this.gameObjects = new GameObject[5];
    }


    public void Start() {

        createObjects();

        shoot();
    }


    private void createObjects() {

        int count;

        for (int i = 0; i < gameObjects.length; i++) {

            count = (int) Math.floor(Math.random() * 10);

            if (count > 5) {
                gameObjects[i] = new SoldierEnemy(100, 0);

            } else if (count < 3) {
                gameObjects[i] = new ArmouredEnemy(100, 50);

            } else {
                gameObjects[i] = new Tree();
            }
        }
    }

    private void shoot() {

        for (int i = 0; i < gameObjects.length; i++) {

            shotsFired += 1;

            if (gameObjects[i].getType() != "Tree") {

                sniperRiffle.shoot((Enemy) gameObjects[i]);
            }

        }
    }

}