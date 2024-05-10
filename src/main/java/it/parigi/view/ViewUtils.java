package it.parigi.view;

import it.parigi.model.Game;
import it.parigi.model.Player;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class ViewUtils {
    public static void turn(GridPane grid, Label text, ActionEvent e) {
        Button b = (Button) e.getSource();
        Player p = Game.getPlayerTurn();
        Integer x = GridPane.getRowIndex(b);
        Integer y = GridPane.getColumnIndex(b);
        switch (Game.turn(p, x, y)) {
            case 1:
                b.setText(String.valueOf(p.getSign()));
                ViewUtils.setTextGame(text);
                break;
            case 2:
                /* Da continuare */
                ViewUtils.setTextGame(text, ": congratulazioni, HAI VINTO!");
                break;
            case -1:
                ViewUtils.setTextGame(text, ": mossa non valida! Riprova");
                break;
        }
    }

    public static void setTextGame(Label text, String s) {
        text.setText(Game.getPlayerTurn().getName() + s);
    }

    public static void setTextGame(Label text) {
        text.setText(Game.getPlayerTurn().getName() + ": è il tuo turno!");
    }
}
