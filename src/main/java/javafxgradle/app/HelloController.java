package javafxgradle.app;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Objects;

public class HelloController {
    //JavaFX works in Application/Controller class pairs
    // (for every App class there is a Controller class)
    @FXML
    private Label welcomeText;

    @FXML //Attribute allows FXML to see and use variables/methods
    protected void onChangeButtonClick() {
        if (Objects.equals(welcomeText.getText(), "Bueno!")) {
            welcomeText.setText("Halo!");
        } else if (Objects.equals(welcomeText.getText(), "Hi!")) {
            welcomeText.setText("Bueno!");
        } else {welcomeText.setText("Hello!");}
    }
}