package view.Controller;

import Model.Result;
import controller.LoginController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import view.AppView;
import Enum.Menu;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginViewController extends ViewController implements Initializable {

    @FXML
    TextField usernameField;

    @FXML
    PasswordField passwordField;

    @FXML
    Button loginButton;

    @FXML
    Button forgotPassword;

    @FXML
    Button registerButton;

    @FXML
    Pane pane;

    @FXML
    public void loginAction() {

        String username = usernameField.getText();
        String password = passwordField.getText();

        LoginController loginController = new LoginController();
        Result result = loginController.login(username, password);

        if (!result.isSuccessful()) {
            usernameField.clear();
            passwordField.clear();
            throwAlert(result.getTitle(), result.getMessage());
            return;
        }

        usernameField.clear();
        passwordField.clear();
        throwAlert(result.getTitle(), result.getMessage());

        changeMenuTo(Menu.Main.getValue());
    }

    @FXML
    public void questionAction() {

    }

    @FXML
    public void registerAction() {
        usernameField.clear();
        passwordField.clear();

        AppView.setRootForMenu(Menu.Register.getValue());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        super.setPane(this.pane);
    }
}
