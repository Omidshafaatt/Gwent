package view.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class GameViewController extends ViewController implements Initializable {

    @FXML
    private HBox opponentHand;

    @FXML
    private HBox playerHand;

    @FXML
    private Pane battlefield;

    @FXML
    private Label opponentScore;

    @FXML
    private Label playerScore;

    @FXML
    Pane pane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        super.setPane(this.pane);
        // Example cards for opponent's hand
        for (int i = 0; i < 5; i++) {
            Rectangle card = new Rectangle(50, 80, Color.BLUE);
            opponentHand.getChildren().add(card);
        }

        // Example cards for player's hand
        for (int i = 0; i < 5; i++) {
            Rectangle card = new Rectangle(50, 80, Color.RED);
            playerHand.getChildren().add(card);
        }

        // Example battlefield setup
        Rectangle exampleBattlefieldCard = new Rectangle(50, 80, Color.YELLOW);
        exampleBattlefieldCard.setLayoutX(200);
        exampleBattlefieldCard.setLayoutY(150);
        battlefield.getChildren().add(exampleBattlefieldCard);
    }
}
