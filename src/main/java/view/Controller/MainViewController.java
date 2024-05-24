package view.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController extends ViewController implements Initializable {

    @FXML
    Button startGameButton;

    @FXML

    Button profileButton;
    @FXML
    Button ldBoardButton;

    @FXML
    Button cheatsButton;

    @FXML
    Button logoutButton;

    @FXML
    Button exitButton;

    @FXML
    Pane pane;

    @FXML
    public void startGameAction() {

    }

    @FXML
    public void profileAction() {

    }

    @FXML
    public void ldBoardAction() {

    }

    @FXML
    public void cheatsAction() {

    }

    @FXML
    public void logoutAction() {

    }

    @FXML
    public void exitAction() {
        throwAlert("Exiting The Game", "So long then!");
        exitProgram();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        super.setPane(pane);
    }
}
