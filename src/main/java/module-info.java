module javafx.based.modelingjavafxbase {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens javafx.based to javafx.fxml;
    exports javafx.based;
    exports javafx.based.controller;
    opens javafx.based.controller to javafx.fxml;
}