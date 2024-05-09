package it.parigi.model;

public class Player {
    private String name;
    private Character sign;

    public Player(String name, Character sign) {
        this.name = name;
        this.sign = sign;
    }

    public String getName() {
        if (name == null || name == "") {
            return "Player";
        } else {
            return name;
        }
    }

    public Character getSign() {
        return sign;
    }
}
