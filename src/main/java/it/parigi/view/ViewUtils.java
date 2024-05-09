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
        if (Game.turn(p, x, y) == 1) {
            b.setText(String.valueOf(p.getSign()));
            ViewUtils.setTextTurn(text);
        } else {
            text.setText(p.getName() + ": mossa non valida! Riprova");
        }
    }

    public static void setTextTurn(Label text) {
        text.setText(Game.getPlayerTurn().getName() + ": è il tuo turno!");
    }
}
