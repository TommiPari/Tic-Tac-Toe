package it.parigi.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import it.parigi.App;
import it.parigi.model.Game;
import it.parigi.view.ViewUtils;

public class GameView implements Initializable {
    @FXML
    private GridPane grid;
    @FXML
    private Label text;

    @FXML
    private void returnToHome() throws IOException {
        Game.restartGame();
        App.setRoot("home");
    }

    @FXML 
    private void turn(ActionEvent e) {
        ViewUtils.turn(grid,text,e);
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        ViewUtils.setTextTurn(text);
    }
}