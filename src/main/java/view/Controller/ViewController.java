package view.Controller;

import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import view.AppView;

public class ViewController {

    private final double alertAnimDuration = 3;

    private Pane pane;

    public double getAlertAnimDuration() {
        return alertAnimDuration;
    }

    public Pane getPane() {
        return pane;
    }

    public void setPane(Pane pane) {
        this.pane = pane;
    }

    public void changeMenuTo(String menuName) {
        PauseTransition delay = new PauseTransition(Duration.seconds(alertAnimDuration + 1));
        delay.setOnFinished(event -> {
            AppView.setRootForMenu(menuName);
        });
        delay.play();
    }

    public void exitProgram() {
        PauseTransition delay = new PauseTransition(Duration.seconds(alertAnimDuration + 1));
        delay.setOnFinished(actionEvent -> {
            System.exit(0);
        });
        delay.play();
    }

    public void throwAlert(String title, String message) {

        Rectangle alertBox = new Rectangle(600, 200);
        alertBox.getStyleClass().add("alert-box");
        alertBox.setOpacity(0.1);

        Label alertTitle = new Label(title);
        alertTitle.getStyleClass().add("alert-title");

        Label alertMessage = new Label(message);
        alertMessage.getStyleClass().add("alert-message");

        VBox vbox = new VBox(10, alertTitle, alertMessage);
        vbox.setAlignment(Pos.CENTER);

        pane.getChildren().addAll(alertBox, vbox);

        alertBox.layoutXProperty().bind(pane.widthProperty().subtract(alertBox.widthProperty()).divide(2));
        alertBox.layoutYProperty().bind(pane.heightProperty().subtract(alertBox.heightProperty()).divide(2));

        vbox.layoutXProperty().bind(pane.widthProperty().subtract(vbox.widthProperty()).divide(2));
        vbox.layoutYProperty().bind(pane.heightProperty().subtract(vbox.heightProperty()).divide(2));

        FadeTransition fadeInVBox = new FadeTransition(Duration.millis(500), vbox);
        fadeInVBox.setFromValue(0.0);
        fadeInVBox.setToValue(1.0);

        FadeTransition fadeInAlertBox = new FadeTransition(Duration.millis(500), alertBox);
        fadeInAlertBox.setFromValue(0.0);
        fadeInAlertBox.setToValue(1.0);

        FadeTransition fadeOutVBox = new FadeTransition(Duration.millis(500), vbox);
        fadeOutVBox.setFromValue(1.0);
        fadeOutVBox.setToValue(0.0);

        FadeTransition fadeOutAlertBox = new FadeTransition(Duration.millis(500), alertBox);
        fadeOutAlertBox.setFromValue(1.0);
        fadeOutAlertBox.setToValue(0.0);

        PauseTransition delay = new PauseTransition(Duration.seconds(3));
        delay.setOnFinished(event -> {
            fadeOutVBox.play();
            fadeOutAlertBox.play();
            fadeOutVBox.setOnFinished(e -> pane.getChildren().removeAll(alertBox, vbox));
        });

        fadeInVBox.play();
        fadeInAlertBox.play();
        delay.play();
    }

}
