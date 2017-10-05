package org.academiadecodigo.sniperelite;

/**
 * Created by codecadet on 04/10/2017.
 */
public class Game {


    private GameObject[] gameObjects;
    private SniperRiffle sniperRiffle;
    private int shotsFired;


    public Game(int enemies) {

        this.gameObjects = new GameObject[5];

        sniperRiffle = new SniperRiffle(50);
    }


    public void Start() {

        createObjects();

        shoot();
    }


    private void createObjects() {

        int count;

        for (int i = 0; i < gameObjects.length; i++) {

            count = (int) (Math.random() * 11);

                // 40 % SoldierEnemy
            if (count > 5) {
                gameObjects[i] = new SoldierEnemy(100);

                // 40 % ArmouredEnemy
            } else if (count < 4) {
                gameObjects[i] = new ArmouredEnemy(100);

                // 20 % Tree
            } else {
                gameObjects[i] = new Tree();
            }

            System.out.println(gameObjects[i].getMessage());
        }
    }


    // TODO: 05/10/2017 createObjectsWithObjectsFactory()


    private void shoot() {

        for (int i = 0; i < gameObjects.length; i++) {

            if (!(gameObjects[i] instanceof Tree)) {

                Enemy enemy = (Enemy) gameObjects[i];

                shotsFired = 0;

                while (!enemy.isDead()) {

                    shotsFired++;

                    System.out.println(" \n Shots fired: " + shotsFired);

                    sniperRiffle.shoot(enemy);
                }
            }

        }
    }

}