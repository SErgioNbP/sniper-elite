package org.academiadecodigo.sniperelite;

/**
 * Created by codecadet on 04/10/2017.
 */
public class Game {


    private GameObject[] gameObjects;
    private SniperRiffle sniperRiffle;
    private int shotsFired;


    public Game() {

        this.gameObjects = new GameObject[10];

        sniperRiffle = new SniperRiffle(30);
    }


    public void Start() {

        createGameObjects();



    }


    private void createGameObjects() {

        int count;

        for (int i = 0; i < gameObjects.length; i++) {

            count = (int) (Math.random() * 41);

            // 25 % SoldierEnemy
            if (count < 10) {
                gameObjects[i] = new SoldierEnemy(100);

                // 25 % ArmouredEnemy
            } else if (count >= 10 && count < 20) {
                gameObjects[i] = new ArmouredEnemy(100);

                // 15 % Tree
            } else if (count >= 20 && count < 25) {
                gameObjects[i] = new Tree();

                // 35 % Barrels
            } else {
                gameObjects[i] = new Barrel();
            }


            System.out.println(gameObjects[i].getMessage());
        }
    }


    // TODO: 05/10/2017 createObjectsWithObjectsFactory()


    private void shoot(Destroyable destroyable) {

        for (int i = 0; i < gameObjects.length; i++) {

            if (gameObjects[i] == destroyable) {

                shotsFired++;

                System.out.println(" \n Shots fired: " + shotsFired);

                sniperRiffle.shoot(destroyable);
            }
        }

    }
}
