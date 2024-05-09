module it.parigi {
    requires javafx.controls;
    requires javafx.fxml;

    opens it.parigi to javafx.fxml;
    exports it.parigi;

    opens it.parigi.controller to javafx.fxml;
    exports it.parigi.controller;
}
