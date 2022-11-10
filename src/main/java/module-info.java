module javafxgradle.javafxgradle {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens javafxgradle.javafxgradle to javafx.fxml;
    exports javafxgradle.javafxgradle;
}