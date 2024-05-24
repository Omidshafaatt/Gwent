package view.Controller;

import Model.User.User;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import Enum.Menu;

import java.net.URL;
import java.util.ResourceBundle;

public class RegisterViewController extends ViewController implements Initializable {

    private final double alertAnimDuration = 3;

    @FXML
    Label createAccount;

    @FXML
    TextField usernameField;

    @FXML
    PasswordField passwordField;

    @FXML
    TextField nickNameField;

    @FXML
    TextField emailField;

    @FXML
    Button registerButton;

    @FXML
    Pane pane;

    @FXML
    public void registerAction() {

        String username = usernameField.getText();
        String password = passwordField.getText();

        User user = new User("23", "23", "geralt", "email");
        User.setLoggedInUser(user);

        throwAlert("Registered Successfully!", "Dear \"" + user.getNickname() + "\" welcome to the Gwent World!");

        changeMenuTo(Menu.Login.getValue());  // later set it to main menu, cause this way is silly

        // TODO
        // javadi register control o password questions ro be sabke loginControl va loginMenuControl ok kon
        // agar az in sabk khoshet nayoomad, geraphicesh tamaize ino to grooh matrah kon baad taghir bede.
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        super.setPane(this.pane);
    }
}
