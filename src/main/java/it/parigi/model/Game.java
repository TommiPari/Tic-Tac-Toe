package it.parigi.model;

public class Game {
    public static Character[][] field = new Character[3][3];
    private static Player p1;
    private static Player p2;
    private static boolean isP1Turn = true;
    public static boolean lightMode = true;

    public static boolean isLightMode() {
        return lightMode;
    }

    public static void setP1(Player p1) {
        Game.p1 = p1;
    }

    public static void setP2(Player p2) {
        Game.p2 = p2;
    }

    public static Player getPlayerTurn() {
        if (isP1Turn) {
            return p1;
        } else {
            return p2;
        }
    }

    public static Integer turn(Player p, Integer x, Integer y) {
        if (Game.isPlaceable(x, y)) {
            Game.setMove(p, x, y);
            Game.changeTurn();
            return 1;
        } else {
            return -1;
        }
    }

    public static boolean isPlaceable(Integer x, Integer y) {
        return field[x][y] == null;
    }

    public static void setMove(Player p, Integer x, Integer y) {
        field[x][y] = p.getSign();
    }

    public static void changeTurn() {
        isP1Turn = !isP1Turn;
    }

    public static void restartGame() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = null;
            }
        }
    }
}
