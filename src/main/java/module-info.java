module javafxgradle.app {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens javafxgradle.app to javafx.fxml;
    exports javafxgradle.app;
}