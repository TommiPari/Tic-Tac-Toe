package it.parigi.controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import it.parigi.App;
import it.parigi.model.Game;
import it.parigi.model.Player;

public class Homepage {
    @FXML
    private TextField p1;
    @FXML
    private TextField p2;

    @FXML
    private void lightMode() {
        Game.lightMode = false;
    }

    @FXML
    private void darkMode() {
        Game.lightMode = true;
    }

    @FXML
    private void play(ActionEvent e) throws IOException {
        Game.setP1(new Player(p1.getText(), 'X'));
        Game.setP2(new Player(p2.getText(), 'O'));
        App.setRoot("gameview");
    }
}
