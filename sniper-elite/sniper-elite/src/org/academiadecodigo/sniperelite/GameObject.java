package org.academiadecodigo.sniperelite;

/**
 * Created by codecadet on 04/10/2017.
 */
abstract public class GameObject {

    private String type;

    public GameObject(String type){
        this.type = type;
    }

    abstract public String getMessage();

    public String getType() {
        return type;
    }
}
