//this is required for FXML and is how dependencies may be included
//require the JavaFX modules our application needs in this file
module javafxgradle.app {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens javafxgradle.app to javafx.fxml;
    exports javafxgradle.app;
}