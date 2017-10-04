package org.academiadecodigo.sniperelite;

/**
 * Created by codecadet on 04/10/2017.
 */
public class Game {


    private GameObject[] gameObjects;

    private SniperRiffle sniperRiffle;

    private int shotsFired;


    public Game(GameObject[] gameObjects) {

        this.gameObjects = new GameObject[5];
    }


    public void Start() {


    }

    public GameObject[] createObjects() {

        for (int i = 0; i < gameObjects.length; i++) {

            if (Math.random() * 10 > 5) {
                gameObjects[i] = new SoldierEnemy(100);

            } else if (Math.random() * 10 < 3) {
                gameObjects[i] = new ArmouredEnemy(100);

            } else {
                gameObjects[i] = new Tree();
            }
        }



    }


}


/*

        for (int i = 0; i < gameObjects.length; i++) {

            gameObjects[i].gameObjects;

            if (Math.random() * 10 > 5) {
                return SoldierEnemy();

            } else if (Math.random() * 10 < 3) {
                return new ArmouredEnemy();

            } else {
                return new Tree();
            }
        }
 */