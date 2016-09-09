package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * Test to github
 *
 *
 * test 2
 *
 */
public class Controller {


    @FXML
    Label helloWorldLabel;


    @FXML
    void handleButton() {
        helloWorldLabel.setText("Hallo DU");
    }




}
