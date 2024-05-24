package view;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;


public class AppView extends Application {

    private static Stage currentStage;

    private static Scene currentScene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        this.currentStage = stage;
        Image icon = new Image(getClass().getResourceAsStream("/Pics/Icon/Icon.jpeg"));
        stage.getIcons().add(icon);
        stage.setTitle("Gwent");

        Parent root = FXMLLoader.load(getClass().getResource("/FXML/Login.fxml"));
        stage.setScene(new Scene(root, 1920, 1080));
        currentScene = stage.getScene();
        stage.centerOnScreen();
        stage.show();
    }

    private static void changeSceneRoot(Parent root) {
        currentStage.setScene(new Scene(root, 1920, 1080));
        currentScene = currentStage.getScene();
    }

    public static void setRootForMenu(String menuName) {
        Parent root;
        String address = "";
        switch (menuName) {
            case "Login":
                address = "/FXML/Login.fxml";
                break;
            case "Register":
                address = "/FXML/Register.fxml";
                break;
            case "Main":
                address = "/FXML/Main.fxml";
                break;
            case "Profile":
                address = "/FXML/Register.fxml";
                break;
            case "Game":
                address = "/FXML/Game.fxml";
                break;
        }
        try {
            root = FXMLLoader.load(AppView.class.getResource(address));
            changeSceneRoot(root);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
